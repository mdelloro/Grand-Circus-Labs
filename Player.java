package lab12;

public class Player {

	private String playerName;

	public Player(String playerName) {
		this.playerName = playerName;
	}
		public Roshambo generateRoshambo(){
		return Roshambo.ROCK;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerName(){
		return playerName;
		
	}
	
}
