package org.apache.commons.lang3.math;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rigel on 7/22/15.
 */
public class DubuMathTest {

    final static String sadfafasdfads = new String("A");
    final static int max = 100;

    final static Map rs = new HashMap<String, Object>();

    @Test
    public void testPraction() throws Exception {
        rs.put("ASfd", "af");
        System.out.write(65);
    }

    @Test
    public void testNumberUtil(){

        float n  = 121.1f ;
        Double d = 32321d;
        Integer rs = NumberUtils.toInt(String.valueOf(n));

//        System.out.printf(String.valueOf(rs));


        int adf= Character.getNumericValue('b');
        System.out.printf(String.valueOf(adf));
    }


}
