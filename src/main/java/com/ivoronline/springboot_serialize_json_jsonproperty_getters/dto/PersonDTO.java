package com.ivoronline.springboot_serialize_json_jsonproperty_getters.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonDTO {

  //PROPERTIES
  public Integer id;
  public String  name;
  public Integer age;

  //GETTERS (Used for Serialization)
  @JsonProperty("ID"         ) public Integer getId  () { return id;               }
  @JsonProperty("Person Name") public String  getName() { return "Getter " + name; }
  @JsonProperty("Age"        ) public Integer getAge () { return age;              }

}
