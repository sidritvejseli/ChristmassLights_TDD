package tdd;

public class LightGrid {
	
	private int turnedOn = 0;
	
	private boolean[][] grid = new boolean[1000][1000];
	
	public int countLightsOn() {
		return turnedOn;
	}

	public void turnOn(int debut_i, int debut_j, int fin_i, int fin_j) {
		for(int i = debut_i; i <= fin_i; i++) {
			for(int j = debut_j; j <= fin_j; j++) {
				grid[i][j] = true;
				turnedOn++;
				}
	}
	}

	public void turnOff(int debut_i, int debut_j, int fin_i, int fin_j) {
		for(int i = debut_i; i <= fin_i; i++) {
			for(int j = debut_j; j <= fin_j; j++) {
				grid[i][j] = false;
				turnedOn--;
				}
	}		
	}
}
