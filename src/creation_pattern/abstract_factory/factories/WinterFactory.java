package creation_pattern.abstract_factory.factories;

import creation_pattern.abstract_factory.jacket.Jacket;
import creation_pattern.abstract_factory.jacket.WinterJacket;
import creation_pattern.abstract_factory.shoes.Shoes;
import creation_pattern.abstract_factory.shoes.WinterShoes;

public class WinterFactory implements ClothesFactory{
    @Override
    public Shoes createShoes() {
        return new WinterShoes();
    }

    @Override
    public Jacket createJacket() {
        return new WinterJacket();
    }
}
