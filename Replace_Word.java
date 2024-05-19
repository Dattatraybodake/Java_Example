package string;

public class Replace_Word {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is test"); // StringBuffer instance
        
        System.out.println("Before Replace: " + sb); // Printing the original StringBuffer
        sb.replace(5, 7, "not");
        System.out.println("After Replace: " + sb); // Printing the StringBuffer after replacement
    }
}
