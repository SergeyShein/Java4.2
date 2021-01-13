public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int BMI = (int)service.calculate(60.0f, 1.65f);
        System.out.println(BMI);
    }
}
