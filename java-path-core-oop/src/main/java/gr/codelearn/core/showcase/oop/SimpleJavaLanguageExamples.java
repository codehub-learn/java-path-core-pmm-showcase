package gr.codelearn.core.showcase.oop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SimpleJavaLanguageExamples {
	private static final Logger logger = LoggerFactory.getLogger(SimpleJavaLanguageExamples.class);
	public void mainExamples(){
		//This line prints hello world
		/*

		 */
		logger.info("Hello world");
		int intVar = 5;
		//Primitive boolean default value is false
		boolean boolVar = false;
		logger.info("The variable int: {} and the boolean: {}",intVar,boolVar);
		String strVar = "something";
		logger.info("The variable String {}",strVar.toUpperCase(Locale.ROOT));

		String name1 = new String("Giannis");
		String name2 =  new String("Giannis");

		if (name1 == name2){
			System.out.println("they are equal");
		}
		if (name1.equals(name2) && true || false){
			logger.info("The variables {} and {} are equal",name1,name2);
		}
		else if(name1.toUpperCase(Locale.ROOT).equals(name2.toUpperCase(Locale.ROOT))){
			logger.info("The variables {} and {} are equal with uppercase",name1,name2);
		}
		else {
			logger.info("The variables {} and {} are not equal",name1,name2);
		}

		List<String> listStrings = new ArrayList<>();
		listStrings.add("Hello");
		listStrings.add("Hello 2");
		listStrings.add("Hello 3");

		for (int i = 0; i < listStrings.size(); i++) {
			if (i == 1){
				continue;
			}
			logger.info("For Loop - The value at index {} is {}",i,listStrings.get(i));
		}
		int i =0;
		while(i < listStrings.size()){
			logger.info("While Loop -The value at index {} is {}",i,listStrings.get(i));
			if (i==1)
				break;
			i++;
		}

		int counter = 0;

		logger.info("The value of counter is {}",counter++);
		logger.info("The value of counter is {}",++counter);
		counter = counter + 1;
		logger.info("The value of counter is {}",counter+=1);

		int dayOfWeek = 12;
		switch (dayOfWeek){
			case 1:
				logger.info("The day is Monday");
				break;
			case 2:
				logger.info("The day is Tuesday");
				break;
			default:
				logger.info("Not valid range of day");
				break;
		}

		logger.info("The random number is {}",randomNumber());
	}

	/**
	 *
	 * @return
	 */
	private Integer randomNumber(){
		double randomNum = Math.random();
		return randomNum > 0.5 ? 1 : 0;
	}

}
