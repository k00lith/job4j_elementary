package job4j.loop;

import org.junit.Test;
import ru.job4j.loop.CheckPrimeNumber;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(11);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(9);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }

    @Test
    public void when25() {
        boolean rsl = CheckPrimeNumber.check(25);
        assertThat(rsl, is(false));
    }
}