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

        // now we will add all the values that can be used to change us dollars to any specific currency chosen from among the given choices
        double usConversionForCAD = 0.74;
        double usConversionForEUR = 1.04;
        double usConversionForINR = 0.012;
        double usConversionForJPY = 0.0099;

        double jpyConversionForUS = 136.64;
        double jpyConversionForCAD = 100.56;
        double jpyConversionForINR = 1.67;
        double jpyConversionForEUR = 143.41;

        double eurConversionForUS = 0.95;
        double eurConversionForCAD = 0.70;
        double eurConversionForINR = 0.012;
        double eurConversionForJPY = 0.0070;

        double cadConversionForUS = 1.36;
        double cadConversionForEUR = 1.43;
        double cadConversionForINR = 0.017;
        double cadConversionForJPY = 0.0099;

        double inrConversionForUS = 81.89;
        double inrConversionForCAD = 60.24;
        double inrConversionForEUR = 85.96;
        double inrConversionForJPY = 0.60;
        

        if (currencyType == convertTo) {
            System.out.println("Sorry the currency types you selected are same. Please select a different currency");
        } else if ((currencyType == "CAD") && (convertTo == "USD")) {
            double ansForCadToUsd = 1/usConversionForCAD;
            System.out.println(ansForCadToUsd);
        }
         else if ((currencyType == "CAD") && (convertTo == "USD")) {
            double ansForEURToUsd = 1/usConversionForEUR;
            System.out.println(ansForEURToUsd);
        }
        else if ((currencyType == "CAD") && (convertTo == "USD")) {
            double ansForINRToUsd = 1/usConversionForINR;
            System.out.println(ansForINRToUsd);
        }
        else if ((currencyType == "CAD") && (convertTo == "USD")) {
            double ansForJPYToUsd = 1/usConversionForJPY;
            System.out.println(ansForJPYToUsd);
        }
    }
}