package creation_pattern.builder.laptops;

import creation_pattern.builder.components.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Manual {

    private LaptopType laptopType;
    private Processor processor;
    private Ram ram;
    private GraphicsCard graphicsCard;
    private Hdd hdd;
    private String os;

    public Manual(LaptopType laptopType,
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

    public String print() {

        String sb = "Laptop type: " + laptopType + "\n" +
                "Processor: " + processor.getManufacturer() +
                " " + processor.getCores() +
                " " + processor.getFrequency() + "\n" +
                "Ram: " + ram.getManufacturer() +
                " " + ram.getCapacity() + "\n" +
                "GraphicsCard: " + graphicsCard.getManufacturer() +
                " " + graphicsCard.getMemory() + "\n" +
                "Hdd: " + hdd.getManufacturer() +
                " " + hdd.getCapacity() + "\n" +
                "Os: " + os + "\n";

        return sb;
    }
}
