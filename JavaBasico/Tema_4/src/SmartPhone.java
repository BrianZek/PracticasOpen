public class SmartPhone extends SmartDevice{


    Double camaraMpx;
    String red;
    String operador;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String sistema, Double pantalla, Double peso, String color, Double camaraMpx, String red, String operador) {
        super(marca, modelo, sistema, pantalla, peso, color);
        this.camaraMpx = camaraMpx;
        this.red = red;
        this.operador = operador;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camaraMpx=" + camaraMpx +
                ", red='" + red + '\'' +
                ", operador='" + operador + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistema='" + sistema + '\'' +
                ", pantalla=" + pantalla +
                ", peso=" + peso +
                ", Color='" + color + '\'' +
                '}';
    }
}
