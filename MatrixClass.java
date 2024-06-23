import java.util.*;
public class MatrixClass {
    public int row=0;
    public int column=0;
    public int arr[][];
    public MatrixClass()
    {
      while(row<1 || column<1)
      { 

      
        System.out.println("enter number of rows : ");
        Scanner input = new Scanner(System.in);
         row=input.nextInt();
        System.out.println("enter number of columns : ");
           column=input.nextInt();
        
         if(row<=0 || column<=0)
         {
          System.out.println("Invalid inputs !!!!!");
          System.out.println("Please enter positive and non zeros values for rows and columns ");
         }
         else
         {
          arr  = new int [row][column];
          setElementsInMatrix();
          break;
         }
        
      }
    }
    public void setElementsInMatrix()
    {
        Scanner input = new Scanner(System.in);
      for(int i=0;i<row;i++)
      {
        for(int j=0;j<column;j++)
        {
            System.out.println("Enter an element at row : " +i +" and column : " +j);
            arr[i][j]= input.nextInt();
        }
      }
    }
    
    
}
