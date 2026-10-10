package com.kubi.unify.unify.common.order.delegate;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UtaOrderParams.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00060"}, m90084d2 = {"Lcom/kubi/unify/unify/common/order/delegate/UtaModifyOrderParams;", "", "symbol", "", "orderId", "newPrice", "Ljava/math/BigDecimal;", "newSize", "visibleSize", "tpTriggerPrice", "tpTriggerPriceType", "slTriggerPrice", "slTriggerPriceType", AppsFlyerProperties.CHANNEL, "sizeUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getOrderId", "getNewPrice", "()Ljava/math/BigDecimal;", "getNewSize", "getVisibleSize", "getTpTriggerPrice", "getTpTriggerPriceType", "getSlTriggerPrice", "getSlTriggerPriceType", "getChannel", "getSizeUnit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UtaModifyOrderParams {

    @Nullable
    private final String channel;

    @Nullable
    private final BigDecimal newPrice;

    @Nullable
    private final BigDecimal newSize;

    @Nullable
    private final String orderId;

    @NotNull
    private final String sizeUnit;

    @Nullable
    private final BigDecimal slTriggerPrice;

    @Nullable
    private final String slTriggerPriceType;

    @Nullable
    private final String symbol;

    @Nullable
    private final BigDecimal tpTriggerPrice;

    @Nullable
    private final String tpTriggerPriceType;

    @Nullable
    private final BigDecimal visibleSize;

    public UtaModifyOrderParams(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable String str3, @Nullable BigDecimal bigDecimal5, @Nullable String str4, @Nullable String str5, @NotNull String sizeUnit) {
        Intrinsics.checkNotNullParameter(sizeUnit, "sizeUnit");
        this.symbol = str;
        this.orderId = str2;
        this.newPrice = bigDecimal;
        this.newSize = bigDecimal2;
        this.visibleSize = bigDecimal3;
        this.tpTriggerPrice = bigDecimal4;
        this.tpTriggerPriceType = str3;
        this.slTriggerPrice = bigDecimal5;
        this.slTriggerPriceType = str4;
        this.channel = str5;
        this.sizeUnit = sizeUnit;
    }

    public static /* synthetic */ UtaModifyOrderParams copy$default(UtaModifyOrderParams utaModifyOrderParams, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str3, BigDecimal bigDecimal5, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = utaModifyOrderParams.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = utaModifyOrderParams.orderId;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = utaModifyOrderParams.newPrice;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = utaModifyOrderParams.newSize;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = utaModifyOrderParams.visibleSize;
        }
        if ((i11 & 32) != 0) {
            bigDecimal4 = utaModifyOrderParams.tpTriggerPrice;
        }
        if ((i11 & 64) != 0) {
            str3 = utaModifyOrderParams.tpTriggerPriceType;
        }
        if ((i11 & 128) != 0) {
            bigDecimal5 = utaModifyOrderParams.slTriggerPrice;
        }
        if ((i11 & 256) != 0) {
            str4 = utaModifyOrderParams.slTriggerPriceType;
        }
        if ((i11 & 512) != 0) {
            str5 = utaModifyOrderParams.channel;
        }
        if ((i11 & 1024) != 0) {
            str6 = utaModifyOrderParams.sizeUnit;
        }
        String str7 = str5;
        String str8 = str6;
        BigDecimal bigDecimal6 = bigDecimal5;
        String str9 = str4;
        BigDecimal bigDecimal7 = bigDecimal4;
        String str10 = str3;
        BigDecimal bigDecimal8 = bigDecimal3;
        BigDecimal bigDecimal9 = bigDecimal;
        return utaModifyOrderParams.copy(str, str2, bigDecimal9, bigDecimal2, bigDecimal8, bigDecimal7, str10, bigDecimal6, str9, str7, str8);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UtaModifyOrderParams)) {
            return false;
        }
        UtaModifyOrderParams utaModifyOrderParams = (UtaModifyOrderParams) other;
        return Intrinsics.areEqual(this.symbol, utaModifyOrderParams.symbol) && Intrinsics.areEqual(this.orderId, utaModifyOrderParams.orderId) && Intrinsics.areEqual(this.newPrice, utaModifyOrderParams.newPrice) && Intrinsics.areEqual(this.newSize, utaModifyOrderParams.newSize) && Intrinsics.areEqual(this.visibleSize, utaModifyOrderParams.visibleSize) && Intrinsics.areEqual(this.tpTriggerPrice, utaModifyOrderParams.tpTriggerPrice) && Intrinsics.areEqual(this.tpTriggerPriceType, utaModifyOrderParams.tpTriggerPriceType) && Intrinsics.areEqual(this.slTriggerPrice, utaModifyOrderParams.slTriggerPrice) && Intrinsics.areEqual(this.slTriggerPriceType, utaModifyOrderParams.slTriggerPriceType) && Intrinsics.areEqual(this.channel, utaModifyOrderParams.channel) && Intrinsics.areEqual(this.sizeUnit, utaModifyOrderParams.sizeUnit);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSizeUnit() {
        return this.sizeUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getNewPrice() {
        return this.newPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getNewSize() {
        return this.newSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getVisibleSize() {
        return this.visibleSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getTpTriggerPrice() {
        return this.tpTriggerPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTpTriggerPriceType() {
        return this.tpTriggerPriceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getSlTriggerPrice() {
        return this.slTriggerPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSlTriggerPriceType() {
        return this.slTriggerPriceType;
    }

    @NotNull
    public final UtaModifyOrderParams copy(@Nullable String symbol, @Nullable String orderId, @Nullable BigDecimal newPrice, @Nullable BigDecimal newSize, @Nullable BigDecimal visibleSize, @Nullable BigDecimal tpTriggerPrice, @Nullable String tpTriggerPriceType, @Nullable BigDecimal slTriggerPrice, @Nullable String slTriggerPriceType, @Nullable String channel, @NotNull String sizeUnit) {
        Intrinsics.checkNotNullParameter(sizeUnit, "sizeUnit");
        return new UtaModifyOrderParams(symbol, orderId, newPrice, newSize, visibleSize, tpTriggerPrice, tpTriggerPriceType, slTriggerPrice, slTriggerPriceType, channel, sizeUnit);
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final BigDecimal getNewPrice() {
        return this.newPrice;
    }

    @Nullable
    public final BigDecimal getNewSize() {
        return this.newSize;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getSizeUnit() {
        return this.sizeUnit;
    }

    @Nullable
    public final BigDecimal getSlTriggerPrice() {
        return this.slTriggerPrice;
    }

    @Nullable
    public final String getSlTriggerPriceType() {
        return this.slTriggerPriceType;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getTpTriggerPrice() {
        return this.tpTriggerPrice;
    }

    @Nullable
    public final String getTpTriggerPriceType() {
        return this.tpTriggerPriceType;
    }

    @Nullable
    public final BigDecimal getVisibleSize() {
        return this.visibleSize;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.newPrice;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.newSize;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.visibleSize;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.tpTriggerPrice;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str3 = this.tpTriggerPriceType;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.slTriggerPrice;
        int iHashCode8 = (iHashCode7 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str4 = this.slTriggerPriceType;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.channel;
        return ((iHashCode9 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.sizeUnit.hashCode();
    }

    @NotNull
    public String toString() {
        return "UtaModifyOrderParams(symbol=" + this.symbol + ", orderId=" + this.orderId + ", newPrice=" + this.newPrice + ", newSize=" + this.newSize + ", visibleSize=" + this.visibleSize + ", tpTriggerPrice=" + this.tpTriggerPrice + ", tpTriggerPriceType=" + this.tpTriggerPriceType + ", slTriggerPrice=" + this.slTriggerPrice + ", slTriggerPriceType=" + this.slTriggerPriceType + ", channel=" + this.channel + ", sizeUnit=" + this.sizeUnit + ')';
    }

    public /* synthetic */ UtaModifyOrderParams(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str3, BigDecimal bigDecimal5, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, str3, bigDecimal5, str4, str5, (i11 & 1024) != 0 ? "UNIT" : str6);
    }
}
