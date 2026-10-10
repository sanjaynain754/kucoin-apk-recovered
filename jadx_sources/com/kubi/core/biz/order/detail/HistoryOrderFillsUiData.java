package com.kubi.core.biz.order.detail;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HistoryOrderFillsUiData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0092\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00100J\u0006\u00101\u001a\u000202J\u0013\u00103\u001a\u00020\u000f2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000202HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000202R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016¨\u0006="}, m90084d2 = {"Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "side", "", "size", "time", "", "fee", FirebaseAnalytics.Param.TAX, "taxRate", "taxCurrency", "feeCurrency", "forceTaker", "", "liquidityRole", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getPrice", "()Ljava/math/BigDecimal;", "getSide", "()Ljava/lang/String;", "getSize", "getTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFee", "getTax", "getTaxRate", "getTaxCurrency", "getFeeCurrency", "getForceTaker", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLiquidityRole", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/core/biz/order/detail/HistoryOrderFillsUiData;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HistoryOrderFillsUiData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HistoryOrderFillsUiData> CREATOR = new C12017a();

    @Nullable
    private final BigDecimal fee;

    @Nullable
    private final String feeCurrency;

    @Nullable
    private final Boolean forceTaker;

    @Nullable
    private final String liquidityRole;

    @Nullable
    private final BigDecimal price;

    @Nullable
    private final String side;

    @Nullable
    private final BigDecimal size;

    @SerializedName("newTax")
    @Nullable
    private final String tax;

    @Nullable
    private final String taxCurrency;

    @Nullable
    private final String taxRate;

    @Nullable
    private final Long time;

    /* JADX INFO: renamed from: com.kubi.core.biz.order.detail.HistoryOrderFillsUiData$a */
    /* JADX INFO: compiled from: HistoryOrderFillsUiData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12017a implements Parcelable.Creator<HistoryOrderFillsUiData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HistoryOrderFillsUiData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String string = parcel.readString();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            Boolean boolValueOf = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new HistoryOrderFillsUiData(bigDecimal, string, bigDecimal2, lValueOf, bigDecimal3, string2, string3, string4, string5, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HistoryOrderFillsUiData[] newArray(int i11) {
            return new HistoryOrderFillsUiData[i11];
        }
    }

    public static /* synthetic */ HistoryOrderFillsUiData copy$default(HistoryOrderFillsUiData historyOrderFillsUiData, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, Long l11, BigDecimal bigDecimal3, String str2, String str3, String str4, String str5, Boolean bool, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = historyOrderFillsUiData.price;
        }
        if ((i11 & 2) != 0) {
            str = historyOrderFillsUiData.side;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = historyOrderFillsUiData.size;
        }
        if ((i11 & 8) != 0) {
            l11 = historyOrderFillsUiData.time;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = historyOrderFillsUiData.fee;
        }
        if ((i11 & 32) != 0) {
            str2 = historyOrderFillsUiData.tax;
        }
        if ((i11 & 64) != 0) {
            str3 = historyOrderFillsUiData.taxRate;
        }
        if ((i11 & 128) != 0) {
            str4 = historyOrderFillsUiData.taxCurrency;
        }
        if ((i11 & 256) != 0) {
            str5 = historyOrderFillsUiData.feeCurrency;
        }
        if ((i11 & 512) != 0) {
            bool = historyOrderFillsUiData.forceTaker;
        }
        if ((i11 & 1024) != 0) {
            str6 = historyOrderFillsUiData.liquidityRole;
        }
        Boolean bool2 = bool;
        String str7 = str6;
        String str8 = str4;
        String str9 = str5;
        String str10 = str2;
        String str11 = str3;
        BigDecimal bigDecimal4 = bigDecimal3;
        BigDecimal bigDecimal5 = bigDecimal2;
        return historyOrderFillsUiData.copy(bigDecimal, str, bigDecimal5, l11, bigDecimal4, str10, str11, str8, str9, bool2, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryOrderFillsUiData)) {
            return false;
        }
        HistoryOrderFillsUiData historyOrderFillsUiData = (HistoryOrderFillsUiData) other;
        return Intrinsics.areEqual(this.price, historyOrderFillsUiData.price) && Intrinsics.areEqual(this.side, historyOrderFillsUiData.side) && Intrinsics.areEqual(this.size, historyOrderFillsUiData.size) && Intrinsics.areEqual(this.time, historyOrderFillsUiData.time) && Intrinsics.areEqual(this.fee, historyOrderFillsUiData.fee) && Intrinsics.areEqual(this.tax, historyOrderFillsUiData.tax) && Intrinsics.areEqual(this.taxRate, historyOrderFillsUiData.taxRate) && Intrinsics.areEqual(this.taxCurrency, historyOrderFillsUiData.taxCurrency) && Intrinsics.areEqual(this.feeCurrency, historyOrderFillsUiData.feeCurrency) && Intrinsics.areEqual(this.forceTaker, historyOrderFillsUiData.forceTaker) && Intrinsics.areEqual(this.liquidityRole, historyOrderFillsUiData.liquidityRole);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getForceTaker() {
        return this.forceTaker;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLiquidityRole() {
        return this.liquidityRole;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTax() {
        return this.tax;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    @NotNull
    public final HistoryOrderFillsUiData copy(@Nullable BigDecimal price, @Nullable String side, @Nullable BigDecimal size, @Nullable Long time, @Nullable BigDecimal fee, @Nullable String tax, @Nullable String taxRate, @Nullable String taxCurrency, @Nullable String feeCurrency, @Nullable Boolean forceTaker, @Nullable String liquidityRole) {
        return new HistoryOrderFillsUiData(price, side, size, time, fee, tax, taxRate, taxCurrency, feeCurrency, forceTaker, liquidityRole);
    }

    @Nullable
    public final BigDecimal getFee() {
        return this.fee;
    }

    @Nullable
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    @Nullable
    public final Boolean getForceTaker() {
        return this.forceTaker;
    }

    @Nullable
    public final String getLiquidityRole() {
        return this.liquidityRole;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    public final String getTax() {
        return this.tax;
    }

    @Nullable
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    public final String getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.price;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.side;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.size;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Long l11 = this.time;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.fee;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str2 = this.tax;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.taxRate;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.taxCurrency;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.feeCurrency;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.forceTaker;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.liquidityRole;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HistoryOrderFillsUiData(price=" + this.price + ", side=" + this.side + ", size=" + this.size + ", time=" + this.time + ", fee=" + this.fee + ", tax=" + this.tax + ", taxRate=" + this.taxRate + ", taxCurrency=" + this.taxCurrency + ", feeCurrency=" + this.feeCurrency + ", forceTaker=" + this.forceTaker + ", liquidityRole=" + this.liquidityRole + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.price);
        dest.writeString(this.side);
        dest.writeSerializable(this.size);
        Long l11 = this.time;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.fee);
        dest.writeString(this.tax);
        dest.writeString(this.taxRate);
        dest.writeString(this.taxCurrency);
        dest.writeString(this.feeCurrency);
        Boolean bool = this.forceTaker;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.liquidityRole);
    }

    public HistoryOrderFillsUiData(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable BigDecimal bigDecimal2, @Nullable Long l11, @Nullable BigDecimal bigDecimal3, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable String str6) {
        this.price = bigDecimal;
        this.side = str;
        this.size = bigDecimal2;
        this.time = l11;
        this.fee = bigDecimal3;
        this.tax = str2;
        this.taxRate = str3;
        this.taxCurrency = str4;
        this.feeCurrency = str5;
        this.forceTaker = bool;
        this.liquidityRole = str6;
    }
}
