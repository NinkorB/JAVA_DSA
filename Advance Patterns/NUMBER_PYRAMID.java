import java.util.*;
public class NUMBER_PYRAMID {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number line :");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int j = n-i; j<n; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
    
}
