public class Main {
    public static void main(String[] args) {
        int resultado = suma3(2,3,2);
        System.out.println("La suma es: " + resultado);

        coche miCoche = new coche();
        miCoche.incPuerta();
        System.out.println("El numero de puertas que tiene mi coche es: " + miCoche.noPuertas);
    }
    public static int suma3 (int a, int b, int c){
        return a + b + c;
    }
    static class coche{
        int noPuertas = 2;
        public void incPuerta(){
            noPuertas++;
        }
    }
}
