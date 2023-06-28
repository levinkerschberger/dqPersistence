
package de.dqualizer.persistenceservice.rqa.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "object",
    "activity"
})
@Generated("jsonschema2pojo")
public class Artifact implements Serializable
{

    /**
     * dq_id of an Actor or Work Object, where the loadtest was specified
     * (Required)
     * 
     */
    @JsonProperty("object")
    @JsonPropertyDescription("dq_id of an Actor or Work Object, where the loadtest was specified")
    @NotNull
    private String object;
    /**
     * dq_id of an Activity inside an object, if the loadtest was specified on an Activity
     * 
     */
    @JsonProperty("activity")
    @JsonPropertyDescription("dq_id of an Activity inside an object, if the loadtest was specified on an Activity")
    private String activity;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -1757871416322898567L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Artifact() {
    }

    /**
     * 
     * @param activity
     * @param object
     */
    public Artifact(String object, String activity) {
        super();
        this.object = object;
        this.activity = activity;
    }

    /**
     * dq_id of an Actor or Work Object, where the loadtest was specified
     * (Required)
     * 
     */
    @JsonProperty("object")
    public String getObject() {
        return object;
    }

    /**
     * dq_id of an Actor or Work Object, where the loadtest was specified
     * (Required)
     * 
     */
    @JsonProperty("object")
    public void setObject(String object) {
        this.object = object;
    }

    public Artifact withObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * dq_id of an Activity inside an object, if the loadtest was specified on an Activity
     * 
     */
    @JsonProperty("activity")
    public String getActivity() {
        return activity;
    }

    /**
     * dq_id of an Activity inside an object, if the loadtest was specified on an Activity
     * 
     */
    @JsonProperty("activity")
    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Artifact withActivity(String activity) {
        this.activity = activity;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Artifact withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
