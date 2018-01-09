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
import org.wso2.carbon.privacy.DefaultUserIdManager;

import static org.testng.Assert.assertEquals;

/**
 * Default user id manager related test cases.
 */
public class DefaultUserIdManagerTests {

    private static final String DEFAULT_USER_NAME = "admin";
    private static final String DEFAULT_USER_ID = "12345";

    @Test
    public void getUsernameFromUserIdValidTestCase() {

        DefaultUserIdManager defaultUserIdManager = new DefaultUserIdManager();
        String username = defaultUserIdManager.getUserIdFromUsername(DEFAULT_USER_ID);

        assertEquals(username, DEFAULT_USER_ID);
    }

    @Test
    public void getUserIdFromUsernameValidTestCase() {

        DefaultUserIdManager defaultUserIdManager = new DefaultUserIdManager();
        String userId = defaultUserIdManager.getUserIdFromUsername(DEFAULT_USER_NAME);

        assertEquals(userId, DEFAULT_USER_NAME);
    }
}
