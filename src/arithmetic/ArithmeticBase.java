/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

//import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
 public enum Num1{ x}
 public enum Num2{ y}
 public ArithmeticBase(Num1 x, Num2 y){
     this.Num1=n1;
     this.Num2=n2;
 }
 
    double calculate(Num1 x, Num2 y) 
        {
        //Scanner sc =new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform: ");
        //n1 s= sc.next();
        switch (s.toUpperCase()) 
        {
            case "PLUS":
                return x + y;
            case "MINUS":
                return x - y;
            case "TIMES":
                return x * y;
            case "DIVIDE":
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
