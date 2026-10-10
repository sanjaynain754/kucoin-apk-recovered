package com.kubi.tradebase.tradetype;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.otc.entity.OtcAd;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: TradeType.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/tradebase/tradetype/TradeType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LIMIT", "MARKET", "ADVANCED_LIMIT", "CONDITIONAL", "LIMIT_STOP", "MARKET_STOP", "OCO", "TSO", "TWAP", OtcAd.STATUS_HIDDEN, "KLINE", "SEGMENT", "TradeBaseApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum TradeType {
    LIMIT(TUIConstants.TUIContact.LIMIT),
    MARKET("market"),
    ADVANCED_LIMIT("advancedLimit"),
    CONDITIONAL("conditional"),
    LIMIT_STOP("limitStop"),
    MARKET_STOP("marketStop"),
    OCO("oco"),
    TSO("tso"),
    TWAP("twap"),
    HIDDEN(ViewProps.HIDDEN),
    KLINE("kline"),
    SEGMENT("segment");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f51634c = EnumEntriesKt.enumEntries(m63335a());

    @NotNull
    private final String value;

    @NotNull
    public static EnumEntries<TradeType> getEntries() {
        return f51634c;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    TradeType(String str) {
        this.value = str;
    }
}
