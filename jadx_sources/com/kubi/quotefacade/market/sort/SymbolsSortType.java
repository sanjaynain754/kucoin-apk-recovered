package com.kubi.quotefacade.market.sort;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: ToggleSortPopWindow.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/quotefacade/market/sort/SymbolsSortType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "NAME", "AMOUNT", "PRICE", "CHANGE_RATE", "MARKET_CAP", "FUNDING_RATE", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum SymbolsSortType {
    DEFAULT,
    NAME,
    AMOUNT,
    PRICE,
    CHANGE_RATE,
    MARKET_CAP,
    FUNDING_RATE;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f42347c = EnumEntriesKt.enumEntries(m52602a());

    @NotNull
    public static EnumEntries<SymbolsSortType> getEntries() {
        return f42347c;
    }
}
