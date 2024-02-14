package homework;

public class Question implements QuestionInterface {
	int questionId;
	String question;
	boolean isAsked;
	Answer[] answers;
	boolean isEndQuestion;
	
	public Question(int questionId, String question, boolean isAsked, Answer[] answers) {
		this.questionId = questionId;
		this.question = question;
		this.isAsked = isAsked;
		this.answers = answers;
		this.isEndQuestion = (answers == null);
	}
	//Tekrar aynı input girildiğini söyleme
	public void printQuestion() {
		if (isAsked) {
			System.out.print("I said it before, ");
		}
		System.out.println(question);
		if (answers != null) {
			for (int i = 0; i < answers.length; i++) {
				System.out.println(answers[i].answer);
			}
		}
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public boolean isAsked() {
		return isAsked;
	}

	public void setAsked(boolean isAsked) {
		this.isAsked = isAsked;
	}

	public Answer[] getAnswers() {
		return answers;
	}

	public void setAnswers(Answer[] answers) {
		this.answers = answers;
	}

	public boolean isEndQuestion() {
		return isEndQuestion;
	}

	public void setEndQuestion(boolean isEndQuestion) {
		this.isEndQuestion = isEndQuestion;
	}

	//Girilen inputların cevaplarda bulunup bulunmadığının kontrolü
	public boolean doAnswersContain(String userInput) {
		if (answers != null && userInput.length() > 0) {
			int isContains = 0;
			for (int i = 0; i < answers.length; i++) {
				if (answers[i].answer.toLowerCase().contains(userInput.toLowerCase()) && answers[i].answer.length() == userInput.length()) {
					isContains ++;
				}
			}
			if (isContains > 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	//Girilen cevabın idsini bulma
	public int getAnswerId(String userInput) {
		if (answers != null) {
			int containIndex = 0;
			for (int i = 0; i < answers.length; i++) {
				if (answers[i].answer.toLowerCase().contains(userInput.toLowerCase())) {
					containIndex = i;
				}
			}
			return answers[containIndex].id;	
		} else {
			return 0;
		}
	}
}
