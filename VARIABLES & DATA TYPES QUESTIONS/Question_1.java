/* Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers. */

//Solution :

import java.util.*;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        float avg;
        System.out.println("Enter Three Numbers :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        avg = (a+b+c)/3.0f;
        System.out.println("The average of "+a +" "+b+" "+c+" is : " + avg);
    }
}
