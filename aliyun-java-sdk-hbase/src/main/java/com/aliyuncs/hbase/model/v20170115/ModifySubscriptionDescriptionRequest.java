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

package com.aliyuncs.hbase.model.v20170115;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifySubscriptionDescriptionRequest extends RpcAcsRequest<ModifySubscriptionDescriptionResponse> {
	
	public ModifySubscriptionDescriptionRequest() {
		super("HBase", "2017-01-15", "ModifySubscriptionDescription");
	}

	private Long resourceOwnerId;

	private String subscriptionDescription;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String subscriptionId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getSubscriptionDescription() {
		return this.subscriptionDescription;
	}

	public void setSubscriptionDescription(String subscriptionDescription) {
		this.subscriptionDescription = subscriptionDescription;
		if(subscriptionDescription != null){
			putQueryParameter("SubscriptionDescription", subscriptionDescription);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getSubscriptionId() {
		return this.subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
		if(subscriptionId != null){
			putQueryParameter("SubscriptionId", subscriptionId);
		}
	}

	@Override
	public Class<ModifySubscriptionDescriptionResponse> getResponseClass() {
		return ModifySubscriptionDescriptionResponse.class;
	}

}
