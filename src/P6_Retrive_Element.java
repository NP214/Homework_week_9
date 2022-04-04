import java.util.ArrayList;

public class P6_Retrive_Element {
    /* Write a Java program to retrieve an element (at a specified index) from a given
array list
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("JIRA"); //0
        list.add("Postman"); //1
        list.add("IntelliJ"); //2
        list.add("Selenium"); //3

        // retrieve element
        System.out.println(list.get(2));

    }
}
