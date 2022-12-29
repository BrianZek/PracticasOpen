public class Main {
    public static void main(String[] args) {
        SmartPhone telefono = new SmartPhoneBuilder("Google")
                .setModelo("Pixel 6a")
                .setSistema("Android")
                .setPantalla(5.2)
                .setOperador("Telcel")
                .setRed("5G")
                .setCamaraMpx(12d)
                .setColor("Negro")
                .setPeso(230d)
                .build();
        SmartWatch reloj = new SmartWatchBuilder("Samsung")
                .setColor("Blanco")
                .setConectividad("Bluethooth")
                .setCorrea("Si")
                .setModelo("Watch")
                .setPantalla(2d)
                .setPeso(50d)
                .setSistema("Android")
                .build();
        System.out.println(telefono);
        System.out.println(reloj);
    }
}