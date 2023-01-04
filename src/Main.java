import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 4, 1331, 65, 374, 223322, 43, 14, -54, 536};

        //Минимальное значение массива

        int min = arr[0];

        for (int i: arr) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println(min);

        //Максимальное значение массива

        int max = arr[0];

        for (int i: arr) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println(max);

        //Выводим четные числа

        for (int even: arr) {
            if (even%2==0) {
                System.out.println(even);
            }
        }

        //Выводим нечетные числа

        for (int odd: arr) {
            if (odd%2!=0) {
                System.out.println(odd);
            }
        }

        //Выводим числа-палиндромы

        String[] strarr = new String[arr.length];
        System.out.print("Palindrome: ");
        for (int i = 0; i < arr.length; i++) {

            strarr[i] = String.valueOf(arr[i]);
            StringBuffer buffer = new StringBuffer(strarr[i]);
            buffer.reverse();
            String rev = buffer.toString();

            if (strarr[i].equals(rev)) {
                System.out.print(strarr[i] + " ");
            }
        }
        System.out.println(" ");

        //Выводим массив в порядке возрастания

        Arrays.sort(arr);

        for (int values : arr) {
            System.out.print(values + " ");
        }

    }
}