package com.kubi.data.coin;

import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: SymbolsTechEvent.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/data/coin/BizType;", "", "kunlunEvent", "Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;", "<init>", "(Ljava/lang/String;ILcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;)V", "getKunlunEvent", "()Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;", "SymbolEntityQuery", "CoinEntityQuery", "EtfEntityQuery", "TradeItemQuery", "OrderLimitQuery", "AlphaEntityQuery", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum BizType {
    SymbolEntityQuery(KunlunTechEventEnum.CATE_SYMBOL_ENTITY_QUERY),
    CoinEntityQuery(KunlunTechEventEnum.CATE_COIN_ENTITY_QUERY),
    EtfEntityQuery(KunlunTechEventEnum.CATE_ETF_ENTITY_QUERY),
    TradeItemQuery(KunlunTechEventEnum.CATE_TRADE_ENTITY_QUERY),
    OrderLimitQuery(KunlunTechEventEnum.CATE_ORDER_ENTITY_QUERY),
    AlphaEntityQuery(KunlunTechEventEnum.CATE_ALPHA_ENTITY_QUERY);


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f21420c = EnumEntriesKt.enumEntries(m23480a());

    @NotNull
    private final KunlunTechEventEnum kunlunEvent;

    @NotNull
    public static EnumEntries<BizType> getEntries() {
        return f21420c;
    }

    @NotNull
    public final KunlunTechEventEnum getKunlunEvent() {
        return this.kunlunEvent;
    }

    BizType(KunlunTechEventEnum kunlunTechEventEnum) {
        this.kunlunEvent = kunlunTechEventEnum;
    }
}
