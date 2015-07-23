package org.apache.commons.lang3.mutable;

import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rigel on 7/23/15.
 */
public class DubuMutableTest {


    @Test
    public void testMuta(){

        String a =  new String("A");
        String b=  new String("A");

        Map c = new HashMap<String, Object>();
        Map d = new HashMap<String, Object>();


        MutableObject<String> mutNumA = new MutableObject<String>("");

        MutableObject<String> mutNumB = new MutableObject<String>("");

        if(a == b)  ;


        if(c == d)  ;

        if(mutNumA  ==  mutNumB) ;

        Assert.assertEquals(mutNumA, mutNumB);

        if(mutNumA.getValue().hashCode() == mutNumB.getValue().hashCode()) ;




    }
}
