package PiJExercises;

public class DayFive01 {
    public static void main(String[] args){

        Calculator cal = new Calculator();

        double resultSum = cal.add(2,8);
        System.out.println(resultSum);

        double resultSub = cal.subtract(25,8);
        System.out.println(resultSub);

        double resultMultiply = cal.multiply(25,2);
        System.out.println(resultMultiply);

        double resultDivide = cal.divide(25,6);
        System.out.println(resultDivide);

        double resultModula = cal.subtract(25,2);
        System.out.println(resultModula);
    }


}

class Calculator {


    public double add(int x, int y){
        return (double)x + (double)y;
    }

    public double subtract(int x, int y){
        return (double)x - (double)y;
    }

    public double multiply(int x, int y){
        return (double)x * (double)y;
    }

    public double divide(int x, int y){
        return (double)x / (double)y;
    }

    public double modulo(int x, int y){
        return (double)x % (double)y;
    }

}
