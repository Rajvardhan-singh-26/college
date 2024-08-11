/* Create an exception class that throws an exception if the operand is non-numeric when 
calculating the modulus (using command line arguments). */
class modulus_Calculator{
    public static void main (String[]args){
       //try
        {
     
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a % b; 
        }
        /*catch (NumberFormateException e)*/
            System.out.println("Number Format Exception");
        }
        
    }
