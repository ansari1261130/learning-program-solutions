public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialAmount, double growthRate, int years) {

        if (years == 0) {
            return initialAmount;
        }

        return calculateFutureValue(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

    }
}
