import java.util.Set;
import java.util.HashSet;

public class Ternilapilli {
	public static  String notXTurnErrorMessage = "Not Xs turn";
	public Set<Position> xs;
	public Set<Position> os;

	public Ternilapilli() {
		xs = new HashSet<>();
		os = new HashSet<>();
	}
	
	public Set <Position>getXs() {
		// TODO Auto-generated method stub
		return xs;
	} 

	public Set <Position>getOs() {
		// TODO Auto-generated method stub
		return os;
	}

	public void putXAt(Position position) {
		xs.add(position);
	}

	public void putOAt(Position position) {
		xs.add(position);
	}
	public void putXAt(Position position) {
		if (turn == 0) {
			throw new Run
		}
	}

}
