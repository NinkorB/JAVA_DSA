/* Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen a
an eraser. You have to output the total cost of the items back to the user as their bill. */

//Solution :

import java.util.*;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil, pen, eraser,tBill;
        System.out.println("Enter the cost of a pencil, a pen, and an eraser respectivly : ");
        pencil = sc.nextFloat();
        pen = sc.nextFloat();
        eraser = sc.nextFloat();

        tBill = (((pencil+pen+eraser)/100)*18) + (pencil+pen+eraser);
        System.out.println(tBill);
    }
}
