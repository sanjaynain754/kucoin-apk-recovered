package com.kubi.kucoin;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: ChoosePhoneAreaActivity.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/kucoin/SceneCode;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "KEY_CHOOSE_TYPE_FOR_DEFAULT", "PHONE_REGISTER_COUNTRY_CODE", "BIND_PHONE_COUNTRY_CODE", "PHONE_LOGIN_COUNTRY_CODE", "CHANGE_BIND_PHONE_COUNTRY_CODE", "RESET_PHONE_COUNTRY_CODE", "WITHDRAW_COUNTRY_CODE", "LAppCountry_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum SceneCode {
    KEY_CHOOSE_TYPE_FOR_DEFAULT("isDefault"),
    PHONE_REGISTER_COUNTRY_CODE("PHONE_REGISTER_COUNTRY_CODE"),
    BIND_PHONE_COUNTRY_CODE("BIND_PHONE_COUNTRY_CODE"),
    PHONE_LOGIN_COUNTRY_CODE("PHONE_LOGIN_COUNTRY_CODE"),
    CHANGE_BIND_PHONE_COUNTRY_CODE("CHANGE_BIND_PHONE_COUNTRY_CODE"),
    RESET_PHONE_COUNTRY_CODE("RESET_PHONE_COUNTRY_CODE"),
    WITHDRAW_COUNTRY_CODE("PHONE_LOGIN_COUNTRY_CODE");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f27710c = EnumEntriesKt.enumEntries(m31921a());

    @NotNull
    private final String code;

    @NotNull
    public static EnumEntries<SceneCode> getEntries() {
        return f27710c;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    SceneCode(String str) {
        this.code = str;
    }
}
