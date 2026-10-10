package com.kubi.payment.p2p.data.entities;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2POrder.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/PayMoneyRequest;", "", "orderId", "", "payTypeId", "payVoucherFileIds", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getOrderId", "()Ljava/lang/String;", "getPayTypeId", "getPayVoucherFileIds", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PayMoneyRequest {

    @Nullable
    private final String orderId;

    @Nullable
    private final String payTypeId;

    @Nullable
    private final List<String> payVoucherFileIds;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayMoneyRequest)) {
            return false;
        }
        PayMoneyRequest payMoneyRequest = (PayMoneyRequest) other;
        return Intrinsics.areEqual(this.orderId, payMoneyRequest.orderId) && Intrinsics.areEqual(this.payTypeId, payMoneyRequest.payTypeId) && Intrinsics.areEqual(this.payVoucherFileIds, payMoneyRequest.payVoucherFileIds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PayMoneyRequest copy$default(PayMoneyRequest payMoneyRequest, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = payMoneyRequest.orderId;
        }
        if ((i11 & 2) != 0) {
            str2 = payMoneyRequest.payTypeId;
        }
        if ((i11 & 4) != 0) {
            list = payMoneyRequest.payVoucherFileIds;
        }
        return payMoneyRequest.copy(str, str2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPayTypeId() {
        return this.payTypeId;
    }

    @Nullable
    public final List<String> component3() {
        return this.payVoucherFileIds;
    }

    @NotNull
    public final PayMoneyRequest copy(@Nullable String orderId, @Nullable String payTypeId, @Nullable List<String> payVoucherFileIds) {
        return new PayMoneyRequest(orderId, payTypeId, payVoucherFileIds);
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getPayTypeId() {
        return this.payTypeId;
    }

    @Nullable
    public final List<String> getPayVoucherFileIds() {
        return this.payVoucherFileIds;
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.payTypeId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.payVoucherFileIds;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PayMoneyRequest(orderId=" + this.orderId + ", payTypeId=" + this.payTypeId + ", payVoucherFileIds=" + this.payVoucherFileIds + ')';
    }

    public PayMoneyRequest(@Nullable String str, @Nullable String str2, @Nullable List<String> list) {
        this.orderId = str;
        this.payTypeId = str2;
        this.payVoucherFileIds = list;
    }
}
