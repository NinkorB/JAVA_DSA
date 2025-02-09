import java.util.*;
class HOLLOW_RECTANGLE{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number line :");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            
                if(i==1 || i ==n ){
                    for(int j=0; j<=n; j++){
                        System.out.print("*");
                    }
                    
                } else{
                    for(int j=0; j<=n; j++){
                        if(j==0 || j==n){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }

                }
                System.err.println();
                
                
        }
        
    }
}