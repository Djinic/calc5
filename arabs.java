package calc;

import com.sun.jdi.Value;

public class arabs {
   static String[] q;
   public   arabs(String[] t) {
        this.q = t;
    }
   public static String arab() {
        int number_one = Integer.parseInt(q[0]);
        int number_two = Integer.parseInt(q[2]);

        if (Integer.parseInt(q[0]) > 10 || Integer.parseInt(q[2]) > 10){
            throw new IllegalArgumentException("Enter the numbers from 1 to 10");
        }

       int result =0;
            if (q[1].equals("-")) {
                result= number_one - number_two;
                return String.valueOf(result);
            } else if (q[1].equals("+")) {
                result= number_one + number_two;
                return String.valueOf(result);
            } else if (q[1].equals("*")) {
                result= number_one * number_two;
                return String.valueOf(result);
            } else if (q[1].equals("/")) {
                result= number_one / number_two;
                return String.valueOf(result);



            } else {
                throw new IllegalArgumentException("the format of the mathematical operation does not satisfy the task - two operands and one operator");
            }


   }
}









