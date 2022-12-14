package ma.fstt.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "carburants")
@XmlAccessorType (XmlAccessType.FIELD)
public class Carburants {
	 @XmlElement(name = "carburant")
	  private List<Carburant> car= new ArrayList<Carburant>() ;
	 
	  public List<Carburant> getCar() {
	    return car;
	  }
	 
	  public void setCar(List<Carburant> employees) {
	    this.car = employees;
	  }

	public int size() {
		
		return this.car.size();
	}

}
