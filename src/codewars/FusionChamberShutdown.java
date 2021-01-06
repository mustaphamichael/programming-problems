package codewars;/*
 * @created - 06/01/2021
 * @project - programming-problems
 * @author  - Michael Mustapha
 */

public class FusionChamberShutdown {

    public static void main(String[] args) {
        burner(45, 12, 100);
    }

    public static int[] burner(int c, int h, int o) {
        // H20
        int water = Math.min(h / 2, o);
        h = h - water * 2;
        o = o - water;

        // CO2
        int carbonDioxide = Math.min(c, o / 2);
        c = c - carbonDioxide;

        // CH4
        int methane = Math.min(c, h / 4);
        System.out.printf("%d, %d, %d", water, carbonDioxide, methane);

        return new int[]{water, carbonDioxide, methane};
    }
}
