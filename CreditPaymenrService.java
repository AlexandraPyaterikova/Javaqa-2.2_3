public class CreditPaymentService {
    public int calculate(float sum, float term) {
        float rate = 9.99 F / 100 F / 12 F;
        float a = (1 F + rate);
        double a1 = Math.pow(a, term);
        double a2 = rate * a1;
        float b = (1 F + rate);
        double b1 = Math.pow(b, term);
        double b2 = b1 - 1 F;
        int payment = (int)(a2 / b2 * sum);
        return payment;
    }
}
