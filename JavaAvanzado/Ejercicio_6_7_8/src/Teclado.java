public class Teclado {
    public String marca;
    private static Teclado teclado;
    private Teclado(){

    }
    private Teclado(String marca){
            this.marca = marca;
    }
    public static Teclado getInstance(String marca){
        if(teclado == null){
            teclado = new Teclado(marca);
            System.out.println("Primer instancia");
        }else {
            System.out.println("Ya existe un teclado");
        }
        return teclado;
    }
}
