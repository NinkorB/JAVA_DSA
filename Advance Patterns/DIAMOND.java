import java.util.*;
public class DIAMOND {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number line :");
        int n = sc.nextInt();
        int k =1;
        int l =0 ;

        for(int i = 1; i<=n*2; i++){         
            if(i%2 != 0){
                for(int j=k; j<n; j++ ){
                    System.out.print(" ");
                }
                for(int j=n*2-i; j<n*2; j++){
                    System.out.print("*");
                }
                k++;
                System.out.println(); 
            }
                     
        }
        for(int i = 1; i<=n*2; i++){  
            if(i%2 != 0){
                for(int j=n-l; j<n; j++){
                    System.out.print(" ");
                }
                for(int j=i;j<n*2;j++){
                    System.out.print("*");
                }
                l++;
                System.out.println();
            }
        

        }
    }
}
