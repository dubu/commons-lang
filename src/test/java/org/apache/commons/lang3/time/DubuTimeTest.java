package org.apache.commons.lang3.time;

import com.sun.javafx.binding.StringFormatter;
import org.junit.Test;

import java.text.Format;
import java.util.Date;
import java.util.Formatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by rigel on 7/17/15.
 */
public class DubuTimeTest {

    @Test
    public void testFormat() {

        assertTrue(true);
        String aa = "Af";
        String.format("ddd %s", aa);

        Formatter fmt = new Formatter();
        String out = fmt.format("hello %s" , "world").toString();
        assertEquals("hello world" , out);
    }

    @Test
    public void testHashSingleton(){

//
//        String.format("ddd %s", "hi");
//        String.format("ddd %s", "hi");
//        String.format("ddd %s", "hi");


        Date date =  new Date();
        String a1 = String.format("yyyy-MM-dd", date);
        String a2 = String.format("yyyy-MM-dd", date);
        String a3 = String.format("yyyy-MM-dd", date);
        String a4 = String.format("yyyy-MM-dd", date);

        String b1 =  FastDateFormat.getInstance("yyyy-MM-dd").format(date);
        String b2 =FastDateFormat.getInstance("yyyy-MM-dd").format(date);
        String b3 = FastDateFormat.getInstance("yyyy-MM-dd").format(date);

        Format c1  = FastDateFormat.getInstance("yyyy-MM-dd");
        Format c2  = FastDateFormat.getInstance("yyyy-MM-dd");
        Format c3  = FastDateFormat.getInstance("yyyy-MM-dd");

        Formatter d1 = new Formatter();
        Formatter d2 = new Formatter();
        Formatter d3 = new Formatter();

        assertEquals(c1, c2);
        assertEquals(c2, c3);
        assertEquals(c3, c1);

        assertNotEquals(d1, d2);
        assertNotEquals(d2, d3);
        assertNotEquals(d1, d3);

    }


}
