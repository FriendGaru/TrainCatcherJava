package trainCatcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrainCatcherApp {
	public static final String WEEKDAYS = "weekdays.txt";
	public static final String SATURDAYS = "saturdays.txt";
	public static final String HOLIDAYS = "holidays.txt";
	public static final int WALKTIME = 6;
	public static final int WIGGLE_TIME = 3;
	public static final List<String> GOOD_DESTINATIONS = new ArrayList<String>(
			Arrays.asList( "宮", "川", "池", "浦", "赤"));
	
	public static void main(String[] args) {
		TrainCatcher tc = new TrainCatcher(WALKTIME, WIGGLE_TIME);
		tc.setSchedsByFileLoc(WEEKDAYS, SATURDAYS, HOLIDAYS);
		tc.setGoodDestinations(GOOD_DESTINATIONS);
		LookupResults lookup = tc.getLookupNow();
		System.out.println(lookup);
		
	}

}
