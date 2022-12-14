public class Main {
    public static void main(String[] args) {
        persona persona = new persona();
        persona.setEdad(24);
        persona.setTelefono(1122334455);
        persona.setNombre("Brian");

        System.out.println("La edad es: " + persona.getEdad());
        System.out.println("Su numero de telefono es: " + persona.getTelefono());
        System.out.println("Su nombre es: " + persona.getNombre());
    }
}
class persona{
    private int edad, telefono;
    private String nombre;
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}