
package demojava;
public class String1 {
   public static void main(String[] args) {
        String s = "hello miracle software systems";
        String[] s1 = s.split(" ");
        String s2 = "";
        for (int i = 0; i < s1.length; i++) {
       s2 = s2 + " " + Character.toUpperCase(s1[i].charAt(0)) + s1[i].substring(1);         
        }
        System.out.println(s2);
       
      // System.out.println(s3);
    }
}
