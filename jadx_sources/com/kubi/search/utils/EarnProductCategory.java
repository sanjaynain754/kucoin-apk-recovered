package com.kubi.search.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: EarnProductCategory.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/search/utils/EarnProductCategory;", "", "<init>", "(Ljava/lang/String;I)V", "DEMAND", "STAKING", "ACTIVITY", "ETH2", "DUAL", "B2C_LENDING", "nameEqual", "", "name", "", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum EarnProductCategory {
    DEMAND,
    STAKING,
    ACTIVITY,
    ETH2,
    DUAL,
    B2C_LENDING;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f49137c = EnumEntriesKt.enumEntries(m59506a());

    @NotNull
    public static EnumEntries<EarnProductCategory> getEntries() {
        return f49137c;
    }

    public final boolean nameEqual(@Nullable String name) {
        return StringsKt.equals(name(), name, true);
    }
}
