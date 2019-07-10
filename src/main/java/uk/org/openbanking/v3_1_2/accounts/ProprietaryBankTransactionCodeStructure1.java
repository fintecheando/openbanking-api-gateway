/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.2
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package uk.org.openbanking.v3_1_2.accounts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Set of elements to fully identify a proprietary bank transaction code.
 */
@ApiModel(description = "Set of elements to fully identify a proprietary bank transaction code.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProprietaryBankTransactionCodeStructure1 {
    @JsonProperty("Code")
    private String code = null;

    @JsonProperty("Issuer")
    private String issuer = null;

    public ProprietaryBankTransactionCodeStructure1 code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Proprietary bank transaction code to identify the underlying transaction.
     *
     * @return code
     **/
    @JsonProperty("Code")
    @ApiModelProperty(required = true, value = "Proprietary bank transaction code to identify the underlying transaction.")
    @NotNull
    @Size(min = 1, max = 35)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ProprietaryBankTransactionCodeStructure1 issuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Identification of the issuer of the proprietary bank transaction code.
     *
     * @return issuer
     **/
    @JsonProperty("Issuer")
    @ApiModelProperty(value = "Identification of the issuer of the proprietary bank transaction code.")
    @Size(min = 1, max = 35)
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, issuer);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCodeStructure1 = (ProprietaryBankTransactionCodeStructure1) o;
        return Objects.equals(this.code, proprietaryBankTransactionCodeStructure1.code) &&
                Objects.equals(this.issuer, proprietaryBankTransactionCodeStructure1.issuer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProprietaryBankTransactionCodeStructure1 {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

