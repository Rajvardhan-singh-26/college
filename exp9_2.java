/*2.	Write a program for the following HashMap

•	find whether specified key exists or not.
•	find whether specified value exists or not
•	get all keys from the given HashMap
•	get all key-value pair as Entry objects
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class exp9_2 {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Ram");
        hashMap.put("B", "Shyam");
        hashMap.put("C", "Shiv");
        hashMap.put("D", "Radhey");
        hashMap.put("E", "Sita");
        hashMap.put("F", "Gauri");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the Key : ");
        String Key = scanner.next();
        if (hashMap.containsKey(Key)) {
            System.out.println("Key '" + Key + "' exists in the HashMap.");
        }
        else{
            System.out.println("Does not exist");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element : ");
        String value = sc.next();
        if (hashMap.containsValue(value)) {
            System.out.println("Value '" + value
             + "' exists in the HashMap.");
        }
        else{
            System.out.println("Does not exist");
        }
        System.out.println("Iterating Hashmap...");
        System.out.println("all Keys are ");
for(Map.Entry m : hashMap.entrySet()){
System.out.println(" "+m.getKey());

    }
    System.out.println("key-value pair as Entry objects");
    for(Map.Entry m : hashMap.entrySet()){
    System.out.println(m.getKey()+" "+m.getValue());
}
    }
}