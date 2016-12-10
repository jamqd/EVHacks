import java.applet.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.*;
import javax.swing.*;
//test
public class TestApplet extends Applet {
	School sc = new School("creek");
	ArrayList codes = new ArrayList<String>();
	Scanner io = new Scanner(System.in);
	public ArrayList totalplayers = new ArrayList<String>();

	public void init() {
		codes.add("Silver Creek");
		
		
		while(true){
			String inputValue = JOptionPane.showInputDialog("Please input a school name");
			if (codes.contains(inputValue)) {
				JOptionPane.showMessageDialog(null, "School is found");
				break;
			}
			else{
				JOptionPane.showMessageDialog(null, "School not found");
			}
		}
		

			while (true) {
				JOptionPane.showMessageDialog(null, sc.getCourts());
				String courtNumber = JOptionPane.showInputDialog("Please input the court number you wish to join");
				int courtNum = Integer.parseInt(courtNumber);
				
				if(courtNum>=1 && courtNum<=4){
				String name = JOptionPane.showInputDialog("Please input your name");
				MatchMaking d;

				if (!totalplayers.contains(name)) {
					switch (courtNum) {
					case 1:
						sc.court1.addPlayer(name);
						d = new MatchMaking(sc.court1);
						JOptionPane.showMessageDialog(null, sc.getCourts());
						d.startMatch();
						break;
					case 2:
						sc.court2.addPlayer(name);
						d = new MatchMaking(sc.court2);
						JOptionPane.showMessageDialog(null, sc.getCourts());
						d.startMatch();
						break;
					case 3:
						sc.court3.addPlayer(name);
						d = new MatchMaking(sc.court3);
						JOptionPane.showMessageDialog(null, sc.getCourts());
						d.startMatch();
						break;
					case 4:
						sc.court4.addPlayer(name);
						d = new MatchMaking(sc.court4);
						JOptionPane.showMessageDialog(null, sc.getCourts());
						d.startMatch();
						break;
					}
					totalplayers.add(name);
				}
				else{
					JOptionPane.showMessageDialog(null, "Cannot dual sign up");
				}}
				else{
					JOptionPane.showMessageDialog(null, "Court number must be from 1 to 4");
				}

			}
		} 

	}

	/*public void start() {
	}*/

