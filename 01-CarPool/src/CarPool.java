import java.util.Scanner;

public class CarPool {
    public static void main (String[] args) {

        // Scanner scanner = new Scanner(System.in); it is always required to read data from user
        Scanner scanner = new Scanner(System.in);
        // necessary values
        double milesPerDay = 0;
        double milesPerGallon = 0;
        double gasPrice = 0;
        int passengers = 0;

        System.out.println("Miles you make per day:");
        milesPerDay = scanner.nextDouble();
        System.out.println("Vehicle's MPG:");
        milesPerGallon = scanner.nextDouble();
        System.out.println("Gas price for per gallon:");
        gasPrice = scanner.nextDouble();
        System.out.println("Number of passenger you carry:");
        passengers = scanner.nextInt();

        double milesPerWeek = milesPerDay * 7;
        double milesPerMonth = milesPerWeek * 4;
        double monthlyGasCost = (milesPerMonth / milesPerGallon) * gasPrice;
        double carpool = monthlyGasCost / (passengers + 1);
        double saving = monthlyGasCost - carpool;

        System.out.println("Daily Mileage: " + milesPerDay + "\n" + "Weekly Mileage: " + milesPerWeek + "\n" + "Monthly Mileage: " + milesPerMonth);
        System.out.println("Your monthly gas cost without carpooling: $" + monthlyGasCost);
        System.out.println("Your monthly gas cost by carpooling: $" + carpool);
        System.out.println("Your saving by carpooling: $" + saving);

    }
}
