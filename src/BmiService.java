public class BmiService {
    public double calculate(double height, double weight) {
        double result;
        result = weight / height / height;
        return result;
    }

}


