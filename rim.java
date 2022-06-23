package calc;

public class rim  {
    static String []y;
   static   String[] masRim;
    public   rim(String[] y,String[]masRim)
    {
        this.y=y;
        this.masRim=masRim;

    }

   public   String index() {


        int index = 0;
        int index2 = 0;
        for (int i = 0; i < masRim.length; i++) {
            if (y[0].equals(masRim[i]) ) {
                index = i;
            }
            if (y[2] .equals(masRim[i]) ) {
                index2 = i;
            }
        }
        int number = 0;
        if (y[1].equals("+")) {
            number = index + index2;
        }  if (y[1].equals("-")) {
            number = index - index2;
        } if (y[1].equals("*")) {
            number = index * index2;
        } if (y[1].equals("/")) {
            number = index / index2;

        }
        String result = "";
        for(int i=0; i<masRim.length; i++)
        {
            if(number==i)
            {
                result = masRim[i];
            }
            if (number<1) {
                throw new RuntimeException("The result should be positive");
            }
        }
        return result;
        }
    }



