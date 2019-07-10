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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Other repayment type which is not in the standard code list
 */
@ApiModel(description = "Other repayment type which is not in the standard code list")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
public class OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType {
    @JsonProperty("Description")
    private String description = null;

    @JsonProperty("Code")
    private String code = null;

    @JsonProperty("Name")
    private String name = null;

    public OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description to describe the purpose of the code
     *
     * @return description
     **/
    @JsonProperty("Description")
    @ApiModelProperty(value = "Description to describe the purpose of the code")
    @Size(min = 1, max = 350)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType code(String code) {
        this.code = code;
        return this;
    }

    /**
     * The four letter Mnemonic used within an XML file to identify a code
     *
     * @return code
     **/
    @JsonProperty("Code")
    @ApiModelProperty(value = "The four letter Mnemonic used within an XML file to identify a code")
    @Pattern(regexp = "^\\\\w{0,4}$")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Long name associated with the code
     *
     * @return name
     **/
    @JsonProperty("Name")
    @ApiModelProperty(value = "Long name associated with the code")
    @Size(min = 1, max = 70)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, code, name);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType obReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType = (OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType) o;
        return Objects.equals(this.description, obReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType.description) &&
                Objects.equals(this.code, obReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType.code) &&
                Objects.equals(this.name, obReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType.name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

