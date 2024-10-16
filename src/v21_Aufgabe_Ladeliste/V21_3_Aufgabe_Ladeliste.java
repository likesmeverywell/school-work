package v21_Aufgabe_Ladeliste;

import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;

public class V21_3_Aufgabe_Ladeliste {
    public static void main(String[] args) {
        // gewichtsverteilung.
        out.println("Gewichtsverteilungs - rechner");
        out.println("Gib bis zu 12 Werte in Tonnen ein.");
        out.println("Fuer keinen weiteren Wert, einfach Enter Druecken.");

        int [][] plan = stauplan(); // in tonnen
        out.println("Stauplan: ");
        for (int i = 0; i < plan.length; i++) {
            out.println("Bay " + (i + 1) + ":");
            for (int j = 0; j < plan[i].length; j++) {
                out.print(plan[i][j] + "\t");
            }
            out.println();
        }
    }
    // private static int[][] init_negative(int[][] initMe) {
    //     for (int i = 0; i < initMe.length; i++) {
    //         for (int j = 0; j < initMe[i].length; j++) {
    //             initMe[i][j] = -1;
    //         }
    //     }
    //     return initMe;
    // }

    public static int[][] stauplan() {
        int[] inputs = new int[12];
        int[][] stauplan_array = new int[3][4];
//        Bubblesort sorter = new Bubblesort();
        // sorter.bubblesort(inputs);
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < 12) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            int inputs_int = Integer.parseInt(line); // generellen string input zu int, wenn kein leerzeichen
            inputs[count] = inputs_int;
            count++;
            out.println("input von Position " + count + " (mit dem Wert: " + inputs_int + ") war erfolgreich.");
        }
        scanner.close();

        inputs = Arrays.copyOf(inputs, count); // trim der ungenutzen arrayfelder von ehemalig 12
//        sorter.bubblesort(inputs);  // inputs[] is der random int input array

        int[] bayWeights = new int[3]; // total weight tracking in each bay

        for (int weight : inputs) {
            int mininumBay = 0;

            for (int i = 1; i < bayWeights.length; i++) {
                if ((bayWeights[i] < bayWeights[mininumBay] && stauplan_array[i][(stauplan_array[i].length -1)] == 0)) { // fix dafuer, dass
                    mininumBay = i;                                     // gewichtsverteilung im durchschnitt keine 5+te stelle anvisiert und ladungs-
                }                                                  // logik nicht einbehaellt von 3 zu 4
            }

            for (int j = 0; j < 4; j++) {
                if (stauplan_array[mininumBay][j] == 0) {
                    stauplan_array[mininumBay][j] = weight;
                    bayWeights[mininumBay] += weight;
                    break;

                }
            }
        }
        return stauplan_array;
    }
}



/*

Die LaLuSe GmbH will die Beladung ihrer COntainerschiffe automatisieren.
Die COntainer sollen auf die Bays und Tiers von COntainerschiffen so verteilt werden,
dass eine gute Gewichtsverteilung entsteht. Als Prototyp soll die Methode --- stauplan() ---
erstellt werden, die einen Stauplan fuer drei Bays mit jeweils vier Tiers ausgibt (Siehe Beispiel)

Folgende Angaben sind zu beruecksichtigen:
- Die drei Bays sind mit 1 bis 3, die vier Tiers mit 1 bis 4 nummeriert (Siehe Grafik).
- In jede Bay koennen bis zu vier Ocntainer gestapelt werden.
- Die Container werden nach absteigendem Gewicht verteilt: schwerster Container zuerst, leichtester zuletzt.
- Ein Container wird jeweils der Bay mit der geringsten Gewichtsbeladung zugewiesen.
- Der erste Container wird in Bay 1 gestaut.
- Sind alle Bays belegt oder keine Container mehr vorhanden, wird die Beladung abgebrochen.


*/

