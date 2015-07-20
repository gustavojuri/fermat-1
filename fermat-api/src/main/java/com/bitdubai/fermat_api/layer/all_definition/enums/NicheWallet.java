package com.bitdubai.fermat_api.layer.all_definition.enums;

import com.bitdubai.fermat_api.layer.all_definition.exceptions.InvalidParameterException;

/**
 * Created by eze on 2015.07.19..
 */
public enum NicheWallet {
    UNKNOWN_WALLET ("UNKW", ReferenceWallet.BASIC_WALLET_BITCOIN_WALLET);

    private String code;
    private ReferenceWallet referenceWallet;

    NicheWallet (String code,ReferenceWallet referenceWallet){
        this.code = code;
        this.referenceWallet = referenceWallet;
    }

    public String getCode(){
        return this.code;
    }

    public ReferenceWallet getReferenceWallet(){
        return this.referenceWallet;
    }

    public NicheWallet getByCode(String code) throws InvalidParameterException{
        switch (code) {
            case "UNKW" : return NicheWallet.UNKNOWN_WALLET;
            default: throw new InvalidParameterException();
        }
    }
}