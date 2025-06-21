public class FinancialForecast {
    public static double calculateFV(double principal, double rate, int years) {
        if(years == 0) 
            return principal;
        
        return calculateFV(principal*(1+rate), rate, years-1);
    }

    public static double predictFV(double principal, double past_growth_rates[], int index) {
        if(index == past_growth_rates.length)
            return principal;
        return predictFV(principal*(1+past_growth_rates[index]), past_growth_rates, index+1);
    }

    public static void main(String args[]) {
        double rate = 0.06; //6% rate of return
        double past_growth_rates[] = {0.10, 0.30, -0.06, -0.10, 0.40, 0.05, -0.20, 0.60}; //past growth rates of 7 years
        
        System.out.println("Future value of 100/- at 6% rate over 10 years: "+calculateFV(100, rate, 10));
        System.out.println("Future vale of 100/- of over 7 years with different growth rates: "+predictFV(100, past_growth_rates, 0));
    }
}