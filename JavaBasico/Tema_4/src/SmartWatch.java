public class SmartWatch extends SmartDevice{
    String correa;
    String conectividad;

    public SmartWatch(String marca, String modelo, String sistema, Double pantalla, Double peso, String color, String correa, String conectividad) {
        super(marca, modelo, sistema, pantalla, peso, color);
        this.correa = correa;
        this.conectividad = conectividad;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "correa='" + correa + '\'' +
                ", conectividad='" + conectividad + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistema='" + sistema + '\'' +
                ", pantalla=" + pantalla +
                ", peso=" + peso +
                ", Color='" + color + '\'' +
                '}';
    }
}
