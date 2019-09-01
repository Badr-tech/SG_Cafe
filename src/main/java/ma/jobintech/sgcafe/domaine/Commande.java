package ma.jobintech.sgcafe.domaine;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer idCommande;
	private Produit listProduits;
	private boolean statut;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Client client;
	@ManyToOne(fetch = FetchType.LAZY)
	private MachineCafe machineCafe;

	public Integer getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Integer idCommande) {
		this.idCommande = idCommande;
	}

	public Produit getListProduits() {
		return listProduits;
	}

	public void setListProduits(Produit listProduits) {
		this.listProduits = listProduits;
	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	public Commande(Integer idCommande, Produit listProduits, boolean statut) {
		super();
		this.idCommande = idCommande;
		this.listProduits = listProduits;
		this.statut = statut;
	}

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double calculeCommande(Produit listProduit) {
		double montant = 0;

		return montant;

	}

	public List<Produit> listItemCommande(Produit listProduit) {
		List<Produit> listeProduit = new ArrayList<Produit>();
		return listeProduit;

	}

}
