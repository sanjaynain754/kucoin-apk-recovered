package com.kubi.spot.dialog.order.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AmendParams.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\""}, m90084d2 = {"Lcom/kubi/spot/dialog/order/model/AmendParams;", "Landroid/os/Parcelable;", "orderId", "", "symbol", "newPrice", "newSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "setOrderId", "(Ljava/lang/String;)V", "getSymbol", "getNewPrice", "getNewSize", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AmendParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AmendParams> CREATOR = new C25294a();

    @Nullable
    private final String newPrice;

    @Nullable
    private final String newSize;

    @Nullable
    private String orderId;

    @Nullable
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.spot.dialog.order.model.AmendParams$a */
    /* JADX INFO: compiled from: AmendParams.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25294a implements Parcelable.Creator<AmendParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AmendParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AmendParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AmendParams[] newArray(int i11) {
            return new AmendParams[i11];
        }
    }

    public AmendParams() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmendParams)) {
            return false;
        }
        AmendParams amendParams = (AmendParams) other;
        return Intrinsics.areEqual(this.orderId, amendParams.orderId) && Intrinsics.areEqual(this.symbol, amendParams.symbol) && Intrinsics.areEqual(this.newPrice, amendParams.newPrice) && Intrinsics.areEqual(this.newSize, amendParams.newSize);
    }

    public AmendParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.orderId = str;
        this.symbol = str2;
        this.newPrice = str3;
        this.newSize = str4;
    }

    public static /* synthetic */ AmendParams copy$default(AmendParams amendParams, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = amendParams.orderId;
        }
        if ((i11 & 2) != 0) {
            str2 = amendParams.symbol;
        }
        if ((i11 & 4) != 0) {
            str3 = amendParams.newPrice;
        }
        if ((i11 & 8) != 0) {
            str4 = amendParams.newSize;
        }
        return amendParams.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNewPrice() {
        return this.newPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNewSize() {
        return this.newSize;
    }

    @NotNull
    public final AmendParams copy(@Nullable String orderId, @Nullable String symbol, @Nullable String newPrice, @Nullable String newSize) {
        return new AmendParams(orderId, symbol, newPrice, newSize);
    }

    @Nullable
    public final String getNewPrice() {
        return this.newPrice;
    }

    @Nullable
    public final String getNewSize() {
        return this.newSize;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.newPrice;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.newSize;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setOrderId(@Nullable String str) {
        this.orderId = str;
    }

    @NotNull
    public String toString() {
        return "AmendParams(orderId=" + this.orderId + ", symbol=" + this.symbol + ", newPrice=" + this.newPrice + ", newSize=" + this.newSize + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.orderId);
        dest.writeString(this.symbol);
        dest.writeString(this.newPrice);
        dest.writeString(this.newSize);
    }

    public /* synthetic */ AmendParams(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }
}
