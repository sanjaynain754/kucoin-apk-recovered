package com.kubi.core.base.order.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: CancelOrderData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/core/base/order/data/CancelOrderData$All$Response;", "Lcom/kubi/core/base/arch/api/IResponse;", "tradeType", "", "<init>", "(Ljava/lang/String;)V", "getTradeType", "()Ljava/lang/String;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class CancelOrderData$All$Response {

    @Nullable
    private final String tradeType;

    @Nullable
    public final String getTradeType() {
        return this.tradeType;
    }

    public CancelOrderData$All$Response(@Nullable String str) {
        this.tradeType = str;
    }
}
