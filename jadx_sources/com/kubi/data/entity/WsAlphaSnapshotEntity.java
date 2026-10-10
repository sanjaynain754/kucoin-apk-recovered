package com.kubi.data.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsAlphaSnapshotEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ja\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0018¨\u0006*"}, m90084d2 = {"Lcom/kubi/data/entity/WsAlphaSnapshotEntity;", "", "tokenIcon", "", "chainIcon", "tokenBridgeId", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "tradingVolume", "priceRate", "displayToken", "currencyUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "getTokenIcon", "()Ljava/lang/String;", "getChainIcon", "getTokenBridgeId", "getPrice", "()Ljava/math/BigDecimal;", "getTradingVolume", "getPriceRate", "getDisplayToken", "setDisplayToken", "(Ljava/lang/String;)V", "getCurrencyUnit", "setCurrencyUnit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsAlphaSnapshotEntity {

    @Nullable
    private final String chainIcon;

    @Nullable
    private String currencyUnit;

    @Nullable
    private String displayToken;

    @NotNull
    private final BigDecimal price;

    @NotNull
    private final BigDecimal priceRate;

    @NotNull
    private final String tokenBridgeId;

    @Nullable
    private final String tokenIcon;

    @NotNull
    private final BigDecimal tradingVolume;

    public WsAlphaSnapshotEntity(@Nullable String str, @Nullable String str2, @NotNull String tokenBridgeId, @NotNull BigDecimal price, @NotNull BigDecimal tradingVolume, @NotNull BigDecimal priceRate, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(tokenBridgeId, "tokenBridgeId");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(tradingVolume, "tradingVolume");
        Intrinsics.checkNotNullParameter(priceRate, "priceRate");
        this.tokenIcon = str;
        this.chainIcon = str2;
        this.tokenBridgeId = tokenBridgeId;
        this.price = price;
        this.tradingVolume = tradingVolume;
        this.priceRate = priceRate;
        this.displayToken = str3;
        this.currencyUnit = str4;
    }

    public static /* synthetic */ WsAlphaSnapshotEntity copy$default(WsAlphaSnapshotEntity wsAlphaSnapshotEntity, String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsAlphaSnapshotEntity.tokenIcon;
        }
        if ((i11 & 2) != 0) {
            str2 = wsAlphaSnapshotEntity.chainIcon;
        }
        if ((i11 & 4) != 0) {
            str3 = wsAlphaSnapshotEntity.tokenBridgeId;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = wsAlphaSnapshotEntity.price;
        }
        if ((i11 & 16) != 0) {
            bigDecimal2 = wsAlphaSnapshotEntity.tradingVolume;
        }
        if ((i11 & 32) != 0) {
            bigDecimal3 = wsAlphaSnapshotEntity.priceRate;
        }
        if ((i11 & 64) != 0) {
            str4 = wsAlphaSnapshotEntity.displayToken;
        }
        if ((i11 & 128) != 0) {
            str5 = wsAlphaSnapshotEntity.currencyUnit;
        }
        String str6 = str4;
        String str7 = str5;
        BigDecimal bigDecimal4 = bigDecimal2;
        BigDecimal bigDecimal5 = bigDecimal3;
        return wsAlphaSnapshotEntity.copy(str, str2, str3, bigDecimal, bigDecimal4, bigDecimal5, str6, str7);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsAlphaSnapshotEntity)) {
            return false;
        }
        WsAlphaSnapshotEntity wsAlphaSnapshotEntity = (WsAlphaSnapshotEntity) other;
        return Intrinsics.areEqual(this.tokenIcon, wsAlphaSnapshotEntity.tokenIcon) && Intrinsics.areEqual(this.chainIcon, wsAlphaSnapshotEntity.chainIcon) && Intrinsics.areEqual(this.tokenBridgeId, wsAlphaSnapshotEntity.tokenBridgeId) && Intrinsics.areEqual(this.price, wsAlphaSnapshotEntity.price) && Intrinsics.areEqual(this.tradingVolume, wsAlphaSnapshotEntity.tradingVolume) && Intrinsics.areEqual(this.priceRate, wsAlphaSnapshotEntity.priceRate) && Intrinsics.areEqual(this.displayToken, wsAlphaSnapshotEntity.displayToken) && Intrinsics.areEqual(this.currencyUnit, wsAlphaSnapshotEntity.currencyUnit);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChainIcon() {
        return this.chainIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getTradingVolume() {
        return this.tradingVolume;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getPriceRate() {
        return this.priceRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDisplayToken() {
        return this.displayToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCurrencyUnit() {
        return this.currencyUnit;
    }

    @NotNull
    public final WsAlphaSnapshotEntity copy(@Nullable String tokenIcon, @Nullable String chainIcon, @NotNull String tokenBridgeId, @NotNull BigDecimal price, @NotNull BigDecimal tradingVolume, @NotNull BigDecimal priceRate, @Nullable String displayToken, @Nullable String currencyUnit) {
        Intrinsics.checkNotNullParameter(tokenBridgeId, "tokenBridgeId");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(tradingVolume, "tradingVolume");
        Intrinsics.checkNotNullParameter(priceRate, "priceRate");
        return new WsAlphaSnapshotEntity(tokenIcon, chainIcon, tokenBridgeId, price, tradingVolume, priceRate, displayToken, currencyUnit);
    }

    @Nullable
    public final String getChainIcon() {
        return this.chainIcon;
    }

    @Nullable
    public final String getCurrencyUnit() {
        return this.currencyUnit;
    }

    @Nullable
    public final String getDisplayToken() {
        return this.displayToken;
    }

    @NotNull
    public final BigDecimal getPrice() {
        return this.price;
    }

    @NotNull
    public final BigDecimal getPriceRate() {
        return this.priceRate;
    }

    @NotNull
    public final String getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    @Nullable
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @NotNull
    public final BigDecimal getTradingVolume() {
        return this.tradingVolume;
    }

    public int hashCode() {
        String str = this.tokenIcon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.chainIcon;
        int iHashCode2 = (((((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.tokenBridgeId.hashCode()) * 31) + this.price.hashCode()) * 31) + this.tradingVolume.hashCode()) * 31) + this.priceRate.hashCode()) * 31;
        String str3 = this.displayToken;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currencyUnit;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCurrencyUnit(@Nullable String str) {
        this.currencyUnit = str;
    }

    public final void setDisplayToken(@Nullable String str) {
        this.displayToken = str;
    }

    @NotNull
    public String toString() {
        return "WsAlphaSnapshotEntity(tokenIcon=" + this.tokenIcon + ", chainIcon=" + this.chainIcon + ", tokenBridgeId=" + this.tokenBridgeId + ", price=" + this.price + ", tradingVolume=" + this.tradingVolume + ", priceRate=" + this.priceRate + ", displayToken=" + this.displayToken + ", currencyUnit=" + this.currencyUnit + ')';
    }

    public /* synthetic */ WsAlphaSnapshotEntity(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, str3, bigDecimal, bigDecimal2, bigDecimal3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : str5);
    }
}
