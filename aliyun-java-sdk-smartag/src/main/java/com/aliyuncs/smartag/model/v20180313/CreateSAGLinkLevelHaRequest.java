/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateSAGLinkLevelHaRequest extends RpcAcsRequest<CreateSAGLinkLevelHaResponse> {
	
	public CreateSAGLinkLevelHaRequest() {
		super("Smartag", "2018-03-13", "CreateSAGLinkLevelHa", "smartag");
	}

	private Long resourceOwnerId;

	private String backupLinkId;

	private String resourceOwnerAccount;

	private String haType;

	private String ownerAccount;

	private String mainLinkRegionId;

	private String smartAGId;

	private Long ownerId;

	private String mainLinkId;

	private String backupLinkRegionId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getBackupLinkId() {
		return this.backupLinkId;
	}

	public void setBackupLinkId(String backupLinkId) {
		this.backupLinkId = backupLinkId;
		if(backupLinkId != null){
			putQueryParameter("BackupLinkId", backupLinkId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getHaType() {
		return this.haType;
	}

	public void setHaType(String haType) {
		this.haType = haType;
		if(haType != null){
			putQueryParameter("HaType", haType);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getMainLinkRegionId() {
		return this.mainLinkRegionId;
	}

	public void setMainLinkRegionId(String mainLinkRegionId) {
		this.mainLinkRegionId = mainLinkRegionId;
		if(mainLinkRegionId != null){
			putQueryParameter("MainLinkRegionId", mainLinkRegionId);
		}
	}

	public String getSmartAGId() {
		return this.smartAGId;
	}

	public void setSmartAGId(String smartAGId) {
		this.smartAGId = smartAGId;
		if(smartAGId != null){
			putQueryParameter("SmartAGId", smartAGId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getMainLinkId() {
		return this.mainLinkId;
	}

	public void setMainLinkId(String mainLinkId) {
		this.mainLinkId = mainLinkId;
		if(mainLinkId != null){
			putQueryParameter("MainLinkId", mainLinkId);
		}
	}

	public String getBackupLinkRegionId() {
		return this.backupLinkRegionId;
	}

	public void setBackupLinkRegionId(String backupLinkRegionId) {
		this.backupLinkRegionId = backupLinkRegionId;
		if(backupLinkRegionId != null){
			putQueryParameter("BackupLinkRegionId", backupLinkRegionId);
		}
	}

	@Override
	public Class<CreateSAGLinkLevelHaResponse> getResponseClass() {
		return CreateSAGLinkLevelHaResponse.class;
	}

}
