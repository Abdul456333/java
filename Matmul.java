import java.util.*;

public class Matmul {
    public static void main(String args[]){
        int r1,c1,r2,c2,i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and matrix in first matrix");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter the number of rows and columns in second matrix");
        r2=sc.nextInt();
        c2=sc.nextInt();
        int mat1[][]=new int[r1][c1];
        int mat2[][]=new int[r2][c2];
        System.out.println("Enter the elements of first matrix");
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix");
        for(i=0;i<r2;i++){
            for(j=0;j<c2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        int ansmat[][]=new int[r1][c2];
        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
                for(k=0;k<r2;k++){
                    ansmat[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        for(i=0;i<r1;i++){
            for(j=0;j<c2;j++){
                System.out.println(ansmat[i][j]);
            }
        }
    }
}
