package com.kubi.kumex.data.market.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QuotesEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001dJb\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020,R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u000b\u0010\u001d\"\u0004\b!\u0010\u001f¨\u00067"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/QuotesEntity;", "Landroid/os/Parcelable;", "symbol", "", "lastPrice", "Ljava/math/BigDecimal;", "priceChgPct", "turnover", "volume", "recommended", "", "isChecked", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getLastPrice", "()Ljava/math/BigDecimal;", "setLastPrice", "(Ljava/math/BigDecimal;)V", "getPriceChgPct", "setPriceChgPct", "getTurnover", "setTurnover", "getVolume", "setVolume", "getRecommended", "()Ljava/lang/Boolean;", "setRecommended", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setChecked", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/kumex/data/market/model/QuotesEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class QuotesEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<QuotesEntity> CREATOR = new C15785a();

    @Nullable
    private Boolean isChecked;

    @Nullable
    private BigDecimal lastPrice;

    @Nullable
    private BigDecimal priceChgPct;

    @Nullable
    private Boolean recommended;

    @Nullable
    private String symbol;

    @Nullable
    private BigDecimal turnover;

    @Nullable
    private BigDecimal volume;

    /* JADX INFO: renamed from: com.kubi.kumex.data.market.model.QuotesEntity$a */
    /* JADX INFO: compiled from: QuotesEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15785a implements Parcelable.Creator<QuotesEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final QuotesEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new QuotesEntity(string, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final QuotesEntity[] newArray(int i11) {
            return new QuotesEntity[i11];
        }
    }

    public QuotesEntity() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuotesEntity)) {
            return false;
        }
        QuotesEntity quotesEntity = (QuotesEntity) other;
        return Intrinsics.areEqual(this.symbol, quotesEntity.symbol) && Intrinsics.areEqual(this.lastPrice, quotesEntity.lastPrice) && Intrinsics.areEqual(this.priceChgPct, quotesEntity.priceChgPct) && Intrinsics.areEqual(this.turnover, quotesEntity.turnover) && Intrinsics.areEqual(this.volume, quotesEntity.volume) && Intrinsics.areEqual(this.recommended, quotesEntity.recommended) && Intrinsics.areEqual(this.isChecked, quotesEntity.isChecked);
    }

    public QuotesEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.symbol = str;
        this.lastPrice = bigDecimal;
        this.priceChgPct = bigDecimal2;
        this.turnover = bigDecimal3;
        this.volume = bigDecimal4;
        this.recommended = bool;
        this.isChecked = bool2;
    }

    public static /* synthetic */ QuotesEntity copy$default(QuotesEntity quotesEntity, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = quotesEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = quotesEntity.lastPrice;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = quotesEntity.priceChgPct;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = quotesEntity.turnover;
        }
        if ((i11 & 16) != 0) {
            bigDecimal4 = quotesEntity.volume;
        }
        if ((i11 & 32) != 0) {
            bool = quotesEntity.recommended;
        }
        if ((i11 & 64) != 0) {
            bool2 = quotesEntity.isChecked;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        BigDecimal bigDecimal5 = bigDecimal4;
        BigDecimal bigDecimal6 = bigDecimal2;
        return quotesEntity.copy(str, bigDecimal, bigDecimal6, bigDecimal3, bigDecimal5, bool3, bool4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getPriceChgPct() {
        return this.priceChgPct;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getTurnover() {
        return this.turnover;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getVolume() {
        return this.volume;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getRecommended() {
        return this.recommended;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsChecked() {
        return this.isChecked;
    }

    @NotNull
    public final QuotesEntity copy(@Nullable String symbol, @Nullable BigDecimal lastPrice, @Nullable BigDecimal priceChgPct, @Nullable BigDecimal turnover, @Nullable BigDecimal volume, @Nullable Boolean recommended, @Nullable Boolean isChecked) {
        return new QuotesEntity(symbol, lastPrice, priceChgPct, turnover, volume, recommended, isChecked);
    }

    @Nullable
    public final BigDecimal getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    public final BigDecimal getPriceChgPct() {
        return this.priceChgPct;
    }

    @Nullable
    public final Boolean getRecommended() {
        return this.recommended;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getTurnover() {
        return this.turnover;
    }

    @Nullable
    public final BigDecimal getVolume() {
        return this.volume;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.lastPrice;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.priceChgPct;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.turnover;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.volume;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        Boolean bool = this.recommended;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isChecked;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isChecked() {
        return this.isChecked;
    }

    public final void setChecked(@Nullable Boolean bool) {
        this.isChecked = bool;
    }

    public final void setLastPrice(@Nullable BigDecimal bigDecimal) {
        this.lastPrice = bigDecimal;
    }

    public final void setPriceChgPct(@Nullable BigDecimal bigDecimal) {
        this.priceChgPct = bigDecimal;
    }

    public final void setRecommended(@Nullable Boolean bool) {
        this.recommended = bool;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTurnover(@Nullable BigDecimal bigDecimal) {
        this.turnover = bigDecimal;
    }

    public final void setVolume(@Nullable BigDecimal bigDecimal) {
        this.volume = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "QuotesEntity(symbol=" + this.symbol + ", lastPrice=" + this.lastPrice + ", priceChgPct=" + this.priceChgPct + ", turnover=" + this.turnover + ", volume=" + this.volume + ", recommended=" + this.recommended + ", isChecked=" + this.isChecked + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeSerializable(this.lastPrice);
        dest.writeSerializable(this.priceChgPct);
        dest.writeSerializable(this.turnover);
        dest.writeSerializable(this.volume);
        Boolean bool = this.recommended;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isChecked;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ QuotesEntity(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : bigDecimal4, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? Boolean.FALSE : bool2);
    }
}
