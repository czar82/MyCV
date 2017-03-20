package it.noware.mycv;

/**
 * Languages classification levels.
 * 
 * @author Ivan Di Paola
 *
 */
public enum LanguageLevel {
	BASIC("A1"), 
	BEGINEER("A2"), 
	INTERMEDIATE("B1"), 
	GOOD("B2"), 
	EXPERT("C1"), 
	EXCELLENT("C2"),
	MOTHER_TONGUE("Mother tongue");
	private String europeanLanguageLevel;
	
	private LanguageLevel(String europeanLanguageLevel)
	{
		this.europeanLanguageLevel = europeanLanguageLevel;
	}
	
	public String getEuropeanLanguageLevel() {
		return this.europeanLanguageLevel;
	}
	
}
