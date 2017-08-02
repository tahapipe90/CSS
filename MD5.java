import java.security.*;
import java.math.*;
import java.util.*;

public class MD5 {
    public static void main(String args[]) throws Exception{
        String s;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string for MD5");
        s=sc.nextLine();
        MessageDigest m=MessageDigest.getInstance("MD5");
        m.update(s.getBytes(),0,s.length());
        System.out.println("Byte: "+s.getBytes());
        System.out.println("MD5: "+new BigInteger(1,m.digest()).toString(16));
        System.out.println("MD5: "+new BigInteger(1,m.digest()).toString(16).length());
    }
}
