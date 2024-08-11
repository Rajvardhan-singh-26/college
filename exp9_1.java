/*Write a program for the following 
•	Read all elements from ArrayList by using Iterator.
•	Create duplicate object of an ArrayList instance.
•	Reverse ArrayList content.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
import java.util.Collection;
public class exp9_1{
    public static void main (String args []){
        ArrayList<String>arrayList = new ArrayList<String>();
        arrayList.add("Shyam");
        arrayList.add("Ram");
        arrayList.add("Radha");
        arrayList.add("Sita");
        Iterator itr = arrayList.iterator();
        System.out.println("Original list : "); 
        while(itr.hasNext()){
            
            System.out.println(itr.next());
        }
        ArrayList<String> duplicateList = new ArrayList<>(arrayList);
        System.out.println("Duplicate list : "); 
        System.out.println( duplicateList); 
        System.out.println("reverse list : "); 
        for (int i = arrayList.size() - 1; i >= 0; i--) 
        { 
            System.out.println( arrayList.get(i)); 
        } 
    }
}
