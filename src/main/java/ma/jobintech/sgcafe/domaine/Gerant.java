package ma.jobintech.sgcafe.domaine;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Gerant extends Employe {
	@Column(length = 30)

	private String login;
	private String password;

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

	public Gerant(Integer id, String nom, String prenom, String login, String password) {
		super(id, nom, prenom);
		this.login = login;
		this.password = password;
	}

	public Gerant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerant(Integer id, String nom, String prenom) {
		super(id, nom, prenom);
		// TODO Auto-generated constructor stub
	}

}
