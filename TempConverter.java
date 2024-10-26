package Project1;
import java.util.Scanner;

public class TempConverter{
    
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter the temperature: ");
        double temperature = sc.nextDouble();  


        System.out.println("Enter the unit of measurement:");
        System.out.println("1. °C (Celsius)");
        System.out.println("2. °F (Fahrenheit)");
        System.out.println("3. °K (Kelvin)");

        int unitChoice = sc.nextInt();

        
        switch (unitChoice) {
            case 1: 
                double fahrenheitFromCelsius = (temperature * 9/5) + 32;
                double kelvinFromCelsius = temperature + 273.15;
                System.out.printf("%.2f°C ,  %.2f°F , %.2fK",temperature,fahrenheitFromCelsius,kelvinFromCelsius);
                break;

            case 2: 
                double celsiusFromFahrenheit = (temperature - 32) * 5/9;
                double kelvinFromFahrenheit = (temperature - 32) * 5/9 + 273.15;
                System.out.printf(" %.2f°C ,  %.2f°F , %.2fK",temperature,celsiusFromFahrenheit,kelvinFromFahrenheit);
                break;

            case 3: 
                double celsiusFromKelvin = temperature - 273.15;
                double fahrenheitFromKelvin = (temperature - 273.15) * 9/5 + 32;
                System.out.printf(" %.2fK , %.2f°F , %.2f°C",temperature, fahrenheitFromKelvin,celsiusFromKelvin);
                break;

            default:
                System.out.printf("Invalid unit option! Please choose 1, 2, or 3.");
        }

        sc.close();
    }
}