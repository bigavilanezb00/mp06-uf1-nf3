package JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.time.LocalDate;


public class JAXBTest3 {

    public static void main(String[] args) throws JAXBException {

        Museum simpleMuseum = new Museum();
        simpleMuseum.setName("Simple Museum");
        simpleMuseum.setCity("Santa Coloma de Gramanete, Spain");
        simpleMuseum.setChildrenAllowed(true);
        simpleMuseum.setFrom(LocalDate.of(2023, 1, 1));

        Museum anotherSimpleMuseum = new Museum();
        anotherSimpleMuseum.setName("Another Simple Museum");
        anotherSimpleMuseum.setCity("Barcelona, Spain");
        anotherSimpleMuseum.setChildrenAllowed(false);
        simpleMuseum.setFrom(LocalDate.of(2022, 2, 2));

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
