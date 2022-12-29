public class Main {
    public static void main(String[] args) {
        Nombres nombres = new Nombres();
        nombres.crear(new Nombre("Brian"));
        nombres.crear(new Nombre("Salvador"));
        nombres.crear(new Nombre("Javier"));
        nombres.crear(new Nombre("Calderón"));
        while (nombres.hayMas()){
            Nombre nombre = nombres.siguiente();
            System.out.println(nombre.getNombre());
        }
    }
}