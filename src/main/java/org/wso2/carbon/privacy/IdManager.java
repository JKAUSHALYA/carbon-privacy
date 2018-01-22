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

import org.wso2.carbon.privacy.exception.IdManagerException;

/**
 * Manager to handle name and id mapping.
 */
public interface IdManager {

    /**
     * Retrieve name from the identifiable's id.
     * @param id User id of the user.
     * @return Name as a string.
     */
    String getNameFromId(String id) throws IdManagerException;

    /**
     * Retrieve the identifiable's id from name.
     * @param name Name of the identifiable.
     * @return Id as a string.
     */
    String getIdFromName(String name) throws IdManagerException;

    /**
     * Get an Identifiable object related to the given name.
     * @param name Name that is related to the identifiable object.
     * @return Instance of Identifiable.
     * @throws IdManagerException Error while retrieving information.
     */
    Identifiable getIdentifiableFromName(String name) throws IdManagerException;

    /**
     * Get an Identifiable object related to the given id.
     * @param id Id that is related to the identifiable object.
     * @return Instance of Identifiable.
     * @throws IdManagerException Error while retrieving information.
     */
    Identifiable getIdentifiableFromId(String id) throws IdManagerException;

    /**
     * Add an id for identifiable that does not currently have an id.
     * @param identifiable Identifiable to be updated.
     * @return Updated identifiable.
     * @throws IdManagerException In an underlying error.
     */
    Identifiable addIdForName(Identifiable identifiable) throws IdManagerException;

    /**
     * Remove the id and name association for the give identifiable.
     * @param identifiable Identifiable to be update.
     * @throws IdManagerException In an underlying error.
     */
    void removeIdForName(Identifiable identifiable) throws IdManagerException;
}
