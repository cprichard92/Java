package dayFour;

import java.io.IOException;
import java.util.Properties;

/**
 * Configuration is much better w/ Properties files
 * @author yru289
 *
 */
public class PropertiesFileExample {
	
	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		props.load(
				PropertiesFileExample.class
				.getClassLoader()
				.getResourceAsStream("application.properties")
		); // load resources from classpath (src folder) with Classloader
		String google = (String) props.getProperty("url");
		System.out.println(google);
	}

}
