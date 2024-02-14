package homework;
import java.util.Scanner;  
//Başak Su Gedik 21118080072
public class main{

	public static void main(String[] args) {
		Activity myActivities = new Activity();
		Scanner userInput = new Scanner(System.in);
		String userInputString;
		Question question = myActivities.getQuestion0();
		question.printQuestion();
		
		//Girilen inputa göre id bulma
		do {
            userInputString= userInput.nextLine();
    		//System.out.println("Userselection: " + userInputString);
    		if (question.doAnswersContain(userInputString)) {
    			int id = question.getAnswerId(userInputString);
    			//System.out.println("Go to next Question ID" + id);
    			//Eğer id 0 ise ilk soruyu getirme
    			if (id == 0) {
    				question = myActivities.getQuestion0();
    				question.printQuestion();
    			} else {
    				//Soruları idlerine göre ekrana yazdırma ve sonraki soruyu getirme
    				if (id%100 == 0) {
    					question = myActivities.selectActivity(id);
    					question.printQuestion();
    					question.isAsked = true;
    				} else {
    					question = myActivities.getNextQuestionBy(id);
    					question.printQuestion();
    					question.isAsked = true;
    				}
    			}//Son soru kontrolü
    			if (question.isEndQuestion) {
    				question = myActivities.getQuestion0();
    				question.printQuestion();
    			}//Exit dendiğinde programı bitirme
    		} else if (userInputString.toLowerCase().contains("exit")) {
    			System.out.println("Exiting the program!");
    		} else {//Input kontrolü
    			System.out.println("Wrong Input ask the same question");
    			question.printQuestion();
    		}
        } while (!userInputString.toLowerCase().contains("exit"));

		userInput.close();

	}

}
