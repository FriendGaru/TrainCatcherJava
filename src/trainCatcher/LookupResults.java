package trainCatcher;

import java.util.List;
import java.util.stream.Collectors;

public class LookupResults {
		
	int time;
	int day;
	List<Departure> goodTrains;
	List<Departure> maybeTrains;
	List<Departure> badTrains;
	
	LookupResults(int time, int day){
		this.time = time;
		this.day = day;
	}
	
	public void setGood(List<Departure> deps) {
		goodTrains = deps;
	}
	
	public void setMaybe(List<Departure>  deps) {
		maybeTrains = deps;
	}
	
	public void setBad(List<Departure>  deps) {
		badTrains = deps;
	}
	
	@Override
	public String toString() {
		String out = TrainCatcher.timeDayToStr(this.time, this.day);
		if (badTrains.size() > 0) {
			out += "\nBad: " + String.join("  ", badTrains.stream().map(dep -> dep.toString()).collect(Collectors.toList()));
		}
		if (maybeTrains.size() > 0) {
			out += "\nMaybe: " + String.join("  ", maybeTrains.stream().map(dep -> dep.toString()).collect(Collectors.toList()));
		}
		if (goodTrains.size() > 0) {
			out += "\nGood: " + String.join("  ", goodTrains.stream().map(dep -> dep.toString()).collect(Collectors.toList()));
		}
		
		return out;
	}

}
