package com.kubi.utaspotlib.repo.order.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UtaMakeOrderData.kt */
/* JADX INFO: loaded from: classes54.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/data/UtaOrderResponse;", "Lcom/kubi/core/base/arch/api/IResponse;", "Landroid/os/Parcelable;", "tradeType", "", "orderId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTradeType", "()Ljava/lang/String;", "getOrderId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UtaOrderResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UtaOrderResponse> CREATOR = new C26952a();

    @Nullable
    private final String orderId;

    @Nullable
    private final String tradeType;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.data.UtaOrderResponse$a */
    /* JADX INFO: compiled from: UtaMakeOrderData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26952a implements Parcelable.Creator<UtaOrderResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UtaOrderResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UtaOrderResponse(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UtaOrderResponse[] newArray(int i11) {
            return new UtaOrderResponse[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UtaOrderResponse)) {
            return false;
        }
        UtaOrderResponse utaOrderResponse = (UtaOrderResponse) other;
        return Intrinsics.areEqual(this.tradeType, utaOrderResponse.tradeType) && Intrinsics.areEqual(this.orderId, utaOrderResponse.orderId);
    }

    public static /* synthetic */ UtaOrderResponse copy$default(UtaOrderResponse utaOrderResponse, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = utaOrderResponse.tradeType;
        }
        if ((i11 & 2) != 0) {
            str2 = utaOrderResponse.orderId;
        }
        return utaOrderResponse.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final UtaOrderResponse copy(@Nullable String tradeType, @Nullable String orderId) {
        return new UtaOrderResponse(tradeType, orderId);
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
        String str = this.tradeType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UtaOrderResponse(tradeType=" + this.tradeType + ", orderId=" + this.orderId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tradeType);
        dest.writeString(this.orderId);
    }

    public UtaOrderResponse(@Nullable String str, @Nullable String str2) {
        this.tradeType = str;
        this.orderId = str2;
    }
}
