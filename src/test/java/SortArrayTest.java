import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class SortArrayTest {

    @Test
    public void testSorting() {
        int [] arrayToSort = new int [] {89, 43, 15, 1, 12, 22, 67, 32, 56};
        Arrays.sort(arrayToSort);
        System.out.println("Elements of array sorted in ascending order: ");

        for (int i = 0; i < arrayToSort.length; i++)
        {
            System.out.println(arrayToSort[i]);
        }
    }
}




