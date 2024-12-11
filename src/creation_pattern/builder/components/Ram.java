package creation_pattern.builder.components;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ram {

    private String manufacturer;
    private int capacity;

    public Ram(String manufacturer, int capacity) {
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }
}
