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

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Other product type details associated with the account.
 */
@ApiModel(description = "Other product type details associated with the account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
public class OBReadProduct2DataOtherProductType {
    @JsonProperty("Overdraft")
    private OBReadProduct2DataOtherProductTypeOverdraft overdraft = null;

    @JsonProperty("SupplementaryData")
    private OBSupplementaryData1 supplementaryData = null;

    @JsonProperty("Description")
    private String description = null;

    @JsonProperty("ProductDetails")
    private OBReadProduct2DataOtherProductTypeProductDetails productDetails = null;

    @JsonProperty("LoanInterest")
    private OBReadProduct2DataOtherProductTypeLoanInterest loanInterest = null;

    @JsonProperty("OtherFeesCharges")
    private List<OBReadProduct2DataOtherProductTypeOtherFeesCharges> otherFeesCharges = null;

    @JsonProperty("Repayment")
    private OBReadProduct2DataOtherProductTypeRepayment repayment = null;

    @JsonProperty("Name")
    private String name = null;

    @JsonProperty("CreditInterest")
    private OBReadProduct2DataOtherProductTypeCreditInterest creditInterest = null;

    public OBReadProduct2DataOtherProductType overdraft(OBReadProduct2DataOtherProductTypeOverdraft overdraft) {
        this.overdraft = overdraft;
        return this;
    }

    /**
     * Get overdraft
     *
     * @return overdraft
     **/
    @JsonProperty("Overdraft")
    @ApiModelProperty(value = "")
    public OBReadProduct2DataOtherProductTypeOverdraft getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(OBReadProduct2DataOtherProductTypeOverdraft overdraft) {
        this.overdraft = overdraft;
    }

    public OBReadProduct2DataOtherProductType supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * Get supplementaryData
     *
     * @return supplementaryData
     **/
    @JsonProperty("SupplementaryData")
    @ApiModelProperty(value = "")
    public OBSupplementaryData1 getSupplementaryData() {
        return supplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
    }

    public OBReadProduct2DataOtherProductType description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the Product associated with the account
     *
     * @return description
     **/
    @JsonProperty("Description")
    @ApiModelProperty(value = "Description of the Product associated with the account")
    @Size(min = 1, max = 350)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OBReadProduct2DataOtherProductType productDetails(OBReadProduct2DataOtherProductTypeProductDetails productDetails) {
        this.productDetails = productDetails;
        return this;
    }

    /**
     * Get productDetails
     *
     * @return productDetails
     **/
    @JsonProperty("ProductDetails")
    @ApiModelProperty(value = "")
    public OBReadProduct2DataOtherProductTypeProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(OBReadProduct2DataOtherProductTypeProductDetails productDetails) {
        this.productDetails = productDetails;
    }

    public OBReadProduct2DataOtherProductType loanInterest(OBReadProduct2DataOtherProductTypeLoanInterest loanInterest) {
        this.loanInterest = loanInterest;
        return this;
    }

    /**
     * Get loanInterest
     *
     * @return loanInterest
     **/
    @JsonProperty("LoanInterest")
    @ApiModelProperty(value = "")
    public OBReadProduct2DataOtherProductTypeLoanInterest getLoanInterest() {
        return loanInterest;
    }

    public void setLoanInterest(OBReadProduct2DataOtherProductTypeLoanInterest loanInterest) {
        this.loanInterest = loanInterest;
    }

    public OBReadProduct2DataOtherProductType otherFeesCharges(List<OBReadProduct2DataOtherProductTypeOtherFeesCharges> otherFeesCharges) {
        this.otherFeesCharges = otherFeesCharges;
        return this;
    }

    public OBReadProduct2DataOtherProductType addOtherFeesChargesItem(OBReadProduct2DataOtherProductTypeOtherFeesCharges otherFeesChargesItem) {
        if (this.otherFeesCharges == null) {
            this.otherFeesCharges = new ArrayList<>();
        }
        this.otherFeesCharges.add(otherFeesChargesItem);
        return this;
    }

    /**
     * Get otherFeesCharges
     *
     * @return otherFeesCharges
     **/
    @JsonProperty("OtherFeesCharges")
    @ApiModelProperty(value = "")
    public List<OBReadProduct2DataOtherProductTypeOtherFeesCharges> getOtherFeesCharges() {
        return otherFeesCharges;
    }

    public void setOtherFeesCharges(List<OBReadProduct2DataOtherProductTypeOtherFeesCharges> otherFeesCharges) {
        this.otherFeesCharges = otherFeesCharges;
    }

    public OBReadProduct2DataOtherProductType repayment(OBReadProduct2DataOtherProductTypeRepayment repayment) {
        this.repayment = repayment;
        return this;
    }

    /**
     * Get repayment
     *
     * @return repayment
     **/
    @JsonProperty("Repayment")
    @ApiModelProperty(value = "")
    public OBReadProduct2DataOtherProductTypeRepayment getRepayment() {
        return repayment;
    }

    public void setRepayment(OBReadProduct2DataOtherProductTypeRepayment repayment) {
        this.repayment = repayment;
    }

    public OBReadProduct2DataOtherProductType name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Long name associated with the product
     *
     * @return name
     **/
    @JsonProperty("Name")
    @ApiModelProperty(value = "Long name associated with the product")
    @Size(min = 1, max = 350)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBReadProduct2DataOtherProductType creditInterest(OBReadProduct2DataOtherProductTypeCreditInterest creditInterest) {
        this.creditInterest = creditInterest;
        return this;
    }

    /**
     * Get creditInterest
     *
     * @return creditInterest
     **/
    @JsonProperty("CreditInterest")
    @ApiModelProperty(value = "")
    public OBReadProduct2DataOtherProductTypeCreditInterest getCreditInterest() {
        return creditInterest;
    }

    public void setCreditInterest(OBReadProduct2DataOtherProductTypeCreditInterest creditInterest) {
        this.creditInterest = creditInterest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(overdraft, supplementaryData, description, productDetails, loanInterest, otherFeesCharges, repayment, name, creditInterest);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductType obReadProduct2DataOtherProductType = (OBReadProduct2DataOtherProductType) o;
        return Objects.equals(this.overdraft, obReadProduct2DataOtherProductType.overdraft) &&
                Objects.equals(this.supplementaryData, obReadProduct2DataOtherProductType.supplementaryData) &&
                Objects.equals(this.description, obReadProduct2DataOtherProductType.description) &&
                Objects.equals(this.productDetails, obReadProduct2DataOtherProductType.productDetails) &&
                Objects.equals(this.loanInterest, obReadProduct2DataOtherProductType.loanInterest) &&
                Objects.equals(this.otherFeesCharges, obReadProduct2DataOtherProductType.otherFeesCharges) &&
                Objects.equals(this.repayment, obReadProduct2DataOtherProductType.repayment) &&
                Objects.equals(this.name, obReadProduct2DataOtherProductType.name) &&
                Objects.equals(this.creditInterest, obReadProduct2DataOtherProductType.creditInterest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductType {\n");

        sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
        sb.append("    loanInterest: ").append(toIndentedString(loanInterest)).append("\n");
        sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
        sb.append("    repayment: ").append(toIndentedString(repayment)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
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

