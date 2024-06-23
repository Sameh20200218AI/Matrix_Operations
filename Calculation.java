public class Calculation {
    
    public void add_fun(MatrixClass m1, MatrixClass m2)
    {
         int row_sumMatrex=0;
         int column_sumMatrex=0;
         int sumMatrix [][];
        
        if(m1.row != m2.row || m1.column !=m2.column)
        {
            System.out.println("The two matrices not hava the same size");
            System.out.println("Therefor cannot sum this two matrices ");
        }
        else
        {
            row_sumMatrex = m1.row;
            column_sumMatrex = m1.column;
             sumMatrix = new int [row_sumMatrex][column_sumMatrex];
             for(int i=0;i<row_sumMatrex;i++)
             {
                 for(int j=0;j<column_sumMatrex;j++)
                 {
                   sumMatrix[i][j] = m1.arr[i][j] + m2.arr[i][j];
                 }
            
             }
             for(int i=0;i<row_sumMatrex;i++)
             {
                for(int j=0;j<column_sumMatrex;j++)
                {
                    System.out.print("  " + sumMatrix[i][j]+"  ");
                }
                System.out.println("");
             }
         
        }
    }
    public void sub_fun(MatrixClass m1, MatrixClass m2)
    {
         int row_subMatrex=0;
         int column_subMatrex=0;
         int subMatrix [][];
        
        if(m1.row != m2.row || m1.column !=m2.column)
        {
            System.out.println("The two matrices not hava the same size");
            System.out.println("Therefor cannot sunbtract this two matrices ");
        }
        else
        {
            row_subMatrex = m1.row;
            column_subMatrex = m1.column;
             subMatrix = new int [row_subMatrex][column_subMatrex];
             for(int i=0;i<row_subMatrex;i++)
             {
                 for(int j=0;j<column_subMatrex;j++)
                 {
                   subMatrix[i][j] = m1.arr[i][j] - m2.arr[i][j];
                 }
            
             }
             for(int i=0;i<row_subMatrex;i++)
             {
                for(int j=0;j<column_subMatrex;j++)
                {
                    System.out.print("  " + subMatrix[i][j]+"  ");
                }
                System.out.println("");
             }
         
        }
    }
    public void transpose_fun(MatrixClass m1 , MatrixClass m2)
    {
        int arr1  [][]= new int [m1.column][m1.row];
        int arr2  [][]= new int [m2.column][m2.row];
        for(int i=0;i<m1.row;i++)
        {
            for(int j=0;j<m1.column;j++)
            {
                arr1[j][i] = m1.arr[i][j];
            }
        }
        for(int i=0;i<m2.row;i++)
        {
            for(int j=0;j<m2.column;j++)
            {
                arr2[j][i] = m2.arr[i][j];
            }
        }
        System.out.println("The transpose of first matrix is : ");
        for(int i=0;i<m1.column;i++)
        {
            for(int j=0;j<m1.row;j++)
            {
                System.out.print("  " + arr1[i][j] +"  ");
            }
            System.out.println(" ");
        }
        System.out.println("The transpose of second matrix is : ");
        for(int i=0;i<m2.column;i++)
        {
            for(int j=0;j<m2.row;j++)
            {
                System.out.print("  " + arr2[i][j] +"  ");
            }
            System.out.println(" ");
        }
    }
    public void multiplication(MatrixClass m1,MatrixClass m2)
    {
        if(m1.column!=m2.row)
        {
           System.out.println("The column of the first matrix not equal number of rows in second matrex !!!");
           System.out.println("Then connot multiply this two matrix . ");
        }
        else
        {

        
             int multMatrix[][]= new int [m1.row][m2.column];
            for(int i=0;i<m1.row;i++)
             {
                for(int j=0;j<m2.column;j++)
                 {
                   int sum = 0;
                   for(int k=0;k<m1.row;k++)
                    {
                       sum = sum + m1.arr[i][k]*m2.arr[k][j];
                       
                    }
                    multMatrix[i][j]=sum;

                 }
             }
             for(int i=0;i<m1.row;i++)
             {
                for(int j=0;j<m2.column;j++)
                 {
                   System.out.print("  " + multMatrix[i][j] + "  ");
                 }
                 System.out.println(" ");
             }
             
        }
    }
}
