
package de.dqualizer.persistenceservice.rqa.model;

import java.io.Serializable;
import javax.annotation.processing.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Runtime Quality Analysis Definition
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "version",
    "context",
    "environment",
    "runtime_quality_analysis"
})
@Generated("jsonschema2pojo")
public class Rqa implements Serializable
{

    /**
     * A unique identifier for the rqa definition
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A unique identifier for the rqa definition")
    private Integer id;
    /**
     * Every Rqa-Definition has a unique name
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Every Rqa-Definition has a unique name")
    private String name;
    /**
     * Version of this modeling representation
     * (Required)
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Version of this modeling representation")
    @NotNull
    private Integer version;
    /**
     * The name of the Bounded Context to which this modeling belongs
     * (Required)
     * 
     */
    @JsonProperty("context")
    @JsonPropertyDescription("The name of the Bounded Context to which this modeling belongs")
    @Size(min = 1)
    @NotNull
    private String context;
    /**
     * The environment this host belongs to
     * (Required)
     * 
     */
    @JsonProperty("environment")
    @JsonPropertyDescription("The environment this host belongs to")
    @NotNull
    private String environment;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("runtime_quality_analysis")
    @Valid
    @NotNull
    private RuntimeQualityAnalysis runtimeQualityAnalysis;
    private final static long serialVersionUID = 392649148317245081L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Rqa() {
    }

    /**
     * 
     * @param runtimeQualityAnalysis
     * @param environment
     * @param name
     * @param context
     * @param id
     * @param version
     */
    public Rqa(Integer id, String name, Integer version, String context, String environment, RuntimeQualityAnalysis runtimeQualityAnalysis) {
        super();
        this.id = id;
        this.name = name;
        this.version = version;
        this.context = context;
        this.environment = environment;
        this.runtimeQualityAnalysis = runtimeQualityAnalysis;
    }

    /**
     * A unique identifier for the rqa definition
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * A unique identifier for the rqa definition
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Rqa withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Every Rqa-Definition has a unique name
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Every Rqa-Definition has a unique name
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Rqa withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Version of this modeling representation
     * (Required)
     * 
     */
    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    /**
     * Version of this modeling representation
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    public Rqa withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * The name of the Bounded Context to which this modeling belongs
     * (Required)
     * 
     */
    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    /**
     * The name of the Bounded Context to which this modeling belongs
     * (Required)
     * 
     */
    @JsonProperty("context")
    public void setContext(String context) {
        this.context = context;
    }

    public Rqa withContext(String context) {
        this.context = context;
        return this;
    }

    /**
     * The environment this host belongs to
     * (Required)
     * 
     */
    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    /**
     * The environment this host belongs to
     * (Required)
     * 
     */
    @JsonProperty("environment")
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public Rqa withEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("runtime_quality_analysis")
    public RuntimeQualityAnalysis getRuntimeQualityAnalysis() {
        return runtimeQualityAnalysis;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("runtime_quality_analysis")
    public void setRuntimeQualityAnalysis(RuntimeQualityAnalysis runtimeQualityAnalysis) {
        this.runtimeQualityAnalysis = runtimeQualityAnalysis;
    }

    public Rqa withRuntimeQualityAnalysis(RuntimeQualityAnalysis runtimeQualityAnalysis) {
        this.runtimeQualityAnalysis = runtimeQualityAnalysis;
        return this;
    }

}
