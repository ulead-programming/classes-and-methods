import java.math.*;
public class QuadraticEquation {


    public static double computeSquareRootOf(double number){
        return Math.sqrt(number);
    }

    public static double computeDiscriminantFor(double a, double b, double c){
        return Math.pow(b, 2) - 4*a*c;
    }

    public static double computeSquareRootForDiscriminant(double a, double b, double c){
        return computeSquareRootOf(computeDiscriminantFor(a, b, c));
    }

    public static String createDisplayMessageForDiscriminant(double a, double b, double c){
        return "Discriminant of a="+ a + " b=" + b + " c=" + c + " [Square Root Of Discriminant]: " +
                computeSquareRootForDiscriminant(a, b, c);
    }

    public static String createRealRootDisplayMessage(double a, double b, double c){
        return "For a=" + a + " b=" + b + " c=" + c + " X0 = " +
                computeRealRootCaseFor(a, b, c, false) + " X1 = " +
                computeRealRootCaseFor(a, b, c, true);
    }

    public static double computeRealRootCaseFor(double a, double b, double c, boolean secondCase){
        double realRootResult = 0.0;
        if(!secondCase){
            realRootResult = (((-1) * b) - computeSquareRootForDiscriminant(a, b, c)) / 2*a;
        }
        else {
            realRootResult = (((-1) * b) + computeSquareRootForDiscriminant(a, b, c)) / 2*a;
        }
        return realRootResult;
    }



    public static void main(String[] args){
        System.out.println(createRealRootDisplayMessage(6, 11, -35));
        System.out.println(createRealRootDisplayMessage(2, -4, -2));
        System.out.println(createRealRootDisplayMessage(-4, -7, 12));
    }

}
