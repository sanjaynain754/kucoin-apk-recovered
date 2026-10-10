package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CoinInfoEntity;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetCoinEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b;\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010F\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010;J¶\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010NJ\u0006\u0010O\u001a\u00020PJ\u0013\u0010Q\u001a\u00020\u00142\b\u0010R\u001a\u0004\u0018\u00010SHÖ\u0003J\t\u0010T\u001a\u00020PHÖ\u0001J\t\u0010U\u001a\u00020\u0003HÖ\u0001J\u0016\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020PR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010>\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006["}, m90084d2 = {"Lcom/kubi/assets/entity/AssetCoinEntity;", "Landroid/os/Parcelable;", "availableAmount", "", "code", FirebaseAnalytics.Param.CURRENCY, "proportion", "quote", "totalAmount", "lastTradedPrice", "", "changeRate", "tokenAddress", "iconUrl", "chainIconUrl", "totalAmountBaseUSDT", "Ljava/math/BigDecimal;", "coinInfoEntity", "Lcom/kubi/data/entity/CoinInfoEntity;", "delisted", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/kubi/data/entity/CoinInfoEntity;Ljava/lang/Boolean;)V", "getAvailableAmount", "()Ljava/lang/String;", "setAvailableAmount", "(Ljava/lang/String;)V", "getCode", "setCode", "getCurrency", "setCurrency", "getProportion", "setProportion", "getQuote", "setQuote", "getTotalAmount", "setTotalAmount", "getLastTradedPrice", "()Ljava/lang/Double;", "setLastTradedPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getChangeRate", "setChangeRate", "getTokenAddress", "setTokenAddress", "getIconUrl", "setIconUrl", "getChainIconUrl", "setChainIconUrl", "getTotalAmountBaseUSDT", "()Ljava/math/BigDecimal;", "setTotalAmountBaseUSDT", "(Ljava/math/BigDecimal;)V", "getCoinInfoEntity", "()Lcom/kubi/data/entity/CoinInfoEntity;", "setCoinInfoEntity", "(Lcom/kubi/data/entity/CoinInfoEntity;)V", "getDelisted", "()Ljava/lang/Boolean;", "setDelisted", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/kubi/data/entity/CoinInfoEntity;Ljava/lang/Boolean;)Lcom/kubi/assets/entity/AssetCoinEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AssetCoinEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetCoinEntity> CREATOR = new Creator();

    @Nullable
    private String availableAmount;

    @Nullable
    private String chainIconUrl;

    @Nullable
    private Double changeRate;

    @Nullable
    private String code;

    @Nullable
    private CoinInfoEntity coinInfoEntity;

    @Nullable
    private String currency;

    @Nullable
    private Boolean delisted;

    @Nullable
    private String iconUrl;

    @Nullable
    private Double lastTradedPrice;

    @Nullable
    private String proportion;

    @Nullable
    private String quote;

    @Nullable
    private String tokenAddress;

    @Nullable
    private String totalAmount;

    @Nullable
    private BigDecimal totalAmountBaseUSDT;

    /* JADX INFO: compiled from: AssetCoinEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetCoinEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetCoinEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Boolean boolValueOf = null;
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            CoinInfoEntity coinInfoEntity = (CoinInfoEntity) parcel.readParcelable(AssetCoinEntity.class.getClassLoader());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AssetCoinEntity(string, string2, string3, string4, string5, string6, dValueOf, dValueOf2, string7, string8, string9, bigDecimal, coinInfoEntity, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetCoinEntity[] newArray(int i11) {
            return new AssetCoinEntity[i11];
        }
    }

    public AssetCoinEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetCoinEntity)) {
            return false;
        }
        AssetCoinEntity assetCoinEntity = (AssetCoinEntity) other;
        return Intrinsics.areEqual(this.availableAmount, assetCoinEntity.availableAmount) && Intrinsics.areEqual(this.code, assetCoinEntity.code) && Intrinsics.areEqual(this.currency, assetCoinEntity.currency) && Intrinsics.areEqual(this.proportion, assetCoinEntity.proportion) && Intrinsics.areEqual(this.quote, assetCoinEntity.quote) && Intrinsics.areEqual(this.totalAmount, assetCoinEntity.totalAmount) && Intrinsics.areEqual((Object) this.lastTradedPrice, (Object) assetCoinEntity.lastTradedPrice) && Intrinsics.areEqual((Object) this.changeRate, (Object) assetCoinEntity.changeRate) && Intrinsics.areEqual(this.tokenAddress, assetCoinEntity.tokenAddress) && Intrinsics.areEqual(this.iconUrl, assetCoinEntity.iconUrl) && Intrinsics.areEqual(this.chainIconUrl, assetCoinEntity.chainIconUrl) && Intrinsics.areEqual(this.totalAmountBaseUSDT, assetCoinEntity.totalAmountBaseUSDT) && Intrinsics.areEqual(this.coinInfoEntity, assetCoinEntity.coinInfoEntity) && Intrinsics.areEqual(this.delisted, assetCoinEntity.delisted);
    }

    public AssetCoinEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Double d11, @Nullable Double d12, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable BigDecimal bigDecimal, @Nullable CoinInfoEntity coinInfoEntity, @Nullable Boolean bool) {
        this.availableAmount = str;
        this.code = str2;
        this.currency = str3;
        this.proportion = str4;
        this.quote = str5;
        this.totalAmount = str6;
        this.lastTradedPrice = d11;
        this.changeRate = d12;
        this.tokenAddress = str7;
        this.iconUrl = str8;
        this.chainIconUrl = str9;
        this.totalAmountBaseUSDT = bigDecimal;
        this.coinInfoEntity = coinInfoEntity;
        this.delisted = bool;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAvailableAmount() {
        return this.availableAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getChainIconUrl() {
        return this.chainIconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getTotalAmountBaseUSDT() {
        return this.totalAmountBaseUSDT;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final CoinInfoEntity getCoinInfoEntity() {
        return this.coinInfoEntity;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getDelisted() {
        return this.delisted;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProportion() {
        return this.proportion;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getQuote() {
        return this.quote;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getLastTradedPrice() {
        return this.lastTradedPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    @NotNull
    public final AssetCoinEntity copy(@Nullable String availableAmount, @Nullable String code, @Nullable String currency, @Nullable String proportion, @Nullable String quote, @Nullable String totalAmount, @Nullable Double lastTradedPrice, @Nullable Double changeRate, @Nullable String tokenAddress, @Nullable String iconUrl, @Nullable String chainIconUrl, @Nullable BigDecimal totalAmountBaseUSDT, @Nullable CoinInfoEntity coinInfoEntity, @Nullable Boolean delisted) {
        return new AssetCoinEntity(availableAmount, code, currency, proportion, quote, totalAmount, lastTradedPrice, changeRate, tokenAddress, iconUrl, chainIconUrl, totalAmountBaseUSDT, coinInfoEntity, delisted);
    }

    @Nullable
    public final String getAvailableAmount() {
        return this.availableAmount;
    }

    @Nullable
    public final String getChainIconUrl() {
        return this.chainIconUrl;
    }

    @Nullable
    public final Double getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final CoinInfoEntity getCoinInfoEntity() {
        return this.coinInfoEntity;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Boolean getDelisted() {
        return this.delisted;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final Double getLastTradedPrice() {
        return this.lastTradedPrice;
    }

    @Nullable
    public final String getProportion() {
        return this.proportion;
    }

    @Nullable
    public final String getQuote() {
        return this.quote;
    }

    @Nullable
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    @Nullable
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    public final BigDecimal getTotalAmountBaseUSDT() {
        return this.totalAmountBaseUSDT;
    }

    public int hashCode() {
        String str = this.availableAmount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.proportion;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.quote;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.totalAmount;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d11 = this.lastTradedPrice;
        int iHashCode7 = (iHashCode6 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.changeRate;
        int iHashCode8 = (iHashCode7 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str7 = this.tokenAddress;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.iconUrl;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.chainIconUrl;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BigDecimal bigDecimal = this.totalAmountBaseUSDT;
        int iHashCode12 = (iHashCode11 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        CoinInfoEntity coinInfoEntity = this.coinInfoEntity;
        int iHashCode13 = (iHashCode12 + (coinInfoEntity == null ? 0 : coinInfoEntity.hashCode())) * 31;
        Boolean bool = this.delisted;
        return iHashCode13 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setAvailableAmount(@Nullable String str) {
        this.availableAmount = str;
    }

    public final void setChainIconUrl(@Nullable String str) {
        this.chainIconUrl = str;
    }

    public final void setChangeRate(@Nullable Double d11) {
        this.changeRate = d11;
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    public final void setCoinInfoEntity(@Nullable CoinInfoEntity coinInfoEntity) {
        this.coinInfoEntity = coinInfoEntity;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setDelisted(@Nullable Boolean bool) {
        this.delisted = bool;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setLastTradedPrice(@Nullable Double d11) {
        this.lastTradedPrice = d11;
    }

    public final void setProportion(@Nullable String str) {
        this.proportion = str;
    }

    public final void setQuote(@Nullable String str) {
        this.quote = str;
    }

    public final void setTokenAddress(@Nullable String str) {
        this.tokenAddress = str;
    }

    public final void setTotalAmount(@Nullable String str) {
        this.totalAmount = str;
    }

    public final void setTotalAmountBaseUSDT(@Nullable BigDecimal bigDecimal) {
        this.totalAmountBaseUSDT = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "AssetCoinEntity(availableAmount=" + this.availableAmount + ", code=" + this.code + ", currency=" + this.currency + ", proportion=" + this.proportion + ", quote=" + this.quote + ", totalAmount=" + this.totalAmount + ", lastTradedPrice=" + this.lastTradedPrice + ", changeRate=" + this.changeRate + ", tokenAddress=" + this.tokenAddress + ", iconUrl=" + this.iconUrl + ", chainIconUrl=" + this.chainIconUrl + ", totalAmountBaseUSDT=" + this.totalAmountBaseUSDT + ", coinInfoEntity=" + this.coinInfoEntity + ", delisted=" + this.delisted + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.availableAmount);
        dest.writeString(this.code);
        dest.writeString(this.currency);
        dest.writeString(this.proportion);
        dest.writeString(this.quote);
        dest.writeString(this.totalAmount);
        Double d11 = this.lastTradedPrice;
        if (d11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d11.doubleValue());
        }
        Double d12 = this.changeRate;
        if (d12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d12.doubleValue());
        }
        dest.writeString(this.tokenAddress);
        dest.writeString(this.iconUrl);
        dest.writeString(this.chainIconUrl);
        dest.writeSerializable(this.totalAmountBaseUSDT);
        dest.writeParcelable(this.coinInfoEntity, flags);
        Boolean bool = this.delisted;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ AssetCoinEntity(String str, String str2, String str3, String str4, String str5, String str6, Double d11, Double d12, String str7, String str8, String str9, BigDecimal bigDecimal, CoinInfoEntity coinInfoEntity, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : d11, (i11 & 128) != 0 ? null : d12, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : str8, (i11 & 1024) != 0 ? null : str9, (i11 & 2048) != 0 ? null : bigDecimal, (i11 & 4096) != 0 ? null : coinInfoEntity, (i11 & 8192) != 0 ? null : bool);
    }
}
