package com.kubi.kumex.data.trade.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderResult.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/OrderResult;", "Landroid/os/Parcelable;", "orderId", "", "tradeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "setOrderId", "(Ljava/lang/String;)V", "getTradeType", "setTradeType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OrderResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderResult> CREATOR = new C15836a();

    @Nullable
    private String orderId;

    @Nullable
    private String tradeType;

    /* JADX INFO: renamed from: com.kubi.kumex.data.trade.model.OrderResult$a */
    /* JADX INFO: compiled from: OrderResult.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15836a implements Parcelable.Creator<OrderResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OrderResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderResult(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OrderResult[] newArray(int i11) {
            return new OrderResult[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderResult)) {
            return false;
        }
        OrderResult orderResult = (OrderResult) other;
        return Intrinsics.areEqual(this.orderId, orderResult.orderId) && Intrinsics.areEqual(this.tradeType, orderResult.tradeType);
    }

    public OrderResult(@Nullable String str, @Nullable String str2) {
        this.orderId = str;
        this.tradeType = str2;
    }

    public static /* synthetic */ OrderResult copy$default(OrderResult orderResult, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderResult.orderId;
        }
        if ((i11 & 2) != 0) {
            str2 = orderResult.tradeType;
        }
        return orderResult.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @NotNull
    public final OrderResult copy(@Nullable String orderId, @Nullable String tradeType) {
        return new OrderResult(orderId, tradeType);
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tradeType;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setOrderId(@Nullable String str) {
        this.orderId = str;
    }

    public final void setTradeType(@Nullable String str) {
        this.tradeType = str;
    }

    @NotNull
    public String toString() {
        return "OrderResult(orderId=" + this.orderId + ", tradeType=" + this.tradeType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.orderId);
        dest.writeString(this.tradeType);
    }

    public /* synthetic */ OrderResult(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
