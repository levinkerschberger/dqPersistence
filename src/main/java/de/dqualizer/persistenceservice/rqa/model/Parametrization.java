
package de.dqualizer.persistenceservice.rqa.model;

import java.io.Serializable;
import javax.annotation.processing.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * References to data sources for parametrization
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "path_variables",
    "url_parameter",
    "request_parameter",
    "payload"
})
@Generated("jsonschema2pojo")
public class Parametrization implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("path_variables")
    @Valid
    @NotNull
    private PathVariables pathVariables;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url_parameter")
    @Valid
    @NotNull
    private UrlParameter urlParameter;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("request_parameter")
    @Valid
    @NotNull
    private RequestParameter requestParameter;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("payload")
    @Valid
    @NotNull
    private Payload payload;
    private final static long serialVersionUID = -2215776769767524966L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Parametrization() {
    }

    /**
     * 
     * @param requestParameter
     * @param pathVariables
     * @param payload
     * @param urlParameter
     */
    public Parametrization(PathVariables pathVariables, UrlParameter urlParameter, RequestParameter requestParameter, Payload payload) {
        super();
        this.pathVariables = pathVariables;
        this.urlParameter = urlParameter;
        this.requestParameter = requestParameter;
        this.payload = payload;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("path_variables")
    public PathVariables getPathVariables() {
        return pathVariables;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("path_variables")
    public void setPathVariables(PathVariables pathVariables) {
        this.pathVariables = pathVariables;
    }

    public Parametrization withPathVariables(PathVariables pathVariables) {
        this.pathVariables = pathVariables;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url_parameter")
    public UrlParameter getUrlParameter() {
        return urlParameter;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url_parameter")
    public void setUrlParameter(UrlParameter urlParameter) {
        this.urlParameter = urlParameter;
    }

    public Parametrization withUrlParameter(UrlParameter urlParameter) {
        this.urlParameter = urlParameter;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("request_parameter")
    public RequestParameter getRequestParameter() {
        return requestParameter;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("request_parameter")
    public void setRequestParameter(RequestParameter requestParameter) {
        this.requestParameter = requestParameter;
    }

    public Parametrization withRequestParameter(RequestParameter requestParameter) {
        this.requestParameter = requestParameter;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("payload")
    public Payload getPayload() {
        return payload;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("payload")
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public Parametrization withPayload(Payload payload) {
        this.payload = payload;
        return this;
    }

}
