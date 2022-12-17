abstract class SmartDevice {
    String marca;
    String modelo;
    String sistema;
    Double pantalla;
    Double peso;
    String color;
    public SmartDevice(){
    }

    public SmartDevice(String marca, String modelo, String sistema, Double pantalla, Double peso, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistema = sistema;
        this.pantalla = pantalla;
        this.peso = peso;
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistema='" + sistema + '\'' +
                ", pantalla=" + pantalla +
                ", peso=" + peso +
                ", Color='" + color + '\'' +
                '}';
    }
}
