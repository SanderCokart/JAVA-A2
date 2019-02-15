package practicefinal;

public class Vermenigvuldiging {

	public int vermenigvuldig(int times, int number) {

		if (times == 0) {
			return 0;
		} else if (times == 1) {
			return number;
		} else {
			return vermenigvuldig(times - 1, number) + number;
		}

	}
}