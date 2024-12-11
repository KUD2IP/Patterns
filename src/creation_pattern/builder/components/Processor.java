package creation_pattern.builder.components;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Processor {

    private String manufacturer;
    private int cores;
    private double frequency;

    public Processor(String manufacturer, int cores, double frequency) {
        this.manufacturer = manufacturer;
        this.cores = cores;
        this.frequency = frequency;
    }

    public void disperse(){
        System.out.println("processor dispersed");
    }
}
