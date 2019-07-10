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

import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBWriteInternationalStandingOrderConsentResponse4Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-09T18:27:25.589536+02:00[Europe/Budapest]")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OBWriteInternationalStandingOrderConsentResponse4Data {
    @JsonProperty("Status")
    private StatusEnum status = null;
    @JsonProperty("StatusUpdateDateTime")
    private String statusUpdateDateTime = null;
    @JsonProperty("SCASupportData")
    private OBWriteFileConsent3DataSCASupportData scASupportData = null;
    @JsonProperty("CreationDateTime")
    private String creationDateTime = null;
    @JsonProperty("CutOffDateTime")
    private String cutOffDateTime = null;
    @JsonProperty("Authorisation")
    private OBWriteFileConsent3DataAuthorisation authorisation = null;
    @JsonProperty("Permission")
    private PermissionEnum permission = null;
    @JsonProperty("Charges")
    private List<OBWriteDomesticStandingOrderResponse4DataCharges> charges = null;
    @JsonProperty("ConsentId")
    private String consentId = null;
    @JsonProperty("Initiation")
    private OBWriteInternationalStandingOrderConsent4DataInitiation initiation = null;

    public OBWriteInternationalStandingOrderConsentResponse4Data status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies the status of resource in code form.
     *
     * @return status
     **/
    @JsonProperty("Status")
    @ApiModelProperty(value = "Specifies the status of resource in code form.")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OBWriteInternationalStandingOrderConsentResponse4Data statusUpdateDateTime(String statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return statusUpdateDateTime
     **/
    @JsonProperty("StatusUpdateDateTime")
    @ApiModelProperty(value = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public String getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(String statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWriteInternationalStandingOrderConsentResponse4Data scASupportData(OBWriteFileConsent3DataSCASupportData scASupportData) {
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

    public OBWriteInternationalStandingOrderConsentResponse4Data creationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     **/
    @JsonProperty("CreationDateTime")
    @ApiModelProperty(value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public String getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBWriteInternationalStandingOrderConsentResponse4Data cutOffDateTime(String cutOffDateTime) {
        this.cutOffDateTime = cutOffDateTime;
        return this;
    }

    /**
     * Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return cutOffDateTime
     **/
    @JsonProperty("CutOffDateTime")
    @ApiModelProperty(value = "Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public String getCutOffDateTime() {
        return cutOffDateTime;
    }

    public void setCutOffDateTime(String cutOffDateTime) {
        this.cutOffDateTime = cutOffDateTime;
    }

    public OBWriteInternationalStandingOrderConsentResponse4Data authorisation(OBWriteFileConsent3DataAuthorisation authorisation) {
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

    public OBWriteInternationalStandingOrderConsentResponse4Data permission(PermissionEnum permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Specifies the Open Banking service request types.
     *
     * @return permission
     **/
    @JsonProperty("Permission")
    @ApiModelProperty(value = "Specifies the Open Banking service request types.")
    public PermissionEnum getPermission() {
        return permission;
    }

    public void setPermission(PermissionEnum permission) {
        this.permission = permission;
    }

    public OBWriteInternationalStandingOrderConsentResponse4Data charges(List<OBWriteDomesticStandingOrderResponse4DataCharges> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteInternationalStandingOrderConsentResponse4Data addChargesItem(OBWriteDomesticStandingOrderResponse4DataCharges chargesItem) {
        if (this.charges == null) {
            this.charges = new ArrayList<>();
        }
        this.charges.add(chargesItem);
        return this;
    }

    /**
     * Get charges
     *
     * @return charges
     **/
    @JsonProperty("Charges")
    @ApiModelProperty(value = "")
    public List<OBWriteDomesticStandingOrderResponse4DataCharges> getCharges() {
        return charges;
    }

    public void setCharges(List<OBWriteDomesticStandingOrderResponse4DataCharges> charges) {
        this.charges = charges;
    }

    public OBWriteInternationalStandingOrderConsentResponse4Data consentId(String consentId) {
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

    public OBWriteInternationalStandingOrderConsentResponse4Data initiation(OBWriteInternationalStandingOrderConsent4DataInitiation initiation) {
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
    public OBWriteInternationalStandingOrderConsent4DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteInternationalStandingOrderConsent4DataInitiation initiation) {
        this.initiation = initiation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, statusUpdateDateTime, scASupportData, creationDateTime, cutOffDateTime, authorisation, permission, charges, consentId, initiation);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalStandingOrderConsentResponse4Data obWriteInternationalStandingOrderConsentResponse4Data = (OBWriteInternationalStandingOrderConsentResponse4Data) o;
        return Objects.equals(this.status, obWriteInternationalStandingOrderConsentResponse4Data.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteInternationalStandingOrderConsentResponse4Data.statusUpdateDateTime) &&
                Objects.equals(this.scASupportData, obWriteInternationalStandingOrderConsentResponse4Data.scASupportData) &&
                Objects.equals(this.creationDateTime, obWriteInternationalStandingOrderConsentResponse4Data.creationDateTime) &&
                Objects.equals(this.cutOffDateTime, obWriteInternationalStandingOrderConsentResponse4Data.cutOffDateTime) &&
                Objects.equals(this.authorisation, obWriteInternationalStandingOrderConsentResponse4Data.authorisation) &&
                Objects.equals(this.permission, obWriteInternationalStandingOrderConsentResponse4Data.permission) &&
                Objects.equals(this.charges, obWriteInternationalStandingOrderConsentResponse4Data.charges) &&
                Objects.equals(this.consentId, obWriteInternationalStandingOrderConsentResponse4Data.consentId) &&
                Objects.equals(this.initiation, obWriteInternationalStandingOrderConsentResponse4Data.initiation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalStandingOrderConsentResponse4Data {\n");

        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    scASupportData: ").append(toIndentedString(scASupportData)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    cutOffDateTime: ").append(toIndentedString(cutOffDateTime)).append("\n");
        sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
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


    /**
     * Specifies the status of resource in code form.
     */
    public enum StatusEnum {
        AUTHORISED("Authorised"),

        AWAITINGAUTHORISATION("AwaitingAuthorisation"),

        CONSUMED("Consumed"),

        REJECTED("Rejected");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }

    /**
     * Specifies the Open Banking service request types.
     */
    public enum PermissionEnum {
        CREATE("Create");

        private String value;

        PermissionEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static PermissionEnum fromValue(String text) {
            for (PermissionEnum b : PermissionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }
}

