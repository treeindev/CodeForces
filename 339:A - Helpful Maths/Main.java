import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        String[] n = sc.nextLine().split("\\+");

        Arrays.sort( n );
        
        for( int i = 0; i < n.length; i++ ) {
            if ( i != 0 ) {
                System.out.print( "+" );
            }
            System.out.print( n[i] );
        }

        System.out.println();
    }
}