import java.util.Scanner;

public class Solution_1 {
    private static int count(String str, char searched, int idx) {
        if(idx >= str.length()) {
            return 0;
        }
        return (str.charAt(idx) == searched ? 1 : 0) + count(str, searched, idx + 1);
    }

    public static int count(String str, char searched) {
        return count(str, searched, 0);
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Insert a DNA string of lenght at most 1000 nt:");
        String dna_str = s.nextLine().toLowerCase();
        int a = count(dna_str, 'a');
        int c = count(dna_str, 'c');
        int g = count(dna_str, 'g');
        int t = count(dna_str, 't');
        System.out.printf("%d %d %d %d\n", a, c, g, t);
        s.close();
        System.gc();

    }
}