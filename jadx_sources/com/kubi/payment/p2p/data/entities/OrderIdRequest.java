package com.kubi.payment.p2p.data.entities;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2POrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/OrderIdRequest;", "", "orderId", "", "<init>", "(Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrderIdRequest {

    @Nullable
    private final String orderId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrderIdRequest) && Intrinsics.areEqual(this.orderId, ((OrderIdRequest) other).orderId);
    }

    public static /* synthetic */ OrderIdRequest copy$default(OrderIdRequest orderIdRequest, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderIdRequest.orderId;
        }
        return orderIdRequest.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final OrderIdRequest copy(@Nullable String orderId) {
        return new OrderIdRequest(orderId);
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        String str = this.orderId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "OrderIdRequest(orderId=" + this.orderId + ')';
    }

    public OrderIdRequest(@Nullable String str) {
        this.orderId = str;
    }
}
