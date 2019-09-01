package ma.jobintech.sgcafe.domaine;

import javax.persistence.Entity;

@Entity
public class Serveur extends Employe {

	private String login;
	private String password;
	private Double totalCmd;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getTotalCmd() {
		return totalCmd;
	}

	public void setTotalCmd(Double totalCmd) {
		this.totalCmd = totalCmd;
	}

	public Serveur(Integer id, String nom, String prenom, String login, String password, Double totalCmd) {
		super(id, nom, prenom);
		this.login = login;
		this.password = password;
		this.totalCmd = totalCmd;
	}

	public Serveur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Serveur(Integer id, String nom, String prenom) {
		super(id, nom, prenom);
		// TODO Auto-generated constructor stub
	}

	public double encaissement(Commande commande) {

		double total = 0;
		return total;

	}
}
