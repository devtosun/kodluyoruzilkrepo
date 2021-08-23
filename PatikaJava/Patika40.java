package PatikaJava;

public class Patika40 {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 7, 12, 11, 3, 15};

        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += 1 / (double)numbers[i];
        }
        System.out.println("Harmonik ortalama : " + (numbers.length / sum));
    }
}
