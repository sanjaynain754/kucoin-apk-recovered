package com.kubi.spot.quote.market.info;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketInfoEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/spot/quote/market/info/MarketCoinInfoEarn;", "Landroid/os/Parcelable;", "products", "", "", "todayTopProfitRateYear", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getProducts", "()Ljava/util/List;", "getTodayTopProfitRateYear", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketCoinInfoEarn implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarketCoinInfoEarn> CREATOR = new C25595a();

    @Nullable
    private final List<String> products;

    @Nullable
    private final String todayTopProfitRateYear;

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.info.MarketCoinInfoEarn$a */
    /* JADX INFO: compiled from: MarketInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25595a implements Parcelable.Creator<MarketCoinInfoEarn> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarketCoinInfoEarn createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarketCoinInfoEarn(parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarketCoinInfoEarn[] newArray(int i11) {
            return new MarketCoinInfoEarn[i11];
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
        if (!(other instanceof MarketCoinInfoEarn)) {
            return false;
        }
        MarketCoinInfoEarn marketCoinInfoEarn = (MarketCoinInfoEarn) other;
        return Intrinsics.areEqual(this.products, marketCoinInfoEarn.products) && Intrinsics.areEqual(this.todayTopProfitRateYear, marketCoinInfoEarn.todayTopProfitRateYear);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketCoinInfoEarn copy$default(MarketCoinInfoEarn marketCoinInfoEarn, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = marketCoinInfoEarn.products;
        }
        if ((i11 & 2) != 0) {
            str = marketCoinInfoEarn.todayTopProfitRateYear;
        }
        return marketCoinInfoEarn.copy(list, str);
    }

    @Nullable
    public final List<String> component1() {
        return this.products;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTodayTopProfitRateYear() {
        return this.todayTopProfitRateYear;
    }

    @NotNull
    public final MarketCoinInfoEarn copy(@Nullable List<String> products, @Nullable String todayTopProfitRateYear) {
        return new MarketCoinInfoEarn(products, todayTopProfitRateYear);
    }

    @Nullable
    public final List<String> getProducts() {
        return this.products;
    }

    @Nullable
    public final String getTodayTopProfitRateYear() {
        return this.todayTopProfitRateYear;
    }

    public int hashCode() {
        List<String> list = this.products;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.todayTopProfitRateYear;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketCoinInfoEarn(products=" + this.products + ", todayTopProfitRateYear=" + this.todayTopProfitRateYear + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.products);
        dest.writeString(this.todayTopProfitRateYear);
    }

    public MarketCoinInfoEarn(@Nullable List<String> list, @Nullable String str) {
        this.products = list;
        this.todayTopProfitRateYear = str;
    }
}
