import java.util.*;

public class balanced_parentheses {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        while (t > 0) {
            String s = scn.nextLine();
            Stack<String> s1 = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{')
                    s1.push(String.valueOf(s.charAt(i)));
                if(s.charAt(i) == ')'){
                    if(!Objects.equals(s1.pop(), "(")){
                        System.out.println("NO");
                        break;
                    }
                }
                if(s.charAt(i) == ']'){
                    if(!Objects.equals(s1.pop(), "[")){
                        System.out.println("NO");
                        break;
                    }
                }
                if(s.charAt(i) == '}'){
                    if(!Objects.equals(s1.pop(), "{")){
                        System.out.println("NO");
                        break;
                    }
                }
                if(s1.isEmpty()){
                    System.out.println("YES");
                    break;
                }
            }

            t--;
        }
    }
}
