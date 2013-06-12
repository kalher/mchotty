import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: Jamie
 * Date: 12/06/13
 * Time: 16:34
 * To change this template use File | Settings | File Templates.
 */
public class MeterTest {

    @Test
    public void unit_length(){

        Meter meter = new Meter(6);

        assertThat(meter.toString(), is("6m"));
    }
}
