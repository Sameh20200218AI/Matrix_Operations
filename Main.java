import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        System.out.print("For first matrix  ");
        MatrixClass obj1 = new MatrixClass();
        System.out.print("For second matrix  ");
        MatrixClass obj2 = new MatrixClass();
       System.out.println("Welcome to Matrix Calculator");
       System.out.println("------------------------------");
       System.out.println("1- Perform Matrix Addition");
       System.out.println("2- Perform Matrix Subtraction");
       System.out.println("3- Perform Matrix Multiplication");
       System.out.println("4- Matrix Transpose");
       System.out.println("5- Show All Operation");
       int choice = 0;
       System.out.println("Please enter your choice ");
       Scanner input = new Scanner(System.in);
       choice = input.nextInt();
       while(choice >5 || choice <1)
       {
        System.out.println("Invalid choice Please enter your choice between [1 , 5] ");
        choice = input.nextInt();
       }
       Calculation operation = new Calculation();
       if(choice ==1)
       { 
        System.out.println("The sum of two matrices is : ");
        operation.add_fun(obj1, obj2);
       }
       else if (choice == 2)
       {
        System.out.println("The subtraction of two matrices is : ");
        operation.sub_fun(obj1, obj2);
       }
       else if (choice ==3)
       {
        System.out.println("The transpose of two matrices is : ");
        operation.transpose_fun(obj1, obj2);
       }
       else if (choice==4)
       {
        System.out.println("The multiplication of thw matrices is : ");
        operation.multiplication(obj1, obj2);
       }
       else if (choice==5)
       {
        System.out.println("The sum of two matrices is : ");
        operation.add_fun(obj1, obj2);
        System.out.println("The subtraction of two matrices is : ");
        operation.sub_fun(obj1, obj2);
        System.out.println("The transpose of two matrices is : ");
        operation.transpose_fun(obj1, obj2);
        System.out.println("The multiplication of thw matrices is : ");
        operation.multiplication(obj1, obj2);

       }
      
    }
}