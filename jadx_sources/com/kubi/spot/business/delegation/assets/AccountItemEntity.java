package com.kubi.spot.business.delegation.assets;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetApiRemoteConfig;
import gf.C37885i;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p311hf.C38185c;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import sa.C44370a;
import y70.C46392a;

/* JADX INFO: compiled from: AssetsEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u00103\u001a\u00020\u0003J\u0006\u00104\u001a\u00020\u0003J\u0006\u00105\u001a\u00020\u0003J\b\u00106\u001a\u0004\u0018\u00010\u0003J\b\u00107\u001a\u0004\u0018\u00010\u0003J\u0006\u00108\u001a\u00020\u0006J\u0006\u00109\u001a\u00020\u0003J\u0006\u0010:\u001a\u00020\u0003J\u0006\u0010;\u001a\u00020\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\t\u0010A\u001a\u00020\bHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¢\u0001\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010JJ\u0006\u0010K\u001a\u00020LJ\u0013\u0010M\u001a\u00020\u00062\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020LHÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J\u0016\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020LR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0015R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\r\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0015\"\u0004\b0\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017¨\u0006W"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/assets/AccountItemEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "currencyFullName", "autoTransfer", "", "availableBalance", "Ljava/math/BigDecimal;", "holdBalance", "totalBalance", "currencyName", "iconUrl", "isDigital", "digitCost", "faitCost", "digitCurrency", "costUsdt", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getCurrencyFullName", "setCurrencyFullName", "getAutoTransfer", "()Z", "setAutoTransfer", "(Z)V", "getAvailableBalance", "()Ljava/math/BigDecimal;", "setAvailableBalance", "(Ljava/math/BigDecimal;)V", "getHoldBalance", "setHoldBalance", "getTotalBalance", "setTotalBalance", "getCurrencyName", "setCurrencyName", "getIconUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDigitCost", "setDigitCost", "getFaitCost", "setFaitCost", "getDigitCurrency", "setDigitCurrency", "getCostUsdt", "setCostUsdt", "getHoldBalanceStr", "getTotalBalanceStr", "getTotalBalancePriceStr", "getCurrencyNameStr", "getCurrencyFullNameStr", "isOrderVisible", "getDigitCostStr", "getUsdtCostStr", "getCostStr", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/spot/business/delegation/assets/AccountItemEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetsEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsEntity.kt\ncom/kubi/spot/business/delegation/assets/AccountItemEntity\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,99:1\n136#2:100\n*S KotlinDebug\n*F\n+ 1 AssetsEntity.kt\ncom/kubi/spot/business/delegation/assets/AccountItemEntity\n*L\n63#1:100\n*E\n"})
public final /* data */ class AccountItemEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountItemEntity> CREATOR = new C24807a();
    private boolean autoTransfer;

    @NotNull
    private BigDecimal availableBalance;

    @Nullable
    private String costUsdt;

    @Nullable
    private String currency;

    @Nullable
    private String currencyFullName;

    @Nullable
    private String currencyName;

    @Nullable
    private String digitCost;

    @Nullable
    private String digitCurrency;

    @Nullable
    private String faitCost;

    @NotNull
    private BigDecimal holdBalance;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final Boolean isDigital;

    @NotNull
    private BigDecimal totalBalance;

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.assets.AccountItemEntity$a */
    /* JADX INFO: compiled from: AssetsEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24807a implements Parcelable.Creator<AccountItemEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountItemEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AccountItemEntity(string, string2, z11, bigDecimal, bigDecimal2, bigDecimal3, string3, string4, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AccountItemEntity[] newArray(int i11) {
            return new AccountItemEntity[i11];
        }
    }

    public AccountItemEntity() {
        this(null, null, false, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountItemEntity)) {
            return false;
        }
        AccountItemEntity accountItemEntity = (AccountItemEntity) other;
        return Intrinsics.areEqual(this.currency, accountItemEntity.currency) && Intrinsics.areEqual(this.currencyFullName, accountItemEntity.currencyFullName) && this.autoTransfer == accountItemEntity.autoTransfer && Intrinsics.areEqual(this.availableBalance, accountItemEntity.availableBalance) && Intrinsics.areEqual(this.holdBalance, accountItemEntity.holdBalance) && Intrinsics.areEqual(this.totalBalance, accountItemEntity.totalBalance) && Intrinsics.areEqual(this.currencyName, accountItemEntity.currencyName) && Intrinsics.areEqual(this.iconUrl, accountItemEntity.iconUrl) && Intrinsics.areEqual(this.isDigital, accountItemEntity.isDigital) && Intrinsics.areEqual(this.digitCost, accountItemEntity.digitCost) && Intrinsics.areEqual(this.faitCost, accountItemEntity.faitCost) && Intrinsics.areEqual(this.digitCurrency, accountItemEntity.digitCurrency) && Intrinsics.areEqual(this.costUsdt, accountItemEntity.costUsdt);
    }

    public AccountItemEntity(@Nullable String str, @Nullable String str2, boolean z11, @NotNull BigDecimal availableBalance, @NotNull BigDecimal holdBalance, @NotNull BigDecimal totalBalance, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        Intrinsics.checkNotNullParameter(holdBalance, "holdBalance");
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        this.currency = str;
        this.currencyFullName = str2;
        this.autoTransfer = z11;
        this.availableBalance = availableBalance;
        this.holdBalance = holdBalance;
        this.totalBalance = totalBalance;
        this.currencyName = str3;
        this.iconUrl = str4;
        this.isDigital = bool;
        this.digitCost = str5;
        this.faitCost = str6;
        this.digitCurrency = str7;
        this.costUsdt = str8;
    }

    public static /* synthetic */ AccountItemEntity copy$default(AccountItemEntity accountItemEntity, String str, String str2, boolean z11, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accountItemEntity.currency;
        }
        return accountItemEntity.copy(str, (i11 & 2) != 0 ? accountItemEntity.currencyFullName : str2, (i11 & 4) != 0 ? accountItemEntity.autoTransfer : z11, (i11 & 8) != 0 ? accountItemEntity.availableBalance : bigDecimal, (i11 & 16) != 0 ? accountItemEntity.holdBalance : bigDecimal2, (i11 & 32) != 0 ? accountItemEntity.totalBalance : bigDecimal3, (i11 & 64) != 0 ? accountItemEntity.currencyName : str3, (i11 & 128) != 0 ? accountItemEntity.iconUrl : str4, (i11 & 256) != 0 ? accountItemEntity.isDigital : bool, (i11 & 512) != 0 ? accountItemEntity.digitCost : str5, (i11 & 1024) != 0 ? accountItemEntity.faitCost : str6, (i11 & 2048) != 0 ? accountItemEntity.digitCurrency : str7, (i11 & 4096) != 0 ? accountItemEntity.costUsdt : str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDigitCost() {
        return this.digitCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFaitCost() {
        return this.faitCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDigitCurrency() {
        return this.digitCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCostUsdt() {
        return this.costUsdt;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAutoTransfer() {
        return this.autoTransfer;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsDigital() {
        return this.isDigital;
    }

    @NotNull
    public final AccountItemEntity copy(@Nullable String currency, @Nullable String currencyFullName, boolean autoTransfer, @NotNull BigDecimal availableBalance, @NotNull BigDecimal holdBalance, @NotNull BigDecimal totalBalance, @Nullable String currencyName, @Nullable String iconUrl, @Nullable Boolean isDigital, @Nullable String digitCost, @Nullable String faitCost, @Nullable String digitCurrency, @Nullable String costUsdt) {
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        Intrinsics.checkNotNullParameter(holdBalance, "holdBalance");
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        return new AccountItemEntity(currency, currencyFullName, autoTransfer, availableBalance, holdBalance, totalBalance, currencyName, iconUrl, isDigital, digitCost, faitCost, digitCurrency, costUsdt);
    }

    public final boolean getAutoTransfer() {
        return this.autoTransfer;
    }

    @NotNull
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @NotNull
    public final String getCostStr() {
        return AssetApiRemoteConfig.f17838a.m17476e() ? getUsdtCostStr() : getDigitCostStr();
    }

    @Nullable
    public final String getCostUsdt() {
        return this.costUsdt;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    @Nullable
    public final String getCurrencyFullNameStr() {
        String str = this.currencyFullName;
        return str == null ? this.currency : str;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final String getCurrencyNameStr() {
        String str = this.currencyName;
        return str == null ? this.currency : str;
    }

    @Nullable
    public final String getDigitCost() {
        return this.digitCost;
    }

    @NotNull
    public final String getDigitCostStr() {
        BigDecimal bigDecimalOrNull;
        String strM86151c;
        BigDecimal bigDecimalOrNull2;
        String strM86151c2;
        String strM93905f;
        if (C46392a.m102322d(C44370a.f98030a.m97869a(), true)) {
            String str = this.digitCost;
            return (str == null || (bigDecimalOrNull2 = StringsKt.toBigDecimalOrNull(str)) == null || (strM86151c2 = C38185c.m86151c(bigDecimalOrNull2, false, 1, null)) == null || (strM93905f = C42828b.m93905f(strM86151c2, C38184b.f85884a.m86148c(), true, true)) == null) ? "--" : strM93905f;
        }
        String str2 = this.faitCost;
        return (str2 == null || (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(str2)) == null || (strM86151c = C38185c.m86151c(bigDecimalOrNull, false, 1, null)) == null) ? "--" : strM86151c;
    }

    @Nullable
    public final String getDigitCurrency() {
        return this.digitCurrency;
    }

    @Nullable
    public final String getFaitCost() {
        return this.faitCost;
    }

    @NotNull
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @NotNull
    public final String getHoldBalanceStr() {
        return C37885i.m85563b(this.holdBalance, this.currency, 0, 2, null);
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @NotNull
    public final String getTotalBalancePriceStr() {
        return C41014a.m89950x(C41014a.m89940n(this.totalBalance, this.currency), null, null, 0, false, false, false, true, 63, null);
    }

    @NotNull
    public final String getTotalBalanceStr() {
        return C37885i.m85563b(this.totalBalance, this.currency, 0, 2, null);
    }

    @NotNull
    public final String getUsdtCostStr() {
        BigDecimal bigDecimalOrNull;
        String strM86151c;
        String strM93905f;
        String str = this.costUsdt;
        return (str == null || (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(str)) == null || (strM86151c = C38185c.m86151c(bigDecimalOrNull, false, 1, null)) == null || (strM93905f = C42828b.m93905f(strM86151c, C38184b.f85884a.m86148c(), true, true)) == null) ? "--" : strM93905f;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyFullName;
        int iHashCode2 = (((((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.autoTransfer)) * 31) + this.availableBalance.hashCode()) * 31) + this.holdBalance.hashCode()) * 31) + this.totalBalance.hashCode()) * 31;
        String str3 = this.currencyName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isDigital;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.digitCost;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.faitCost;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.digitCurrency;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.costUsdt;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDigital() {
        return this.isDigital;
    }

    public final boolean isOrderVisible() {
        return this.holdBalance.compareTo(BigDecimal.ZERO) != 0;
    }

    public final void setAutoTransfer(boolean z11) {
        this.autoTransfer = z11;
    }

    public final void setAvailableBalance(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.availableBalance = bigDecimal;
    }

    public final void setCostUsdt(@Nullable String str) {
        this.costUsdt = str;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setCurrencyFullName(@Nullable String str) {
        this.currencyFullName = str;
    }

    public final void setCurrencyName(@Nullable String str) {
        this.currencyName = str;
    }

    public final void setDigitCost(@Nullable String str) {
        this.digitCost = str;
    }

    public final void setDigitCurrency(@Nullable String str) {
        this.digitCurrency = str;
    }

    public final void setFaitCost(@Nullable String str) {
        this.faitCost = str;
    }

    public final void setHoldBalance(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.holdBalance = bigDecimal;
    }

    public final void setTotalBalance(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.totalBalance = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "AccountItemEntity(currency=" + this.currency + ", currencyFullName=" + this.currencyFullName + ", autoTransfer=" + this.autoTransfer + ", availableBalance=" + this.availableBalance + ", holdBalance=" + this.holdBalance + ", totalBalance=" + this.totalBalance + ", currencyName=" + this.currencyName + ", iconUrl=" + this.iconUrl + ", isDigital=" + this.isDigital + ", digitCost=" + this.digitCost + ", faitCost=" + this.faitCost + ", digitCurrency=" + this.digitCurrency + ", costUsdt=" + this.costUsdt + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeString(this.currencyFullName);
        dest.writeInt(this.autoTransfer ? 1 : 0);
        dest.writeSerializable(this.availableBalance);
        dest.writeSerializable(this.holdBalance);
        dest.writeSerializable(this.totalBalance);
        dest.writeString(this.currencyName);
        dest.writeString(this.iconUrl);
        Boolean bool = this.isDigital;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            dest.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        dest.writeInt(BooleanValue);
        dest.writeString(this.digitCost);
        dest.writeString(this.faitCost);
        dest.writeString(this.digitCurrency);
        dest.writeString(this.costUsdt);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AccountItemEntity(String str, String str2, boolean z11, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        BigDecimal ZERO;
        BigDecimal ZERO2;
        BigDecimal ZERO3;
        str = (i11 & 1) != 0 ? null : str;
        String str9 = (i11 & 2) != 0 ? null : str2;
        boolean z12 = (i11 & 4) != 0 ? false : z11;
        if ((i11 & 8) != 0) {
            ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        } else {
            ZERO = bigDecimal;
        }
        if ((i11 & 16) != 0) {
            ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
        } else {
            ZERO2 = bigDecimal2;
        }
        if ((i11 & 32) != 0) {
            ZERO3 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO3, "ZERO");
        } else {
            ZERO3 = bigDecimal3;
        }
        this(str, str9, z12, ZERO, ZERO2, ZERO3, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : bool, (i11 & 512) != 0 ? null : str5, (i11 & 1024) != 0 ? null : str6, (i11 & 2048) != 0 ? null : str7, (i11 & 4096) != 0 ? null : str8);
    }
}
