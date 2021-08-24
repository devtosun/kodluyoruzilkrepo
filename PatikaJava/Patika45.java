package PatikaJava;

import java.util.Arrays;

public class Patika45 {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 20, 20, 15, 15, 10, 10, 15, 15, 20, 5, 20, 15, 15, 25};
        Arrays.sort(numbers);

        int temp;
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            temp = numbers[i];
            for (int j = i; j < numbers.length; j++) {
                if (temp == numbers[j]){
                    count++;
                } else {
                    break;
                }
            }
            System.out.println(numbers[i] + " sayısı " + count + " kere tekrar edildi.");
            i += (count-1);
        }
    }

}
