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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Provides further details on an entry in the report.
 */
@ApiModel(description = "Provides further details on an entry in the report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-07-10T09:14:46.696896+02:00[Europe/Budapest]")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OBTransaction5Detail {
    @JsonProperty("AccountId")
    private String accountId = null;

    @JsonProperty("TransactionId")
    private String transactionId = null;

    @JsonProperty("TransactionReference")
    private String transactionReference = null;

    @JsonProperty("StatementReference")
    private List<String> statementReference = null;

    @JsonProperty("CreditDebitIndicator")
    private OBCreditDebitCode1 creditDebitIndicator = null;

    @JsonProperty("Status")
    private OBEntryStatus1Code status = null;

    @JsonProperty("BookingDateTime")
    private String bookingDateTime = null;

    @JsonProperty("ValueDateTime")
    private String valueDateTime = null;

    @JsonProperty("TransactionInformation")
    private String transactionInformation = null;

    @JsonProperty("AddressLine")
    private String addressLine = null;

    @JsonProperty("Amount")
    private OBActiveOrHistoricCurrencyAndAmount7 amount = null;

    @JsonProperty("ChargeAmount")
    private OBActiveOrHistoricCurrencyAndAmount8 chargeAmount = null;

    @JsonProperty("CurrencyExchange")
    private OBCurrencyExchange5 currencyExchange = null;

    @JsonProperty("BankTransactionCode")
    private OBBankTransactionCodeStructure1 bankTransactionCode = null;

    @JsonProperty("ProprietaryBankTransactionCode")
    private ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode = null;

    @JsonProperty("Balance")
    private OBTransactionCashBalance balance = null;

    @JsonProperty("MerchantDetails")
    private OBMerchantDetails1 merchantDetails = null;

    @JsonProperty("CreditorAgent")
    private OBBranchAndFinancialInstitutionIdentification60 creditorAgent = null;

    @JsonProperty("CreditorAccount")
    private OBCashAccount60 creditorAccount = null;

    @JsonProperty("DebtorAgent")
    private OBBranchAndFinancialInstitutionIdentification61 debtorAgent = null;

    @JsonProperty("DebtorAccount")
    private OBCashAccount61 debtorAccount = null;

    @JsonProperty("CardInstrument")
    private OBTransactionCardInstrument1 cardInstrument = null;

    @JsonProperty("SupplementaryData")
    private OBSupplementaryData1 supplementaryData = null;

    public OBTransaction5Detail accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
     *
     * @return accountId
     **/
    @JsonProperty("AccountId")
    @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
    @NotNull
    @Size(min = 1, max = 40)
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBTransaction5Detail transactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
     *
     * @return transactionId
     **/
    @JsonProperty("TransactionId")
    @ApiModelProperty(value = "Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.")
    @Size(min = 1, max = 210)
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public OBTransaction5Detail transactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
        return this;
    }

    /**
     * Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.
     *
     * @return transactionReference
     **/
    @JsonProperty("TransactionReference")
    @ApiModelProperty(value = "Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.")
    @Size(min = 1, max = 35)
    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public OBTransaction5Detail statementReference(List<String> statementReference) {
        this.statementReference = statementReference;
        return this;
    }

    public OBTransaction5Detail addStatementReferenceItem(String statementReferenceItem) {
        if (this.statementReference == null) {
            this.statementReference = new ArrayList<>();
        }
        this.statementReference.add(statementReferenceItem);
        return this;
    }

    /**
     * Get statementReference
     *
     * @return statementReference
     **/
    @JsonProperty("StatementReference")
    @ApiModelProperty(value = "")
    public List<String> getStatementReference() {
        return statementReference;
    }

    public void setStatementReference(List<String> statementReference) {
        this.statementReference = statementReference;
    }

    public OBTransaction5Detail creditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
        return this;
    }

    /**
     * Get creditDebitIndicator
     *
     * @return creditDebitIndicator
     **/
    @JsonProperty("CreditDebitIndicator")
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public OBCreditDebitCode1 getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public void setCreditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public OBTransaction5Detail status(OBEntryStatus1Code status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @JsonProperty("Status")
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public OBEntryStatus1Code getStatus() {
        return status;
    }

    public void setStatus(OBEntryStatus1Code status) {
        this.status = status;
    }

    public OBTransaction5Detail bookingDateTime(String bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
        return this;
    }

    /**
     * Date and time when a transaction entry is posted to an account on the account servicer&#39;s books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return bookingDateTime
     **/
    @JsonProperty("BookingDateTime")
    @ApiModelProperty(required = true, value = "Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @NotNull
    public String getBookingDateTime() {
        return bookingDateTime;
    }

    public void setBookingDateTime(String bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    public OBTransaction5Detail valueDateTime(String valueDateTime) {
        this.valueDateTime = valueDateTime;
        return this;
    }

    /**
     * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return valueDateTime
     **/
    @JsonProperty("ValueDateTime")
    @ApiModelProperty(value = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public String getValueDateTime() {
        return valueDateTime;
    }

    public void setValueDateTime(String valueDateTime) {
        this.valueDateTime = valueDateTime;
    }

    public OBTransaction5Detail transactionInformation(String transactionInformation) {
        this.transactionInformation = transactionInformation;
        return this;
    }

    /**
     * Further details of the transaction.  This is the transaction narrative, which is unstructured text.
     *
     * @return transactionInformation
     **/
    @JsonProperty("TransactionInformation")
    @ApiModelProperty(value = "Further details of the transaction.  This is the transaction narrative, which is unstructured text.")
    @Size(min = 1, max = 500)
    public String getTransactionInformation() {
        return transactionInformation;
    }

    public void setTransactionInformation(String transactionInformation) {
        this.transactionInformation = transactionInformation;
    }

    public OBTransaction5Detail addressLine(String addressLine) {
        this.addressLine = addressLine;
        return this;
    }

    /**
     * Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.
     *
     * @return addressLine
     **/
    @JsonProperty("AddressLine")
    @ApiModelProperty(value = "Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.")
    @Size(min = 1, max = 70)
    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public OBTransaction5Detail amount(OBActiveOrHistoricCurrencyAndAmount7 amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    @JsonProperty("Amount")
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public OBActiveOrHistoricCurrencyAndAmount7 getAmount() {
        return amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount7 amount) {
        this.amount = amount;
    }

    public OBTransaction5Detail chargeAmount(OBActiveOrHistoricCurrencyAndAmount8 chargeAmount) {
        this.chargeAmount = chargeAmount;
        return this;
    }

    /**
     * Get chargeAmount
     *
     * @return chargeAmount
     **/
    @JsonProperty("ChargeAmount")
    @ApiModelProperty(value = "")
    public OBActiveOrHistoricCurrencyAndAmount8 getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(OBActiveOrHistoricCurrencyAndAmount8 chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public OBTransaction5Detail currencyExchange(OBCurrencyExchange5 currencyExchange) {
        this.currencyExchange = currencyExchange;
        return this;
    }

    /**
     * Get currencyExchange
     *
     * @return currencyExchange
     **/
    @JsonProperty("CurrencyExchange")
    @ApiModelProperty(value = "")
    public OBCurrencyExchange5 getCurrencyExchange() {
        return currencyExchange;
    }

    public void setCurrencyExchange(OBCurrencyExchange5 currencyExchange) {
        this.currencyExchange = currencyExchange;
    }

    public OBTransaction5Detail bankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
        this.bankTransactionCode = bankTransactionCode;
        return this;
    }

    /**
     * Get bankTransactionCode
     *
     * @return bankTransactionCode
     **/
    @JsonProperty("BankTransactionCode")
    @ApiModelProperty(value = "")
    public OBBankTransactionCodeStructure1 getBankTransactionCode() {
        return bankTransactionCode;
    }

    public void setBankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
        this.bankTransactionCode = bankTransactionCode;
    }

    public OBTransaction5Detail proprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
        this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
        return this;
    }

    /**
     * Get proprietaryBankTransactionCode
     *
     * @return proprietaryBankTransactionCode
     **/
    @JsonProperty("ProprietaryBankTransactionCode")
    @ApiModelProperty(value = "")
    public ProprietaryBankTransactionCodeStructure1 getProprietaryBankTransactionCode() {
        return proprietaryBankTransactionCode;
    }

    public void setProprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
        this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    }

    public OBTransaction5Detail balance(OBTransactionCashBalance balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Get balance
     *
     * @return balance
     **/
    @JsonProperty("Balance")
    @ApiModelProperty(value = "")
    public OBTransactionCashBalance getBalance() {
        return balance;
    }

    public void setBalance(OBTransactionCashBalance balance) {
        this.balance = balance;
    }

    public OBTransaction5Detail merchantDetails(OBMerchantDetails1 merchantDetails) {
        this.merchantDetails = merchantDetails;
        return this;
    }

    /**
     * Get merchantDetails
     *
     * @return merchantDetails
     **/
    @JsonProperty("MerchantDetails")
    @ApiModelProperty(value = "")
    public OBMerchantDetails1 getMerchantDetails() {
        return merchantDetails;
    }

    public void setMerchantDetails(OBMerchantDetails1 merchantDetails) {
        this.merchantDetails = merchantDetails;
    }

    public OBTransaction5Detail creditorAgent(OBBranchAndFinancialInstitutionIdentification60 creditorAgent) {
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
    public OBBranchAndFinancialInstitutionIdentification60 getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification60 creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public OBTransaction5Detail creditorAccount(OBCashAccount60 creditorAccount) {
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
    public OBCashAccount60 getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBCashAccount60 creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public OBTransaction5Detail debtorAgent(OBBranchAndFinancialInstitutionIdentification61 debtorAgent) {
        this.debtorAgent = debtorAgent;
        return this;
    }

    /**
     * Get debtorAgent
     *
     * @return debtorAgent
     **/
    @JsonProperty("DebtorAgent")
    @ApiModelProperty(value = "")
    public OBBranchAndFinancialInstitutionIdentification61 getDebtorAgent() {
        return debtorAgent;
    }

    public void setDebtorAgent(OBBranchAndFinancialInstitutionIdentification61 debtorAgent) {
        this.debtorAgent = debtorAgent;
    }

    public OBTransaction5Detail debtorAccount(OBCashAccount61 debtorAccount) {
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
    public OBCashAccount61 getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBCashAccount61 debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public OBTransaction5Detail cardInstrument(OBTransactionCardInstrument1 cardInstrument) {
        this.cardInstrument = cardInstrument;
        return this;
    }

    /**
     * Get cardInstrument
     *
     * @return cardInstrument
     **/
    @JsonProperty("CardInstrument")
    @ApiModelProperty(value = "")
    public OBTransactionCardInstrument1 getCardInstrument() {
        return cardInstrument;
    }

    public void setCardInstrument(OBTransactionCardInstrument1 cardInstrument) {
        this.cardInstrument = cardInstrument;
    }

    public OBTransaction5Detail supplementaryData(OBSupplementaryData1 supplementaryData) {
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

    @Override
    public int hashCode() {
        return Objects.hash(accountId, transactionId, transactionReference, statementReference, creditDebitIndicator, status, bookingDateTime, valueDateTime, transactionInformation, addressLine, amount, chargeAmount, currencyExchange, bankTransactionCode, proprietaryBankTransactionCode, balance, merchantDetails, creditorAgent, creditorAccount, debtorAgent, debtorAccount, cardInstrument, supplementaryData);
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBTransaction5Detail obTransaction5Detail = (OBTransaction5Detail) o;
        return Objects.equals(this.accountId, obTransaction5Detail.accountId) &&
                Objects.equals(this.transactionId, obTransaction5Detail.transactionId) &&
                Objects.equals(this.transactionReference, obTransaction5Detail.transactionReference) &&
                Objects.equals(this.statementReference, obTransaction5Detail.statementReference) &&
                Objects.equals(this.creditDebitIndicator, obTransaction5Detail.creditDebitIndicator) &&
                Objects.equals(this.status, obTransaction5Detail.status) &&
                Objects.equals(this.bookingDateTime, obTransaction5Detail.bookingDateTime) &&
                Objects.equals(this.valueDateTime, obTransaction5Detail.valueDateTime) &&
                Objects.equals(this.transactionInformation, obTransaction5Detail.transactionInformation) &&
                Objects.equals(this.addressLine, obTransaction5Detail.addressLine) &&
                Objects.equals(this.amount, obTransaction5Detail.amount) &&
                Objects.equals(this.chargeAmount, obTransaction5Detail.chargeAmount) &&
                Objects.equals(this.currencyExchange, obTransaction5Detail.currencyExchange) &&
                Objects.equals(this.bankTransactionCode, obTransaction5Detail.bankTransactionCode) &&
                Objects.equals(this.proprietaryBankTransactionCode, obTransaction5Detail.proprietaryBankTransactionCode) &&
                Objects.equals(this.balance, obTransaction5Detail.balance) &&
                Objects.equals(this.merchantDetails, obTransaction5Detail.merchantDetails) &&
                Objects.equals(this.creditorAgent, obTransaction5Detail.creditorAgent) &&
                Objects.equals(this.creditorAccount, obTransaction5Detail.creditorAccount) &&
                Objects.equals(this.debtorAgent, obTransaction5Detail.debtorAgent) &&
                Objects.equals(this.debtorAccount, obTransaction5Detail.debtorAccount) &&
                Objects.equals(this.cardInstrument, obTransaction5Detail.cardInstrument) &&
                Objects.equals(this.supplementaryData, obTransaction5Detail.supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBTransaction5Detail {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    transactionReference: ").append(toIndentedString(transactionReference)).append("\n");
        sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
        sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    bookingDateTime: ").append(toIndentedString(bookingDateTime)).append("\n");
        sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
        sb.append("    transactionInformation: ").append(toIndentedString(transactionInformation)).append("\n");
        sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
        sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
        sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
        sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
        sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
        sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
        sb.append("    cardInstrument: ").append(toIndentedString(cardInstrument)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

