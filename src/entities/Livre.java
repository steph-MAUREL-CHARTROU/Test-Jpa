package entities;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 
 * @author StephanieMC
 *
 */
@Entity
@Table(name = "livre")

public class Livre {

	@Id
	 private int id;
	
	@Column(name= " titre")
	private String titre;
	
	@Column( name="auteur")
	private String auteur;
	
	@ManyToMany
	@JoinTable( name="compo",
	   joinColumns = @JoinColumn( name ="id_liv", referencedColumnName="id"),
	   inverseJoinColumns=@JoinColumn(name="id_emp", referencedColumnName=" id")
	   )
	
	// plusieurs livres ont plusieurs emprunts et inversement ( relation n, n)
	private Set<Emprunt> emprunts = new HashSet<Emprunt>();
	
	

	public Livre() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return " Livre : N° id " + id + " " +" ' "  + titre + " '  // " + auteur;
	}

	

}
