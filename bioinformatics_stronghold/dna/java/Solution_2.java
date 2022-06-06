import java.util.Scanner;

public class Solution_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert a DNA string of lenght at most 1000 nt:");
        String dna_str = s.nextLine().toLowerCase();
        int a = (int) dna_str.chars().filter(ch -> ch == 'a').count();
        int c = (int) dna_str.chars().filter(ch -> ch == 'c').count();
        int g = (int) dna_str.chars().filter(ch -> ch == 'g').count();
        int t = (int) dna_str.chars().filter(ch -> ch == 't').count();
        System.out.printf("%d %d %d %d\n", a, c, g, t);
        s.close();
        System.gc();
    }
}
