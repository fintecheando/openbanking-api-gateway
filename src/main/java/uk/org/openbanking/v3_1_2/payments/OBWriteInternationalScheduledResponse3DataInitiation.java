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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single scheduled international payment.
 */
@ApiModel(description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a single scheduled international payment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-09T18:27:25.589536+02:00[Europe/Budapest]")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OBWriteInternationalScheduledResponse3DataInitiation {
    @JsonProperty("SupplementaryData")
    private OBSupplementaryData1 supplementaryData = null;

    @JsonProperty("DebtorAccount")
    private OBWriteFile2DataInitiationDebtorAccount debtorAccount = null;

    @JsonProperty("CreditorAgent")
    private OBWriteInternationalConsent3DataInitiationCreditorAgent creditorAgent = null;

    @JsonProperty("EndToEndIdentification")
    private String endToEndIdentification = null;

    @JsonProperty("InstructionIdentification")
    private String instructionIdentification = null;

    @JsonProperty("CurrencyOfTransfer")
    private String currencyOfTransfer = null;

    @JsonProperty("CreditorAccount")
    private OBWriteDomesticScheduled2DataInitiationCreditorAccount creditorAccount = null;

    @JsonProperty("Purpose")
    private String purpose = null;

    @JsonProperty("ChargeBearer")
    private OBChargeBearerType1Code chargeBearer = null;
    @JsonProperty("InstructionPriority")
    private InstructionPriorityEnum instructionPriority = null;
    @JsonProperty("RequestedExecutionDateTime")
    private String requestedExecutionDateTime = null;
    @JsonProperty("LocalInstrument")
    private String localInstrument = null;
    @JsonProperty("RemittanceInformation")
    private OBWriteFile2DataInitiationRemittanceInformation remittanceInformation = null;
    @JsonProperty("ExchangeRateInformation")
    private OBWriteInternationalConsent3DataInitiationExchangeRateInformation exchangeRateInformation = null;
    @JsonProperty("Creditor")
    private OBWriteInternationalConsent3DataInitiationCreditor creditor = null;
    @JsonProperty("InstructedAmount")
    private OBWriteDomesticScheduled2DataInitiationInstructedAmount instructedAmount = null;

    public OBWriteInternationalScheduledResponse3DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
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

    public OBWriteInternationalScheduledResponse3DataInitiation debtorAccount(OBWriteFile2DataInitiationDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
        return this;
    }

    /**
     * Get debtorAccount
     *
     * @return debtorAccount
     **/
    @JsonProperty("DebtorAccount")
    @ApiModelProperty(value = "")
    public OBWriteFile2DataInitiationDebtorAccount getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBWriteFile2DataInitiationDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public OBWriteInternationalScheduledResponse3DataInitiation creditorAgent(OBWriteInternationalConsent3DataInitiationCreditorAgent creditorAgent) {
        this.creditorAgent = creditorAgent;
        return this;
    }

    /**
     * Get creditorAgent
     *
     * @return creditorAgent
     **/
    @JsonProperty("CreditorAgent")
    @ApiModelProperty(value = "")
    public OBWriteInternationalConsent3DataInitiationCreditorAgent getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(OBWriteInternationalConsent3DataInitiationCreditorAgent creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public OBWriteInternationalScheduledResponse3DataInitiation endToEndIdentification(String endToEndIdentification) {
        this.endToEndIdentification = endToEndIdentification;
        return this;
    }

    /**
     * Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.
     *
     * @return endToEndIdentification
     **/
    @JsonProperty("EndToEndIdentification")
    @ApiModelProperty(value = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.")
    @Size(min = 1, max = 35)
    public String getEndToEndIdentification() {
        return endToEndIdentification;
    }

    public void setEndToEndIdentification(String endToEndIdentification) {
        this.endToEndIdentification = endToEndIdentification;
    }

    public OBWriteInternationalScheduledResponse3DataInitiation instructionIdentification(String instructionIdentification) {
        this.instructionIdentification = instructionIdentification;
        return this;
    }

    /**
     * Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
     *
     * @return instructionIdentification
     **/
    @JsonProperty("InstructionIdentification")
    @ApiModelProperty(value = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.")
    @Size(min = 1, max = 35)
    public String getInstructionIdentification() {
        return instructionIdentification;
    }

    public void setInstructionIdentification(String instructionIdentification) {
        this.instructionIdentification = instructionIdentification;
    }

    public OBWriteInternationalScheduledResponse3DataInitiation currencyOfTransfer(String currencyOfTransfer) {
        this.currencyOfTransfer = currencyOfTransfer;
        return this;
    }

    /**
     * Specifies the currency of the to be transferred amount, which is different from the currency of the debtor&#39;s account.
     *
     * @return currencyOfTransfer
     **/
    @JsonProperty("CurrencyOfTransfer")
    @ApiModelProperty(value = "Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account.")
    @Pattern(regexp = "^[A-Z]{3,3}$")
    public String getCurrencyOfTransfer() {
        return currencyOfTransfer;
    }

    public void setCurrencyOfTransfer(String currencyOfTransfer) {
        this.currencyOfTransfer = currencyOfTransfer;
    }

    public OBWriteInternationalScheduledResponse3DataInitiation creditorAccount(OBWriteDomesticScheduled2DataInitiationCreditorAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
        return this;
    }

    /**
     * Get creditorAccount
     *
     * @return creditorAccount
     **/
    @JsonProperty("CreditorAccount")
    @ApiModelProperty(value = "")
    public OBWriteDomesticScheduled2DataInitiationCreditorAccount getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBWriteDomesticScheduled2DataInitiationCreditorAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public OBWriteInternationalScheduledResponse3DataInitiation purpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    /**
     * Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.
     *
     * @return purpose
     **/
    @JsonProperty("Purpose")
    @ApiModelProperty(value = "Specifies the external purpose code in the format of character string with a maximum length of 4 characters. The list of valid codes is an external code list published separately. External code sets can be downloaded from www.iso20022.org.")
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public OBWriteInternationalScheduledResponse3DataInitiation chargeBearer(OBChargeBearerType1Code chargeBearer) {
        this.chargeBearer = chargeBearer;
        return this;
    }

    /**
     * Get chargeBearer
     *
     * @return chargeBearer
     **/
    @JsonProperty("ChargeBearer")
    @ApiModelProperty(value = "")
    public OBChargeBearerType1Code getChargeBearer() {
        return chargeBearer;
    }

    public void setChargeBearer(OBChargeBearerType1Code chargeBearer) {
        this.chargeBearer = chargeBearer;
    }

    public OBWriteInternationalScheduledResponse3DataInitiation instructionPriority(InstructionPriorityEnum instructionPriority) {
        this.instructionPriority = instructionPriority;
        return this;
    }

    /**
     * Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.
     *
     * @return instructionPriority
     **/
    @JsonProperty("InstructionPriority")
    @ApiModelProperty(value = "Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.")
    public InstructionPriorityEnum getInstructionPriority() {
        return instructionPriority;
    }

    public void setInstructionPriority(InstructionPriorityEnum instructionPriority) {
        this.instructionPriority = instructionPriority;
    }

    public OBWriteInternationalScheduledResponse3DataInitiation requestedExecutionDateTime(String requestedExecutionDateTime) {
        this.requestedExecutionDateTime = requestedExecutionDateTime;
        return this;
    }

    /**
     * Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor&#39;s account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return requestedExecutionDateTime
     **/
    @JsonProperty("RequestedExecutionDateTime")
    @ApiModelProperty(value = "Date at which the initiating party requests the clearing agent to process the payment.  Usage: This is the date on which the debtor's account is to be debited.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public String getRequestedExecutionDateTime() {
        return requestedExecutionDateTime;
    }

    public void setRequestedExecutionDateTime(String requestedExecutionDateTime) {
        this.requestedExecutionDateTime = requestedExecutionDateTime;
    }

    public OBWriteInternationalScheduledResponse3DataInitiation localInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
        return this;
    }

    /**
     * User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.
     *
     * @return localInstrument
     **/
    @JsonProperty("LocalInstrument")
    @ApiModelProperty(value = "User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level.")
    public String getLocalInstrument() {
        return localInstrument;
    }

    public void setLocalInstrument(String localInstrument) {
        this.localInstrument = localInstrument;
    }

    public OBWriteInternationalScheduledResponse3DataInitiation remittanceInformation(OBWriteFile2DataInitiationRemittanceInformation remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
        return this;
    }

    /**
     * Get remittanceInformation
     *
     * @return remittanceInformation
     **/
    @JsonProperty("RemittanceInformation")
    @ApiModelProperty(value = "")
    public OBWriteFile2DataInitiationRemittanceInformation getRemittanceInformation() {
        return remittanceInformation;
    }

    public void setRemittanceInformation(OBWriteFile2DataInitiationRemittanceInformation remittanceInformation) {
        this.remittanceInformation = remittanceInformation;
    }

    public OBWriteInternationalScheduledResponse3DataInitiation exchangeRateInformation(OBWriteInternationalConsent3DataInitiationExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
        return this;
    }

    /**
     * Get exchangeRateInformation
     *
     * @return exchangeRateInformation
     **/
    @JsonProperty("ExchangeRateInformation")
    @ApiModelProperty(value = "")
    public OBWriteInternationalConsent3DataInitiationExchangeRateInformation getExchangeRateInformation() {
        return exchangeRateInformation;
    }

    public void setExchangeRateInformation(OBWriteInternationalConsent3DataInitiationExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
    }

    public OBWriteInternationalScheduledResponse3DataInitiation creditor(OBWriteInternationalConsent3DataInitiationCreditor creditor) {
        this.creditor = creditor;
        return this;
    }

    /**
     * Get creditor
     *
     * @return creditor
     **/
    @JsonProperty("Creditor")
    @ApiModelProperty(value = "")
    public OBWriteInternationalConsent3DataInitiationCreditor getCreditor() {
        return creditor;
    }

    public void setCreditor(OBWriteInternationalConsent3DataInitiationCreditor creditor) {
        this.creditor = creditor;
    }

    public OBWriteInternationalScheduledResponse3DataInitiation instructedAmount(OBWriteDomesticScheduled2DataInitiationInstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
        return this;
    }

    /**
     * Get instructedAmount
     *
     * @return instructedAmount
     **/
    @JsonProperty("InstructedAmount")
    @ApiModelProperty(value = "")
    public OBWriteDomesticScheduled2DataInitiationInstructedAmount getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(OBWriteDomesticScheduled2DataInitiationInstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplementaryData, debtorAccount, creditorAgent, endToEndIdentification, instructionIdentification, currencyOfTransfer, creditorAccount, purpose, chargeBearer, instructionPriority, requestedExecutionDateTime, localInstrument, remittanceInformation, exchangeRateInformation, creditor, instructedAmount);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalScheduledResponse3DataInitiation obWriteInternationalScheduledResponse3DataInitiation = (OBWriteInternationalScheduledResponse3DataInitiation) o;
        return Objects.equals(this.supplementaryData, obWriteInternationalScheduledResponse3DataInitiation.supplementaryData) &&
                Objects.equals(this.debtorAccount, obWriteInternationalScheduledResponse3DataInitiation.debtorAccount) &&
                Objects.equals(this.creditorAgent, obWriteInternationalScheduledResponse3DataInitiation.creditorAgent) &&
                Objects.equals(this.endToEndIdentification, obWriteInternationalScheduledResponse3DataInitiation.endToEndIdentification) &&
                Objects.equals(this.instructionIdentification, obWriteInternationalScheduledResponse3DataInitiation.instructionIdentification) &&
                Objects.equals(this.currencyOfTransfer, obWriteInternationalScheduledResponse3DataInitiation.currencyOfTransfer) &&
                Objects.equals(this.creditorAccount, obWriteInternationalScheduledResponse3DataInitiation.creditorAccount) &&
                Objects.equals(this.purpose, obWriteInternationalScheduledResponse3DataInitiation.purpose) &&
                Objects.equals(this.chargeBearer, obWriteInternationalScheduledResponse3DataInitiation.chargeBearer) &&
                Objects.equals(this.instructionPriority, obWriteInternationalScheduledResponse3DataInitiation.instructionPriority) &&
                Objects.equals(this.requestedExecutionDateTime, obWriteInternationalScheduledResponse3DataInitiation.requestedExecutionDateTime) &&
                Objects.equals(this.localInstrument, obWriteInternationalScheduledResponse3DataInitiation.localInstrument) &&
                Objects.equals(this.remittanceInformation, obWriteInternationalScheduledResponse3DataInitiation.remittanceInformation) &&
                Objects.equals(this.exchangeRateInformation, obWriteInternationalScheduledResponse3DataInitiation.exchangeRateInformation) &&
                Objects.equals(this.creditor, obWriteInternationalScheduledResponse3DataInitiation.creditor) &&
                Objects.equals(this.instructedAmount, obWriteInternationalScheduledResponse3DataInitiation.instructedAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalScheduledResponse3DataInitiation {\n");

        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
        sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
        sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
        sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
        sb.append("    currencyOfTransfer: ").append(toIndentedString(currencyOfTransfer)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
        sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
        sb.append("    instructionPriority: ").append(toIndentedString(instructionPriority)).append("\n");
        sb.append("    requestedExecutionDateTime: ").append(toIndentedString(requestedExecutionDateTime)).append("\n");
        sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
        sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
        sb.append("    exchangeRateInformation: ").append(toIndentedString(exchangeRateInformation)).append("\n");
        sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
        sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
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
     * Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction.
     */
    public enum InstructionPriorityEnum {
        NORMAL("Normal"),

        URGENT("Urgent");

        private String value;

        InstructionPriorityEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static InstructionPriorityEnum fromValue(String text) {
            for (InstructionPriorityEnum b : InstructionPriorityEnum.values()) {
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

