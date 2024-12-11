package creation_pattern.builder.director;

import creation_pattern.builder.builders.Builder;
import creation_pattern.builder.components.*;

public class Director {

    public void constructorGamingLaptop(Builder builder) {
        builder.setLaptopType(LaptopType.GAMING);
        builder.setProcessor(new Processor("AMD", 8, 3.5));
        builder.setRam(new Ram("Corsair", 32));
        builder.setGraphicsCard(new GraphicsCard("NVIDIA", 16));
        builder.setHdd(new Hdd("Seagate", 1000));
        builder.setOs("Windows 10");
    }

    public void constructorOfficeLaptop(Builder builder) {
        builder.setLaptopType(LaptopType.OFFICE);
        builder.setProcessor(new Processor("Intel", 8, 3.5));
        builder.setRam(new Ram("Corsair", 8));
        builder.setGraphicsCard(new GraphicsCard("NVIDIA", 8));
        builder.setHdd(new Hdd("Seagate", 500));
        builder.setOs("Windows 11");
    }

    public void constructorAppleLaptop(Builder builder) {
        builder.setLaptopType(LaptopType.APPLE);
        builder.setProcessor(new Processor("Apple M3 pro", 12, 3.5));
        builder.setRam(new Ram("Apple", 18));
        builder.setGraphicsCard(new GraphicsCard("Apple M3 pro", 18));
        builder.setHdd(new Hdd("Отсутствует", 0));
        builder.setOs("macOS");
    }
}
