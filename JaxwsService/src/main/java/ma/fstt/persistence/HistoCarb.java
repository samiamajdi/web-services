package ma.fstt.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HistoCarb")
public class HistoCarb implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idhistocarb;
	@Column(length = 255, nullable = true)
	private String date;
	@Column(length = 255, nullable = true)
	private float prix;
	public HistoCarb() {
		super();
	}
	@ManyToOne
	@JoinColumn(name="stat_id") 
	private Station station;
	@ManyToOne
	@JoinColumn(name="carb_id") 
	private Carburant carburant;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Station getStation() {
		return station;
	}
	public void setStation(Station station) {
		this.station = station;
	}
	public Carburant getCarburant() {
		return carburant;
	}
	public void setCarburant(Carburant carburant) {
		this.carburant = carburant;
	}
	public HistoCarb(String date, float prix, Station station, Carburant carburant) {
		super();
		this.date = date;
		this.prix = prix;
		this.station = station;
		this.carburant = carburant;
	}
	
	
	
}
