/**

*/
package examples.aws.apig.simpleProduct.sdk;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import examples.aws.apig.simpleProduct.sdk.model.*;

/**
 * Interface for accessing SimpleProductSdk.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface SimpleProductSdk {

    /**
     * @param getHealthRequest
     * @return Result of the GetHealth operation returned by the service.
     * @sample SimpleProductSdk.GetHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/psjraxarv2-2022-03-01T17:27:18Z/GetHealth" target="_top">AWS
     *      API Documentation</a>
     */
    GetHealthResult getHealth(GetHealthRequest getHealthRequest);

    /**
     * @param getProductRequest
     * @return Result of the GetProduct operation returned by the service.
     * @sample SimpleProductSdk.GetProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/psjraxarv2-2022-03-01T17:27:18Z/GetProduct"
     *      target="_top">AWS API Documentation</a>
     */
    GetProductResult getProduct(GetProductRequest getProductRequest);

    /**
     * @param getProductsRequest
     * @return Result of the GetProducts operation returned by the service.
     * @sample SimpleProductSdk.GetProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/psjraxarv2-2022-03-01T17:27:18Z/GetProducts"
     *      target="_top">AWS API Documentation</a>
     */
    GetProductsResult getProducts(GetProductsRequest getProductsRequest);

    /**
     * @param patchProductRequest
     * @return Result of the PatchProduct operation returned by the service.
     * @throws BadRequestException
     * @sample SimpleProductSdk.PatchProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/psjraxarv2-2022-03-01T17:27:18Z/PatchProduct"
     *      target="_top">AWS API Documentation</a>
     */
    PatchProductResult patchProduct(PatchProductRequest patchProductRequest);

    /**
     * @param postProductRequest
     * @return Result of the PostProduct operation returned by the service.
     * @sample SimpleProductSdk.PostProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/psjraxarv2-2022-03-01T17:27:18Z/PostProduct"
     *      target="_top">AWS API Documentation</a>
     */
    PostProductResult postProduct(PostProductRequest postProductRequest);

    /**
     * @param putProductRequest
     * @return Result of the PutProduct operation returned by the service.
     * @sample SimpleProductSdk.PutProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/psjraxarv2-2022-03-01T17:27:18Z/PutProduct"
     *      target="_top">AWS API Documentation</a>
     */
    PutProductResult putProduct(PutProductRequest putProductRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static SimpleProductSdkClientBuilder builder() {
        return new SimpleProductSdkClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
