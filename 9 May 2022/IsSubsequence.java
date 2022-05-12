import java.util.Scanner;
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int sidx = 0, sedx = s.length();
        int tidx = 0, tedx = t.length();
        while(sidx < sedx && tidx < tedx) {
            if(s.charAt(sidx) == t.charAt(tidx))
                sidx++;
            tidx++;
        }
        return sidx == sedx;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        String t=scanner.next();
        System.out.println(isSubsequence(s,t));
    }
}
