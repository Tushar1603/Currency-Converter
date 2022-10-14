import java.util.Scanner;

class currencyConverter {
    public static void main(String[] args) {

        // currencyType is the currency type that is being converted.
        // convertTo is the currency type that it will be converted to.
        // amt is the amount that will be converted.


        // thsi will ask the user to give an amount that they want to convert from.
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the currency you want to convert");
        System.out.println("CAD, USD, INR, EUR, JPY");
        String currencyType = sc.nextLine();
        System.out.println("You selected" + currencyType);


        // this will ask the user to select a currency type that the user want to
        // convert that currency to.
        Scanner sd = new Scanner(System.in);
        System.out.println("Select the currency you want to convert to");
        System.out.println("CAD, USD, INR, EUR, JPY");
        String convertTo = sd.nextLine();
        System.out.println("You want to convert " + currencyType + " " + "to " + convertTo);


        // this will ask the user about the amount he/she wants to convert
        Scanner sr = new Scanner(System.in);
        System.out.println("Please enter the amount you want to convert.");
        Integer amt = sr.nextInt();
        System.out.println("You selected" + amt);

        // now we will add all the values that can be used to 
        double usConversionForCAD = 0.73;

        if (currencyType == convertTo) {
            System.out.println("Sorry the currency type you selected are same. Please select a different currency");
        } else if ((currencyType == "CAD") && (convertTo == "USD")) {

        }
    }
}