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
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kumex/constant/KlineQuickOrderPrice;", "Landroid/os/Parcelable;", "symbol", "", FirebaseAnalytics.Param.PRICE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getPrice", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KlineQuickOrderPrice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KlineQuickOrderPrice> CREATOR = new C15767a();

    @NotNull
    private final String price;

    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.kumex.constant.KlineQuickOrderPrice$a */
    /* JADX INFO: compiled from: KlineConstant.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15767a implements Parcelable.Creator<KlineQuickOrderPrice> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KlineQuickOrderPrice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KlineQuickOrderPrice(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KlineQuickOrderPrice[] newArray(int i11) {
            return new KlineQuickOrderPrice[i11];
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
        if (!(other instanceof KlineQuickOrderPrice)) {
            return false;
        }
        KlineQuickOrderPrice klineQuickOrderPrice = (KlineQuickOrderPrice) other;
        return Intrinsics.areEqual(this.symbol, klineQuickOrderPrice.symbol) && Intrinsics.areEqual(this.price, klineQuickOrderPrice.price);
    }

    public KlineQuickOrderPrice(@NotNull String symbol, @NotNull String price) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(price, "price");
        this.symbol = symbol;
        this.price = price;
    }

    public static /* synthetic */ KlineQuickOrderPrice copy$default(KlineQuickOrderPrice klineQuickOrderPrice, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = klineQuickOrderPrice.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = klineQuickOrderPrice.price;
        }
        return klineQuickOrderPrice.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    public final KlineQuickOrderPrice copy(@NotNull String symbol, @NotNull String price) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(price, "price");
        return new KlineQuickOrderPrice(symbol, price);
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
        return (this.symbol.hashCode() * 31) + this.price.hashCode();
    }

    @NotNull
    public String toString() {
        return "KlineQuickOrderPrice(symbol=" + this.symbol + ", price=" + this.price + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeString(this.price);
    }
}
