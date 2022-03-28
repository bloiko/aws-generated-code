/**

*/
package examples.aws.apig.simpleProduct.sdk;

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.opensdk.protect.client.SdkSyncClientBuilder;
import com.amazonaws.opensdk.internal.config.ApiGatewayClientConfigurationFactory;
import com.amazonaws.util.RuntimeHttpUtils;
import com.amazonaws.Protocol;

import java.net.URI;
import javax.annotation.Generated;

/**
 * Fluent builder for {@link examples.aws.apig.simpleProduct.sdk.SimpleProductSdk}.
 * 
 * @see examples.aws.apig.simpleProduct.sdk.SimpleProductSdk#builder
 **/
@NotThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public final class SimpleProductSdkClientBuilder extends SdkSyncClientBuilder<SimpleProductSdkClientBuilder, SimpleProductSdk> {

    private static final URI DEFAULT_ENDPOINT = RuntimeHttpUtils.toUri("psjraxarv2.execute-api.eu-west-1.amazonaws.com", Protocol.HTTPS);
    private static final String DEFAULT_REGION = "eu-west-1";

    /**
     * Package private constructor - builder should be created via {@link SimpleProductSdk#builder()}
     */
    SimpleProductSdkClientBuilder() {
        super(new ApiGatewayClientConfigurationFactory());
    }

    /**
     * Construct a synchronous implementation of SimpleProductSdk using the current builder configuration.
     *
     * @param params
     *        Current builder configuration represented as a parameter object.
     * @return Fully configured implementation of SimpleProductSdk.
     */
    @Override
    protected SimpleProductSdk build(AwsSyncClientParams params) {
        return new SimpleProductSdkClient(params);
    }

    @Override
    protected URI defaultEndpoint() {
        return DEFAULT_ENDPOINT;
    }

    @Override
    protected String defaultRegion() {
        return DEFAULT_REGION;
    }

}
