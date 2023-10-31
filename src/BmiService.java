public class BmiService {
    public int calculate(double weight) {
        double result;
        double height = 1.87;
        result = weight / (height * height);
        return (int) result;
    }
}
