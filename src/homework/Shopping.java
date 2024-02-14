package homework;

public class Shopping {
	Question[] shoppingQuestions;

	public Shopping(Question[] shoppingQuestions) {
		this.shoppingQuestions = shoppingQuestions;
	}

	//Soruları yazma ve cevapların hangi soruya gideceğinin belirlenmesi
	public static Shopping fillQuestions() {
		Question[] shoppingQuestions = new Question[3];
		
		Answer[] shoppingQuestion1Answers = new Answer[2];
		shoppingQuestion1Answers[0] = new Answer("Yes I know",201);
		shoppingQuestion1Answers[1] = new Answer("No I don't",201);
		shoppingQuestions[0] = new Question(100, "I usually go to Armada for shopping. Do you know Armada?", false, shoppingQuestion1Answers);
		
		Answer[] shoppingQuestion2Answers = new Answer[4];
		shoppingQuestion2Answers[0] = new Answer("Bershka",211);
		shoppingQuestion2Answers[1] = new Answer("Zara",211);
		shoppingQuestion2Answers[2] = new Answer("Stradivarius",211);
		shoppingQuestion2Answers[3] = new Answer("Pull&Bear",211);
		shoppingQuestions[1] = new Question(201, "What is your favourite brand to shop?", false, shoppingQuestion2Answers);
		
		shoppingQuestions[2] = new Question(211, "There's a New Year's discount. We should go shopping together.", false, null);
		
		Shopping shopping = new Shopping(shoppingQuestions);
		return shopping;
	}
	
	public Question[] getShoppingQuestions() {
		return shoppingQuestions;
	}

	public void setShoppingQuestions(Question[] shoppingQuestions) {
		this.shoppingQuestions = shoppingQuestions;
	}

	public Question getFirstShoppingQuestion() {
		return this.shoppingQuestions[0];
	}
	
	//Cevapların id lerine göre sonraki soruyu getirme
	public Question getShoppingQuestionBy(int id) {
		int containIndex = 0;
		for (int i = 0; i < shoppingQuestions.length; i++) {
			if (shoppingQuestions[i].questionId == id) {
				containIndex = i;
			}
		}
		return shoppingQuestions[containIndex];
	}
}
