package creation_pattern.builder.components;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class GraphicsCard {

    private String manufacturer;
    private int memory;

    public GraphicsCard(String manufacturer, int memory) {
        this.manufacturer = manufacturer;
        this.memory = memory;
    }

}
