package JAXB;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JAXBTest2 {

    public static void main(String[] args) throws JAXBException {

        Museum simpleMuseum = new Museum();
        simpleMuseum.setName("Simple Museum");
        simpleMuseum.setCity("Santa Coloma de Gramanete, Spain");
        simpleMuseum.setChildrenAllowed(true);

        Museum anotherSimpleMuseum = new Museum();
        anotherSimpleMuseum.setName("Another Simple Museum");
        anotherSimpleMuseum.setCity("Barcelona, Spain");
        anotherSimpleMuseum.setChildrenAllowed(false);

        Museums listOfMuseums = new Museums();
        listOfMuseums.add(simpleMuseum);
        listOfMuseums.add(anotherSimpleMuseum);

        JAXBContext jaxbContext = JAXBContext.newInstance(Museums.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(listOfMuseums, new File("simple.xml"));
        jaxbMarshaller.marshal(listOfMuseums, System.out);
    }
}
