package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlphaCurrencyEntity.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b2\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010;\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010=\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÚ\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010BJ\u0006\u0010C\u001a\u00020\rJ\u0013\u0010D\u001a\u00020\u00132\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\rHÖ\u0001J\t\u0010H\u001a\u00020\u0005HÖ\u0001J\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b'\u0010\u001aR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b(\u0010\u001aR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010&\u001a\u0004\b)\u0010%R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010,\u001a\u0004\b\u0012\u0010+R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b-\u0010\u001aR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001d¨\u0006N"}, m90084d2 = {"Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;", "Landroid/os/Parcelable;", "currencySeq", "", "siteType", "", "chainSeq", "chainLogo", "tokenIcon", "tokenName", "tokenAddress", "tokenFullName", "tokenDecimal", "", "openingTime", "createdAt", "upgradeStatus", "tokenBridgeId", "isQuoteCurrency", "", "web3ChainId", "chainId", "currencyType", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getCurrencySeq", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSiteType", "()Ljava/lang/String;", "getChainSeq", "getChainLogo", "getTokenIcon", "getTokenName", "getTokenAddress", "getTokenFullName", "getTokenDecimal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOpeningTime", "getCreatedAt", "getUpgradeStatus", "getTokenBridgeId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getWeb3ChainId", "getChainId", "getCurrencyType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/data/entity/AlphaCurrencyInfoEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlphaCurrencyInfoEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AlphaCurrencyInfoEntity> CREATOR = new Creator();

    @Nullable
    private final String chainId;

    @Nullable
    private final String chainLogo;

    @Nullable
    private final Long chainSeq;

    @Nullable
    private final Long createdAt;

    @Nullable
    private final Long currencySeq;

    @Nullable
    private final String currencyType;

    @SerializedName("quoteCurrency")
    @Nullable
    private final Boolean isQuoteCurrency;

    @Nullable
    private final Long openingTime;

    @Nullable
    private final String siteType;

    @Nullable
    private final String tokenAddress;

    @Nullable
    private final Long tokenBridgeId;

    @Nullable
    private final Integer tokenDecimal;

    @Nullable
    private final String tokenFullName;

    @Nullable
    private final String tokenIcon;

    @Nullable
    private final String tokenName;

    @Nullable
    private final Integer upgradeStatus;

    @Nullable
    private final Long web3ChainId;

    /* JADX INFO: compiled from: AlphaCurrencyEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AlphaCurrencyInfoEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlphaCurrencyInfoEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AlphaCurrencyInfoEntity(lValueOf, string, lValueOf2, string2, string3, string4, string5, string6, numValueOf, lValueOf3, lValueOf4, numValueOf2, lValueOf5, boolValueOf, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlphaCurrencyInfoEntity[] newArray(int i11) {
            return new AlphaCurrencyInfoEntity[i11];
        }
    }

    public AlphaCurrencyInfoEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ AlphaCurrencyInfoEntity copy$default(AlphaCurrencyInfoEntity alphaCurrencyInfoEntity, Long l11, String str, Long l12, String str2, String str3, String str4, String str5, String str6, Integer num, Long l13, Long l14, Integer num2, Long l15, Boolean bool, Long l16, String str7, String str8, int i11, Object obj) {
        String str9;
        String str10;
        Long l17 = (i11 & 1) != 0 ? alphaCurrencyInfoEntity.currencySeq : l11;
        String str11 = (i11 & 2) != 0 ? alphaCurrencyInfoEntity.siteType : str;
        Long l18 = (i11 & 4) != 0 ? alphaCurrencyInfoEntity.chainSeq : l12;
        String str12 = (i11 & 8) != 0 ? alphaCurrencyInfoEntity.chainLogo : str2;
        String str13 = (i11 & 16) != 0 ? alphaCurrencyInfoEntity.tokenIcon : str3;
        String str14 = (i11 & 32) != 0 ? alphaCurrencyInfoEntity.tokenName : str4;
        String str15 = (i11 & 64) != 0 ? alphaCurrencyInfoEntity.tokenAddress : str5;
        String str16 = (i11 & 128) != 0 ? alphaCurrencyInfoEntity.tokenFullName : str6;
        Integer num3 = (i11 & 256) != 0 ? alphaCurrencyInfoEntity.tokenDecimal : num;
        Long l19 = (i11 & 512) != 0 ? alphaCurrencyInfoEntity.openingTime : l13;
        Long l21 = (i11 & 1024) != 0 ? alphaCurrencyInfoEntity.createdAt : l14;
        Integer num4 = (i11 & 2048) != 0 ? alphaCurrencyInfoEntity.upgradeStatus : num2;
        Long l22 = (i11 & 4096) != 0 ? alphaCurrencyInfoEntity.tokenBridgeId : l15;
        Boolean bool2 = (i11 & 8192) != 0 ? alphaCurrencyInfoEntity.isQuoteCurrency : bool;
        Long l23 = l17;
        Long l24 = (i11 & 16384) != 0 ? alphaCurrencyInfoEntity.web3ChainId : l16;
        String str17 = (i11 & 32768) != 0 ? alphaCurrencyInfoEntity.chainId : str7;
        if ((i11 & 65536) != 0) {
            str10 = str17;
            str9 = alphaCurrencyInfoEntity.currencyType;
        } else {
            str9 = str8;
            str10 = str17;
        }
        return alphaCurrencyInfoEntity.copy(l23, str11, l18, str12, str13, str14, str15, str16, num3, l19, l21, num4, l22, bool2, l24, str10, str9);
    }

    @NotNull
    public final AlphaCurrencyInfoEntity copy(@Nullable Long currencySeq, @Nullable String siteType, @Nullable Long chainSeq, @Nullable String chainLogo, @Nullable String tokenIcon, @Nullable String tokenName, @Nullable String tokenAddress, @Nullable String tokenFullName, @Nullable Integer tokenDecimal, @Nullable Long openingTime, @Nullable Long createdAt, @Nullable Integer upgradeStatus, @Nullable Long tokenBridgeId, @Nullable Boolean isQuoteCurrency, @Nullable Long web3ChainId, @Nullable String chainId, @Nullable String currencyType) {
        return new AlphaCurrencyInfoEntity(currencySeq, siteType, chainSeq, chainLogo, tokenIcon, tokenName, tokenAddress, tokenFullName, tokenDecimal, openingTime, createdAt, upgradeStatus, tokenBridgeId, isQuoteCurrency, web3ChainId, chainId, currencyType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlphaCurrencyInfoEntity)) {
            return false;
        }
        AlphaCurrencyInfoEntity alphaCurrencyInfoEntity = (AlphaCurrencyInfoEntity) other;
        return Intrinsics.areEqual(this.currencySeq, alphaCurrencyInfoEntity.currencySeq) && Intrinsics.areEqual(this.siteType, alphaCurrencyInfoEntity.siteType) && Intrinsics.areEqual(this.chainSeq, alphaCurrencyInfoEntity.chainSeq) && Intrinsics.areEqual(this.chainLogo, alphaCurrencyInfoEntity.chainLogo) && Intrinsics.areEqual(this.tokenIcon, alphaCurrencyInfoEntity.tokenIcon) && Intrinsics.areEqual(this.tokenName, alphaCurrencyInfoEntity.tokenName) && Intrinsics.areEqual(this.tokenAddress, alphaCurrencyInfoEntity.tokenAddress) && Intrinsics.areEqual(this.tokenFullName, alphaCurrencyInfoEntity.tokenFullName) && Intrinsics.areEqual(this.tokenDecimal, alphaCurrencyInfoEntity.tokenDecimal) && Intrinsics.areEqual(this.openingTime, alphaCurrencyInfoEntity.openingTime) && Intrinsics.areEqual(this.createdAt, alphaCurrencyInfoEntity.createdAt) && Intrinsics.areEqual(this.upgradeStatus, alphaCurrencyInfoEntity.upgradeStatus) && Intrinsics.areEqual(this.tokenBridgeId, alphaCurrencyInfoEntity.tokenBridgeId) && Intrinsics.areEqual(this.isQuoteCurrency, alphaCurrencyInfoEntity.isQuoteCurrency) && Intrinsics.areEqual(this.web3ChainId, alphaCurrencyInfoEntity.web3ChainId) && Intrinsics.areEqual(this.chainId, alphaCurrencyInfoEntity.chainId) && Intrinsics.areEqual(this.currencyType, alphaCurrencyInfoEntity.currencyType);
    }

    public AlphaCurrencyInfoEntity(@Nullable Long l11, @Nullable String str, @Nullable Long l12, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable Long l13, @Nullable Long l14, @Nullable Integer num2, @Nullable Long l15, @Nullable Boolean bool, @Nullable Long l16, @Nullable String str7, @Nullable String str8) {
        this.currencySeq = l11;
        this.siteType = str;
        this.chainSeq = l12;
        this.chainLogo = str2;
        this.tokenIcon = str3;
        this.tokenName = str4;
        this.tokenAddress = str5;
        this.tokenFullName = str6;
        this.tokenDecimal = num;
        this.openingTime = l13;
        this.createdAt = l14;
        this.upgradeStatus = num2;
        this.tokenBridgeId = l15;
        this.isQuoteCurrency = bool;
        this.web3ChainId = l16;
        this.chainId = str7;
        this.currencyType = str8;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getCurrencySeq() {
        return this.currencySeq;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getOpeningTime() {
        return this.openingTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getUpgradeStatus() {
        return this.upgradeStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getIsQuoteCurrency() {
        return this.isQuoteCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Long getWeb3ChainId() {
        return this.web3ChainId;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getCurrencyType() {
        return this.currencyType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSiteType() {
        return this.siteType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getChainSeq() {
        return this.chainSeq;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTokenName() {
        return this.tokenName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTokenFullName() {
        return this.tokenFullName;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getTokenDecimal() {
        return this.tokenDecimal;
    }

    @Nullable
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    public final String getChainLogo() {
        return this.chainLogo;
    }

    @Nullable
    public final Long getChainSeq() {
        return this.chainSeq;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final Long getCurrencySeq() {
        return this.currencySeq;
    }

    @Nullable
    public final String getCurrencyType() {
        return this.currencyType;
    }

    @Nullable
    public final Long getOpeningTime() {
        return this.openingTime;
    }

    @Nullable
    public final String getSiteType() {
        return this.siteType;
    }

    @Nullable
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    @Nullable
    public final Long getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    @Nullable
    public final Integer getTokenDecimal() {
        return this.tokenDecimal;
    }

    @Nullable
    public final String getTokenFullName() {
        return this.tokenFullName;
    }

    @Nullable
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @Nullable
    public final String getTokenName() {
        return this.tokenName;
    }

    @Nullable
    public final Integer getUpgradeStatus() {
        return this.upgradeStatus;
    }

    @Nullable
    public final Long getWeb3ChainId() {
        return this.web3ChainId;
    }

    public int hashCode() {
        Long l11 = this.currencySeq;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.siteType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.chainSeq;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str2 = this.chainLogo;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tokenIcon;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tokenName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tokenAddress;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tokenFullName;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.tokenDecimal;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Long l13 = this.openingTime;
        int iHashCode10 = (iHashCode9 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.createdAt;
        int iHashCode11 = (iHashCode10 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Integer num2 = this.upgradeStatus;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l15 = this.tokenBridgeId;
        int iHashCode13 = (iHashCode12 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Boolean bool = this.isQuoteCurrency;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l16 = this.web3ChainId;
        int iHashCode15 = (iHashCode14 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str7 = this.chainId;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.currencyType;
        return iHashCode16 + (str8 != null ? str8.hashCode() : 0);
    }

    @Nullable
    public final Boolean isQuoteCurrency() {
        return this.isQuoteCurrency;
    }

    @NotNull
    public String toString() {
        return "AlphaCurrencyInfoEntity(currencySeq=" + this.currencySeq + ", siteType=" + this.siteType + ", chainSeq=" + this.chainSeq + ", chainLogo=" + this.chainLogo + ", tokenIcon=" + this.tokenIcon + ", tokenName=" + this.tokenName + ", tokenAddress=" + this.tokenAddress + ", tokenFullName=" + this.tokenFullName + ", tokenDecimal=" + this.tokenDecimal + ", openingTime=" + this.openingTime + ", createdAt=" + this.createdAt + ", upgradeStatus=" + this.upgradeStatus + ", tokenBridgeId=" + this.tokenBridgeId + ", isQuoteCurrency=" + this.isQuoteCurrency + ", web3ChainId=" + this.web3ChainId + ", chainId=" + this.chainId + ", currencyType=" + this.currencyType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l11 = this.currencySeq;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.siteType);
        Long l12 = this.chainSeq;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.chainLogo);
        dest.writeString(this.tokenIcon);
        dest.writeString(this.tokenName);
        dest.writeString(this.tokenAddress);
        dest.writeString(this.tokenFullName);
        Integer num = this.tokenDecimal;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Long l13 = this.openingTime;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        Long l14 = this.createdAt;
        if (l14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l14.longValue());
        }
        Integer num2 = this.upgradeStatus;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Long l15 = this.tokenBridgeId;
        if (l15 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l15.longValue());
        }
        Boolean bool = this.isQuoteCurrency;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l16 = this.web3ChainId;
        if (l16 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l16.longValue());
        }
        dest.writeString(this.chainId);
        dest.writeString(this.currencyType);
    }

    public /* synthetic */ AlphaCurrencyInfoEntity(Long l11, String str, Long l12, String str2, String str3, String str4, String str5, String str6, Integer num, Long l13, Long l14, Integer num2, Long l15, Boolean bool, Long l16, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : l12, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : num, (i11 & 512) != 0 ? null : l13, (i11 & 1024) != 0 ? null : l14, (i11 & 2048) != 0 ? null : num2, (i11 & 4096) != 0 ? null : l15, (i11 & 8192) != 0 ? null : bool, (i11 & 16384) != 0 ? null : l16, (i11 & 32768) != 0 ? null : str7, (i11 & 65536) != 0 ? null : str8);
    }
}
