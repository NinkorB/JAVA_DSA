import java.util.*;
public class FLOYDs_Triangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number line :");
        int n = sc.nextInt();
        int k =1;
        for(int i = 1; i<=n; i++){
            
            for(int j = n-i; j<n; j++){
                System.out.print(k+" ");
                k++;

            }
            System.out.println();
        }
    }
}

