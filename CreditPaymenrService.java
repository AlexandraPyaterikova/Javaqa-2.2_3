public class CreditPaymentService {
    public int calculate(float sum, float term) {
        float rate = 9.99F / 100F / 12F;
        float a = (1F + rate);
        double a1 = Math.pow(a, term);
        double a2 = rate * a1;
        float b = (1F + rate);
        double b1 = Math.pow(b, term);
        double b2 = b1 - 1F;
        int payment = (int)(a2 / b2 * sum);
        return payment;
    }
}
