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

package org.wso2.carbon.privacy.test;

import org.testng.annotations.Test;
import org.wso2.carbon.privacy.DefaultIdManager;

import static org.testng.Assert.assertEquals;

/**
 * Default id manager related test cases.
 */
public class DefaultIdManagerTests {

    private static final String DEFAULT_NAME = "admin";
    private static final String DEFAULT_ID = "12345";

    @Test
    public void getUsernameFromUserIdValidTestCase() {

        DefaultIdManager defaultIdManager = new DefaultIdManager();
        String name = defaultIdManager.getNameFromId(DEFAULT_ID);

        assertEquals(name, DEFAULT_ID);
    }

    @Test
    public void getUserIdFromUsernameValidTestCase() {

        DefaultIdManager defaultIdManager = new DefaultIdManager();
        String id = defaultIdManager.getIdFromName(DEFAULT_NAME);

        assertEquals(id, DEFAULT_NAME);
    }
}
