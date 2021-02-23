package entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author StephanieMC
 *
 */

@Entity
@Table(name = " emprunt")
public class Emprunt {

	@Id
	private int Id;

	@Column(name = "date_debut")
	private Date date_debut;

	@Column(name = "date_fin")
	private Date date_fin;

	@Column(name = "delai")
	private int delai;

	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;

	@ManyToMany
	@JoinTable(name = "compo", joinColumns = @JoinColumn(name = "id_emp", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_liv", referencedColumnName = " id"))

	// plusieurs livres ont plusieurs emprunts et inversement ( relation n, n)
	private Set<Livre> livres = new HashSet<Livre>();

	public Emprunt() {

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public int getDelai() {
		return delai;
	}

	public void setDelai(int delai) {
		this.delai = delai;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Emprunt [Id=" + Id + ", date_debut=" + date_debut + ", date_fin=" + date_fin + ", delai=" + delai
				+ ", id_client=" + client + "]";
	}

}
