package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EtfEntity.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bK\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b%\u0010&J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00101J\u0010\u0010Q\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00101J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00101J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010_\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jü\u0002\u0010f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010gJ\u0006\u0010h\u001a\u00020\rJ\u0013\u0010i\u001a\u00020j2\b\u0010k\u001a\u0004\u0018\u00010lHÖ\u0003J\t\u0010m\u001a\u00020\rHÖ\u0001J\t\u0010n\u001a\u00020\u0003HÖ\u0001J\u0016\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00102\u001a\u0004\b\f\u00101R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00102\u001a\u0004\b\u000e\u00101R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010*R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u00102\u001a\u0004\b;\u00101R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010(R\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010(R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010(R\u0013\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bD\u0010*R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010(R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010(R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010(¨\u0006t"}, m90084d2 = {"Lcom/kubi/data/entity/EtfCoinEntity;", "Landroid/os/Parcelable;", "baseCurrency", "", "baseDailySize", "Ljava/math/BigDecimal;", "baseFeeCurrency", "baseFeeRate", "baseMaxSize", "baseMinSize", "code", "desc", "isRedemptionEnabled", "", "isSubscribeEnabled", "name", "quoteCurrency", "originalCurrency", "quoteDailySize", "quoteFeeCurrency", "quoteFeeRate", "quoteMaxSize", "quoteMinSize", "status", "multiple", "leverage", "buyType", "assertManagement", "assets", "", "Lcom/kubi/data/entity/EtfAssets;", "currentCirculation", "initNetAssetValue", "dailyManageFee", "rebalanceByTime", "rebalanceByReChangeRate", "payManagementFeeTime", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBaseCurrency", "()Ljava/lang/String;", "getBaseDailySize", "()Ljava/math/BigDecimal;", "getBaseFeeCurrency", "getBaseFeeRate", "getBaseMaxSize", "getBaseMinSize", "getCode", "getDesc", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getQuoteCurrency", "getOriginalCurrency", "getQuoteDailySize", "getQuoteFeeCurrency", "getQuoteFeeRate", "getQuoteMaxSize", "getQuoteMinSize", "getStatus", "getMultiple", "getLeverage", "getBuyType", "getAssertManagement", "getAssets", "()Ljava/util/List;", "getCurrentCirculation", "getInitNetAssetValue", "getDailyManageFee", "getRebalanceByTime", "getRebalanceByReChangeRate", "getPayManagementFeeTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/data/entity/EtfCoinEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EtfCoinEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EtfCoinEntity> CREATOR = new Creator();

    @Nullable
    private final String assertManagement;

    @Nullable
    private final List<EtfAssets> assets;

    @Nullable
    private final String baseCurrency;

    @Nullable
    private final BigDecimal baseDailySize;

    @Nullable
    private final String baseFeeCurrency;

    @Nullable
    private final BigDecimal baseFeeRate;

    @Nullable
    private final BigDecimal baseMaxSize;

    @Nullable
    private final BigDecimal baseMinSize;

    @Nullable
    private final String buyType;

    @Nullable
    private final String code;

    @Nullable
    private final String currentCirculation;

    @Nullable
    private final BigDecimal dailyManageFee;

    @Nullable
    private final String desc;

    @Nullable
    private final String initNetAssetValue;

    @Nullable
    private final Integer isRedemptionEnabled;

    @Nullable
    private final Integer isSubscribeEnabled;

    @Nullable
    private final String leverage;

    @Nullable
    private final String multiple;

    @Nullable
    private final String name;

    @Nullable
    private final String originalCurrency;

    @Nullable
    private final String payManagementFeeTime;

    @Nullable
    private final String quoteCurrency;

    @Nullable
    private final BigDecimal quoteDailySize;

    @Nullable
    private final String quoteFeeCurrency;

    @Nullable
    private final BigDecimal quoteFeeRate;

    @Nullable
    private final BigDecimal quoteMaxSize;

    @Nullable
    private final BigDecimal quoteMinSize;

    @Nullable
    private final String rebalanceByReChangeRate;

    @Nullable
    private final String rebalanceByTime;

    @Nullable
    private final Integer status;

    /* JADX INFO: compiled from: EtfEntity.kt */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<EtfCoinEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EtfCoinEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String string2 = parcel.readString();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            String string8 = parcel.readString();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                int i12 = 0;
                while (i12 != i11) {
                    arrayList.add(EtfAssets.CREATOR.createFromParcel(parcel));
                    i12++;
                    i11 = i11;
                }
                string = string;
            }
            return new EtfCoinEntity(string, bigDecimal, string2, bigDecimal2, bigDecimal3, bigDecimal4, string3, string4, numValueOf, numValueOf2, string5, string6, string7, bigDecimal5, string8, bigDecimal6, bigDecimal7, bigDecimal8, numValueOf3, string9, string10, string11, string12, arrayList, parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EtfCoinEntity[] newArray(int i11) {
            return new EtfCoinEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EtfCoinEntity copy$default(EtfCoinEntity etfCoinEntity, String str, BigDecimal bigDecimal, String str2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str3, String str4, Integer num, Integer num2, String str5, String str6, String str7, BigDecimal bigDecimal5, String str8, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, Integer num3, String str9, String str10, String str11, String str12, List list, String str13, String str14, BigDecimal bigDecimal9, String str15, String str16, String str17, int i11, Object obj) {
        String str18;
        String str19;
        String str20 = (i11 & 1) != 0 ? etfCoinEntity.baseCurrency : str;
        BigDecimal bigDecimal10 = (i11 & 2) != 0 ? etfCoinEntity.baseDailySize : bigDecimal;
        String str21 = (i11 & 4) != 0 ? etfCoinEntity.baseFeeCurrency : str2;
        BigDecimal bigDecimal11 = (i11 & 8) != 0 ? etfCoinEntity.baseFeeRate : bigDecimal2;
        BigDecimal bigDecimal12 = (i11 & 16) != 0 ? etfCoinEntity.baseMaxSize : bigDecimal3;
        BigDecimal bigDecimal13 = (i11 & 32) != 0 ? etfCoinEntity.baseMinSize : bigDecimal4;
        String str22 = (i11 & 64) != 0 ? etfCoinEntity.code : str3;
        String str23 = (i11 & 128) != 0 ? etfCoinEntity.desc : str4;
        Integer num4 = (i11 & 256) != 0 ? etfCoinEntity.isRedemptionEnabled : num;
        Integer num5 = (i11 & 512) != 0 ? etfCoinEntity.isSubscribeEnabled : num2;
        String str24 = (i11 & 1024) != 0 ? etfCoinEntity.name : str5;
        String str25 = (i11 & 2048) != 0 ? etfCoinEntity.quoteCurrency : str6;
        String str26 = (i11 & 4096) != 0 ? etfCoinEntity.originalCurrency : str7;
        BigDecimal bigDecimal14 = (i11 & 8192) != 0 ? etfCoinEntity.quoteDailySize : bigDecimal5;
        String str27 = str20;
        String str28 = (i11 & 16384) != 0 ? etfCoinEntity.quoteFeeCurrency : str8;
        BigDecimal bigDecimal15 = (i11 & 32768) != 0 ? etfCoinEntity.quoteFeeRate : bigDecimal6;
        BigDecimal bigDecimal16 = (i11 & 65536) != 0 ? etfCoinEntity.quoteMaxSize : bigDecimal7;
        BigDecimal bigDecimal17 = (i11 & 131072) != 0 ? etfCoinEntity.quoteMinSize : bigDecimal8;
        Integer num6 = (i11 & 262144) != 0 ? etfCoinEntity.status : num3;
        String str29 = (i11 & 524288) != 0 ? etfCoinEntity.multiple : str9;
        String str30 = (i11 & 1048576) != 0 ? etfCoinEntity.leverage : str10;
        String str31 = (i11 & 2097152) != 0 ? etfCoinEntity.buyType : str11;
        String str32 = (i11 & 4194304) != 0 ? etfCoinEntity.assertManagement : str12;
        List list2 = (i11 & 8388608) != 0 ? etfCoinEntity.assets : list;
        String str33 = (i11 & 16777216) != 0 ? etfCoinEntity.currentCirculation : str13;
        String str34 = (i11 & 33554432) != 0 ? etfCoinEntity.initNetAssetValue : str14;
        BigDecimal bigDecimal18 = (i11 & 67108864) != 0 ? etfCoinEntity.dailyManageFee : bigDecimal9;
        String str35 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? etfCoinEntity.rebalanceByTime : str15;
        String str36 = (i11 & 268435456) != 0 ? etfCoinEntity.rebalanceByReChangeRate : str16;
        if ((i11 & C2711C.BUFFER_FLAG_LAST_SAMPLE) != 0) {
            str19 = str36;
            str18 = etfCoinEntity.payManagementFeeTime;
        } else {
            str18 = str17;
            str19 = str36;
        }
        return etfCoinEntity.copy(str27, bigDecimal10, str21, bigDecimal11, bigDecimal12, bigDecimal13, str22, str23, num4, num5, str24, str25, str26, bigDecimal14, str28, bigDecimal15, bigDecimal16, bigDecimal17, num6, str29, str30, str31, str32, list2, str33, str34, bigDecimal18, str35, str19, str18);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EtfCoinEntity)) {
            return false;
        }
        EtfCoinEntity etfCoinEntity = (EtfCoinEntity) other;
        return Intrinsics.areEqual(this.baseCurrency, etfCoinEntity.baseCurrency) && Intrinsics.areEqual(this.baseDailySize, etfCoinEntity.baseDailySize) && Intrinsics.areEqual(this.baseFeeCurrency, etfCoinEntity.baseFeeCurrency) && Intrinsics.areEqual(this.baseFeeRate, etfCoinEntity.baseFeeRate) && Intrinsics.areEqual(this.baseMaxSize, etfCoinEntity.baseMaxSize) && Intrinsics.areEqual(this.baseMinSize, etfCoinEntity.baseMinSize) && Intrinsics.areEqual(this.code, etfCoinEntity.code) && Intrinsics.areEqual(this.desc, etfCoinEntity.desc) && Intrinsics.areEqual(this.isRedemptionEnabled, etfCoinEntity.isRedemptionEnabled) && Intrinsics.areEqual(this.isSubscribeEnabled, etfCoinEntity.isSubscribeEnabled) && Intrinsics.areEqual(this.name, etfCoinEntity.name) && Intrinsics.areEqual(this.quoteCurrency, etfCoinEntity.quoteCurrency) && Intrinsics.areEqual(this.originalCurrency, etfCoinEntity.originalCurrency) && Intrinsics.areEqual(this.quoteDailySize, etfCoinEntity.quoteDailySize) && Intrinsics.areEqual(this.quoteFeeCurrency, etfCoinEntity.quoteFeeCurrency) && Intrinsics.areEqual(this.quoteFeeRate, etfCoinEntity.quoteFeeRate) && Intrinsics.areEqual(this.quoteMaxSize, etfCoinEntity.quoteMaxSize) && Intrinsics.areEqual(this.quoteMinSize, etfCoinEntity.quoteMinSize) && Intrinsics.areEqual(this.status, etfCoinEntity.status) && Intrinsics.areEqual(this.multiple, etfCoinEntity.multiple) && Intrinsics.areEqual(this.leverage, etfCoinEntity.leverage) && Intrinsics.areEqual(this.buyType, etfCoinEntity.buyType) && Intrinsics.areEqual(this.assertManagement, etfCoinEntity.assertManagement) && Intrinsics.areEqual(this.assets, etfCoinEntity.assets) && Intrinsics.areEqual(this.currentCirculation, etfCoinEntity.currentCirculation) && Intrinsics.areEqual(this.initNetAssetValue, etfCoinEntity.initNetAssetValue) && Intrinsics.areEqual(this.dailyManageFee, etfCoinEntity.dailyManageFee) && Intrinsics.areEqual(this.rebalanceByTime, etfCoinEntity.rebalanceByTime) && Intrinsics.areEqual(this.rebalanceByReChangeRate, etfCoinEntity.rebalanceByReChangeRate) && Intrinsics.areEqual(this.payManagementFeeTime, etfCoinEntity.payManagementFeeTime);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getIsSubscribeEnabled() {
        return this.isSubscribeEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getOriginalCurrency() {
        return this.originalCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getQuoteDailySize() {
        return this.quoteDailySize;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getQuoteFeeCurrency() {
        return this.quoteFeeCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getQuoteFeeRate() {
        return this.quoteFeeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getQuoteMaxSize() {
        return this.quoteMaxSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final BigDecimal getQuoteMinSize() {
        return this.quoteMinSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getBaseDailySize() {
        return this.baseDailySize;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getMultiple() {
        return this.multiple;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getBuyType() {
        return this.buyType;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getAssertManagement() {
        return this.assertManagement;
    }

    @Nullable
    public final List<EtfAssets> component24() {
        return this.assets;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getCurrentCirculation() {
        return this.currentCirculation;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getInitNetAssetValue() {
        return this.initNetAssetValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final BigDecimal getDailyManageFee() {
        return this.dailyManageFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getRebalanceByTime() {
        return this.rebalanceByTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getRebalanceByReChangeRate() {
        return this.rebalanceByReChangeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBaseFeeCurrency() {
        return this.baseFeeCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getPayManagementFeeTime() {
        return this.payManagementFeeTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getBaseFeeRate() {
        return this.baseFeeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getBaseMaxSize() {
        return this.baseMaxSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getBaseMinSize() {
        return this.baseMinSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getIsRedemptionEnabled() {
        return this.isRedemptionEnabled;
    }

    @NotNull
    public final EtfCoinEntity copy(@Nullable String baseCurrency, @Nullable BigDecimal baseDailySize, @Nullable String baseFeeCurrency, @Nullable BigDecimal baseFeeRate, @Nullable BigDecimal baseMaxSize, @Nullable BigDecimal baseMinSize, @Nullable String code, @Nullable String desc, @Nullable Integer isRedemptionEnabled, @Nullable Integer isSubscribeEnabled, @Nullable String name, @Nullable String quoteCurrency, @Nullable String originalCurrency, @Nullable BigDecimal quoteDailySize, @Nullable String quoteFeeCurrency, @Nullable BigDecimal quoteFeeRate, @Nullable BigDecimal quoteMaxSize, @Nullable BigDecimal quoteMinSize, @Nullable Integer status, @Nullable String multiple, @Nullable String leverage, @Nullable String buyType, @Nullable String assertManagement, @Nullable List<EtfAssets> assets, @Nullable String currentCirculation, @Nullable String initNetAssetValue, @Nullable BigDecimal dailyManageFee, @Nullable String rebalanceByTime, @Nullable String rebalanceByReChangeRate, @Nullable String payManagementFeeTime) {
        return new EtfCoinEntity(baseCurrency, baseDailySize, baseFeeCurrency, baseFeeRate, baseMaxSize, baseMinSize, code, desc, isRedemptionEnabled, isSubscribeEnabled, name, quoteCurrency, originalCurrency, quoteDailySize, quoteFeeCurrency, quoteFeeRate, quoteMaxSize, quoteMinSize, status, multiple, leverage, buyType, assertManagement, assets, currentCirculation, initNetAssetValue, dailyManageFee, rebalanceByTime, rebalanceByReChangeRate, payManagementFeeTime);
    }

    @Nullable
    public final String getAssertManagement() {
        return this.assertManagement;
    }

    @Nullable
    public final List<EtfAssets> getAssets() {
        return this.assets;
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final BigDecimal getBaseDailySize() {
        return this.baseDailySize;
    }

    @Nullable
    public final String getBaseFeeCurrency() {
        return this.baseFeeCurrency;
    }

    @Nullable
    public final BigDecimal getBaseFeeRate() {
        return this.baseFeeRate;
    }

    @Nullable
    public final BigDecimal getBaseMaxSize() {
        return this.baseMaxSize;
    }

    @Nullable
    public final BigDecimal getBaseMinSize() {
        return this.baseMinSize;
    }

    @Nullable
    public final String getBuyType() {
        return this.buyType;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getCurrentCirculation() {
        return this.currentCirculation;
    }

    @Nullable
    public final BigDecimal getDailyManageFee() {
        return this.dailyManageFee;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getInitNetAssetValue() {
        return this.initNetAssetValue;
    }

    @Nullable
    public final String getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final String getMultiple() {
        return this.multiple;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOriginalCurrency() {
        return this.originalCurrency;
    }

    @Nullable
    public final String getPayManagementFeeTime() {
        return this.payManagementFeeTime;
    }

    @Nullable
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    public final BigDecimal getQuoteDailySize() {
        return this.quoteDailySize;
    }

    @Nullable
    public final String getQuoteFeeCurrency() {
        return this.quoteFeeCurrency;
    }

    @Nullable
    public final BigDecimal getQuoteFeeRate() {
        return this.quoteFeeRate;
    }

    @Nullable
    public final BigDecimal getQuoteMaxSize() {
        return this.quoteMaxSize;
    }

    @Nullable
    public final BigDecimal getQuoteMinSize() {
        return this.quoteMinSize;
    }

    @Nullable
    public final String getRebalanceByReChangeRate() {
        return this.rebalanceByReChangeRate;
    }

    @Nullable
    public final String getRebalanceByTime() {
        return this.rebalanceByTime;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.baseCurrency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.baseDailySize;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.baseFeeCurrency;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.baseFeeRate;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.baseMaxSize;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.baseMinSize;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str3 = this.code;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.desc;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.isRedemptionEnabled;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.isSubscribeEnabled;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.name;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.quoteCurrency;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.originalCurrency;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.quoteDailySize;
        int iHashCode14 = (iHashCode13 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str8 = this.quoteFeeCurrency;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.quoteFeeRate;
        int iHashCode16 = (iHashCode15 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.quoteMaxSize;
        int iHashCode17 = (iHashCode16 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.quoteMinSize;
        int iHashCode18 = (iHashCode17 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        Integer num3 = this.status;
        int iHashCode19 = (iHashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str9 = this.multiple;
        int iHashCode20 = (iHashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.leverage;
        int iHashCode21 = (iHashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.buyType;
        int iHashCode22 = (iHashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.assertManagement;
        int iHashCode23 = (iHashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List<EtfAssets> list = this.assets;
        int iHashCode24 = (iHashCode23 + (list == null ? 0 : list.hashCode())) * 31;
        String str13 = this.currentCirculation;
        int iHashCode25 = (iHashCode24 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.initNetAssetValue;
        int iHashCode26 = (iHashCode25 + (str14 == null ? 0 : str14.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.dailyManageFee;
        int iHashCode27 = (iHashCode26 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        String str15 = this.rebalanceByTime;
        int iHashCode28 = (iHashCode27 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.rebalanceByReChangeRate;
        int iHashCode29 = (iHashCode28 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.payManagementFeeTime;
        return iHashCode29 + (str17 != null ? str17.hashCode() : 0);
    }

    @Nullable
    public final Integer isRedemptionEnabled() {
        return this.isRedemptionEnabled;
    }

    @Nullable
    public final Integer isSubscribeEnabled() {
        return this.isSubscribeEnabled;
    }

    @NotNull
    public String toString() {
        return "EtfCoinEntity(baseCurrency=" + this.baseCurrency + ", baseDailySize=" + this.baseDailySize + ", baseFeeCurrency=" + this.baseFeeCurrency + ", baseFeeRate=" + this.baseFeeRate + ", baseMaxSize=" + this.baseMaxSize + ", baseMinSize=" + this.baseMinSize + ", code=" + this.code + ", desc=" + this.desc + ", isRedemptionEnabled=" + this.isRedemptionEnabled + ", isSubscribeEnabled=" + this.isSubscribeEnabled + ", name=" + this.name + ", quoteCurrency=" + this.quoteCurrency + ", originalCurrency=" + this.originalCurrency + ", quoteDailySize=" + this.quoteDailySize + ", quoteFeeCurrency=" + this.quoteFeeCurrency + ", quoteFeeRate=" + this.quoteFeeRate + ", quoteMaxSize=" + this.quoteMaxSize + ", quoteMinSize=" + this.quoteMinSize + ", status=" + this.status + ", multiple=" + this.multiple + ", leverage=" + this.leverage + ", buyType=" + this.buyType + ", assertManagement=" + this.assertManagement + ", assets=" + this.assets + ", currentCirculation=" + this.currentCirculation + ", initNetAssetValue=" + this.initNetAssetValue + ", dailyManageFee=" + this.dailyManageFee + ", rebalanceByTime=" + this.rebalanceByTime + ", rebalanceByReChangeRate=" + this.rebalanceByReChangeRate + ", payManagementFeeTime=" + this.payManagementFeeTime + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.baseCurrency);
        dest.writeSerializable(this.baseDailySize);
        dest.writeString(this.baseFeeCurrency);
        dest.writeSerializable(this.baseFeeRate);
        dest.writeSerializable(this.baseMaxSize);
        dest.writeSerializable(this.baseMinSize);
        dest.writeString(this.code);
        dest.writeString(this.desc);
        Integer num = this.isRedemptionEnabled;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.isSubscribeEnabled;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.name);
        dest.writeString(this.quoteCurrency);
        dest.writeString(this.originalCurrency);
        dest.writeSerializable(this.quoteDailySize);
        dest.writeString(this.quoteFeeCurrency);
        dest.writeSerializable(this.quoteFeeRate);
        dest.writeSerializable(this.quoteMaxSize);
        dest.writeSerializable(this.quoteMinSize);
        Integer num3 = this.status;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.multiple);
        dest.writeString(this.leverage);
        dest.writeString(this.buyType);
        dest.writeString(this.assertManagement);
        List<EtfAssets> list = this.assets;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<EtfAssets> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.currentCirculation);
        dest.writeString(this.initNetAssetValue);
        dest.writeSerializable(this.dailyManageFee);
        dest.writeString(this.rebalanceByTime);
        dest.writeString(this.rebalanceByReChangeRate);
        dest.writeString(this.payManagementFeeTime);
    }

    public EtfCoinEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable String str2, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable Integer num2, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable BigDecimal bigDecimal5, @Nullable String str8, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable Integer num3, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable List<EtfAssets> list, @Nullable String str13, @Nullable String str14, @Nullable BigDecimal bigDecimal9, @Nullable String str15, @Nullable String str16, @Nullable String str17) {
        this.baseCurrency = str;
        this.baseDailySize = bigDecimal;
        this.baseFeeCurrency = str2;
        this.baseFeeRate = bigDecimal2;
        this.baseMaxSize = bigDecimal3;
        this.baseMinSize = bigDecimal4;
        this.code = str3;
        this.desc = str4;
        this.isRedemptionEnabled = num;
        this.isSubscribeEnabled = num2;
        this.name = str5;
        this.quoteCurrency = str6;
        this.originalCurrency = str7;
        this.quoteDailySize = bigDecimal5;
        this.quoteFeeCurrency = str8;
        this.quoteFeeRate = bigDecimal6;
        this.quoteMaxSize = bigDecimal7;
        this.quoteMinSize = bigDecimal8;
        this.status = num3;
        this.multiple = str9;
        this.leverage = str10;
        this.buyType = str11;
        this.assertManagement = str12;
        this.assets = list;
        this.currentCirculation = str13;
        this.initNetAssetValue = str14;
        this.dailyManageFee = bigDecimal9;
        this.rebalanceByTime = str15;
        this.rebalanceByReChangeRate = str16;
        this.payManagementFeeTime = str17;
    }
}
