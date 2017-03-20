package it.noware.mycv;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Class used to store a work experience.
 * 
 * @author Ivan Di Paola
 *
 */
public class WorkExperience implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date from;
	private Date to;
	private String company;
	private String role;
	private List<Project> projects; 
	
	public WorkExperience() {
		super();
	}
	public WorkExperience(String from, String to, String company, String role) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    this.from = sdf.parse(from);
	    this.to = sdf.parse(to);
		this.company = company;
		this.role = role;
	}
	public WorkExperience(Date from, Date to, String company, String role) {
		super();
		this.from = from;
		this.to = to;
		this.company = company;
		this.role = role;
	}
	@Override
	public String toString() {
		return "WorkExperience [from=" + Util.parse(from) + ", to=" + Util.parse(to) + ", company=" + company + ", role=" + role + ", projects="
				+ projects + "]";
	}
	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public Date getTo() {
		return to;
	}
	public void setTo(Date to) {
		this.to = to;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
}
