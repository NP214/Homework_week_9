import java.util.ArrayList;
import java.util.Iterator;

public class P5_Iterator {
    /*
    Write a Java program to iterate through all elements in an array list using
Iterator
     */
    // For Iterator must use Set ans HasSet
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("JIRA");
        list.add("Postman");
        list.add("IntelliJ");
        list.add("Selenium");

// iterate by "Iterator" interface
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
