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


import net.nuagenetworks.vspk.v4_0.fetchers.MetadataTagsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "metadata", resourceName = "metadatas")
public class Metadata extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };

   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "metadataTagIDs")
   protected java.util.List<String> metadataTagIDs;
   
   @JsonProperty(value = "networkNotificationDisabled")
   protected Boolean networkNotificationDisabled;
   
   @JsonProperty(value = "blob")
   protected String blob;
   
   @JsonProperty(value = "global")
   protected Boolean globalMetadata;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadataTagsFetcher metadataTags;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public Metadata() {
      
      metadataTags = new MetadataTagsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   @JsonIgnore
   public String getName() {
      return name;
   }

   @JsonIgnore
   public void setName(String value) { 
      this.name = value;
   }
   @JsonIgnore
   public String getDescription() {
      return description;
   }

   @JsonIgnore
   public void setDescription(String value) { 
      this.description = value;
   }
   @JsonIgnore
   public java.util.List<String> getMetadataTagIDs() {
      return metadataTagIDs;
   }

   @JsonIgnore
   public void setMetadataTagIDs(java.util.List<String> value) { 
      this.metadataTagIDs = value;
   }
   @JsonIgnore
   public Boolean getNetworkNotificationDisabled() {
      return networkNotificationDisabled;
   }

   @JsonIgnore
   public void setNetworkNotificationDisabled(Boolean value) { 
      this.networkNotificationDisabled = value;
   }
   @JsonIgnore
   public String getBlob() {
      return blob;
   }

   @JsonIgnore
   public void setBlob(String value) { 
      this.blob = value;
   }
   @JsonIgnore
   public Boolean getGlobalMetadata() {
      return globalMetadata;
   }

   @JsonIgnore
   public void setGlobalMetadata(Boolean value) { 
      this.globalMetadata = value;
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
   public String getExternalID() {
      return externalID;
   }

   @JsonIgnore
   public void setExternalID(String value) { 
      this.externalID = value;
   }
   

   
   @JsonIgnore
   public MetadataTagsFetcher getMetadataTags() {
      return metadataTags;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "Metadata [" + "name=" + name + ", description=" + description + ", metadataTagIDs=" + metadataTagIDs + ", networkNotificationDisabled=" + networkNotificationDisabled + ", blob=" + blob + ", globalMetadata=" + globalMetadata + ", entityScope=" + entityScope + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}