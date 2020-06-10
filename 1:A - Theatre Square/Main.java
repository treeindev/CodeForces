import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split("\\s+");
        
        long v = (long) Math.ceil((double) Integer.parseInt( n[0] ) / Integer.parseInt( n[2] ) );
        long h = (long) Math.ceil((double) Integer.parseInt( n[1] ) / Integer.parseInt( n[2] ) );

        System.out.println( v * h );
    }
}