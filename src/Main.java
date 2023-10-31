public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;
        int index = service.calculate((int)weight);
        System.out.println(index);

    }
}