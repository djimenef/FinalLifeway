package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Condition")
public class Condition implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCondition;

	@Column(name = "NCondition", nullable = false, length = 15)
	private String NCondition;

	public Condition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Condition(int idCondition, String nCondition) {
		super();
		this.idCondition = idCondition;
		this.NCondition = nCondition;
	}

	public int getIdCondition() {
		return idCondition;
	}

	public void setIdCondition(int idCondition) {
		this.idCondition = idCondition;
	}

	public String getNCondition() {
		return NCondition;
	}

	public void setNCondition(String nCondition) {
		NCondition = nCondition;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((NCondition == null) ? 0 : NCondition.hashCode());
		result = prime * result + idCondition;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Condition other = (Condition) obj;
		if (NCondition == null) {
			if (other.NCondition != null)
				return false;
		} else if (!NCondition.equals(other.NCondition))
			return false;
		if (idCondition != other.idCondition)
			return false;
		return true;
	}
	
	
	


}
