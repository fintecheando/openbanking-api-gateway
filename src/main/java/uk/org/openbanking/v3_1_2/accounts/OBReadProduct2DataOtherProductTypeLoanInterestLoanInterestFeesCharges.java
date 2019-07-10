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
 * Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits
 */
@ApiModel(description = "Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
public class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges {
    @JsonProperty("LoanInterestFeeChargeDetail")
    private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail> loanInterestFeeChargeDetail = null;

    @JsonProperty("LoanInterestFeeChargeCap")
    private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap> loanInterestFeeChargeCap = null;

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges loanInterestFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail> loanInterestFeeChargeDetail) {
        this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges addLoanInterestFeeChargeDetailItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail loanInterestFeeChargeDetailItem) {
        if (this.loanInterestFeeChargeDetail == null) {
            this.loanInterestFeeChargeDetail = new ArrayList<>();
        }
        this.loanInterestFeeChargeDetail.add(loanInterestFeeChargeDetailItem);
        return this;
    }

    /**
     * Get loanInterestFeeChargeDetail
     *
     * @return loanInterestFeeChargeDetail
     **/
    @JsonProperty("LoanInterestFeeChargeDetail")
    @ApiModelProperty(value = "")
    @Size(min = 1)
    public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail> getLoanInterestFeeChargeDetail() {
        return loanInterestFeeChargeDetail;
    }

    public void setLoanInterestFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeDetail> loanInterestFeeChargeDetail) {
        this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges loanInterestFeeChargeCap(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap> loanInterestFeeChargeCap) {
        this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges addLoanInterestFeeChargeCapItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap loanInterestFeeChargeCapItem) {
        if (this.loanInterestFeeChargeCap == null) {
            this.loanInterestFeeChargeCap = new ArrayList<>();
        }
        this.loanInterestFeeChargeCap.add(loanInterestFeeChargeCapItem);
        return this;
    }

    /**
     * Get loanInterestFeeChargeCap
     *
     * @return loanInterestFeeChargeCap
     **/
    @JsonProperty("LoanInterestFeeChargeCap")
    @ApiModelProperty(value = "")
    public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap> getLoanInterestFeeChargeCap() {
        return loanInterestFeeChargeCap;
    }

    public void setLoanInterestFeeChargeCap(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeeChargeCap> loanInterestFeeChargeCap) {
        this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanInterestFeeChargeDetail, loanInterestFeeChargeCap);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges = (OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges) o;
        return Objects.equals(this.loanInterestFeeChargeDetail, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges.loanInterestFeeChargeDetail) &&
                Objects.equals(this.loanInterestFeeChargeCap, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges.loanInterestFeeChargeCap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges {\n");

        sb.append("    loanInterestFeeChargeDetail: ").append(toIndentedString(loanInterestFeeChargeDetail)).append("\n");
        sb.append("    loanInterestFeeChargeCap: ").append(toIndentedString(loanInterestFeeChargeCap)).append("\n");
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

