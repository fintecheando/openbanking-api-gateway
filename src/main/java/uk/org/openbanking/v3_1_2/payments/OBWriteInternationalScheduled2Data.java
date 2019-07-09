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

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBWriteInternationalScheduled2Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-09T18:27:25.589536+02:00[Europe/Budapest]")
public class OBWriteInternationalScheduled2Data {
    @JsonProperty("ConsentId")
    private String consentId = null;

    @JsonProperty("Initiation")
    private OBWriteInternationalScheduledResponse3DataInitiation initiation = null;

    public OBWriteInternationalScheduled2Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
     *
     * @return consentId
     **/
    @JsonProperty("ConsentId")
    @ApiModelProperty(value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.")
    @Size(min = 1, max = 128)
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBWriteInternationalScheduled2Data initiation(OBWriteInternationalScheduledResponse3DataInitiation initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     *
     * @return initiation
     **/
    @JsonProperty("Initiation")
    @ApiModelProperty(value = "")
    public OBWriteInternationalScheduledResponse3DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteInternationalScheduledResponse3DataInitiation initiation) {
        this.initiation = initiation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(consentId, initiation);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalScheduled2Data obWriteInternationalScheduled2Data = (OBWriteInternationalScheduled2Data) o;
        return Objects.equals(this.consentId, obWriteInternationalScheduled2Data.consentId) &&
                Objects.equals(this.initiation, obWriteInternationalScheduled2Data.initiation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalScheduled2Data {\n");

        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
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

