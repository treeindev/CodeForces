import java.util.*;

public class Main {
    public static void main( String[] arg ) {
        Scanner sc = new Scanner( System.in );
        int a = Integer.parseInt( sc.nextLine() );
        String[] cs = sc.nextLine().split(" ");
        int[] c = new int[ a ];
        
        for ( int i = 0; i < a; i++ ) {
            c[i] = Integer.parseInt( cs[i] );
        }

        Arrays.sort( c );
        int n = 0;
        int t = 0;

        for ( int i = c.length - 1; i >= 0; i-- ) {
            int s = 0;
            t = t + c[i];
            n++;

            for ( int x = 0; x < i; x++ ) {
                s = s + c[x];
            }

            if ( t > s ) {
                break;
            }
        }

        System.out.println( n );
    }
}