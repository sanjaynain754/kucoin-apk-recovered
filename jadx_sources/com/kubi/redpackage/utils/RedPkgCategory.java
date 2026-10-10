package com.kubi.redpackage.utils;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: RedpkgEx.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/redpackage/utils/RedPkgCategory;", "", "<init>", "(Ljava/lang/String;I)V", "SEND_NOT_PWD", "SEND_NOT_BALANCE", "SEND_GET_CHECKS", "SEND_PWD_CHECK", "SEND_RESULT", "RECEIVE_CODE_CHECK", "RECEIVE_QUERY_RESULT", "RECEIVE_QUERY_EXPIRED", "RECEIVE_QUERY_RECEIVED", "RECEIVE_QUERY_REBACK", "RECEIVE_RESULT", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum RedPkgCategory {
    SEND_NOT_PWD,
    SEND_NOT_BALANCE,
    SEND_GET_CHECKS,
    SEND_PWD_CHECK,
    SEND_RESULT,
    RECEIVE_CODE_CHECK,
    RECEIVE_QUERY_RESULT,
    RECEIVE_QUERY_EXPIRED,
    RECEIVE_QUERY_RECEIVED,
    RECEIVE_QUERY_REBACK,
    RECEIVE_RESULT;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f43382c = EnumEntriesKt.enumEntries(m54088a());

    @NotNull
    public static EnumEntries<RedPkgCategory> getEntries() {
        return f43382c;
    }
}
