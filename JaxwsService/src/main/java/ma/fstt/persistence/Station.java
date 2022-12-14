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
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Station")
@XmlRootElement(name = "station")
@XmlAccessorType (XmlAccessType.FIELD)
public class Station  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id_stat;
	public Station(Long id_stat, String nom, String ville, String adresse) {
		super();
		this.id_stat = id_stat;
		this.nom = nom;
		this.ville = ville;
		this.adresse = adresse;
	}
	@Column(length = 255, nullable = true)
	private String nom;
	@Column(length = 255, nullable = true)
	private String ville;
	@Column(length = 255, nullable = true)
	private String adresse;
	
	
	@OneToMany(mappedBy="Station",fetch=FetchType.LAZY)
	private Collection<HistoCarb> histoCarb;
	
	
	
	public Station(long id_stat, String nom, String ville, String adresse, Collection<HistoCarb> histoCarb) {
		super();
		this.id_stat = id_stat;
		this.nom = nom;
		this.ville = ville;
		this.adresse = adresse;
		this.histoCarb = histoCarb;
	}
	public Collection<HistoCarb> getHistoCarb() {
		return histoCarb;
	}
	public void setHistoCarb(Collection<HistoCarb> histoCarb) {
		this.histoCarb = histoCarb;
	}
	public Station() {
		super();
	}
	
	public Long getId_stat() {
		return id_stat;
	}
	public void setId_stat(Long id_stat) {
		this.id_stat = id_stat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
}
