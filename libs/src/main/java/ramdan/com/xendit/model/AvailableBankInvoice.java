package ramdan.com.xendit.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AvailableBankInvoice {
    @JsonProperty("bank_code")
    private String bankCode;

    @JsonProperty("collection_type")
    private String collectionType;

    @JsonProperty("bank_account_number")
    private String bankAccountNumber;

    @JsonProperty("transfer_amount")
    private Number transferAmount;

    @JsonProperty("bank_branch")
    private String bankBranch;

    @JsonProperty("account_holder_name")
    private String accountHolderName;

    @JsonProperty("identity_amount")
    private Number identityAmount;
}
