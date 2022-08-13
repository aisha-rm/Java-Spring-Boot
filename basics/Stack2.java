import java.util.Stack;
/*
 1+2
 1+2*5
 */
public class Stack2 {

    //creating a method that calculates the expression within a string and returns an integer
    public static int calculator (String s){
        int len; // to store string length and make sure it is not empty
        if (s == null || (len = s.length()) == 0){   //len being assigned and compared
            return 0;
        }        
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';

        //iterating through the string
        for (int i = 0;  i < len; i++){
            if (Character.isDigit(s.charAt(i))){   //retrieve the char at the index and check if it is a digit
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) || i ==len-1){   //if its not a digit, it will be one of the below signs
                if (sign == '-'){
                    stack.push(-num);
                }
                if (sign == '+'){
                    stack.push(num);
                }
                if (sign == '*'){
                    stack.push(stack.pop() * num);
                }
                sign = s.charAt(i); //update sign as the char is not a digit
                num = 0; //reset number also
            }
        }

        int ans = 0;
        //System.out.println(stack);
        for (int n : stack){    //iterate through the numbers that were pushed to the stack and add them to ans
            ans += n;
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(calculator("1+2-8"));
    }
    
}
