package it.noware.mycv;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class contains a main. You can run it to see my Json formatted CV.
 * 
 * @author Ivan Di Paola
 *
 */
public class ReadMe {

	public final static SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
	public final static String TODAY = SDF.format(new Date());

	public static void main(String[] args) throws Exception {
		IvanDiPaola ivan = IvanDiPaola.INSTANCE;

		//************************************************************************
		//							WORK AT ALMAVIVA SPA
		//************************************************************************
		WorkExperience almaviva = new WorkExperience("01/12/2010", TODAY, "Almaviva", "Software Engineer");
		
		List<Project> almavivaProjects = new ArrayList<Project>();
		Project restPortInterface = new Project("Analysis, design and development of a JavaEE application used to handle "
				+ "all the REST communications of all web applications of AGEA Agriculture information system.");
		restPortInterface.addTecnology("JavaEE").addTecnology("REST").addTecnology("Json").addTecnology("Jersey").addTecnology("jdbc")
		.addTecnology("Ant").addTecnology("Jenkins").addTecnology("Weblogic").addTecnology("Oracle SQL").addTecnology("Eclipse");
		almavivaProjects.add(restPortInterface);
		
		Project otp = new Project("Improvement of an EJB 2.0 for generation and validation of OTP, One Time Password through SMS.");
		otp.addTecnology("EJB 2.0").addTecnology("JavaEE").addTecnology("REST").addTecnology("Json");
		almavivaProjects.add(otp);
		
		Project ruc = new Project("Java library to handle writing, reading, searching and downloading of Alfresco documents for all "
				+ "applications the AGEA.");
		ruc.addTecnology("Alfresco").addTecnology("Alfresco cmis query language");
		almavivaProjects.add(ruc);
		
		Project ismea = new Project("Analysis and developing from scratch of a Spring MVC application used for interacting between AGEA and Ismea.");
		ismea.addTecnology("Spring MVC").addTecnology("Thymeleaf").addTecnology("jquery").addTecnology("HTML5").addTecnology("css3").addTecnology("Maven");
		almavivaProjects.add(ismea);
		
		Project app = new Project("REST back-end services for the mobile app 'AGEA aiuti in agricoltura', available on apple store and play store.");
		app.addTecnology("Gson").addTecnology("JavaEE").addTecnology("REST").addTecnology("Json");
		almavivaProjects.add(app);
		
		Project ldap = new Project("Analysis, design, development, and deployment of new JavaEE web application to handle the users "
				+ "registration and the accesses management to the applications and utilities of the Italian Forensic Police.");
		ldap.addTecnology("Struts 2").addTecnology("JSP").addTecnology("Hibernate").addTecnology("JavaEE").addTecnology("C Language").addTecnology("Mozilla LDAP C SDK").addTecnology("Tomcat 6").addTecnology("mySQL");
		almavivaProjects.add(ldap);
		
		Project inpdap = new Project("INPDAP web portal");
		inpdap.addTecnology("Struts 1").addTecnology("EJB 2.1").addTecnology("Adobe Form Design").addTecnology("Jasper Report").addTecnology("JavaEE").addTecnology("JSP");
		almavivaProjects.add(inpdap);

		almaviva.setProjects(almavivaProjects);
		ivan.addWorkExperience(almaviva);
		
		
		//************************************************************************
		//							WORK AS INDIE DEVELOPER
		//************************************************************************				
		WorkExperience indieDeveloper = new WorkExperience("01/01/2013", TODAY, "Indie developer", "Android developer");

		List<Project> indieProjects = new ArrayList<Project>();
		Project dipaologna = new Project("Dipaologna is an app to entertain the guest at my wedding. "
				+ "In the restaurant, the user scan the QR-Code placed on the seats and had to find his name in a Word Search Game, and solve other games."
				+ "The game is currently under development but will be soon available here: "
				+ "https://play.google.com/store/apps/details?id=com.noware.dipaologna");
		dipaologna.addTecnology("Android SDK").addTecnology("GIMP");
		indieProjects.add(dipaologna);

		Project quizConcorsi = new Project("QuizConcorsi. The app allows the user to exercise with multiple-choice tests. "
				+ "The user can share the questions on Facebook, search on Google for difficult questions and much other. "
				+ "https://play.google.com/store/apps/developer?id=Noware+Studios");
		quizConcorsi.addTecnology("Android SDK").addTecnology("SQLite").addTecnology("Facebook SDK");
		indieProjects.add(quizConcorsi);

		Project almaMobile = new Project("AlmaMobile. The app allows the user to login to the intranet of AlmavivA company and access to his time card. "
				+ "The app was not endorsement in any way from AlmavivA company, don't use any specific webservice, it just parse the HTML data from web pages to the app.");
		almaMobile.addTecnology("Android SDK").addTecnology("jsoup");
		indieProjects.add(almaMobile);
		
		
		indieDeveloper.setProjects(indieProjects);
		ivan.addWorkExperience(indieDeveloper);
		
		
		//************************************************************************
		//							WORK AT SEVENTH SENSE SRL
		//************************************************************************
		WorkExperience seventhSense = new WorkExperience("01/04/2008", "01/10/2008", "7th Sense Studios s.r.l.", "Games developer");

		List<Project> seventhSenseProjects = new ArrayList<Project>();
		Project criminologyDS = new Project("Criminology DS. Point and click game for Nintendo DS. "
				+ "I developed 4 minigames for this worldwide selled game. "
				+ "In outsourcing for White Birds Productions (publisher Nobilis).");
		criminologyDS.addTecnology("C Language").addTecnology("Nintendo DS Hardware").addTecnology("Codewarrior IDE");
		seventhSenseProjects.add(criminologyDS);

		Project internship = new Project("Tetris clone for PC & porting to Nintendo DS. R-Type clone for PC.");
		internship.addTecnology("C Language").addTecnology("SDL graphics library").addTecnology("Nintendo DS Hardware").addTecnology("NetBeans IDE").addTecnology("Codewarrior IDE");
		seventhSenseProjects.add(internship);
		
		seventhSense.setProjects(seventhSenseProjects);
		ivan.addWorkExperience(seventhSense);
		
		
		//************************************************************************
		//							EDUCATIONS
		//************************************************************************
		Education oracle1z0 = new Education("Oracle", "19/06/2013", null, "Oracle Certified Expert, Java Platform, EE 6 Web Component Developer, 1Z0-899.", null);
		Education oracle310 = new Education("Oracle", "30/05/2011", null, "Oracle Certified Professional, Java SE 6 Programmer certification, 310-065.", null);
		Education degree = new Education("Università di Palermo", "01/09/2005", "27/07/2010", 
				"Master degree in computer science. Robotic, Artificial Vision and Image processing specialization", "110/110");
		
		ivan.addEducation(oracle1z0).addEducation(oracle310).addEducation(degree);

		
		//************************************************************************
		//							LANGUAGES
		//************************************************************************
		Language italian = new Language("Italian", LanguageLevel.MOTHER_TONGUE);
		Language english = new Language("English", LanguageLevel.EXPERT, LanguageLevel.EXPERT, LanguageLevel.GOOD);
		Language spanish = new Language("Spanish", LanguageLevel.BEGINEER, LanguageLevel.BASIC, null);
		Language german = new Language("German", LanguageLevel.BASIC, null, null);
		ivan.addLanguages(italian).addLanguages(english).addLanguages(spanish).addLanguages(german);

		
		//************************************************************************
		//							HOBBIES
		//************************************************************************
		ivan.addHobby("Beach Volley").addHobby("Android developing").addHobby("History").addHobby("Strategy video games");
		
		
		System.out.println(ivan.getJson());
	}

}
