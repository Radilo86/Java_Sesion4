/* Ejercicio tema 4
    En este ejercicio tendréis que crear una clase SmartDevice.
    Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
    Agregaréis atributos tal cual tendrían esos objetos en la realidad.
    Crear constructor vacío y con todos los parámetros para cada clase.
    Desde una clase Main: crearéis objetos de cada una y los utilizaréis
    para imprimir sus valores por consola.
 */

public class Principal {
    public static void main(String[] args) {
        // Creamos el objeto phone y le damos valores.
        SmartPhone phone = new SmartPhone("curva",true,850,"Vodistar");
        // Creamos el objeto watch y le damos valroes.
        SmartWatch watch = new SmartWatch("plana",false,250,"mediana",true);
        // Mostramos el objeto phone y watch por pantalla
        System.out.println(phone.toString()+"\n"+watch.toString());
    }
}
