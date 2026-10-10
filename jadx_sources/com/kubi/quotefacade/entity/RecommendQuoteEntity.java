package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RecommendQuoteEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJb\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020\u000bJ\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u000bHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u00065"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/RecommendQuoteEntity;", "Landroid/os/Parcelable;", "symbol", "", "baseCurrency", "quoteCurrency", "currentPrice", "Ljava/math/BigDecimal;", "increaseDndDecrease", "iconUrl", "collectType", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;)V", "getSymbol", "()Ljava/lang/String;", "getBaseCurrency", "getQuoteCurrency", "getCurrentPrice", "()Ljava/math/BigDecimal;", "setCurrentPrice", "(Ljava/math/BigDecimal;)V", "getIncreaseDndDecrease", "setIncreaseDndDecrease", "getIconUrl", "setIconUrl", "(Ljava/lang/String;)V", "getCollectType", "()Ljava/lang/Integer;", "setCollectType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kubi/quotefacade/entity/RecommendQuoteEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RecommendQuoteEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RecommendQuoteEntity> CREATOR = new C21908a();

    @Nullable
    private final String baseCurrency;

    @Nullable
    private Integer collectType;

    @Nullable
    private BigDecimal currentPrice;

    @Nullable
    private String iconUrl;

    @Nullable
    private BigDecimal increaseDndDecrease;

    @Nullable
    private final String quoteCurrency;

    @Nullable
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.RecommendQuoteEntity$a */
    /* JADX INFO: compiled from: RecommendQuoteEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21908a implements Parcelable.Creator<RecommendQuoteEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecommendQuoteEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecommendQuoteEntity(parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RecommendQuoteEntity[] newArray(int i11) {
            return new RecommendQuoteEntity[i11];
        }
    }

    public RecommendQuoteEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str4, @Nullable Integer num) {
        this.symbol = str;
        this.baseCurrency = str2;
        this.quoteCurrency = str3;
        this.currentPrice = bigDecimal;
        this.increaseDndDecrease = bigDecimal2;
        this.iconUrl = str4;
        this.collectType = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendQuoteEntity)) {
            return false;
        }
        RecommendQuoteEntity recommendQuoteEntity = (RecommendQuoteEntity) other;
        return Intrinsics.areEqual(this.symbol, recommendQuoteEntity.symbol) && Intrinsics.areEqual(this.baseCurrency, recommendQuoteEntity.baseCurrency) && Intrinsics.areEqual(this.quoteCurrency, recommendQuoteEntity.quoteCurrency) && Intrinsics.areEqual(this.currentPrice, recommendQuoteEntity.currentPrice) && Intrinsics.areEqual(this.increaseDndDecrease, recommendQuoteEntity.increaseDndDecrease) && Intrinsics.areEqual(this.iconUrl, recommendQuoteEntity.iconUrl) && Intrinsics.areEqual(this.collectType, recommendQuoteEntity.collectType);
    }

    public static /* synthetic */ RecommendQuoteEntity copy$default(RecommendQuoteEntity recommendQuoteEntity, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str4, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = recommendQuoteEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = recommendQuoteEntity.baseCurrency;
        }
        if ((i11 & 4) != 0) {
            str3 = recommendQuoteEntity.quoteCurrency;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = recommendQuoteEntity.currentPrice;
        }
        if ((i11 & 16) != 0) {
            bigDecimal2 = recommendQuoteEntity.increaseDndDecrease;
        }
        if ((i11 & 32) != 0) {
            str4 = recommendQuoteEntity.iconUrl;
        }
        if ((i11 & 64) != 0) {
            num = recommendQuoteEntity.collectType;
        }
        String str5 = str4;
        Integer num2 = num;
        BigDecimal bigDecimal3 = bigDecimal2;
        String str6 = str3;
        return recommendQuoteEntity.copy(str, str2, str6, bigDecimal, bigDecimal3, str5, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getCurrentPrice() {
        return this.currentPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getIncreaseDndDecrease() {
        return this.increaseDndDecrease;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getCollectType() {
        return this.collectType;
    }

    @NotNull
    public final RecommendQuoteEntity copy(@Nullable String symbol, @Nullable String baseCurrency, @Nullable String quoteCurrency, @Nullable BigDecimal currentPrice, @Nullable BigDecimal increaseDndDecrease, @Nullable String iconUrl, @Nullable Integer collectType) {
        return new RecommendQuoteEntity(symbol, baseCurrency, quoteCurrency, currentPrice, increaseDndDecrease, iconUrl, collectType);
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final Integer getCollectType() {
        return this.collectType;
    }

    @Nullable
    public final BigDecimal getCurrentPrice() {
        return this.currentPrice;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final BigDecimal getIncreaseDndDecrease() {
        return this.increaseDndDecrease;
    }

    @Nullable
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.baseCurrency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.quoteCurrency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.currentPrice;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.increaseDndDecrease;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str4 = this.iconUrl;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.collectType;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final void setCollectType(@Nullable Integer num) {
        this.collectType = num;
    }

    public final void setCurrentPrice(@Nullable BigDecimal bigDecimal) {
        this.currentPrice = bigDecimal;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setIncreaseDndDecrease(@Nullable BigDecimal bigDecimal) {
        this.increaseDndDecrease = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "RecommendQuoteEntity(symbol=" + this.symbol + ", baseCurrency=" + this.baseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", currentPrice=" + this.currentPrice + ", increaseDndDecrease=" + this.increaseDndDecrease + ", iconUrl=" + this.iconUrl + ", collectType=" + this.collectType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeString(this.baseCurrency);
        dest.writeString(this.quoteCurrency);
        dest.writeSerializable(this.currentPrice);
        dest.writeSerializable(this.increaseDndDecrease);
        dest.writeString(this.iconUrl);
        Integer num = this.collectType;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public /* synthetic */ RecommendQuoteEntity(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str4, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : bigDecimal, (i11 & 16) != 0 ? null : bigDecimal2, str4, num);
    }
}
