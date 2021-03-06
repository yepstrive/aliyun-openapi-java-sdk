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

package com.aliyuncs.domain_intl.transform.v20171218;

import com.aliyuncs.domain_intl.model.v20171218.CheckDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckDomainResponseUnmarshaller {

	public static CheckDomainResponse unmarshall(CheckDomainResponse checkDomainResponse, UnmarshallerContext context) {
		
		checkDomainResponse.setRequestId(context.stringValue("CheckDomainResponse.RequestId"));
		checkDomainResponse.setDomainName(context.stringValue("CheckDomainResponse.DomainName"));
		checkDomainResponse.setAvail(context.stringValue("CheckDomainResponse.Avail"));
		checkDomainResponse.setPremium(context.stringValue("CheckDomainResponse.Premium"));
		checkDomainResponse.setReason(context.stringValue("CheckDomainResponse.Reason"));
		checkDomainResponse.setPrice(context.longValue("CheckDomainResponse.Price"));
	 
	 	return checkDomainResponse;
	}
}