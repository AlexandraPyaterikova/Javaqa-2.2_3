public class CreditPaymentService {
    public int calculate(float sum, float term) {
        float rate = 9.99F / 100F / term;
        float a = (1F+rate);
        double a1 = Math.pow(a,term);
        double a2 = rate * a1;
        double b = a1 - 1F;
        int payment = (int) (a2 / b * sum);
        return payment;
    }
}
