/*
 * Payment Initiation API
 * Swagger for Payment Initiation API Specification
 *
 * OpenAPI spec version: v3.1.2
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package uk.org.openbanking.v3_1_2.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBWriteDomesticScheduledConsentResponse3
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-09T18:27:25.589536+02:00[Europe/Budapest]")
public class OBWriteDomesticScheduledConsentResponse3 {
    @JsonProperty("Data")
    private OBWriteDomesticScheduledConsentResponse3Data data = null;

    @JsonProperty("Risk")
    private OBRisk1 risk = null;

    @JsonProperty("Links")
    private Links links = null;

    @JsonProperty("Meta")
    private Meta meta = null;

    public OBWriteDomesticScheduledConsentResponse3 data(OBWriteDomesticScheduledConsentResponse3Data data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @JsonProperty("Data")
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public OBWriteDomesticScheduledConsentResponse3Data getData() {
        return data;
    }

    public void setData(OBWriteDomesticScheduledConsentResponse3Data data) {
        this.data = data;
    }

    public OBWriteDomesticScheduledConsentResponse3 risk(OBRisk1 risk) {
        this.risk = risk;
        return this;
    }

    /**
     * Get risk
     *
     * @return risk
     **/
    @JsonProperty("Risk")
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public OBRisk1 getRisk() {
        return risk;
    }

    public void setRisk(OBRisk1 risk) {
        this.risk = risk;
    }

    public OBWriteDomesticScheduledConsentResponse3 links(Links links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     *
     * @return links
     **/
    @JsonProperty("Links")
    @ApiModelProperty(value = "")
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public OBWriteDomesticScheduledConsentResponse3 meta(Meta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * Get meta
     *
     * @return meta
     **/
    @JsonProperty("Meta")
    @ApiModelProperty(value = "")
    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, risk, links, meta);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticScheduledConsentResponse3 obWriteDomesticScheduledConsentResponse3 = (OBWriteDomesticScheduledConsentResponse3) o;
        return Objects.equals(this.data, obWriteDomesticScheduledConsentResponse3.data) &&
                Objects.equals(this.risk, obWriteDomesticScheduledConsentResponse3.risk) &&
                Objects.equals(this.links, obWriteDomesticScheduledConsentResponse3.links) &&
                Objects.equals(this.meta, obWriteDomesticScheduledConsentResponse3.meta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticScheduledConsentResponse3 {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

