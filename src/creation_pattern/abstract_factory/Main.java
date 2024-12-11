package creation_pattern.abstract_factory;

import creation_pattern.abstract_factory.factories.DemiSeasonFactory;
import creation_pattern.abstract_factory.factories.SummerFactory;
import creation_pattern.abstract_factory.factories.WinterFactory;

public class Main {
    public static void main(String[] args) {
        Application app = new Application(new WinterFactory());
        app.info();

        System.out.println("\n");

        app = new Application(new DemiSeasonFactory());
        app.info();

        System.out.println("\n");

        app = new Application(new SummerFactory());
        app.info();
    }
}
