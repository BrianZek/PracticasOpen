import java.util.ArrayList;

public class Nombres {
    private ArrayList<Nombre> nombres = new ArrayList<Nombre>();
    private int posicion = 0;
    public void crear(Nombre nombre) {
        nombres.add(nombre);
    }
    public Nombre siguiente() {
        Nombre nombre = nombres.get(posicion);
        posicion++;
        return nombre;
    }
    public boolean hayMas(){
        return posicion < nombres.size();
    }
    public void reiniciar(){
        posicion = 0;
    }
}
