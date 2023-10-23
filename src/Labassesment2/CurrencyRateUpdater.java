package Labassesment2;

import java.util.Random;

public class CurrencyRateUpdater {
    private String[] currencies;
    private double[] exchangeRates;
    private Random random;

    public CurrencyRateUpdater(String[] currencies) {
        this.currencies = currencies;
        this.exchangeRates = new double[currencies.length];
        this.random = new Random();
        initializeExchangeRates();
    }

    private void initializeExchangeRates() {
        // Initialize exchange rates (example rates)
        exchangeRates[getIndex("USD")] = 1.0;
        exchangeRates[getIndex("EUR")] = 0.85;
        exchangeRates[getIndex("GBP")] = 0.75;
        // Add more currencies as needed
    }

    public void updateRates() {
        for (int i = 0; i < currencies.length; i++) {
            double currentRate = exchangeRates[i];
            double fluctuation = generateRandomFluctuation();
            double newRate = currentRate * (1 + fluctuation);
            exchangeRates[i] = newRate;
        }
    }

    private double generateRandomFluctuation() {
        // Simulate a random fluctuation between -0.05 and 0.05 (5% fluctuation)
        return (random.nextDouble() - 0.5) / 10.0;
    }

    private int getIndex(String currency) {
        for (int i = 0; i < currencies.length; i++) {
            if (currencies[i].equals(currency)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Unsupported currency code: " + currency);
    }

    public String[] getCurrencies() {
        return currencies.clone();
    }

    public double getExchangeRate(String currency) {
        return exchangeRates[getIndex(currency)];
    }

    public double[] getExchangeRates() {
        return exchangeRates.clone();
    }
}
