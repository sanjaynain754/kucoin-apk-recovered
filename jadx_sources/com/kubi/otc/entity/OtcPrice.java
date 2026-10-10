package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OtcBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\fHÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/otc/entity/OtcPrice;", "Landroid/os/Parcelable;", "sell", "Ljava/math/BigDecimal;", "buy", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "()V", "getSell", "()Ljava/math/BigDecimal;", "getBuy", FirebaseAnalytics.Param.PRICE, "", "side", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OtcPrice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OtcPrice> CREATOR = new Creator();

    @SerializedName("BUY")
    @Nullable
    private final BigDecimal buy;

    @SerializedName("SELL")
    @Nullable
    private final BigDecimal sell;

    /* JADX INFO: compiled from: OtcBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<OtcPrice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtcPrice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OtcPrice((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtcPrice[] newArray(int i11) {
            return new OtcPrice[i11];
        }
    }

    public OtcPrice(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        this.sell = bigDecimal;
        this.buy = bigDecimal2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtcPrice)) {
            return false;
        }
        OtcPrice otcPrice = (OtcPrice) other;
        return Intrinsics.areEqual(this.sell, otcPrice.sell) && Intrinsics.areEqual(this.buy, otcPrice.buy);
    }

    public static /* synthetic */ OtcPrice copy$default(OtcPrice otcPrice, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = otcPrice.sell;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = otcPrice.buy;
        }
        return otcPrice.copy(bigDecimal, bigDecimal2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getSell() {
        return this.sell;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getBuy() {
        return this.buy;
    }

    @NotNull
    public final OtcPrice copy(@Nullable BigDecimal sell, @Nullable BigDecimal buy) {
        return new OtcPrice(sell, buy);
    }

    @Nullable
    public final BigDecimal getBuy() {
        return this.buy;
    }

    @Nullable
    public final BigDecimal getSell() {
        return this.sell;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.sell;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.buy;
        return iHashCode + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }

    @NotNull
    public final String price(@Nullable String side) {
        if (Intrinsics.areEqual(side, "SELL")) {
            BigDecimal bigDecimal = this.sell;
            return C27041f.m66668h(bigDecimal != null ? bigDecimal.toPlainString() : null);
        }
        if (!Intrinsics.areEqual(side, "BUY")) {
            return "0.00";
        }
        BigDecimal bigDecimal2 = this.buy;
        return C27041f.m66668h(bigDecimal2 != null ? bigDecimal2.toPlainString() : null);
    }

    @NotNull
    public String toString() {
        return "OtcPrice(sell=" + this.sell + ", buy=" + this.buy + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.sell);
        dest.writeSerializable(this.buy);
    }

    public OtcPrice() {
        this(null, null);
    }
}
