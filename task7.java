import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 12;
        int b = 4;
        int c = 7;
        boolean flag = false;
        int n = s.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n;i++){
            ar[i]=s.nextInt();
            if(a==ar[i]||ar[i]==b||ar[i]==c){
                flag = true;
            }
        }
        if(flag == true){
            System.out.println("Данное значение имеется в константах");
        }
    }
}
