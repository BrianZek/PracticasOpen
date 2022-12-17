public class Main {
    public static void main(String[] args) {
        double precio = 200.0;
        double precioFinal;
        precioFinal = precioMasIVA(precio);
        System.out.println("El precio sin IVA es de: " + precio);
        System.out.println("El precio con IVA es de: " + precioFinal);

    }
    static public double precioMasIVA(double precio){
        double iva = 0.16;
        double precioIVA = precio + (precio * iva);
        return precioIVA;
    }

}