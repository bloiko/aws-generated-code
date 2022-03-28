/**

*/
package examples.aws.apig.simpleProduct.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/psjraxarv2-2022-03-01T17:27:18Z/GetProduct" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProductResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private GetProduct getProduct;

    /**
     * @param getProduct
     */

    public void setGetProduct(GetProduct getProduct) {
        this.getProduct = getProduct;
    }

    /**
     * @return
     */

    public GetProduct getGetProduct() {
        return this.getProduct;
    }

    /**
     * @param getProduct
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProductResult getProduct(GetProduct getProduct) {
        setGetProduct(getProduct);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGetProduct() != null)
            sb.append("GetProduct: ").append(getGetProduct());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProductResult == false)
            return false;
        GetProductResult other = (GetProductResult) obj;
        if (other.getGetProduct() == null ^ this.getGetProduct() == null)
            return false;
        if (other.getGetProduct() != null && other.getGetProduct().equals(this.getGetProduct()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGetProduct() == null) ? 0 : getGetProduct().hashCode());
        return hashCode;
    }

    @Override
    public GetProductResult clone() {
        try {
            return (GetProductResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
