package com.kubi.data.constance;

import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public enum ValidationBizEnum {
    PHONE_LOGIN,
    EMAIL_LOGIN,
    LOGIN_V2,
    PHONE_REGISTER,
    EMAIL_REGISTER,
    REGISTER_SMS,
    REGISTER_EMAIL,
    FORGOT_PASSWORD,
    FORGOT_PASSWORD_V2,
    UPDATE_PHONE,
    RV_UPDATE_PHONE,
    RV_SET_SAFE_WORD,
    RV_SECURITY_SETTINGS,
    BIND_PHONE,
    UPDATE_EMAIL,
    BIND_EMAIL,
    BIND_GOOGLE_2FA,
    UPDATE_GOOGLE_2FA,
    SET_WITHDRAWAL_PASSWORD,
    UPDATE_WITHDRAWAL_PASSWORD,
    FORGET_WITHDRAWAL_PASSWORD,
    UPDATE_API,
    CREATE_API,
    CREATE_SUB_ACCOUNT,
    UPDATE_PASSWORD,
    DESTROY_ACCOUNT,
    FROZEN_ACCOUNT,
    UNFROZEN_ACCOUNT,
    DEPOSIT,
    WITHDRAWAL,
    RV_WITHDRAWAL,
    FIAT_WITHDRAW,
    UPDATE_WALLET_ADDRESS,
    CREATE_WALLET_ADDRESS,
    EXCHANGE,
    CHECK_FINGERPRINT,
    REBINDING_GOOGLE_2FA,
    REBINDING_PHONE,
    WITHDRAWAL_FAV,
    USER_UPGRADE,
    FINGERPRINT_SUPPORT,
    OTC_SELL,
    OTC_SETTLE,
    OTC_BIND_PAY,
    PAYMENT_FIAT_RECURRING,
    RV_CARD_PAYOUT,
    SEND_RED_ENVELOPS,
    CONTRACT_TRADE,
    VERIFY_WITHDRAWAL_PASSWORD,
    OTC,
    UPDATE_PRIMARY_KYC,
    USER_CANCELLATION,
    UNBIND_PHONE,
    UNBIND_EMAIL,
    EXTERNAL_BINDING,
    PASSKEY_REGISTER,
    PASSKEY_DELETE,
    RV_LOGIN,
    RV_LOGIN_PWD_SET,
    RV_WITHDRAWAL_ADDRESSBOOK,
    RV_ADD_ADDRESS,
    RV_ADD_CONTACT,
    RV_UTA_TRADE,
    RV_CLASSIC_SPOT_MARGIN,
    RV_CLASSIC_FUTURES,
    RV_P2P_CHANNEL_EDIT,
    RV_P2P_TRADE_RELEASE,
    RV_BALANCE,
    RV_FIAT_WITHDRAW,
    RV_P2P_TRADE_CREATE,
    RV_THIRDPARTY_BIND,
    RV_THIRDPARTY_UNBIND,
    SAFE_WORDS;

    public static String getTypeString(ValidationBizEnum validationBizEnum) {
        String strName = validationBizEnum.name();
        Locale locale = Locale.ENGLISH;
        if (strName.toUpperCase(locale).contains("LOGIN")) {
            if (validationBizEnum != LOGIN_V2) {
                return "LOGIN";
            }
            return validationBizEnum.name();
        }
        if (validationBizEnum.name().toUpperCase(locale).contains("REGISTER")) {
            if (validationBizEnum != REGISTER_SMS && validationBizEnum != REGISTER_EMAIL && validationBizEnum != PASSKEY_REGISTER) {
                return "REGISTER";
            }
            return validationBizEnum.name();
        }
        return validationBizEnum.name();
    }
}
