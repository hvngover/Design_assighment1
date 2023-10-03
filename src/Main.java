import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = CurrencyConverter.getInstance();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the source currency (USD, EUR):");
        String sourceCurrency = scanner.nextLine();

        System.out.println("Enter the target currency (USD, EUR):");
        String targetCurrency = scanner.nextLine();

        System.out.println("Enter the amount:");
        double amount = scanner.nextDouble();

        if (sourceCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            converter.setStrategy(new UsdToEur());
        } else if (sourceCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            converter.setStrategy(new EurToUsd());
        } else {
            System.out.println("Unsupported currency conversion.");
            return;
        }

        double convertedAmount = converter.convert(amount);
        System.out.println(amount + " " + sourceCurrency + " is " + convertedAmount + " " + targetCurrency);

        scanner.close();
    }
}
