public class Main {
    public static void main(String[] args) {
        Teclado teclado = Teclado.getInstance("Razer");
        System.out.println(teclado.marca);
        Teclado teclado1 = Teclado.getInstance("Asus");
        System.out.println(teclado1.marca);
        System.out.println("Patrones creacionales:");
        System.out.println("Patrón Singleton: Se utiliza para obligar a una clase a tener una sola instancia, se usa para caches");
        System.out.println("Patrón Factory: Se utiliza para crear objetos sin especificar el tipo de objeto, esto se hace mediante un metodo factory, remplaza el constructor de un objeto, se implementa para tener un codigo mas flexible");
        System.out.println("Patrón Builder: Se utiliza para resolver el problema de constructores largos, esto lo hace implementando clases constructoras, se puede encontrar en el metodo append de los Strings");
        System.out.println("Patrón Prototype: Es un patrón de diseño creacional que nos permite copiar objetos existentes sin que el código dependa de sus clases, esto se hace mediante una interfaz, java tiene una clase especifica que se llama Cloneable ");
        System.out.println("Patrones estructurales");
        System.out.println("Patron Decorator: Permite añadir funcionalidades a objetos colocando estos objetos dentro de objetos encapsuladores especiales que contienen estas funcionalidades, se encuentra en las subclases de java.io.InputStream");
        System.out.println("Patron Adapter: Permite la colaboración entre objetos con interfaces incompatibles, se puede utilizar en casos donde quieras utilizar datos XML en un biblioteca que lee JSON");
        System.out.println("Patron Facade: Proporciona una interfaz simplificada a una biblioteca, un framework o cualquier otro grupo complejo de clases, se utiliza normalmente para implementar bibliotecas y API´s");
    }
}