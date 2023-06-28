
package de.dqualizer.persistenceservice.rqa.model;

import java.io.Serializable;
import java.util.Set;
import javax.annotation.processing.*;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "artifact",
    "description",
    "stimulus",
    "parametrization",
    "response_measure",
    "result_metrics"
})
@Generated("jsonschema2pojo")
public class Loadtest implements Serializable
{

    /**
     * An identifier for a Loadtest.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("An identifier for a Loadtest.")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("artifact")
    @Valid
    @NotNull
    private Artifact artifact;
    /**
     * Description of this loadtest
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description of this loadtest")
    private String description;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stimulus")
    @NotNull
    private Object stimulus;
    /**
     * References to data sources for parametrization
     * (Required)
     * 
     */
    @JsonProperty("parametrization")
    @JsonPropertyDescription("References to data sources for parametrization")
    @Valid
    @NotNull
    private Parametrization parametrization;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("response_measure")
    @Valid
    @NotNull
    private ResponseMeasure responseMeasure;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("result_metrics")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Valid
    @NotNull
    private Set<String> resultMetrics;
    private final static long serialVersionUID = -7654639887515624345L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Loadtest() {
    }

    /**
     * 
     * @param artifact
     * @param responseMeasure
     * @param resultMetrics
     * @param parametrization
     * @param stimulus
     * @param name
     * @param description
     */
    public Loadtest(String name, Artifact artifact, String description, Object stimulus, Parametrization parametrization, ResponseMeasure responseMeasure, Set<String> resultMetrics) {
        super();
        this.name = name;
        this.artifact = artifact;
        this.description = description;
        this.stimulus = stimulus;
        this.parametrization = parametrization;
        this.responseMeasure = responseMeasure;
        this.resultMetrics = resultMetrics;
    }

    /**
     * An identifier for a Loadtest.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * An identifier for a Loadtest.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Loadtest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("artifact")
    public Artifact getArtifact() {
        return artifact;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("artifact")
    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
    }

    public Loadtest withArtifact(Artifact artifact) {
        this.artifact = artifact;
        return this;
    }

    /**
     * Description of this loadtest
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description of this loadtest
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Loadtest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stimulus")
    public Object getStimulus() {
        return stimulus;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stimulus")
    public void setStimulus(Object stimulus) {
        this.stimulus = stimulus;
    }

    public Loadtest withStimulus(Object stimulus) {
        this.stimulus = stimulus;
        return this;
    }

    /**
     * References to data sources for parametrization
     * (Required)
     * 
     */
    @JsonProperty("parametrization")
    public Parametrization getParametrization() {
        return parametrization;
    }

    /**
     * References to data sources for parametrization
     * (Required)
     * 
     */
    @JsonProperty("parametrization")
    public void setParametrization(Parametrization parametrization) {
        this.parametrization = parametrization;
    }

    public Loadtest withParametrization(Parametrization parametrization) {
        this.parametrization = parametrization;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("response_measure")
    public ResponseMeasure getResponseMeasure() {
        return responseMeasure;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("response_measure")
    public void setResponseMeasure(ResponseMeasure responseMeasure) {
        this.responseMeasure = responseMeasure;
    }

    public Loadtest withResponseMeasure(ResponseMeasure responseMeasure) {
        this.responseMeasure = responseMeasure;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("result_metrics")
    public Set<String> getResultMetrics() {
        return resultMetrics;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("result_metrics")
    public void setResultMetrics(Set<String> resultMetrics) {
        this.resultMetrics = resultMetrics;
    }

    public Loadtest withResultMetrics(Set<String> resultMetrics) {
        this.resultMetrics = resultMetrics;
        return this;
    }

}
