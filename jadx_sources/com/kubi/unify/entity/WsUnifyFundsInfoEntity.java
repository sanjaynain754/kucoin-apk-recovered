package com.kubi.unify.entity;

import androidx.annotation.Keep;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010%\u001a\u00020&J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010#Jª\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0011HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#¨\u0006;"}, m90084d2 = {"Lcom/kubi/unify/entity/WsUnifyFundsInfoEntity;", "", FirebaseAnalytics.Param.CURRENCY, "", "currencyId", "equity", "Ljava/math/BigDecimal;", "balance", "availableEquity", "lockedEquity", "occupiedEquity", "liability", "unrealisedPnl", "potentialBorrowing", "avgCostPrice", "maxWithdraw", "collateralStatus", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)V", "getCurrency", "()Ljava/lang/String;", "getCurrencyId", "getEquity", "()Ljava/math/BigDecimal;", "getBalance", "getAvailableEquity", "getLockedEquity", "getOccupiedEquity", "getLiability", "getUnrealisedPnl", "getPotentialBorrowing", "getAvgCostPrice", "getMaxWithdraw", "getCollateralStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "asUnifyFundsInfoEntity", "Lcom/kubi/unify/entity/UnifyFundsInfoEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)Lcom/kubi/unify/entity/WsUnifyFundsInfoEntity;", "equals", "", "other", "hashCode", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsUnifyFundsInfoEntity {

    @SerializedName(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY)
    @Nullable
    private final BigDecimal availableEquity;

    @SerializedName("acp")
    @Nullable
    private final BigDecimal avgCostPrice;

    @SerializedName("b")
    @Nullable
    private final BigDecimal balance;

    @SerializedName(alternate = {"cs"}, value = "collateralStatus")
    @Nullable
    private final Integer collateralStatus;

    @SerializedName("c")
    @Nullable
    private final String currency;

    @Nullable
    private final String currencyId;

    @SerializedName("e")
    @Nullable
    private final BigDecimal equity;

    @SerializedName(CmcdData.Factory.STREAM_TYPE_LIVE)
    @Nullable
    private final BigDecimal liability;

    @SerializedName("le")
    @Nullable
    private final BigDecimal lockedEquity;

    @SerializedName("mW")
    @Nullable
    private final BigDecimal maxWithdraw;

    @SerializedName(CmcdData.Factory.STREAMING_FORMAT_HLS)
    @Nullable
    private final BigDecimal occupiedEquity;

    @SerializedName("pB")
    @Nullable
    private final BigDecimal potentialBorrowing;

    @SerializedName("uPL")
    @Nullable
    private final BigDecimal unrealisedPnl;

    public WsUnifyFundsInfoEntity(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable Integer num) {
        this.currency = str;
        this.currencyId = str2;
        this.equity = bigDecimal;
        this.balance = bigDecimal2;
        this.availableEquity = bigDecimal3;
        this.lockedEquity = bigDecimal4;
        this.occupiedEquity = bigDecimal5;
        this.liability = bigDecimal6;
        this.unrealisedPnl = bigDecimal7;
        this.potentialBorrowing = bigDecimal8;
        this.avgCostPrice = bigDecimal9;
        this.maxWithdraw = bigDecimal10;
        this.collateralStatus = num;
    }

    public static /* synthetic */ WsUnifyFundsInfoEntity copy$default(WsUnifyFundsInfoEntity wsUnifyFundsInfoEntity, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsUnifyFundsInfoEntity.currency;
        }
        return wsUnifyFundsInfoEntity.copy(str, (i11 & 2) != 0 ? wsUnifyFundsInfoEntity.currencyId : str2, (i11 & 4) != 0 ? wsUnifyFundsInfoEntity.equity : bigDecimal, (i11 & 8) != 0 ? wsUnifyFundsInfoEntity.balance : bigDecimal2, (i11 & 16) != 0 ? wsUnifyFundsInfoEntity.availableEquity : bigDecimal3, (i11 & 32) != 0 ? wsUnifyFundsInfoEntity.lockedEquity : bigDecimal4, (i11 & 64) != 0 ? wsUnifyFundsInfoEntity.occupiedEquity : bigDecimal5, (i11 & 128) != 0 ? wsUnifyFundsInfoEntity.liability : bigDecimal6, (i11 & 256) != 0 ? wsUnifyFundsInfoEntity.unrealisedPnl : bigDecimal7, (i11 & 512) != 0 ? wsUnifyFundsInfoEntity.potentialBorrowing : bigDecimal8, (i11 & 1024) != 0 ? wsUnifyFundsInfoEntity.avgCostPrice : bigDecimal9, (i11 & 2048) != 0 ? wsUnifyFundsInfoEntity.maxWithdraw : bigDecimal10, (i11 & 4096) != 0 ? wsUnifyFundsInfoEntity.collateralStatus : num);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsUnifyFundsInfoEntity)) {
            return false;
        }
        WsUnifyFundsInfoEntity wsUnifyFundsInfoEntity = (WsUnifyFundsInfoEntity) other;
        return Intrinsics.areEqual(this.currency, wsUnifyFundsInfoEntity.currency) && Intrinsics.areEqual(this.currencyId, wsUnifyFundsInfoEntity.currencyId) && Intrinsics.areEqual(this.equity, wsUnifyFundsInfoEntity.equity) && Intrinsics.areEqual(this.balance, wsUnifyFundsInfoEntity.balance) && Intrinsics.areEqual(this.availableEquity, wsUnifyFundsInfoEntity.availableEquity) && Intrinsics.areEqual(this.lockedEquity, wsUnifyFundsInfoEntity.lockedEquity) && Intrinsics.areEqual(this.occupiedEquity, wsUnifyFundsInfoEntity.occupiedEquity) && Intrinsics.areEqual(this.liability, wsUnifyFundsInfoEntity.liability) && Intrinsics.areEqual(this.unrealisedPnl, wsUnifyFundsInfoEntity.unrealisedPnl) && Intrinsics.areEqual(this.potentialBorrowing, wsUnifyFundsInfoEntity.potentialBorrowing) && Intrinsics.areEqual(this.avgCostPrice, wsUnifyFundsInfoEntity.avgCostPrice) && Intrinsics.areEqual(this.maxWithdraw, wsUnifyFundsInfoEntity.maxWithdraw) && Intrinsics.areEqual(this.collateralStatus, wsUnifyFundsInfoEntity.collateralStatus);
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.equity;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.balance;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.availableEquity;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.lockedEquity;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.occupiedEquity;
        int iHashCode7 = (iHashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.liability;
        int iHashCode8 = (iHashCode7 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.unrealisedPnl;
        int iHashCode9 = (iHashCode8 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.potentialBorrowing;
        int iHashCode10 = (iHashCode9 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.avgCostPrice;
        int iHashCode11 = (iHashCode10 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.maxWithdraw;
        int iHashCode12 = (iHashCode11 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        Integer num = this.collateralStatus;
        return iHashCode12 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public final UnifyFundsInfoEntity asUnifyFundsInfoEntity() {
        return new UnifyFundsInfoEntity(this.currency, this.currencyId, this.equity, this.balance, this.availableEquity, this.lockedEquity, this.occupiedEquity, this.liability, this.unrealisedPnl, this.potentialBorrowing, this.avgCostPrice, this.maxWithdraw, this.collateralStatus);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getPotentialBorrowing() {
        return this.potentialBorrowing;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getAvgCostPrice() {
        return this.avgCostPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getMaxWithdraw() {
        return this.maxWithdraw;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getCollateralStatus() {
        return this.collateralStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencyId() {
        return this.currencyId;
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
    public final BigDecimal getLockedEquity() {
        return this.lockedEquity;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getOccupiedEquity() {
        return this.occupiedEquity;
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
    public final WsUnifyFundsInfoEntity copy(@Nullable String currency, @Nullable String currencyId, @Nullable BigDecimal equity, @Nullable BigDecimal balance, @Nullable BigDecimal availableEquity, @Nullable BigDecimal lockedEquity, @Nullable BigDecimal occupiedEquity, @Nullable BigDecimal liability, @Nullable BigDecimal unrealisedPnl, @Nullable BigDecimal potentialBorrowing, @Nullable BigDecimal avgCostPrice, @Nullable BigDecimal maxWithdraw, @Nullable Integer collateralStatus) {
        return new WsUnifyFundsInfoEntity(currency, currencyId, equity, balance, availableEquity, lockedEquity, occupiedEquity, liability, unrealisedPnl, potentialBorrowing, avgCostPrice, maxWithdraw, collateralStatus);
    }

    @Nullable
    public final BigDecimal getAvailableEquity() {
        return this.availableEquity;
    }

    @Nullable
    public final BigDecimal getAvgCostPrice() {
        return this.avgCostPrice;
    }

    @Nullable
    public final BigDecimal getBalance() {
        return this.balance;
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
    public final String getCurrencyId() {
        return this.currencyId;
    }

    @Nullable
    public final BigDecimal getEquity() {
        return this.equity;
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
    public final BigDecimal getMaxWithdraw() {
        return this.maxWithdraw;
    }

    @Nullable
    public final BigDecimal getOccupiedEquity() {
        return this.occupiedEquity;
    }

    @Nullable
    public final BigDecimal getPotentialBorrowing() {
        return this.potentialBorrowing;
    }

    @Nullable
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    @NotNull
    public String toString() {
        return "WsUnifyFundsInfoEntity(currency=" + this.currency + ", currencyId=" + this.currencyId + ", equity=" + this.equity + ", balance=" + this.balance + ", availableEquity=" + this.availableEquity + ", lockedEquity=" + this.lockedEquity + ", occupiedEquity=" + this.occupiedEquity + ", liability=" + this.liability + ", unrealisedPnl=" + this.unrealisedPnl + ", potentialBorrowing=" + this.potentialBorrowing + ", avgCostPrice=" + this.avgCostPrice + ", maxWithdraw=" + this.maxWithdraw + ", collateralStatus=" + this.collateralStatus + ')';
    }

    public /* synthetic */ WsUnifyFundsInfoEntity(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? BigDecimal.ZERO : bigDecimal, (i11 & 8) != 0 ? BigDecimal.ZERO : bigDecimal2, (i11 & 16) != 0 ? BigDecimal.ZERO : bigDecimal3, (i11 & 32) != 0 ? BigDecimal.ZERO : bigDecimal4, (i11 & 64) != 0 ? BigDecimal.ZERO : bigDecimal5, (i11 & 128) != 0 ? BigDecimal.ZERO : bigDecimal6, (i11 & 256) != 0 ? BigDecimal.ZERO : bigDecimal7, (i11 & 512) != 0 ? null : bigDecimal8, (i11 & 1024) != 0 ? null : bigDecimal9, (i11 & 2048) != 0 ? null : bigDecimal10, (i11 & 4096) != 0 ? null : num);
    }
}
