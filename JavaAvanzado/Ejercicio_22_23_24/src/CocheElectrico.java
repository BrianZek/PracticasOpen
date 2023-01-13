public class CocheElectrico extends Coche{
    String motor = "Electrico";

    @Override
    public String acelerar() {
        return "Acelero con " + motor;
    }
}
