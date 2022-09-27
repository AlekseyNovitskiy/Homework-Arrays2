import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        // Задание 1
        System.out.println("Задание 1");
        int amountPerMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            amountPerMonth+=arr[i];
        }
        System.out.println("Сумма трат за месяц составила "+amountPerMonth+" рублей");
        // Задание 2
        System.out.println("Задание 2");
        int maxSum = -1;
        int minSum = 200001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxSum){
                maxSum = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<minSum){
                minSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minSum+" рублей. Максимальная сумма трат за день составила "+maxSum+" рублей");

        // Задание 3
        System.out.println("Задание 3");
        double averagePerMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            averagePerMonth+=arr[i];
        }
        averagePerMonth/=30;
        System.out.println("Средняя сумма трат за месяц составила "+averagePerMonth+" рублей");


        // Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}