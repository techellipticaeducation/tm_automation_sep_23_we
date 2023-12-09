package pac1;

public class InterfaceDemo {
	public static void main(String[] args) {
		Bowling bowler = new Cricketer();
		bowler.bowlingAverage();
	}
}

interface Batting{
	public void battingAverage();
}

interface Bowling{
	public void bowlingAverage();
}
// one class can implement n number of interfaces
// interface is the solution for multiple inheritance
class Cricketer implements Batting,Bowling{
	public void battingAverage() {

	}
	public void bowlingAverage() {

	}
}
class StateLevel implements Batting,Bowling{
	public void battingAverage() {

	}
	public void bowlingAverage() {

	}
}


