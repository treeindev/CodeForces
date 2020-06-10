import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] p = sc.nextLine().split("\\s+");
        
        int a = Integer.parseInt( p[0] ) * Integer.parseInt( p[1] );
        System.out.println( (int) a / 2 );
    }
}