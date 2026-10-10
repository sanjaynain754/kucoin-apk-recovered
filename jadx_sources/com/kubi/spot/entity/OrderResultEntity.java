package com.kubi.spot.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderResultEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/spot/entity/OrderResultEntity;", "", "limitOrderId", "", "orderId", "stopOrderId", "needPsd", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getLimitOrderId", "()Ljava/lang/String;", "getOrderId", "getStopOrderId", "getNeedPsd", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrderResultEntity {

    @Nullable
    private final String limitOrderId;
    private final boolean needPsd;

    @Nullable
    private final String orderId;

    @Nullable
    private final String stopOrderId;

    public OrderResultEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z11) {
        this.limitOrderId = str;
        this.orderId = str2;
        this.stopOrderId = str3;
        this.needPsd = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderResultEntity)) {
            return false;
        }
        OrderResultEntity orderResultEntity = (OrderResultEntity) other;
        return Intrinsics.areEqual(this.limitOrderId, orderResultEntity.limitOrderId) && Intrinsics.areEqual(this.orderId, orderResultEntity.orderId) && Intrinsics.areEqual(this.stopOrderId, orderResultEntity.stopOrderId) && this.needPsd == orderResultEntity.needPsd;
    }

    public static /* synthetic */ OrderResultEntity copy$default(OrderResultEntity orderResultEntity, String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderResultEntity.limitOrderId;
        }
        if ((i11 & 2) != 0) {
            str2 = orderResultEntity.orderId;
        }
        if ((i11 & 4) != 0) {
            str3 = orderResultEntity.stopOrderId;
        }
        if ((i11 & 8) != 0) {
            z11 = orderResultEntity.needPsd;
        }
        return orderResultEntity.copy(str, str2, str3, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLimitOrderId() {
        return this.limitOrderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStopOrderId() {
        return this.stopOrderId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getNeedPsd() {
        return this.needPsd;
    }

    @NotNull
    public final OrderResultEntity copy(@Nullable String limitOrderId, @Nullable String orderId, @Nullable String stopOrderId, boolean needPsd) {
        return new OrderResultEntity(limitOrderId, orderId, stopOrderId, needPsd);
    }

    @Nullable
    public final String getLimitOrderId() {
        return this.limitOrderId;
    }

    public final boolean getNeedPsd() {
        return this.needPsd;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getStopOrderId() {
        return this.stopOrderId;
    }

    public int hashCode() {
        String str = this.limitOrderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stopOrderId;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.needPsd);
    }

    @NotNull
    public String toString() {
        return "OrderResultEntity(limitOrderId=" + this.limitOrderId + ", orderId=" + this.orderId + ", stopOrderId=" + this.stopOrderId + ", needPsd=" + this.needPsd + ')';
    }

    public /* synthetic */ OrderResultEntity(String str, String str2, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? false : z11);
    }
}
