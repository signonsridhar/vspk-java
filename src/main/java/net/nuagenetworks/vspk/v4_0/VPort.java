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


import net.nuagenetworks.vspk.v4_0.fetchers.TCAsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.RedirectionTargetsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.MetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.AggregateMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.DHCPOptionsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VirtualIPsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.AlarmsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.GlobalMetadatasFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VMsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VMInterfacesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.PolicyGroupsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.ContainersFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.ContainerInterfacesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.PortMappingsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.QOSsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.HostInterfacesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VPortMirrorsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.ApplicationperformancemanagementsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.BridgeInterfacesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.VRSsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.StatisticsFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.StatisticsPoliciesFetcher;
import net.nuagenetworks.vspk.v4_0.fetchers.EventLogsFetcher;

@JsonIgnoreProperties(ignoreUnknown = true)
@RestEntity(restName = "vport", resourceName = "vports")
public class VPort extends RestObject {

   private static final long serialVersionUID = 1L;

   
   public enum DPI { DISABLED, ENABLED, INHERITED };
   public enum AddressSpoofing { DISABLED, ENABLED, INHERITED };
   public enum EntityScope { ENTERPRISE, GLOBAL };
   public enum OperationalState { DOWN, INIT, UP };
   public enum Multicast { DISABLED, ENABLED, INHERITED };
   public enum Type { BRIDGE, CONTAINER, HOST, VM };
   public enum SystemType { HARDWARE, HARDWARE_VTEP, NUAGE_1, NUAGE_2, NUAGE_VRSG, SOFTWARE };

   
   @JsonProperty(value = "VLANID")
   protected String VLANID;
   
   @JsonProperty(value = "DPI")
   protected DPI DPI;
   
   @JsonProperty(value = "name")
   protected String name;
   
   @JsonProperty(value = "hasAttachedInterfaces")
   protected Boolean hasAttachedInterfaces;
   
   @JsonProperty(value = "lastUpdatedBy")
   protected String lastUpdatedBy;
   
   @JsonProperty(value = "active")
   protected Boolean active;
   
   @JsonProperty(value = "addressSpoofing")
   protected AddressSpoofing addressSpoofing;
   
   @JsonProperty(value = "description")
   protected String description;
   
   @JsonProperty(value = "entityScope")
   protected EntityScope entityScope;
   
   @JsonProperty(value = "domainID")
   protected String domainID;
   
   @JsonProperty(value = "zoneID")
   protected String zoneID;
   
   @JsonProperty(value = "operationalState")
   protected OperationalState operationalState;
   
   @JsonProperty(value = "associatedFloatingIPID")
   protected String associatedFloatingIPID;
   
   @JsonProperty(value = "associatedMulticastChannelMapID")
   protected String associatedMulticastChannelMapID;
   
   @JsonProperty(value = "associatedSendMulticastChannelMapID")
   protected String associatedSendMulticastChannelMapID;
   
   @JsonProperty(value = "multiNICVPortID")
   protected String multiNICVPortID;
   
   @JsonProperty(value = "multicast")
   protected Multicast multicast;
   
   @JsonProperty(value = "externalID")
   protected String externalID;
   
   @JsonProperty(value = "type")
   protected Type type;
   
   @JsonProperty(value = "systemType")
   protected SystemType systemType;
   

   
   @JsonIgnore
   private TCAsFetcher tCAs;
   
   @JsonIgnore
   private RedirectionTargetsFetcher redirectionTargets;
   
   @JsonIgnore
   private MetadatasFetcher metadatas;
   
   @JsonIgnore
   private AggregateMetadatasFetcher aggregateMetadatas;
   
   @JsonIgnore
   private DHCPOptionsFetcher dHCPOptions;
   
   @JsonIgnore
   private VirtualIPsFetcher virtualIPs;
   
   @JsonIgnore
   private AlarmsFetcher alarms;
   
   @JsonIgnore
   private GlobalMetadatasFetcher globalMetadatas;
   
   @JsonIgnore
   private VMsFetcher vMs;
   
   @JsonIgnore
   private VMInterfacesFetcher vMInterfaces;
   
   @JsonIgnore
   private PolicyGroupsFetcher policyGroups;
   
   @JsonIgnore
   private ContainersFetcher containers;
   
   @JsonIgnore
   private ContainerInterfacesFetcher containerInterfaces;
   
   @JsonIgnore
   private PortMappingsFetcher portMappings;
   
   @JsonIgnore
   private QOSsFetcher qOSs;
   
   @JsonIgnore
   private HostInterfacesFetcher hostInterfaces;
   
   @JsonIgnore
   private VPortMirrorsFetcher vPortMirrors;
   
   @JsonIgnore
   private ApplicationperformancemanagementsFetcher applicationperformancemanagements;
   
   @JsonIgnore
   private BridgeInterfacesFetcher bridgeInterfaces;
   
   @JsonIgnore
   private VRSsFetcher vRSs;
   
   @JsonIgnore
   private StatisticsFetcher statistics;
   
   @JsonIgnore
   private StatisticsPoliciesFetcher statisticsPolicies;
   
   @JsonIgnore
   private EventLogsFetcher eventLogs;
   

   public VPort() {
      multicast = Multicast.INHERITED;
      type = Type.VM;
      addressSpoofing = AddressSpoofing.INHERITED;
      operationalState = OperationalState.INIT;
      
      tCAs = new TCAsFetcher(this);
      
      redirectionTargets = new RedirectionTargetsFetcher(this);
      
      metadatas = new MetadatasFetcher(this);
      
      aggregateMetadatas = new AggregateMetadatasFetcher(this);
      
      dHCPOptions = new DHCPOptionsFetcher(this);
      
      virtualIPs = new VirtualIPsFetcher(this);
      
      alarms = new AlarmsFetcher(this);
      
      globalMetadatas = new GlobalMetadatasFetcher(this);
      
      vMs = new VMsFetcher(this);
      
      vMInterfaces = new VMInterfacesFetcher(this);
      
      policyGroups = new PolicyGroupsFetcher(this);
      
      containers = new ContainersFetcher(this);
      
      containerInterfaces = new ContainerInterfacesFetcher(this);
      
      portMappings = new PortMappingsFetcher(this);
      
      qOSs = new QOSsFetcher(this);
      
      hostInterfaces = new HostInterfacesFetcher(this);
      
      vPortMirrors = new VPortMirrorsFetcher(this);
      
      applicationperformancemanagements = new ApplicationperformancemanagementsFetcher(this);
      
      bridgeInterfaces = new BridgeInterfacesFetcher(this);
      
      vRSs = new VRSsFetcher(this);
      
      statistics = new StatisticsFetcher(this);
      
      statisticsPolicies = new StatisticsPoliciesFetcher(this);
      
      eventLogs = new EventLogsFetcher(this);
      
   }

   @JsonIgnore
   public String getVLANID() {
      return VLANID;
   }

   @JsonIgnore
   public void setVLANID(String value) { 
      this.VLANID = value;
   }
   @JsonIgnore
   public DPI getDPI() {
      return DPI;
   }

   @JsonIgnore
   public void setDPI(DPI value) { 
      this.DPI = value;
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
   public Boolean getHasAttachedInterfaces() {
      return hasAttachedInterfaces;
   }

   @JsonIgnore
   public void setHasAttachedInterfaces(Boolean value) { 
      this.hasAttachedInterfaces = value;
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
   public Boolean getActive() {
      return active;
   }

   @JsonIgnore
   public void setActive(Boolean value) { 
      this.active = value;
   }
   @JsonIgnore
   public AddressSpoofing getAddressSpoofing() {
      return addressSpoofing;
   }

   @JsonIgnore
   public void setAddressSpoofing(AddressSpoofing value) { 
      this.addressSpoofing = value;
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
   public EntityScope getEntityScope() {
      return entityScope;
   }

   @JsonIgnore
   public void setEntityScope(EntityScope value) { 
      this.entityScope = value;
   }
   @JsonIgnore
   public String getDomainID() {
      return domainID;
   }

   @JsonIgnore
   public void setDomainID(String value) { 
      this.domainID = value;
   }
   @JsonIgnore
   public String getZoneID() {
      return zoneID;
   }

   @JsonIgnore
   public void setZoneID(String value) { 
      this.zoneID = value;
   }
   @JsonIgnore
   public OperationalState getOperationalState() {
      return operationalState;
   }

   @JsonIgnore
   public void setOperationalState(OperationalState value) { 
      this.operationalState = value;
   }
   @JsonIgnore
   public String getAssociatedFloatingIPID() {
      return associatedFloatingIPID;
   }

   @JsonIgnore
   public void setAssociatedFloatingIPID(String value) { 
      this.associatedFloatingIPID = value;
   }
   @JsonIgnore
   public String getAssociatedMulticastChannelMapID() {
      return associatedMulticastChannelMapID;
   }

   @JsonIgnore
   public void setAssociatedMulticastChannelMapID(String value) { 
      this.associatedMulticastChannelMapID = value;
   }
   @JsonIgnore
   public String getAssociatedSendMulticastChannelMapID() {
      return associatedSendMulticastChannelMapID;
   }

   @JsonIgnore
   public void setAssociatedSendMulticastChannelMapID(String value) { 
      this.associatedSendMulticastChannelMapID = value;
   }
   @JsonIgnore
   public String getMultiNICVPortID() {
      return multiNICVPortID;
   }

   @JsonIgnore
   public void setMultiNICVPortID(String value) { 
      this.multiNICVPortID = value;
   }
   @JsonIgnore
   public Multicast getMulticast() {
      return multicast;
   }

   @JsonIgnore
   public void setMulticast(Multicast value) { 
      this.multicast = value;
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
   public Type getType() {
      return type;
   }

   @JsonIgnore
   public void setType(Type value) { 
      this.type = value;
   }
   @JsonIgnore
   public SystemType getSystemType() {
      return systemType;
   }

   @JsonIgnore
   public void setSystemType(SystemType value) { 
      this.systemType = value;
   }
   

   
   @JsonIgnore
   public TCAsFetcher getTCAs() {
      return tCAs;
   }
   
   @JsonIgnore
   public RedirectionTargetsFetcher getRedirectionTargets() {
      return redirectionTargets;
   }
   
   @JsonIgnore
   public MetadatasFetcher getMetadatas() {
      return metadatas;
   }
   
   @JsonIgnore
   public AggregateMetadatasFetcher getAggregateMetadatas() {
      return aggregateMetadatas;
   }
   
   @JsonIgnore
   public DHCPOptionsFetcher getDHCPOptions() {
      return dHCPOptions;
   }
   
   @JsonIgnore
   public VirtualIPsFetcher getVirtualIPs() {
      return virtualIPs;
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
   public VMsFetcher getVMs() {
      return vMs;
   }
   
   @JsonIgnore
   public VMInterfacesFetcher getVMInterfaces() {
      return vMInterfaces;
   }
   
   @JsonIgnore
   public PolicyGroupsFetcher getPolicyGroups() {
      return policyGroups;
   }
   
   @JsonIgnore
   public ContainersFetcher getContainers() {
      return containers;
   }
   
   @JsonIgnore
   public ContainerInterfacesFetcher getContainerInterfaces() {
      return containerInterfaces;
   }
   
   @JsonIgnore
   public PortMappingsFetcher getPortMappings() {
      return portMappings;
   }
   
   @JsonIgnore
   public QOSsFetcher getQOSs() {
      return qOSs;
   }
   
   @JsonIgnore
   public HostInterfacesFetcher getHostInterfaces() {
      return hostInterfaces;
   }
   
   @JsonIgnore
   public VPortMirrorsFetcher getVPortMirrors() {
      return vPortMirrors;
   }
   
   @JsonIgnore
   public ApplicationperformancemanagementsFetcher getApplicationperformancemanagements() {
      return applicationperformancemanagements;
   }
   
   @JsonIgnore
   public BridgeInterfacesFetcher getBridgeInterfaces() {
      return bridgeInterfaces;
   }
   
   @JsonIgnore
   public VRSsFetcher getVRSs() {
      return vRSs;
   }
   
   @JsonIgnore
   public StatisticsFetcher getStatistics() {
      return statistics;
   }
   
   @JsonIgnore
   public StatisticsPoliciesFetcher getStatisticsPolicies() {
      return statisticsPolicies;
   }
   
   @JsonIgnore
   public EventLogsFetcher getEventLogs() {
      return eventLogs;
   }
   

   public String toString() {
      return "VPort [" + "VLANID=" + VLANID + ", DPI=" + DPI + ", name=" + name + ", hasAttachedInterfaces=" + hasAttachedInterfaces + ", lastUpdatedBy=" + lastUpdatedBy + ", active=" + active + ", addressSpoofing=" + addressSpoofing + ", description=" + description + ", entityScope=" + entityScope + ", domainID=" + domainID + ", zoneID=" + zoneID + ", operationalState=" + operationalState + ", associatedFloatingIPID=" + associatedFloatingIPID + ", associatedMulticastChannelMapID=" + associatedMulticastChannelMapID + ", associatedSendMulticastChannelMapID=" + associatedSendMulticastChannelMapID + ", multiNICVPortID=" + multiNICVPortID + ", multicast=" + multicast + ", externalID=" + externalID + ", type=" + type + ", systemType=" + systemType + ", id=" + id + ", parentId=" + parentId + ", parentType=" + parentType + ", creationDate=" + creationDate + ", lastUpdatedDate="
              + lastUpdatedDate + ", owner=" + owner  + "]";
   }
   
   
}