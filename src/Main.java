import StatePattern.TvController;

public class Main {

    public static void main(String[] args) {
//        Factory factory=new ConcreteFactory();
//        Product p=factory.createProduct(ConcreteProductA.class);
//        p.method();
        TvController tvController=new TvController();
        tvController.powerOff();
        tvController.nextChannel();
    }
}
