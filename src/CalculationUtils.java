public class CalculationUtils {
    private final EconomicCalculation economicCalc;

    public CalculationUtils(EconomicCalculation economicCalc) {
        this.economicCalc = economicCalc;
    }

    public void performEconomic(double revenue, double cost) {
         System.out.println(economicCalc.calculateEconomicValue(revenue,cost));
    }

    public static void main(String [] args){
        EconomicCalculation econImpl = new EconomicCalculationImpl();
        CalculationUtils calUtil = new CalculationUtils(econImpl);
        calUtil.performEconomic(150,100);
    }

}
