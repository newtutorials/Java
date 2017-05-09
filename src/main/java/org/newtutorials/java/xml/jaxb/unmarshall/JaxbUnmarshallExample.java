package org.newtutorials.java.xml.jaxb.unmarshall;

import org.newtutorials.java.xml.jaxb.marshall.JaxbMarshallExample;
import org.newtutorials.java.xml.jaxb.pojo.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;

/**
 * Created by daniel.g on 09/05/2017.
 */
public class JaxbUnmarshallExample {
    public static void main(String[] args) throws JAXBException {
        String theXml = JaxbMarshallExample.testMarshall();
        JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        StringReader stringReader = new StringReader(theXml);
        User theUser = (User) jaxbUnmarshaller.unmarshal(stringReader);
        System.out.println(theUser);

        InputStream inputStream = new ByteArrayInputStream(theXml.getBytes());
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        User theUserAgain = (User) jaxbUnmarshaller.unmarshal(inputStreamReader);
        System.out.println(theUserAgain);

    }
}
