package entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author StephanieMC
 *
 */

@Entity
@Table ( name = "client")

public class Client {
	
	@Id
	private int id;
	
	@Column ( name = " nom")
	private String nom;
	
	@Column ( name = " prenom")
	private String prenom;

	public Client() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Client :" + id + " // NOM : " + nom + " //  PRENOM : " + prenom;
	}
	
	
	

}
