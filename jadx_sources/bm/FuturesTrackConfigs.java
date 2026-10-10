package bm;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bm.a, reason: from toString */
/* JADX INFO: compiled from: FuturesTrackConfigs.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/FuturesTrackConfigs;", "", "futuresPageId", "", "riskLimitPageId", "futuresKlinePageId", "positionTradeResultsEvent", "tradeResultsEvent", "futuresTradeResultEvent", "modifyOrderResult", "eventClickSubmitOrder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFuturesPageId", "()Ljava/lang/String;", "getRiskLimitPageId", "getFuturesKlinePageId", "getPositionTradeResultsEvent", "getTradeResultsEvent", "getFuturesTradeResultEvent", "getModifyOrderResult", "getEventClickSubmitOrder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesTrackConfigs {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String futuresPageId;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String riskLimitPageId;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String futuresKlinePageId;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final String positionTradeResultsEvent;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final String tradeResultsEvent;

    /* JADX INFO: renamed from: f, reason: from toString */
    @NotNull
    public final String futuresTradeResultEvent;

    /* JADX INFO: renamed from: g, reason: from toString */
    @NotNull
    public final String modifyOrderResult;

    /* JADX INFO: renamed from: h, reason: from toString */
    @NotNull
    public final String eventClickSubmitOrder;

    public FuturesTrackConfigs() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesTrackConfigs)) {
            return false;
        }
        FuturesTrackConfigs futuresTrackConfigs = (FuturesTrackConfigs) other;
        return Intrinsics.areEqual(this.futuresPageId, futuresTrackConfigs.futuresPageId) && Intrinsics.areEqual(this.riskLimitPageId, futuresTrackConfigs.riskLimitPageId) && Intrinsics.areEqual(this.futuresKlinePageId, futuresTrackConfigs.futuresKlinePageId) && Intrinsics.areEqual(this.positionTradeResultsEvent, futuresTrackConfigs.positionTradeResultsEvent) && Intrinsics.areEqual(this.tradeResultsEvent, futuresTrackConfigs.tradeResultsEvent) && Intrinsics.areEqual(this.futuresTradeResultEvent, futuresTrackConfigs.futuresTradeResultEvent) && Intrinsics.areEqual(this.modifyOrderResult, futuresTrackConfigs.modifyOrderResult) && Intrinsics.areEqual(this.eventClickSubmitOrder, futuresTrackConfigs.eventClickSubmitOrder);
    }

    public FuturesTrackConfigs(@NotNull String futuresPageId, @NotNull String riskLimitPageId, @NotNull String futuresKlinePageId, @NotNull String positionTradeResultsEvent, @NotNull String tradeResultsEvent, @NotNull String futuresTradeResultEvent, @NotNull String modifyOrderResult, @NotNull String eventClickSubmitOrder) {
        Intrinsics.checkNotNullParameter(futuresPageId, "futuresPageId");
        Intrinsics.checkNotNullParameter(riskLimitPageId, "riskLimitPageId");
        Intrinsics.checkNotNullParameter(futuresKlinePageId, "futuresKlinePageId");
        Intrinsics.checkNotNullParameter(positionTradeResultsEvent, "positionTradeResultsEvent");
        Intrinsics.checkNotNullParameter(tradeResultsEvent, "tradeResultsEvent");
        Intrinsics.checkNotNullParameter(futuresTradeResultEvent, "futuresTradeResultEvent");
        Intrinsics.checkNotNullParameter(modifyOrderResult, "modifyOrderResult");
        Intrinsics.checkNotNullParameter(eventClickSubmitOrder, "eventClickSubmitOrder");
        this.futuresPageId = futuresPageId;
        this.riskLimitPageId = riskLimitPageId;
        this.futuresKlinePageId = futuresKlinePageId;
        this.positionTradeResultsEvent = positionTradeResultsEvent;
        this.tradeResultsEvent = tradeResultsEvent;
        this.futuresTradeResultEvent = futuresTradeResultEvent;
        this.modifyOrderResult = modifyOrderResult;
        this.eventClickSubmitOrder = eventClickSubmitOrder;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEventClickSubmitOrder() {
        return this.eventClickSubmitOrder;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFuturesKlinePageId() {
        return this.futuresKlinePageId;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFuturesPageId() {
        return this.futuresPageId;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFuturesTradeResultEvent() {
        return this.futuresTradeResultEvent;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getModifyOrderResult() {
        return this.modifyOrderResult;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPositionTradeResultsEvent() {
        return this.positionTradeResultsEvent;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRiskLimitPageId() {
        return this.riskLimitPageId;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTradeResultsEvent() {
        return this.tradeResultsEvent;
    }

    public int hashCode() {
        return (((((((((((((this.futuresPageId.hashCode() * 31) + this.riskLimitPageId.hashCode()) * 31) + this.futuresKlinePageId.hashCode()) * 31) + this.positionTradeResultsEvent.hashCode()) * 31) + this.tradeResultsEvent.hashCode()) * 31) + this.futuresTradeResultEvent.hashCode()) * 31) + this.modifyOrderResult.hashCode()) * 31) + this.eventClickSubmitOrder.hashCode();
    }

    @NotNull
    public String toString() {
        return "FuturesTrackConfigs(futuresPageId=" + this.futuresPageId + ", riskLimitPageId=" + this.riskLimitPageId + ", futuresKlinePageId=" + this.futuresKlinePageId + ", positionTradeResultsEvent=" + this.positionTradeResultsEvent + ", tradeResultsEvent=" + this.tradeResultsEvent + ", futuresTradeResultEvent=" + this.futuresTradeResultEvent + ", modifyOrderResult=" + this.modifyOrderResult + ", eventClickSubmitOrder=" + this.eventClickSubmitOrder + ')';
    }

    public /* synthetic */ FuturesTrackConfigs(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "B6FuturesTrade" : str, (i11 & 2) != 0 ? "B6FuturesRiskLimit" : str2, (i11 & 4) != 0 ? "B6FuturesCandle" : str3, (i11 & 8) != 0 ? "posi_trade_results" : str4, (i11 & 16) != 0 ? "trade_results" : str5, (i11 & 32) != 0 ? "futures_trade_result" : str6, (i11 & 64) != 0 ? "modify_order_result" : str7, (i11 & 128) != 0 ? "click_submit_future_order" : str8);
    }
}
