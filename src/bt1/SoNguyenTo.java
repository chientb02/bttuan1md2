package bt1;
import java.util.Scanner;
public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số n ");
        int n = scanner.nextInt();
        for (int i = 2; i < n; i++) {
            boolean flag = true ;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println(i);
            }

        }
    }
}
