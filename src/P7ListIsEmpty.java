import java.util.ArrayList;

public class P7ListIsEmpty {
    /* Write a Java program to test an array list is empty or not. Define array list with
underground tube names */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Bakerstreet");
        list.add("Great portland");
        list.add("Euston square");
        list.add("Kings cross");
        list.add("Warren Street");

        System.out.println(list.contains("Kings cross"));
        System.out.println(list.isEmpty());



    }
}
