package creation_pattern.abstract_factory.factories;

import creation_pattern.abstract_factory.jacket.DemiSeasonJacket;
import creation_pattern.abstract_factory.jacket.Jacket;
import creation_pattern.abstract_factory.shoes.DemiSeasonShoes;
import creation_pattern.abstract_factory.shoes.Shoes;

public class DemiSeasonFactory implements ClothesFactory {
    @Override
    public Shoes createShoes() {
        return new DemiSeasonShoes();
    }

    @Override
    public Jacket createJacket() {
        return new DemiSeasonJacket();
    }
}
