package conditional.nestedifstmts;

public class Prog1 {
    public static void main(String[] args) {
        int i=0;

        if(i>0)
        {
            if(i>1)
            {
                if(i>10)
                {
                   if(i>20)
                   {
                       if(i==25)
                       {
                           System.out.println("number is 25");
                       }
                   }
                }
            }

        }
        else{
            System.out.println("number you entered is either 0 or negative");
        }
    }
}
