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
package edu.kit.doip.server.rest2doip.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;

/**
 */
@Schema(description = "DOIP response.")
@Data
public class DoipResponse {

  @NotBlank
  @Size(min = 0, max = 4096)
  @Schema(description = "the identifier of the request provided by the client; shall be unique within a given DOIP session so clients can distinguish between DOIP service responses. The requestId shall be a string not exceeding 4096 bits.")
  String requestId;
  @NotBlank
  @Schema(description = "the identifier of the client.")
  String clientId;
  @NotBlank
  @Schema(description = "the identifier of the DO on which the operation is to be invoked; the DOIP service could itself be the target.")
  String targetId;
  @NotBlank
  @Schema(description = "the identifier of the operation to be performed")
  String operationId;
//Attributes attributes;
//Authentication authentication;
  byte[] input;
}
