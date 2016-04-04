/**
 *  Copyright (c) 2015 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.wso2.carbon.bpmn.rest.model.runtime;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.wso2.carbon.bpmn.rest.common.DateToStringSerializer;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 */
@XmlRootElement(name = "EventResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class EventResponse {

    protected String url;
    protected String id;
    protected String action;
    protected String userId;
    @JsonSerialize(using = DateToStringSerializer.class, as = Date.class)
    protected Date time;
    protected String taskUrl;
    protected String processInstanceUrl;
    @XmlElementWrapper(name = "messages")
    protected List<String> message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getTime() {
        return time == null ? null : (Date) this.time.clone();
    }

    public void setTime(Date time) {
        this.time = time == null ? null : (Date) this.time.clone();
    }

    public String getTaskUrl() {
        return taskUrl;
    }

    public void setTaskUrl(String taskUrl) {
        this.taskUrl = taskUrl;
    }

    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    public String getProcessInstanceUrl() {
        return processInstanceUrl;
    }

    public void setProcessInstanceUrl(String processInstanceUrl) {
        this.processInstanceUrl = processInstanceUrl;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
