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

import java.util.Objects;

/**
 * OBWriteInternationalScheduledConsent3Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-09T18:27:25.589536+02:00[Europe/Budapest]")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OBWriteInternationalScheduledConsent3Data {
    @JsonProperty("SCASupportData")
    private OBWriteFileConsent3DataSCASupportData scASupportData = null;

    @JsonProperty("Authorisation")
    private OBWriteFileConsent3DataAuthorisation authorisation = null;
    @JsonProperty("Permission")
    private PermissionEnum permission = null;
    @JsonProperty("Initiation")
    private OBWriteInternationalScheduledResponse3DataInitiation initiation = null;

    public OBWriteInternationalScheduledConsent3Data scASupportData(OBWriteFileConsent3DataSCASupportData scASupportData) {
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

    public OBWriteInternationalScheduledConsent3Data authorisation(OBWriteFileConsent3DataAuthorisation authorisation) {
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

    public OBWriteInternationalScheduledConsent3Data permission(PermissionEnum permission) {
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

    public OBWriteInternationalScheduledConsent3Data initiation(OBWriteInternationalScheduledResponse3DataInitiation initiation) {
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
        return Objects.hash(scASupportData, authorisation, permission, initiation);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalScheduledConsent3Data obWriteInternationalScheduledConsent3Data = (OBWriteInternationalScheduledConsent3Data) o;
        return Objects.equals(this.scASupportData, obWriteInternationalScheduledConsent3Data.scASupportData) &&
                Objects.equals(this.authorisation, obWriteInternationalScheduledConsent3Data.authorisation) &&
                Objects.equals(this.permission, obWriteInternationalScheduledConsent3Data.permission) &&
                Objects.equals(this.initiation, obWriteInternationalScheduledConsent3Data.initiation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalScheduledConsent3Data {\n");

        sb.append("    scASupportData: ").append(toIndentedString(scASupportData)).append("\n");
        sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

