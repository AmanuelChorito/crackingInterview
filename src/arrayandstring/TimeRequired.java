package arrayandstring;

public class TimeRequired {
    public static void main(String[] args) {

        FleetDTO fleetDTO = new FleetDTO(1, 2000, 60, 12, 12);
        int timeSpent = getHoursNeeded(fleetDTO);
        System.out.println(timeSpent);
    }

    public static int getHoursNeeded(FleetDTO fleetDTO) {
        int totalHourRequired = fleetDTO.getDistance() / fleetDTO.getAverageSpeed();
        int workingHour = Math.min(fleetDTO.getDrivers() * fleetDTO.getWorkingHours(), 24);
        int restHour=(workingHour==24)?0:fleetDTO.getRestHours();
        System.out.println("workingHour"+workingHour+"resHour"+restHour);
        int timeSpent = 0;
        while (totalHourRequired >= 0) {

            if(totalHourRequired - workingHour>0) {
                totalHourRequired = totalHourRequired - workingHour;
                timeSpent += workingHour + restHour;
                System.out.println("timeSpent"+timeSpent+ "Workinghour"+workingHour+"resHour"+restHour);
            }
            else break;
        }
        return timeSpent + totalHourRequired;
    }
}