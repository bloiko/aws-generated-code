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
 * PatchProductResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchProductResultJsonUnmarshaller implements Unmarshaller<PatchProductResult, JsonUnmarshallerContext> {

    public PatchProductResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PatchProductResult patchProductResult = new PatchProductResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return patchProductResult;
        }

        while (true) {
            if (token == null)
                break;

            patchProductResult.setEmpty(EmptyJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return patchProductResult;
    }

    private static PatchProductResultJsonUnmarshaller instance;

    public static PatchProductResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PatchProductResultJsonUnmarshaller();
        return instance;
    }
}
