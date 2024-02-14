package homework;

public class Entertainment {
	Question[] entertainmentQuestions;

	public Entertainment(Question[] entertainmentQuestions) {
		this.entertainmentQuestions = entertainmentQuestions;
	}

	//Soruları yazma ve cevapların hangi soruya gideceğinin belirlenmesi
	public static Entertainment fillQuestions() {
		Question[] entertainmentQuestions = new Question[6];
		
		Answer[] entertainmentQuestion1Answers = new Answer[3];
		entertainmentQuestion1Answers[0] = new Answer("Watching movies",313);
		entertainmentQuestion1Answers[1] = new Answer("Concert",302);
		entertainmentQuestion1Answers[2] = new Answer("Reading",303);
		entertainmentQuestions[0] = new Question(300, "I only have 1 class on Fridays. Usually I like to go to the cinema. What do you like to do in your spare time? ", false, entertainmentQuestion1Answers);
		
		Answer[] entertainmentQuestion2Answers = new Answer[4];
		entertainmentQuestion2Answers[0] = new Answer("Sci-fi",311);
		entertainmentQuestion2Answers[1] = new Answer("Romance",311);
		entertainmentQuestion2Answers[2] = new Answer("Horror",311);
		entertainmentQuestion2Answers[3] = new Answer("Non-fiction",311);
		entertainmentQuestions[1] = new Question(303, "I like reading sci-fi novels. What is your favourite genre?", false, entertainmentQuestion2Answers);

		Answer[] entertainmentQuestion3Answers = new Answer[4];
		entertainmentQuestion3Answers[0] = new Answer("Madrigal",311);
		entertainmentQuestion3Answers[1] = new Answer("Can Bonomo",311);
		entertainmentQuestion3Answers[2] = new Answer("Tarkan",311);
		entertainmentQuestion3Answers[3] = new Answer("Another artist",312);
		entertainmentQuestions[2] = new Question(302, "I went to the Adamlar's concert last Friday. It was amazing. Who is your favourite artist?", false, entertainmentQuestion3Answers);
		
		entertainmentQuestions[3] = new Question(313, "Let's go to the movies together this Friday.", false, null);
		entertainmentQuestions[4] = new Question(311, "I like them as well.", false, null);
		entertainmentQuestions[5] = new Question(312, "I remember. You have told me before.", false, null);
		
		Entertainment entertainment = new Entertainment(entertainmentQuestions);
		return entertainment;
	}
	
	public Question[] getEntertainmentQuestions() {
		return entertainmentQuestions;
	}

	public void setEntertainmentQuestions(Question[] entertainmentQuestions) {
		this.entertainmentQuestions = entertainmentQuestions;
	}

	public Question getFirstEntertainmentQuestion() {
		return this.entertainmentQuestions[0];
	}
	
	//Cevapların id lerine göre sonraki soruyu getirme
	public Question getEntertainmentQuestionBy(int id) {
		int containIndex = 0;
		for (int i = 0; i < entertainmentQuestions.length; i++) {
			if (entertainmentQuestions[i].questionId == id) {
				containIndex = i;
			}
		}
		return entertainmentQuestions[containIndex];
	}
}
