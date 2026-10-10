package com.kubi.futures.trade.config.positions;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: PnlCalculatePriceTypeConfig.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;", "", "<init>", "(Ljava/lang/String;I)V", "MarkPrice", "LatestPrice", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum PnlCalculatePriceType {
    MarkPrice,
    LatestPrice;


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f23768c = EnumEntriesKt.enumEntries(m26991a());

    @NotNull
    public static EnumEntries<PnlCalculatePriceType> getEntries() {
        return f23768c;
    }
}
