public class SmartWatch extends SmartDevice{
    String correa;
    String conectividad;

    public SmartWatch setCorrea(String correa) {
        this.correa = correa;
        return this;
    }

    public SmartWatch setConectividad(String conectividad) {
        this.conectividad = conectividad;
        return this;
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
                ", color='" + color + '\'' +
                '}';
    }
}
