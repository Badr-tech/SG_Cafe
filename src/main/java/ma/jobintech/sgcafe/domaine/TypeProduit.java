package ma.jobintech.sgcafe.domaine;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypeProduit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idtypePdt;
	private String libele;
	@OneToMany(fetch = FetchType.LAZY)
	private Produit produit;

	public Integer getIdtypePdt() {
		return idtypePdt;
	}

	public void setIdtypePdt(Integer idtypePdt) {
		this.idtypePdt = idtypePdt;
	}

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}

	public TypeProduit(Integer idtypePdt, String libele) {
		super();
		this.idtypePdt = idtypePdt;
		this.libele = libele;
	}

	public TypeProduit() {
		super();
		// TODO Auto-generated constructor stub
	}

}
