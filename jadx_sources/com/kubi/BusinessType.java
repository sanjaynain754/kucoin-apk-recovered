package com.kubi;

import com.kubi.sdk.constant.monitor.KunlunBusinessEventEnum;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: TradeBusinessEvent.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/BusinessType;", "", "kunlunEvent", "Lcom/kubi/sdk/constant/monitor/KunlunBusinessEventEnum;", "<init>", "(Ljava/lang/String;ILcom/kubi/sdk/constant/monitor/KunlunBusinessEventEnum;)V", "getKunlunEvent", "()Lcom/kubi/sdk/constant/monitor/KunlunBusinessEventEnum;", "SpotTradeResult", "MarginTradeResult", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum BusinessType {
    SpotTradeResult(KunlunBusinessEventEnum.SPOT_TRADE_PRECHECK_RESULT),
    MarginTradeResult(KunlunBusinessEventEnum.MARGIN_TRADE_PRECHECK_RESULT);


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f14762c = EnumEntriesKt.enumEntries(m14623a());

    @NotNull
    private final KunlunBusinessEventEnum kunlunEvent;

    @NotNull
    public static EnumEntries<BusinessType> getEntries() {
        return f14762c;
    }

    @NotNull
    public final KunlunBusinessEventEnum getKunlunEvent() {
        return this.kunlunEvent;
    }

    BusinessType(KunlunBusinessEventEnum kunlunBusinessEventEnum) {
        this.kunlunEvent = kunlunBusinessEventEnum;
    }
}
