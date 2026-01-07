public class EconomicCalculationImpl implements EconomicCalculation {
    @Override
    public double calculateEconomicValue(double revenue, double cost) {
        return revenue - cost;
    }
}
