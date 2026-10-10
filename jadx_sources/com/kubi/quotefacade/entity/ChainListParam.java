package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChainFilterData.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\bR\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010MJ\u0010\u0010h\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010MJ\u0096\u0002\u0010i\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0002\u0010jJ\u0006\u0010k\u001a\u00020\u001aJ\u0013\u0010l\u001a\u00020m2\b\u0010n\u001a\u0004\u0018\u00010oHÖ\u0003J\t\u0010p\u001a\u00020\u001aHÖ\u0001J\t\u0010q\u001a\u00020\u0003HÖ\u0001J\u0016\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020\u001aR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u0010!R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010!R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u0010!R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001f\"\u0004\bC\u0010!R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010P\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010P\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010O¨\u0006w"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChainListParam;", "Landroid/os/Parcelable;", "maxPriceChange24h", "", "minPriceChange24h", "maxTxCount24h", "minTxCount24h", "maxMakers24h", "minMakers24h", "maxHolders", "minHolders", "maxVolume24h", "minVolume24h", "maxTvl", "minTvl", "maxFdv", "minFdv", "maxMarketCap", "minMarketCap", "orderByRange", "menuCode", "sortSets", "Lcom/kubi/quotefacade/entity/SortSets;", "riskInfo", "Lcom/kubi/quotefacade/entity/RiskInfo;", "pageSize", "", "currentPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/quotefacade/entity/SortSets;Lcom/kubi/quotefacade/entity/RiskInfo;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMaxPriceChange24h", "()Ljava/lang/String;", "setMaxPriceChange24h", "(Ljava/lang/String;)V", "getMinPriceChange24h", "setMinPriceChange24h", "getMaxTxCount24h", "setMaxTxCount24h", "getMinTxCount24h", "setMinTxCount24h", "getMaxMakers24h", "setMaxMakers24h", "getMinMakers24h", "setMinMakers24h", "getMaxHolders", "setMaxHolders", "getMinHolders", "setMinHolders", "getMaxVolume24h", "setMaxVolume24h", "getMinVolume24h", "setMinVolume24h", "getMaxTvl", "setMaxTvl", "getMinTvl", "setMinTvl", "getMaxFdv", "setMaxFdv", "getMinFdv", "setMinFdv", "getMaxMarketCap", "setMaxMarketCap", "getMinMarketCap", "setMinMarketCap", "getOrderByRange", "setOrderByRange", "getMenuCode", "setMenuCode", "getSortSets", "()Lcom/kubi/quotefacade/entity/SortSets;", "setSortSets", "(Lcom/kubi/quotefacade/entity/SortSets;)V", "getRiskInfo", "()Lcom/kubi/quotefacade/entity/RiskInfo;", "setRiskInfo", "(Lcom/kubi/quotefacade/entity/RiskInfo;)V", "getPageSize", "()Ljava/lang/Integer;", "setPageSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCurrentPage", "setCurrentPage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/quotefacade/entity/SortSets;Lcom/kubi/quotefacade/entity/RiskInfo;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/quotefacade/entity/ChainListParam;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChainListParam implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChainListParam> CREATOR = new C21878a();

    @Nullable
    private Integer currentPage;

    @Nullable
    private String maxFdv;

    @Nullable
    private String maxHolders;

    @Nullable
    private String maxMakers24h;

    @Nullable
    private String maxMarketCap;

    @Nullable
    private String maxPriceChange24h;

    @Nullable
    private String maxTvl;

    @Nullable
    private String maxTxCount24h;

    @Nullable
    private String maxVolume24h;

    @Nullable
    private String menuCode;

    @Nullable
    private String minFdv;

    @Nullable
    private String minHolders;

    @Nullable
    private String minMakers24h;

    @Nullable
    private String minMarketCap;

    @Nullable
    private String minPriceChange24h;

    @Nullable
    private String minTvl;

    @Nullable
    private String minTxCount24h;

    @Nullable
    private String minVolume24h;

    @Nullable
    private String orderByRange;

    @Nullable
    private Integer pageSize;

    @Nullable
    private RiskInfo riskInfo;

    @Nullable
    private SortSets sortSets;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.ChainListParam$a */
    /* JADX INFO: compiled from: ChainFilterData.kt */
    /* JADX INFO: loaded from: classes37.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21878a implements Parcelable.Creator<ChainListParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChainListParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChainListParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SortSets.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RiskInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChainListParam[] newArray(int i11) {
            return new ChainListParam[i11];
        }
    }

    public ChainListParam() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    public static /* synthetic */ ChainListParam copy$default(ChainListParam chainListParam, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, SortSets sortSets, RiskInfo riskInfo, Integer num, Integer num2, int i11, Object obj) {
        Integer num3;
        Integer num4;
        String str19 = (i11 & 1) != 0 ? chainListParam.maxPriceChange24h : str;
        String str20 = (i11 & 2) != 0 ? chainListParam.minPriceChange24h : str2;
        String str21 = (i11 & 4) != 0 ? chainListParam.maxTxCount24h : str3;
        String str22 = (i11 & 8) != 0 ? chainListParam.minTxCount24h : str4;
        String str23 = (i11 & 16) != 0 ? chainListParam.maxMakers24h : str5;
        String str24 = (i11 & 32) != 0 ? chainListParam.minMakers24h : str6;
        String str25 = (i11 & 64) != 0 ? chainListParam.maxHolders : str7;
        String str26 = (i11 & 128) != 0 ? chainListParam.minHolders : str8;
        String str27 = (i11 & 256) != 0 ? chainListParam.maxVolume24h : str9;
        String str28 = (i11 & 512) != 0 ? chainListParam.minVolume24h : str10;
        String str29 = (i11 & 1024) != 0 ? chainListParam.maxTvl : str11;
        String str30 = (i11 & 2048) != 0 ? chainListParam.minTvl : str12;
        String str31 = (i11 & 4096) != 0 ? chainListParam.maxFdv : str13;
        String str32 = (i11 & 8192) != 0 ? chainListParam.minFdv : str14;
        String str33 = str19;
        String str34 = (i11 & 16384) != 0 ? chainListParam.maxMarketCap : str15;
        String str35 = (i11 & 32768) != 0 ? chainListParam.minMarketCap : str16;
        String str36 = (i11 & 65536) != 0 ? chainListParam.orderByRange : str17;
        String str37 = (i11 & 131072) != 0 ? chainListParam.menuCode : str18;
        SortSets sortSets2 = (i11 & 262144) != 0 ? chainListParam.sortSets : sortSets;
        RiskInfo riskInfo2 = (i11 & 524288) != 0 ? chainListParam.riskInfo : riskInfo;
        Integer num5 = (i11 & 1048576) != 0 ? chainListParam.pageSize : num;
        if ((i11 & 2097152) != 0) {
            num4 = num5;
            num3 = chainListParam.currentPage;
        } else {
            num3 = num2;
            num4 = num5;
        }
        return chainListParam.copy(str33, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str34, str35, str36, str37, sortSets2, riskInfo2, num4, num3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChainListParam)) {
            return false;
        }
        ChainListParam chainListParam = (ChainListParam) other;
        return Intrinsics.areEqual(this.maxPriceChange24h, chainListParam.maxPriceChange24h) && Intrinsics.areEqual(this.minPriceChange24h, chainListParam.minPriceChange24h) && Intrinsics.areEqual(this.maxTxCount24h, chainListParam.maxTxCount24h) && Intrinsics.areEqual(this.minTxCount24h, chainListParam.minTxCount24h) && Intrinsics.areEqual(this.maxMakers24h, chainListParam.maxMakers24h) && Intrinsics.areEqual(this.minMakers24h, chainListParam.minMakers24h) && Intrinsics.areEqual(this.maxHolders, chainListParam.maxHolders) && Intrinsics.areEqual(this.minHolders, chainListParam.minHolders) && Intrinsics.areEqual(this.maxVolume24h, chainListParam.maxVolume24h) && Intrinsics.areEqual(this.minVolume24h, chainListParam.minVolume24h) && Intrinsics.areEqual(this.maxTvl, chainListParam.maxTvl) && Intrinsics.areEqual(this.minTvl, chainListParam.minTvl) && Intrinsics.areEqual(this.maxFdv, chainListParam.maxFdv) && Intrinsics.areEqual(this.minFdv, chainListParam.minFdv) && Intrinsics.areEqual(this.maxMarketCap, chainListParam.maxMarketCap) && Intrinsics.areEqual(this.minMarketCap, chainListParam.minMarketCap) && Intrinsics.areEqual(this.orderByRange, chainListParam.orderByRange) && Intrinsics.areEqual(this.menuCode, chainListParam.menuCode) && Intrinsics.areEqual(this.sortSets, chainListParam.sortSets) && Intrinsics.areEqual(this.riskInfo, chainListParam.riskInfo) && Intrinsics.areEqual(this.pageSize, chainListParam.pageSize) && Intrinsics.areEqual(this.currentPage, chainListParam.currentPage);
    }

    public ChainListParam(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable SortSets sortSets, @Nullable RiskInfo riskInfo, @Nullable Integer num, @Nullable Integer num2) {
        this.maxPriceChange24h = str;
        this.minPriceChange24h = str2;
        this.maxTxCount24h = str3;
        this.minTxCount24h = str4;
        this.maxMakers24h = str5;
        this.minMakers24h = str6;
        this.maxHolders = str7;
        this.minHolders = str8;
        this.maxVolume24h = str9;
        this.minVolume24h = str10;
        this.maxTvl = str11;
        this.minTvl = str12;
        this.maxFdv = str13;
        this.minFdv = str14;
        this.maxMarketCap = str15;
        this.minMarketCap = str16;
        this.orderByRange = str17;
        this.menuCode = str18;
        this.sortSets = sortSets;
        this.riskInfo = riskInfo;
        this.pageSize = num;
        this.currentPage = num2;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMaxPriceChange24h() {
        return this.maxPriceChange24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMinVolume24h() {
        return this.minVolume24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMaxTvl() {
        return this.maxTvl;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMinTvl() {
        return this.minTvl;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getMaxFdv() {
        return this.maxFdv;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getMinFdv() {
        return this.minFdv;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMaxMarketCap() {
        return this.maxMarketCap;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMinMarketCap() {
        return this.minMarketCap;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getOrderByRange() {
        return this.orderByRange;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getMenuCode() {
        return this.menuCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final SortSets getSortSets() {
        return this.sortSets;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMinPriceChange24h() {
        return this.minPriceChange24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final RiskInfo getRiskInfo() {
        return this.riskInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMaxTxCount24h() {
        return this.maxTxCount24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMinTxCount24h() {
        return this.minTxCount24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMaxMakers24h() {
        return this.maxMakers24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMinMakers24h() {
        return this.minMakers24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMaxHolders() {
        return this.maxHolders;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMinHolders() {
        return this.minHolders;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMaxVolume24h() {
        return this.maxVolume24h;
    }

    @NotNull
    public final ChainListParam copy(@Nullable String maxPriceChange24h, @Nullable String minPriceChange24h, @Nullable String maxTxCount24h, @Nullable String minTxCount24h, @Nullable String maxMakers24h, @Nullable String minMakers24h, @Nullable String maxHolders, @Nullable String minHolders, @Nullable String maxVolume24h, @Nullable String minVolume24h, @Nullable String maxTvl, @Nullable String minTvl, @Nullable String maxFdv, @Nullable String minFdv, @Nullable String maxMarketCap, @Nullable String minMarketCap, @Nullable String orderByRange, @Nullable String menuCode, @Nullable SortSets sortSets, @Nullable RiskInfo riskInfo, @Nullable Integer pageSize, @Nullable Integer currentPage) {
        return new ChainListParam(maxPriceChange24h, minPriceChange24h, maxTxCount24h, minTxCount24h, maxMakers24h, minMakers24h, maxHolders, minHolders, maxVolume24h, minVolume24h, maxTvl, minTvl, maxFdv, minFdv, maxMarketCap, minMarketCap, orderByRange, menuCode, sortSets, riskInfo, pageSize, currentPage);
    }

    @Nullable
    public final Integer getCurrentPage() {
        return this.currentPage;
    }

    @Nullable
    public final String getMaxFdv() {
        return this.maxFdv;
    }

    @Nullable
    public final String getMaxHolders() {
        return this.maxHolders;
    }

    @Nullable
    public final String getMaxMakers24h() {
        return this.maxMakers24h;
    }

    @Nullable
    public final String getMaxMarketCap() {
        return this.maxMarketCap;
    }

    @Nullable
    public final String getMaxPriceChange24h() {
        return this.maxPriceChange24h;
    }

    @Nullable
    public final String getMaxTvl() {
        return this.maxTvl;
    }

    @Nullable
    public final String getMaxTxCount24h() {
        return this.maxTxCount24h;
    }

    @Nullable
    public final String getMaxVolume24h() {
        return this.maxVolume24h;
    }

    @Nullable
    public final String getMenuCode() {
        return this.menuCode;
    }

    @Nullable
    public final String getMinFdv() {
        return this.minFdv;
    }

    @Nullable
    public final String getMinHolders() {
        return this.minHolders;
    }

    @Nullable
    public final String getMinMakers24h() {
        return this.minMakers24h;
    }

    @Nullable
    public final String getMinMarketCap() {
        return this.minMarketCap;
    }

    @Nullable
    public final String getMinPriceChange24h() {
        return this.minPriceChange24h;
    }

    @Nullable
    public final String getMinTvl() {
        return this.minTvl;
    }

    @Nullable
    public final String getMinTxCount24h() {
        return this.minTxCount24h;
    }

    @Nullable
    public final String getMinVolume24h() {
        return this.minVolume24h;
    }

    @Nullable
    public final String getOrderByRange() {
        return this.orderByRange;
    }

    @Nullable
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final RiskInfo getRiskInfo() {
        return this.riskInfo;
    }

    @Nullable
    public final SortSets getSortSets() {
        return this.sortSets;
    }

    public int hashCode() {
        String str = this.maxPriceChange24h;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.minPriceChange24h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.maxTxCount24h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.minTxCount24h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.maxMakers24h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.minMakers24h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.maxHolders;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.minHolders;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.maxVolume24h;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.minVolume24h;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.maxTvl;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.minTvl;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.maxFdv;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.minFdv;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.maxMarketCap;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.minMarketCap;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.orderByRange;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.menuCode;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        SortSets sortSets = this.sortSets;
        int iHashCode19 = (iHashCode18 + (sortSets == null ? 0 : sortSets.hashCode())) * 31;
        RiskInfo riskInfo = this.riskInfo;
        int iHashCode20 = (iHashCode19 + (riskInfo == null ? 0 : riskInfo.hashCode())) * 31;
        Integer num = this.pageSize;
        int iHashCode21 = (iHashCode20 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.currentPage;
        return iHashCode21 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setCurrentPage(@Nullable Integer num) {
        this.currentPage = num;
    }

    public final void setMaxFdv(@Nullable String str) {
        this.maxFdv = str;
    }

    public final void setMaxHolders(@Nullable String str) {
        this.maxHolders = str;
    }

    public final void setMaxMakers24h(@Nullable String str) {
        this.maxMakers24h = str;
    }

    public final void setMaxMarketCap(@Nullable String str) {
        this.maxMarketCap = str;
    }

    public final void setMaxPriceChange24h(@Nullable String str) {
        this.maxPriceChange24h = str;
    }

    public final void setMaxTvl(@Nullable String str) {
        this.maxTvl = str;
    }

    public final void setMaxTxCount24h(@Nullable String str) {
        this.maxTxCount24h = str;
    }

    public final void setMaxVolume24h(@Nullable String str) {
        this.maxVolume24h = str;
    }

    public final void setMenuCode(@Nullable String str) {
        this.menuCode = str;
    }

    public final void setMinFdv(@Nullable String str) {
        this.minFdv = str;
    }

    public final void setMinHolders(@Nullable String str) {
        this.minHolders = str;
    }

    public final void setMinMakers24h(@Nullable String str) {
        this.minMakers24h = str;
    }

    public final void setMinMarketCap(@Nullable String str) {
        this.minMarketCap = str;
    }

    public final void setMinPriceChange24h(@Nullable String str) {
        this.minPriceChange24h = str;
    }

    public final void setMinTvl(@Nullable String str) {
        this.minTvl = str;
    }

    public final void setMinTxCount24h(@Nullable String str) {
        this.minTxCount24h = str;
    }

    public final void setMinVolume24h(@Nullable String str) {
        this.minVolume24h = str;
    }

    public final void setOrderByRange(@Nullable String str) {
        this.orderByRange = str;
    }

    public final void setPageSize(@Nullable Integer num) {
        this.pageSize = num;
    }

    public final void setRiskInfo(@Nullable RiskInfo riskInfo) {
        this.riskInfo = riskInfo;
    }

    public final void setSortSets(@Nullable SortSets sortSets) {
        this.sortSets = sortSets;
    }

    @NotNull
    public String toString() {
        return "ChainListParam(maxPriceChange24h=" + this.maxPriceChange24h + ", minPriceChange24h=" + this.minPriceChange24h + ", maxTxCount24h=" + this.maxTxCount24h + ", minTxCount24h=" + this.minTxCount24h + ", maxMakers24h=" + this.maxMakers24h + ", minMakers24h=" + this.minMakers24h + ", maxHolders=" + this.maxHolders + ", minHolders=" + this.minHolders + ", maxVolume24h=" + this.maxVolume24h + ", minVolume24h=" + this.minVolume24h + ", maxTvl=" + this.maxTvl + ", minTvl=" + this.minTvl + ", maxFdv=" + this.maxFdv + ", minFdv=" + this.minFdv + ", maxMarketCap=" + this.maxMarketCap + ", minMarketCap=" + this.minMarketCap + ", orderByRange=" + this.orderByRange + ", menuCode=" + this.menuCode + ", sortSets=" + this.sortSets + ", riskInfo=" + this.riskInfo + ", pageSize=" + this.pageSize + ", currentPage=" + this.currentPage + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.maxPriceChange24h);
        dest.writeString(this.minPriceChange24h);
        dest.writeString(this.maxTxCount24h);
        dest.writeString(this.minTxCount24h);
        dest.writeString(this.maxMakers24h);
        dest.writeString(this.minMakers24h);
        dest.writeString(this.maxHolders);
        dest.writeString(this.minHolders);
        dest.writeString(this.maxVolume24h);
        dest.writeString(this.minVolume24h);
        dest.writeString(this.maxTvl);
        dest.writeString(this.minTvl);
        dest.writeString(this.maxFdv);
        dest.writeString(this.minFdv);
        dest.writeString(this.maxMarketCap);
        dest.writeString(this.minMarketCap);
        dest.writeString(this.orderByRange);
        dest.writeString(this.menuCode);
        SortSets sortSets = this.sortSets;
        if (sortSets == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            sortSets.writeToParcel(dest, flags);
        }
        RiskInfo riskInfo = this.riskInfo;
        if (riskInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            riskInfo.writeToParcel(dest, flags);
        }
        Integer num = this.pageSize;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.currentPage;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
    }

    public /* synthetic */ ChainListParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, SortSets sortSets, RiskInfo riskInfo, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & 2048) != 0 ? null : str12, (i11 & 4096) != 0 ? null : str13, (i11 & 8192) != 0 ? null : str14, (i11 & 16384) != 0 ? null : str15, (i11 & 32768) != 0 ? null : str16, (i11 & 65536) != 0 ? null : str17, (i11 & 131072) != 0 ? null : str18, (i11 & 262144) != 0 ? null : sortSets, (i11 & 524288) != 0 ? null : riskInfo, (i11 & 1048576) != 0 ? null : num, (i11 & 2097152) != 0 ? null : num2);
    }
}
