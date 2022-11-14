import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int basNum;

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        basNum=scan.nextInt();

        for (int i=1;i<=basNum;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int k=basNum*2;k>((2*i)-1);k--){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}