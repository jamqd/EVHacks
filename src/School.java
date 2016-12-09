import java.util.ArrayList;

public class School {
	private String name;
	private ArrayList courts = new ArrayList<Court>();
	private int numCourts = 4;
	public Court court1 = new Court("court1");
	public Court court2 = new Court("court2");
	public Court court3 = new Court("court3");
	public Court court4 = new Court("court4");
	
	public School(String myname){
		name = myname;
			
		courts.add(court1);
		courts.add(court2);
		courts.add(court3);
		courts.add(court4);
		
		
	}
	
	public String getName(){
		return this.name;
	}
	
	
	public int getNumCourts(){
		return numCourts;
	}
	
	
	public String getCourts(){
		String output;
		output = court1.getLine() + "\n" + 
				court2.getLine() + "\n" + 
				court3.getLine() + "\n" + 
				court4.getLine() + "\n";
		return output;	
	}
	
	
	public void addCourt1(String playername){
		court1.addPlayer(playername);
	}
	
	public void addCourt2(String playername){
		court2.addPlayer(playername);
	}
	public void addCourt3(String playername){
		court3.addPlayer(playername);
	}
	public void addCourt4(String playername){
		court4.addPlayer(playername);
	}
	
	
}
