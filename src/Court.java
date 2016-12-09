import java.util.*;

public class Court {
	private String name;
	public ArrayList players = new ArrayList<String>();

	public Court(String myname) {
		name = myname;
	}

	public void addPlayer(String playername) {
		players.add(playername);
	}

	public void removePlayer() {
		players.remove(0);
	}

	public String getName() {
		return this.name;
	}

	
	public String getLine() {
		String output = toString() + ":" + "\n";
		if (players.size() == 0) {
			output += "No players currently in line." + "\n" ;
			 
		} 
		
		else {
			for (int i = 0; i < players.size(); i++) {
				output += players.get(i) + "\n";
			}
		}
		
		return output;
	}
	
	public String toString(){
		return name;
	}
	public int getNumPlayers(){
		return players.size();
	}
}
