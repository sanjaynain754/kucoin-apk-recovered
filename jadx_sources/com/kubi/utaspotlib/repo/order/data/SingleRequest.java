package com.kubi.utaspotlib.repo.order.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.data.UtaCancelOrderData$SingleRequest, reason: from toString */
/* JADX INFO: compiled from: UtaCancelOrderData.kt */
/* JADX INFO: loaded from: classes54.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/data/UtaCancelOrderData$SingleRequest;", "Landroid/os/Parcelable;", "tradeType", "", "symbol", "orderId", "clientOid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTradeType", "()Ljava/lang/String;", "getSymbol", "getOrderId", "getClientOid", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SingleRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SingleRequest> CREATOR = new C26940a();

    @Nullable
    private final String clientOid;

    @Nullable
    private final String orderId;

    @Nullable
    private final String symbol;

    @NotNull
    private final String tradeType;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.data.UtaCancelOrderData$SingleRequest$a */
    /* JADX INFO: compiled from: UtaCancelOrderData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26940a implements Parcelable.Creator<SingleRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SingleRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SingleRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SingleRequest[] newArray(int i11) {
            return new SingleRequest[i11];
        }
    }

    public SingleRequest(@NotNull String tradeType, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        this.tradeType = tradeType;
        this.symbol = str;
        this.orderId = str2;
        this.clientOid = str3;
    }

    public static /* synthetic */ SingleRequest copy$default(SingleRequest singleRequest, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = singleRequest.tradeType;
        }
        if ((i11 & 2) != 0) {
            str2 = singleRequest.symbol;
        }
        if ((i11 & 4) != 0) {
            str3 = singleRequest.orderId;
        }
        if ((i11 & 8) != 0) {
            str4 = singleRequest.clientOid;
        }
        return singleRequest.copy(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleRequest)) {
            return false;
        }
        SingleRequest singleRequest = (SingleRequest) other;
        return Intrinsics.areEqual(this.tradeType, singleRequest.tradeType) && Intrinsics.areEqual(this.symbol, singleRequest.symbol) && Intrinsics.areEqual(this.orderId, singleRequest.orderId) && Intrinsics.areEqual(this.clientOid, singleRequest.clientOid);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getClientOid() {
        return this.clientOid;
    }

    @NotNull
    public final SingleRequest copy(@NotNull String tradeType, @Nullable String symbol, @Nullable String orderId, @Nullable String clientOid) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        return new SingleRequest(tradeType, symbol, orderId, clientOid);
    }

    @Nullable
    public final String getClientOid() {
        return this.clientOid;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final String getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        int iHashCode = this.tradeType.hashCode() * 31;
        String str = this.symbol;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.orderId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientOid;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SingleRequest(tradeType=" + this.tradeType + ", symbol=" + this.symbol + ", orderId=" + this.orderId + ", clientOid=" + this.clientOid + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tradeType);
        dest.writeString(this.symbol);
        dest.writeString(this.orderId);
        dest.writeString(this.clientOid);
    }

    public /* synthetic */ SingleRequest(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "SPOT" : str, str2, str3, (i11 & 8) != 0 ? null : str4);
    }
}
