import java.util.*;

public class Main {
    public static void main( String[] arg ) {
        Scanner sc = new Scanner( System.in );
        int n = Integer.parseInt( sc.nextLine() );

        while ( n-- > 0 ) {
            String[] s = sc.nextLine().split(" "); 
            String[] a = sc.nextLine().split(" ");
            int t = 0;
            
            for( int i = 0; i < a.length; i++ ) {
                t = t + Integer.parseInt( a[i] ) % 2;
            }

            if ( 
                t == 0 ||
                ( Integer.parseInt( s[0] ) - t == 0 && Integer.parseInt( s[1] ) % 2 == 0) ||
                ( Integer.parseInt( s[0] ) == Integer.parseInt( s[1] ) && t % 2 == 0 )
            ) {
                System.out.println( "No" );
            } else {
                System.out.println( "Yes" );
            }
        }
    }
}