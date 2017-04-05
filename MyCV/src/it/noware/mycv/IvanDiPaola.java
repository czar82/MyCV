package it.noware.mycv;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

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
	private final Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").setPrettyPrinting().disableHtmlEscaping().registerTypeAdapter(IvanDiPaola.class, new IvanDiPaolaAdapter()).create();

	public List<WorkExperience> getWorkExperiences() {
		return workExperiences;
	}
	public IvanDiPaola addWorkExperience(WorkExperience workExperience) {
		if (workExperiences==null) {
			workExperiences = new ArrayList<WorkExperience>();
		}
		workExperiences.add(workExperience);
		return INSTANCE;
	}

	public List<Education> getEducations() {
		return educations;
	}
	public IvanDiPaola addEducation(Education education) {
		if (educations==null) {
			educations = new ArrayList<Education>();
		}
		educations.add(education);
		return INSTANCE;
	}

	public List<Language> getLanguages() {
		return languages;
	}
	public IvanDiPaola addLanguages(Language language) {
		if (languages==null) {
			languages = new ArrayList<Language>();
		}
		languages.add(language);
		return INSTANCE;
	}

	public List<String> getHobbies() {
		return hobbies;
	}
	public IvanDiPaola addHobby(String hobby) {
		if (hobbies==null) {
			hobbies = new ArrayList<String>();
		}
		hobbies.add(hobby);
		return INSTANCE;
	}

	@Override
	public String toString() {
		return "Ivan Di Paola\n\n" + workExperiences + "\n\n"+ educations + "\n\n" + languages;
	}

	private class IvanDiPaolaAdapter implements JsonSerializer<IvanDiPaola> {
		@Override
		public JsonElement serialize(IvanDiPaola src, Type typeOfSrc,
				JsonSerializationContext context)
		{
			JsonObject obj = new JsonObject();
			JsonParser parser = new JsonParser();
			obj.add("workExperience", parser.parse(gson.toJson(src.getWorkExperiences())) );
			obj.add("educations", parser.parse(gson.toJson(src.getEducations())) );
			obj.add("languages", parser.parse(gson.toJson(src.getLanguages())) );
			obj.add("hobbies", parser.parse(gson.toJson(src.getHobbies())) );
			return obj;
		}
	}
	
	public String getJson()
	{
		return gson.toJson(INSTANCE);
	}
}