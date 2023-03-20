import org.junit.jupiter.api.Test;


public class StringCountTest {

    @Test
    public void  testStringCount() {
        String str = "This is my project for JNTU";
        System.out.println("Given String: " + str);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Number of characters in given String : " + count);
    }
}


