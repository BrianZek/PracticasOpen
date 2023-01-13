public class Conductor {
    Coche vehiculo;
    public Conductor(Coche vehiculo){
        this.vehiculo = vehiculo;
    }
    public String acelera(){
        return vehiculo.acelerar();
    }

}
