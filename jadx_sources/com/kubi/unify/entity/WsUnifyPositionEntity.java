package com.kubi.unify.entity;

import androidx.annotation.Keep;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.common.callercontext.ContextChain;
import com.google.gson.annotations.SerializedName;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÕ\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020IHÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001a\"\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001dR \u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001dR \u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001dR \u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001dR \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001dR \u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001dR \u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001dR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001aR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001a¨\u0006K"}, m90084d2 = {"Lcom/kubi/unify/entity/WsUnifyPositionEntity;", "", "positionId", "", "currentQuantity", "Ljava/math/BigDecimal;", "leverage", "unrealisedCost", "markPrice", "symbol", "markValue", "posMargin", "liquidationPrice", "unrealisedRoePcnt", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "latestUnrealisedPnl", "latestUnrealisedRoePcnt", "imr", "mmr", "posMaint", "r", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getPositionId", "()Ljava/lang/String;", "getCurrentQuantity", "()Ljava/math/BigDecimal;", "getLeverage", "setLeverage", "(Ljava/math/BigDecimal;)V", "getUnrealisedCost", "getMarkPrice", "getSymbol", "getMarkValue", "getPosMargin", "getLiquidationPrice", "setLiquidationPrice", "getUnrealisedRoePcnt", "setUnrealisedRoePcnt", "getLatestPrice", "setLatestPrice", "getLatestUnrealisedPnl", "setLatestUnrealisedPnl", "getLatestUnrealisedRoePcnt", "setLatestUnrealisedRoePcnt", "getImr", "setImr", "getMmr", "setMmr", "getPosMaint", "getR", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "", "other", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsUnifyPositionEntity {

    @SerializedName("q")
    @Nullable
    private final BigDecimal currentQuantity;

    @SerializedName("imr")
    @Nullable
    private BigDecimal imr;

    @SerializedName("ITP")
    @Nullable
    private BigDecimal latestPrice;

    @SerializedName("luPR")
    @Nullable
    private BigDecimal latestUnrealisedPnl;

    @SerializedName("luPRoi")
    @Nullable
    private BigDecimal latestUnrealisedRoePcnt;

    @SerializedName(CmcdData.Factory.STREAM_TYPE_LIVE)
    @Nullable
    private BigDecimal leverage;

    @SerializedName("lP")
    @Nullable
    private BigDecimal liquidationPrice;

    @SerializedName("mP")
    @Nullable
    private final BigDecimal markPrice;

    @SerializedName("mV")
    @Nullable
    private final BigDecimal markValue;

    @SerializedName("mmr")
    @Nullable
    private BigDecimal mmr;

    @SerializedName("mm")
    @Nullable
    private final BigDecimal posMaint;

    @SerializedName("pM")
    @Nullable
    private final BigDecimal posMargin;

    @SerializedName(ContextChain.TAG_PRODUCT_AND_INFRA)
    @Nullable
    private final String positionId;

    @SerializedName("r")
    @Nullable
    private final BigDecimal r;

    @SerializedName(CmcdData.Factory.STREAMING_FORMAT_SS)
    @Nullable
    private final String symbol;

    @SerializedName("uPL")
    @Nullable
    private final BigDecimal unrealisedCost;

    @SerializedName("mPR")
    @Nullable
    private BigDecimal unrealisedRoePcnt;

    public WsUnifyPositionEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable String str2, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11, @Nullable BigDecimal bigDecimal12, @Nullable BigDecimal bigDecimal13, @Nullable BigDecimal bigDecimal14, @Nullable BigDecimal bigDecimal15) {
        this.positionId = str;
        this.currentQuantity = bigDecimal;
        this.leverage = bigDecimal2;
        this.unrealisedCost = bigDecimal3;
        this.markPrice = bigDecimal4;
        this.symbol = str2;
        this.markValue = bigDecimal5;
        this.posMargin = bigDecimal6;
        this.liquidationPrice = bigDecimal7;
        this.unrealisedRoePcnt = bigDecimal8;
        this.latestPrice = bigDecimal9;
        this.latestUnrealisedPnl = bigDecimal10;
        this.latestUnrealisedRoePcnt = bigDecimal11;
        this.imr = bigDecimal12;
        this.mmr = bigDecimal13;
        this.posMaint = bigDecimal14;
        this.r = bigDecimal15;
    }

    public static /* synthetic */ WsUnifyPositionEntity copy$default(WsUnifyPositionEntity wsUnifyPositionEntity, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str2, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, int i11, Object obj) {
        BigDecimal bigDecimal16;
        BigDecimal bigDecimal17;
        String str3 = (i11 & 1) != 0 ? wsUnifyPositionEntity.positionId : str;
        BigDecimal bigDecimal18 = (i11 & 2) != 0 ? wsUnifyPositionEntity.currentQuantity : bigDecimal;
        BigDecimal bigDecimal19 = (i11 & 4) != 0 ? wsUnifyPositionEntity.leverage : bigDecimal2;
        BigDecimal bigDecimal20 = (i11 & 8) != 0 ? wsUnifyPositionEntity.unrealisedCost : bigDecimal3;
        BigDecimal bigDecimal21 = (i11 & 16) != 0 ? wsUnifyPositionEntity.markPrice : bigDecimal4;
        String str4 = (i11 & 32) != 0 ? wsUnifyPositionEntity.symbol : str2;
        BigDecimal bigDecimal22 = (i11 & 64) != 0 ? wsUnifyPositionEntity.markValue : bigDecimal5;
        BigDecimal bigDecimal23 = (i11 & 128) != 0 ? wsUnifyPositionEntity.posMargin : bigDecimal6;
        BigDecimal bigDecimal24 = (i11 & 256) != 0 ? wsUnifyPositionEntity.liquidationPrice : bigDecimal7;
        BigDecimal bigDecimal25 = (i11 & 512) != 0 ? wsUnifyPositionEntity.unrealisedRoePcnt : bigDecimal8;
        BigDecimal bigDecimal26 = (i11 & 1024) != 0 ? wsUnifyPositionEntity.latestPrice : bigDecimal9;
        BigDecimal bigDecimal27 = (i11 & 2048) != 0 ? wsUnifyPositionEntity.latestUnrealisedPnl : bigDecimal10;
        BigDecimal bigDecimal28 = (i11 & 4096) != 0 ? wsUnifyPositionEntity.latestUnrealisedRoePcnt : bigDecimal11;
        BigDecimal bigDecimal29 = (i11 & 8192) != 0 ? wsUnifyPositionEntity.imr : bigDecimal12;
        String str5 = str3;
        BigDecimal bigDecimal30 = (i11 & 16384) != 0 ? wsUnifyPositionEntity.mmr : bigDecimal13;
        BigDecimal bigDecimal31 = (i11 & 32768) != 0 ? wsUnifyPositionEntity.posMaint : bigDecimal14;
        if ((i11 & 65536) != 0) {
            bigDecimal17 = bigDecimal31;
            bigDecimal16 = wsUnifyPositionEntity.r;
        } else {
            bigDecimal16 = bigDecimal15;
            bigDecimal17 = bigDecimal31;
        }
        return wsUnifyPositionEntity.copy(str5, bigDecimal18, bigDecimal19, bigDecimal20, bigDecimal21, str4, bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26, bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal17, bigDecimal16);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsUnifyPositionEntity)) {
            return false;
        }
        WsUnifyPositionEntity wsUnifyPositionEntity = (WsUnifyPositionEntity) other;
        return Intrinsics.areEqual(this.positionId, wsUnifyPositionEntity.positionId) && Intrinsics.areEqual(this.currentQuantity, wsUnifyPositionEntity.currentQuantity) && Intrinsics.areEqual(this.leverage, wsUnifyPositionEntity.leverage) && Intrinsics.areEqual(this.unrealisedCost, wsUnifyPositionEntity.unrealisedCost) && Intrinsics.areEqual(this.markPrice, wsUnifyPositionEntity.markPrice) && Intrinsics.areEqual(this.symbol, wsUnifyPositionEntity.symbol) && Intrinsics.areEqual(this.markValue, wsUnifyPositionEntity.markValue) && Intrinsics.areEqual(this.posMargin, wsUnifyPositionEntity.posMargin) && Intrinsics.areEqual(this.liquidationPrice, wsUnifyPositionEntity.liquidationPrice) && Intrinsics.areEqual(this.unrealisedRoePcnt, wsUnifyPositionEntity.unrealisedRoePcnt) && Intrinsics.areEqual(this.latestPrice, wsUnifyPositionEntity.latestPrice) && Intrinsics.areEqual(this.latestUnrealisedPnl, wsUnifyPositionEntity.latestUnrealisedPnl) && Intrinsics.areEqual(this.latestUnrealisedRoePcnt, wsUnifyPositionEntity.latestUnrealisedRoePcnt) && Intrinsics.areEqual(this.imr, wsUnifyPositionEntity.imr) && Intrinsics.areEqual(this.mmr, wsUnifyPositionEntity.mmr) && Intrinsics.areEqual(this.posMaint, wsUnifyPositionEntity.posMaint) && Intrinsics.areEqual(this.r, wsUnifyPositionEntity.r);
    }

    public int hashCode() {
        String str = this.positionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.currentQuantity;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.leverage;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.unrealisedCost;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.markPrice;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str2 = this.symbol;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.markValue;
        int iHashCode7 = (iHashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.posMargin;
        int iHashCode8 = (iHashCode7 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.liquidationPrice;
        int iHashCode9 = (iHashCode8 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.unrealisedRoePcnt;
        int iHashCode10 = (iHashCode9 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.latestPrice;
        int iHashCode11 = (iHashCode10 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.latestUnrealisedPnl;
        int iHashCode12 = (iHashCode11 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.latestUnrealisedRoePcnt;
        int iHashCode13 = (iHashCode12 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.imr;
        int iHashCode14 = (iHashCode13 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.mmr;
        int iHashCode15 = (iHashCode14 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.posMaint;
        int iHashCode16 = (iHashCode15 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.r;
        return iHashCode16 + (bigDecimal15 != null ? bigDecimal15.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WsUnifyPositionEntity(positionId=" + this.positionId + ", currentQuantity=" + this.currentQuantity + ", leverage=" + this.leverage + ", unrealisedCost=" + this.unrealisedCost + ", markPrice=" + this.markPrice + ", symbol=" + this.symbol + ", markValue=" + this.markValue + ", posMargin=" + this.posMargin + ", liquidationPrice=" + this.liquidationPrice + ", unrealisedRoePcnt=" + this.unrealisedRoePcnt + ", latestPrice=" + this.latestPrice + ", latestUnrealisedPnl=" + this.latestUnrealisedPnl + ", latestUnrealisedRoePcnt=" + this.latestUnrealisedRoePcnt + ", imr=" + this.imr + ", mmr=" + this.mmr + ", posMaint=" + this.posMaint + ", r=" + this.r + ')';
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPositionId() {
        return this.positionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getUnrealisedRoePcnt() {
        return this.unrealisedRoePcnt;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getLatestPrice() {
        return this.latestPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getLatestUnrealisedPnl() {
        return this.latestUnrealisedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getLatestUnrealisedRoePcnt() {
        return this.latestUnrealisedRoePcnt;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getImr() {
        return this.imr;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final BigDecimal getMmr() {
        return this.mmr;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getPosMaint() {
        return this.posMaint;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getR() {
        return this.r;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getCurrentQuantity() {
        return this.currentQuantity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getUnrealisedCost() {
        return this.unrealisedCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getMarkValue() {
        return this.markValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getPosMargin() {
        return this.posMargin;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getLiquidationPrice() {
        return this.liquidationPrice;
    }

    @NotNull
    public final WsUnifyPositionEntity copy(@Nullable String positionId, @Nullable BigDecimal currentQuantity, @Nullable BigDecimal leverage, @Nullable BigDecimal unrealisedCost, @Nullable BigDecimal markPrice, @Nullable String symbol, @Nullable BigDecimal markValue, @Nullable BigDecimal posMargin, @Nullable BigDecimal liquidationPrice, @Nullable BigDecimal unrealisedRoePcnt, @Nullable BigDecimal latestPrice, @Nullable BigDecimal latestUnrealisedPnl, @Nullable BigDecimal latestUnrealisedRoePcnt, @Nullable BigDecimal imr, @Nullable BigDecimal mmr, @Nullable BigDecimal posMaint, @Nullable BigDecimal r11) {
        return new WsUnifyPositionEntity(positionId, currentQuantity, leverage, unrealisedCost, markPrice, symbol, markValue, posMargin, liquidationPrice, unrealisedRoePcnt, latestPrice, latestUnrealisedPnl, latestUnrealisedRoePcnt, imr, mmr, posMaint, r11);
    }

    @Nullable
    public final BigDecimal getCurrentQuantity() {
        return this.currentQuantity;
    }

    @Nullable
    public final BigDecimal getImr() {
        return this.imr;
    }

    @Nullable
    public final BigDecimal getLatestPrice() {
        return this.latestPrice;
    }

    @Nullable
    public final BigDecimal getLatestUnrealisedPnl() {
        return this.latestUnrealisedPnl;
    }

    @Nullable
    public final BigDecimal getLatestUnrealisedRoePcnt() {
        return this.latestUnrealisedRoePcnt;
    }

    @Nullable
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final BigDecimal getLiquidationPrice() {
        return this.liquidationPrice;
    }

    @Nullable
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    public final BigDecimal getMarkValue() {
        return this.markValue;
    }

    @Nullable
    public final BigDecimal getMmr() {
        return this.mmr;
    }

    @Nullable
    public final BigDecimal getPosMaint() {
        return this.posMaint;
    }

    @Nullable
    public final BigDecimal getPosMargin() {
        return this.posMargin;
    }

    @Nullable
    public final String getPositionId() {
        return this.positionId;
    }

    @Nullable
    public final BigDecimal getR() {
        return this.r;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getUnrealisedCost() {
        return this.unrealisedCost;
    }

    @Nullable
    public final BigDecimal getUnrealisedRoePcnt() {
        return this.unrealisedRoePcnt;
    }

    public final void setImr(@Nullable BigDecimal bigDecimal) {
        this.imr = bigDecimal;
    }

    public final void setLatestPrice(@Nullable BigDecimal bigDecimal) {
        this.latestPrice = bigDecimal;
    }

    public final void setLatestUnrealisedPnl(@Nullable BigDecimal bigDecimal) {
        this.latestUnrealisedPnl = bigDecimal;
    }

    public final void setLatestUnrealisedRoePcnt(@Nullable BigDecimal bigDecimal) {
        this.latestUnrealisedRoePcnt = bigDecimal;
    }

    public final void setLeverage(@Nullable BigDecimal bigDecimal) {
        this.leverage = bigDecimal;
    }

    public final void setLiquidationPrice(@Nullable BigDecimal bigDecimal) {
        this.liquidationPrice = bigDecimal;
    }

    public final void setMmr(@Nullable BigDecimal bigDecimal) {
        this.mmr = bigDecimal;
    }

    public final void setUnrealisedRoePcnt(@Nullable BigDecimal bigDecimal) {
        this.unrealisedRoePcnt = bigDecimal;
    }

    public /* synthetic */ WsUnifyPositionEntity(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str2, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, str2, bigDecimal5, bigDecimal6, (i11 & 256) != 0 ? null : bigDecimal7, (i11 & 512) != 0 ? null : bigDecimal8, (i11 & 1024) != 0 ? null : bigDecimal9, (i11 & 2048) != 0 ? null : bigDecimal10, (i11 & 4096) != 0 ? null : bigDecimal11, (i11 & 8192) != 0 ? null : bigDecimal12, (i11 & 16384) != 0 ? null : bigDecimal13, (32768 & i11) != 0 ? null : bigDecimal14, (i11 & 65536) != 0 ? null : bigDecimal15);
    }
}
