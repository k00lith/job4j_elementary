package job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To1To5Then5() {
        int result = Max.max(3, 1, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax1To1To1To9Then9() {
        int result = Max.max(1, 1, 1, 9);
        assertThat(result, is(9));
    }
}
