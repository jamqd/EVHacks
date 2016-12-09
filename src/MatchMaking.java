import java.util.concurrent.TimeUnit;
import java.awt.Robot;
import java.util.Date;

public class MatchMaking {
	Court a;

	public MatchMaking(Court z) {
		a = z;
	}

	public void startMatch() {
		if (a.getNumPlayers() == 4) {
			delay();
			for (int i = 1; i <= 4; i++) {
				a.removePlayer();
			}
		}
	}

	public void delay() {

		

		try {

			// sleep 5 seconds
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			System.out.print("fail");
		}

	}

}