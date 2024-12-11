package creation_pattern.builder.components;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hdd {

    private String manufacturer;
    private int capacity;

    public Hdd(String manufacturer, int capacity) {
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }
}
