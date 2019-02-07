import java.util.Scanner;
public class Janken{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("　 1:グー　2:チョキ　3:パー");
        System.out.println("Aの番です");
        int a = sc.nextInt();
        System.out.println("Bの番です");
        int b = sc.nextInt();
        if (a == b){
          System.out.println("あいこです");
        } else if((a == 1 && b == 2) || (a == 2 && b ==3) || (a == 3 && b == 1)) {
          System.out.println("Aの勝ちです");
        }else if((b == 1 && a == 2) || (b == 2 && a==3) || (b == 3 && a == 1)) {
          System.out.println("Bの勝ちです");
        }
     }
}
