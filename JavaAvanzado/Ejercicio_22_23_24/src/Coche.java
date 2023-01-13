public abstract class Coche {
    String marca;
    String modelo;
    int año;
    String color;
    String motor = "";

    public String acelerar(){
        return "Acelero con" + motor;
    }

}
