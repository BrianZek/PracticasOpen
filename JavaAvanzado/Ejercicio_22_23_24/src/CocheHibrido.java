public class CocheHibrido extends Coche{
    String motor = "Hibrido";

    @Override
    public String acelerar() {
        return "Acelero con " + motor;
    }
}
