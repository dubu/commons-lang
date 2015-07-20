package org.apache.commons.lang3.tuple;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import com.sun.xml.internal.stream.writers.XMLWriter;
import org.apache.commons.io.output.WriterOutputStream;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertTrue;

public class DubuTupleTest {

    @Test
    public void serializeTest() throws Exception{

        assertTrue(true);


        try {

            String targetWord = new String("HI");

            ByteOutputStream  bo  = new ByteOutputStream();
            ObjectOutputStream objectOutputStream =  new ObjectOutputStream(bo);
            objectOutputStream.write(targetWord.getBytes());

            //  ObjectOutputStream io = new ObjectOutputStream(new ByteInputStream(bo.getBytes(), "HI".getBytes().length))

            //ObjectInputStream  out = new ObjectInputStream(new ByteInputStream(bo.getBytes(),bo.getBytes().length));

            String   out = (String) new ObjectInputStream(new ByteInputStream(bo.getBytes(),bo.getBytes().length)).readObject();


            System.out.println(out);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    @Test
    public void testWrite(){


        try {

            String azsfda = "ASdf";
            FileWriter  fw = new FileWriter("a.txt");
            fw.write("Asfa");
            XMLWriter xmlWriter = new XMLWriter(fw);
            xmlWriter.write("saf");

            //WriterOutputStream writerOutputStream  = new WriterOutputStream(xmlWriter);
            WriterOutputStream writerOutputStream  = new WriterOutputStream(fw);

            writerOutputStream.write(azsfda.getBytes());

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(writerOutputStream);

            objectOutputStream.write("asdfa".getBytes());

            objectOutputStream.close();
            fw.close();



        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void TestSerialization () throws Exception{
        final String  origPair = "ASDFasdfasdf";
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream out = new ObjectOutputStream(baos);
        out.writeObject(origPair);
        final Object deserializedPair = new ObjectInputStream(
                new ByteArrayInputStream(baos.toByteArray())).readObject();

        System.out.println(deserializedPair);
    }

}
