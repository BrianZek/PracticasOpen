public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        String arquitecturaLimpia = "La arquitectura limpia es una forma de " +
                "escribir codigo de forma estructurada, \ncon en el fin de que el programa " +
                "sea facil de leer y sea mantenible, \nen esa arquitectura tenemos " +
                "los principios SOLID y la arquitectura en 4 etapas, \nEntidades, " +
                "Casos de uso, Interfaces y Frameworks." +
                "" +
                "\nEntre las caracteristicas más importantes tenemos la independencia de " +
                "los frameworks, \nque el programa sea testable, independencia de la UI " +
                "independencia de la base de datos \ny que sea independiente a cualquier " +
                "entidad externa." +
                "" +
                "\nEs forma de escribir codigo es muy importante a la hora de programar " +
                "ya que facilita el entendimiento \ny el no gastar recursos computacionales " +
                "la mejor manera de aprenderlo es practicando, \nya que siempre encontraras una mejor " +
                "forma de optimizar tu codigo.";

        System.out.println("Longitud de la circunferencia: " + radio.calcularRadio(args[0]));
        System.out.println(arquitecturaLimpia);

    }
}