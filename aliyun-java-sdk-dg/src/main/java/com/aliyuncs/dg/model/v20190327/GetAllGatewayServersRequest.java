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

package com.aliyuncs.dg.model.v20190327;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class GetAllGatewayServersRequest extends RpcAcsRequest<GetAllGatewayServersResponse> {
	
	public GetAllGatewayServersRequest() {
		super("dg", "2019-03-27", "GetAllGatewayServers", "dg");
		setProtocol(ProtocolType.HTTPS);
	}

	@Override
	public Class<GetAllGatewayServersResponse> getResponseClass() {
		return GetAllGatewayServersResponse.class;
	}

}
