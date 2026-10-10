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
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\bB\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0015HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jë\u0001\u0010V\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010W\u001a\u00020XJ\u0013\u0010Y\u001a\u00020\u00152\b\u0010Z\u001a\u0004\u0018\u00010[HÖ\u0003J\t\u0010\\\u001a\u00020XHÖ\u0001J\t\u0010]\u001a\u00020\u0003HÖ\u0001J\u0016\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020XR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001cR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u0010\u001cR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001a\"\u0004\b:\u0010\u001cR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001a\"\u0004\b<\u0010\u001cR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001a\"\u0004\bB\u0010\u001c¨\u0006c"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/ChainFilterData;", "Landroid/os/Parcelable;", "chainSortType", "", "maxPriceChange24h", "minPriceChange24h", "maxTxCount24h", "minTxCount24h", "maxMakers24h", "minMakers24h", "maxHolders", "minHolders", "maxVolume24h", "minVolume24h", "maxTvl", "minTvl", "maxFdv", "minFdv", "maxMarketCap", "minMarketCap", "ave", "", "orderByRange", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getChainSortType", "()Ljava/lang/String;", "setChainSortType", "(Ljava/lang/String;)V", "getMaxPriceChange24h", "setMaxPriceChange24h", "getMinPriceChange24h", "setMinPriceChange24h", "getMaxTxCount24h", "setMaxTxCount24h", "getMinTxCount24h", "setMinTxCount24h", "getMaxMakers24h", "setMaxMakers24h", "getMinMakers24h", "setMinMakers24h", "getMaxHolders", "setMaxHolders", "getMinHolders", "setMinHolders", "getMaxVolume24h", "setMaxVolume24h", "getMinVolume24h", "setMinVolume24h", "getMaxTvl", "setMaxTvl", "getMinTvl", "setMinTvl", "getMaxFdv", "setMaxFdv", "getMinFdv", "setMinFdv", "getMaxMarketCap", "setMaxMarketCap", "getMinMarketCap", "setMinMarketCap", "getAve", "()Z", "setAve", "(Z)V", "getOrderByRange", "setOrderByRange", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChainFilterData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChainFilterData> CREATOR = new C21875a();
    private boolean ave;

    @Nullable
    private String chainSortType;

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

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.ChainFilterData$a */
    /* JADX INFO: compiled from: ChainFilterData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21875a implements Parcelable.Creator<ChainFilterData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChainFilterData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChainFilterData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChainFilterData[] newArray(int i11) {
            return new ChainFilterData[i11];
        }
    }

    public ChainFilterData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 524287, null);
    }

    public static /* synthetic */ ChainFilterData copy$default(ChainFilterData chainFilterData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z11, String str18, int i11, Object obj) {
        String str19;
        boolean z12;
        String str20 = (i11 & 1) != 0 ? chainFilterData.chainSortType : str;
        String str21 = (i11 & 2) != 0 ? chainFilterData.maxPriceChange24h : str2;
        String str22 = (i11 & 4) != 0 ? chainFilterData.minPriceChange24h : str3;
        String str23 = (i11 & 8) != 0 ? chainFilterData.maxTxCount24h : str4;
        String str24 = (i11 & 16) != 0 ? chainFilterData.minTxCount24h : str5;
        String str25 = (i11 & 32) != 0 ? chainFilterData.maxMakers24h : str6;
        String str26 = (i11 & 64) != 0 ? chainFilterData.minMakers24h : str7;
        String str27 = (i11 & 128) != 0 ? chainFilterData.maxHolders : str8;
        String str28 = (i11 & 256) != 0 ? chainFilterData.minHolders : str9;
        String str29 = (i11 & 512) != 0 ? chainFilterData.maxVolume24h : str10;
        String str30 = (i11 & 1024) != 0 ? chainFilterData.minVolume24h : str11;
        String str31 = (i11 & 2048) != 0 ? chainFilterData.maxTvl : str12;
        String str32 = (i11 & 4096) != 0 ? chainFilterData.minTvl : str13;
        String str33 = (i11 & 8192) != 0 ? chainFilterData.maxFdv : str14;
        String str34 = str20;
        String str35 = (i11 & 16384) != 0 ? chainFilterData.minFdv : str15;
        String str36 = (i11 & 32768) != 0 ? chainFilterData.maxMarketCap : str16;
        String str37 = (i11 & 65536) != 0 ? chainFilterData.minMarketCap : str17;
        boolean z13 = (i11 & 131072) != 0 ? chainFilterData.ave : z11;
        if ((i11 & 262144) != 0) {
            z12 = z13;
            str19 = chainFilterData.orderByRange;
        } else {
            str19 = str18;
            z12 = z13;
        }
        return chainFilterData.copy(str34, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str35, str36, str37, z12, str19);
    }

    @NotNull
    public final ChainFilterData copy(@Nullable String chainSortType, @Nullable String maxPriceChange24h, @Nullable String minPriceChange24h, @Nullable String maxTxCount24h, @Nullable String minTxCount24h, @Nullable String maxMakers24h, @Nullable String minMakers24h, @Nullable String maxHolders, @Nullable String minHolders, @Nullable String maxVolume24h, @Nullable String minVolume24h, @Nullable String maxTvl, @Nullable String minTvl, @Nullable String maxFdv, @Nullable String minFdv, @Nullable String maxMarketCap, @Nullable String minMarketCap, boolean ave, @Nullable String orderByRange) {
        return new ChainFilterData(chainSortType, maxPriceChange24h, minPriceChange24h, maxTxCount24h, minTxCount24h, maxMakers24h, minMakers24h, maxHolders, minHolders, maxVolume24h, minVolume24h, maxTvl, minTvl, maxFdv, minFdv, maxMarketCap, minMarketCap, ave, orderByRange);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChainFilterData)) {
            return false;
        }
        ChainFilterData chainFilterData = (ChainFilterData) other;
        return Intrinsics.areEqual(this.chainSortType, chainFilterData.chainSortType) && Intrinsics.areEqual(this.maxPriceChange24h, chainFilterData.maxPriceChange24h) && Intrinsics.areEqual(this.minPriceChange24h, chainFilterData.minPriceChange24h) && Intrinsics.areEqual(this.maxTxCount24h, chainFilterData.maxTxCount24h) && Intrinsics.areEqual(this.minTxCount24h, chainFilterData.minTxCount24h) && Intrinsics.areEqual(this.maxMakers24h, chainFilterData.maxMakers24h) && Intrinsics.areEqual(this.minMakers24h, chainFilterData.minMakers24h) && Intrinsics.areEqual(this.maxHolders, chainFilterData.maxHolders) && Intrinsics.areEqual(this.minHolders, chainFilterData.minHolders) && Intrinsics.areEqual(this.maxVolume24h, chainFilterData.maxVolume24h) && Intrinsics.areEqual(this.minVolume24h, chainFilterData.minVolume24h) && Intrinsics.areEqual(this.maxTvl, chainFilterData.maxTvl) && Intrinsics.areEqual(this.minTvl, chainFilterData.minTvl) && Intrinsics.areEqual(this.maxFdv, chainFilterData.maxFdv) && Intrinsics.areEqual(this.minFdv, chainFilterData.minFdv) && Intrinsics.areEqual(this.maxMarketCap, chainFilterData.maxMarketCap) && Intrinsics.areEqual(this.minMarketCap, chainFilterData.minMarketCap) && this.ave == chainFilterData.ave && Intrinsics.areEqual(this.orderByRange, chainFilterData.orderByRange);
    }

    public ChainFilterData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, boolean z11, @Nullable String str18) {
        this.chainSortType = str;
        this.maxPriceChange24h = str2;
        this.minPriceChange24h = str3;
        this.maxTxCount24h = str4;
        this.minTxCount24h = str5;
        this.maxMakers24h = str6;
        this.minMakers24h = str7;
        this.maxHolders = str8;
        this.minHolders = str9;
        this.maxVolume24h = str10;
        this.minVolume24h = str11;
        this.maxTvl = str12;
        this.minTvl = str13;
        this.maxFdv = str14;
        this.minFdv = str15;
        this.maxMarketCap = str16;
        this.minMarketCap = str17;
        this.ave = z11;
        this.orderByRange = str18;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChainSortType() {
        return this.chainSortType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMaxVolume24h() {
        return this.maxVolume24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMinVolume24h() {
        return this.minVolume24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMaxTvl() {
        return this.maxTvl;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getMinTvl() {
        return this.minTvl;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getMaxFdv() {
        return this.maxFdv;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMinFdv() {
        return this.minFdv;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMaxMarketCap() {
        return this.maxMarketCap;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getMinMarketCap() {
        return this.minMarketCap;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getAve() {
        return this.ave;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getOrderByRange() {
        return this.orderByRange;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMaxPriceChange24h() {
        return this.maxPriceChange24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMinPriceChange24h() {
        return this.minPriceChange24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMaxTxCount24h() {
        return this.maxTxCount24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMinTxCount24h() {
        return this.minTxCount24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMaxMakers24h() {
        return this.maxMakers24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMinMakers24h() {
        return this.minMakers24h;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMaxHolders() {
        return this.maxHolders;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMinHolders() {
        return this.minHolders;
    }

    public final boolean getAve() {
        return this.ave;
    }

    @Nullable
    public final String getChainSortType() {
        return this.chainSortType;
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

    public int hashCode() {
        String str = this.chainSortType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.maxPriceChange24h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.minPriceChange24h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.maxTxCount24h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.minTxCount24h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.maxMakers24h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.minMakers24h;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.maxHolders;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.minHolders;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.maxVolume24h;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.minVolume24h;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.maxTvl;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.minTvl;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.maxFdv;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.minFdv;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.maxMarketCap;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.minMarketCap;
        int iHashCode17 = (((iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31) + Boolean.hashCode(this.ave)) * 31;
        String str18 = this.orderByRange;
        return iHashCode17 + (str18 != null ? str18.hashCode() : 0);
    }

    public final void setAve(boolean z11) {
        this.ave = z11;
    }

    public final void setChainSortType(@Nullable String str) {
        this.chainSortType = str;
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

    @NotNull
    public String toString() {
        return "ChainFilterData(chainSortType=" + this.chainSortType + ", maxPriceChange24h=" + this.maxPriceChange24h + ", minPriceChange24h=" + this.minPriceChange24h + ", maxTxCount24h=" + this.maxTxCount24h + ", minTxCount24h=" + this.minTxCount24h + ", maxMakers24h=" + this.maxMakers24h + ", minMakers24h=" + this.minMakers24h + ", maxHolders=" + this.maxHolders + ", minHolders=" + this.minHolders + ", maxVolume24h=" + this.maxVolume24h + ", minVolume24h=" + this.minVolume24h + ", maxTvl=" + this.maxTvl + ", minTvl=" + this.minTvl + ", maxFdv=" + this.maxFdv + ", minFdv=" + this.minFdv + ", maxMarketCap=" + this.maxMarketCap + ", minMarketCap=" + this.minMarketCap + ", ave=" + this.ave + ", orderByRange=" + this.orderByRange + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.chainSortType);
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
        dest.writeInt(this.ave ? 1 : 0);
        dest.writeString(this.orderByRange);
    }

    public /* synthetic */ ChainFilterData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z11, String str18, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & 2048) != 0 ? null : str12, (i11 & 4096) != 0 ? null : str13, (i11 & 8192) != 0 ? null : str14, (i11 & 16384) != 0 ? null : str15, (i11 & 32768) != 0 ? null : str16, (i11 & 65536) != 0 ? null : str17, (i11 & 131072) != 0 ? true : z11, (i11 & 262144) != 0 ? null : str18);
    }
}
