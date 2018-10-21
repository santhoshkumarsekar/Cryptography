import java.io.*;
import java.lang.*;

class GFG {
    
    static String Enc( String txt, String key ) {
        int i = 0, x = 0;
        String res = "";
        for(i = 0; i < txt.length(); i++ ) {
            x = x % key.length();
            char t = txt.charAt(i);
            int k = (int) key.charAt(x) - 65 ;
            while ( k > 0) {
                t++;
                k--;
               if( t > 90)
                 t = 'A';
            }
            res += (""+ (char) t);
            x++;
        }
        return res;
    }
    static String Dec( String cyb, String key ) {
    String txt = "";
    int x = 0;
    for( int i = 0; i < cyb.length(); i++ ) {
         x = x % key.length();
         char c = cyb.charAt(i);
         int k = (int) ( key.charAt(x) - 65);
         while( k > 0 ) {
             k--;
             c--;
             if( c < 65)
                c = 'Z';
         }
         txt  += ( "" + (char) c );
         x++;
    }
        return txt;
    }
	public static void main (String[] args) {
	    String txt = "hello";
	    String key = "hell";
	    txt = txt.toUpperCase();
	    key = key.toUpperCase();
	    String enc = Enc( txt, key );
	    System.out.println("the encrypted text is :" + enc);
	    System.out.println("the decrypted original text is :" + Dec( enc , key ) );
	}
}
