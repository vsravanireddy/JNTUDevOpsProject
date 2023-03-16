import org.junit.jupiter.api.Test;


public class StringReversalTest {

    @Test

    public void  stringReversal() {
        String str = "This is my project for JNTU";
        System.out.println("Given String: " + str);

        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println("Reversed String: " + sb);
    }
}


