import java.util.*;
public class Triangle_0_1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number line :");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            
            for(int j = n-i; j<n; j++){
                if( j % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
