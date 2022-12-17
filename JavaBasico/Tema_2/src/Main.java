import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int precio;
        double precioFinal;
        System.out.println("Introduzca el precio del articulo: ");
        precio = scanner.nextInt();
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