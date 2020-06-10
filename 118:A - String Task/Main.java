import java.util.*;

public class Main {
    public static void main ( String[] arg ) {
        Scanner sc = new Scanner( System.in );
        String[] s = sc.nextLine().split("");
        String[] v = {"a","o","y","e","u","i"};
        String r = "";

        for( String l : s ) {
            l = l.toLowerCase();
            if ( !Arrays.stream(v).anyMatch( l::equals ) ) {
                r += "." + l;
            }
        }

        System.out.println( r );
    }
}