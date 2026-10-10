package com.kubi.tradingbotkit.entity.futures;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesTickerEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b]\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010S\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010T\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0096\u0002\u0010e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010fJ\u0006\u0010g\u001a\u00020hJ\u0013\u0010i\u001a\u00020j2\b\u0010k\u001a\u0004\u0018\u00010lHÖ\u0003J\t\u0010m\u001a\u00020hHÖ\u0001J\t\u0010n\u001a\u00020\u0003HÖ\u0001J\u0016\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020hR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\u001c\u0010\f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010,\"\u0004\b8\u0010.R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010,\"\u0004\b<\u0010.R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010,\"\u0004\b>\u0010.R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010,\"\u0004\b@\u0010.R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010,\"\u0004\bB\u0010.R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010,\"\u0004\bF\u0010.R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010,\"\u0004\bH\u0010.R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010,\"\u0004\bJ\u0010.R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\bK\u0010%\"\u0004\bL\u0010'R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010,\"\u0004\bN\u0010.¨\u0006t"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/futures/FuturesTickerEntity;", "Landroid/os/Parcelable;", "tradeId", "", "symbol", "side", "timestamp", "", JPushConstants.Operation.KEY_SEQUENCE, "bestAskPrice", "Ljava/math/BigDecimal;", "bestAskSize", "bestBidPrice", "bestBidSize", "lowPrice", "highPrice", FirebaseAnalytics.Param.PRICE, "priceChgPct", "turnover", "volume", "size", "lastPrice", "lastFundingRate", "totalPositionQty", "fundingRate", "remainSettleTime", "predictedFundingRate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;)V", "getTradeId", "()Ljava/lang/String;", "setTradeId", "(Ljava/lang/String;)V", "getSymbol", "getSide", "setSide", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSequence", "setSequence", "getBestAskPrice", "()Ljava/math/BigDecimal;", "setBestAskPrice", "(Ljava/math/BigDecimal;)V", "getBestAskSize", "setBestAskSize", "getBestBidPrice", "setBestBidPrice", "getBestBidSize", "setBestBidSize", "getLowPrice", "setLowPrice", "getHighPrice", "setHighPrice", "getPrice", "setPrice", "getPriceChgPct", "setPriceChgPct", "getTurnover", "setTurnover", "getVolume", "setVolume", "getSize", "setSize", "getLastPrice", "setLastPrice", "getLastFundingRate", "setLastFundingRate", "getTotalPositionQty", "setTotalPositionQty", "getFundingRate", "setFundingRate", "getRemainSettleTime", "setRemainSettleTime", "getPredictedFundingRate", "setPredictedFundingRate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;)Lcom/kubi/tradingbotkit/entity/futures/FuturesTickerEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesTickerEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FuturesTickerEntity> CREATOR = new C26224a();

    @Nullable
    private BigDecimal bestAskPrice;

    @Nullable
    private BigDecimal bestAskSize;

    @Nullable
    private BigDecimal bestBidPrice;

    @Nullable
    private BigDecimal bestBidSize;

    @Nullable
    private BigDecimal fundingRate;

    @Nullable
    private BigDecimal highPrice;

    @Nullable
    private BigDecimal lastFundingRate;

    @Nullable
    private BigDecimal lastPrice;

    @Nullable
    private BigDecimal lowPrice;

    @Nullable
    private BigDecimal predictedFundingRate;

    @Nullable
    private BigDecimal price;

    @Nullable
    private BigDecimal priceChgPct;

    @Nullable
    private Long remainSettleTime;

    @Nullable
    private Long sequence;

    @Nullable
    private String side;

    @Nullable
    private BigDecimal size;

    @Nullable
    private final String symbol;

    @SerializedName("time")
    @Nullable
    private Long timestamp;

    @Nullable
    private BigDecimal totalPositionQty;

    @Nullable
    private String tradeId;

    @Nullable
    private BigDecimal turnover;

    @Nullable
    private BigDecimal volume;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.entity.futures.FuturesTickerEntity$a */
    /* JADX INFO: compiled from: FuturesTickerEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26224a implements Parcelable.Creator<FuturesTickerEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuturesTickerEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FuturesTickerEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuturesTickerEntity[] newArray(int i11) {
            return new FuturesTickerEntity[i11];
        }
    }

    public FuturesTickerEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    public static /* synthetic */ FuturesTickerEntity copy$default(FuturesTickerEntity futuresTickerEntity, String str, String str2, String str3, Long l11, Long l12, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, Long l13, BigDecimal bigDecimal16, int i11, Object obj) {
        BigDecimal bigDecimal17;
        Long l14;
        String str4 = (i11 & 1) != 0 ? futuresTickerEntity.tradeId : str;
        String str5 = (i11 & 2) != 0 ? futuresTickerEntity.symbol : str2;
        String str6 = (i11 & 4) != 0 ? futuresTickerEntity.side : str3;
        Long l15 = (i11 & 8) != 0 ? futuresTickerEntity.timestamp : l11;
        Long l16 = (i11 & 16) != 0 ? futuresTickerEntity.sequence : l12;
        BigDecimal bigDecimal18 = (i11 & 32) != 0 ? futuresTickerEntity.bestAskPrice : bigDecimal;
        BigDecimal bigDecimal19 = (i11 & 64) != 0 ? futuresTickerEntity.bestAskSize : bigDecimal2;
        BigDecimal bigDecimal20 = (i11 & 128) != 0 ? futuresTickerEntity.bestBidPrice : bigDecimal3;
        BigDecimal bigDecimal21 = (i11 & 256) != 0 ? futuresTickerEntity.bestBidSize : bigDecimal4;
        BigDecimal bigDecimal22 = (i11 & 512) != 0 ? futuresTickerEntity.lowPrice : bigDecimal5;
        BigDecimal bigDecimal23 = (i11 & 1024) != 0 ? futuresTickerEntity.highPrice : bigDecimal6;
        BigDecimal bigDecimal24 = (i11 & 2048) != 0 ? futuresTickerEntity.price : bigDecimal7;
        BigDecimal bigDecimal25 = (i11 & 4096) != 0 ? futuresTickerEntity.priceChgPct : bigDecimal8;
        BigDecimal bigDecimal26 = (i11 & 8192) != 0 ? futuresTickerEntity.turnover : bigDecimal9;
        String str7 = str4;
        BigDecimal bigDecimal27 = (i11 & 16384) != 0 ? futuresTickerEntity.volume : bigDecimal10;
        BigDecimal bigDecimal28 = (i11 & 32768) != 0 ? futuresTickerEntity.size : bigDecimal11;
        BigDecimal bigDecimal29 = (i11 & 65536) != 0 ? futuresTickerEntity.lastPrice : bigDecimal12;
        BigDecimal bigDecimal30 = (i11 & 131072) != 0 ? futuresTickerEntity.lastFundingRate : bigDecimal13;
        BigDecimal bigDecimal31 = (i11 & 262144) != 0 ? futuresTickerEntity.totalPositionQty : bigDecimal14;
        BigDecimal bigDecimal32 = (i11 & 524288) != 0 ? futuresTickerEntity.fundingRate : bigDecimal15;
        Long l17 = (i11 & 1048576) != 0 ? futuresTickerEntity.remainSettleTime : l13;
        if ((i11 & 2097152) != 0) {
            l14 = l17;
            bigDecimal17 = futuresTickerEntity.predictedFundingRate;
        } else {
            bigDecimal17 = bigDecimal16;
            l14 = l17;
        }
        return futuresTickerEntity.copy(str7, str5, str6, l15, l16, bigDecimal18, bigDecimal19, bigDecimal20, bigDecimal21, bigDecimal22, bigDecimal23, bigDecimal24, bigDecimal25, bigDecimal26, bigDecimal27, bigDecimal28, bigDecimal29, bigDecimal30, bigDecimal31, bigDecimal32, l14, bigDecimal17);
    }

    @NotNull
    public final FuturesTickerEntity copy(@Nullable String tradeId, @Nullable String symbol, @Nullable String side, @Nullable Long timestamp, @Nullable Long sequence, @Nullable BigDecimal bestAskPrice, @Nullable BigDecimal bestAskSize, @Nullable BigDecimal bestBidPrice, @Nullable BigDecimal bestBidSize, @Nullable BigDecimal lowPrice, @Nullable BigDecimal highPrice, @Nullable BigDecimal price, @Nullable BigDecimal priceChgPct, @Nullable BigDecimal turnover, @Nullable BigDecimal volume, @Nullable BigDecimal size, @Nullable BigDecimal lastPrice, @Nullable BigDecimal lastFundingRate, @Nullable BigDecimal totalPositionQty, @Nullable BigDecimal fundingRate, @Nullable Long remainSettleTime, @Nullable BigDecimal predictedFundingRate) {
        return new FuturesTickerEntity(tradeId, symbol, side, timestamp, sequence, bestAskPrice, bestAskSize, bestBidPrice, bestBidSize, lowPrice, highPrice, price, priceChgPct, turnover, volume, size, lastPrice, lastFundingRate, totalPositionQty, fundingRate, remainSettleTime, predictedFundingRate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesTickerEntity)) {
            return false;
        }
        FuturesTickerEntity futuresTickerEntity = (FuturesTickerEntity) other;
        return Intrinsics.areEqual(this.tradeId, futuresTickerEntity.tradeId) && Intrinsics.areEqual(this.symbol, futuresTickerEntity.symbol) && Intrinsics.areEqual(this.side, futuresTickerEntity.side) && Intrinsics.areEqual(this.timestamp, futuresTickerEntity.timestamp) && Intrinsics.areEqual(this.sequence, futuresTickerEntity.sequence) && Intrinsics.areEqual(this.bestAskPrice, futuresTickerEntity.bestAskPrice) && Intrinsics.areEqual(this.bestAskSize, futuresTickerEntity.bestAskSize) && Intrinsics.areEqual(this.bestBidPrice, futuresTickerEntity.bestBidPrice) && Intrinsics.areEqual(this.bestBidSize, futuresTickerEntity.bestBidSize) && Intrinsics.areEqual(this.lowPrice, futuresTickerEntity.lowPrice) && Intrinsics.areEqual(this.highPrice, futuresTickerEntity.highPrice) && Intrinsics.areEqual(this.price, futuresTickerEntity.price) && Intrinsics.areEqual(this.priceChgPct, futuresTickerEntity.priceChgPct) && Intrinsics.areEqual(this.turnover, futuresTickerEntity.turnover) && Intrinsics.areEqual(this.volume, futuresTickerEntity.volume) && Intrinsics.areEqual(this.size, futuresTickerEntity.size) && Intrinsics.areEqual(this.lastPrice, futuresTickerEntity.lastPrice) && Intrinsics.areEqual(this.lastFundingRate, futuresTickerEntity.lastFundingRate) && Intrinsics.areEqual(this.totalPositionQty, futuresTickerEntity.totalPositionQty) && Intrinsics.areEqual(this.fundingRate, futuresTickerEntity.fundingRate) && Intrinsics.areEqual(this.remainSettleTime, futuresTickerEntity.remainSettleTime) && Intrinsics.areEqual(this.predictedFundingRate, futuresTickerEntity.predictedFundingRate);
    }

    public FuturesTickerEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l11, @Nullable Long l12, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11, @Nullable BigDecimal bigDecimal12, @Nullable BigDecimal bigDecimal13, @Nullable BigDecimal bigDecimal14, @Nullable BigDecimal bigDecimal15, @Nullable Long l13, @Nullable BigDecimal bigDecimal16) {
        this.tradeId = str;
        this.symbol = str2;
        this.side = str3;
        this.timestamp = l11;
        this.sequence = l12;
        this.bestAskPrice = bigDecimal;
        this.bestAskSize = bigDecimal2;
        this.bestBidPrice = bigDecimal3;
        this.bestBidSize = bigDecimal4;
        this.lowPrice = bigDecimal5;
        this.highPrice = bigDecimal6;
        this.price = bigDecimal7;
        this.priceChgPct = bigDecimal8;
        this.turnover = bigDecimal9;
        this.volume = bigDecimal10;
        this.size = bigDecimal11;
        this.lastPrice = bigDecimal12;
        this.lastFundingRate = bigDecimal13;
        this.totalPositionQty = bigDecimal14;
        this.fundingRate = bigDecimal15;
        this.remainSettleTime = l13;
        this.predictedFundingRate = bigDecimal16;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeId() {
        return this.tradeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getLowPrice() {
        return this.lowPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getHighPrice() {
        return this.highPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getPriceChgPct() {
        return this.priceChgPct;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getTurnover() {
        return this.turnover;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final BigDecimal getVolume() {
        return this.volume;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final BigDecimal getLastFundingRate() {
        return this.lastFundingRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final BigDecimal getTotalPositionQty() {
        return this.totalPositionQty;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getFundingRate() {
        return this.fundingRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Long getRemainSettleTime() {
        return this.remainSettleTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final BigDecimal getPredictedFundingRate() {
        return this.predictedFundingRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getSequence() {
        return this.sequence;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getBestAskPrice() {
        return this.bestAskPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getBestAskSize() {
        return this.bestAskSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getBestBidPrice() {
        return this.bestBidPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getBestBidSize() {
        return this.bestBidSize;
    }

    @Nullable
    public final BigDecimal getBestAskPrice() {
        return this.bestAskPrice;
    }

    @Nullable
    public final BigDecimal getBestAskSize() {
        return this.bestAskSize;
    }

    @Nullable
    public final BigDecimal getBestBidPrice() {
        return this.bestBidPrice;
    }

    @Nullable
    public final BigDecimal getBestBidSize() {
        return this.bestBidSize;
    }

    @Nullable
    public final BigDecimal getFundingRate() {
        return this.fundingRate;
    }

    @Nullable
    public final BigDecimal getHighPrice() {
        return this.highPrice;
    }

    @Nullable
    public final BigDecimal getLastFundingRate() {
        return this.lastFundingRate;
    }

    @Nullable
    public final BigDecimal getLastPrice() {
        return this.lastPrice;
    }

    @Nullable
    public final BigDecimal getLowPrice() {
        return this.lowPrice;
    }

    @Nullable
    public final BigDecimal getPredictedFundingRate() {
        return this.predictedFundingRate;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final BigDecimal getPriceChgPct() {
        return this.priceChgPct;
    }

    @Nullable
    public final Long getRemainSettleTime() {
        return this.remainSettleTime;
    }

    @Nullable
    public final Long getSequence() {
        return this.sequence;
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
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final BigDecimal getTotalPositionQty() {
        return this.totalPositionQty;
    }

    @Nullable
    public final String getTradeId() {
        return this.tradeId;
    }

    @Nullable
    public final BigDecimal getTurnover() {
        return this.turnover;
    }

    @Nullable
    public final BigDecimal getVolume() {
        return this.volume;
    }

    public int hashCode() {
        String str = this.tradeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.side;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.timestamp;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.sequence;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        BigDecimal bigDecimal = this.bestAskPrice;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.bestAskSize;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.bestBidPrice;
        int iHashCode8 = (iHashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.bestBidSize;
        int iHashCode9 = (iHashCode8 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.lowPrice;
        int iHashCode10 = (iHashCode9 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.highPrice;
        int iHashCode11 = (iHashCode10 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.price;
        int iHashCode12 = (iHashCode11 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.priceChgPct;
        int iHashCode13 = (iHashCode12 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.turnover;
        int iHashCode14 = (iHashCode13 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.volume;
        int iHashCode15 = (iHashCode14 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.size;
        int iHashCode16 = (iHashCode15 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        BigDecimal bigDecimal12 = this.lastPrice;
        int iHashCode17 = (iHashCode16 + (bigDecimal12 == null ? 0 : bigDecimal12.hashCode())) * 31;
        BigDecimal bigDecimal13 = this.lastFundingRate;
        int iHashCode18 = (iHashCode17 + (bigDecimal13 == null ? 0 : bigDecimal13.hashCode())) * 31;
        BigDecimal bigDecimal14 = this.totalPositionQty;
        int iHashCode19 = (iHashCode18 + (bigDecimal14 == null ? 0 : bigDecimal14.hashCode())) * 31;
        BigDecimal bigDecimal15 = this.fundingRate;
        int iHashCode20 = (iHashCode19 + (bigDecimal15 == null ? 0 : bigDecimal15.hashCode())) * 31;
        Long l13 = this.remainSettleTime;
        int iHashCode21 = (iHashCode20 + (l13 == null ? 0 : l13.hashCode())) * 31;
        BigDecimal bigDecimal16 = this.predictedFundingRate;
        return iHashCode21 + (bigDecimal16 != null ? bigDecimal16.hashCode() : 0);
    }

    public final void setBestAskPrice(@Nullable BigDecimal bigDecimal) {
        this.bestAskPrice = bigDecimal;
    }

    public final void setBestAskSize(@Nullable BigDecimal bigDecimal) {
        this.bestAskSize = bigDecimal;
    }

    public final void setBestBidPrice(@Nullable BigDecimal bigDecimal) {
        this.bestBidPrice = bigDecimal;
    }

    public final void setBestBidSize(@Nullable BigDecimal bigDecimal) {
        this.bestBidSize = bigDecimal;
    }

    public final void setFundingRate(@Nullable BigDecimal bigDecimal) {
        this.fundingRate = bigDecimal;
    }

    public final void setHighPrice(@Nullable BigDecimal bigDecimal) {
        this.highPrice = bigDecimal;
    }

    public final void setLastFundingRate(@Nullable BigDecimal bigDecimal) {
        this.lastFundingRate = bigDecimal;
    }

    public final void setLastPrice(@Nullable BigDecimal bigDecimal) {
        this.lastPrice = bigDecimal;
    }

    public final void setLowPrice(@Nullable BigDecimal bigDecimal) {
        this.lowPrice = bigDecimal;
    }

    public final void setPredictedFundingRate(@Nullable BigDecimal bigDecimal) {
        this.predictedFundingRate = bigDecimal;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setPriceChgPct(@Nullable BigDecimal bigDecimal) {
        this.priceChgPct = bigDecimal;
    }

    public final void setRemainSettleTime(@Nullable Long l11) {
        this.remainSettleTime = l11;
    }

    public final void setSequence(@Nullable Long l11) {
        this.sequence = l11;
    }

    public final void setSide(@Nullable String str) {
        this.side = str;
    }

    public final void setSize(@Nullable BigDecimal bigDecimal) {
        this.size = bigDecimal;
    }

    public final void setTimestamp(@Nullable Long l11) {
        this.timestamp = l11;
    }

    public final void setTotalPositionQty(@Nullable BigDecimal bigDecimal) {
        this.totalPositionQty = bigDecimal;
    }

    public final void setTradeId(@Nullable String str) {
        this.tradeId = str;
    }

    public final void setTurnover(@Nullable BigDecimal bigDecimal) {
        this.turnover = bigDecimal;
    }

    public final void setVolume(@Nullable BigDecimal bigDecimal) {
        this.volume = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "FuturesTickerEntity(tradeId=" + this.tradeId + ", symbol=" + this.symbol + ", side=" + this.side + ", timestamp=" + this.timestamp + ", sequence=" + this.sequence + ", bestAskPrice=" + this.bestAskPrice + ", bestAskSize=" + this.bestAskSize + ", bestBidPrice=" + this.bestBidPrice + ", bestBidSize=" + this.bestBidSize + ", lowPrice=" + this.lowPrice + ", highPrice=" + this.highPrice + ", price=" + this.price + ", priceChgPct=" + this.priceChgPct + ", turnover=" + this.turnover + ", volume=" + this.volume + ", size=" + this.size + ", lastPrice=" + this.lastPrice + ", lastFundingRate=" + this.lastFundingRate + ", totalPositionQty=" + this.totalPositionQty + ", fundingRate=" + this.fundingRate + ", remainSettleTime=" + this.remainSettleTime + ", predictedFundingRate=" + this.predictedFundingRate + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tradeId);
        dest.writeString(this.symbol);
        dest.writeString(this.side);
        Long l11 = this.timestamp;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.sequence;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeSerializable(this.bestAskPrice);
        dest.writeSerializable(this.bestAskSize);
        dest.writeSerializable(this.bestBidPrice);
        dest.writeSerializable(this.bestBidSize);
        dest.writeSerializable(this.lowPrice);
        dest.writeSerializable(this.highPrice);
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.priceChgPct);
        dest.writeSerializable(this.turnover);
        dest.writeSerializable(this.volume);
        dest.writeSerializable(this.size);
        dest.writeSerializable(this.lastPrice);
        dest.writeSerializable(this.lastFundingRate);
        dest.writeSerializable(this.totalPositionQty);
        dest.writeSerializable(this.fundingRate);
        Long l13 = this.remainSettleTime;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        dest.writeSerializable(this.predictedFundingRate);
    }

    public /* synthetic */ FuturesTickerEntity(String str, String str2, String str3, Long l11, Long l12, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, BigDecimal bigDecimal12, BigDecimal bigDecimal13, BigDecimal bigDecimal14, BigDecimal bigDecimal15, Long l13, BigDecimal bigDecimal16, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? null : l12, (i11 & 32) != 0 ? null : bigDecimal, (i11 & 64) != 0 ? null : bigDecimal2, (i11 & 128) != 0 ? null : bigDecimal3, (i11 & 256) != 0 ? null : bigDecimal4, (i11 & 512) != 0 ? null : bigDecimal5, (i11 & 1024) != 0 ? null : bigDecimal6, (i11 & 2048) != 0 ? null : bigDecimal7, (i11 & 4096) != 0 ? null : bigDecimal8, (i11 & 8192) != 0 ? null : bigDecimal9, (i11 & 16384) != 0 ? null : bigDecimal10, (i11 & 32768) != 0 ? null : bigDecimal11, (i11 & 65536) != 0 ? null : bigDecimal12, (i11 & 131072) != 0 ? null : bigDecimal13, (i11 & 262144) != 0 ? null : bigDecimal14, (i11 & 524288) != 0 ? null : bigDecimal15, (i11 & 1048576) != 0 ? null : l13, (i11 & 2097152) != 0 ? null : bigDecimal16);
    }
}
