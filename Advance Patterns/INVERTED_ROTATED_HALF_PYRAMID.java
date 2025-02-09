import java.util.*;
public class INVERTED_ROTATED_HALF_PYRAMID {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number line :");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int k=n-i; k<n; k++){
                System.err.print("*");
            }
                
            System.out.println();

            
            
        }
    }
}
