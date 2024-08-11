/*Write a Java program to display the names and roll numbers of 10 students. Initialize 
respective arrays for students. Handle the ArrayIndexOutOfBoundsException to prevent 
illegal termination of the program */
class exp7_1{
    public static void main(String[] args){
            String [] name = {"ram","shyam"};
            int [] rollno = {10,25};

         try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Name: " +name[i] + ", Roll Number: " + rollno[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
