/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.banma.bpm.api.history;

import java.util.List;

import org.flowable.common.rest.api.AbstractPaginateList;
import com.banma.bpm.api.RestResponseFactory;
import org.flowable.variable.api.history.HistoricVariableInstance;

/**
 * @author Tijs Rademakers
 */
public class HistoricVariableInstancePaginateList extends AbstractPaginateList<HistoricVariableInstanceResponse, HistoricVariableInstance> {

    protected RestResponseFactory restResponseFactory;

    public HistoricVariableInstancePaginateList(RestResponseFactory restResponseFactory) {
        this.restResponseFactory = restResponseFactory;
    }

    @Override
    protected List<HistoricVariableInstanceResponse> processList(List<HistoricVariableInstance> list) {
        return restResponseFactory.createHistoricVariableInstanceResponseList(list);
    }
}
