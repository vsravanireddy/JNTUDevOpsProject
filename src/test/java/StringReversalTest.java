import org.junit.jupiter.api.Test;


public class StringReversalTest {

    @Test
    public static void main(String[] args) {
        String str = "This is my project for JNTU";
        String reversedStr = stringReversal(str);
        System.out.println("Given String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }

    public static String stringReversal(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}


