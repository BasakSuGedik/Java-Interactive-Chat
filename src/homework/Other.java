package homework;

public class Other {

	Question[] otherQuestions;

	public Other(Question[] otherQuestions) {
		this.otherQuestions = otherQuestions;
	}

	//Soruları yazma ve cevapların hangi soruya gideceğinin belirlenmesi
	public static Other fillQuestions() {
		Question[] otherQuestions = new Question[4];
		
		Answer[] otherQuestion1Answers = new Answer[3];
		otherQuestion1Answers[0] = new Answer("7",101);
		otherQuestion1Answers[1] = new Answer("8",102);
		otherQuestion1Answers[2] = new Answer("9",102);
		
		otherQuestions[0] = new Question(100, "I get up 7 am every morning. What time do you get up in the morning?", false, otherQuestion1Answers);
		
		Answer[] otherQuestion2Answers = new Answer[2];
		otherQuestion2Answers[0] = new Answer("Yes",111);
		otherQuestion2Answers[1] = new Answer("No",111);
		otherQuestions[1] = new Question(101, "I hate waking up when it is still dark outside. Do you hate it too?", false, otherQuestion2Answers);
		
		Answer[] otherQuestion3Answers = new Answer[2];
		otherQuestion3Answers[0] = new Answer("Yes they are",111);
		otherQuestion3Answers[1] = new Answer("No they are not",111);
		otherQuestions[2] = new Question(102, "My classes start very early in the mornings. Your classes are later I guess. ", false, otherQuestion3Answers);
		
		otherQuestions[3] = new Question(111, "I have classes everyday. You can find me on the 4th floor.", false, null);
		
		Other other = new Other(otherQuestions);
		return other;
	}
	
	public Question[] getOtherQuestions() {
		return otherQuestions;
	}

	public void setOtherQuestions(Question[] otherQuestions) {
		this.otherQuestions = otherQuestions;
	}

	public Question getFirstOtherQuestion() {
		return this.otherQuestions[0];
	}
	
	//Cevapların id lerine göre sonraki soruyu getirme
	public Question getOtherQuestionBy(int id) {
		int containIndex = 0;
		for (int i = 0; i < otherQuestions.length; i++) {
			if (otherQuestions[i].questionId == id) {
				containIndex = i;
			}
		}
		return otherQuestions[containIndex];
	}
}
