package Basics.Stack;

import java.util.Stack;

/**
 * Created by uslabs on 9/12/17.
 */
public class EvaluateAStringUsingStack {
    public static void solution(){
        String s = "GeeksQuiz";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        System.out.println(sb);
    }
}
