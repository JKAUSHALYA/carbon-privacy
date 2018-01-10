/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.privacy;

/**
 * Insulator to prevent missus of sensitive information.
 */
public class PrivacyInsulator<T> {

    private T t;

    public PrivacyInsulator(T t) {
        this.t = t;
    }

    /**
     * Get the underlying object.
     * @return T
     */
    public T getSource() {
        return t;
    }

    /**
     * Get the value of the underlying object in privacy safe manner.
     * @return Value as a String.
     */
    public String getValue() {
        return toString();
    }

    @Override
    public String toString() {

        if (t instanceof Confidential) {
            return ((Confidential) t).getId();
        } else {
            return Integer.toString(t.hashCode());
        }
    }
}
