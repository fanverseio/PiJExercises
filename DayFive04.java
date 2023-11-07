package PiJExercises;

import java.util.Arrays;
public class DayFive04 {
    public static void main(String[] args){

        Matrix matrix = new Matrix(5,5);

        System.out.println(matrix.toString());



    }




}

class Matrix{

    private int [][] data;

    private int rows, columns;

    public Matrix(int  rows, int cols){
        data = new int[rows][cols];

        for (int i =0;i<rows;i++){
            for (int j = 0;j<cols;j++){
                data[i][j] = 1;
            }
        }


        this.rows = rows;
        this.columns = cols;

    }

    public String toString (){
        String result = "[";
        for (int i = 0; i < rows;i++){
            for (int j = 0;j<columns;j++){
                result += data[i][j];
            if (j<columns-1){
                result += ",";
            } else if (i<rows-1){
                result += ";";
            }
            }
        }
        result += "]";


        return result;
    }

    public void setElement(int row,int col, int value){
        if (row >= 0 && row < rows && col >=0 && col < columns){
            data[row][col] = value;
        }
    }

    public void setRow (int rowNum, String str){

        String [] strToStringArr = str.split(",");
        if (rowNum > 0 && rowNum < rows && strToStringArr.length == columns){

            for (int i = 0; i<columns;i++){
                data[rowNum][i] = Integer.parseInt(strToStringArr[i]);
            }
        }
    }


}