/**
 * 
 */
package com.thinkbiganalytics.metadata.api.catalog;

/*-
 * #%L
 * kylo-metadata-api
 * %%
 * Copyright (C) 2017 - 2018 ThinkBig Analytics, a Teradata Company
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.thinkbiganalytics.metadata.api.MetadataException;

/**
 *
 */
public class DataSourceNotFoundException extends MetadataException {

    private static final long serialVersionUID = 1L;

    private final DataSource.ID id;
    
    public DataSourceNotFoundException(DataSource.ID id) {
        super("No data source exists with ID: " + id);
        this.id = id;
    }

    public DataSourceNotFoundException(String message, DataSource.ID id) {
        super(message);
        this.id = id;
    }
    
    /**
     * @return the id
     */
    public DataSource.ID getId() {
        return id;
    }
}
