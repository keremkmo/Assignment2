import java.util.Arrays;
import java.util.Random;

public class HW2 {
    public static void main (String[] args){

        int [][] First_Matrix = getRandom();
        int [][] Second_Matrix = getRandom();

        System.out.println(
                "First Matrix :  \n"+
                Arrays.deepToString(First_Matrix).replace("],","],\n" )+
                "\nTranspose First Matrix : \n"
                +Arrays.deepToString(takeTranpose(First_Matrix)).replace("],","],\n" )
                +"\n\n"+
                "Second Matrix : \n"
                +Arrays.deepToString(Second_Matrix).replace("],","],\n" )+
                "\nTranspose Second Matrix : \n"
                +Arrays.deepToString(takeTranpose(Second_Matrix)).replace("],","],\n" ));

        int [][] Summation=Add(First_Matrix,Second_Matrix);
        System.out.println("Summation of First Matrix and Second Matrix :\n"+
                Arrays.deepToString(Summation).replace("],","],\n"));

        int [][] Subtraction=Sub(First_Matrix,Second_Matrix);
        System.out.println("Subtraction of First Matrix and Second Matrix :\n"+
                Arrays.deepToString(Subtraction).replace("],","],\n"));

        int [][] Multiplication=Multipinti(First_Matrix,Second_Matrix);
        System.out.println("Multiplication of First Matrix and Second Matrix :\n"+
                Arrays.deepToString(Multiplication).replace("],","],\n"));

    }
    public static int [] [] getRandom() {
        int [][] Random_Matrix = new int[4][4];
        Random randomer= new Random();
        for(int i=0 ; i<4 ; i++)
            for(int j=0 ; j<4 ; j++)
                Random_Matrix [i][j] = randomer.nextInt(30);

        return Random_Matrix;
    }

    public static int [][] takeTranpose(int[][]m) {
        int [][] Transpose_Matrix = new int[4][4];
        for(int i=0 ; i<4 ; i++)
            for(int j=0 ; j<4 ; j++)
                Transpose_Matrix [i][j] = m [j][i];

        return Transpose_Matrix;
    }
    public static int [][] Add(int [][] A , int [][] B)
    {
        int [][] Sum = new int [4][4];
        int i,j;
        for( i=0 ; i<4 ; i++)
            for( j=0 ; j<4 ; j++)
                Sum [i][j] = A[i][j] + B[i][j] ;

return Sum;
    }
    public static int [][] Sub(int [][] A , int [][] B)
    {
        int [][] Sub = new int [4][4];
        int i,j;
        for( i=0 ; i<4 ; i++)
            for( j=0 ; j<4 ; j++)
                Sub [i][j] = A[i][j] - B[i][j] ;

        return Sub;
    }
    public static int [][] Multipinti (int [][] A, int [][] B)
    {
        int [][] Mul = new int [4][4];
        int i,j;
        for( i=0 ; i<4 ; i++)
            for( j=0 ; j<4 ; j++)
                Mul [i][j] = A[i][j] * B[i][j] ;

        return Mul;
    }
}


