package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CoinInfoEntity;
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

/* JADX INFO: compiled from: UnifiedAssetsEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u00102\u001a\u00020\u0003J\u0010\u00103\u001a\n 4*\u0004\u0018\u00010\u00070\u0007H\u0002J\u0010\u00105\u001a\n 4*\u0004\u0018\u00010\u00070\u0007H\u0002J\u0010\u00106\u001a\n 4*\u0004\u0018\u00010\u00070\u0007H\u0002J\u0010\u00107\u001a\n 4*\u0004\u0018\u00010\u00070\u0007H\u0002J\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u00020\u0003J\u0006\u0010;\u001a\u00020\u0003J\u0006\u0010<\u001a\u00020\u0003J\u0006\u0010=\u001a\u00020\u0003J\u0006\u0010>\u001a\u00020\u0003J\u0006\u0010?\u001a\u00020\u0003J\b\u0010@\u001a\u0004\u0018\u00010\u0003J\b\u0010A\u001a\u0004\u0018\u00010\u0003J\u0006\u0010B\u001a\u000209J\u0006\u0010C\u001a\u000209J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010.J\u0092\u0001\u0010O\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010PJ\u0006\u0010Q\u001a\u00020\u0010J\u0013\u0010R\u001a\u0002092\b\u0010S\u001a\u0004\u0018\u00010THÖ\u0003J\t\u0010U\u001a\u00020\u0010HÖ\u0001J\t\u0010V\u001a\u00020\u0003HÖ\u0001J\u0016\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006\\"}, m90084d2 = {"Lcom/kubi/assets/entity/UnifiedAssetsEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "coinEntity", "Lcom/kubi/data/entity/CoinInfoEntity;", "equity", "Ljava/math/BigDecimal;", "balance", "availableEquity", "occupiedEquity", "lockedEquity", "liability", "unrealisedPnl", "avgCostPrice", "collateralStatus", "", "<init>", "(Ljava/lang/String;Lcom/kubi/data/entity/CoinInfoEntity;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getCoinEntity", "()Lcom/kubi/data/entity/CoinInfoEntity;", "setCoinEntity", "(Lcom/kubi/data/entity/CoinInfoEntity;)V", "getEquity", "()Ljava/math/BigDecimal;", "setEquity", "(Ljava/math/BigDecimal;)V", "getBalance", "setBalance", "getAvailableEquity", "setAvailableEquity", "getOccupiedEquity", "setOccupiedEquity", "getLockedEquity", "setLockedEquity", "getLiability", "setLiability", "getUnrealisedPnl", "setUnrealisedPnl", "getAvgCostPrice", "setAvgCostPrice", "getCollateralStatus", "()Ljava/lang/Integer;", "setCollateralStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIconUrl", "getTotalBalance", "kotlin.jvm.PlatformType", "getLiabilityCompat", "getInOrder", "getUnavailableEquity", "isOrderVisible", "", "getUnavailableEquityStr", "getInOrderStr", "getTotalBalanceStr", "getTotalBalancePriceStr", "getLiabilityStr", "getAvgCostPriceStr", "getCurrencyNameStr", "getCurrencyFullNameStr", "isFiat", "isLiabilityVisible", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Lcom/kubi/data/entity/CoinInfoEntity;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)Lcom/kubi/assets/entity/UnifiedAssetsEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifiedAssetsEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UnifiedAssetsEntity> CREATOR = new Creator();

    @Nullable
    private BigDecimal availableEquity;

    @Nullable
    private BigDecimal avgCostPrice;

    @Nullable
    private BigDecimal balance;

    @Nullable
    private CoinInfoEntity coinEntity;

    @Nullable
    private Integer collateralStatus;

    @Nullable
    private String currency;

    @Nullable
    private BigDecimal equity;

    @Nullable
    private BigDecimal liability;

    @Nullable
    private BigDecimal lockedEquity;

    @Nullable
    private BigDecimal occupiedEquity;

    @Nullable
    private BigDecimal unrealisedPnl;

    /* JADX INFO: compiled from: UnifiedAssetsEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<UnifiedAssetsEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnifiedAssetsEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnifiedAssetsEntity(parcel.readString(), (CoinInfoEntity) parcel.readParcelable(UnifiedAssetsEntity.class.getClassLoader()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnifiedAssetsEntity[] newArray(int i11) {
            return new UnifiedAssetsEntity[i11];
        }
    }

    public UnifiedAssetsEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedAssetsEntity)) {
            return false;
        }
        UnifiedAssetsEntity unifiedAssetsEntity = (UnifiedAssetsEntity) other;
        return Intrinsics.areEqual(this.currency, unifiedAssetsEntity.currency) && Intrinsics.areEqual(this.coinEntity, unifiedAssetsEntity.coinEntity) && Intrinsics.areEqual(this.equity, unifiedAssetsEntity.equity) && Intrinsics.areEqual(this.balance, unifiedAssetsEntity.balance) && Intrinsics.areEqual(this.availableEquity, unifiedAssetsEntity.availableEquity) && Intrinsics.areEqual(this.occupiedEquity, unifiedAssetsEntity.occupiedEquity) && Intrinsics.areEqual(this.lockedEquity, unifiedAssetsEntity.lockedEquity) && Intrinsics.areEqual(this.liability, unifiedAssetsEntity.liability) && Intrinsics.areEqual(this.unrealisedPnl, unifiedAssetsEntity.unrealisedPnl) && Intrinsics.areEqual(this.avgCostPrice, unifiedAssetsEntity.avgCostPrice) && Intrinsics.areEqual(this.collateralStatus, unifiedAssetsEntity.collateralStatus);
    }

    public UnifiedAssetsEntity(@Nullable String str, @Nullable CoinInfoEntity coinInfoEntity, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable Integer num) {
        this.currency = str;
        this.coinEntity = coinInfoEntity;
        this.equity = bigDecimal;
        this.balance = bigDecimal2;
        this.availableEquity = bigDecimal3;
        this.occupiedEquity = bigDecimal4;
        this.lockedEquity = bigDecimal5;
        this.liability = bigDecimal6;
        this.unrealisedPnl = bigDecimal7;
        this.avgCostPrice = bigDecimal8;
        this.collateralStatus = num;
    }

    public static /* synthetic */ UnifiedAssetsEntity copy$default(UnifiedAssetsEntity unifiedAssetsEntity, String str, CoinInfoEntity coinInfoEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unifiedAssetsEntity.currency;
        }
        if ((i11 & 2) != 0) {
            coinInfoEntity = unifiedAssetsEntity.coinEntity;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = unifiedAssetsEntity.equity;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = unifiedAssetsEntity.balance;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = unifiedAssetsEntity.availableEquity;
        }
        if ((i11 & 32) != 0) {
            bigDecimal4 = unifiedAssetsEntity.occupiedEquity;
        }
        if ((i11 & 64) != 0) {
            bigDecimal5 = unifiedAssetsEntity.lockedEquity;
        }
        if ((i11 & 128) != 0) {
            bigDecimal6 = unifiedAssetsEntity.liability;
        }
        if ((i11 & 256) != 0) {
            bigDecimal7 = unifiedAssetsEntity.unrealisedPnl;
        }
        if ((i11 & 512) != 0) {
            bigDecimal8 = unifiedAssetsEntity.avgCostPrice;
        }
        if ((i11 & 1024) != 0) {
            num = unifiedAssetsEntity.collateralStatus;
        }
        BigDecimal bigDecimal9 = bigDecimal8;
        Integer num2 = num;
        BigDecimal bigDecimal10 = bigDecimal6;
        BigDecimal bigDecimal11 = bigDecimal7;
        BigDecimal bigDecimal12 = bigDecimal4;
        BigDecimal bigDecimal13 = bigDecimal5;
        BigDecimal bigDecimal14 = bigDecimal3;
        BigDecimal bigDecimal15 = bigDecimal;
        return unifiedAssetsEntity.copy(str, coinInfoEntity, bigDecimal15, bigDecimal2, bigDecimal14, bigDecimal12, bigDecimal13, bigDecimal10, bigDecimal11, bigDecimal9, num2);
    }

    private final BigDecimal getInOrder() {
        BigDecimal bigDecimal = this.occupiedEquity;
        return bigDecimal == null ? BigDecimal.ZERO : bigDecimal;
    }

    private final BigDecimal getLiabilityCompat() {
        BigDecimal bigDecimal = this.liability;
        return bigDecimal == null ? BigDecimal.ZERO : bigDecimal;
    }

    private final BigDecimal getTotalBalance() {
        BigDecimal bigDecimal = this.equity;
        return bigDecimal == null ? BigDecimal.ZERO : bigDecimal;
    }

    private final BigDecimal getUnavailableEquity() {
        BigDecimal bigDecimal = this.occupiedEquity;
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = this.lockedEquity;
        if (bigDecimal2 == null) {
            bigDecimal2 = BigDecimal.ZERO;
        }
        BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimal2);
        return bigDecimalAdd == null ? BigDecimal.ZERO : bigDecimalAdd;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getAvgCostPrice() {
        return this.avgCostPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getCollateralStatus() {
        return this.collateralStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CoinInfoEntity getCoinEntity() {
        return this.coinEntity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getEquity() {
        return this.equity;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getBalance() {
        return this.balance;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getAvailableEquity() {
        return this.availableEquity;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getOccupiedEquity() {
        return this.occupiedEquity;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getLockedEquity() {
        return this.lockedEquity;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    @NotNull
    public final UnifiedAssetsEntity copy(@Nullable String currency, @Nullable CoinInfoEntity coinEntity, @Nullable BigDecimal equity, @Nullable BigDecimal balance, @Nullable BigDecimal availableEquity, @Nullable BigDecimal occupiedEquity, @Nullable BigDecimal lockedEquity, @Nullable BigDecimal liability, @Nullable BigDecimal unrealisedPnl, @Nullable BigDecimal avgCostPrice, @Nullable Integer collateralStatus) {
        return new UnifiedAssetsEntity(currency, coinEntity, equity, balance, availableEquity, occupiedEquity, lockedEquity, liability, unrealisedPnl, avgCostPrice, collateralStatus);
    }

    @Nullable
    public final BigDecimal getAvailableEquity() {
        return this.availableEquity;
    }

    @Nullable
    public final BigDecimal getAvgCostPrice() {
        return this.avgCostPrice;
    }

    @NotNull
    public final String getAvgCostPriceStr() {
        String strM86151c;
        String strM93905f;
        BigDecimal bigDecimal = this.avgCostPrice;
        return (bigDecimal == null || (strM86151c = C38185c.m86151c(bigDecimal, false, 1, null)) == null || (strM93905f = C42828b.m93905f(strM86151c, C38184b.f85884a.m86148c(), true, true)) == null) ? "--" : strM93905f;
    }

    @Nullable
    public final BigDecimal getBalance() {
        return this.balance;
    }

    @Nullable
    public final CoinInfoEntity getCoinEntity() {
        return this.coinEntity;
    }

    @Nullable
    public final Integer getCollateralStatus() {
        return this.collateralStatus;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyFullNameStr() {
        String name;
        CoinInfoEntity coinInfoEntity = this.coinEntity;
        return (coinInfoEntity == null || (name = coinInfoEntity.getName()) == null) ? this.currency : name;
    }

    @Nullable
    public final String getCurrencyNameStr() {
        String currency;
        CoinInfoEntity coinInfoEntity = this.coinEntity;
        return (coinInfoEntity == null || (currency = coinInfoEntity.getCurrency()) == null) ? this.currency : currency;
    }

    @Nullable
    public final BigDecimal getEquity() {
        return this.equity;
    }

    @NotNull
    public final String getIconUrl() {
        String iconUrl;
        CoinInfoEntity coinInfoEntity = this.coinEntity;
        return (coinInfoEntity == null || (iconUrl = coinInfoEntity.getIconUrl()) == null) ? "" : iconUrl;
    }

    @Nullable
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    public final BigDecimal getLockedEquity() {
        return this.lockedEquity;
    }

    @Nullable
    public final BigDecimal getOccupiedEquity() {
        return this.occupiedEquity;
    }

    @Nullable
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CoinInfoEntity coinInfoEntity = this.coinEntity;
        int iHashCode2 = (iHashCode + (coinInfoEntity == null ? 0 : coinInfoEntity.hashCode())) * 31;
        BigDecimal bigDecimal = this.equity;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.balance;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.availableEquity;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.occupiedEquity;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.lockedEquity;
        int iHashCode7 = (iHashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.liability;
        int iHashCode8 = (iHashCode7 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.unrealisedPnl;
        int iHashCode9 = (iHashCode8 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.avgCostPrice;
        int iHashCode10 = (iHashCode9 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        Integer num = this.collateralStatus;
        return iHashCode10 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isFiat() {
        CoinInfoEntity coinInfoEntity = this.coinEntity;
        return (coinInfoEntity == null || coinInfoEntity.isDigital()) ? false : true;
    }

    public final void setAvailableEquity(@Nullable BigDecimal bigDecimal) {
        this.availableEquity = bigDecimal;
    }

    public final void setAvgCostPrice(@Nullable BigDecimal bigDecimal) {
        this.avgCostPrice = bigDecimal;
    }

    public final void setBalance(@Nullable BigDecimal bigDecimal) {
        this.balance = bigDecimal;
    }

    public final void setCoinEntity(@Nullable CoinInfoEntity coinInfoEntity) {
        this.coinEntity = coinInfoEntity;
    }

    public final void setCollateralStatus(@Nullable Integer num) {
        this.collateralStatus = num;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setEquity(@Nullable BigDecimal bigDecimal) {
        this.equity = bigDecimal;
    }

    public final void setLiability(@Nullable BigDecimal bigDecimal) {
        this.liability = bigDecimal;
    }

    public final void setLockedEquity(@Nullable BigDecimal bigDecimal) {
        this.lockedEquity = bigDecimal;
    }

    public final void setOccupiedEquity(@Nullable BigDecimal bigDecimal) {
        this.occupiedEquity = bigDecimal;
    }

    public final void setUnrealisedPnl(@Nullable BigDecimal bigDecimal) {
        this.unrealisedPnl = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "UnifiedAssetsEntity(currency=" + this.currency + ", coinEntity=" + this.coinEntity + ", equity=" + this.equity + ", balance=" + this.balance + ", availableEquity=" + this.availableEquity + ", occupiedEquity=" + this.occupiedEquity + ", lockedEquity=" + this.lockedEquity + ", liability=" + this.liability + ", unrealisedPnl=" + this.unrealisedPnl + ", avgCostPrice=" + this.avgCostPrice + ", collateralStatus=" + this.collateralStatus + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeParcelable(this.coinEntity, flags);
        dest.writeSerializable(this.equity);
        dest.writeSerializable(this.balance);
        dest.writeSerializable(this.availableEquity);
        dest.writeSerializable(this.occupiedEquity);
        dest.writeSerializable(this.lockedEquity);
        dest.writeSerializable(this.liability);
        dest.writeSerializable(this.unrealisedPnl);
        dest.writeSerializable(this.avgCostPrice);
        Integer num = this.collateralStatus;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    @NotNull
    public final String getInOrderStr() {
        BigDecimal inOrder = getInOrder();
        Intrinsics.checkNotNullExpressionValue(inOrder, "getInOrder(...)");
        return C37885i.m85563b(inOrder, this.currency, 0, 2, null);
    }

    @NotNull
    public final String getLiabilityStr() {
        BigDecimal liabilityCompat = getLiabilityCompat();
        Intrinsics.checkNotNullExpressionValue(liabilityCompat, "getLiabilityCompat(...)");
        return C37885i.m85563b(liabilityCompat, this.currency, 0, 2, null);
    }

    @NotNull
    public final String getTotalBalancePriceStr() {
        BigDecimal bigDecimalAbs = getTotalBalance().abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        return C41014a.m89950x(C41014a.m89940n(bigDecimalAbs, this.currency), null, null, 0, false, false, false, true, 63, null);
    }

    @NotNull
    public final String getTotalBalanceStr() {
        BigDecimal totalBalance = getTotalBalance();
        Intrinsics.checkNotNullExpressionValue(totalBalance, "getTotalBalance(...)");
        return C37885i.m85563b(totalBalance, this.currency, 0, 2, null);
    }

    @NotNull
    public final String getUnavailableEquityStr() {
        BigDecimal unavailableEquity = getUnavailableEquity();
        Intrinsics.checkNotNullExpressionValue(unavailableEquity, "getUnavailableEquity(...)");
        return C37885i.m85563b(unavailableEquity, this.currency, 0, 2, null);
    }

    public final boolean isLiabilityVisible() {
        if (getLiabilityCompat().compareTo(BigDecimal.ZERO) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isOrderVisible() {
        if (getInOrder().compareTo(BigDecimal.ZERO) != 0) {
            return true;
        }
        return false;
    }

    public /* synthetic */ UnifiedAssetsEntity(String str, CoinInfoEntity coinInfoEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : coinInfoEntity, (i11 & 4) != 0 ? null : bigDecimal, (i11 & 8) != 0 ? null : bigDecimal2, (i11 & 16) != 0 ? null : bigDecimal3, (i11 & 32) != 0 ? null : bigDecimal4, (i11 & 64) != 0 ? null : bigDecimal5, (i11 & 128) != 0 ? null : bigDecimal6, (i11 & 256) != 0 ? null : bigDecimal7, (i11 & 512) != 0 ? null : bigDecimal8, (i11 & 1024) != 0 ? null : num);
    }
}
