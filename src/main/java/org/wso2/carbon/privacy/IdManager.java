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
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.privacy;

/**
 * Manager to handle name and id mapping.
 */
public interface IdManager {

    /**
     * Retrieve name from the identifiable's id.
     * @param id User id of the user.
     * @return Name as a string.
     */
    String getNameFromId(String id);

    /**
     * Retrieve the identifiable's id from name.
     * @param name Name of the identifiable.
     * @return Id as a string.
     */
    String getIdFromName(String name);

    /**
     * Add an id for identifiable that does not currently have an id.
     * @param identifiable Identifiable to be updated.
     * @return Updated identifiable.
     */
    Identifiable addIdForName(Identifiable identifiable);
}
