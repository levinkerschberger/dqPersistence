
package de.dqualizer.persistenceservice.rqa.model;

import java.io.Serializable;
import java.util.Set;
import javax.annotation.processing.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "monitoring",
    "resilience",
    "loadtests"
})
@Generated("jsonschema2pojo")
public class RuntimeQualityAnalysis implements Serializable
{

    /**
     * Configurations for specified monitoring
     * (Required)
     * 
     */
    @JsonProperty("monitoring")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Configurations for specified monitoring")
    @Valid
    @NotNull
    private Set<Monitoring> monitoring;
    /**
     * Configurations for specified resilience tests
     * (Required)
     * 
     */
    @JsonProperty("resilience")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Configurations for specified resilience tests")
    @Valid
    @NotNull
    private Set<Resilience> resilience;
    /**
     * Configurations for specified load tests
     * (Required)
     * 
     */
    @JsonProperty("loadtests")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Configurations for specified load tests")
    @Valid
    @NotNull
    private Set<Loadtest> loadtests;
    private final static long serialVersionUID = 1715145477294191353L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RuntimeQualityAnalysis() {
    }

    /**
     * 
     * @param monitoring
     * @param resilience
     * @param loadtests
     */
    public RuntimeQualityAnalysis(Set<Monitoring> monitoring, Set<Resilience> resilience, Set<Loadtest> loadtests) {
        super();
        this.monitoring = monitoring;
        this.resilience = resilience;
        this.loadtests = loadtests;
    }

    /**
     * Configurations for specified monitoring
     * (Required)
     * 
     */
    @JsonProperty("monitoring")
    public Set<Monitoring> getMonitoring() {
        return monitoring;
    }

    /**
     * Configurations for specified monitoring
     * (Required)
     * 
     */
    @JsonProperty("monitoring")
    public void setMonitoring(Set<Monitoring> monitoring) {
        this.monitoring = monitoring;
    }

    public RuntimeQualityAnalysis withMonitoring(Set<Monitoring> monitoring) {
        this.monitoring = monitoring;
        return this;
    }

    /**
     * Configurations for specified resilience tests
     * (Required)
     * 
     */
    @JsonProperty("resilience")
    public Set<Resilience> getResilience() {
        return resilience;
    }

    /**
     * Configurations for specified resilience tests
     * (Required)
     * 
     */
    @JsonProperty("resilience")
    public void setResilience(Set<Resilience> resilience) {
        this.resilience = resilience;
    }

    public RuntimeQualityAnalysis withResilience(Set<Resilience> resilience) {
        this.resilience = resilience;
        return this;
    }

    /**
     * Configurations for specified load tests
     * (Required)
     * 
     */
    @JsonProperty("loadtests")
    public Set<Loadtest> getLoadtests() {
        return loadtests;
    }

    /**
     * Configurations for specified load tests
     * (Required)
     * 
     */
    @JsonProperty("loadtests")
    public void setLoadtests(Set<Loadtest> loadtests) {
        this.loadtests = loadtests;
    }

    public RuntimeQualityAnalysis withLoadtests(Set<Loadtest> loadtests) {
        this.loadtests = loadtests;
        return this;
    }

}
