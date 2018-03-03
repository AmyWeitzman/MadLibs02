/**
 * @student.info
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, describe goals
 *<BR> Cite Sources:  People who helped, and/or websites used
 */

import java.util.Scanner; 
 
public class MadLibs02
{
	String name01;
	String place01;
	String adj01;
	String clothingItem;
	String verb01;
	String adj02;
	String adj03;
	String pluralNoun;
	String animal;
	String place02;
	String verb02;
	String food01;
	String bodyParts;
	int number01;
	int number02;
	String food02;
	String adj04;
	String noun;
	String name02;
	
	/*public MadLibs02()
	{
	
	}*/
	
	public void getWords()
	{
		Scanner Input = new Scanner(System.in);
		
		System.out.print("Enter a name --------> ");
		name01 = Input.next();
		System.out.print("Enter a place --------> ");
		place01 = Input.next();
		System.out.print("Enter an adjective --------> ");
		adj01 = Input.next();
		System.out.print("Enter a clothing item --------> ");
		clothingItem = Input.next();
		System.out.print("Enter a verb(-ing) --------> ");
		verb01 = Input.next();
		System.out.print("Enter an adjective --------> ");
		adj02 = Input.next();
		System.out.print("Enter an adjective --------> ");
		adj03 = Input.next();
		System.out.print("Enter a plural noun --------> ");
		pluralNoun = Input.next();
		System.out.print("Enter an animal --------> ");
		animal = Input.next();
		System.out.print("Enter a place --------> ");
		place02 = Input.next();
		System.out.print("Enter a verb(past tense) --------> ");
		verb02 = Input.next();
		System.out.print("Enter a food(singular) --------> ");
		food01 = Input.next();
		System.out.print("Enter a body part(plural) --------> ");
		bodyParts = Input.next();
		System.out.print("Enter a number(integer) --------> ");
		number01 = Input.nextInt();
		System.out.print("Enter a number(integer) --------> ");
		number02 = Input.nextInt();
		System.out.print("Enter a food --------> ");
		food02 = Input.next();
		System.out.print("Enter a word of degree(i.e. best, worst, happiest) --------> ");
		adj04 = Input.next();
		System.out.print("Enter a noun(singular) --------> ");
		noun = Input.next();
		System.out.print("Enter a name --------> ");
		name02 = Input.next();
	}
	
	public void printMadLib02()
	{
		System.out.println("Love Story");
		System.out.println("Dear " + name01 + ",");
		System.out.println("	I remember when we first met in/at " 
		+ place01 + ". You were wearing (a) " + adj01 + " " + clothingItem 
		+ " while " + verb01 +". You were so " + adj02 + " and " + adj03 
		+ ". You smelled like " + pluralNoun + 
		" and walked as gracefully as a/n " + animal 
		+ ". On our first date, we went to " + place02 
		+ " and " + verb02 + ". We shared a " + food01 + 
		" while holding each other's " + bodyParts + ". Then, " 
		+ number01 + " years later I asked you to marry me. There were " 
		+ number02 + " people at the wedding and we ate " 
		+ food02 + " flavored cake. It was the " + adj04 
		+ " day of my life. ");
		System.out.println("	Love your " + noun + ",");
		System.out.println("	" + name02);	
	}
	
}

/*
RUN OUTPUT:

*/