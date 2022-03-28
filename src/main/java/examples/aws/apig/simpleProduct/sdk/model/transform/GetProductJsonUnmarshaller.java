/**

*/
package examples.aws.apig.simpleProduct.sdk.model.transform;

import java.math.*;

import javax.annotation.Generated;

import examples.aws.apig.simpleProduct.sdk.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetProduct JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProductJsonUnmarshaller implements Unmarshaller<GetProduct, JsonUnmarshallerContext> {

    public GetProduct unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetProduct getProduct = new GetProduct();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    getProduct.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("picture_url", targetDepth)) {
                    context.nextToken();
                    getProduct.setPictureUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("price", targetDepth)) {
                    context.nextToken();
                    getProduct.setPrice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("product_name", targetDepth)) {
                    context.nextToken();
                    getProduct.setProductName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getProduct;
    }

    private static GetProductJsonUnmarshaller instance;

    public static GetProductJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetProductJsonUnmarshaller();
        return instance;
    }
}
