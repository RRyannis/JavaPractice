import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Case 1: Triggering the default message
            checkCoreTemperature(1500);

            // Case 2: Triggering a custom message
            // checkCoreTemperature(5000);

        } catch (CoreBreachException e) {
            // This catches the object you created and prints the message
            System.out.println("ALERT: " + e.getMessage());
        } finally {
            System.out.println("System scan complete.");
        }
    }

    public static void checkCoreTemperature(int temp) throws CoreBreachException {
        if (temp > 1000 && temp < 4000) {
            // Throwing the default constructor version
            throw new CoreBreachException();
        } else if (temp >= 4000) {
            // Throwing the version with a custom string
            throw new CoreBreachException("CRITICAL FAILURE: Core melting at " + temp + " degrees!");
        } else {
            System.out.println("Temperature stable at " + temp);
        }
    }
}

class CoreBreachException extends Exception{
    public CoreBreachException(){
        super("Core Breach! Evacuate Ship!");
    }
    public CoreBreachException(String message){
        super(message);
    }
}