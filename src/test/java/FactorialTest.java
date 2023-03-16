import org.junit.jupiter.api.Test;


public class FactorialTest {

    @Test
    public void testFactorial() {
        int number = 10;
            int result = 1;
            while(number != 0){
                result = result*number;
                number--;
            }

            System.out.print("Factorial of 10 is: " + result);
        }
    }



