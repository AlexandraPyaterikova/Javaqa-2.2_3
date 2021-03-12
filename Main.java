public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int oneYear = service.calculate(1000000 F, 12 F);
        System.out.println("Ежемесячный платеж при кредитовании на 1 год: " + oneYear + " руб.");
        int twoYear = service.calculate(1000000 F, 24 F);
        System.out.println("Ежемесячный платеж при кредитовании на 2 года: " + twoYear + " руб.");
        int threeYear = service.calculate(1000000 F, 36 F);
        System.out.println("Ежемесячный платеж при кредитовании на 3 года: " + threeYear + " руб.");
    }
}
