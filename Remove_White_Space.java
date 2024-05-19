package string;
import java.util.StringTokenizer;

public class Remove_White_Space {
    public static void main(String [] args) {
        String str = "Dattatraya    Nathu   Bodake  "; // Input string with extra spaces
        
        StringTokenizer st = new StringTokenizer(str, " ");
        StringBuffer sb = new StringBuffer(); // StringBuffer to store the modified string
        
        while (st.hasMoreElements()) {
            sb.append(st.nextElement()).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
