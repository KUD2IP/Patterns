package creation_pattern.abstract_factory.factories;

import creation_pattern.abstract_factory.jacket.Jacket;
import creation_pattern.abstract_factory.shoes.Shoes;

public interface ClothesFactory {
    Shoes createShoes();
    Jacket createJacket();
}
