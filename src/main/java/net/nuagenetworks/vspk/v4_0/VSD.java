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
import net.nuagenetworks.vspk.v4_0.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.JobsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VSDComponentsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vsd", resourceName = "vsds")
public class VSD extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum Mode { CLUSTER, STANDALONE };
   public enum Status { ADMIN_DOWN, DOWN, UP };

   
   @JsonProperty(value = "URL")
   protected String URL;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "managementIP")
   protected String managementIP;
   
   @JsonProperty(value = "lastStateChange")
   protected Long lastStateChange;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "address")
   protected String address;
   
   @JsonProperty(value = "peakCPUUsage")
   protected Float peakCPUUsage;
   
   @JsonProperty(value = "peakMemoryUsage")
   protected Float peakMemoryUsage;
   
   @JsonProperty(value = "peerAddresses")
   protected String peerAddresses;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "messages")
   protected java.util.List<String> messages;
   
   @JsonProperty(value = "disks")
   protected java.util.List<DiskStat> disks;
   
   @JsonProperty(value = "alreadyMarkedForUnavailable")
   protected Boolean alreadyMarkedForUnavailable;
   
   @JsonProperty(value = "unavailableTimestamp")
   protected Long unavailableTimestamp;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "location")
   protected String location;
   
   @JsonProperty(value = "mode")
   protected Mode mode;
   
   @JsonProperty(value = "productVersion")
   protected String productVersion;
   
   @JsonProperty(value = "status")
   protected Status status;
   
   @JsonProperty(value = "currentCPUUsage")
   protected Float currentCPUUsage;
   
   @JsonProperty(value = "currentMemoryUsage")
   protected Float currentMemoryUsage;
   
   @JsonProperty(value = "averageCPUUsage")
   protected Float averageCPUUsage;
   
   @JsonProperty(value = "averageMemoryUsage")
   protected Float averageMemoryUsage;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private JobsFetcher jobs;
   
   @JsonIgnore
   private VSDComponentsFetcher vSDComponents;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public VSD() {
      
      metadatas = new MetadatasFetcher(this);
      
      alarms = new AlarmsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      jobs = new JobsFetcher(this);
      
      vSDComponents = new VSDComponentsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   @JsonIgnore
   public String getURL() {
      return URL;
   }

   @JsonIgnore
   public void setURL(String value) { 
      this.URL = value;
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
   public String getManagementIP() {
      return managementIP;
   }

   @JsonIgnore
   public void setManagementIP(String value) { 
      this.managementIP = value;
   }
   @JsonIgnore
   public Long getLastStateChange() {
      return lastStateChange;
   }

   @JsonIgnore
   public void setLastStateChange(Long value) { 
      this.lastStateChange = value;
   }
   @JsonIgnore
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   @JsonIgnore
   public String getAddress() {
      return address;
   }

   @JsonIgnore
   public void setAddress(String value) { 
      this.address = value;
   }
   @JsonIgnore
   public Float getPeakCPUUsage() {
      return peakCPUUsage;
   }

   @JsonIgnore
   public void setPeakCPUUsage(Float value) { 
      this.peakCPUUsage = value;
   }
   @JsonIgnore
   public Float getPeakMemoryUsage() {
      return peakMemoryUsage;
   }

   @JsonIgnore
   public void setPeakMemoryUsage(Float value) { 
      this.peakMemoryUsage = value;
   }
   @JsonIgnore
   public String getPeerAddresses() {
      return peerAddresses;
   }

   @JsonIgnore
   public void setPeerAddresses(String value) { 
      this.peerAddresses = value;
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
   public java.util.List<String> getMessages() {
      return messages;
   }

   @JsonIgnore
   public void setMessages(java.util.List<String> value) { 
      this.messages = value;
   }
   @JsonIgnore
   public java.util.List<DiskStat> getDisks() {
      return disks;
   }

   @JsonIgnore
   public void setDisks(java.util.List<DiskStat> value) { 
      this.disks = value;
   }
   @JsonIgnore
   public Boolean getAlreadyMarkedForUnavailable() {
      return alreadyMarkedForUnavailable;
   }

   @JsonIgnore
   public void setAlreadyMarkedForUnavailable(Boolean value) { 
      this.alreadyMarkedForUnavailable = value;
   }
   @JsonIgnore
   public Long getUnavailableTimestamp() {
      return unavailableTimestamp;
   }

   @JsonIgnore
   public void setUnavailableTimestamp(Long value) { 
      this.unavailableTimestamp = value;
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
   public String getLocation() {
      return location;
   }

   @JsonIgnore
   public void setLocation(String value) { 
      this.location = value;
   }
   @JsonIgnore
   public Mode getMode() {
      return mode;
   }

   @JsonIgnore
   public void setMode(Mode value) { 
      this.mode = value;
   }
   @JsonIgnore
   public String getProductVersion() {
      return productVersion;
   }

   @JsonIgnore
   public void setProductVersion(String value) { 
      this.productVersion = value;
   }
   @JsonIgnore
   public Status getStatus() {
      return status;
   }

   @JsonIgnore
   public void setStatus(Status value) { 
      this.status = value;
   }
   @JsonIgnore
   public Float getCurrentCPUUsage() {
      return currentCPUUsage;
   }

   @JsonIgnore
   public void setCurrentCPUUsage(Float value) { 
      this.currentCPUUsage = value;
   }
   @JsonIgnore
   public Float getCurrentMemoryUsage() {
      return currentMemoryUsage;
   }

   @JsonIgnore
   public void setCurrentMemoryUsage(Float value) { 
      this.currentMemoryUsage = value;
   }
   @JsonIgnore
   public Float getAverageCPUUsage() {
      return averageCPUUsage;
   }

   @JsonIgnore
   public void setAverageCPUUsage(Float value) { 
      this.averageCPUUsage = value;
   }
   @JsonIgnore
   public Float getAverageMemoryUsage() {
      return averageMemoryUsage;
   }

   @JsonIgnore
   public void setAverageMemoryUsage(Float value) { 
      this.averageMemoryUsage = value;
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
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public AlarmsFetcher getAlarms() {
      return alarms;
   }
   
   @JsonIgnore
   public GlobalMetadatasFetcher getGlobalMetadatas() {
      return globalMetadatas;
   }
   
   @JsonIgnore
   public JobsFetcher getJobs() {
      return jobs;
   }
   
   @JsonIgnore
   public VSDComponentsFetcher getVSDComponents() {
      return vSDComponents;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "VSD [" + "URL=" + URL + ", name=" + name + ", managementIP=" + managementIP + ", lastStateChange=" + lastStateChange + ", lastUpdatedBy=" + lastUpdatedBy + ", address=" + address + ", peakCPUUsage=" + peakCPUUsage + ", peakMemoryUsage=" + peakMemoryUsage + ", peerAddresses=" + peerAddresses + ", description=" + description + ", messages=" + messages + ", disks=" + disks + ", alreadyMarkedForUnavailable=" + alreadyMarkedForUnavailable + ", unavailableTimestamp=" + unavailableTimestamp + ", entityScope=" + entityScope + ", location=" + location + ", mode=" + mode + ", productVersion=" + productVersion + ", status=" + status + ", currentCPUUsage=" + currentCPUUsage + ", currentMemoryUsage=" + currentMemoryUsage + ", averageCPUUsage=" + averageCPUUsage + ", averageMemoryUsage=" + averageMemoryUsage + ", externalID=" + externalID + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}