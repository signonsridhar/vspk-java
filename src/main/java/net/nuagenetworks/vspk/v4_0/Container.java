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
import net.nuagenetworks.vspk.v4_0.fetchers.ContainerInterfacesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.ContainerResyncsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VRSsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "container", resourceName = "containers")
public class Container extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum ReasonType { BLOCKED_LAST, BLOCKED_UNKNOWN, CRASHED_LAST, CRASHED_UNKNOWN, NOSTATE_LAST, NOSTATE_UNKNOWN, PAUSED_DUMP, PAUSED_FROM_SNAPSHOT, PAUSED_IOERROR, PAUSED_LAST, PAUSED_MIGRATION, PAUSED_SAVE, PAUSED_SHUTTING_DOWN, PAUSED_UNKNOWN, PAUSED_USER, PAUSED_WATCHDOG, RUNNING_BOOTED, RUNNING_FROM_SNAPSHOT, RUNNING_LAST, RUNNING_MIGRATED, RUNNING_MIGRATION_CANCELED, RUNNING_RESTORED, RUNNING_SAVE_CANCELED, RUNNING_UNKNOWN, RUNNING_UNPAUSED, SHUTDOWN_LAST, SHUTDOWN_UNKNOWN, SHUTDOWN_USER, SHUTOFF_CRASHED, SHUTOFF_DESTROYED, SHUTOFF_FAILED, SHUTOFF_FROM_SNAPSHOT, SHUTOFF_LAST, SHUTOFF_MIGRATED, SHUTOFF_SAVED, SHUTOFF_SHUTDOWN, SHUTOFF_UNKNOWN, UNKNOWN };
   public enum DeleteMode { TIMER };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum Status { BLOCKED, CRASHED, DELETE_PENDING, INIT, LAST, NOSTATE, PAUSED, RUNNING, SHUTDOWN, SHUTOFF, UNKNOWN, UNREACHABLE };

   
   @JsonProperty(value = "l2DomainIDs")
   protected java.util.List<String> l2DomainIDs;
   
   @JsonProperty(value = "VRSID")
   protected String VRSID;
   
   @JsonProperty(value = "UUID")
   protected String UUID;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "reasonType")
   protected ReasonType reasonType;
   
   @JsonProperty(value = "deleteExpiry")
   protected Long deleteExpiry;
   
   @JsonProperty(value = "deleteMode")
   protected DeleteMode deleteMode;
   
   @JsonProperty(value = "resyncInfo")
   protected Object resyncInfo;
   
   @JsonProperty(value = "siteIdentifier")
   protected String siteIdentifier;
   
   @JsonProperty(value = "imageID")
   protected String imageID;
   
   @JsonProperty(value = "imageName")
   protected String imageName;
   
   @JsonProperty(value = "interfaces")
   protected java.util.List<com.fasterxml.jackson.databind.JsonNode> interfaces;
   
   @JsonProperty(value = "enterpriseID")
   protected String enterpriseID;
   
   @JsonProperty(value = "enterpriseName")
   protected String enterpriseName;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "domainIDs")
   protected java.util.List<String> domainIDs;
   
   @JsonProperty(value = "zoneIDs")
   protected java.util.List<String> zoneIDs;
   
   @JsonProperty(value = "orchestrationID")
   protected String orchestrationID;
   
   @JsonProperty(value = "userID")
   protected String userID;
   
   @JsonProperty(value = "userName")
   protected String userName;
   
   @JsonProperty(value = "status")
   protected Status status;
   
   @JsonProperty(value = "subnetIDs")
   protected java.util.List<String> subnetIDs;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "hypervisorIP")
   protected String hypervisorIP;
   

   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private ContainerInterfacesFetcher containerInterfaces;
   
   @JsonIgnore
   private ContainerResyncsFetcher containerResyncs;
   
   @JsonIgnore
   private VRSsFetcher vRSs;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public Container() {
      
      metadatas = new MetadatasFetcher(this);
      
      alarms = new AlarmsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      containerInterfaces = new ContainerInterfacesFetcher(this);
      
      containerResyncs = new ContainerResyncsFetcher(this);
      
      vRSs = new VRSsFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   @JsonIgnore
   public java.util.List<String> getL2DomainIDs() {
      return l2DomainIDs;
   }

   @JsonIgnore
   public void setL2DomainIDs(java.util.List<String> value) { 
      this.l2DomainIDs = value;
   }
   @JsonIgnore
   public String getVRSID() {
      return VRSID;
   }

   @JsonIgnore
   public void setVRSID(String value) { 
      this.VRSID = value;
   }
   @JsonIgnore
   public String getUUID() {
      return UUID;
   }

   @JsonIgnore
   public void setUUID(String value) { 
      this.UUID = value;
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
   public String getLastUpdatedBy() {
      return lastUpdatedBy;
   }

   @JsonIgnore
   public void setLastUpdatedBy(String value) { 
      this.lastUpdatedBy = value;
   }
   @JsonIgnore
   public ReasonType getReasonType() {
      return reasonType;
   }

   @JsonIgnore
   public void setReasonType(ReasonType value) { 
      this.reasonType = value;
   }
   @JsonIgnore
   public Long getDeleteExpiry() {
      return deleteExpiry;
   }

   @JsonIgnore
   public void setDeleteExpiry(Long value) { 
      this.deleteExpiry = value;
   }
   @JsonIgnore
   public DeleteMode getDeleteMode() {
      return deleteMode;
   }

   @JsonIgnore
   public void setDeleteMode(DeleteMode value) { 
      this.deleteMode = value;
   }
   @JsonIgnore
   public Object getResyncInfo() {
      return resyncInfo;
   }

   @JsonIgnore
   public void setResyncInfo(Object value) { 
      this.resyncInfo = value;
   }
   @JsonIgnore
   public String getSiteIdentifier() {
      return siteIdentifier;
   }

   @JsonIgnore
   public void setSiteIdentifier(String value) { 
      this.siteIdentifier = value;
   }
   @JsonIgnore
   public String getImageID() {
      return imageID;
   }

   @JsonIgnore
   public void setImageID(String value) { 
      this.imageID = value;
   }
   @JsonIgnore
   public String getImageName() {
      return imageName;
   }

   @JsonIgnore
   public void setImageName(String value) { 
      this.imageName = value;
   }
   @JsonIgnore
   public java.util.List<com.fasterxml.jackson.databind.JsonNode> getInterfaces() {
      return interfaces;
   }

   @JsonIgnore
   public void setInterfaces(java.util.List<com.fasterxml.jackson.databind.JsonNode> value) { 
      this.interfaces = value;
   }
   @JsonIgnore
   public String getEnterpriseID() {
      return enterpriseID;
   }

   @JsonIgnore
   public void setEnterpriseID(String value) { 
      this.enterpriseID = value;
   }
   @JsonIgnore
   public String getEnterpriseName() {
      return enterpriseName;
   }

   @JsonIgnore
   public void setEnterpriseName(String value) { 
      this.enterpriseName = value;
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
   public java.util.List<String> getDomainIDs() {
      return domainIDs;
   }

   @JsonIgnore
   public void setDomainIDs(java.util.List<String> value) { 
      this.domainIDs = value;
   }
   @JsonIgnore
   public java.util.List<String> getZoneIDs() {
      return zoneIDs;
   }

   @JsonIgnore
   public void setZoneIDs(java.util.List<String> value) { 
      this.zoneIDs = value;
   }
   @JsonIgnore
   public String getOrchestrationID() {
      return orchestrationID;
   }

   @JsonIgnore
   public void setOrchestrationID(String value) { 
      this.orchestrationID = value;
   }
   @JsonIgnore
   public String getUserID() {
      return userID;
   }

   @JsonIgnore
   public void setUserID(String value) { 
      this.userID = value;
   }
   @JsonIgnore
   public String getUserName() {
      return userName;
   }

   @JsonIgnore
   public void setUserName(String value) { 
      this.userName = value;
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
   public java.util.List<String> getSubnetIDs() {
      return subnetIDs;
   }

   @JsonIgnore
   public void setSubnetIDs(java.util.List<String> value) { 
      this.subnetIDs = value;
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
   public String getHypervisorIP() {
      return hypervisorIP;
   }

   @JsonIgnore
   public void setHypervisorIP(String value) { 
      this.hypervisorIP = value;
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
   public ContainerInterfacesFetcher getContainerInterfaces() {
      return containerInterfaces;
   }
   
   @JsonIgnore
   public ContainerResyncsFetcher getContainerResyncs() {
      return containerResyncs;
   }
   
   @JsonIgnore
   public VRSsFetcher getVRSs() {
      return vRSs;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "Container [" + "l2DomainIDs=" + l2DomainIDs + ", VRSID=" + VRSID + ", UUID=" + UUID + ", name=" + name + ", lastUpdatedBy=" + lastUpdatedBy + ", reasonType=" + reasonType + ", deleteExpiry=" + deleteExpiry + ", deleteMode=" + deleteMode + ", resyncInfo=" + resyncInfo + ", siteIdentifier=" + siteIdentifier + ", imageID=" + imageID + ", imageName=" + imageName + ", interfaces=" + interfaces + ", enterpriseID=" + enterpriseID + ", enterpriseName=" + enterpriseName + ", entityScope=" + entityScope + ", domainIDs=" + domainIDs + ", zoneIDs=" + zoneIDs + ", orchestrationID=" + orchestrationID + ", userID=" + userID + ", userName=" + userName + ", status=" + status + ", subnetIDs=" + subnetIDs + ", externalID=" + externalID + ", hypervisorIP=" + hypervisorIP + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}