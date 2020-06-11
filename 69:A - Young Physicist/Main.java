import java.util.*;

public class Main {
    public static void main( String[] arg ) {
        Scanner sc = new Scanner( System.in );
        int n = Integer.parseInt( sc.nextLine() );
        int[] e = {0, 0, 0};

        for( int i = 0; i < n; i++ ) {
            String[] v = sc.nextLine().split( "\\s+" );
            e[0] = e[0] + Integer.parseInt( v[0] );
            e[1] = e[1] + Integer.parseInt( v[1] );
            e[2] = e[2] + Integer.parseInt( v[2] );
        }

        if ( e[0] == 0 && e[1] == 0 && e[2] == 0 ) {
            System.out.println( "YES" );
        } else {
            System.out.println( "NO" );
        }
    }
}