public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double rost = 1.70;// рост указывается в метрах
        double ves = 60; // вес указывается в килограммах
        double bmi = service.calculate(rost, ves);
        bmi = (int) bmi;
        System.out.println(bmi);

    }
}
