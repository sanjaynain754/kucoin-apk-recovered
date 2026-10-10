package com.kubi.core.base.order.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CancelOrderData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, m90084d2 = {"Lcom/kubi/core/base/order/data/CancelOrderData$Single$Response;", "Lcom/kubi/core/base/arch/api/IResponse;", "tradeType", "", "orderId", "clientOid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTradeType", "()Ljava/lang/String;", "getOrderId", "getClientOid", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class CancelOrderData$Single$Response {

    @Nullable
    private final String clientOid;

    @Nullable
    private final String orderId;

    @Nullable
    private final String tradeType;

    public CancelOrderData$Single$Response(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.tradeType = str;
        this.orderId = str2;
        this.clientOid = str3;
    }

    @Nullable
    public final String getClientOid() {
        return this.clientOid;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getTradeType() {
        return this.tradeType;
    }

    public /* synthetic */ CancelOrderData$Single$Response(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
