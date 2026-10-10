package com.kubi.spot.dialog.order.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AmendParams.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\""}, m90084d2 = {"Lcom/kubi/spot/dialog/order/model/MarginAmendParams;", "Landroid/os/Parcelable;", "orderId", "", "symbol", FirebaseAnalytics.Param.PRICE, "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "setOrderId", "(Ljava/lang/String;)V", "getSymbol", "getPrice", "getSize", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginAmendParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarginAmendParams> CREATOR = new C25296a();

    @Nullable
    private String orderId;

    @Nullable
    private final String price;

    @Nullable
    private final String size;

    @Nullable
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.spot.dialog.order.model.MarginAmendParams$a */
    /* JADX INFO: compiled from: AmendParams.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25296a implements Parcelable.Creator<MarginAmendParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarginAmendParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarginAmendParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarginAmendParams[] newArray(int i11) {
            return new MarginAmendParams[i11];
        }
    }

    public MarginAmendParams() {
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
        if (!(other instanceof MarginAmendParams)) {
            return false;
        }
        MarginAmendParams marginAmendParams = (MarginAmendParams) other;
        return Intrinsics.areEqual(this.orderId, marginAmendParams.orderId) && Intrinsics.areEqual(this.symbol, marginAmendParams.symbol) && Intrinsics.areEqual(this.price, marginAmendParams.price) && Intrinsics.areEqual(this.size, marginAmendParams.size);
    }

    public MarginAmendParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.orderId = str;
        this.symbol = str2;
        this.price = str3;
        this.size = str4;
    }

    public static /* synthetic */ MarginAmendParams copy$default(MarginAmendParams marginAmendParams, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marginAmendParams.orderId;
        }
        if ((i11 & 2) != 0) {
            str2 = marginAmendParams.symbol;
        }
        if ((i11 & 4) != 0) {
            str3 = marginAmendParams.price;
        }
        if ((i11 & 8) != 0) {
            str4 = marginAmendParams.size;
        }
        return marginAmendParams.copy(str, str2, str3, str4);
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
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @NotNull
    public final MarginAmendParams copy(@Nullable String orderId, @Nullable String symbol, @Nullable String price, @Nullable String size) {
        return new MarginAmendParams(orderId, symbol, price, size);
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSize() {
        return this.size;
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
        String str3 = this.price;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.size;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setOrderId(@Nullable String str) {
        this.orderId = str;
    }

    @NotNull
    public String toString() {
        return "MarginAmendParams(orderId=" + this.orderId + ", symbol=" + this.symbol + ", price=" + this.price + ", size=" + this.size + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.orderId);
        dest.writeString(this.symbol);
        dest.writeString(this.price);
        dest.writeString(this.size);
    }

    public /* synthetic */ MarginAmendParams(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }
}
