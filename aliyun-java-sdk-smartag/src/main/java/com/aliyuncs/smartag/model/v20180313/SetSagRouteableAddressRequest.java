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
public class SetSagRouteableAddressRequest extends RpcAcsRequest<SetSagRouteableAddressResponse> {
	
	public SetSagRouteableAddressRequest() {
		super("Smartag", "2018-03-13", "SetSagRouteableAddress", "smartag");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String sagId;

	private String ownerAccount;

	private Long ownerId;

	private String routeableAddress;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getSagId() {
		return this.sagId;
	}

	public void setSagId(String sagId) {
		this.sagId = sagId;
		if(sagId != null){
			putQueryParameter("SagId", sagId);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getRouteableAddress() {
		return this.routeableAddress;
	}

	public void setRouteableAddress(String routeableAddress) {
		this.routeableAddress = routeableAddress;
		if(routeableAddress != null){
			putQueryParameter("RouteableAddress", routeableAddress);
		}
	}

	@Override
	public Class<SetSagRouteableAddressResponse> getResponseClass() {
		return SetSagRouteableAddressResponse.class;
	}

}
