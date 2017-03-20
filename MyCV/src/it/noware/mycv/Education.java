package it.noware.mycv;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class used to store university degrees and certification.
 * 
 * @author Ivan Di Paola
 *
 */
public class Education implements Serializable {

	private static final long serialVersionUID = 1L;
	private String organisation;
	private Date from;
	private Date to;
	private String title;
	private String classification;
	
	public Education() {
		super();
	}
	public Education(String organisation, String from, String to, String title, String classification) throws ParseException {
		super();
		this.organisation = organisation;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    this.from = sdf.parse(from);
	    if (to!=null)
	    	this.to = sdf.parse(to);
		this.title = title;
		this.classification = classification;
	}
	public String getOrganisation() {
		return organisation;
	}
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	@Override
	public String toString() {
		return "Education [organisation=" + organisation + ", from=" + Util.parse(from) + ", to=" + Util.parse(to) + ", title=" + title
				+ ", classification=" + classification + "]";
	}
}
