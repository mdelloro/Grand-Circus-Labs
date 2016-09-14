package Lab8;


import java.text.DecimalFormat;

public class Batter {
	private String name;
	private int basesEarned;	

	public Batter(String name, int basesEarned) {
		this.name = name;
		this.setBasesEarned(basesEarned);
	}
	
	public String getBattingAvg(int atLeastOne, int atBats){
		double value = atLeastOne/(double)atBats;
		return formatNumber(value);
	}

	public String formatNumber(double value){
		DecimalFormat df = new DecimalFormat(".###");
		return df.format(value);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBasesEarned() {
		return basesEarned;
	}

	public void setBasesEarned(int basesEarned) {
		this.basesEarned = basesEarned;
	}

	@Override
	public String toString() {
		return "Batter [name=" + name + ", basesEarned=" + basesEarned + "]";
	}
	
}