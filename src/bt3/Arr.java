package bt3;
import java.util.Scanner;
public class Arr {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("mang co độ dài là :  ");

        int width = scanner.nextInt();
        int [] arr = new int[width];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập phần tử thứ" + i);
            arr[i] = scanner.nextInt();
        }
        for (int number:
             arr) {
            System.out.println(number);
        }
    }}
