public class UsdToEur implements CurrencyConversionStrategy {
    private static final double CONVERSION_RATE = 0.953927;

    public double convert(double amount) {
        return amount * CONVERSION_RATE;
    }
}
