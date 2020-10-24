public class Main {


    /**
     *
     * @param firstNumber
     * @param secondNumber
     * @return
     */
    public static int addTwoNumbers(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    } // METHOD ADD TWO NUMBERS ENDS

    /**
     * This function requires an amount of money without tax and it computes the
     * total amount plus a tax of 14%
     * @param amount the amount without taxes
     * @return the total amount with taxes
     */
    public static double computeAmountPlusIVATax(double amount){
        return amount * (1 + 0.14);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args){

        int result = addTwoNumbers(10, 45); // 0xFFEF002
        System.out.println(result);

        for(int initialAmount = 1000; initialAmount  < 2000; ++initialAmount){
            double amountWithTaxes = computeAmountPlusIVATax(initialAmount);
            System.out.println("Amount + taxes is: " + amountWithTaxes);
        }

    }

}
