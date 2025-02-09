import java.util.*;
public class INVERTED_HALF_PYRAMID_with_Numbers {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number line :");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            int k = 1;
            for(int j = i; j<=n; j++){
                
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
