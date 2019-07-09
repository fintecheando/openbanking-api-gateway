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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Provides the details to identify the debtor account.
 */
@ApiModel(description = "Provides the details to identify the debtor account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-09T18:27:25.589536+02:00[Europe/Budapest]")
public class OBWriteDomesticStandingOrderResponse4DataInitiationDebtorAccount {
    @JsonProperty("SecondaryIdentification")
    private String secondaryIdentification = null;

    @JsonProperty("SchemeName")
    private String schemeName = null;

    @JsonProperty("Identification")
    private String identification = null;

    @JsonProperty("Name")
    private String name = null;

    public OBWriteDomesticStandingOrderResponse4DataInitiationDebtorAccount secondaryIdentification(String secondaryIdentification) {
        this.secondaryIdentification = secondaryIdentification;
        return this;
    }

    /**
     * This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).
     *
     * @return secondaryIdentification
     **/
    @JsonProperty("SecondaryIdentification")
    @ApiModelProperty(value = "This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).")
    @Size(min = 1, max = 34)
    public String getSecondaryIdentification() {
        return secondaryIdentification;
    }

    public void setSecondaryIdentification(String secondaryIdentification) {
        this.secondaryIdentification = secondaryIdentification;
    }

    public OBWriteDomesticStandingOrderResponse4DataInitiationDebtorAccount schemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }

    /**
     * Name of the identification scheme, in a coded form as published in an external list.
     *
     * @return schemeName
     **/
    @JsonProperty("SchemeName")
    @ApiModelProperty(value = "Name of the identification scheme, in a coded form as published in an external list.")
    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public OBWriteDomesticStandingOrderResponse4DataInitiationDebtorAccount identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Identification assigned by an institution to identify an account. This identification is known by the account owner.
     *
     * @return identification
     **/
    @JsonProperty("Identification")
    @ApiModelProperty(value = "Identification assigned by an institution to identify an account. This identification is known by the account owner.")
    @Size(min = 1, max = 256)
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBWriteDomesticStandingOrderResponse4DataInitiationDebtorAccount name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP&#39;s online channels. Note, the account name is not the product name or the nickname of the account.
     *
     * @return name
     **/
    @JsonProperty("Name")
    @ApiModelProperty(value = "The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP's online channels. Note, the account name is not the product name or the nickname of the account.")
    @Size(min = 1, max = 70)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(secondaryIdentification, schemeName, identification, name);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticStandingOrderResponse4DataInitiationDebtorAccount obWriteDomesticStandingOrderResponse4DataInitiationDebtorAccount = (OBWriteDomesticStandingOrderResponse4DataInitiationDebtorAccount) o;
        return Objects.equals(this.secondaryIdentification, obWriteDomesticStandingOrderResponse4DataInitiationDebtorAccount.secondaryIdentification) &&
                Objects.equals(this.schemeName, obWriteDomesticStandingOrderResponse4DataInitiationDebtorAccount.schemeName) &&
                Objects.equals(this.identification, obWriteDomesticStandingOrderResponse4DataInitiationDebtorAccount.identification) &&
                Objects.equals(this.name, obWriteDomesticStandingOrderResponse4DataInitiationDebtorAccount.name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticStandingOrderResponse4DataInitiationDebtorAccount {\n");

        sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
        sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

