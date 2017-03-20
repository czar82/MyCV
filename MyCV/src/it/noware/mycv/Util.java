package it.noware.mycv;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utility class.
 * 
 * @author Ivan Di Paola
 *
 */
public class Util {

	/**
	 * Parse a {@link Date} in the dd/MM/yyyy format.
	 * @param date	Date source.
	 * @return		A parsed string with the date.
	 */
	public static String parse(Date date)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if (date!=null)
			return sdf.format(date);
		return "---";
	}
}
