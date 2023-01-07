import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println(Division(10, 1));
        }catch(ArithmeticException e){
            System.out.println("Estas dividiendo entre 0");
        }
        try{
            Array();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Estas tratando de acceder a un dato fuera del limite del array");
        }
        try {
            FileInputStream archivo = new FileInputStream("src/prueba.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");;
        }

    }
    public static int Division(int divisor, int dividendo){
           return divisor/dividendo;
    }

    public static void Array(){
        int[] numeros = new int[]{1,2,3,4,5,6};
        for (int i = 0; i < 9; i++) {
            System.out.println(numeros[i]);
        }
    }


}