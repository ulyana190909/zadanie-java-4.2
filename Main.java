public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double bodyMassIndex = bmiService.calculate(50, 1.65);
        System.out.println(bodyMassIndex);
    }
}
