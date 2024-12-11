package creation_pattern.builder.laptops;

import creation_pattern.builder.components.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Laptop {

    private LaptopType laptopType;
    private Processor processor;
    private Ram ram;
    private GraphicsCard graphicsCard;
    private Hdd hdd;
    private String os;
    private int percentages = 100;

    public Laptop(LaptopType laptopType,
                  Processor processor,
                  Ram ram,
                  GraphicsCard graphicsCard,
                  Hdd hdd,
                  String os) {

        this.laptopType = laptopType;
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.hdd = hdd;
        this.os = os;
    }
}
