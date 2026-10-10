package com.kubi.futures.history.filter;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: AssetTypeClickFilterOfDelegation.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/history/filter/OrderAssetType;", "", "typeName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeName", "()Ljava/lang/String;", "SelfFunds", "TrialFund", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum OrderAssetType {
    SelfFunds("selfFunds"),
    TrialFund("trialFunds");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f23102c = EnumEntriesKt.enumEntries(m25628a());

    @NotNull
    private final String typeName;

    @NotNull
    public static EnumEntries<OrderAssetType> getEntries() {
        return f23102c;
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }

    OrderAssetType(String str) {
        this.typeName = str;
    }
}
