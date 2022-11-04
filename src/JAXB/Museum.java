package JAXB;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

@XmlRootElement(name = "MUSEUM")
public class Museum {

    String name;
    String city;

    Boolean childrenAllowed;

    LocalDate from;


    @XmlElement (name = "MUSEUM_NAME")
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @XmlElement (name = "CIUTAT")
    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @XmlAttribute(name = "children_allowed")
    public void setChildrenAllowed(Boolean childrenAllowed) {
        this.childrenAllowed = childrenAllowed;
    }

    public Boolean getChildrenAllowed() {
        return childrenAllowed;
    }

    public LocalDate getFrom() {
        return from;
    }

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlElement ( name = "FROM")
    public void setFrom(LocalDate from) {
        this.from = from;
    }



}
