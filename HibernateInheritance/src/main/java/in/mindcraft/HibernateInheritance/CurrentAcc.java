package in.mindcraft.HibernateInheritance;

import javax.persistence.Entity;

@Entity
public class CurrentAcc extends Account {
	private int overLimit;

	public int getOverLimit() {
		return overLimit;
	}

	public void setOverLimit(int overLimit) {
		this.overLimit = overLimit;
	}
	
	
}
