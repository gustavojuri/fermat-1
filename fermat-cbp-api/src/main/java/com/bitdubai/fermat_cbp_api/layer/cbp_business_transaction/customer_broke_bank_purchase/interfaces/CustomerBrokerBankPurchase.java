package com.bitdubai.fermat_cbp_api.layer.cbp_business_transaction.customer_broke_bank_purchase.interfaces;

import com.bitdubai.fermat_cbp_api.all_definition.enums.BankCurrencyType;
import com.bitdubai.fermat_cbp_api.all_definition.business_transaction.BusinessTransaction;
import com.bitdubai.fermat_cbp_api.all_definition.enums.BankOperationType;
import com.bitdubai.fermat_cbp_api.all_definition.enums.CurrencyType;

import java.util.UUID;

/**
 * Created by Yordin Alayn on 18.09.2015
 */

public interface CustomerBrokerBankPurchase  extends BusinessTransaction {

    UUID getContractId();

    String getPublicKeyCustomer();

    UUID getPaymentBankMoneyTransactionId();

    CurrencyType getPaymentCurrency();

    UUID getExecutionBankMoneyTransactionId();

    BankCurrencyType getBankCurrencyType();

    BankOperationType getBankOperationType();
    /*
    UUID getContractId();

    String getPublicKeyCustomer();

    float getPaymentAmount();

    CurrencyType getPaymentCurrency();

    String getBankName();

    String getBankAccountNumber();

    BankAccountType getBankAccountType();

    String getBankDocumentReference();
    */
}
