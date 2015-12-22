/*************************************************************************
 * Copyright 2014 Eucalyptus Systems, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Please contact Eucalyptus Systems, Inc., 6755 Hollister Ave., Goleta
 * CA 93117, USA or visit http://www.eucalyptus.com/licenses/ if you
 * need additional information or have any questions.
 *
 * This file may incorporate work covered under the following copyright
 * and permission notice:

 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.eucalyptus.simpleworkflow.common.model;

import java.io.Serializable;

/**
 * <p>
 * Contains a paginated list of information about workflow executions.
 * </p>
 */
public class WorkflowExecutionInfos extends SimpleWorkflowMessage implements Serializable {
    /**
     * The list of workflow information structures.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowExecutionInfo> executionInfos;

    /**
     * If a <code>NextPageToken</code> was returned by a previous call, there
     * are more results available. To retrieve the next page of results, make
     * the call again using the returned token in <code>nextPageToken</code>.
     * Keep all other arguments unchanged. <p>The configured
     * <code>maximumPageSize</code> determines how many results can be
     * returned in a single call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String nextPageToken;

    /**
     * The list of workflow information structures.
     *
     * @return The list of workflow information structures.
     */
    public java.util.List<WorkflowExecutionInfo> getExecutionInfos() {
      if (executionInfos == null) {
        executionInfos = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowExecutionInfo>();
        executionInfos.setAutoConstruct(true);
      }
      return executionInfos;
    }
    
    /**
     * The list of workflow information structures.
     *
     * @param executionInfos The list of workflow information structures.
     */
    public void setExecutionInfos(java.util.Collection<WorkflowExecutionInfo> executionInfos) {
        if (executionInfos == null) {
            this.executionInfos = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowExecutionInfo> executionInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowExecutionInfo>(executionInfos.size());
        executionInfosCopy.addAll(executionInfos);
        this.executionInfos = executionInfosCopy;
    }
    
    /**
     * The list of workflow information structures.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setExecutionInfos(java.util.Collection)} or {@link
     * #withExecutionInfos(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionInfos The list of workflow information structures.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkflowExecutionInfos withExecutionInfos(WorkflowExecutionInfo... executionInfos) {
        if (getExecutionInfos() == null) setExecutionInfos(new java.util.ArrayList<WorkflowExecutionInfo>(executionInfos.length));
        for (WorkflowExecutionInfo value : executionInfos) {
            getExecutionInfos().add(value);
        }
        return this;
    }
    
    /**
     * The list of workflow information structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionInfos The list of workflow information structures.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkflowExecutionInfos withExecutionInfos(java.util.Collection<WorkflowExecutionInfo> executionInfos) {
        if (executionInfos == null) {
            this.executionInfos = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowExecutionInfo> executionInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<WorkflowExecutionInfo>(executionInfos.size());
            executionInfosCopy.addAll(executionInfos);
            this.executionInfos = executionInfosCopy;
        }

        return this;
    }

    /**
     * If a <code>NextPageToken</code> was returned by a previous call, there
     * are more results available. To retrieve the next page of results, make
     * the call again using the returned token in <code>nextPageToken</code>.
     * Keep all other arguments unchanged. <p>The configured
     * <code>maximumPageSize</code> determines how many results can be
     * returned in a single call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return If a <code>NextPageToken</code> was returned by a previous call, there
     *         are more results available. To retrieve the next page of results, make
     *         the call again using the returned token in <code>nextPageToken</code>.
     *         Keep all other arguments unchanged. <p>The configured
     *         <code>maximumPageSize</code> determines how many results can be
     *         returned in a single call.
     */
    public String getNextPageToken() {
        return nextPageToken;
    }
    
    /**
     * If a <code>NextPageToken</code> was returned by a previous call, there
     * are more results available. To retrieve the next page of results, make
     * the call again using the returned token in <code>nextPageToken</code>.
     * Keep all other arguments unchanged. <p>The configured
     * <code>maximumPageSize</code> determines how many results can be
     * returned in a single call.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken If a <code>NextPageToken</code> was returned by a previous call, there
     *         are more results available. To retrieve the next page of results, make
     *         the call again using the returned token in <code>nextPageToken</code>.
     *         Keep all other arguments unchanged. <p>The configured
     *         <code>maximumPageSize</code> determines how many results can be
     *         returned in a single call.
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
    
    /**
     * If a <code>NextPageToken</code> was returned by a previous call, there
     * are more results available. To retrieve the next page of results, make
     * the call again using the returned token in <code>nextPageToken</code>.
     * Keep all other arguments unchanged. <p>The configured
     * <code>maximumPageSize</code> determines how many results can be
     * returned in a single call.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken If a <code>NextPageToken</code> was returned by a previous call, there
     *         are more results available. To retrieve the next page of results, make
     *         the call again using the returned token in <code>nextPageToken</code>.
     *         Keep all other arguments unchanged. <p>The configured
     *         <code>maximumPageSize</code> determines how many results can be
     *         returned in a single call.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public WorkflowExecutionInfos withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getExecutionInfos() != null) sb.append("ExecutionInfos: " + getExecutionInfos() + ",");
        if (getNextPageToken() != null) sb.append("NextPageToken: " + getNextPageToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getExecutionInfos() == null) ? 0 : getExecutionInfos().hashCode()); 
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WorkflowExecutionInfos == false) return false;
        WorkflowExecutionInfos other = (WorkflowExecutionInfos)obj;
        
        if (other.getExecutionInfos() == null ^ this.getExecutionInfos() == null) return false;
        if (other.getExecutionInfos() != null && other.getExecutionInfos().equals(this.getExecutionInfos()) == false) return false; 
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null) return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false) return false; 
        return true;
    }

}
    