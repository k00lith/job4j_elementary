package job4j.array;

import org.junit.Test;
import ru.job4j.array.Turn;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2, 8};
        int[] result = Turn.back(input);
        int[] expect = new int[] {8, 2, 6, 1, 4};
        assertThat(result, is(expect));
    }
}
