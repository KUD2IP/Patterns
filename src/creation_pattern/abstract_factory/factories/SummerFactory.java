package creation_pattern.abstract_factory.factories;

import creation_pattern.abstract_factory.jacket.Jacket;
import creation_pattern.abstract_factory.jacket.SummerJacket;
import creation_pattern.abstract_factory.shoes.Shoes;
import creation_pattern.abstract_factory.shoes.SummerShoes;

public class SummerFactory implements ClothesFactory {
    @Override
    public Shoes createShoes() {
        return new SummerShoes();
    }

    @Override
    public Jacket createJacket() {
        return new SummerJacket();
    }
}
