/**

*/
package examples.aws.apig.simpleProduct.sdk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/psjraxarv2-2022-03-01T17:27:18Z/PutProduct" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutProductResult extends com.amazonaws.opensdk.BaseResult implements Serializable, Cloneable {

    private Empty empty;

    /**
     * @param empty
     */

    public void setEmpty(Empty empty) {
        this.empty = empty;
    }

    /**
     * @return
     */

    public Empty getEmpty() {
        return this.empty;
    }

    /**
     * @param empty
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProductResult empty(Empty empty) {
        setEmpty(empty);
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
        if (getEmpty() != null)
            sb.append("Empty: ").append(getEmpty());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutProductResult == false)
            return false;
        PutProductResult other = (PutProductResult) obj;
        if (other.getEmpty() == null ^ this.getEmpty() == null)
            return false;
        if (other.getEmpty() != null && other.getEmpty().equals(this.getEmpty()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmpty() == null) ? 0 : getEmpty().hashCode());
        return hashCode;
    }

    @Override
    public PutProductResult clone() {
        try {
            return (PutProductResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
