package daily.may.problem_1396;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UndergroundSystem {

    static class CheckInInfo {
        String stationName;
        int timeIn;
        public CheckInInfo(String stationName, int timeIn) {
            this.stationName = stationName;
            this.timeIn = timeIn;
        }
    }

    Map<Integer, CheckInInfo> customers;
    Map<String, List<Integer>> travelTimes;

    public UndergroundSystem() {
        customers = new HashMap<>();
        travelTimes = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        customers.put(id, new CheckInInfo(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckInInfo checkInInfo = customers.get(id);
        String path = checkInInfo.stationName + "_" + stationName;
        int travelTime = t - checkInInfo.timeIn;
        travelTimes.computeIfAbsent(path, s -> new ArrayList<>()).add(travelTime);
    }

    public double getAverageTime(String startStation, String endStation) {
        String path = startStation + "_" + endStation;
        List<Integer> list = travelTimes.get(path);
        return list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }
}
