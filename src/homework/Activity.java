package homework;

public class Activity {
	Question activityQuestion;
	Food foodQuestion;
	Argument argumentQuestion;
	Game gameQuestion;
	Shopping shoppingQuestion;
	Entertainment entertainmentQuestion;
	Other otherQuestion;

	//Her aktivitenin id sini belirleme
	public Activity() {
		Answer[] activityQuestionAnswers = new Answer[6];
		activityQuestionAnswers[0] = new Answer("Food",600);
		activityQuestionAnswers[1] = new Answer("Game",500);
		activityQuestionAnswers[2] = new Answer("Argument",400);
		activityQuestionAnswers[3] = new Answer("Entertainment",300);
		activityQuestionAnswers[4] = new Answer("Shopping",200);
		activityQuestionAnswers[5] = new Answer("Other",100);
		Question activityQuestion = new Question(0, "-Choose an activity to get to know me?", false, activityQuestionAnswers);
		this.activityQuestion = activityQuestion;
		this.foodQuestion = Food.fillQuestions();
		this.argumentQuestion = Argument.fillQuestions();
		this.gameQuestion = Game.fillQuestions();
		this.shoppingQuestion = Shopping.fillQuestions();
		this.entertainmentQuestion = Entertainment.fillQuestions();
		this.otherQuestion = Other.fillQuestions();
	}

	public Question getActivityQuestion() {
		return activityQuestion;
	}

	public void setActivityQuestion(Question activityQuestion) {
		this.activityQuestion = activityQuestion;
	}

	public Food getFoodQuestion() {
		return foodQuestion;
	}

	public void setFoodQuestion(Food foodQuestion) {
		this.foodQuestion = foodQuestion;
	}

	public Argument getArgumentQuestion() {
		return argumentQuestion;
	}

	public void setArgumentQuestion(Argument argumentQuestion) {
		this.argumentQuestion = argumentQuestion;
	}

	public Game getGameQuestion() {
		return gameQuestion;
	}

	public void setGameQuestion(Game gameQuestion) {
		this.gameQuestion = gameQuestion;
	}

	public Shopping getShoppingQuestion() {
		return shoppingQuestion;
	}

	public void setShoppingQuestion(Shopping shoppingQuestion) {
		this.shoppingQuestion = shoppingQuestion;
	}

	public Entertainment getEntertainmentQuestion() {
		return entertainmentQuestion;
	}

	public void setEntertainmentQuestion(Entertainment entertainmentQuestion) {
		this.entertainmentQuestion = entertainmentQuestion;
	}

	public Other getOtherQuestion() {
		return otherQuestion;
	}

	public void setOtherQuestion(Other otherQuestion) {
		this.otherQuestion = otherQuestion;
	}

	public Question getQuestion0() {
		return this.activityQuestion;
	}
	
	//idye göre o aktivitenin ilk sorusunu getirme
	public Question selectActivity(int id) {
		if (id >= 600) {
			return this.foodQuestion.getFirstFoodQuestion();
		} else if (id >= 500) {
			return this.gameQuestion.getFirstGameQuestion();
		} else if (id >= 400) {
			return this.argumentQuestion.getFirstArgumentQuestion();
		} else if (id >= 300) {
			return this.entertainmentQuestion.getFirstEntertainmentQuestion();
		} else if (id >= 200) {
			return this.shoppingQuestion.getFirstShoppingQuestion();
		} else if (id >= 100) {
			return this.otherQuestion.getFirstOtherQuestion();
		} else {
			return this.activityQuestion;
		}
	}
	
	//Sonraki soruları getirme
	public Question getNextQuestionBy(int id) {
		if (id >= 600) {
			return this.foodQuestion.getFoodQuestionBy(id);
		} else if (id >= 500) {
			return this.gameQuestion.getGameQuestionBy(id);
		} else if (id >= 400) {
			return this.argumentQuestion.getArgumentQuestionBy(id);
		} else if (id >= 300) {
			return this.entertainmentQuestion.getEntertainmentQuestionBy(id);
		} else if (id >= 200) {
			return this.shoppingQuestion.getShoppingQuestionBy(id);
		} else if (id >= 100) {
			return this.otherQuestion.getOtherQuestionBy(id);
		} else {
			return this.activityQuestion;
		}
	}
}
