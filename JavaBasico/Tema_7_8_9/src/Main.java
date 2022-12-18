import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //reverse("Hola Mundo");
        //unidimensional();
        //bidimensional();
        //vector();

        /* El problema es que en un Vector definido si queremos agregar
         * más datos, este se copiara y se duplicara hasta llegar al valor
         * requerido, esto implica un gasto enorme a nivel computacional.
         */

        //arraylist();
        //arrayInt();

        /* try {
         *   dividePorCero();
         *  System.out.println("Demo de codigo");
         * } catch (ArithmeticException e){
         *    System.out.println("Esto no puede hacerse");
         * }
         */

        //copiar("src/entrada.txt", "src/salida.txt");
        
        propio("src/propioIn.txt", "src/propioOut.txt");

    }

    //Imprimir String al reves
    public static void reverse (String texto) {
        for (int i = texto.length(); i > 0; i--) {
            char c = texto.charAt(i-1);
            System.out.print(c);
        }
    }
    //Arreglo Unidimensional
    public static void unidimensional (){
        String[] strings = new String[]{"Brian", "Salvador", "Javier", "Calderon"};
        for (String i : strings){
            System.out.println(i);
        }
    }
    //Arreglo bidimensional
    public static void bidimensional() {
        int[][] ints = new int[][]{
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[2].length; j++) {
                System.out.println("Fila: " + (i + 1) + " Columna: "
                        + (j + 1) + " Valor: " + ints[i][j]);
            }
        }
    }
    //Vector, añadir y eliminar
    public static void vector(){
        Vector<String> colores = new Vector<>(5);
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Amarillo");
        colores.add("Verde");
        colores.add("Negro");

        colores.remove(1);
        colores.remove(2);
        for (String color : colores) {
            System.out.println(color);
        }

    }
    //ArrayList a LinkedList
    public static void arraylist(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Brian");
        lista.add("Salvador");
        lista.add("Javier");
        lista.add("Calderón");

        LinkedList<String> lista2 = new LinkedList<>(lista);
        for (int i =0; i< lista.size(); i++){
            System.out.println("Arraylist: " + lista.get(i));
            System.out.println("LinkedList: " + lista2.get(i));
        }
    }
    //ArrayList de ints, imprimir valor y posicion
    public static void arrayInt(){
        ArrayList<Integer> listaInt = new ArrayList<>();
        int temp =0;
        for (int i = 0; i<10; i++){
            if (i%2 != 0){
                listaInt.add(i);
                System.out.println(listaInt.get(temp));
                temp++;
            }
        }
    }
    //Uso de Throw para excepcion aritmetica
    public static void dividePorCero() throws ArithmeticException{
        System.out.println(5/0);
    }
    //Copiar datos de un archivo y pegarlos en uno nuevo
    public static void copiar(String fileIn, String fileOut){
        byte[] array = new byte [10];
        try{
            InputStream input = new FileInputStream(fileIn);
            input.read(array);
            String data = new String(array);
            input.close();
            PrintStream copy = new PrintStream(fileOut);
            copy.println(data);
        }catch(Exception e){
            System.out.println("Error en archivo");
        }
    }
    //Programa propio con InputStream, PrintStream, exception, HashMap y ArrayList
    public static void propio(String entrada, String salida){
        try {
            //Lectura del archivo
            BufferedReader archivoIn = new BufferedReader(new FileReader(entrada));

            //Copia contenido a una ArrayList
            List<String> lines = new ArrayList<String>();
            String line;
            while ((line = archivoIn.readLine())!= null){
                lines.add(line);
            }
            archivoIn.close();

            //Creacion de HashMap y rellena con el ArraList
            HashMap<Integer, String> hash = new HashMap();
            for(int i =0; i<lines.size(); i++){
                hash.put(i+1,lines.get(i));
            }

            //Hash a archivo final de txt
            PrintStream copy = new PrintStream(salida);
            for (int i =0; i< hash.size(); i++){
                copy.println("Fila: " + (i+1) + " Valor: " + hash.get(i+1));
            }

        } catch (Exception e) {

        }
    }
}