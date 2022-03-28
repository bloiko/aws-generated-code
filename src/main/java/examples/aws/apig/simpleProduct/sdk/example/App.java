package examples.aws.apig.simpleProduct.sdk.example;

import com.amazonaws.opensdk.config.ConnectionConfiguration;
import examples.aws.apig.simpleProduct.sdk.SimpleProductSdk;
import examples.aws.apig.simpleProduct.sdk.model.*;

public class App {
    SimpleProductSdk sdkClient;

    public App() {
        initSdk();
    }

    private void initSdk() {
        sdkClient = SimpleProductSdk.builder()
                .connectionConfiguration(
                        new ConnectionConfiguration()
                                .maxConnections(100)
                                .connectionMaxIdleMillis(1000))
                .build();

    }

    public void shutdown() {
        sdkClient.shutdown();
    }

    public String getProductById(String productId) {

       GetProductResult result = sdkClient.getProduct(new GetProductRequest().productId(productId));

       return result.getGetProduct().toString();
    }

    private String patchProduct(GetProduct product) {
        PatchProductResult result = sdkClient.patchProduct(new PatchProductRequest().getProduct(product));

        return result.toString();
    }

    public static void main( String[] args )
    {
        System.out.println( "Simple calc" );
        App calc = new App();

        String res = calc.getProductById("1");
        System.out.println( res);


        calc.patchProduct(new GetProduct().id("1").price("100").pictureUrl("url").productName("name"));
        System.out.println("Updated!");


        res = calc.getProductById("1");
        System.out.println( res);


        calc.patchProduct(new GetProduct().id("1").price("14314").pictureUrl("https://google").productName("product_name"));
        System.out.println( "Updated to initial state!");

        res = calc.getProductById("1");
        System.out.println( res);
    }

}
