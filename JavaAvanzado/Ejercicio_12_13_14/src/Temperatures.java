
public class Temperatures {
    // TODO: 06/01/2023 add fahrenheit to Kelvin and Celcius
    // TODO: 06/01/2023 add Kelvin to Celcius and Fahrenheit
    public void Temperatures() {
    }
    /**
     * @param celcius Ingresa la temperatura celcius, ya sea en int o en double
     * @return Se realiza la formula, las constantes deben estar el double para que funcione
     */
    public double celciusToFahrenheit(double celcius) {
        return celcius * (9.0 / 5.0) + 32.0;
    }

    public double celciusToKelvin(double celcius) {
        return celcius + 273.15;
    }
}
