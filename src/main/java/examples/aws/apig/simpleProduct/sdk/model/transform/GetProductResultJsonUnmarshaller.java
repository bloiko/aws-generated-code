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
 * GetProductResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProductResultJsonUnmarshaller implements Unmarshaller<GetProductResult, JsonUnmarshallerContext> {

    public GetProductResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetProductResult getProductResult = new GetProductResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getProductResult;
        }

        while (true) {
            if (token == null)
                break;

            getProductResult.setGetProduct(GetProductJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return getProductResult;
    }

    private static GetProductResultJsonUnmarshaller instance;

    public static GetProductResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetProductResultJsonUnmarshaller();
        return instance;
    }
}
