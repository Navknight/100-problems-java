import java.util.*;

public class String_decode {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isDigit(ch[i])) {
                String str = "";
                st.pop();
                while (st.peek() != ']')
                    str = str + st.pop();
                st.pop();
                String s1 = str;
                for (int k = 2; k <= Character.digit(ch[i], 10); k++) {
                    str = str + s1;
                }
                for (int j = str.length() - 1; j >= 0; j--)
                    st.add(str.charAt(j));
            } else
                st.add(ch[i]);
        }
        while (!st.empty())
            System.out.print(st.pop());
        sc.close();
    }
}