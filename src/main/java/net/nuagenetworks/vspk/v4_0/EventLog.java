/*
  Copyright (c) 2015, Alcatel-Lucent Inc
  All rights reserved.

  Redistribution and use in source and binary forms, with or without
  modification, are permitted provided that the following conditions are met:
      * Redistributions of source code must retain the above copyright
        notice, this list of conditions and the following disclaimer.
      * Redistributions in binary form must reproduce the above copyright
        notice, this list of conditions and the following disclaimer in the
        documentation and/or other materials provided with the distribution.
      * Neither the name of the copyright holder nor the names of its contributors
        may be used to endorse or promote products derived from this software without
        specific prior written permission.

  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY
  DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
  (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
  ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package net.nuagenetworks.vspk.v4_0;

import net.nuagenetworks.bambou.RestObject;
import net.nuagenetworks.bambou.annotation.RestEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;


import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "eventlog", resourceName = "eventlogs")
public class EventLog extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "diff")
   protected Object diff;
   
   @JsonProperty(value = "enterprise")
   protected String enterprise;
   
   @JsonProperty(value = "entities")
   protected java.util.List<com.fasterxml.jackson.databind.JsonNode> entities;
   
   @JsonProperty(value = "entityID")
   protected String entityID;
   
   @JsonProperty(value = "entityParentID")
   protected String entityParentID;
   
   @JsonProperty(value = "entityParentType")
   protected String entityParentType;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "entityType")
   protected String entityType;
   
   @JsonProperty(value = "user")
   protected String user;
   
   @JsonProperty(value = "eventReceivedTime")
   protected Float eventReceivedTime;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "type")
   protected String type;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   

   public EventLog() {
      
      metadatas = new MetadatasFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
   }

   @JsonIgnore
   public Object getDiff() {
      return diff;
   }

   @JsonIgnore
   public void setDiff(Object value) { 
      this.diff = value;
   }
   @JsonIgnore
   public String getEnterprise() {
      return enterprise;
   }

   @JsonIgnore
   public void setEnterprise(String value) { 
      this.enterprise = value;
   }
   @JsonIgnore
   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getEntities() {
      return entities;
   }

   @JsonIgnore
   public void setEntities(java.util.List<com.fasterxml.jackson.databind.JsonNode> value) { 
      this.entities = value;
   }
   @JsonIgnore
   public String getEntityID() {
      return entityID;
   }

   @JsonIgnore
   public void setEntityID(String value) { 
      this.entityID = value;
   }
   @JsonIgnore
   public String getEntityParentID() {
      return entityParentID;
   }

   @JsonIgnore
   public void setEntityParentID(String value) { 
      this.entityParentID = value;
   }
   @JsonIgnore
   public String getEntityParentType() {
      return entityParentType;
   }

   @JsonIgnore
   public void setEntityParentType(String value) { 
      this.entityParentType = value;
   }
   @JsonIgnore
   public EntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   @JsonIgnore
   public String getEntityType() {
      return entityType;
   }

   @JsonIgnore
   public void setEntityType(String value) { 
      this.entityType = value;
   }
   @JsonIgnore
   public String getUser() {
      return user;
   }

   @JsonIgnore
   public void setUser(String value) { 
      this.user = value;
   }
   @JsonIgnore
   public Float getEventReceivedTime() {
      return eventReceivedTime;
   }

   @JsonIgnore
   public void setEventReceivedTime(Float value) { 
      this.eventReceivedTime = value;
   }
   @JsonIgnore
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
   public void setExternalID(String value) { 
      this.externalID = value;
   }
   @JsonIgnore
   public String getType() {
      return type;
   }

   @JsonIgnore
   public void setType(String value) { 
      this.type = value;
   }
   

   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   

   public String toString() {
      return "EventLog [" + "diff=" + diff + ", enterprise=" + enterprise + ", entities=" + entities + ", entityID=" + entityID + ", entityParentID=" + entityParentID + ", entityParentType=" + entityParentType + ", entityScope=" + entityScope + ", entityType=" + entityType + ", user=" + user + ", eventReceivedTime=" + eventReceivedTime + ", externalID=" + externalID + ", type=" + type + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}