package ma.jobintech.sgcafe.domaine;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idClient;
	@OneToMany(fetch = FetchType.LAZY)
	private Commande commande;
	
	
	public Integer getIdClient() {
		return idClient;
	}
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	public Client(Integer idClient, Commande commande) {
		super();
		this.idClient = idClient;
		this.commande = commande;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void commander(Commande commande) {
		
	}

}
