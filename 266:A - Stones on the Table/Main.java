import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int n = Integer.parseInt( sc.nextLine() );
        String[] s = sc.nextLine().split("");
        int t = 0;
        String r = "";

        for( String st: s ) {
            if ( st.equals(r) ) {
                t++;
            }
            r = st;
        }

        System.out.println( t );
    }
}