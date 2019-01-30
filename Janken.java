import java.util.Scanner;
public class Janken{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("　 1:グー　2:チョキ　3:パー");
        System.out.println("Aの番です");
        int i = sc.nextInt();
        System.out.println("Bの番です");
        int k = sc.nextInt();
        if (i == k){
          System.out.println("あいこです");
        } else if((i == 1 && k == 2) || (i == 2 && k ==3) || (i == 3 && k == 1)) {
          System.out.println("Aの勝ちです");
        }else if((k == 1 && i == 2) || (k == 2 && i ==3) || (k == 3 && i == 1)) {
          System.out.println("Bの勝ちです");
        }
     }
}
