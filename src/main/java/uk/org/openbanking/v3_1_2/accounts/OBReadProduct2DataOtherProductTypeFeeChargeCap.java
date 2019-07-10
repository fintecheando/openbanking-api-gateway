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
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
 */
@ApiModel(description = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
public class OBReadProduct2DataOtherProductTypeFeeChargeCap {
    @JsonProperty("CappingPeriod")
    private OBPeriod1Code cappingPeriod = null;

    @JsonProperty("OtherFeeType")
    private List<OBReadProduct2DataOtherProductTypeOverdraftOtherFeeType> otherFeeType = null;
    @JsonProperty("FeeType")
    private List<FeeTypeEnum> feeType = null;
    @JsonProperty("FeeCapOccurrence")
    private Integer feeCapOccurrence = null;
    @JsonProperty("MinMaxType")
    private OBMinMaxType1Code minMaxType = null;
    @JsonProperty("Notes")
    private List<String> notes = null;
    @JsonProperty("FeeCapAmount")
    private String feeCapAmount = null;

    public OBReadProduct2DataOtherProductTypeFeeChargeCap cappingPeriod(OBPeriod1Code cappingPeriod) {
        this.cappingPeriod = cappingPeriod;
        return this;
    }

    /**
     * Get cappingPeriod
     *
     * @return cappingPeriod
     **/
    @JsonProperty("CappingPeriod")
    @ApiModelProperty(value = "")
    public OBPeriod1Code getCappingPeriod() {
        return cappingPeriod;
    }

    public void setCappingPeriod(OBPeriod1Code cappingPeriod) {
        this.cappingPeriod = cappingPeriod;
    }

    public OBReadProduct2DataOtherProductTypeFeeChargeCap otherFeeType(List<OBReadProduct2DataOtherProductTypeOverdraftOtherFeeType> otherFeeType) {
        this.otherFeeType = otherFeeType;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeFeeChargeCap addOtherFeeTypeItem(OBReadProduct2DataOtherProductTypeOverdraftOtherFeeType otherFeeTypeItem) {
        if (this.otherFeeType == null) {
            this.otherFeeType = new ArrayList<>();
        }
        this.otherFeeType.add(otherFeeTypeItem);
        return this;
    }

    /**
     * Get otherFeeType
     *
     * @return otherFeeType
     **/
    @JsonProperty("OtherFeeType")
    @ApiModelProperty(value = "")
    public List<OBReadProduct2DataOtherProductTypeOverdraftOtherFeeType> getOtherFeeType() {
        return otherFeeType;
    }

    public void setOtherFeeType(List<OBReadProduct2DataOtherProductTypeOverdraftOtherFeeType> otherFeeType) {
        this.otherFeeType = otherFeeType;
    }

    public OBReadProduct2DataOtherProductTypeFeeChargeCap feeType(List<FeeTypeEnum> feeType) {
        this.feeType = feeType;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeFeeChargeCap addFeeTypeItem(FeeTypeEnum feeTypeItem) {
        if (this.feeType == null) {
            this.feeType = new ArrayList<>();
        }
        this.feeType.add(feeTypeItem);
        return this;
    }

    /**
     * Get feeType
     *
     * @return feeType
     **/
    @JsonProperty("FeeType")
    @ApiModelProperty(value = "")
    @Size(min = 1)
    public List<FeeTypeEnum> getFeeType() {
        return feeType;
    }

    public void setFeeType(List<FeeTypeEnum> feeType) {
        this.feeType = feeType;
    }

    public OBReadProduct2DataOtherProductTypeFeeChargeCap feeCapOccurrence(Integer feeCapOccurrence) {
        this.feeCapOccurrence = feeCapOccurrence;
        return this;
    }

    /**
     * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
     *
     * @return feeCapOccurrence
     **/
    @JsonProperty("FeeCapOccurrence")
    @ApiModelProperty(value = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")
    public Integer getFeeCapOccurrence() {
        return feeCapOccurrence;
    }

    public void setFeeCapOccurrence(Integer feeCapOccurrence) {
        this.feeCapOccurrence = feeCapOccurrence;
    }

    public OBReadProduct2DataOtherProductTypeFeeChargeCap minMaxType(OBMinMaxType1Code minMaxType) {
        this.minMaxType = minMaxType;
        return this;
    }

    /**
     * Get minMaxType
     *
     * @return minMaxType
     **/
    @JsonProperty("MinMaxType")
    @ApiModelProperty(value = "")
    public OBMinMaxType1Code getMinMaxType() {
        return minMaxType;
    }

    public void setMinMaxType(OBMinMaxType1Code minMaxType) {
        this.minMaxType = minMaxType;
    }

    public OBReadProduct2DataOtherProductTypeFeeChargeCap notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeFeeChargeCap addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Get notes
     *
     * @return notes
     **/
    @JsonProperty("Notes")
    @ApiModelProperty(value = "")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public OBReadProduct2DataOtherProductTypeFeeChargeCap feeCapAmount(String feeCapAmount) {
        this.feeCapAmount = feeCapAmount;
        return this;
    }

    /**
     * Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
     *
     * @return feeCapAmount
     **/
    @JsonProperty("FeeCapAmount")
    @ApiModelProperty(value = "Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
    @Pattern(regexp = "^(-?\\\\d{1,14}){1}(\\\\.\\\\d{1,4}){0,1}$")
    public String getFeeCapAmount() {
        return feeCapAmount;
    }

    public void setFeeCapAmount(String feeCapAmount) {
        this.feeCapAmount = feeCapAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cappingPeriod, otherFeeType, feeType, feeCapOccurrence, minMaxType, notes, feeCapAmount);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeFeeChargeCap obReadProduct2DataOtherProductTypeFeeChargeCap = (OBReadProduct2DataOtherProductTypeFeeChargeCap) o;
        return Objects.equals(this.cappingPeriod, obReadProduct2DataOtherProductTypeFeeChargeCap.cappingPeriod) &&
                Objects.equals(this.otherFeeType, obReadProduct2DataOtherProductTypeFeeChargeCap.otherFeeType) &&
                Objects.equals(this.feeType, obReadProduct2DataOtherProductTypeFeeChargeCap.feeType) &&
                Objects.equals(this.feeCapOccurrence, obReadProduct2DataOtherProductTypeFeeChargeCap.feeCapOccurrence) &&
                Objects.equals(this.minMaxType, obReadProduct2DataOtherProductTypeFeeChargeCap.minMaxType) &&
                Objects.equals(this.notes, obReadProduct2DataOtherProductTypeFeeChargeCap.notes) &&
                Objects.equals(this.feeCapAmount, obReadProduct2DataOtherProductTypeFeeChargeCap.feeCapAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeFeeChargeCap {\n");

        sb.append("    cappingPeriod: ").append(toIndentedString(cappingPeriod)).append("\n");
        sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    feeCapOccurrence: ").append(toIndentedString(feeCapOccurrence)).append("\n");
        sb.append("    minMaxType: ").append(toIndentedString(minMaxType)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    feeCapAmount: ").append(toIndentedString(feeCapAmount)).append("\n");
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
     * Fee/charge type which is being capped
     */
    public enum FeeTypeEnum {
        FEPF("FEPF"),

        FTOT("FTOT"),

        FYAF("FYAF"),

        FYAM("FYAM"),

        FYAQ("FYAQ"),

        FYCP("FYCP"),

        FYDB("FYDB"),

        FYMI("FYMI"),

        FYXX("FYXX");

        private String value;

        FeeTypeEnum(String value) {
            this.value = value;
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

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }
}

