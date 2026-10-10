package com.kubi.kumex.data.trade.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/StopOrderEntityActiveResult;", "", "orderId", "", "success", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getOrderId", "()Ljava/lang/String;", "setOrderId", "(Ljava/lang/String;)V", "getSuccess", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/kumex/data/trade/model/StopOrderEntityActiveResult;", "equals", "other", "hashCode", "", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class StopOrderEntityActiveResult {

    @Nullable
    private String orderId;

    @Nullable
    private Boolean success;

    /* JADX WARN: Multi-variable type inference failed */
    public StopOrderEntityActiveResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StopOrderEntityActiveResult)) {
            return false;
        }
        StopOrderEntityActiveResult stopOrderEntityActiveResult = (StopOrderEntityActiveResult) other;
        return Intrinsics.areEqual(this.orderId, stopOrderEntityActiveResult.orderId) && Intrinsics.areEqual(this.success, stopOrderEntityActiveResult.success);
    }

    public StopOrderEntityActiveResult(@Nullable String str, @Nullable Boolean bool) {
        this.orderId = str;
        this.success = bool;
    }

    public static /* synthetic */ StopOrderEntityActiveResult copy$default(StopOrderEntityActiveResult stopOrderEntityActiveResult, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = stopOrderEntityActiveResult.orderId;
        }
        if ((i11 & 2) != 0) {
            bool = stopOrderEntityActiveResult.success;
        }
        return stopOrderEntityActiveResult.copy(str, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final StopOrderEntityActiveResult copy(@Nullable String orderId, @Nullable Boolean success) {
        return new StopOrderEntityActiveResult(orderId, success);
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.success;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final void setOrderId(@Nullable String str) {
        this.orderId = str;
    }

    public final void setSuccess(@Nullable Boolean bool) {
        this.success = bool;
    }

    @NotNull
    public String toString() {
        return "StopOrderEntityActiveResult(orderId=" + this.orderId + ", success=" + this.success + ')';
    }

    public /* synthetic */ StopOrderEntityActiveResult(String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool);
    }
}
