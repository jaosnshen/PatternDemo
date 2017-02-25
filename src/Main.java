import StatePattern.TvController;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//        Factory factory=new ConcreteFactory();
//        Product p=factory.createProduct(ConcreteProductA.class);
//        p.method();
        System.out.printf(""+test());
        HashMap<Integer,String> map=new HashMap<>();
        System.out.printf(5%10+""+(5&0)+" ");

        //String str=new String("dd").substring();

    }


    private static int test(){
        try {
            int m=2/0;
            return 1;

        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }

    }
}
