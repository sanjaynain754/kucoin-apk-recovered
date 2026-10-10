package com.kubi.kumex.data.assets.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizType;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProfitRecordEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u0006\u0010F\u001a\u00020\u0013J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010M\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010S\u001a\u00020\u0013HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010^\u001a\u0004\u0018\u00010\u001fHÆ\u0003J¬\u0002\u0010_\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÆ\u0001¢\u0006\u0002\u0010`J\u0006\u0010a\u001a\u00020\u0007J\u0013\u0010b\u001a\u00020\u00132\b\u0010c\u001a\u0004\u0018\u00010dHÖ\u0003J\t\u0010e\u001a\u00020\u0007HÖ\u0001J\t\u0010f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010*\u001a\u0004\b+\u0010#R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010*\u001a\u0004\b4\u00100R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b5\u00100R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b6\u00100R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u00107R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b:\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b;\u00100R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b<\u00100R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b=\u00100R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b>\u00100R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010#R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010#R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010.\u001a\u0004\bA\u0010-R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006l"}, m90084d2 = {"Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "Landroid/os/Parcelable;", "id", "", "symbol", FirebaseAnalytics.Param.CURRENCY, TypedValues.CycleType.S_WAVE_OFFSET, "", "type", "closeDate", "", "realisedPnl", "Ljava/math/BigDecimal;", "dealComm", "fundingFee", "realisedGrossCost", "realisedGrossCostNew", "withdrawPnl", "isTrialFunds", "", "prizeType", "marginMode", FirebaseAnalytics.Param.TAX, "roe", "liquidAmount", "liquidPrice", "leverage", "side", "closeType", "openTime", "multiBizType", "Lcom/kubi/broker/MultiBizType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/kubi/broker/MultiBizType;)V", "getId", "()Ljava/lang/String;", "getSymbol", "getCurrency", "getOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType$annotations", "()V", "getType", "getCloseDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRealisedPnl", "()Ljava/math/BigDecimal;", "getDealComm", "getFundingFee", "getRealisedGrossCost$annotations", "getRealisedGrossCost", "getRealisedGrossCostNew", "getWithdrawPnl", "()Z", "getPrizeType", "getMarginMode", "getTax", "getRoe", "getLiquidAmount", "getLiquidPrice", "getLeverage", "getSide", "getCloseType", "getOpenTime", "getMultiBizType", "()Lcom/kubi/broker/MultiBizType;", "setMultiBizType", "(Lcom/kubi/broker/MultiBizType;)V", "isBuy", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/kubi/broker/MultiBizType;)Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ProfitRecordEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProfitRecordEntity> CREATOR = new C15774a();

    @Nullable
    private final Long closeDate;

    @Nullable
    private final String closeType;

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal dealComm;

    @Nullable
    private final BigDecimal fundingFee;

    @Nullable
    private final String id;
    private final boolean isTrialFunds;

    @Nullable
    private final BigDecimal leverage;

    @Nullable
    private final BigDecimal liquidAmount;

    @Nullable
    private final BigDecimal liquidPrice;

    @Nullable
    private final String marginMode;

    @Nullable
    private MultiBizType multiBizType;

    @Nullable
    private final Integer offset;

    @Nullable
    private final Long openTime;

    @Nullable
    private final String prizeType;

    @Nullable
    private final BigDecimal realisedGrossCost;

    @Nullable
    private final BigDecimal realisedGrossCostNew;

    @Nullable
    private final BigDecimal realisedPnl;

    @Nullable
    private final BigDecimal roe;

    @Nullable
    private final String side;

    @Nullable
    private final String symbol;

    @Nullable
    private final BigDecimal tax;

    @Nullable
    private final String type;

    @Nullable
    private final BigDecimal withdrawPnl;

    /* JADX INFO: renamed from: com.kubi.kumex.data.assets.model.ProfitRecordEntity$a */
    /* JADX INFO: compiled from: ProfitRecordEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15774a implements Parcelable.Creator<ProfitRecordEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProfitRecordEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProfitRecordEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? MultiBizType.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProfitRecordEntity[] newArray(int i11) {
            return new ProfitRecordEntity[i11];
        }
    }

    public ProfitRecordEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable Long l11, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, boolean z11, @Nullable String str5, @Nullable String str6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10, @Nullable BigDecimal bigDecimal11, @Nullable String str7, @Nullable String str8, @Nullable Long l12, @Nullable MultiBizType multiBizType) {
        this.id = str;
        this.symbol = str2;
        this.currency = str3;
        this.offset = num;
        this.type = str4;
        this.closeDate = l11;
        this.realisedPnl = bigDecimal;
        this.dealComm = bigDecimal2;
        this.fundingFee = bigDecimal3;
        this.realisedGrossCost = bigDecimal4;
        this.realisedGrossCostNew = bigDecimal5;
        this.withdrawPnl = bigDecimal6;
        this.isTrialFunds = z11;
        this.prizeType = str5;
        this.marginMode = str6;
        this.tax = bigDecimal7;
        this.roe = bigDecimal8;
        this.liquidAmount = bigDecimal9;
        this.liquidPrice = bigDecimal10;
        this.leverage = bigDecimal11;
        this.side = str7;
        this.closeType = str8;
        this.openTime = l12;
        this.multiBizType = multiBizType;
    }

    public static /* synthetic */ ProfitRecordEntity copy$default(ProfitRecordEntity profitRecordEntity, String str, String str2, String str3, Integer num, String str4, Long l11, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, boolean z11, String str5, String str6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, String str7, String str8, Long l12, MultiBizType multiBizType, int i11, Object obj) {
        MultiBizType multiBizType2;
        Long l13;
        String str9 = (i11 & 1) != 0 ? profitRecordEntity.id : str;
        String str10 = (i11 & 2) != 0 ? profitRecordEntity.symbol : str2;
        String str11 = (i11 & 4) != 0 ? profitRecordEntity.currency : str3;
        Integer num2 = (i11 & 8) != 0 ? profitRecordEntity.offset : num;
        String str12 = (i11 & 16) != 0 ? profitRecordEntity.type : str4;
        Long l14 = (i11 & 32) != 0 ? profitRecordEntity.closeDate : l11;
        BigDecimal bigDecimal12 = (i11 & 64) != 0 ? profitRecordEntity.realisedPnl : bigDecimal;
        BigDecimal bigDecimal13 = (i11 & 128) != 0 ? profitRecordEntity.dealComm : bigDecimal2;
        BigDecimal bigDecimal14 = (i11 & 256) != 0 ? profitRecordEntity.fundingFee : bigDecimal3;
        BigDecimal bigDecimal15 = (i11 & 512) != 0 ? profitRecordEntity.realisedGrossCost : bigDecimal4;
        BigDecimal bigDecimal16 = (i11 & 1024) != 0 ? profitRecordEntity.realisedGrossCostNew : bigDecimal5;
        BigDecimal bigDecimal17 = (i11 & 2048) != 0 ? profitRecordEntity.withdrawPnl : bigDecimal6;
        boolean z12 = (i11 & 4096) != 0 ? profitRecordEntity.isTrialFunds : z11;
        String str13 = (i11 & 8192) != 0 ? profitRecordEntity.prizeType : str5;
        String str14 = str9;
        String str15 = (i11 & 16384) != 0 ? profitRecordEntity.marginMode : str6;
        BigDecimal bigDecimal18 = (i11 & 32768) != 0 ? profitRecordEntity.tax : bigDecimal7;
        BigDecimal bigDecimal19 = (i11 & 65536) != 0 ? profitRecordEntity.roe : bigDecimal8;
        BigDecimal bigDecimal20 = (i11 & 131072) != 0 ? profitRecordEntity.liquidAmount : bigDecimal9;
        BigDecimal bigDecimal21 = (i11 & 262144) != 0 ? profitRecordEntity.liquidPrice : bigDecimal10;
        BigDecimal bigDecimal22 = (i11 & 524288) != 0 ? profitRecordEntity.leverage : bigDecimal11;
        String str16 = (i11 & 1048576) != 0 ? profitRecordEntity.side : str7;
        String str17 = (i11 & 2097152) != 0 ? profitRecordEntity.closeType : str8;
        Long l15 = (i11 & 4194304) != 0 ? profitRecordEntity.openTime : l12;
        if ((i11 & 8388608) != 0) {
            l13 = l15;
            multiBizType2 = profitRecordEntity.multiBizType;
        } else {
            multiBizType2 = multiBizType;
            l13 = l15;
        }
        return profitRecordEntity.copy(str14, str10, str11, num2, str12, l14, bigDecimal12, bigDecimal13, bigDecimal14, bigDecimal15, bigDecimal16, bigDecimal17, z12, str13, str15, bigDecimal18, bigDecimal19, bigDecimal20, bigDecimal21, bigDecimal22, str16, str17, l13, multiBizType2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfitRecordEntity)) {
            return false;
        }
        ProfitRecordEntity profitRecordEntity = (ProfitRecordEntity) other;
        return Intrinsics.areEqual(this.id, profitRecordEntity.id) && Intrinsics.areEqual(this.symbol, profitRecordEntity.symbol) && Intrinsics.areEqual(this.currency, profitRecordEntity.currency) && Intrinsics.areEqual(this.offset, profitRecordEntity.offset) && Intrinsics.areEqual(this.type, profitRecordEntity.type) && Intrinsics.areEqual(this.closeDate, profitRecordEntity.closeDate) && Intrinsics.areEqual(this.realisedPnl, profitRecordEntity.realisedPnl) && Intrinsics.areEqual(this.dealComm, profitRecordEntity.dealComm) && Intrinsics.areEqual(this.fundingFee, profitRecordEntity.fundingFee) && Intrinsics.areEqual(this.realisedGrossCost, profitRecordEntity.realisedGrossCost) && Intrinsics.areEqual(this.realisedGrossCostNew, profitRecordEntity.realisedGrossCostNew) && Intrinsics.areEqual(this.withdrawPnl, profitRecordEntity.withdrawPnl) && this.isTrialFunds == profitRecordEntity.isTrialFunds && Intrinsics.areEqual(this.prizeType, profitRecordEntity.prizeType) && Intrinsics.areEqual(this.marginMode, profitRecordEntity.marginMode) && Intrinsics.areEqual(this.tax, profitRecordEntity.tax) && Intrinsics.areEqual(this.roe, profitRecordEntity.roe) && Intrinsics.areEqual(this.liquidAmount, profitRecordEntity.liquidAmount) && Intrinsics.areEqual(this.liquidPrice, profitRecordEntity.liquidPrice) && Intrinsics.areEqual(this.leverage, profitRecordEntity.leverage) && Intrinsics.areEqual(this.side, profitRecordEntity.side) && Intrinsics.areEqual(this.closeType, profitRecordEntity.closeType) && Intrinsics.areEqual(this.openTime, profitRecordEntity.openTime) && this.multiBizType == profitRecordEntity.multiBizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getRealisedGrossCost() {
        return this.realisedGrossCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getRealisedGrossCostNew() {
        return this.realisedGrossCostNew;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getWithdrawPnl() {
        return this.withdrawPnl;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsTrialFunds() {
        return this.isTrialFunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getTax() {
        return this.tax;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getRoe() {
        return this.roe;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final BigDecimal getLiquidAmount() {
        return this.liquidAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final BigDecimal getLiquidPrice() {
        return this.liquidPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getCloseType() {
        return this.closeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Long getOpenTime() {
        return this.openTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final MultiBizType getMultiBizType() {
        return this.multiBizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getCloseDate() {
        return this.closeDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getRealisedPnl() {
        return this.realisedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getDealComm() {
        return this.dealComm;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getFundingFee() {
        return this.fundingFee;
    }

    @NotNull
    public final ProfitRecordEntity copy(@Nullable String id2, @Nullable String symbol, @Nullable String currency, @Nullable Integer offset, @Nullable String type, @Nullable Long closeDate, @Nullable BigDecimal realisedPnl, @Nullable BigDecimal dealComm, @Nullable BigDecimal fundingFee, @Nullable BigDecimal realisedGrossCost, @Nullable BigDecimal realisedGrossCostNew, @Nullable BigDecimal withdrawPnl, boolean isTrialFunds, @Nullable String prizeType, @Nullable String marginMode, @Nullable BigDecimal tax, @Nullable BigDecimal roe, @Nullable BigDecimal liquidAmount, @Nullable BigDecimal liquidPrice, @Nullable BigDecimal leverage, @Nullable String side, @Nullable String closeType, @Nullable Long openTime, @Nullable MultiBizType multiBizType) {
        return new ProfitRecordEntity(id2, symbol, currency, offset, type, closeDate, realisedPnl, dealComm, fundingFee, realisedGrossCost, realisedGrossCostNew, withdrawPnl, isTrialFunds, prizeType, marginMode, tax, roe, liquidAmount, liquidPrice, leverage, side, closeType, openTime, multiBizType);
    }

    @Nullable
    public final Long getCloseDate() {
        return this.closeDate;
    }

    @Nullable
    public final String getCloseType() {
        return this.closeType;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getDealComm() {
        return this.dealComm;
    }

    @Nullable
    public final BigDecimal getFundingFee() {
        return this.fundingFee;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final BigDecimal getLiquidAmount() {
        return this.liquidAmount;
    }

    @Nullable
    public final BigDecimal getLiquidPrice() {
        return this.liquidPrice;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final MultiBizType getMultiBizType() {
        return this.multiBizType;
    }

    @Nullable
    public final Integer getOffset() {
        return this.offset;
    }

    @Nullable
    public final Long getOpenTime() {
        return this.openTime;
    }

    @Nullable
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    public final BigDecimal getRealisedGrossCost() {
        return this.realisedGrossCost;
    }

    @Nullable
    public final BigDecimal getRealisedGrossCostNew() {
        return this.realisedGrossCostNew;
    }

    @Nullable
    public final BigDecimal getRealisedPnl() {
        return this.realisedPnl;
    }

    @Nullable
    public final BigDecimal getRoe() {
        return this.roe;
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
    public final BigDecimal getTax() {
        return this.tax;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final BigDecimal getWithdrawPnl() {
        return this.withdrawPnl;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.offset;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.type;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.closeDate;
        int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal = this.realisedPnl;
        int iHashCode7 = (iHashCode6 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.dealComm;
        int iHashCode8 = (iHashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.fundingFee;
        int iHashCode9 = (iHashCode8 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.realisedGrossCost;
        int iHashCode10 = (iHashCode9 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.realisedGrossCostNew;
        int iHashCode11 = (iHashCode10 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.withdrawPnl;
        int iHashCode12 = (((iHashCode11 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31) + Boolean.hashCode(this.isTrialFunds)) * 31;
        String str5 = this.prizeType;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.marginMode;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.tax;
        int iHashCode15 = (iHashCode14 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.roe;
        int iHashCode16 = (iHashCode15 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.liquidAmount;
        int iHashCode17 = (iHashCode16 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.liquidPrice;
        int iHashCode18 = (iHashCode17 + (bigDecimal10 == null ? 0 : bigDecimal10.hashCode())) * 31;
        BigDecimal bigDecimal11 = this.leverage;
        int iHashCode19 = (iHashCode18 + (bigDecimal11 == null ? 0 : bigDecimal11.hashCode())) * 31;
        String str7 = this.side;
        int iHashCode20 = (iHashCode19 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.closeType;
        int iHashCode21 = (iHashCode20 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l12 = this.openTime;
        int iHashCode22 = (iHashCode21 + (l12 == null ? 0 : l12.hashCode())) * 31;
        MultiBizType multiBizType = this.multiBizType;
        return iHashCode22 + (multiBizType != null ? multiBizType.hashCode() : 0);
    }

    public final boolean isBuy() {
        return Intrinsics.areEqual(this.side, SharedPositionInfo.SIDE_LONG);
    }

    public final boolean isTrialFunds() {
        return this.isTrialFunds;
    }

    public final void setMultiBizType(@Nullable MultiBizType multiBizType) {
        this.multiBizType = multiBizType;
    }

    @NotNull
    public String toString() {
        return "ProfitRecordEntity(id=" + this.id + ", symbol=" + this.symbol + ", currency=" + this.currency + ", offset=" + this.offset + ", type=" + this.type + ", closeDate=" + this.closeDate + ", realisedPnl=" + this.realisedPnl + ", dealComm=" + this.dealComm + ", fundingFee=" + this.fundingFee + ", realisedGrossCost=" + this.realisedGrossCost + ", realisedGrossCostNew=" + this.realisedGrossCostNew + ", withdrawPnl=" + this.withdrawPnl + ", isTrialFunds=" + this.isTrialFunds + ", prizeType=" + this.prizeType + ", marginMode=" + this.marginMode + ", tax=" + this.tax + ", roe=" + this.roe + ", liquidAmount=" + this.liquidAmount + ", liquidPrice=" + this.liquidPrice + ", leverage=" + this.leverage + ", side=" + this.side + ", closeType=" + this.closeType + ", openTime=" + this.openTime + ", multiBizType=" + this.multiBizType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.symbol);
        dest.writeString(this.currency);
        Integer num = this.offset;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.type);
        Long l11 = this.closeDate;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.realisedPnl);
        dest.writeSerializable(this.dealComm);
        dest.writeSerializable(this.fundingFee);
        dest.writeSerializable(this.realisedGrossCost);
        dest.writeSerializable(this.realisedGrossCostNew);
        dest.writeSerializable(this.withdrawPnl);
        dest.writeInt(this.isTrialFunds ? 1 : 0);
        dest.writeString(this.prizeType);
        dest.writeString(this.marginMode);
        dest.writeSerializable(this.tax);
        dest.writeSerializable(this.roe);
        dest.writeSerializable(this.liquidAmount);
        dest.writeSerializable(this.liquidPrice);
        dest.writeSerializable(this.leverage);
        dest.writeString(this.side);
        dest.writeString(this.closeType);
        Long l12 = this.openTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        MultiBizType multiBizType = this.multiBizType;
        if (multiBizType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(multiBizType.name());
        }
    }

    public /* synthetic */ ProfitRecordEntity(String str, String str2, String str3, Integer num, String str4, Long l11, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, boolean z11, String str5, String str6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, BigDecimal bigDecimal11, String str7, String str8, Long l12, MultiBizType multiBizType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, num, str4, l11, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, (i11 & 1024) != 0 ? null : bigDecimal5, bigDecimal6, (i11 & 4096) != 0 ? false : z11, (i11 & 8192) != 0 ? null : str5, str6, (32768 & i11) != 0 ? null : bigDecimal7, (65536 & i11) != 0 ? null : bigDecimal8, (131072 & i11) != 0 ? null : bigDecimal9, (262144 & i11) != 0 ? null : bigDecimal10, (524288 & i11) != 0 ? null : bigDecimal11, (1048576 & i11) != 0 ? null : str7, (2097152 & i11) != 0 ? null : str8, l12, (i11 & 8388608) != 0 ? null : multiBizType);
    }

    @Deprecated(message = "新数据用new字段")
    public static /* synthetic */ void getRealisedGrossCost$annotations() {
    }

    @Deprecated(message = "老数据字段")
    public static /* synthetic */ void getType$annotations() {
    }
}
