package job4j.array;

import org.junit.Test;
import ru.job4j.array.FindLoop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas7Then() {
        int[] input = {5, 4, 3, 2};
        int value = 7;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOfStartFinish(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindNo() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value = 9;
        int start = 2;
        int finish = 7;
        int result = FindLoop.indexOfStartFinish(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

}
