
package de.dqualizer.persistenceservice.rqa.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "response_time"
})
@Generated("jsonschema2pojo")
public class ResponseMeasure implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("response_time")
    @JsonPropertyDescription("")
    @NotNull
    private ResponseMeasure.ResponseTime responseTime;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -4621344461162765776L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseMeasure() {
    }

    /**
     * 
     * @param responseTime
     */
    public ResponseMeasure(ResponseMeasure.ResponseTime responseTime) {
        super();
        this.responseTime = responseTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("response_time")
    public ResponseMeasure.ResponseTime getResponseTime() {
        return responseTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("response_time")
    public void setResponseTime(ResponseMeasure.ResponseTime responseTime) {
        this.responseTime = responseTime;
    }

    public ResponseMeasure withResponseTime(ResponseMeasure.ResponseTime responseTime) {
        this.responseTime = responseTime;
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

    public ResponseMeasure withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }


    /**
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ResponseTime {

        SATISFIED("SATISFIED"),
        TOLERATED("TOLERATED"),
        FRUSTRATED("FRUSTRATED");
        private final String value;
        private final static Map<String, ResponseMeasure.ResponseTime> CONSTANTS = new HashMap<String, ResponseMeasure.ResponseTime>();

        static {
            for (ResponseMeasure.ResponseTime c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ResponseTime(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static ResponseMeasure.ResponseTime fromValue(String value) {
            ResponseMeasure.ResponseTime constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
