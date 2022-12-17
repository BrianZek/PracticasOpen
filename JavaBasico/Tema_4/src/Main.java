public class Main {
    public static void main(String[] args) {

        SmartPhone telefono = new SmartPhone("Samsung", "Galaxy S10", "Android", 4.5d,
                250.0d, "Blanco", 50.0, "5G", "Telcel");
        SmartDevice reloj = new SmartWatch("Apple","Gtx", "iOS", 1d, 100d,
                "Negro", "Sí", "Bluetooth");

        System.out.println(telefono.toString());
        System.out.println(reloj.toString());
    }
}