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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Other fees/charges details
 */
@ApiModel(description = "Other fees/charges details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
public class BCAFeeChargeDetail {
    @JsonProperty("FeeApplicableRange")
    private FeeApplicableRange feeApplicableRange = null;

    /**
     * How frequently the fee/charge is applied to the account
     */
    public enum ApplicationFrequencyEnum {
        ONCLOSING("OnClosing"),

        ONOPENING("OnOpening"),

        CHARGINGPERIOD("ChargingPeriod"),

        DAILY("Daily"),

        PERITEM("PerItem"),

        MONTHLY("Monthly"),

        ONANNIVERSARY("OnAnniversary"),

        OTHER("Other"),

        PERHUNDREDPOUNDS("PerHundredPounds"),

        PERHOUR("PerHour"),

        PEROCCURRENCE("PerOccurrence"),

        PERSHEET("PerSheet"),

        PERTRANSACTION("PerTransaction"),

        PERTRANSACTIONAMOUNT("PerTransactionAmount"),

        PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),

        QUARTERLY("Quarterly"),

        SIXMONTHLY("SixMonthly"),

        STATEMENTMONTHLY("StatementMonthly"),

        WEEKLY("Weekly"),

        YEARLY("Yearly");

        private String value;

        ApplicationFrequencyEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ApplicationFrequencyEnum fromValue(String text) {
            for (ApplicationFrequencyEnum b : ApplicationFrequencyEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }

    @JsonProperty("ApplicationFrequency")
    private ApplicationFrequencyEnum applicationFrequency = null;

    @JsonProperty("OtherFeeType")
    private OtherFeeType1 otherFeeType = null;

    /**
     * Fee/Charge Type
     */
    public enum FeeTypeEnum {
        OTHER("Other"),

        SERVICECACCOUNTFEE("ServiceCAccountFee"),

        SERVICECACCOUNTFEEMONTHLY("ServiceCAccountFeeMonthly"),

        SERVICECACCOUNTFEEQUARTERLY("ServiceCAccountFeeQuarterly"),

        SERVICECFIXEDTARIFF("ServiceCFixedTariff"),

        SERVICECBUSIDEPACCBREAKAGE("ServiceCBusiDepAccBreakage"),

        SERVICECMINIMUMMONTHLYFEE("ServiceCMinimumMonthlyFee"),

        SERVICECOTHER("ServiceCOther");

        private String value;

        FeeTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FeeTypeEnum fromValue(String text) {
            for (FeeTypeEnum b : FeeTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }

    @JsonProperty("FeeType")
    private FeeTypeEnum feeType = null;

    @JsonProperty("OtherCalculationFrequency")
    private OtherCalculationFrequency1 otherCalculationFrequency = null;

    @JsonProperty("FeeRate")
    private String feeRate = null;

    /**
     * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
     */
    public enum FeeRateTypeEnum {
        GROSS("Gross"),

        OTHER("Other");

        private String value;

        FeeRateTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FeeRateTypeEnum fromValue(String text) {
            for (FeeRateTypeEnum b : FeeRateTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }

    @JsonProperty("FeeRateType")
    private FeeRateTypeEnum feeRateType = null;

    @JsonProperty("OtherFeeCategoryType")
    private OtherFeeCategoryType otherFeeCategoryType = null;

    @JsonProperty("OtherApplicationFrequency")
    private OtherApplicationFrequency1 otherApplicationFrequency = null;

    @JsonProperty("OtherFeeRateType")
    private OtherFeeRateType1 otherFeeRateType = null;

    @JsonProperty("NegotiableIndicator")
    private Boolean negotiableIndicator = null;

    @JsonProperty("FeeChargeCap")
    private List<BCAFeeChargeCap> feeChargeCap = null;

    /**
     * How frequently the fee/charge is calculated
     */
    public enum CalculationFrequencyEnum {
        ONCLOSING("OnClosing"),

        ONOPENING("OnOpening"),

        CHARGINGPERIOD("ChargingPeriod"),

        DAILY("Daily"),

        PERITEM("PerItem"),

        MONTHLY("Monthly"),

        ONANNIVERSARY("OnAnniversary"),

        OTHER("Other"),

        PERHUNDREDPOUNDS("PerHundredPounds"),

        PERHOUR("PerHour"),

        PEROCCURRENCE("PerOccurrence"),

        PERSHEET("PerSheet"),

        PERTRANSACTION("PerTransaction"),

        PERTRANSACTIONAMOUNT("PerTransactionAmount"),

        PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),

        QUARTERLY("Quarterly"),

        SIXMONTHLY("SixMonthly"),

        STATEMENTMONTHLY("StatementMonthly"),

        WEEKLY("Weekly"),

        YEARLY("Yearly");

        private String value;

        CalculationFrequencyEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CalculationFrequencyEnum fromValue(String text) {
            for (CalculationFrequencyEnum b : CalculationFrequencyEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }

    @JsonProperty("CalculationFrequency")
    private CalculationFrequencyEnum calculationFrequency = null;

    /**
     * Categorisation of fees and charges into standard categories.
     */
    public enum FeeCategoryEnum {
        OTHER("Other"),

        SERVICING("Servicing");

        private String value;

        FeeCategoryEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FeeCategoryEnum fromValue(String text) {
            for (FeeCategoryEnum b : FeeCategoryEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }

    @JsonProperty("FeeCategory")
    private FeeCategoryEnum feeCategory = null;

    @JsonProperty("Notes")
    private List<String> notes = null;

    @JsonProperty("FeeAmount")
    private String feeAmount = null;

    public BCAFeeChargeDetail feeApplicableRange(FeeApplicableRange feeApplicableRange) {
        this.feeApplicableRange = feeApplicableRange;
        return this;
    }

    /**
     * Get feeApplicableRange
     *
     * @return feeApplicableRange
     **/
    @JsonProperty("FeeApplicableRange")
    @ApiModelProperty(value = "")
    public FeeApplicableRange getFeeApplicableRange() {
        return feeApplicableRange;
    }

    public void setFeeApplicableRange(FeeApplicableRange feeApplicableRange) {
        this.feeApplicableRange = feeApplicableRange;
    }

    public BCAFeeChargeDetail applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
        return this;
    }

    /**
     * How frequently the fee/charge is applied to the account
     *
     * @return applicationFrequency
     **/
    @JsonProperty("ApplicationFrequency")
    @ApiModelProperty(value = "How frequently the fee/charge is applied to the account")
    public ApplicationFrequencyEnum getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    public BCAFeeChargeDetail otherFeeType(OtherFeeType1 otherFeeType) {
        this.otherFeeType = otherFeeType;
        return this;
    }

    /**
     * Get otherFeeType
     *
     * @return otherFeeType
     **/
    @JsonProperty("OtherFeeType")
    @ApiModelProperty(value = "")
    public OtherFeeType1 getOtherFeeType() {
        return otherFeeType;
    }

    public void setOtherFeeType(OtherFeeType1 otherFeeType) {
        this.otherFeeType = otherFeeType;
    }

    public BCAFeeChargeDetail feeType(FeeTypeEnum feeType) {
        this.feeType = feeType;
        return this;
    }

    /**
     * Fee/Charge Type
     *
     * @return feeType
     **/
    @JsonProperty("FeeType")
    @ApiModelProperty(value = "Fee/Charge Type")
    public FeeTypeEnum getFeeType() {
        return feeType;
    }

    public void setFeeType(FeeTypeEnum feeType) {
        this.feeType = feeType;
    }

    public BCAFeeChargeDetail otherCalculationFrequency(OtherCalculationFrequency1 otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
        return this;
    }

    /**
     * Get otherCalculationFrequency
     *
     * @return otherCalculationFrequency
     **/
    @JsonProperty("OtherCalculationFrequency")
    @ApiModelProperty(value = "")
    public OtherCalculationFrequency1 getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    public void setOtherCalculationFrequency(OtherCalculationFrequency1 otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
    }

    public BCAFeeChargeDetail feeRate(String feeRate) {
        this.feeRate = feeRate;
        return this;
    }

    /**
     * Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
     *
     * @return feeRate
     **/
    @JsonProperty("FeeRate")
    @ApiModelProperty(value = "Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)")
    @Pattern(regexp = "^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")
    public String getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(String feeRate) {
        this.feeRate = feeRate;
    }

    public BCAFeeChargeDetail feeRateType(FeeRateTypeEnum feeRateType) {
        this.feeRateType = feeRateType;
        return this;
    }

    /**
     * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
     *
     * @return feeRateType
     **/
    @JsonProperty("FeeRateType")
    @ApiModelProperty(value = "Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)")
    public FeeRateTypeEnum getFeeRateType() {
        return feeRateType;
    }

    public void setFeeRateType(FeeRateTypeEnum feeRateType) {
        this.feeRateType = feeRateType;
    }

    public BCAFeeChargeDetail otherFeeCategoryType(OtherFeeCategoryType otherFeeCategoryType) {
        this.otherFeeCategoryType = otherFeeCategoryType;
        return this;
    }

    /**
     * Get otherFeeCategoryType
     *
     * @return otherFeeCategoryType
     **/
    @JsonProperty("OtherFeeCategoryType")
    @ApiModelProperty(value = "")
    public OtherFeeCategoryType getOtherFeeCategoryType() {
        return otherFeeCategoryType;
    }

    public void setOtherFeeCategoryType(OtherFeeCategoryType otherFeeCategoryType) {
        this.otherFeeCategoryType = otherFeeCategoryType;
    }

    public BCAFeeChargeDetail otherApplicationFrequency(OtherApplicationFrequency1 otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
        return this;
    }

    /**
     * Get otherApplicationFrequency
     *
     * @return otherApplicationFrequency
     **/
    @JsonProperty("OtherApplicationFrequency")
    @ApiModelProperty(value = "")
    public OtherApplicationFrequency1 getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    public void setOtherApplicationFrequency(OtherApplicationFrequency1 otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
    }

    public BCAFeeChargeDetail otherFeeRateType(OtherFeeRateType1 otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
        return this;
    }

    /**
     * Get otherFeeRateType
     *
     * @return otherFeeRateType
     **/
    @JsonProperty("OtherFeeRateType")
    @ApiModelProperty(value = "")
    public OtherFeeRateType1 getOtherFeeRateType() {
        return otherFeeRateType;
    }

    public void setOtherFeeRateType(OtherFeeRateType1 otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
    }

    public BCAFeeChargeDetail negotiableIndicator(Boolean negotiableIndicator) {
        this.negotiableIndicator = negotiableIndicator;
        return this;
    }

    /**
     * Fee/charge which is usually negotiable rather than a fixed amount
     *
     * @return negotiableIndicator
     **/
    @JsonProperty("NegotiableIndicator")
    @ApiModelProperty(value = "Fee/charge which is usually negotiable rather than a fixed amount")
    public Boolean NegotiableIndicator() {
        return negotiableIndicator;
    }

    public void setNegotiableIndicator(Boolean negotiableIndicator) {
        this.negotiableIndicator = negotiableIndicator;
    }

    public BCAFeeChargeDetail feeChargeCap(List<BCAFeeChargeCap> feeChargeCap) {
        this.feeChargeCap = feeChargeCap;
        return this;
    }

    public BCAFeeChargeDetail addFeeChargeCapItem(BCAFeeChargeCap feeChargeCapItem) {
        if (this.feeChargeCap == null) {
            this.feeChargeCap = new ArrayList<>();
        }
        this.feeChargeCap.add(feeChargeCapItem);
        return this;
    }

    /**
     * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
     *
     * @return feeChargeCap
     **/
    @JsonProperty("FeeChargeCap")
    @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge")
    public List<BCAFeeChargeCap> getFeeChargeCap() {
        return feeChargeCap;
    }

    public void setFeeChargeCap(List<BCAFeeChargeCap> feeChargeCap) {
        this.feeChargeCap = feeChargeCap;
    }

    public BCAFeeChargeDetail calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
        return this;
    }

    /**
     * How frequently the fee/charge is calculated
     *
     * @return calculationFrequency
     **/
    @JsonProperty("CalculationFrequency")
    @ApiModelProperty(value = "How frequently the fee/charge is calculated")
    public CalculationFrequencyEnum getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    public BCAFeeChargeDetail feeCategory(FeeCategoryEnum feeCategory) {
        this.feeCategory = feeCategory;
        return this;
    }

    /**
     * Categorisation of fees and charges into standard categories.
     *
     * @return feeCategory
     **/
    @JsonProperty("FeeCategory")
    @ApiModelProperty(value = "Categorisation of fees and charges into standard categories.")
    public FeeCategoryEnum getFeeCategory() {
        return feeCategory;
    }

    public void setFeeCategory(FeeCategoryEnum feeCategory) {
        this.feeCategory = feeCategory;
    }

    public BCAFeeChargeDetail notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public BCAFeeChargeDetail addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the fee/charge details.
     *
     * @return notes
     **/
    @JsonProperty("Notes")
    @ApiModelProperty(value = "Optional additional notes to supplement the fee/charge details.")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public BCAFeeChargeDetail feeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
        return this;
    }

    /**
     * Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
     *
     * @return feeAmount
     **/
    @JsonProperty("FeeAmount")
    @ApiModelProperty(value = "Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
    @Pattern(regexp = "^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")
    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BCAFeeChargeDetail bcAFeeChargeDetail = (BCAFeeChargeDetail) o;
        return Objects.equals(this.feeApplicableRange, bcAFeeChargeDetail.feeApplicableRange) &&
                Objects.equals(this.applicationFrequency, bcAFeeChargeDetail.applicationFrequency) &&
                Objects.equals(this.otherFeeType, bcAFeeChargeDetail.otherFeeType) &&
                Objects.equals(this.feeType, bcAFeeChargeDetail.feeType) &&
                Objects.equals(this.otherCalculationFrequency, bcAFeeChargeDetail.otherCalculationFrequency) &&
                Objects.equals(this.feeRate, bcAFeeChargeDetail.feeRate) &&
                Objects.equals(this.feeRateType, bcAFeeChargeDetail.feeRateType) &&
                Objects.equals(this.otherFeeCategoryType, bcAFeeChargeDetail.otherFeeCategoryType) &&
                Objects.equals(this.otherApplicationFrequency, bcAFeeChargeDetail.otherApplicationFrequency) &&
                Objects.equals(this.otherFeeRateType, bcAFeeChargeDetail.otherFeeRateType) &&
                Objects.equals(this.negotiableIndicator, bcAFeeChargeDetail.negotiableIndicator) &&
                Objects.equals(this.feeChargeCap, bcAFeeChargeDetail.feeChargeCap) &&
                Objects.equals(this.calculationFrequency, bcAFeeChargeDetail.calculationFrequency) &&
                Objects.equals(this.feeCategory, bcAFeeChargeDetail.feeCategory) &&
                Objects.equals(this.notes, bcAFeeChargeDetail.notes) &&
                Objects.equals(this.feeAmount, bcAFeeChargeDetail.feeAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeApplicableRange, applicationFrequency, otherFeeType, feeType, otherCalculationFrequency, feeRate, feeRateType, otherFeeCategoryType, otherApplicationFrequency, otherFeeRateType, negotiableIndicator, feeChargeCap, calculationFrequency, feeCategory, notes, feeAmount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BCAFeeChargeDetail {\n");

        sb.append("    feeApplicableRange: ").append(toIndentedString(feeApplicableRange)).append("\n");
        sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
        sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
        sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
        sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
        sb.append("    otherFeeCategoryType: ").append(toIndentedString(otherFeeCategoryType)).append("\n");
        sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
        sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
        sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
        sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
        sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
        sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
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

