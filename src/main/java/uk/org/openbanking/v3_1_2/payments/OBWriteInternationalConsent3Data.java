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

import java.util.Objects;

/**
 * OBWriteInternationalConsent3Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-09T18:27:25.589536+02:00[Europe/Budapest]")
public class OBWriteInternationalConsent3Data {
    @JsonProperty("SCASupportData")
    private OBWriteFileConsent3DataSCASupportData scASupportData = null;

    @JsonProperty("Authorisation")
    private OBWriteFileConsent3DataAuthorisation authorisation = null;

    @JsonProperty("Initiation")
    private OBWriteInternationalConsent3DataInitiation initiation = null;

    public OBWriteInternationalConsent3Data scASupportData(OBWriteFileConsent3DataSCASupportData scASupportData) {
        this.scASupportData = scASupportData;
        return this;
    }

    /**
     * Get scASupportData
     *
     * @return scASupportData
     **/
    @JsonProperty("SCASupportData")
    @ApiModelProperty(value = "")
    public OBWriteFileConsent3DataSCASupportData getScASupportData() {
        return scASupportData;
    }

    public void setScASupportData(OBWriteFileConsent3DataSCASupportData scASupportData) {
        this.scASupportData = scASupportData;
    }

    public OBWriteInternationalConsent3Data authorisation(OBWriteFileConsent3DataAuthorisation authorisation) {
        this.authorisation = authorisation;
        return this;
    }

    /**
     * Get authorisation
     *
     * @return authorisation
     **/
    @JsonProperty("Authorisation")
    @ApiModelProperty(value = "")
    public OBWriteFileConsent3DataAuthorisation getAuthorisation() {
        return authorisation;
    }

    public void setAuthorisation(OBWriteFileConsent3DataAuthorisation authorisation) {
        this.authorisation = authorisation;
    }

    public OBWriteInternationalConsent3Data initiation(OBWriteInternationalConsent3DataInitiation initiation) {
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
    public OBWriteInternationalConsent3DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteInternationalConsent3DataInitiation initiation) {
        this.initiation = initiation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(scASupportData, authorisation, initiation);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalConsent3Data obWriteInternationalConsent3Data = (OBWriteInternationalConsent3Data) o;
        return Objects.equals(this.scASupportData, obWriteInternationalConsent3Data.scASupportData) &&
                Objects.equals(this.authorisation, obWriteInternationalConsent3Data.authorisation) &&
                Objects.equals(this.initiation, obWriteInternationalConsent3Data.initiation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalConsent3Data {\n");

        sb.append("    scASupportData: ").append(toIndentedString(scASupportData)).append("\n");
        sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
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

