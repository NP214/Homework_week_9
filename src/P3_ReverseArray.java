public class P3_ReverseArray {
    /*
     Write a Java program to reverse an array of integer values.
     */
    public static void main(String[] args) {
    int []p = new int []{21,25,10,4};
        System.out.println("Original array :");
        for(int a = 0; a<p.length; a++){
            System.out.println(p[a]);
        }
        System.out.println();
        System.out.println("Array in reverse order :");
        for(int a = p.length -1; a>=0; a--){
            System.out.println(p[a]);
        }
}
}
