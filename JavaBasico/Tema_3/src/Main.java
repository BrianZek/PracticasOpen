public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Brian", "Salvador", "Javier", "Calderon"};

        // con bucle for y append

        StringBuffer sb = new StringBuffer();
        for(int i = 0; nombres.length > i; i++){
            sb.append(nombres[i]);
            sb.append(" ");
        }
        String nombre = sb.toString();
        System.out.println("Resultado con bucle: " + nombre);

        //Correcion del espacio final

        sb.setLength(0);
        nombre = "";
        for(int i = 0; nombres.length > i; i++){
            if (i < (nombres.length - 1)) {
                sb.append(nombres[i]);
                sb.append(" ");
            }
            else {
                sb.append(nombres[i]);
            }
        }
        nombre = sb.toString();
        System.out.println("Resultado con bucle corregido: " + nombre);

        //Sin bucle y con join

        String resultado = String.join (" ", nombres);
        System.out.println("Resultado sin bucle: " + resultado);
    }
}