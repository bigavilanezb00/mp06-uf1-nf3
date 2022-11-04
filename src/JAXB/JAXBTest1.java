package JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.MarshalException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JAXBTest1 {
    public static void main(String[] args) throws JAXBException, MarshalException {

        Museum simpleMuseum = new Museum();
        simpleMuseum.setChildrenAllowed(true);
        simpleMuseum.setName("Simple Museum");
        simpleMuseum.setCity("Santa Coloma de Gramanete, Spain");

        JAXBContext jaxbContext = JAXBContext.newInstance(Museum.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(simpleMuseum, new File("museum.xml"));
        jaxbMarshaller.marshal(simpleMuseum, System.out);
    }
}
