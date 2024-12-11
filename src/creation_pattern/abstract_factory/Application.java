package creation_pattern.abstract_factory;

import creation_pattern.abstract_factory.factories.ClothesFactory;
import creation_pattern.abstract_factory.jacket.Jacket;
import creation_pattern.abstract_factory.shoes.Shoes;
import lombok.Getter;

@Getter
public class Application {

    private final Shoes shoes;
    private final Jacket jacket;

    public Application(ClothesFactory factory) {
        this.shoes = factory.createShoes();
        this.jacket = factory.createJacket();
    }

    public void info() {
        shoes.info();
        jacket.info();
    }
}
