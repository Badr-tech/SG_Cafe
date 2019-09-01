package ma.jobintech.sgcafe.domaine;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProduit;
	private String libele;
	@ManyToOne(fetch = FetchType.LAZY)
	private TypeProduit type;
	private Double prix;
	private Integer quantite;

	public Integer getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}

	public TypeProduit getType() {
		return type;
	}

	public void setType(TypeProduit type) {
		this.type = type;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public Produit(Integer idProduit, String libele, TypeProduit type, Double prix, Integer quantite) {
		super();
		this.idProduit = idProduit;
		this.libele = libele;
		this.type = type;
		this.prix = prix;
		this.quantite = quantite;
	}

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

}
