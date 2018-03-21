# TPHilos
tp1 Hilos en Cervecería.

1-Cuantos consumidores se necesitan para que el stock llegue a 0?
rta. En el modelo realizado, con uno solo alcanza, porque el consumidor seguira consumiendo indefinidamente siempre que halla stock en la casa.

2-Bloques Synchronized, porque deben serlos?
rta. Los bloques sincronizados y los metodos sincronizados son dos formas distintas de utulizar sincronización en java e implementar la exclusión mutuo en secciones críticas de código.La diferencia entre métodos y bloques sincronizados está en el lugar en el que la sección critica está ubicada. El bloque sincronizado bloquea solo lo que se encuentra dentro del bloque, y cuanto menos bloqueemos mejor rendimiento vamos a objetener de nuestra clase, por eso siempre es mejor bloquear únicamente la sección crítica que haya en el código. En cambio el método sincronizado bloquea el objeto actual representado por su palabra reservado o bloquea a nivel de clase, si el método sincronizado ademas es estatico. Ademoas En el caso de los métodos sincronizados, el bloqueo conseguido por el hilo cuando entra en el método y cuando se libera al salir del método, o sale normalmente o lanzando una Exception. Por el otro lado, en el caso de los bloques sincronizados, el hilo bloquea cuando entra en el bloque propiamente dicho, y libera cuando deja el bloque.

3-Explicar el recurso compartido.
 rta. Es aquel sobre el cual intentan acceder los diferentes hilos a la vez, por ejemplo, en el caso del tp, el recurso compartido es el stock. va a haber varios hilos intentado aumentar o disminuir el stock a la misma vez y aquello podría acarrear problemas de lógica, por eso se utilizan los bloques sincronized, ya que bloqueando el acceso, este se realiza secuencialmente y evita errores en el programa.

4-Explica las 3 formas de instanciar un Thread.
rta.
FORMA 1: Implementando una interface Runnable. 
*Primero hay que que crear una clase que implemente dicha  interfaz. ej: class Producer implements Runnable {}
*En la clase definimos el metodo Run
*Lo que hacemos luego, al momento de utilizar la clase, es crear una instancia de Thread que tenga como paramentro un objeto de mi clase Producer y llamar desde la instancia de Thread al metodo Start que llamará a su vez a run de Producer. ej:
Runnable producer = new Producer('ipa', house);
new Thread(producer).start();

FORMA 2: Hacer que nuestra clase herede de Thread (como no existe herencia múltiple en Java esta forma no podría utilizarse si nuestra clase es una clase hija)
*Creamos una clase que extienda de Thread  ej: class Producer extends Thread {}
*En la clase definimos el metodo Run
*Al momento de usar la clase, llamamos al método Start que a su vez al igual que en el caso anterior, llamará al método run.
ej:
Producer producer = new Producer('ipa,house');
producer.start();

FORMA 3:Pasarle un Runnable al constructor de Thread creando una clase anonima
*Creamos una instancia de Thread
*Como parametro le pasamos una instancia de Runnable y el método run de esa instancia creado en ese mismo momento donde hacermos lo que hariamos en el método run del Producer. 
*luego llamamos al start() del Thread creado.

