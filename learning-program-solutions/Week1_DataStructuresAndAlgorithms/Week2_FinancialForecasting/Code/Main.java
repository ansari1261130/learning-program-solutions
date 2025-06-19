public class Main {
    public static void main(String[] args) {
        double initialAmount = 1000.0;
        double growthRate = 0.10;  // 10%
        int years = 5;
        FinancialForecasting obj = new FinancialForecasting();
        double futureValue = obj.calculateFutureValue(initialAmount, growthRate, years);

        System.out.printf("Future value after %d years: ₹%.2f\n", years, futureValue);
    }
}