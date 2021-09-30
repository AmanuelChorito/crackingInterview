package arrayandstring;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data

public class FleetDTO {
    private int drivers;
    private int distance;
    private int averageSpeed;
    private int workingHours;
    private int RestHours;

    public FleetDTO(int drivers, int distance, int averageSpeed, int workingHours, int restHours) {
        this.drivers = drivers;
        this.distance = distance;
        this.averageSpeed = averageSpeed;
        this.workingHours = workingHours;
        RestHours = restHours;
    }
}
