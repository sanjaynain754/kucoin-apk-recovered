package com.kubi.tradebase.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o30.InterfaceC42953a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CurrencyBalance.kt */
/* JADX INFO: loaded from: classes48.dex */
@Keep
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BÙ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\n\u00108\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u00109\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010:\u001a\u0004\u0018\u00010\u0004H\u0016J\u000b\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003JÛ\u0001\u0010L\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0001J\u0006\u0010M\u001a\u00020NJ\u0013\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010RHÖ\u0003J\t\u0010S\u001a\u00020NHÖ\u0001J\t\u0010T\u001a\u00020\u0004HÖ\u0001J\u0016\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020NR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006Z"}, m90084d2 = {"Lcom/kubi/tradebase/entity/CurrencyBalance;", "Landroid/os/Parcelable;", "Lcom/kubi/tradebase/entity/IBalance;", FirebaseAnalytics.Param.CURRENCY, "", "currencyName", "totalBalance", "Ljava/math/BigDecimal;", "holdBalance", "markPrice", "liability", "liabilityInterest", "liabilityPrincipal", "latestMarkPrice", "availableBalance", "borrowCoefficient", "marginCoefficient", "borrowAmount", "borrowUnit", "netBalance", "transferOutBalance", "assetsCollateralRatios", "", "Lcom/kubi/tradebase/entity/AssetsCollateralRatio;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getCurrencyName", "getTotalBalance", "()Ljava/math/BigDecimal;", "setTotalBalance", "(Ljava/math/BigDecimal;)V", "getHoldBalance", "setHoldBalance", "getMarkPrice", "setMarkPrice", "getLiability", "setLiability", "getLiabilityInterest", "setLiabilityInterest", "getLiabilityPrincipal", "setLiabilityPrincipal", "getLatestMarkPrice", "setLatestMarkPrice", "getAvailableBalance", "getBorrowCoefficient", "getMarginCoefficient", "getBorrowAmount", "getBorrowUnit", "getNetBalance", "getTransferOutBalance", "getAssetsCollateralRatios", "()Ljava/util/List;", "getAvailableBalanceCompat", "getBalanceCurrency", "getBalanceCurrencyName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeBaseApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CurrencyBalance implements Parcelable, InterfaceC42953a {

    @NotNull
    public static final Parcelable.Creator<CurrencyBalance> CREATOR = new C25887a();

    @Nullable
    private final List<AssetsCollateralRatio> assetsCollateralRatios;

    @Nullable
    private final BigDecimal availableBalance;

    @Nullable
    private final BigDecimal borrowAmount;

    @Nullable
    private final BigDecimal borrowCoefficient;

    @Nullable
    private final BigDecimal borrowUnit;

    @Nullable
    private String currency;

    @Nullable
    private final String currencyName;

    @Nullable
    private BigDecimal holdBalance;

    @Nullable
    private BigDecimal latestMarkPrice;

    @Nullable
    private BigDecimal liability;

    @Nullable
    private BigDecimal liabilityInterest;

    @Nullable
    private BigDecimal liabilityPrincipal;

    @Nullable
    private final BigDecimal marginCoefficient;

    @Nullable
    private BigDecimal markPrice;

    @Nullable
    private final BigDecimal netBalance;

    @Nullable
    private BigDecimal totalBalance;

    @Nullable
    private final BigDecimal transferOutBalance;

    /* JADX INFO: renamed from: com.kubi.tradebase.entity.CurrencyBalance$a */
    /* JADX INFO: compiled from: CurrencyBalance.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25887a implements Parcelable.Creator<CurrencyBalance> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CurrencyBalance createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal9 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal10 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal11 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal12 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal13 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal14 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                int i12 = 0;
                while (i12 != i11) {
                    arrayList2.add(AssetsCollateralRatio.CREATOR.createFromParcel(parcel));
                    i12++;
                    i11 = i11;
                }
                arrayList = arrayList2;
            }
            return new CurrencyBalance(string, string2, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9, bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13, bigDecimal14, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CurrencyBalance[] newArray(int i11) {
            return new CurrencyBalance[i11];
        }
    }

    public CurrencyBalance() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CurrencyBalance copy$default(CurrencyBalance currencyBalance, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, List list, int i11, Object obj) {
        List list2;
        BigDecimal bigDecimal15;
        String str3 = (i11 & 1) != 0 ? currencyBalance.currency : str;
        String str4 = (i11 & 2) != 0 ? currencyBalance.currencyName : str2;
        BigDecimal bigDecimal16 = (i11 & 4) != 0 ? currencyBalance.totalBalance : bigDecimal;
        BigDecimal bigDecimal17 = (i11 & 8) != 0 ? currencyBalance.holdBalance : bigDecimal2;
        BigDecimal bigDecimal18 = (i11 & 16) != 0 ? currencyBalance.markPrice : bigDecimal3;
        BigDecimal bigDecimal19 = (i11 & 32) != 0 ? currencyBalance.liability : bigDecimal4;
        BigDecimal bigDecimal20 = (i11 & 64) != 0 ? currencyBalance.liabilityInterest : bigDecimal5;
        BigDecimal bigDecimal21 = (i11 & 128) != 0 ? currencyBalance.liabilityPrincipal : bigDecimal6;
        BigDecimal bigDecimal22 = (i11 & 256) != 0 ? currencyBalance.latestMarkPrice : bigDecimal7;
        BigDecimal bigDecimal23 = (i11 & 512) != 0 ? currencyBalance.availableBalance : bigDecimal8;
        BigDecimal bigDecimal24 = (i11 & 1024) != 0 ? currencyBalance.borrowCoefficient : bigDecimal9;
        BigDecimal bigDecimal25 = (i11 & 2048) != 0 ? currencyBalance.marginCoefficient : bigDecimal10;
        BigDecimal bigDecimal26 = (i11 & 4096) != 0 ? currencyBalance.borrowAmount : bigDecimal11;
        BigDecimal bigDecimal27 = (i11 & 8192) != 0 ? currencyBalance.borrowUnit : bigDecimal12;
        String str5 = str3;
        BigDecimal bigDecimal28 = (i11 & 16384) != 0 ? currencyBalance.netBalance : bigDecimal13;
        BigDecimal bigDecimal29 = (i11 & 32768) != 0 ? currencyBalance.transferOutBalance : bigDecimal14;
        if ((i11 & 65536) != 0) {
            bigDecimal15 = bigDecimal29;
            list2 = currencyBalance.assetsCollateralRatios;
        } else {
            list2 = list;
            bigDecimal15 = bigDecimal29;
        }
        return currencyBalance.copy(str5, str4, bigDecimal16, bigDecimal17, bigDecimal18, bigDecimal19, bigDecimal20, bigDecimal21, bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26, bigDecimal27, bigDecimal28, bigDecimal15, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyBalance)) {
            return false;
        }
        CurrencyBalance currencyBalance = (CurrencyBalance) other;
        return Intrinsics.areEqual(this.currency, currencyBalance.currency) && Intrinsics.areEqual(this.currencyName, currencyBalance.currencyName) && Intrinsics.areEqual(this.totalBalance, currencyBalance.totalBalance) && Intrinsics.areEqual(this.holdBalance, currencyBalance.holdBalance) && Intrinsics.areEqual(this.markPrice, currencyBalance.markPrice) && Intrinsics.areEqual(this.liability, currencyBalance.liability) && Intrinsics.areEqual(this.liabilityInterest, currencyBalance.liabilityInterest) && Intrinsics.areEqual(this.liabilityPrincipal, currencyBalance.liabilityPrincipal) && Intrinsics.areEqual(this.latestMarkPrice, currencyBalance.latestMarkPrice) && Intrinsics.areEqual(this.availableBalance, currencyBalance.availableBalance) && Intrinsics.areEqual(this.borrowCoefficient, currencyBalance.borrowCoefficient) && Intrinsics.areEqual(this.marginCoefficient, currencyBalance.marginCoefficient) && Intrinsics.areEqual(this.borrowAmount, currencyBalance.borrowAmount) && Intrinsics.areEqual(this.borrowUnit, currencyBalance.borrowUnit) && Intrinsics.areEqual(this.netBalance, currencyBalance.netBalance) && Intrinsics.areEqual(this.transferOutBalance, currencyBalance.transferOutBalance) && Intrinsics.areEqual(this.assetsCollateralRatios, currencyBalance.assetsCollateralRatios);
    }

    public CurrencyBalance(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11, @Nullable BigDecimal bigDecimal12, @Nullable BigDecimal bigDecimal13, @Nullable BigDecimal bigDecimal14, @Nullable List<AssetsCollateralRatio> list) {
        this.currency = str;
        this.currencyName = str2;
        this.totalBalance = bigDecimal;
        this.holdBalance = bigDecimal2;
        this.markPrice = bigDecimal3;
        this.liability = bigDecimal4;
        this.liabilityInterest = bigDecimal5;
        this.liabilityPrincipal = bigDecimal6;
        this.latestMarkPrice = bigDecimal7;
        this.availableBalance = bigDecimal8;
        this.borrowCoefficient = bigDecimal9;
        this.marginCoefficient = bigDecimal10;
        this.borrowAmount = bigDecimal11;
        this.borrowUnit = bigDecimal12;
        this.netBalance = bigDecimal13;
        this.transferOutBalance = bigDecimal14;
        this.assetsCollateralRatios = list;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getBorrowCoefficient() {
        return this.borrowCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getMarginCoefficient() {
        return this.marginCoefficient;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getBorrowAmount() {
        return this.borrowAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getBorrowUnit() {
        return this.borrowUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final BigDecimal getNetBalance() {
        return this.netBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getTransferOutBalance() {
        return this.transferOutBalance;
    }

    @Nullable
    public final List<AssetsCollateralRatio> component17() {
        return this.assetsCollateralRatios;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getLiabilityInterest() {
        return this.liabilityInterest;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getLiabilityPrincipal() {
        return this.liabilityPrincipal;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getLatestMarkPrice() {
        return this.latestMarkPrice;
    }

    @NotNull
    public final CurrencyBalance copy(@Nullable String currency, @Nullable String currencyName, @Nullable BigDecimal totalBalance, @Nullable BigDecimal holdBalance, @Nullable BigDecimal markPrice, @Nullable BigDecimal liability, @Nullable BigDecimal liabilityInterest, @Nullable BigDecimal liabilityPrincipal, @Nullable BigDecimal latestMarkPrice, @Nullable BigDecimal availableBalance, @Nullable BigDecimal borrowCoefficient, @Nullable BigDecimal marginCoefficient, @Nullable BigDecimal borrowAmount, @Nullable BigDecimal borrowUnit, @Nullable BigDecimal netBalance, @Nullable BigDecimal transferOutBalance, @Nullable List<AssetsCollateralRatio> assetsCollateralRatios) {
        return new CurrencyBalance(currency, currencyName, totalBalance, holdBalance, markPrice, liability, liabilityInterest, liabilityPrincipal, latestMarkPrice, availableBalance, borrowCoefficient, marginCoefficient, borrowAmount, borrowUnit, netBalance, transferOutBalance, assetsCollateralRatios);
    }

    @Nullable
    public final List<AssetsCollateralRatio> getAssetsCollateralRatios() {
        return this.assetsCollateralRatios;
    }

    @Nullable
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public BigDecimal getAvailableBalanceCompat() {
        BigDecimal bigDecimal = this.availableBalance;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        BigDecimal bigDecimal2 = this.totalBalance;
        if (bigDecimal2 != null) {
            return bigDecimal2.subtract(C41014a.m89922G(this.holdBalance, null, 1, null));
        }
        return null;
    }

    @Nullable
    public String getBalanceCurrency() {
        return this.currency;
    }

    @Nullable
    public String getBalanceCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final BigDecimal getBorrowAmount() {
        return this.borrowAmount;
    }

    @Nullable
    public final BigDecimal getBorrowCoefficient() {
        return this.borrowCoefficient;
    }

    @Nullable
    public final BigDecimal getBorrowUnit() {
        return this.borrowUnit;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    public final BigDecimal getLatestMarkPrice() {
        return this.latestMarkPrice;
    }

    @Nullable
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    public final BigDecimal getLiabilityInterest() {
        return this.liabilityInterest;
    }

    @Nullable
    public final BigDecimal getLiabilityPrincipal() {
        return this.liabilityPrincipal;
    }

    @Nullable
    public final BigDecimal getMarginCoefficient() {
        return this.marginCoefficient;
    }

    @Nullable
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    public final BigDecimal getNetBalance() {
        return this.netBalance;
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    public final BigDecimal getTransferOutBalance() {
        return this.transferOutBalance;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.totalBalance;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.holdBalance;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.markPrice;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.liability;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.liabilityInterest;
        int iHashCode7 = (iHashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.liabilityPrincipal;
        int iHashCode8 = (iHashCode7 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.latestMarkPrice;
        int iHashCode9 = (iHashCode8 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.availableBalance;
        int iHashCode10 = (iHashCode9 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.borrowCoefficient;
        int iHashCode11 = (iHashCode10 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.marginCoefficient;
        int iHashCode12 = (iHashCode11 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.borrowAmount;
        int iHashCode13 = (iHashCode12 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.borrowUnit;
        int iHashCode14 = (iHashCode13 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.netBalance;
        int iHashCode15 = (iHashCode14 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.transferOutBalance;
        int iHashCode16 = (iHashCode15 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        List<AssetsCollateralRatio> list = this.assetsCollateralRatios;
        return iHashCode16 + (list != null ? list.hashCode() : 0);
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setHoldBalance(@Nullable BigDecimal bigDecimal) {
        this.holdBalance = bigDecimal;
    }

    public final void setLatestMarkPrice(@Nullable BigDecimal bigDecimal) {
        this.latestMarkPrice = bigDecimal;
    }

    public final void setLiability(@Nullable BigDecimal bigDecimal) {
        this.liability = bigDecimal;
    }

    public final void setLiabilityInterest(@Nullable BigDecimal bigDecimal) {
        this.liabilityInterest = bigDecimal;
    }

    public final void setLiabilityPrincipal(@Nullable BigDecimal bigDecimal) {
        this.liabilityPrincipal = bigDecimal;
    }

    public final void setMarkPrice(@Nullable BigDecimal bigDecimal) {
        this.markPrice = bigDecimal;
    }

    public final void setTotalBalance(@Nullable BigDecimal bigDecimal) {
        this.totalBalance = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "CurrencyBalance(currency=" + this.currency + ", currencyName=" + this.currencyName + ", totalBalance=" + this.totalBalance + ", holdBalance=" + this.holdBalance + ", markPrice=" + this.markPrice + ", liability=" + this.liability + ", liabilityInterest=" + this.liabilityInterest + ", liabilityPrincipal=" + this.liabilityPrincipal + ", latestMarkPrice=" + this.latestMarkPrice + ", availableBalance=" + this.availableBalance + ", borrowCoefficient=" + this.borrowCoefficient + ", marginCoefficient=" + this.marginCoefficient + ", borrowAmount=" + this.borrowAmount + ", borrowUnit=" + this.borrowUnit + ", netBalance=" + this.netBalance + ", transferOutBalance=" + this.transferOutBalance + ", assetsCollateralRatios=" + this.assetsCollateralRatios + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeString(this.currencyName);
        dest.writeSerializable(this.totalBalance);
        dest.writeSerializable(this.holdBalance);
        dest.writeSerializable(this.markPrice);
        dest.writeSerializable(this.liability);
        dest.writeSerializable(this.liabilityInterest);
        dest.writeSerializable(this.liabilityPrincipal);
        dest.writeSerializable(this.latestMarkPrice);
        dest.writeSerializable(this.availableBalance);
        dest.writeSerializable(this.borrowCoefficient);
        dest.writeSerializable(this.marginCoefficient);
        dest.writeSerializable(this.borrowAmount);
        dest.writeSerializable(this.borrowUnit);
        dest.writeSerializable(this.netBalance);
        dest.writeSerializable(this.transferOutBalance);
        List<AssetsCollateralRatio> list = this.assetsCollateralRatios;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<AssetsCollateralRatio> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ CurrencyBalance(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bigDecimal, (i11 & 8) != 0 ? null : bigDecimal2, (i11 & 16) != 0 ? null : bigDecimal3, (i11 & 32) != 0 ? null : bigDecimal4, (i11 & 64) != 0 ? null : bigDecimal5, (i11 & 128) != 0 ? null : bigDecimal6, (i11 & 256) != 0 ? null : bigDecimal7, (i11 & 512) != 0 ? null : bigDecimal8, (i11 & 1024) != 0 ? null : bigDecimal9, (i11 & 2048) != 0 ? null : bigDecimal10, (i11 & 4096) != 0 ? null : bigDecimal11, (i11 & 8192) != 0 ? null : bigDecimal12, (i11 & 16384) != 0 ? null : bigDecimal13, (i11 & 32768) != 0 ? null : bigDecimal14, (i11 & 65536) != 0 ? null : list);
    }
}
