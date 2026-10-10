package com.kubi.kumex.constant;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KlineConstant.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\""}, m90084d2 = {"Lcom/kubi/kumex/constant/KlineUpdatePrice;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.PRICE, "", "symbol", "isUp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getPrice", "()Ljava/lang/String;", "setPrice", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "()Z", "setUp", "(Z)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KlineUpdatePrice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KlineUpdatePrice> CREATOR = new C15770a();
    private boolean isUp;

    @NotNull
    private String price;

    @NotNull
    private String symbol;

    /* JADX INFO: renamed from: com.kubi.kumex.constant.KlineUpdatePrice$a */
    /* JADX INFO: compiled from: KlineConstant.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15770a implements Parcelable.Creator<KlineUpdatePrice> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KlineUpdatePrice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KlineUpdatePrice(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KlineUpdatePrice[] newArray(int i11) {
            return new KlineUpdatePrice[i11];
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
        if (!(other instanceof KlineUpdatePrice)) {
            return false;
        }
        KlineUpdatePrice klineUpdatePrice = (KlineUpdatePrice) other;
        return Intrinsics.areEqual(this.price, klineUpdatePrice.price) && Intrinsics.areEqual(this.symbol, klineUpdatePrice.symbol) && this.isUp == klineUpdatePrice.isUp;
    }

    public KlineUpdatePrice(@NotNull String price, @NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.price = price;
        this.symbol = symbol;
        this.isUp = z11;
    }

    public static /* synthetic */ KlineUpdatePrice copy$default(KlineUpdatePrice klineUpdatePrice, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = klineUpdatePrice.price;
        }
        if ((i11 & 2) != 0) {
            str2 = klineUpdatePrice.symbol;
        }
        if ((i11 & 4) != 0) {
            z11 = klineUpdatePrice.isUp;
        }
        return klineUpdatePrice.copy(str, str2, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsUp() {
        return this.isUp;
    }

    @NotNull
    public final KlineUpdatePrice copy(@NotNull String price, @NotNull String symbol, boolean isUp) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new KlineUpdatePrice(price, symbol, isUp);
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return (((this.price.hashCode() * 31) + this.symbol.hashCode()) * 31) + Boolean.hashCode(this.isUp);
    }

    public final boolean isUp() {
        return this.isUp;
    }

    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.price = str;
    }

    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.symbol = str;
    }

    public final void setUp(boolean z11) {
        this.isUp = z11;
    }

    @NotNull
    public String toString() {
        return "KlineUpdatePrice(price=" + this.price + ", symbol=" + this.symbol + ", isUp=" + this.isUp + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.price);
        dest.writeString(this.symbol);
        dest.writeInt(this.isUp ? 1 : 0);
    }
}
