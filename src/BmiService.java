public class BmiService {
    public double calculate (int weight, int height) {

        int bodyMassIndex = (weight * 10000 / (height * height));

        return bodyMassIndex;

    }
}
