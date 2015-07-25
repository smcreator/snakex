package kz.snakelario;

public class GameManager {
	private int _score;
	
	private static GameManager _instance;
	
	public GameManager() {
		_score = 0;
	}
	
	public static GameManager getInstance() {
		if (_instance == null) {
			_instance = new GameManager();
		}
		
		return _instance;
	}
	
	public int getScore() {
		return _score;
	}
	
	public void addScore(int value) {
		_score += value;
	}
	
	public void resetGame() {
		_score = 0;
	}
}
