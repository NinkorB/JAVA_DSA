import java.util.*;
public class BUTTERFLY {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number line :");
        int n = sc.nextInt();
        for(int i = 1; i<=n/2; i++){
            for(int j=(n/2)-i; j<(n/2); j++){
                System.out.print("*");
            }
            for(int j=i+1; j<=n/2;j++){
                System.out.print("  ");
            }
            for(int j=(n/2)-i; j<(n/2); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i<=n/2; i++){
            for(int j=i; j<=n/2; j++){
                System.out.print("*");
            }
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<n/2; j++){
                System.out.print("*");
            }
            System.out.println("*");

        }
    }
    
}
