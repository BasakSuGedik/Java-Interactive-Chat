package homework;

public class Food {
	Question[] foodQuestions;

	public Food(Question[] foodQuestions) {
		this.foodQuestions = foodQuestions;
	}

	//Soruları yazma ve cevapların hangi soruya gideceğinin belirlenmesi
	public static Food fillQuestions() {
		Question[] foodQuestions = new Question[4];
		
		Answer[] foodQuestion1Answers = new Answer[2];
		foodQuestion1Answers[0] = new Answer("Yes",601);
		foodQuestion1Answers[1] = new Answer("No",602);
		foodQuestions[0] = new Question(600, "I always have lunch at school. Do you like the food in our school cafeteria?", false, foodQuestion1Answers);
		
		Answer[] foodQuestion2Answers = new Answer[2];
		foodQuestion2Answers[0] = new Answer("Yes i can",611);
		foodQuestion2Answers[1] = new Answer("No i can't",611);
		foodQuestions[1] = new Question(601, "I always struggle finding seats in the cafeteria. Do you find seats easily ?", false, foodQuestion2Answers);
		
		foodQuestions[2] = new Question(611, "We can eat together this Tuesday if you want.", false, null);
		foodQuestions[3] = new Question(602, "You should give another try.", false, null);
		
		Food food = new Food(foodQuestions);
		return food;
	}
	
	public Question[] getFoodQuestions() {
		return foodQuestions;
	}

	public void setFoodQuestions(Question[] foodQuestions) {
		this.foodQuestions = foodQuestions;
	}

	public Question getFirstFoodQuestion() {
		return this.foodQuestions[0];
	}
	
	//Cevapların id lerine göre sonraki soruyu getirme
	public Question getFoodQuestionBy(int id) {
		int containIndex = 0;
		for (int i = 0; i < foodQuestions.length; i++) {
			if (foodQuestions[i].questionId == id) {
				containIndex = i;
			}
		}
		return foodQuestions[containIndex];
	}
}