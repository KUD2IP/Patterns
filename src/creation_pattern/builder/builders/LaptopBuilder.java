package creation_pattern.builder.builders;

import creation_pattern.builder.components.*;
import creation_pattern.builder.laptops.Laptop;
import lombok.Getter;

@Getter
public class LaptopBuilder implements Builder {
    private LaptopType laptopType;
    private Processor processor;
    private Ram ram;
    private GraphicsCard graphicsCard;
    private Hdd hdd;
    private String os;


    @Override
    public void setLaptopType(LaptopType laptopType) {
        this.laptopType = laptopType;
    }

    @Override
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public void setRam(Ram ram) {
        this.ram = ram;
    }

    @Override
    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    @Override
    public void setOs(String os) {
        this.os = os;
    }

    public Laptop getResult() {
        return new Laptop(
                laptopType,
                processor,
                ram,
                graphicsCard,
                hdd,
                os);
    }
}