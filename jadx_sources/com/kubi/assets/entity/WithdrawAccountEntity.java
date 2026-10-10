package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SingleCurrencyBalance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawAccountEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020!HÖ\u0001J\t\u0010&\u001a\u00020\fHÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006,"}, m90084d2 = {"Lcom/kubi/assets/entity/WithdrawAccountEntity;", "Landroid/os/Parcelable;", "coinInfoEntity", "Lcom/kubi/data/entity/CoinInfoEntity;", "mainBalances", "Lcom/kubi/data/entity/SingleCurrencyBalance;", "tradeBalances", "earnBalances", "isShowFlashExchange", "", "isInvoiceChain", "pageId", "", "<init>", "(Lcom/kubi/data/entity/CoinInfoEntity;Lcom/kubi/data/entity/SingleCurrencyBalance;Lcom/kubi/data/entity/SingleCurrencyBalance;Lcom/kubi/data/entity/SingleCurrencyBalance;ZZLjava/lang/String;)V", "getCoinInfoEntity", "()Lcom/kubi/data/entity/CoinInfoEntity;", "getMainBalances", "()Lcom/kubi/data/entity/SingleCurrencyBalance;", "getTradeBalances", "getEarnBalances", "()Z", "getPageId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawAccountEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WithdrawAccountEntity> CREATOR = new Creator();

    @Nullable
    private final CoinInfoEntity coinInfoEntity;

    @Nullable
    private final SingleCurrencyBalance earnBalances;
    private final boolean isInvoiceChain;
    private final boolean isShowFlashExchange;

    @Nullable
    private final SingleCurrencyBalance mainBalances;

    @Nullable
    private final String pageId;

    @Nullable
    private final SingleCurrencyBalance tradeBalances;

    /* JADX INFO: compiled from: WithdrawAccountEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<WithdrawAccountEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAccountEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CoinInfoEntity coinInfoEntity = (CoinInfoEntity) parcel.readParcelable(WithdrawAccountEntity.class.getClassLoader());
            SingleCurrencyBalance singleCurrencyBalance = (SingleCurrencyBalance) parcel.readParcelable(WithdrawAccountEntity.class.getClassLoader());
            SingleCurrencyBalance singleCurrencyBalance2 = (SingleCurrencyBalance) parcel.readParcelable(WithdrawAccountEntity.class.getClassLoader());
            SingleCurrencyBalance singleCurrencyBalance3 = (SingleCurrencyBalance) parcel.readParcelable(WithdrawAccountEntity.class.getClassLoader());
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            return new WithdrawAccountEntity(coinInfoEntity, singleCurrencyBalance, singleCurrencyBalance2, singleCurrencyBalance3, z11, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawAccountEntity[] newArray(int i11) {
            return new WithdrawAccountEntity[i11];
        }
    }

    public WithdrawAccountEntity() {
        this(null, null, null, null, false, false, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawAccountEntity)) {
            return false;
        }
        WithdrawAccountEntity withdrawAccountEntity = (WithdrawAccountEntity) other;
        return Intrinsics.areEqual(this.coinInfoEntity, withdrawAccountEntity.coinInfoEntity) && Intrinsics.areEqual(this.mainBalances, withdrawAccountEntity.mainBalances) && Intrinsics.areEqual(this.tradeBalances, withdrawAccountEntity.tradeBalances) && Intrinsics.areEqual(this.earnBalances, withdrawAccountEntity.earnBalances) && this.isShowFlashExchange == withdrawAccountEntity.isShowFlashExchange && this.isInvoiceChain == withdrawAccountEntity.isInvoiceChain && Intrinsics.areEqual(this.pageId, withdrawAccountEntity.pageId);
    }

    public WithdrawAccountEntity(@Nullable CoinInfoEntity coinInfoEntity, @Nullable SingleCurrencyBalance singleCurrencyBalance, @Nullable SingleCurrencyBalance singleCurrencyBalance2, @Nullable SingleCurrencyBalance singleCurrencyBalance3, boolean z11, boolean z12, @Nullable String str) {
        this.coinInfoEntity = coinInfoEntity;
        this.mainBalances = singleCurrencyBalance;
        this.tradeBalances = singleCurrencyBalance2;
        this.earnBalances = singleCurrencyBalance3;
        this.isShowFlashExchange = z11;
        this.isInvoiceChain = z12;
        this.pageId = str;
    }

    public static /* synthetic */ WithdrawAccountEntity copy$default(WithdrawAccountEntity withdrawAccountEntity, CoinInfoEntity coinInfoEntity, SingleCurrencyBalance singleCurrencyBalance, SingleCurrencyBalance singleCurrencyBalance2, SingleCurrencyBalance singleCurrencyBalance3, boolean z11, boolean z12, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coinInfoEntity = withdrawAccountEntity.coinInfoEntity;
        }
        if ((i11 & 2) != 0) {
            singleCurrencyBalance = withdrawAccountEntity.mainBalances;
        }
        if ((i11 & 4) != 0) {
            singleCurrencyBalance2 = withdrawAccountEntity.tradeBalances;
        }
        if ((i11 & 8) != 0) {
            singleCurrencyBalance3 = withdrawAccountEntity.earnBalances;
        }
        if ((i11 & 16) != 0) {
            z11 = withdrawAccountEntity.isShowFlashExchange;
        }
        if ((i11 & 32) != 0) {
            z12 = withdrawAccountEntity.isInvoiceChain;
        }
        if ((i11 & 64) != 0) {
            str = withdrawAccountEntity.pageId;
        }
        boolean z13 = z12;
        String str2 = str;
        boolean z14 = z11;
        SingleCurrencyBalance singleCurrencyBalance4 = singleCurrencyBalance2;
        return withdrawAccountEntity.copy(coinInfoEntity, singleCurrencyBalance, singleCurrencyBalance4, singleCurrencyBalance3, z14, z13, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CoinInfoEntity getCoinInfoEntity() {
        return this.coinInfoEntity;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SingleCurrencyBalance getMainBalances() {
        return this.mainBalances;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SingleCurrencyBalance getTradeBalances() {
        return this.tradeBalances;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SingleCurrencyBalance getEarnBalances() {
        return this.earnBalances;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsShowFlashExchange() {
        return this.isShowFlashExchange;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsInvoiceChain() {
        return this.isInvoiceChain;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPageId() {
        return this.pageId;
    }

    @NotNull
    public final WithdrawAccountEntity copy(@Nullable CoinInfoEntity coinInfoEntity, @Nullable SingleCurrencyBalance mainBalances, @Nullable SingleCurrencyBalance tradeBalances, @Nullable SingleCurrencyBalance earnBalances, boolean isShowFlashExchange, boolean isInvoiceChain, @Nullable String pageId) {
        return new WithdrawAccountEntity(coinInfoEntity, mainBalances, tradeBalances, earnBalances, isShowFlashExchange, isInvoiceChain, pageId);
    }

    @Nullable
    public final CoinInfoEntity getCoinInfoEntity() {
        return this.coinInfoEntity;
    }

    @Nullable
    public final SingleCurrencyBalance getEarnBalances() {
        return this.earnBalances;
    }

    @Nullable
    public final SingleCurrencyBalance getMainBalances() {
        return this.mainBalances;
    }

    @Nullable
    public final String getPageId() {
        return this.pageId;
    }

    @Nullable
    public final SingleCurrencyBalance getTradeBalances() {
        return this.tradeBalances;
    }

    public int hashCode() {
        CoinInfoEntity coinInfoEntity = this.coinInfoEntity;
        int iHashCode = (coinInfoEntity == null ? 0 : coinInfoEntity.hashCode()) * 31;
        SingleCurrencyBalance singleCurrencyBalance = this.mainBalances;
        int iHashCode2 = (iHashCode + (singleCurrencyBalance == null ? 0 : singleCurrencyBalance.hashCode())) * 31;
        SingleCurrencyBalance singleCurrencyBalance2 = this.tradeBalances;
        int iHashCode3 = (iHashCode2 + (singleCurrencyBalance2 == null ? 0 : singleCurrencyBalance2.hashCode())) * 31;
        SingleCurrencyBalance singleCurrencyBalance3 = this.earnBalances;
        int iHashCode4 = (((((iHashCode3 + (singleCurrencyBalance3 == null ? 0 : singleCurrencyBalance3.hashCode())) * 31) + Boolean.hashCode(this.isShowFlashExchange)) * 31) + Boolean.hashCode(this.isInvoiceChain)) * 31;
        String str = this.pageId;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isInvoiceChain() {
        return this.isInvoiceChain;
    }

    public final boolean isShowFlashExchange() {
        return this.isShowFlashExchange;
    }

    @NotNull
    public String toString() {
        return "WithdrawAccountEntity(coinInfoEntity=" + this.coinInfoEntity + ", mainBalances=" + this.mainBalances + ", tradeBalances=" + this.tradeBalances + ", earnBalances=" + this.earnBalances + ", isShowFlashExchange=" + this.isShowFlashExchange + ", isInvoiceChain=" + this.isInvoiceChain + ", pageId=" + this.pageId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.coinInfoEntity, flags);
        dest.writeParcelable(this.mainBalances, flags);
        dest.writeParcelable(this.tradeBalances, flags);
        dest.writeParcelable(this.earnBalances, flags);
        dest.writeInt(this.isShowFlashExchange ? 1 : 0);
        dest.writeInt(this.isInvoiceChain ? 1 : 0);
        dest.writeString(this.pageId);
    }

    public /* synthetic */ WithdrawAccountEntity(CoinInfoEntity coinInfoEntity, SingleCurrencyBalance singleCurrencyBalance, SingleCurrencyBalance singleCurrencyBalance2, SingleCurrencyBalance singleCurrencyBalance3, boolean z11, boolean z12, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : coinInfoEntity, (i11 & 2) != 0 ? null : singleCurrencyBalance, (i11 & 4) != 0 ? null : singleCurrencyBalance2, (i11 & 8) != 0 ? null : singleCurrencyBalance3, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? false : z12, (i11 & 64) != 0 ? null : str);
    }
}
