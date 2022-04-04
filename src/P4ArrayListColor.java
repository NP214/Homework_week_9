import java.util.ArrayList;

public class P4ArrayListColor {
    /*Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop
     */
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
colours.add("Blue");
colours.add("Black");
colours.add("White");
colours.add("Red");
colours.add("Pink");

// for each loop gives colour name list
        for(String colorlist:colours){
            System.out.println(colorlist);
        }
    }
}