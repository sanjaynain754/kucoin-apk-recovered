package com.kubi.kumex.data.trade.model;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubmitModifyOrderEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00060"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;", "", "orderId", "", "symbol", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "size", "visibleSize", "triggerStopUpPrice", "triggerStopDownPrice", "stopPriceType", "side", AppsFlyerProperties.CHANNEL, "validationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getSymbol", "getPrice", "()Ljava/math/BigDecimal;", "getSize", "getVisibleSize", "getTriggerStopUpPrice", "getTriggerStopDownPrice", "getStopPriceType", "getSide", "getChannel", "getValidationToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SubmitModifyOrderEntity {

    @Nullable
    private final String channel;

    @Nullable
    private final String orderId;

    @Nullable
    private final BigDecimal price;

    @Nullable
    private final String side;

    @Nullable
    private final BigDecimal size;

    @Nullable
    private final String stopPriceType;

    @Nullable
    private final String symbol;

    @Nullable
    private final BigDecimal triggerStopDownPrice;

    @Nullable
    private final BigDecimal triggerStopUpPrice;

    @Nullable
    private final transient String validationToken;

    @Nullable
    private final BigDecimal visibleSize;

    public SubmitModifyOrderEntity(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.orderId = str;
        this.symbol = str2;
        this.price = bigDecimal;
        this.size = bigDecimal2;
        this.visibleSize = bigDecimal3;
        this.triggerStopUpPrice = bigDecimal4;
        this.triggerStopDownPrice = bigDecimal5;
        this.stopPriceType = str3;
        this.side = str4;
        this.channel = str5;
        this.validationToken = str6;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitModifyOrderEntity)) {
            return false;
        }
        SubmitModifyOrderEntity submitModifyOrderEntity = (SubmitModifyOrderEntity) other;
        return Intrinsics.areEqual(this.orderId, submitModifyOrderEntity.orderId) && Intrinsics.areEqual(this.symbol, submitModifyOrderEntity.symbol) && Intrinsics.areEqual(this.price, submitModifyOrderEntity.price) && Intrinsics.areEqual(this.size, submitModifyOrderEntity.size) && Intrinsics.areEqual(this.visibleSize, submitModifyOrderEntity.visibleSize) && Intrinsics.areEqual(this.triggerStopUpPrice, submitModifyOrderEntity.triggerStopUpPrice) && Intrinsics.areEqual(this.triggerStopDownPrice, submitModifyOrderEntity.triggerStopDownPrice) && Intrinsics.areEqual(this.stopPriceType, submitModifyOrderEntity.stopPriceType) && Intrinsics.areEqual(this.side, submitModifyOrderEntity.side) && Intrinsics.areEqual(this.channel, submitModifyOrderEntity.channel) && Intrinsics.areEqual(this.validationToken, submitModifyOrderEntity.validationToken);
    }

    public static /* synthetic */ SubmitModifyOrderEntity copy$default(SubmitModifyOrderEntity submitModifyOrderEntity, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = submitModifyOrderEntity.orderId;
        }
        if ((i11 & 2) != 0) {
            str2 = submitModifyOrderEntity.symbol;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = submitModifyOrderEntity.price;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = submitModifyOrderEntity.size;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = submitModifyOrderEntity.visibleSize;
        }
        if ((i11 & 32) != 0) {
            bigDecimal4 = submitModifyOrderEntity.triggerStopUpPrice;
        }
        if ((i11 & 64) != 0) {
            bigDecimal5 = submitModifyOrderEntity.triggerStopDownPrice;
        }
        if ((i11 & 128) != 0) {
            str3 = submitModifyOrderEntity.stopPriceType;
        }
        if ((i11 & 256) != 0) {
            str4 = submitModifyOrderEntity.side;
        }
        if ((i11 & 512) != 0) {
            str5 = submitModifyOrderEntity.channel;
        }
        if ((i11 & 1024) != 0) {
            str6 = submitModifyOrderEntity.validationToken;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        BigDecimal bigDecimal6 = bigDecimal4;
        BigDecimal bigDecimal7 = bigDecimal5;
        BigDecimal bigDecimal8 = bigDecimal3;
        BigDecimal bigDecimal9 = bigDecimal;
        return submitModifyOrderEntity.copy(str, str2, bigDecimal9, bigDecimal2, bigDecimal8, bigDecimal6, bigDecimal7, str9, str10, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getValidationToken() {
        return this.validationToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getVisibleSize() {
        return this.visibleSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getTriggerStopUpPrice() {
        return this.triggerStopUpPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getTriggerStopDownPrice() {
        return this.triggerStopDownPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStopPriceType() {
        return this.stopPriceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @NotNull
    public final SubmitModifyOrderEntity copy(@Nullable String orderId, @Nullable String symbol, @Nullable BigDecimal price, @Nullable BigDecimal size, @Nullable BigDecimal visibleSize, @Nullable BigDecimal triggerStopUpPrice, @Nullable BigDecimal triggerStopDownPrice, @Nullable String stopPriceType, @Nullable String side, @Nullable String channel, @Nullable String validationToken) {
        return new SubmitModifyOrderEntity(orderId, symbol, price, size, visibleSize, triggerStopUpPrice, triggerStopDownPrice, stopPriceType, side, channel, validationToken);
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
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
    public final String getStopPriceType() {
        return this.stopPriceType;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getTriggerStopDownPrice() {
        return this.triggerStopDownPrice;
    }

    @Nullable
    public final BigDecimal getTriggerStopUpPrice() {
        return this.triggerStopUpPrice;
    }

    @Nullable
    public final String getValidationToken() {
        return this.validationToken;
    }

    @Nullable
    public final BigDecimal getVisibleSize() {
        return this.visibleSize;
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.price;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.size;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.visibleSize;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.triggerStopUpPrice;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.triggerStopDownPrice;
        int iHashCode7 = (iHashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str3 = this.stopPriceType;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.side;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.channel;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.validationToken;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SubmitModifyOrderEntity(orderId=" + this.orderId + ", symbol=" + this.symbol + ", price=" + this.price + ", size=" + this.size + ", visibleSize=" + this.visibleSize + ", triggerStopUpPrice=" + this.triggerStopUpPrice + ", triggerStopDownPrice=" + this.triggerStopDownPrice + ", stopPriceType=" + this.stopPriceType + ", side=" + this.side + ", channel=" + this.channel + ", validationToken=" + this.validationToken + ')';
    }

    public /* synthetic */ SubmitModifyOrderEntity(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, str3, str4, str5, (i11 & 1024) != 0 ? null : str6);
    }
}
