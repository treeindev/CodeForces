import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] p = sc.nextLine().split("\\s+");
        String[] s = sc.nextLine().split("\\s+");
        int n = 0;
        int t = Integer.parseInt( s[ Integer.parseInt( p[1] ) - 1 ] );
        
        for( String c : s ) {
            if ( Integer.parseInt(c) >= t && Integer.parseInt(c) > 0 ) {
                n++;
            }
            
        }
        
        System.out.println( n );
    }
}