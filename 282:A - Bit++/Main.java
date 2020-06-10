import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int n = Integer.parseInt( sc.nextLine() );
        int x = 0;

        for( int i = 0; i < n; i++ ) {
            String o = sc.nextLine();
            if ( o.indexOf("+") >= 0 ) {
                x++;
            } else if ( o.indexOf("-") >= 0 ) {
                --x;
            }
        }
        System.out.println( x );
    }
}