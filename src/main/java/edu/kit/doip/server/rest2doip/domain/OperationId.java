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

import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 */
@Schema(description = "The identifier of the operation to be performed:\n\n"
        + "0.DOIP/Op.Hello" + ": An operation to allow a client to get information about the DOIP service.\n\n"
        + "0.DOIP/Op.Create" + ": An operation to create a digital object within the DOIP service.  The target of a creation operation is the DOIP service itself.\n\n"
        + "0.DOIP/Op.Retrieve" + ": An operation to retrieve (some parts of the) information represented by the target DO.\n\n"
        + "0.DOIP/Op.Update" + ": An operation to update (some parts of the) information represented by the target DO.\n\n"
        + "0.DOIP/Op.Delete" + ": An operation to remove the target DO from the management of the DOIP service.\n\n"
        + "0.DOIP/Op.Search" + ": An operation to discover digital objects by searching metadata contained in the set of digital objects managed by the DOIP service.\n\n"
        + "0.DOIP/Op.ListOperations" + ": An operation to request the list of operations that can be invoked on the target DO. \n\n"
        + "0.DOIP/Op.Validate" + ": An operation to validate the given document with the selected schema.\n\n")
public enum OperationId {

  @Schema(description = "An operation to allow a client to get information about the DOIP service.")
  HELLO("0.DOIP/Op.Hello"),
  @Schema(description = "An operation to create a digital object within the DOIP service.  The target of a creation operation is the DOIP service itself.")
  CREATE("0.DOIP/Op.Create"),
  RETRRIEVE("0.DOIP/Op.Retrieve"),
  UPDATE("0.DOIP/Op.Update"),
  DELETE("0.DOIP/Op.Delete"),
  SEARCH("0.DOIP/Op.Search"),
  LIST_OPERATIONS("0.DOIP/Op.ListOperations"),
  VALIDATE("0.DOIP/Op.Validate");

  private String label;

  OperationId(String label) {
    this.label = label;
  }
  
  @JsonValue
  public String getLabel() {
    return label;
  }

  public OperationId labelOf(String label) {
    OperationId returnValue = null;
    for (OperationId item : values()) {
      if (item.getLabel().equals(label)) {
        returnValue = item;
        break;
      }
    }
    return returnValue;
  }
  
  public String toString() {
    return label;
  }
}

