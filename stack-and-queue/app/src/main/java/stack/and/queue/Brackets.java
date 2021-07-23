package main.java.stack.and.queue;

import java.util.Stack;

public class Brackets {
    public boolean bracketsMatch(String brac)
    {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < brac.length(); i++)
        {
            char ch = brac.charAt(i);

            if ( ch == '[' || ch == '{' || ch == '(' )
            {
                stack.push(ch);
            }
            if (stack.isEmpty())
                return false;
            char ch2;
            switch (ch) {
                case ']':
                    ch2 = stack.pop();
                    if (ch2 == '(' || ch2 == '{')
                        return false;
                    break;
                case '}':
                    ch2 = stack.pop();
                    if (ch2 == '(' || ch2 == '[')
                        return false;
                    break;
                case ')':
                    ch2 = stack.pop();
                    if (ch2 == '{' || ch2 == '[')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
}
