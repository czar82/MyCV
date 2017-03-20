package it.noware.mycv;

import java.io.Serializable;

/**
 * Class used to store known languages.
 * 
 * @author Ivan Di Paola
 *
 */
public class Language implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private LanguageLevel understanding;
	private LanguageLevel speaking;
	private LanguageLevel writing;
	
	
	public Language() {
		super();
	}
	public Language(String name, LanguageLevel understanding, LanguageLevel speaking, LanguageLevel writing) {
		super();
		this.name = name;
		this.understanding = understanding;
		this.speaking = speaking;
		this.writing = writing;
	}
	/**
	 * Create a language with same level of understanding, speaking and writing.
	 * 
	 * @param name		Language name.
	 * @param level		Language level.
	 */
	public Language(String name, LanguageLevel level) {
		this(name, level, level, level);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LanguageLevel getUnderstanding() {
		return understanding;
	}
	public void setUnderstanding(LanguageLevel understanding) {
		this.understanding = understanding;
	}
	public LanguageLevel getSpeaking() {
		return speaking;
	}
	public void setSpeaking(LanguageLevel speaking) {
		this.speaking = speaking;
	}
	public LanguageLevel getWriting() {
		return writing;
	}
	public void setWriting(LanguageLevel writing) {
		this.writing = writing;
	}
	@Override
	public String toString() {
		return "Language [name=" + name + ", understanding=" + understanding + ", speaking=" + speaking + ", writing="
				+ writing + "]";
	}
}
