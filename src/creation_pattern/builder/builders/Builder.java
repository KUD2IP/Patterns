package creation_pattern.builder.builders;

import creation_pattern.builder.components.*;

public interface Builder {
    void setLaptopType(LaptopType laptopType);
    void setProcessor(Processor processor);
    void setRam(Ram ram);
    void setGraphicsCard(GraphicsCard graphicsCard);
    void setHdd(Hdd hdd);
    void setOs(String os);
}
