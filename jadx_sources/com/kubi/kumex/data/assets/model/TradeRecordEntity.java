package com.kubi.kumex.data.assets.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradeRecordEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\bM\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010S\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010\\\u001a\u00020\u0017HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J \u0002\u0010b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010cJ\u0006\u0010d\u001a\u00020eJ\u0013\u0010f\u001a\u00020\u00172\b\u0010g\u001a\u0004\u0018\u00010hHÖ\u0003J\t\u0010i\u001a\u00020eHÖ\u0001J\t\u0010j\u001a\u00020\u0003HÖ\u0001J\u0016\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00105\"\u0004\b9\u00107R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010 R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b<\u00105R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00105\"\u0004\b?\u00107R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00105\"\u0004\bA\u00107R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00105\"\u0004\bC\u00107R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010DR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010 R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010 \"\u0004\bG\u0010\"R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010 R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bI\u00105R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010 ¨\u0006p"}, m90084d2 = {"Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;", "Landroid/os/Parcelable;", "tradeId", "", "orderId", "symbol", "side", "type", "fillType", "displayType", "createdAt", "", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "fee", "feeCurrency", "liquidityRole", FirebaseAnalytics.Param.TAX, "taxCurrency", "size", "value", "liquidationPrice", "isTrialFunds", "", "prizeType", "marginMode", "positionSide", "fillPnl", "settleCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getTradeId", "()Ljava/lang/String;", "setTradeId", "(Ljava/lang/String;)V", "getOrderId", "setOrderId", "getSymbol", "setSymbol", "getSide", "setSide", "getType", "setType", "getFillType", "setFillType", "getDisplayType", "setDisplayType", "getCreatedAt", "()Ljava/lang/Long;", "setCreatedAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPrice", "()Ljava/math/BigDecimal;", "setPrice", "(Ljava/math/BigDecimal;)V", "getFee", "setFee", "getFeeCurrency", "getLiquidityRole", "getTax", "getTaxCurrency", "getSize", "setSize", "getValue", "setValue", "getLiquidationPrice", "setLiquidationPrice", "()Z", "getPrizeType", "getMarginMode", "setMarginMode", "getPositionSide", "getFillPnl", "getSettleCurrency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TradeRecordEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TradeRecordEntity> CREATOR = new C15775a();

    @Nullable
    private Long createdAt;

    @Nullable
    private String displayType;

    @Nullable
    private BigDecimal fee;

    @Nullable
    private final String feeCurrency;

    @Nullable
    private final BigDecimal fillPnl;

    @Nullable
    private String fillType;
    private final boolean isTrialFunds;

    @Nullable
    private BigDecimal liquidationPrice;

    @SerializedName("liquidity")
    @Nullable
    private final String liquidityRole;

    @Nullable
    private String marginMode;

    @Nullable
    private String orderId;

    @Nullable
    private final String positionSide;

    @Nullable
    private BigDecimal price;

    @Nullable
    private final String prizeType;

    @Nullable
    private final String settleCurrency;

    @Nullable
    private String side;

    @Nullable
    private BigDecimal size;

    @Nullable
    private String symbol;

    @Nullable
    private final BigDecimal tax;

    @Nullable
    private final String taxCurrency;

    @Nullable
    private String tradeId;

    @SerializedName("orderType")
    @Nullable
    private String type;

    @Nullable
    private BigDecimal value;

    /* JADX INFO: renamed from: com.kubi.kumex.data.assets.model.TradeRecordEntity$a */
    /* JADX INFO: compiled from: TradeRecordEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15775a implements Parcelable.Creator<TradeRecordEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TradeRecordEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TradeRecordEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TradeRecordEntity[] newArray(int i11) {
            return new TradeRecordEntity[i11];
        }
    }

    public TradeRecordEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Long l11, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str8, @Nullable String str9, @Nullable BigDecimal bigDecimal3, @Nullable String str10, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, boolean z11, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable BigDecimal bigDecimal7, @Nullable String str14) {
        this.tradeId = str;
        this.orderId = str2;
        this.symbol = str3;
        this.side = str4;
        this.type = str5;
        this.fillType = str6;
        this.displayType = str7;
        this.createdAt = l11;
        this.price = bigDecimal;
        this.fee = bigDecimal2;
        this.feeCurrency = str8;
        this.liquidityRole = str9;
        this.tax = bigDecimal3;
        this.taxCurrency = str10;
        this.size = bigDecimal4;
        this.value = bigDecimal5;
        this.liquidationPrice = bigDecimal6;
        this.isTrialFunds = z11;
        this.prizeType = str11;
        this.marginMode = str12;
        this.positionSide = str13;
        this.fillPnl = bigDecimal7;
        this.settleCurrency = str14;
    }

    public static /* synthetic */ TradeRecordEntity copy$default(TradeRecordEntity tradeRecordEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l11, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str8, String str9, BigDecimal bigDecimal3, String str10, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, boolean z11, String str11, String str12, String str13, BigDecimal bigDecimal7, String str14, int i11, Object obj) {
        String str15;
        BigDecimal bigDecimal8;
        String str16 = (i11 & 1) != 0 ? tradeRecordEntity.tradeId : str;
        String str17 = (i11 & 2) != 0 ? tradeRecordEntity.orderId : str2;
        String str18 = (i11 & 4) != 0 ? tradeRecordEntity.symbol : str3;
        String str19 = (i11 & 8) != 0 ? tradeRecordEntity.side : str4;
        String str20 = (i11 & 16) != 0 ? tradeRecordEntity.type : str5;
        String str21 = (i11 & 32) != 0 ? tradeRecordEntity.fillType : str6;
        String str22 = (i11 & 64) != 0 ? tradeRecordEntity.displayType : str7;
        Long l12 = (i11 & 128) != 0 ? tradeRecordEntity.createdAt : l11;
        BigDecimal bigDecimal9 = (i11 & 256) != 0 ? tradeRecordEntity.price : bigDecimal;
        BigDecimal bigDecimal10 = (i11 & 512) != 0 ? tradeRecordEntity.fee : bigDecimal2;
        String str23 = (i11 & 1024) != 0 ? tradeRecordEntity.feeCurrency : str8;
        String str24 = (i11 & 2048) != 0 ? tradeRecordEntity.liquidityRole : str9;
        BigDecimal bigDecimal11 = (i11 & 4096) != 0 ? tradeRecordEntity.tax : bigDecimal3;
        String str25 = (i11 & 8192) != 0 ? tradeRecordEntity.taxCurrency : str10;
        String str26 = str16;
        BigDecimal bigDecimal12 = (i11 & 16384) != 0 ? tradeRecordEntity.size : bigDecimal4;
        BigDecimal bigDecimal13 = (i11 & 32768) != 0 ? tradeRecordEntity.value : bigDecimal5;
        BigDecimal bigDecimal14 = (i11 & 65536) != 0 ? tradeRecordEntity.liquidationPrice : bigDecimal6;
        boolean z12 = (i11 & 131072) != 0 ? tradeRecordEntity.isTrialFunds : z11;
        String str27 = (i11 & 262144) != 0 ? tradeRecordEntity.prizeType : str11;
        String str28 = (i11 & 524288) != 0 ? tradeRecordEntity.marginMode : str12;
        String str29 = (i11 & 1048576) != 0 ? tradeRecordEntity.positionSide : str13;
        BigDecimal bigDecimal15 = (i11 & 2097152) != 0 ? tradeRecordEntity.fillPnl : bigDecimal7;
        if ((i11 & 4194304) != 0) {
            bigDecimal8 = bigDecimal15;
            str15 = tradeRecordEntity.settleCurrency;
        } else {
            str15 = str14;
            bigDecimal8 = bigDecimal15;
        }
        return tradeRecordEntity.copy(str26, str17, str18, str19, str20, str21, str22, l12, bigDecimal9, bigDecimal10, str23, str24, bigDecimal11, str25, bigDecimal12, bigDecimal13, bigDecimal14, z12, str27, str28, str29, bigDecimal8, str15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeRecordEntity)) {
            return false;
        }
        TradeRecordEntity tradeRecordEntity = (TradeRecordEntity) other;
        return Intrinsics.areEqual(this.tradeId, tradeRecordEntity.tradeId) && Intrinsics.areEqual(this.orderId, tradeRecordEntity.orderId) && Intrinsics.areEqual(this.symbol, tradeRecordEntity.symbol) && Intrinsics.areEqual(this.side, tradeRecordEntity.side) && Intrinsics.areEqual(this.type, tradeRecordEntity.type) && Intrinsics.areEqual(this.fillType, tradeRecordEntity.fillType) && Intrinsics.areEqual(this.displayType, tradeRecordEntity.displayType) && Intrinsics.areEqual(this.createdAt, tradeRecordEntity.createdAt) && Intrinsics.areEqual(this.price, tradeRecordEntity.price) && Intrinsics.areEqual(this.fee, tradeRecordEntity.fee) && Intrinsics.areEqual(this.feeCurrency, tradeRecordEntity.feeCurrency) && Intrinsics.areEqual(this.liquidityRole, tradeRecordEntity.liquidityRole) && Intrinsics.areEqual(this.tax, tradeRecordEntity.tax) && Intrinsics.areEqual(this.taxCurrency, tradeRecordEntity.taxCurrency) && Intrinsics.areEqual(this.size, tradeRecordEntity.size) && Intrinsics.areEqual(this.value, tradeRecordEntity.value) && Intrinsics.areEqual(this.liquidationPrice, tradeRecordEntity.liquidationPrice) && this.isTrialFunds == tradeRecordEntity.isTrialFunds && Intrinsics.areEqual(this.prizeType, tradeRecordEntity.prizeType) && Intrinsics.areEqual(this.marginMode, tradeRecordEntity.marginMode) && Intrinsics.areEqual(this.positionSide, tradeRecordEntity.positionSide) && Intrinsics.areEqual(this.fillPnl, tradeRecordEntity.fillPnl) && Intrinsics.areEqual(this.settleCurrency, tradeRecordEntity.settleCurrency);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTradeId() {
        return this.tradeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLiquidityRole() {
        return this.liquidityRole;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getTax() {
        return this.tax;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getLiquidationPrice() {
        return this.liquidationPrice;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsTrialFunds() {
        return this.isTrialFunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final BigDecimal getFillPnl() {
        return this.fillPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getSettleCurrency() {
        return this.settleCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFillType() {
        return this.fillType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDisplayType() {
        return this.displayType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @NotNull
    public final TradeRecordEntity copy(@Nullable String tradeId, @Nullable String orderId, @Nullable String symbol, @Nullable String side, @Nullable String type, @Nullable String fillType, @Nullable String displayType, @Nullable Long createdAt, @Nullable BigDecimal price, @Nullable BigDecimal fee, @Nullable String feeCurrency, @Nullable String liquidityRole, @Nullable BigDecimal tax, @Nullable String taxCurrency, @Nullable BigDecimal size, @Nullable BigDecimal value, @Nullable BigDecimal liquidationPrice, boolean isTrialFunds, @Nullable String prizeType, @Nullable String marginMode, @Nullable String positionSide, @Nullable BigDecimal fillPnl, @Nullable String settleCurrency) {
        return new TradeRecordEntity(tradeId, orderId, symbol, side, type, fillType, displayType, createdAt, price, fee, feeCurrency, liquidityRole, tax, taxCurrency, size, value, liquidationPrice, isTrialFunds, prizeType, marginMode, positionSide, fillPnl, settleCurrency);
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getDisplayType() {
        return this.displayType;
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
    public final BigDecimal getFillPnl() {
        return this.fillPnl;
    }

    @Nullable
    public final String getFillType() {
        return this.fillType;
    }

    @Nullable
    public final BigDecimal getLiquidationPrice() {
        return this.liquidationPrice;
    }

    @Nullable
    public final String getLiquidityRole() {
        return this.liquidityRole;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    public final String getSettleCurrency() {
        return this.settleCurrency;
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
    public final BigDecimal getTax() {
        return this.tax;
    }

    @Nullable
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    public final String getTradeId() {
        return this.tradeId;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final BigDecimal getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.tradeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.side;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.type;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fillType;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.displayType;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l11 = this.createdAt;
        int iHashCode8 = (iHashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal = this.price;
        int iHashCode9 = (iHashCode8 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.fee;
        int iHashCode10 = (iHashCode9 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str8 = this.feeCurrency;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.liquidityRole;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.tax;
        int iHashCode13 = (iHashCode12 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str10 = this.taxCurrency;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.size;
        int iHashCode15 = (iHashCode14 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.value;
        int iHashCode16 = (iHashCode15 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.liquidationPrice;
        int iHashCode17 = (((iHashCode16 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31) + Boolean.hashCode(this.isTrialFunds)) * 31;
        String str11 = this.prizeType;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.marginMode;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.positionSide;
        int iHashCode20 = (iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.fillPnl;
        int iHashCode21 = (iHashCode20 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        String str14 = this.settleCurrency;
        return iHashCode21 + (str14 != null ? str14.hashCode() : 0);
    }

    public final boolean isTrialFunds() {
        return this.isTrialFunds;
    }

    public final void setCreatedAt(@Nullable Long l11) {
        this.createdAt = l11;
    }

    public final void setDisplayType(@Nullable String str) {
        this.displayType = str;
    }

    public final void setFee(@Nullable BigDecimal bigDecimal) {
        this.fee = bigDecimal;
    }

    public final void setFillType(@Nullable String str) {
        this.fillType = str;
    }

    public final void setLiquidationPrice(@Nullable BigDecimal bigDecimal) {
        this.liquidationPrice = bigDecimal;
    }

    public final void setMarginMode(@Nullable String str) {
        this.marginMode = str;
    }

    public final void setOrderId(@Nullable String str) {
        this.orderId = str;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setSide(@Nullable String str) {
        this.side = str;
    }

    public final void setSize(@Nullable BigDecimal bigDecimal) {
        this.size = bigDecimal;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTradeId(@Nullable String str) {
        this.tradeId = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setValue(@Nullable BigDecimal bigDecimal) {
        this.value = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "TradeRecordEntity(tradeId=" + this.tradeId + ", orderId=" + this.orderId + ", symbol=" + this.symbol + ", side=" + this.side + ", type=" + this.type + ", fillType=" + this.fillType + ", displayType=" + this.displayType + ", createdAt=" + this.createdAt + ", price=" + this.price + ", fee=" + this.fee + ", feeCurrency=" + this.feeCurrency + ", liquidityRole=" + this.liquidityRole + ", tax=" + this.tax + ", taxCurrency=" + this.taxCurrency + ", size=" + this.size + ", value=" + this.value + ", liquidationPrice=" + this.liquidationPrice + ", isTrialFunds=" + this.isTrialFunds + ", prizeType=" + this.prizeType + ", marginMode=" + this.marginMode + ", positionSide=" + this.positionSide + ", fillPnl=" + this.fillPnl + ", settleCurrency=" + this.settleCurrency + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.tradeId);
        dest.writeString(this.orderId);
        dest.writeString(this.symbol);
        dest.writeString(this.side);
        dest.writeString(this.type);
        dest.writeString(this.fillType);
        dest.writeString(this.displayType);
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.fee);
        dest.writeString(this.feeCurrency);
        dest.writeString(this.liquidityRole);
        dest.writeSerializable(this.tax);
        dest.writeString(this.taxCurrency);
        dest.writeSerializable(this.size);
        dest.writeSerializable(this.value);
        dest.writeSerializable(this.liquidationPrice);
        dest.writeInt(this.isTrialFunds ? 1 : 0);
        dest.writeString(this.prizeType);
        dest.writeString(this.marginMode);
        dest.writeString(this.positionSide);
        dest.writeSerializable(this.fillPnl);
        dest.writeString(this.settleCurrency);
    }

    public /* synthetic */ TradeRecordEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l11, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str8, String str9, BigDecimal bigDecimal3, String str10, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, boolean z11, String str11, String str12, String str13, BigDecimal bigDecimal7, String str14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : l11, (i11 & 256) != 0 ? null : bigDecimal, (i11 & 512) != 0 ? null : bigDecimal2, (i11 & 1024) != 0 ? null : str8, (i11 & 2048) != 0 ? null : str9, (i11 & 4096) != 0 ? null : bigDecimal3, (i11 & 8192) != 0 ? null : str10, (i11 & 16384) != 0 ? null : bigDecimal4, (32768 & i11) != 0 ? null : bigDecimal5, (65536 & i11) != 0 ? null : bigDecimal6, (131072 & i11) != 0 ? false : z11, (262144 & i11) != 0 ? null : str11, (524288 & i11) != 0 ? null : str12, str13, (2097152 & i11) != 0 ? null : bigDecimal7, (i11 & 4194304) != 0 ? null : str14);
    }
}
