public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double imtGood = service.calculate(100,188);
        System.out.println(imtGood);
        double imtNotGood = service.calculate(140,188);
        System.out.println(imtNotGood);

    }
}
