package com.kubi.margin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.MarketTicker;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33820nf;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: IndexData.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0019\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003JQ\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010'\u001a\u00020(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020(HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001J\u0016\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020(R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u00063"}, m90084d2 = {"Lcom/kubi/margin/entity/IndexSymbolData;", "Landroid/os/Parcelable;", "change", "Ljava/math/BigDecimal;", "name", "", FirebaseAnalytics.Param.PRICE, "high", "low", "symbol", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getChange", "()Ljava/math/BigDecimal;", "setChange", "(Ljava/math/BigDecimal;)V", "getName", "()Ljava/lang/String;", "getPrice", "setPrice", "getHigh", "setHigh", "getLow", "setLow", "getSymbol", "getQuoteCurrency", "getQuoteName", "getFormatChangeRate", "covertToTicker", "", "marketTicker", "Lcom/kubi/data/entity/MarketTicker;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class IndexSymbolData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IndexSymbolData> CREATOR = new C17614a();

    @Nullable
    private BigDecimal change;

    @Nullable
    private BigDecimal high;

    @Nullable
    private BigDecimal low;

    @Nullable
    private final String name;

    @Nullable
    private BigDecimal price;

    @Nullable
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.margin.entity.IndexSymbolData$a */
    /* JADX INFO: compiled from: IndexData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17614a implements Parcelable.Creator<IndexSymbolData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IndexSymbolData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IndexSymbolData((BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IndexSymbolData[] newArray(int i11) {
            return new IndexSymbolData[i11];
        }
    }

    public IndexSymbolData() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexSymbolData)) {
            return false;
        }
        IndexSymbolData indexSymbolData = (IndexSymbolData) other;
        return Intrinsics.areEqual(this.change, indexSymbolData.change) && Intrinsics.areEqual(this.name, indexSymbolData.name) && Intrinsics.areEqual(this.price, indexSymbolData.price) && Intrinsics.areEqual(this.high, indexSymbolData.high) && Intrinsics.areEqual(this.low, indexSymbolData.low) && Intrinsics.areEqual(this.symbol, indexSymbolData.symbol);
    }

    public IndexSymbolData(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable String str2) {
        this.change = bigDecimal;
        this.name = str;
        this.price = bigDecimal2;
        this.high = bigDecimal3;
        this.low = bigDecimal4;
        this.symbol = str2;
    }

    public static /* synthetic */ IndexSymbolData copy$default(IndexSymbolData indexSymbolData, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = indexSymbolData.change;
        }
        if ((i11 & 2) != 0) {
            str = indexSymbolData.name;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = indexSymbolData.price;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = indexSymbolData.high;
        }
        if ((i11 & 16) != 0) {
            bigDecimal4 = indexSymbolData.low;
        }
        if ((i11 & 32) != 0) {
            str2 = indexSymbolData.symbol;
        }
        BigDecimal bigDecimal5 = bigDecimal4;
        String str3 = str2;
        return indexSymbolData.copy(bigDecimal, str, bigDecimal2, bigDecimal3, bigDecimal5, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getChange() {
        return this.change;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getHigh() {
        return this.high;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getLow() {
        return this.low;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final IndexSymbolData copy(@Nullable BigDecimal change, @Nullable String name, @Nullable BigDecimal price, @Nullable BigDecimal high, @Nullable BigDecimal low, @Nullable String symbol) {
        return new IndexSymbolData(change, name, price, high, low, symbol);
    }

    public final void covertToTicker(@NotNull MarketTicker marketTicker) {
        Intrinsics.checkNotNullParameter(marketTicker, "marketTicker");
        BigDecimal bigDecimal = this.change;
        marketTicker.setChangeRate(bigDecimal != null ? Double.valueOf(bigDecimal.doubleValue()) : null);
        BigDecimal bigDecimal2 = this.price;
        marketTicker.setLastDealPrice(bigDecimal2 != null ? Double.valueOf(bigDecimal2.doubleValue()) : null);
        BigDecimal bigDecimal3 = this.high;
        marketTicker.setHigh(bigDecimal3 != null ? Double.valueOf(bigDecimal3.doubleValue()) : null);
        BigDecimal bigDecimal4 = this.low;
        marketTicker.setLow(bigDecimal4 != null ? Double.valueOf(bigDecimal4.doubleValue()) : null);
        marketTicker.setValue(null);
    }

    @Nullable
    public final BigDecimal getChange() {
        return this.change;
    }

    @NotNull
    public final String getFormatChangeRate() {
        BigDecimal bigDecimal = this.change;
        return C42180b.m92649n(bigDecimal != null ? C42180b.m92642g(bigDecimal, null, null, 0, true, false, false, 55, null) : null);
    }

    @Nullable
    public final BigDecimal getHigh() {
        return this.high;
    }

    @Nullable
    public final BigDecimal getLow() {
        return this.low;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @NotNull
    public final String getQuoteCurrency() {
        List listSplit$default;
        String str = this.symbol;
        return C27041f.m66669i((str == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null)) == null) ? null : (String) listSplit$default.get(1), "USDT");
    }

    @NotNull
    public final String getQuoteName() {
        List listSplit$default;
        String str = this.name;
        return C27041f.m66669i((str == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null)) == null) ? null : (String) listSplit$default.get(1), "USDT");
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.change;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.price;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.high;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.low;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str2 = this.symbol;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setChange(@Nullable BigDecimal bigDecimal) {
        this.change = bigDecimal;
    }

    public final void setHigh(@Nullable BigDecimal bigDecimal) {
        this.high = bigDecimal;
    }

    public final void setLow(@Nullable BigDecimal bigDecimal) {
        this.low = bigDecimal;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "IndexSymbolData(change=" + this.change + ", name=" + this.name + ", price=" + this.price + ", high=" + this.high + ", low=" + this.low + ", symbol=" + this.symbol + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.change);
        dest.writeString(this.name);
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.high);
        dest.writeSerializable(this.low);
        dest.writeString(this.symbol);
    }

    public /* synthetic */ IndexSymbolData(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : bigDecimal4, (i11 & 32) != 0 ? null : str2);
    }
}
