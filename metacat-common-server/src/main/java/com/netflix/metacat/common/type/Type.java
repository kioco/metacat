/*
 * Copyright 2016 Netflix, Inc.
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.netflix.metacat.common.type;

import java.util.Collections;
import java.util.List;

/**
 * Created by amajumdar on 6/17/16.
 */
public interface Type {
    /**
     * Returns the base type
     */
    Base getBaseType();
    /**
     * Returns the signature of this type that should be displayed to end-users.
     */
    String getSignature();

    /**
     * Returns the list of parameters.
     */
    default List<Object> getParameters(){
       return Collections.emptyList();
    }

    /**
     * Returns the raw type
     */
    default String getSourceType(){
        return null;
    }
}