package ma.fstt.persistence;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Carburant")
@XmlRootElement(name = "carburant")
@XmlAccessorType (XmlAccessType.FIELD)
public class Carburant implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id_carb;
	@Column(length = 255, nullable = true)
	private String nom;
	@Column(length = 255, nullable = true)
	private String description;
	
	
	@OneToMany(mappedBy="Carburant",fetch=FetchType.LAZY)
	private Collection<HistoCarb> histocarb;
	
	
	
	public Collection<HistoCarb> getHistocarb() {
		return histocarb;
	}
	public void setHistocarb(Collection<HistoCarb> histocarb) {
		this.histocarb = histocarb;
	}
	public Long getId_carb() {
		return id_carb;
	}
	public Carburant(Long id_carb, String nom, String description) {
		super();
		this.id_carb = id_carb;
		this.nom = nom;
		this.description = description;
	}
	public void setId_carb(Long id_carb) {
		this.id_carb = id_carb;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Carburant() {
		super();
	}
	
}
