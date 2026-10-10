package com.kubi.assets.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WealthEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0099\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00061"}, m90084d2 = {"Lcom/kubi/assets/entity/Summary;", "", "estReturn", "", "estReturnCurrency", "estReturnUSD", "estValue", "estValueCurrency", "estValueUSD", "totalReturn", "totalReturnCurrency", "totalReturnUSD", "estValueDisplay", "estReturnDisplay", "totalReturnDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEstReturn", "()Ljava/lang/String;", "getEstReturnCurrency", "getEstReturnUSD", "getEstValue", "getEstValueCurrency", "getEstValueUSD", "getTotalReturn", "getTotalReturnCurrency", "getTotalReturnUSD", "getEstValueDisplay", "getEstReturnDisplay", "getTotalReturnDisplay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Summary {

    @Nullable
    private final String estReturn;

    @Nullable
    private final String estReturnCurrency;

    @Nullable
    private final String estReturnDisplay;

    @Nullable
    private final String estReturnUSD;

    @Nullable
    private final String estValue;

    @Nullable
    private final String estValueCurrency;

    @Nullable
    private final String estValueDisplay;

    @Nullable
    private final String estValueUSD;

    @Nullable
    private final String totalReturn;

    @Nullable
    private final String totalReturnCurrency;

    @Nullable
    private final String totalReturnDisplay;

    @Nullable
    private final String totalReturnUSD;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Summary)) {
            return false;
        }
        Summary summary = (Summary) other;
        return Intrinsics.areEqual(this.estReturn, summary.estReturn) && Intrinsics.areEqual(this.estReturnCurrency, summary.estReturnCurrency) && Intrinsics.areEqual(this.estReturnUSD, summary.estReturnUSD) && Intrinsics.areEqual(this.estValue, summary.estValue) && Intrinsics.areEqual(this.estValueCurrency, summary.estValueCurrency) && Intrinsics.areEqual(this.estValueUSD, summary.estValueUSD) && Intrinsics.areEqual(this.totalReturn, summary.totalReturn) && Intrinsics.areEqual(this.totalReturnCurrency, summary.totalReturnCurrency) && Intrinsics.areEqual(this.totalReturnUSD, summary.totalReturnUSD) && Intrinsics.areEqual(this.estValueDisplay, summary.estValueDisplay) && Intrinsics.areEqual(this.estReturnDisplay, summary.estReturnDisplay) && Intrinsics.areEqual(this.totalReturnDisplay, summary.totalReturnDisplay);
    }

    public static /* synthetic */ Summary copy$default(Summary summary, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = summary.estReturn;
        }
        if ((i11 & 2) != 0) {
            str2 = summary.estReturnCurrency;
        }
        if ((i11 & 4) != 0) {
            str3 = summary.estReturnUSD;
        }
        if ((i11 & 8) != 0) {
            str4 = summary.estValue;
        }
        if ((i11 & 16) != 0) {
            str5 = summary.estValueCurrency;
        }
        if ((i11 & 32) != 0) {
            str6 = summary.estValueUSD;
        }
        if ((i11 & 64) != 0) {
            str7 = summary.totalReturn;
        }
        if ((i11 & 128) != 0) {
            str8 = summary.totalReturnCurrency;
        }
        if ((i11 & 256) != 0) {
            str9 = summary.totalReturnUSD;
        }
        if ((i11 & 512) != 0) {
            str10 = summary.estValueDisplay;
        }
        if ((i11 & 1024) != 0) {
            str11 = summary.estReturnDisplay;
        }
        if ((i11 & 2048) != 0) {
            str12 = summary.totalReturnDisplay;
        }
        String str13 = str11;
        String str14 = str12;
        String str15 = str9;
        String str16 = str10;
        String str17 = str7;
        String str18 = str8;
        String str19 = str5;
        String str20 = str6;
        return summary.copy(str, str2, str3, str4, str19, str20, str17, str18, str15, str16, str13, str14);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEstReturn() {
        return this.estReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getEstValueDisplay() {
        return this.estValueDisplay;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getEstReturnDisplay() {
        return this.estReturnDisplay;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTotalReturnDisplay() {
        return this.totalReturnDisplay;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEstReturnCurrency() {
        return this.estReturnCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEstReturnUSD() {
        return this.estReturnUSD;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEstValue() {
        return this.estValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEstValueCurrency() {
        return this.estValueCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEstValueUSD() {
        return this.estValueUSD;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTotalReturn() {
        return this.totalReturn;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTotalReturnCurrency() {
        return this.totalReturnCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTotalReturnUSD() {
        return this.totalReturnUSD;
    }

    @NotNull
    public final Summary copy(@Nullable String estReturn, @Nullable String estReturnCurrency, @Nullable String estReturnUSD, @Nullable String estValue, @Nullable String estValueCurrency, @Nullable String estValueUSD, @Nullable String totalReturn, @Nullable String totalReturnCurrency, @Nullable String totalReturnUSD, @Nullable String estValueDisplay, @Nullable String estReturnDisplay, @Nullable String totalReturnDisplay) {
        return new Summary(estReturn, estReturnCurrency, estReturnUSD, estValue, estValueCurrency, estValueUSD, totalReturn, totalReturnCurrency, totalReturnUSD, estValueDisplay, estReturnDisplay, totalReturnDisplay);
    }

    @Nullable
    public final String getEstReturn() {
        return this.estReturn;
    }

    @Nullable
    public final String getEstReturnCurrency() {
        return this.estReturnCurrency;
    }

    @Nullable
    public final String getEstReturnDisplay() {
        return this.estReturnDisplay;
    }

    @Nullable
    public final String getEstReturnUSD() {
        return this.estReturnUSD;
    }

    @Nullable
    public final String getEstValue() {
        return this.estValue;
    }

    @Nullable
    public final String getEstValueCurrency() {
        return this.estValueCurrency;
    }

    @Nullable
    public final String getEstValueDisplay() {
        return this.estValueDisplay;
    }

    @Nullable
    public final String getEstValueUSD() {
        return this.estValueUSD;
    }

    @Nullable
    public final String getTotalReturn() {
        return this.totalReturn;
    }

    @Nullable
    public final String getTotalReturnCurrency() {
        return this.totalReturnCurrency;
    }

    @Nullable
    public final String getTotalReturnDisplay() {
        return this.totalReturnDisplay;
    }

    @Nullable
    public final String getTotalReturnUSD() {
        return this.totalReturnUSD;
    }

    public int hashCode() {
        String str = this.estReturn;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.estReturnCurrency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.estReturnUSD;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.estValue;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.estValueCurrency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.estValueUSD;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.totalReturn;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.totalReturnCurrency;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.totalReturnUSD;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.estValueDisplay;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.estReturnDisplay;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.totalReturnDisplay;
        return iHashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Summary(estReturn=" + this.estReturn + ", estReturnCurrency=" + this.estReturnCurrency + ", estReturnUSD=" + this.estReturnUSD + ", estValue=" + this.estValue + ", estValueCurrency=" + this.estValueCurrency + ", estValueUSD=" + this.estValueUSD + ", totalReturn=" + this.totalReturn + ", totalReturnCurrency=" + this.totalReturnCurrency + ", totalReturnUSD=" + this.totalReturnUSD + ", estValueDisplay=" + this.estValueDisplay + ", estReturnDisplay=" + this.estReturnDisplay + ", totalReturnDisplay=" + this.totalReturnDisplay + ')';
    }

    public Summary(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
        this.estReturn = str;
        this.estReturnCurrency = str2;
        this.estReturnUSD = str3;
        this.estValue = str4;
        this.estValueCurrency = str5;
        this.estValueUSD = str6;
        this.totalReturn = str7;
        this.totalReturnCurrency = str8;
        this.totalReturnUSD = str9;
        this.estValueDisplay = str10;
        this.estReturnDisplay = str11;
        this.totalReturnDisplay = str12;
    }
}
