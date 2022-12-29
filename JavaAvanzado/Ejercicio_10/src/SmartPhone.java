public class SmartPhone extends SmartDevice{

    Double camaraMpx;
    String red;
    String operador;
    public void setCamaraMpx(Double camaraMpx) {
        this.camaraMpx = camaraMpx;
    }
    public void setRed(String red) {
        this.red = red;
    }
    public void setOperador(String operador) {
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
                ", color='" + color + '\'' +
                '}';
    }
}
