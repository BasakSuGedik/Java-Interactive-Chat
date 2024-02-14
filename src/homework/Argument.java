package homework;

public class Argument {
	Question[] argumentQuestions;

	public Argument(Question[] argumentQuestions) {
		this.argumentQuestions = argumentQuestions;
	}

	//Soruları yazma ve cevapların hangi soruya gideceğinin belirlenmesi
	public static Argument fillQuestions() {
		Question[] argumentQuestions = new Question[3];
		
		Answer[] argumentQuestion1Answers = new Answer[4];
		argumentQuestion1Answers[0] = new Answer("Keçiören",411);
		argumentQuestion1Answers[1] = new Answer("Etimesgut",401);
		argumentQuestion1Answers[2] = new Answer("Çankaya",411);
		argumentQuestion1Answers[3] = new Answer("Pursaklar",411);
		argumentQuestions[0] = new Question(400, "It takes 1 hour to go to my school from my house. Where do you think i live in Ankara?", false, argumentQuestion1Answers);
		
		argumentQuestions[1] = new Question(401, "Yes correct. I live in Etimesgut.", false, null);
		argumentQuestions[2] = new Question(411, "Wrong choice. I live in Etimesgut.", false, null);

		Argument argument = new Argument(argumentQuestions);
		return argument;
	}
	
	public Question[] getArgumentQuestions() {
		return argumentQuestions;
	}

	public void setArgumentQuestions(Question[] argumentQuestions) {
		this.argumentQuestions = argumentQuestions;
	}

	public Question getFirstArgumentQuestion() {
		return this.argumentQuestions[0];
	}
	
	//Cevapların id lerine göre sonraki soruyu getirme
	public Question getArgumentQuestionBy(int id) {
		int containIndex = 0;
		for (int i = 0; i < argumentQuestions.length; i++) {
			if (argumentQuestions[i].questionId == id) {
				containIndex = i;
			}
		}
		return argumentQuestions[containIndex];
	}
}
