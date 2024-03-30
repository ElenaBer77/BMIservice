public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.70;// рост указывается в метрах
        double weight = 60; // вес указывается в килограммах
        double bmi = service.calculate(height, weight);
        System.out.println((int) bmi);

    }
}
