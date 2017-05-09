package org.newtutorials.java.xml.jaxb.marshall;

import org.newtutorials.java.xml.jaxb.pojo.Address;
import org.newtutorials.java.xml.jaxb.pojo.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.Arrays;

/**
 * Created by daniel.g on 09/05/2017.
 */
public class JaxbMarshallExample {
    public static void main(String[] args) throws JAXBException {
        testMarshall();

    }

    public static String testMarshall() throws JAXBException {
        User anUser = new User();
        anUser.setId(1l);
        anUser.setFirstName("MyFirstName");
        anUser.setLastName("MyLastName");
        anUser.setAddresses(Arrays.asList(new Address("London", "I have No ideea", "a street")));
        JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(anUser,stringWriter);
        System.out.println(stringWriter);
        return stringWriter.toString();
    }
}
