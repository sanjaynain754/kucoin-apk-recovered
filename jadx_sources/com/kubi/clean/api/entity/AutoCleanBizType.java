package com.kubi.clean.api.entity;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: AutoCleanBizType.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/clean/api/entity/AutoCleanBizType;", "", "<init>", "(Ljava/lang/String;I)V", "IP_DIALOG", "IP_TOP_MESSAGE", "REGISTER", "FORCE_KYC_DIALOG", "FORCE_KYC_MESSAGE", "EXAMINE_DIALOG", "EXAMINE_MESSAGE", "CLEARANCE_DIALOG", "CLEARANCE_MESSAGE", "HOME", "AutoCleanUserApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum AutoCleanBizType {
    IP_DIALOG,
    IP_TOP_MESSAGE,
    REGISTER,
    FORCE_KYC_DIALOG,
    FORCE_KYC_MESSAGE,
    EXAMINE_DIALOG,
    EXAMINE_MESSAGE,
    CLEARANCE_DIALOG,
    CLEARANCE_MESSAGE,
    HOME;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f19481c = EnumEntriesKt.enumEntries(m20400a());

    @NotNull
    public static EnumEntries<AutoCleanBizType> getEntries() {
        return f19481c;
    }
}
