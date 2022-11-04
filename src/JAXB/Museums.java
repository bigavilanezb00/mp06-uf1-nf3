package JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement ( name = "MUSEUMS")
public class Museums {
    List<Museum> museums;

    @XmlElement (name = "MUSEUM")
    public void setMuseums (List<Museum> museums) {
        this.museums = museums;
    }

    public List<Museum> getMuseums() {
        return museums;
    }

    public void add (Museum museum ) {
        if (this.museums == null) {
            this.museums = new ArrayList<Museum>();
        }
        this.museums.add(museum);
    }

}
