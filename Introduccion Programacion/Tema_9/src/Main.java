public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Brian");
        cliente.setEdad(24);
        cliente.setTelefono(1122334455);
        cliente.setCredito(20000);

        System.out.println("El nombre del cliente es: " + cliente.getNombre());
        System.out.println("La edad del cliente es: " + cliente.getEdad());
        System.out.println("El telefono del cliente es: " + cliente.getTelefono());
        System.out.println("El cliente tiene un credito de: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Salvador");
        trabajador.setEdad(22);
        trabajador.setTelefono(1211223344);
        trabajador.setSalario(10000);

        System.out.println("El nombre del trabajador es: " + trabajador.getNombre());
        System.out.println("La edad del trabajador es: " + trabajador.getEdad());
        System.out.println("El telefono del trabajador es: " + trabajador.getTelefono());
        System.out.println("El trabajador tiene un salario de: " + trabajador.getSalario());

    }
}
class Persona{
    private String nombre;
    private int edad;
    private int telefono;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
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
}
class Cliente extends Persona{
    private int credito;
    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona {
    private int salario;
    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }
}