/*3.	Write a program for the following HashSet

•	copy another collection object to HashSet object.
•	delete all entries at one call from HashSet
•	search user defined objects from HashSet */
import java.util.*;
class exp9_3{
public static void main(String args[]){
HashSet<String> set=new HashSet<String>();
set.add("Ravi");
set.add("Vijay");
set.add("Ajay");
set.add("Gaurav");
Iterator<String> i=set.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
set.clear();
 System.out.println("HashSet after clearing: " + set);

HashSet<String> set2 = new HashSet<String>();
set2.add("Ravi1");
set2.add("Vijay2");
set2.add("Ajay3");
        System.out.println("HashSet after clearing: " + set2);
         Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value : ");
        String value = scanner.nextLine();
        if (set2.contains(value)) {
            System.out.println("Key " + value + " exists in the HashMap.");
        }
        else {
            System.out.println("Does not exist");

        }
        

        }
}


