package it.noware.mycv;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The {@link Project} class is used to store the project's description and the
 * tecnologies used to create it. 
 * 
 * @author Ivan Di Paola
 *
 */
public class Project implements Serializable {

	private static final long serialVersionUID = 1L;
	private String description;
	private List<String> tecnologies;
	public Project(String description) {
		super();
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getTecnologies() {
		return tecnologies;
	}
	public Project addTecnology(String tecnology) {
		if (tecnologies==null) {
			tecnologies = new ArrayList<String>();
		}
		tecnologies.add(tecnology);
		return this;
	}
	@Override
	public String toString() {
		return "Project [description=" + description + ", tecnologies=" + tecnologies + "]";
	}

}
