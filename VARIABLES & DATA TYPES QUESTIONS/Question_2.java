/* Question 2: In a program, input the side of a square. You have to output the area of the
square. */

//Solution :

import java.util.*;
public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side, area;
        System.out.println("Enter side of the square : ");
        side = sc.nextFloat();
        area = side*side;
        System.out.println("The area of square for side length "+side+" is : "+area  );
    }
     
}