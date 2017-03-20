package it.noware.mycv;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.GsonBuilder;

/**
 * This is a singleton of myself, I've just an instance, no more me.
 * I'm not a simple boring and generic "Person" class.
 * Please don't treat me like an object, be kind to me!
 * 
 * @author Giuseppe Di Paola, Angela Di Raimondo, my parents! :)
 *
 */
public enum IvanDiPaola {
	INSTANCE;

	private List<WorkExperience> workExperiences;
	private List<Education> educations;
	private List<Language> languages;
	private List<String> hobbies;

	public List<WorkExperience> getWorkExperiences() {
		return workExperiences;
	}
	public IvanDiPaola addWorkExperience(WorkExperience workExperience) {
		if (workExperiences==null) {
			workExperiences = new ArrayList<WorkExperience>();
		}
		workExperiences.add(workExperience);
		return this;
	}

	public List<Education> getEducations() {
		return educations;
	}
	public IvanDiPaola addEducation(Education education) {
		if (educations==null) {
			educations = new ArrayList<Education>();
		}
		educations.add(education);
		return this;
	}

	public List<Language> getLanguages() {
		return languages;
	}
	public IvanDiPaola addLanguages(Language language) {
		if (languages==null) {
			languages = new ArrayList<Language>();
		}
		languages.add(language);
		return this;
	}

	public List<String> getHobbies() {
		return hobbies;
	}
	public IvanDiPaola addHobby(String hobby) {
		if (hobbies==null) {
			hobbies = new ArrayList<String>();
		}
		hobbies.add(hobby);
		return this;
	}

	@Override
	public String toString() {
		return "Ivan Di Paola\n\n" + workExperiences + "\n\n"+ educations + "\n\n" + languages;
	}
	
	public String getJson()
	{
		return new GsonBuilder().setDateFormat("dd/MM/yyyy").setPrettyPrinting().disableHtmlEscaping().create().toJson(workExperiences);
	}
}