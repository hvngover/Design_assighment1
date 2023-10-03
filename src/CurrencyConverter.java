public class CurrencyConverter {
    private static CurrencyConverter instance;
    private CurrencyConversionStrategy strategy;

    private CurrencyConverter() {}

    public static CurrencyConverter getInstance() {
        if (instance == null) {
            instance = new CurrencyConverter();
        }
        return instance;
    }

    public void setStrategy(CurrencyConversionStrategy strategy) {
        this.strategy = strategy;
    }

    public double convert(double amount) {
        return strategy.convert(amount);
    }
}
