/*
 * Copyright 2018 Confluent Inc.
 *
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

package io.confluent.kafka.schemaregistry.client.rest.entities.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.IOException;

import io.confluent.kafka.schemaregistry.utils.JacksonMapper;

public class RegisterSchemaResponse {

  private int id;

  public static RegisterSchemaResponse fromJson(String json) throws IOException {
    return JacksonMapper.INSTANCE.readValue(json, RegisterSchemaResponse.class);
  }

  @JsonProperty("id")
  public int getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(int id) {
    this.id = id;
  }

  public String toJson() throws IOException {
    return JacksonMapper.INSTANCE.writeValueAsString(this);
  }
}
