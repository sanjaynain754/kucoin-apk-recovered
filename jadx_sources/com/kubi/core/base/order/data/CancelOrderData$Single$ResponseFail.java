package com.kubi.core.base.order.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CancelOrderData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/core/base/order/data/CancelOrderData$Single$ResponseFail;", "Lcom/kubi/core/base/order/data/CancelOrderData$Single$Response;", "apiCode", "", "tradeType", "orderId", "clientOid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiCode", "()Ljava/lang/String;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CancelOrderData$Single$ResponseFail extends CancelOrderData$Single$Response {

    @Nullable
    private final String apiCode;

    public /* synthetic */ CancelOrderData$Single$ResponseFail(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }

    public CancelOrderData$Single$ResponseFail(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        super(str2, str3, str4);
        this.apiCode = str;
    }

    @Nullable
    public final String getApiCode() {
        return this.apiCode;
    }
}
