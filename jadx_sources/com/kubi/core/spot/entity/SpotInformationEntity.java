package com.kubi.core.spot.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpotInformationEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jz\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006+"}, m90084d2 = {"Lcom/kubi/core/spot/entity/SpotInformationEntity;", "", "baseMinSize", "", "hiddenEnable", "", "hiddenEnableShow", "icebergEnable", "icebergEnableShow", "minimalFunds", "priceIncrement", "quoteIncrement", "restrictedCountry", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBaseMinSize", "()Ljava/lang/String;", "getHiddenEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHiddenEnableShow", "getIcebergEnable", "getIcebergEnableShow", "getMinimalFunds", "getPriceIncrement", "getQuoteIncrement", "getRestrictedCountry", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/core/spot/entity/SpotInformationEntity;", "equals", "other", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SpotInformationEntity {

    @Nullable
    private final String baseMinSize;

    @Nullable
    private final Boolean hiddenEnable;

    @Nullable
    private final Boolean hiddenEnableShow;

    @Nullable
    private final Boolean icebergEnable;

    @Nullable
    private final Boolean icebergEnableShow;

    @Nullable
    private final String minimalFunds;

    @Nullable
    private final String priceIncrement;

    @Nullable
    private final String quoteIncrement;

    @Nullable
    private final String restrictedCountry;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotInformationEntity)) {
            return false;
        }
        SpotInformationEntity spotInformationEntity = (SpotInformationEntity) other;
        return Intrinsics.areEqual(this.baseMinSize, spotInformationEntity.baseMinSize) && Intrinsics.areEqual(this.hiddenEnable, spotInformationEntity.hiddenEnable) && Intrinsics.areEqual(this.hiddenEnableShow, spotInformationEntity.hiddenEnableShow) && Intrinsics.areEqual(this.icebergEnable, spotInformationEntity.icebergEnable) && Intrinsics.areEqual(this.icebergEnableShow, spotInformationEntity.icebergEnableShow) && Intrinsics.areEqual(this.minimalFunds, spotInformationEntity.minimalFunds) && Intrinsics.areEqual(this.priceIncrement, spotInformationEntity.priceIncrement) && Intrinsics.areEqual(this.quoteIncrement, spotInformationEntity.quoteIncrement) && Intrinsics.areEqual(this.restrictedCountry, spotInformationEntity.restrictedCountry);
    }

    public static /* synthetic */ SpotInformationEntity copy$default(SpotInformationEntity spotInformationEntity, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = spotInformationEntity.baseMinSize;
        }
        if ((i11 & 2) != 0) {
            bool = spotInformationEntity.hiddenEnable;
        }
        if ((i11 & 4) != 0) {
            bool2 = spotInformationEntity.hiddenEnableShow;
        }
        if ((i11 & 8) != 0) {
            bool3 = spotInformationEntity.icebergEnable;
        }
        if ((i11 & 16) != 0) {
            bool4 = spotInformationEntity.icebergEnableShow;
        }
        if ((i11 & 32) != 0) {
            str2 = spotInformationEntity.minimalFunds;
        }
        if ((i11 & 64) != 0) {
            str3 = spotInformationEntity.priceIncrement;
        }
        if ((i11 & 128) != 0) {
            str4 = spotInformationEntity.quoteIncrement;
        }
        if ((i11 & 256) != 0) {
            str5 = spotInformationEntity.restrictedCountry;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        Boolean bool5 = bool4;
        Boolean bool6 = bool2;
        return spotInformationEntity.copy(str, bool, bool6, bool3, bool5, str8, str9, str6, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBaseMinSize() {
        return this.baseMinSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getHiddenEnable() {
        return this.hiddenEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHiddenEnableShow() {
        return this.hiddenEnableShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIcebergEnable() {
        return this.icebergEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIcebergEnableShow() {
        return this.icebergEnableShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMinimalFunds() {
        return this.minimalFunds;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPriceIncrement() {
        return this.priceIncrement;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getQuoteIncrement() {
        return this.quoteIncrement;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRestrictedCountry() {
        return this.restrictedCountry;
    }

    @NotNull
    public final SpotInformationEntity copy(@Nullable String baseMinSize, @Nullable Boolean hiddenEnable, @Nullable Boolean hiddenEnableShow, @Nullable Boolean icebergEnable, @Nullable Boolean icebergEnableShow, @Nullable String minimalFunds, @Nullable String priceIncrement, @Nullable String quoteIncrement, @Nullable String restrictedCountry) {
        return new SpotInformationEntity(baseMinSize, hiddenEnable, hiddenEnableShow, icebergEnable, icebergEnableShow, minimalFunds, priceIncrement, quoteIncrement, restrictedCountry);
    }

    @Nullable
    public final String getBaseMinSize() {
        return this.baseMinSize;
    }

    @Nullable
    public final Boolean getHiddenEnable() {
        return this.hiddenEnable;
    }

    @Nullable
    public final Boolean getHiddenEnableShow() {
        return this.hiddenEnableShow;
    }

    @Nullable
    public final Boolean getIcebergEnable() {
        return this.icebergEnable;
    }

    @Nullable
    public final Boolean getIcebergEnableShow() {
        return this.icebergEnableShow;
    }

    @Nullable
    public final String getMinimalFunds() {
        return this.minimalFunds;
    }

    @Nullable
    public final String getPriceIncrement() {
        return this.priceIncrement;
    }

    @Nullable
    public final String getQuoteIncrement() {
        return this.quoteIncrement;
    }

    @Nullable
    public final String getRestrictedCountry() {
        return this.restrictedCountry;
    }

    public int hashCode() {
        String str = this.baseMinSize;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hiddenEnable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hiddenEnableShow;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.icebergEnable;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.icebergEnableShow;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.minimalFunds;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.priceIncrement;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.quoteIncrement;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.restrictedCountry;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SpotInformationEntity(baseMinSize=" + this.baseMinSize + ", hiddenEnable=" + this.hiddenEnable + ", hiddenEnableShow=" + this.hiddenEnableShow + ", icebergEnable=" + this.icebergEnable + ", icebergEnableShow=" + this.icebergEnableShow + ", minimalFunds=" + this.minimalFunds + ", priceIncrement=" + this.priceIncrement + ", quoteIncrement=" + this.quoteIncrement + ", restrictedCountry=" + this.restrictedCountry + ')';
    }

    public SpotInformationEntity(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.baseMinSize = str;
        this.hiddenEnable = bool;
        this.hiddenEnableShow = bool2;
        this.icebergEnable = bool3;
        this.icebergEnableShow = bool4;
        this.minimalFunds = str2;
        this.priceIncrement = str3;
        this.quoteIncrement = str4;
        this.restrictedCountry = str5;
    }
}
