package Labassesment2;

import java.util.Set;

    public class CurrencyInputValidator {
        private Set<String> supportedCurrencies;

        public CurrencyInputValidator(Set<String> supportedCurrencies) {
            this.supportedCurrencies = supportedCurrencies;
        }

        public boolean isValidCurrency(String currencyCode) {
            return supportedCurrencies.contains(currencyCode.toUpperCase());
        }
    }

public class UserInput {
  //  private Scanner scanner;
    private CurrencyInputValidator currencyValidator;

    public UserInput(Set<String> supportedCurrencies) {
       // scanner = new Scanner(System.in);
        currencyValidator = new CurrencyInputValidator(supportedCurrencies);
    }

    public double getAmount() {
        System.out.print("Enter the amount: ");
        //return scanner.nextDouble();
    }
 //
    public String getCurrencyCode(String prompt) {
        String currencyCode;
        do {
            System.out.print(prompt);
           // currencyCode = scanner.next().toUpperCase();
        } while (!currencyValidator.isValidCurrency(currencyCode));

        return currencyCode;
    }
}

