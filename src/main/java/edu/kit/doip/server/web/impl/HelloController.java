/*
 * Copyright 2021 hartmann-v.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.kit.doip.server.web.impl;

import edu.kit.doip.server.rest2doip.domain.DoipRequest;
import edu.kit.doip.server.rest2doip.domain.DoipResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 */
@RestController
public class HelloController {

	@RequestMapping("/doip")
	public DoipResponse index(@RequestBody final DoipRequest doipRequest) {
    DoipResponse dr = new DoipResponse();
    dr.setOperationId(doipRequest.getOperationId().toString());
		return dr;
	}

}
