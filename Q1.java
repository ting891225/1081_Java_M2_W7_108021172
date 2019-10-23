import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int x = scn.nextInt();
        int y = x/2;
        boolean flag = true;
        for (int i=2;i<=y;i++){
            if(x%i==0){
                flag= false;
            }
        }
        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}