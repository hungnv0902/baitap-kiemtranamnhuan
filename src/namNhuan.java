import java.util.Scanner;

public class namNhuan {
    public static void main(String[] args){
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập năm muốn kiểm tra : ");
        year = scanner.nextInt();

        if(year % 4 == 0) {
            if(year % 100 != 0 ){
                System.out.println(year + " la nam nhuan");
            } else if(year % 400 == 0) {
                System.out.println(year + " la nam nhuan");
            } else {
                System.out.println(year + " khong phai la nam nhuan");
            }


        } else {
            System.out.println(year + " khong phai la nam nhuan");
        }
    }
}
