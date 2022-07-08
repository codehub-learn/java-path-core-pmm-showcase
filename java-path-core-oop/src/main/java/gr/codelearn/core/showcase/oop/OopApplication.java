package gr.codelearn.core.showcase.oop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

public class OopApplication {
	private static final Logger logger = LoggerFactory.getLogger(OopApplication.class);
	public static void main(String[] args) {
		//This line prints hello world
		/*

		 */
		logger.info("Hello world");
		int intVar = 5;
		//Primitive boolean default value is false
		boolean boolVar = false;
		logger.info("The variable int: {} and the boolean: {}",intVar,boolVar);
		String strVar = "something";
		logger.info("The variable String",strVar.toUpperCase(Locale.ROOT));

		String name1 = "Giannis";
		String name2 = "Giannis";

		if (name1.equals(name2) && true || false){
			logger.info("The variables {} and {} are equal",name1,name2);
		}
		else if(name1.toUpperCase(Locale.ROOT).equals(name2.toUpperCase(Locale.ROOT))){
			logger.info("The variables {} and {} are equal with uppercase",name1,name2);
		}
		else {
			logger.info("The variables {} and {} are not equal",name1,name2);
		}
	}
}
