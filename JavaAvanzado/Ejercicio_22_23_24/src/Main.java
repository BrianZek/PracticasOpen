public class Main {
    public static void main(String[] args) {
        Coche coche = new CocheElectrico();
        Conductor conductor = new Conductor(coche);
        System.out.println(conductor.acelera());
    }
}