import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        String[] g = sc.nextLine().split("");
        int d = 0;
        String t = "";

        for ( String p : g ) {
            if ( p.equals(t) ) {
                d++;
                if ( d >= 6 ) {
                    System.out.println("YES");
                    System.exit(0);
                }
            } else {
                d = 0;
                t = p;
            }
        }
        
        System.out.println("NO");
    }
}