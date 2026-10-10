package com.kubi.data.rate;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CurrencyPrice.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J%\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\""}, m90084d2 = {"Lcom/kubi/data/rate/CurrencyPrice;", "Landroid/os/Parcelable;", "currencyUnit", "", FirebaseAnalytics.Param.PRICE, "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "<init>", "(Ljava/lang/String;Ljava/util/HashMap;)V", "getCurrencyUnit", "()Ljava/lang/String;", "setCurrencyUnit", "(Ljava/lang/String;)V", "getPrice", "()Ljava/util/HashMap;", "setPrice", "(Ljava/util/HashMap;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CurrencyPrice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CurrencyPrice> CREATOR = new C12567a();

    @NotNull
    private String currencyUnit;

    @NotNull
    private HashMap<String, Double> price;

    /* JADX INFO: renamed from: com.kubi.data.rate.CurrencyPrice$a */
    /* JADX INFO: compiled from: CurrencyPrice.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12567a implements Parcelable.Creator<CurrencyPrice> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CurrencyPrice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i11 = parcel.readInt();
            HashMap map = new HashMap(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                map.put(parcel.readString(), Double.valueOf(parcel.readDouble()));
            }
            return new CurrencyPrice(string, map);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CurrencyPrice[] newArray(int i11) {
            return new CurrencyPrice[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CurrencyPrice() {
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
        if (!(other instanceof CurrencyPrice)) {
            return false;
        }
        CurrencyPrice currencyPrice = (CurrencyPrice) other;
        return Intrinsics.areEqual(this.currencyUnit, currencyPrice.currencyUnit) && Intrinsics.areEqual(this.price, currencyPrice.price);
    }

    public CurrencyPrice(@NotNull String currencyUnit, @NotNull HashMap<String, Double> price) {
        Intrinsics.checkNotNullParameter(currencyUnit, "currencyUnit");
        Intrinsics.checkNotNullParameter(price, "price");
        this.currencyUnit = currencyUnit;
        this.price = price;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurrencyPrice copy$default(CurrencyPrice currencyPrice, String str, HashMap map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = currencyPrice.currencyUnit;
        }
        if ((i11 & 2) != 0) {
            map = currencyPrice.price;
        }
        return currencyPrice.copy(str, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrencyUnit() {
        return this.currencyUnit;
    }

    @NotNull
    public final HashMap<String, Double> component2() {
        return this.price;
    }

    @NotNull
    public final CurrencyPrice copy(@NotNull String currencyUnit, @NotNull HashMap<String, Double> price) {
        Intrinsics.checkNotNullParameter(currencyUnit, "currencyUnit");
        Intrinsics.checkNotNullParameter(price, "price");
        return new CurrencyPrice(currencyUnit, price);
    }

    @NotNull
    public final String getCurrencyUnit() {
        return this.currencyUnit;
    }

    @NotNull
    public final HashMap<String, Double> getPrice() {
        return this.price;
    }

    public int hashCode() {
        return (this.currencyUnit.hashCode() * 31) + this.price.hashCode();
    }

    public final void setCurrencyUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currencyUnit = str;
    }

    public final void setPrice(@NotNull HashMap<String, Double> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.price = map;
    }

    @NotNull
    public String toString() {
        return "CurrencyPrice(currencyUnit=" + this.currencyUnit + ", price=" + this.price + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currencyUnit);
        HashMap<String, Double> map = this.price;
        dest.writeInt(map.size());
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeDouble(entry.getValue().doubleValue());
        }
    }

    public /* synthetic */ CurrencyPrice(String str, HashMap map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? new HashMap() : map);
    }
}
