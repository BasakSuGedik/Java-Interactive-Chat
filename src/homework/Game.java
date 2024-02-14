package homework;

public class Game {
	Question[] gameQuestions;

	public Game(Question[] gameQuestions) {
		this.gameQuestions = gameQuestions;
	}

	//Soruları yazma ve cevapların hangi soruya gideceğinin belirlenmesi
	public static Game fillQuestions() {
		Question[] gameQuestions = new Question[4];
		
		Answer[] gameQuestion1Answers = new Answer[2];
		gameQuestion1Answers[0] = new Answer("Yes",501);
		gameQuestion1Answers[1] = new Answer("No",511);
		gameQuestions[0] = new Question(500, "I don't like playing computer games. Do you?", false, gameQuestion1Answers);
		
		Answer[] gameQuestion2Answers = new Answer[4];
		gameQuestion2Answers[0] = new Answer("Minecraft",512);
		gameQuestion2Answers[1] = new Answer("Lol",512);
		gameQuestion2Answers[2] = new Answer("Csgo",512);
		gameQuestion2Answers[3] = new Answer("Valorant",512);
		gameQuestions[1] = new Question(501, "What is your favourite?", false, gameQuestion2Answers);
		
		gameQuestions[2] = new Question(511, "Right. I dislike computer games too. I think it is so lame.", false, null);
		gameQuestions[3] = new Question(512, "Then you can teach me how to play it.", false, null);
		Game game = new Game(gameQuestions);
		return game;
	}
	
	public Question[] getGameQuestions() {
		return gameQuestions;
	}

	public void setGameQuestions(Question[] gameQuestions) {
		this.gameQuestions = gameQuestions;
	}

	public Question getFirstGameQuestion() {
		return this.gameQuestions[0];
	}
	//Cevapların id lerine göre sonraki soruyu getirme
	public Question getGameQuestionBy(int id) {
		int containIndex = 0;
		for (int i = 0; i < gameQuestions.length; i++) {
			if (gameQuestions[i].questionId == id) {
				containIndex = i;
			}
		}
		return gameQuestions[containIndex];
	}
}
