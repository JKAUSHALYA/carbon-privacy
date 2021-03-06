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

import org.wso2.carbon.privacy.exception.IdManagerException;

/**
 * Default implementation of the Id manager.
 */
public class DefaultIdManager implements IdManager {

    @Override
    public String getNameFromId(String id) {
        return id;
    }

    @Override
    public String getIdFromName(String name) {
        return name;
    }

    @Override
    public Identifiable getIdentifiableFromName(String name) throws IdManagerException {

        return new Identifiable() {
            @Override
            public String getId() {

                return null;
            }

            @Override
            public String getName() {

                return name;
            }
        };
    }

    @Override
    public Identifiable getIdentifiableFromId(String id) throws IdManagerException {

        return new Identifiable() {
            @Override
            public String getId() {

                return id;
            }

            @Override
            public String getName() {

                return null;
            }
        };
    }

    @Override
    public Identifiable addIdForName(Identifiable identifiable) throws IdManagerException {
        return identifiable;
    }

    @Override
    public void removeIdForName(Identifiable identifiable) throws IdManagerException {
    }
}
