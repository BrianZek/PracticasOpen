public class Main {
    public static void main(String[] args) {

        //if
        int numeroIf = -2;
        if(numeroIf > 0){
            System.out.println("El numero es positivo");
        }
        else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        }
        else{
            System.out.println("El numero es cero");
        }

        //While
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println("while: " + numeroWhile);
            numeroWhile++;
        }

        //Do While
        do {
            System.out.println("do while: " + numeroWhile);
            numeroWhile++;
        }while(numeroWhile == 3);

        //For
        for(int numeroFor=0; numeroFor <= 3; numeroFor++){
            System.out.println("for: " + numeroFor);
        }

        //Switch
        String estacion = "Invierno";
        switch (estacion){
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("La opcion no es una estacion");
        }

    }
}