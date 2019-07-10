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

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Other Fee type which is not available in the standard code set
 */
@ApiModel(description = "Other Fee type which is not available in the standard code set")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
public class OBOtherCodeType13 {
    @JsonProperty("Code")
    private String code = null;

    @JsonProperty("Name")
    private String name = null;

    @JsonProperty("Description")
    private String description = null;

    public OBOtherCodeType13 code(String code) {
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

    public OBOtherCodeType13 name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Long name associated with the code
     *
     * @return name
     **/
    @JsonProperty("Name")
    @ApiModelProperty(required = true, value = "Long name associated with the code")
    @NotNull
    @Size(min = 1, max = 70)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBOtherCodeType13 description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description to describe the purpose of the code
     *
     * @return description
     **/
    @JsonProperty("Description")
    @ApiModelProperty(required = true, value = "Description to describe the purpose of the code")
    @NotNull
    @Size(min = 1, max = 350)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBOtherCodeType13 obOtherCodeType13 = (OBOtherCodeType13) o;
        return Objects.equals(this.code, obOtherCodeType13.code) &&
                Objects.equals(this.name, obOtherCodeType13.name) &&
                Objects.equals(this.description, obOtherCodeType13.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, description);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBOtherCodeType13 {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

