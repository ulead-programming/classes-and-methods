import java.util.Scanner;

public class MatrixWithFunctions {

    public static String getCharacterFor(int rowNumber, int columnNumber, int matrixSize){
        String result = "\t 0";
        if((rowNumber == columnNumber) || (rowNumber + columnNumber == matrixSize - 1)){
            result = "\t 1";
        }
        return result;
    } // FUNCTION GET CHARACTER FOR ENDS

    public static int requestNumberToUser(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static String drawMatrix(int size){
        String matrix = "";
        for(int rows = 0; rows < size; ++rows){
            // Cada vez que este ciclo se ejecuta, estamos cambiando de linea,
            // puesto que este bloque construye el contenido de las filas
            String row = "";
            for(int columns = 0; columns < size; ++columns){
                row += getCharacterFor(rows, columns, size);
            } // FOR ENDS
            matrix += row + "\n";
        } // FOR ENDS
        return matrix;
    } // METHOD DRAW MATRIX


    public static void main(String[] args){
        System.out.println(drawMatrix(requestNumberToUser("Type the size of the matrix you want to draw: ")));
    } // MAIN ENDS

} // CLASS ENDS
