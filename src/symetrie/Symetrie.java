/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package symetrie;

/**
 *
 * @author ondrej.donat
 */
import java.util.Scanner;
public class Symetrie {

    public static void main(String[] args) {
        int[][]a = {{456,24,14},
                    {12,15,14},
                    {9,12,13}};
        boolean h = horizontal(a);
        boolean v = vertical(a);
        boolean d = diagonal(a);
        boolean d2 = diagonal2(a);
        int sum = sumOtherDiagonal(a);
        
        System.out.println(((h)?"neni":"je")+" horizontalni,"+((v)?"neni":"je")+" verticalni"+((d)?"neni":"je")+" diagonalni "+((d2)?"neni":"je")+" vedlejsi diagonalni");
        System.out.println("suma je: "+sum+" suma radku:");
        
       }
   
       
    
    public static boolean horizontal(int matrix[][]){
        boolean horizontal = false;
        for (int i =0;i<matrix.length/2;i++){        
            for (int j = 0;j<matrix[i].length && !horizontal;j++){
                if (matrix[i][j] != matrix[matrix.length-1-i][j]){
                horizontal = true; 
            }
            }
       } 
        return horizontal;
    }
    public static boolean vertical(int matrix[][]){
        boolean vertical = false;
        for (int i =0;i<matrix.length;i++){        
            for (int j = 0;j<matrix[i].length/2 && !vertical;j++){
                if (matrix[i][j] != matrix[matrix.length-1-j][j]){
                vertical = true; 
            }
            }
       } 
        return vertical;
    }
    public static boolean diagonal(int matrix[][]){
        boolean Diagonal = false;
        for (int i =0;i<matrix.length;i++){        
            for (int j = 0;j<i && !Diagonal;j++){
                if (matrix[i][j] != matrix[j][i]){
                Diagonal = true; 
            }
            }
       } 
        return Diagonal;
    }
    public static boolean diagonal2(int matrix[][]){
        boolean Diagonal2 = false;
        for (int i =0;i<matrix.length-1;i++){        
            for (int j = matrix[i].length-2-i;j<0 && !Diagonal2;j++){
                if (matrix[i][j] != matrix[matrix.length-1-j][matrix[i].length]-1-i){
                Diagonal2 = true; 
            }
            }
       } 
        return Diagonal2;
    }
    public static int sumOtherDiagonal(int matrix[][]){
        int sum = 0;
        for (int i =0;i<matrix.length-1;i++){        
                sum = sum+matrix[i][matrix.length-i];
                 
            }
           return sum; 
       } 
    public static boolean AreSameRows(int matrix[][]){       
        boolean areSame = true;
        int sum = 0;
        int reference = 0;
        int[] sums = new int[matrix.length];
        for (int i =0;i<matrix.length && areSame;i++){ 
            sum = 0;
            for(int j=0;j<matrix[i].length;j++){
                sum = sum+matrix[i][j];               
            }
            sums[i] = sum;
            /*
            if(i==0){
                reference = sum;
            }else{
                if(sum != reference){
                    areSame = false;
                }
            }
            */                
            }  
        int firstSum = sums[0];
        for(int i = 0;i<sums.length && areSame;i++){
            if(sums[i]!=firstSum){
                areSame = false;
            }
            
            }
        return areSame;
            
           
       } 
       
    
    
}
