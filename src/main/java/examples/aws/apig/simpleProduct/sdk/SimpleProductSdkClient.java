/**

*/
package examples.aws.apig.simpleProduct.sdk;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.opensdk.protect.model.transform.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.SdkBaseException;

import examples.aws.apig.simpleProduct.sdk.model.*;
import examples.aws.apig.simpleProduct.sdk.model.transform.*;

/**
 * Client for accessing SimpleProductSdk. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class SimpleProductSdkClient implements SimpleProductSdk {

    private final ClientHandler clientHandler;

    private static final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory = new com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequestException").withModeledClass(
                                    examples.aws.apig.simpleProduct.sdk.model.BadRequestException.class))
                    .withBaseServiceExceptionClass(examples.aws.apig.simpleProduct.sdk.model.SimpleProductSdkException.class));

    /**
     * Constructs a new client to invoke service methods on SimpleProductSdk using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    SimpleProductSdkClient(AwsSyncClientParams clientParams) {
        this.clientHandler = new SdkClientHandler(new ClientHandlerParams().withClientParams(clientParams));
    }

    /**
     * @param getHealthRequest
     * @return Result of the GetHealth operation returned by the service.
     * @sample SimpleProductSdk.GetHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/psjraxarv2-2022-03-01T17:27:18Z/GetHealth" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetHealthResult getHealth(GetHealthRequest getHealthRequest) {
        HttpResponseHandler<GetHealthResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetHealthResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetHealthRequest, GetHealthResult>()
                .withMarshaller(new GetHealthRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getHealthRequest));
    }

    /**
     * @param getProductRequest
     * @return Result of the GetProduct operation returned by the service.
     * @sample SimpleProductSdk.GetProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/psjraxarv2-2022-03-01T17:27:18Z/GetProduct"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetProductResult getProduct(GetProductRequest getProductRequest) {
        HttpResponseHandler<GetProductResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetProductResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetProductRequest, GetProductResult>()
                .withMarshaller(new GetProductRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getProductRequest));
    }

    /**
     * @param getProductsRequest
     * @return Result of the GetProducts operation returned by the service.
     * @sample SimpleProductSdk.GetProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/psjraxarv2-2022-03-01T17:27:18Z/GetProducts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetProductsResult getProducts(GetProductsRequest getProductsRequest) {
        HttpResponseHandler<GetProductsResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetProductsResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetProductsRequest, GetProductsResult>()
                .withMarshaller(new GetProductsRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getProductsRequest));
    }

    /**
     * @param patchProductRequest
     * @return Result of the PatchProduct operation returned by the service.
     * @throws BadRequestException
     * @sample SimpleProductSdk.PatchProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/psjraxarv2-2022-03-01T17:27:18Z/PatchProduct"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PatchProductResult patchProduct(PatchProductRequest patchProductRequest) {
        HttpResponseHandler<PatchProductResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PatchProductResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler(new JsonErrorShapeMetadata().withModeledClass(
                BadRequestException.class).withHttpStatusCode(400));

        return clientHandler.execute(new ClientExecutionParams<PatchProductRequest, PatchProductResult>()
                .withMarshaller(new PatchProductRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(patchProductRequest));
    }

    /**
     * @param postProductRequest
     * @return Result of the PostProduct operation returned by the service.
     * @sample SimpleProductSdk.PostProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/psjraxarv2-2022-03-01T17:27:18Z/PostProduct"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PostProductResult postProduct(PostProductRequest postProductRequest) {
        HttpResponseHandler<PostProductResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PostProductResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PostProductRequest, PostProductResult>()
                .withMarshaller(new PostProductRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(postProductRequest));
    }

    /**
     * @param putProductRequest
     * @return Result of the PutProduct operation returned by the service.
     * @sample SimpleProductSdk.PutProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/psjraxarv2-2022-03-01T17:27:18Z/PutProduct"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutProductResult putProduct(PutProductRequest putProductRequest) {
        HttpResponseHandler<PutProductResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new PutProductResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<PutProductRequest, PutProductResult>()
                .withMarshaller(new PutProductRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(putProductRequest));
    }

    /**
     * Create the error response handler for the operation.
     * 
     * @param errorShapeMetadata
     *        Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata().withErrorShapes(Arrays.asList(errorShapeMetadata)));
    }

    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }

}
