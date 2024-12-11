package creation_pattern.builder;

import creation_pattern.builder.builders.LaptopBuilder;
import creation_pattern.builder.builders.LaptopManualBuilder;
import creation_pattern.builder.director.Director;
import creation_pattern.builder.laptops.Laptop;
import creation_pattern.builder.laptops.Manual;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        LaptopBuilder builder = new LaptopBuilder();
        director.constructorGamingLaptop(builder);

        Laptop laptop = builder.getResult();
        System.out.println(laptop.getLaptopType());

        LaptopManualBuilder manualBuilder = new LaptopManualBuilder();

        director.constructorGamingLaptop(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println(manual.print());
    }
}
