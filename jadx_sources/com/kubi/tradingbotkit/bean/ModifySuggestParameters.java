package com.kubi.tradingbotkit.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModifySuggestParameters.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B§\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010;\u001a\u00020\nJ\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010(\u001a\u0004\b)\u0010'R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010(\u001a\u0004\b*\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b4\u0010.R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b6\u0010.R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b8\u0010.R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b9\u0010.R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010(\u001a\u0004\b:\u0010'¨\u0006A"}, m90084d2 = {"Lcom/kubi/tradingbotkit/bean/ModifySuggestParameters;", "Landroid/os/Parcelable;", "symbolName", "", "symbolCode", "baseCurrencyName", "baseCurrencyCode", "quoteCurrencyName", "quoteCurrencyCode", "priceIncrementPrecision", "", "quoteIncrementPrecision", "baseIncrementPrecision", "taskId", "minePriceRange", "mineGridNumberBd", "Ljava/math/BigDecimal;", "mineDealBaseNumberBd", "mineAdditionalInvestmentBd", "minePriceStartBd", "minePriceEndBd", "recommendPriceRange", "recommendGridNumberBd", "recommendAdditionalInvestmentBd", "recommendPriceStartBd", "recommendPriceEndBd", "lastPriceStartBd", "lastPriceEndBd", "modifyType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)V", "getSymbolName", "()Ljava/lang/String;", "getSymbolCode", "getBaseCurrencyName", "getBaseCurrencyCode", "getQuoteCurrencyName", "getQuoteCurrencyCode", "getPriceIncrementPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQuoteIncrementPrecision", "getBaseIncrementPrecision", "getTaskId", "getMinePriceRange", "getMineGridNumberBd", "()Ljava/math/BigDecimal;", "getMineDealBaseNumberBd", "getMineAdditionalInvestmentBd", "getMinePriceStartBd", "getMinePriceEndBd", "getRecommendPriceRange", "getRecommendGridNumberBd", "getRecommendAdditionalInvestmentBd", "getRecommendPriceStartBd", "getRecommendPriceEndBd", "getLastPriceStartBd", "getLastPriceEndBd", "getModifyType", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ModifySuggestParameters implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ModifySuggestParameters> CREATOR = new C26028a();

    @Nullable
    private final String baseCurrencyCode;

    @Nullable
    private final String baseCurrencyName;

    @Nullable
    private final Integer baseIncrementPrecision;

    @Nullable
    private final BigDecimal lastPriceEndBd;

    @Nullable
    private final BigDecimal lastPriceStartBd;

    @Nullable
    private final BigDecimal mineAdditionalInvestmentBd;

    @Nullable
    private final BigDecimal mineDealBaseNumberBd;

    @Nullable
    private final BigDecimal mineGridNumberBd;

    @Nullable
    private final BigDecimal minePriceEndBd;

    @Nullable
    private final String minePriceRange;

    @Nullable
    private final BigDecimal minePriceStartBd;

    @Nullable
    private final Integer modifyType;

    @Nullable
    private final Integer priceIncrementPrecision;

    @Nullable
    private final String quoteCurrencyCode;

    @Nullable
    private final String quoteCurrencyName;

    @Nullable
    private final Integer quoteIncrementPrecision;

    @Nullable
    private final BigDecimal recommendAdditionalInvestmentBd;

    @Nullable
    private final BigDecimal recommendGridNumberBd;

    @Nullable
    private final BigDecimal recommendPriceEndBd;

    @Nullable
    private final String recommendPriceRange;

    @Nullable
    private final BigDecimal recommendPriceStartBd;

    @Nullable
    private final String symbolCode;

    @Nullable
    private final String symbolName;

    @Nullable
    private final String taskId;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.bean.ModifySuggestParameters$a */
    /* JADX INFO: compiled from: ModifySuggestParameters.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26028a implements Parcelable.Creator<ModifySuggestParameters> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ModifySuggestParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ModifySuggestParameters(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ModifySuggestParameters[] newArray(int i11) {
            return new ModifySuggestParameters[i11];
        }
    }

    public ModifySuggestParameters() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ModifySuggestParameters(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str7, @Nullable String str8, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable String str9, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11, @Nullable Integer num4) {
        this.symbolName = str;
        this.symbolCode = str2;
        this.baseCurrencyName = str3;
        this.baseCurrencyCode = str4;
        this.quoteCurrencyName = str5;
        this.quoteCurrencyCode = str6;
        this.priceIncrementPrecision = num;
        this.quoteIncrementPrecision = num2;
        this.baseIncrementPrecision = num3;
        this.taskId = str7;
        this.minePriceRange = str8;
        this.mineGridNumberBd = bigDecimal;
        this.mineDealBaseNumberBd = bigDecimal2;
        this.mineAdditionalInvestmentBd = bigDecimal3;
        this.minePriceStartBd = bigDecimal4;
        this.minePriceEndBd = bigDecimal5;
        this.recommendPriceRange = str9;
        this.recommendGridNumberBd = bigDecimal6;
        this.recommendAdditionalInvestmentBd = bigDecimal7;
        this.recommendPriceStartBd = bigDecimal8;
        this.recommendPriceEndBd = bigDecimal9;
        this.lastPriceStartBd = bigDecimal10;
        this.lastPriceEndBd = bigDecimal11;
        this.modifyType = num4;
    }

    @Nullable
    public final String getBaseCurrencyCode() {
        return this.baseCurrencyCode;
    }

    @Nullable
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    @Nullable
    public final Integer getBaseIncrementPrecision() {
        return this.baseIncrementPrecision;
    }

    @Nullable
    public final BigDecimal getLastPriceEndBd() {
        return this.lastPriceEndBd;
    }

    @Nullable
    public final BigDecimal getLastPriceStartBd() {
        return this.lastPriceStartBd;
    }

    @Nullable
    public final BigDecimal getMineAdditionalInvestmentBd() {
        return this.mineAdditionalInvestmentBd;
    }

    @Nullable
    public final BigDecimal getMineDealBaseNumberBd() {
        return this.mineDealBaseNumberBd;
    }

    @Nullable
    public final BigDecimal getMineGridNumberBd() {
        return this.mineGridNumberBd;
    }

    @Nullable
    public final BigDecimal getMinePriceEndBd() {
        return this.minePriceEndBd;
    }

    @Nullable
    public final String getMinePriceRange() {
        return this.minePriceRange;
    }

    @Nullable
    public final BigDecimal getMinePriceStartBd() {
        return this.minePriceStartBd;
    }

    @Nullable
    public final Integer getModifyType() {
        return this.modifyType;
    }

    @Nullable
    public final Integer getPriceIncrementPrecision() {
        return this.priceIncrementPrecision;
    }

    @Nullable
    public final String getQuoteCurrencyCode() {
        return this.quoteCurrencyCode;
    }

    @Nullable
    public final String getQuoteCurrencyName() {
        return this.quoteCurrencyName;
    }

    @Nullable
    public final Integer getQuoteIncrementPrecision() {
        return this.quoteIncrementPrecision;
    }

    @Nullable
    public final BigDecimal getRecommendAdditionalInvestmentBd() {
        return this.recommendAdditionalInvestmentBd;
    }

    @Nullable
    public final BigDecimal getRecommendGridNumberBd() {
        return this.recommendGridNumberBd;
    }

    @Nullable
    public final BigDecimal getRecommendPriceEndBd() {
        return this.recommendPriceEndBd;
    }

    @Nullable
    public final String getRecommendPriceRange() {
        return this.recommendPriceRange;
    }

    @Nullable
    public final BigDecimal getRecommendPriceStartBd() {
        return this.recommendPriceStartBd;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final String getSymbolName() {
        return this.symbolName;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbolName);
        dest.writeString(this.symbolCode);
        dest.writeString(this.baseCurrencyName);
        dest.writeString(this.baseCurrencyCode);
        dest.writeString(this.quoteCurrencyName);
        dest.writeString(this.quoteCurrencyCode);
        Integer num = this.priceIncrementPrecision;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.quoteIncrementPrecision;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.baseIncrementPrecision;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.taskId);
        dest.writeString(this.minePriceRange);
        dest.writeSerializable(this.mineGridNumberBd);
        dest.writeSerializable(this.mineDealBaseNumberBd);
        dest.writeSerializable(this.mineAdditionalInvestmentBd);
        dest.writeSerializable(this.minePriceStartBd);
        dest.writeSerializable(this.minePriceEndBd);
        dest.writeString(this.recommendPriceRange);
        dest.writeSerializable(this.recommendGridNumberBd);
        dest.writeSerializable(this.recommendAdditionalInvestmentBd);
        dest.writeSerializable(this.recommendPriceStartBd);
        dest.writeSerializable(this.recommendPriceEndBd);
        dest.writeSerializable(this.lastPriceStartBd);
        dest.writeSerializable(this.lastPriceEndBd);
        Integer num4 = this.modifyType;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
    }

    public /* synthetic */ ModifySuggestParameters(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, String str7, String str8, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str9, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, Integer num4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : num2, (i11 & 256) != 0 ? null : num3, (i11 & 512) != 0 ? null : str7, (i11 & 1024) != 0 ? null : str8, (i11 & 2048) != 0 ? null : bigDecimal, (i11 & 4096) != 0 ? null : bigDecimal2, (i11 & 8192) != 0 ? null : bigDecimal3, (i11 & 16384) != 0 ? null : bigDecimal4, (i11 & 32768) != 0 ? null : bigDecimal5, (i11 & 65536) != 0 ? null : str9, (i11 & 131072) != 0 ? null : bigDecimal6, (i11 & 262144) != 0 ? null : bigDecimal7, (i11 & 524288) != 0 ? null : bigDecimal8, (i11 & 1048576) != 0 ? null : bigDecimal9, (i11 & 2097152) != 0 ? null : bigDecimal10, (i11 & 4194304) != 0 ? null : bigDecimal11, (i11 & 8388608) != 0 ? null : num4);
    }
}
