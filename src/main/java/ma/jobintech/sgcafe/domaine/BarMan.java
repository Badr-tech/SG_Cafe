package ma.jobintech.sgcafe.domaine;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
public class BarMan extends Employe {
	@OneToOne(fetch = FetchType.LAZY)
	private MachineCafe machineCafe;
	public BarMan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean informerRealisation(Integer idCmd) {

		return false;

	}
}
