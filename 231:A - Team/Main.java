import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        String n = sc.nextLine();
        int s = 0;

        for( int i = 0; i < Integer.parseInt( n ); i++ ) {
            int w = 0;
            String[] p = sc.nextLine().split("\\s+");
            for ( String k : p ) {
                if ( Integer.parseInt( k ) == 1 ) {
                    w++;
                    if ( w == 2 ) {
                          s++;
                    }
                }
            }
        }
        System.out.println( s );
    }
}