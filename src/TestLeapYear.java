import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestLeapYear
{
    LeapYearCalculator leapYearCalculator;

    @Before
    public void init()
    {
        leapYearCalculator = new LeapYearCalculator();
    }

    @Test
    public void testValidLeapYear() {
        assertThat(leapYearCalculator.isLeapYear(1996), is(true));
        assertThat(leapYearCalculator.isLeapYear(2000), is(true));
    }

    @Test
    public void testNotLeapYear() {
        assertThat(leapYearCalculator.isLeapYear(1900), is(false));
        assertThat(leapYearCalculator.isLeapYear(2017), is(false));


    }
}
