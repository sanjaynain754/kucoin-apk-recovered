package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesWelfareEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jz\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020.HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010!¨\u0006:"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;", "Landroid/os/Parcelable;", "symbol", "", "airdropPositionMargin", "Ljava/math/BigDecimal;", "positionPeriod", "", "profit", "profitRate", "withdrawAmount", "side", "marginMode", "leverage", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getAirdropPositionMargin", "()Ljava/math/BigDecimal;", "getPositionPeriod", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getProfit", "getProfitRate", "getWithdrawAmount", "getSide", "getMarginMode", "setMarginMode", "getLeverage", "setLeverage", "(Ljava/math/BigDecimal;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesAirdropProfitEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FuturesAirdropProfitEntity> CREATOR = new C15799a();

    @Nullable
    private final BigDecimal airdropPositionMargin;

    @Nullable
    private BigDecimal leverage;

    @Nullable
    private String marginMode;

    @Nullable
    private final Long positionPeriod;

    @Nullable
    private final BigDecimal profit;

    @Nullable
    private final BigDecimal profitRate;

    @Nullable
    private final String side;

    @Nullable
    private String symbol;

    @Nullable
    private final BigDecimal withdrawAmount;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.FuturesAirdropProfitEntity$a */
    /* JADX INFO: compiled from: FuturesWelfareEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15799a implements Parcelable.Creator<FuturesAirdropProfitEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuturesAirdropProfitEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FuturesAirdropProfitEntity(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuturesAirdropProfitEntity[] newArray(int i11) {
            return new FuturesAirdropProfitEntity[i11];
        }
    }

    public FuturesAirdropProfitEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable Long l11, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal5) {
        this.symbol = str;
        this.airdropPositionMargin = bigDecimal;
        this.positionPeriod = l11;
        this.profit = bigDecimal2;
        this.profitRate = bigDecimal3;
        this.withdrawAmount = bigDecimal4;
        this.side = str2;
        this.marginMode = str3;
        this.leverage = bigDecimal5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesAirdropProfitEntity)) {
            return false;
        }
        FuturesAirdropProfitEntity futuresAirdropProfitEntity = (FuturesAirdropProfitEntity) other;
        return Intrinsics.areEqual(this.symbol, futuresAirdropProfitEntity.symbol) && Intrinsics.areEqual(this.airdropPositionMargin, futuresAirdropProfitEntity.airdropPositionMargin) && Intrinsics.areEqual(this.positionPeriod, futuresAirdropProfitEntity.positionPeriod) && Intrinsics.areEqual(this.profit, futuresAirdropProfitEntity.profit) && Intrinsics.areEqual(this.profitRate, futuresAirdropProfitEntity.profitRate) && Intrinsics.areEqual(this.withdrawAmount, futuresAirdropProfitEntity.withdrawAmount) && Intrinsics.areEqual(this.side, futuresAirdropProfitEntity.side) && Intrinsics.areEqual(this.marginMode, futuresAirdropProfitEntity.marginMode) && Intrinsics.areEqual(this.leverage, futuresAirdropProfitEntity.leverage);
    }

    public static /* synthetic */ FuturesAirdropProfitEntity copy$default(FuturesAirdropProfitEntity futuresAirdropProfitEntity, String str, BigDecimal bigDecimal, Long l11, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str2, String str3, BigDecimal bigDecimal5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = futuresAirdropProfitEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = futuresAirdropProfitEntity.airdropPositionMargin;
        }
        if ((i11 & 4) != 0) {
            l11 = futuresAirdropProfitEntity.positionPeriod;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = futuresAirdropProfitEntity.profit;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = futuresAirdropProfitEntity.profitRate;
        }
        if ((i11 & 32) != 0) {
            bigDecimal4 = futuresAirdropProfitEntity.withdrawAmount;
        }
        if ((i11 & 64) != 0) {
            str2 = futuresAirdropProfitEntity.side;
        }
        if ((i11 & 128) != 0) {
            str3 = futuresAirdropProfitEntity.marginMode;
        }
        if ((i11 & 256) != 0) {
            bigDecimal5 = futuresAirdropProfitEntity.leverage;
        }
        String str4 = str3;
        BigDecimal bigDecimal6 = bigDecimal5;
        BigDecimal bigDecimal7 = bigDecimal4;
        String str5 = str2;
        BigDecimal bigDecimal8 = bigDecimal3;
        Long l12 = l11;
        return futuresAirdropProfitEntity.copy(str, bigDecimal, l12, bigDecimal2, bigDecimal8, bigDecimal7, str5, str4, bigDecimal6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getAirdropPositionMargin() {
        return this.airdropPositionMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getPositionPeriod() {
        return this.positionPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getProfit() {
        return this.profit;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getProfitRate() {
        return this.profitRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getWithdrawAmount() {
        return this.withdrawAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @NotNull
    public final FuturesAirdropProfitEntity copy(@Nullable String symbol, @Nullable BigDecimal airdropPositionMargin, @Nullable Long positionPeriod, @Nullable BigDecimal profit, @Nullable BigDecimal profitRate, @Nullable BigDecimal withdrawAmount, @Nullable String side, @Nullable String marginMode, @Nullable BigDecimal leverage) {
        return new FuturesAirdropProfitEntity(symbol, airdropPositionMargin, positionPeriod, profit, profitRate, withdrawAmount, side, marginMode, leverage);
    }

    @Nullable
    public final BigDecimal getAirdropPositionMargin() {
        return this.airdropPositionMargin;
    }

    @Nullable
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final Long getPositionPeriod() {
        return this.positionPeriod;
    }

    @Nullable
    public final BigDecimal getProfit() {
        return this.profit;
    }

    @Nullable
    public final BigDecimal getProfitRate() {
        return this.profitRate;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getWithdrawAmount() {
        return this.withdrawAmount;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.airdropPositionMargin;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Long l11 = this.positionPeriod;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.profit;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.profitRate;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.withdrawAmount;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str2 = this.side;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.marginMode;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.leverage;
        return iHashCode8 + (bigDecimal5 != null ? bigDecimal5.hashCode() : 0);
    }

    public final void setLeverage(@Nullable BigDecimal bigDecimal) {
        this.leverage = bigDecimal;
    }

    public final void setMarginMode(@Nullable String str) {
        this.marginMode = str;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    @NotNull
    public String toString() {
        return "FuturesAirdropProfitEntity(symbol=" + this.symbol + ", airdropPositionMargin=" + this.airdropPositionMargin + ", positionPeriod=" + this.positionPeriod + ", profit=" + this.profit + ", profitRate=" + this.profitRate + ", withdrawAmount=" + this.withdrawAmount + ", side=" + this.side + ", marginMode=" + this.marginMode + ", leverage=" + this.leverage + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeSerializable(this.airdropPositionMargin);
        Long l11 = this.positionPeriod;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.profit);
        dest.writeSerializable(this.profitRate);
        dest.writeSerializable(this.withdrawAmount);
        dest.writeString(this.side);
        dest.writeString(this.marginMode);
        dest.writeSerializable(this.leverage);
    }

    public /* synthetic */ FuturesAirdropProfitEntity(String str, BigDecimal bigDecimal, Long l11, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str2, String str3, BigDecimal bigDecimal5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, bigDecimal, l11, bigDecimal2, bigDecimal3, bigDecimal4, str2, (i11 & 128) != 0 ? null : str3, (i11 & 256) != 0 ? null : bigDecimal5);
    }
}
