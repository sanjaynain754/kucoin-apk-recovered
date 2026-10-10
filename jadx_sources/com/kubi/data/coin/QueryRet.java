package com.kubi.data.coin;

import com.sensorsdata.abtest.entity.AppConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: SymbolsTechEvent.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/data/coin/QueryRet;", "", "<init>", "(Ljava/lang/String;I)V", AppConstants.AB_TEST_SUCCESS, "FAILED", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum QueryRet {
    SUCCESS,
    FAILED;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f21426c = EnumEntriesKt.enumEntries(m23482a());

    @NotNull
    public static EnumEntries<QueryRet> getEntries() {
        return f21426c;
    }
}
