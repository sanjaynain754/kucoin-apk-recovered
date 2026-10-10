package com.kubi.core.base.order.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: CancelOrderData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/core/base/order/data/CancelOrderData$All$ResponseFail;", "Lcom/kubi/core/base/order/data/CancelOrderData$All$Response;", "apiCode", "", "tradeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getApiCode", "()Ljava/lang/String;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CancelOrderData$All$ResponseFail extends CancelOrderData$All$Response {

    @Nullable
    private final String apiCode;

    @Nullable
    public final String getApiCode() {
        return this.apiCode;
    }

    public CancelOrderData$All$ResponseFail(@Nullable String str, @Nullable String str2) {
        super(str2);
        this.apiCode = str;
    }
}
