package v21_Aufgabe_Ladeliste;

public class PruefAlgorithmus {
    public static void main(String[] args) {
        // Testdaten
        StringBuilder cardNr1 = new StringBuilder("ID6258431979");
        StringBuilder cardNr2 = new StringBuilder("ID6258431970");

        // Aufruf der pruefeID()-Methode und Ausgabe der Ergebnisse
        boolean result1 = pruefeID(cardNr1);
        System.out.println("Card Number 1 is " + (result1 ? "valid" : "invalid"));

        boolean result2 = pruefeID(cardNr2);
        System.out.println("Card Number 2 is " + (result2 ? "valid" : "invalid"));
    }

    // Methode zur Überprüfung der Karten-ID
    public static boolean pruefeID(StringBuilder cardNr) {
        // Überprüfen, ob die Länge 12 ist und mit "ID" beginnt
        if (cardNr.length() != 12 || !cardNr.substring(0, 2).equals("ID")) {
            return false;
        }
        // "ID6258431979"
        // Extrahieren der ersten 10 Ziffern (nach dem Präfix "ID")
        String numberPart = cardNr.substring(2, 12);

        // Berechnung der Prüfziffer
        int sum = 0;
        // "625843197"     "9"
        int summeSchritt2=0;
        int summeSchritt3=0;
        for (int i = 0; i < 9; i++) {
            char c = numberPart.charAt(i);
            //System.out.print(c + " | ");
            if (!Character.isDigit(c)) {
                return false;
            }
            int digit = c - 48; //Character.getNumericValue(c);
            //System.out.print(digit + " | ");
            if (i % 2 == 0) {
                int schritt1= 2 * digit;
                //System.out.print( schritt1 +  " | ");

                int schritt2 = schritt1 / 10  + schritt1 % 10;
                summeSchritt2 += schritt2;
                //System.out.print( schritt2 +  " | ");   ;
            } else {
                //System.out.print(digit + " | ");
                summeSchritt3 += digit;
            }
            // sum += digit * (i + 1);
        }
        //System.out.println();
        //System.out.println("Schritt2 Summe :" +summeSchritt2);
        //System.out.println("Schritt3 Summe :" +summeSchritt3);

        int summeSchritt4 = summeSchritt2 + summeSchritt3;
        //System.out.println("Schritt4 Summe :" +summeSchritt4);
        System.out.println();
        int schritt5;
        if (summeSchritt4 % 10 > 0)
        {
            // 41 -> 4.1
            // 42 -> 4.2
            schritt5 =  (int) (10 * Math.ceil(summeSchritt4 / 10.0));
            //System.out.println();
        } else
            schritt5=summeSchritt4;

        int schritt6 =schritt5-summeSchritt4;
        //System.out.println("Prüfziffer: " + schritt6);

        //System.out.println(numberPart.charAt(9));

        //return schritt6 == Character.getNumericValue(numberPart.charAt(9));
        return schritt6 == numberPart.charAt(9) - 48;
    }
}
