package ma.fstt.persistence;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "stations")
@XmlAccessorType (XmlAccessType.FIELD)
public class Stations 
{
  @XmlElement(name = "station")
  private List<Station> employees = null;
 
  public List<Station> getEmployees() {
    return employees;
  }
 
  public void setEmployees(List<Station> employees) {
    this.employees = employees;
  }

public int size() {
	
	return this.employees.size();
}

public Station get(int i) {
	return this.employees.get(i);
	
}
}