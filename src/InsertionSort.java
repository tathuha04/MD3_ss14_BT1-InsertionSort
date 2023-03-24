import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("nhập " + array.length + " giá trị của mảng: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("\nMảng :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sort(array);
        System.out.println("Mảng sau khi sắp xếp là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            System.out.println("key = " + array[i]);
            int j = i - 1;
            System.out.println("j = " + (i - 1));
            while (j >= 0 && array[j] > key) {
                System.out.println("gán giá trị của " + array[j + 1] + " = " + array[j]);
                array[j + 1] = array[j];
                j = j - 1;
                System.out.println("giá trị của j = " + j);
            }
            System.out.println("gán giá trị của  " + array[j + 1] + " = " + key);
            array[j + 1] = key;
        }
    }
}