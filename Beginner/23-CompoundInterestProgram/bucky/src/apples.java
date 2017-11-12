
// 23 - Compound Interest Program

public class apples {
    public static void main(String[] args) {
        // A=P(1+R)^n | A = Amount, P = principal - 10,000, R = rate, the power of n = number of years
        double amount;
        double principal = 10000;
        double rate = .01;
        
        for(int day = 1; day <= 20; day++){
            amount = principal*Math.pow(1 + rate, day);
            System.out.println(day+ "   " + amount);
        }
    }
}