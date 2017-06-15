/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameter key-value pairs used to provision a product.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ProvisioningParameter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisioningParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>ProvisioningArtifactParameter.ParameterKey</code> parameter from <a>DescribeProvisioningParameters</a>.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value to use for provisioning. Any constraints on this value can be found in
     * <code>ProvisioningArtifactParameter</code> for <code>Key</code>.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The <code>ProvisioningArtifactParameter.ParameterKey</code> parameter from <a>DescribeProvisioningParameters</a>.
     * </p>
     * 
     * @param key
     *        The <code>ProvisioningArtifactParameter.ParameterKey</code> parameter from
     *        <a>DescribeProvisioningParameters</a>.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The <code>ProvisioningArtifactParameter.ParameterKey</code> parameter from <a>DescribeProvisioningParameters</a>.
     * </p>
     * 
     * @return The <code>ProvisioningArtifactParameter.ParameterKey</code> parameter from
     *         <a>DescribeProvisioningParameters</a>.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The <code>ProvisioningArtifactParameter.ParameterKey</code> parameter from <a>DescribeProvisioningParameters</a>.
     * </p>
     * 
     * @param key
     *        The <code>ProvisioningArtifactParameter.ParameterKey</code> parameter from
     *        <a>DescribeProvisioningParameters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningParameter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value to use for provisioning. Any constraints on this value can be found in
     * <code>ProvisioningArtifactParameter</code> for <code>Key</code>.
     * </p>
     * 
     * @param value
     *        The value to use for provisioning. Any constraints on this value can be found in
     *        <code>ProvisioningArtifactParameter</code> for <code>Key</code>.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value to use for provisioning. Any constraints on this value can be found in
     * <code>ProvisioningArtifactParameter</code> for <code>Key</code>.
     * </p>
     * 
     * @return The value to use for provisioning. Any constraints on this value can be found in
     *         <code>ProvisioningArtifactParameter</code> for <code>Key</code>.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value to use for provisioning. Any constraints on this value can be found in
     * <code>ProvisioningArtifactParameter</code> for <code>Key</code>.
     * </p>
     * 
     * @param value
     *        The value to use for provisioning. Any constraints on this value can be found in
     *        <code>ProvisioningArtifactParameter</code> for <code>Key</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningParameter withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningParameter == false)
            return false;
        ProvisioningParameter other = (ProvisioningParameter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ProvisioningParameter clone() {
        try {
            return (ProvisioningParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ProvisioningParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
