public class CocheGasolina extends Coche{
    String motor = "Gas";
    @Override
    public String acelerar() {
        return " Acelero con " + motor;
    }
}
