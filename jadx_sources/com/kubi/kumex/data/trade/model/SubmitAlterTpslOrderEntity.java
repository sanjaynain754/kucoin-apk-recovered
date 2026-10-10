package com.kubi.kumex.data.trade.model;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubmitModifyOrderEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¥\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00066"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/SubmitAlterTpslOrderEntity;", "", AppsFlyerProperties.CHANNEL, "", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "size", "stopPriceType", "symbol", "orderId", "side", "triggerStopUpPrice", "triggerStopDownPrice", "type", InterfaceC33730j9.f70350a, "stopPrice", "validationToken", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getPrice", "()Ljava/math/BigDecimal;", "getSize", "getStopPriceType", "getSymbol", "getOrderId", "getSide", "getTriggerStopUpPrice", "getTriggerStopDownPrice", "getType", "getStop", "getStopPrice", "getValidationToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SubmitAlterTpslOrderEntity {

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
    private final String stop;

    @Nullable
    private final BigDecimal stopPrice;

    @Nullable
    private final String stopPriceType;

    @Nullable
    private final String symbol;

    @Nullable
    private final BigDecimal triggerStopDownPrice;

    @Nullable
    private final BigDecimal triggerStopUpPrice;

    @Nullable
    private final String type;

    @Nullable
    private final transient String validationToken;

    public SubmitAlterTpslOrderEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable String str6, @Nullable String str7, @Nullable BigDecimal bigDecimal5, @Nullable String str8) {
        this.channel = str;
        this.price = bigDecimal;
        this.size = bigDecimal2;
        this.stopPriceType = str2;
        this.symbol = str3;
        this.orderId = str4;
        this.side = str5;
        this.triggerStopUpPrice = bigDecimal3;
        this.triggerStopDownPrice = bigDecimal4;
        this.type = str6;
        this.stop = str7;
        this.stopPrice = bigDecimal5;
        this.validationToken = str8;
    }

    public static /* synthetic */ SubmitAlterTpslOrderEntity copy$default(SubmitAlterTpslOrderEntity submitAlterTpslOrderEntity, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, String str4, String str5, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str6, String str7, BigDecimal bigDecimal5, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = submitAlterTpslOrderEntity.channel;
        }
        return submitAlterTpslOrderEntity.copy(str, (i11 & 2) != 0 ? submitAlterTpslOrderEntity.price : bigDecimal, (i11 & 4) != 0 ? submitAlterTpslOrderEntity.size : bigDecimal2, (i11 & 8) != 0 ? submitAlterTpslOrderEntity.stopPriceType : str2, (i11 & 16) != 0 ? submitAlterTpslOrderEntity.symbol : str3, (i11 & 32) != 0 ? submitAlterTpslOrderEntity.orderId : str4, (i11 & 64) != 0 ? submitAlterTpslOrderEntity.side : str5, (i11 & 128) != 0 ? submitAlterTpslOrderEntity.triggerStopUpPrice : bigDecimal3, (i11 & 256) != 0 ? submitAlterTpslOrderEntity.triggerStopDownPrice : bigDecimal4, (i11 & 512) != 0 ? submitAlterTpslOrderEntity.type : str6, (i11 & 1024) != 0 ? submitAlterTpslOrderEntity.stop : str7, (i11 & 2048) != 0 ? submitAlterTpslOrderEntity.stopPrice : bigDecimal5, (i11 & 4096) != 0 ? submitAlterTpslOrderEntity.validationToken : str8);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitAlterTpslOrderEntity)) {
            return false;
        }
        SubmitAlterTpslOrderEntity submitAlterTpslOrderEntity = (SubmitAlterTpslOrderEntity) other;
        return Intrinsics.areEqual(this.channel, submitAlterTpslOrderEntity.channel) && Intrinsics.areEqual(this.price, submitAlterTpslOrderEntity.price) && Intrinsics.areEqual(this.size, submitAlterTpslOrderEntity.size) && Intrinsics.areEqual(this.stopPriceType, submitAlterTpslOrderEntity.stopPriceType) && Intrinsics.areEqual(this.symbol, submitAlterTpslOrderEntity.symbol) && Intrinsics.areEqual(this.orderId, submitAlterTpslOrderEntity.orderId) && Intrinsics.areEqual(this.side, submitAlterTpslOrderEntity.side) && Intrinsics.areEqual(this.triggerStopUpPrice, submitAlterTpslOrderEntity.triggerStopUpPrice) && Intrinsics.areEqual(this.triggerStopDownPrice, submitAlterTpslOrderEntity.triggerStopDownPrice) && Intrinsics.areEqual(this.type, submitAlterTpslOrderEntity.type) && Intrinsics.areEqual(this.stop, submitAlterTpslOrderEntity.stop) && Intrinsics.areEqual(this.stopPrice, submitAlterTpslOrderEntity.stopPrice) && Intrinsics.areEqual(this.validationToken, submitAlterTpslOrderEntity.validationToken);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStop() {
        return this.stop;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getStopPrice() {
        return this.stopPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getValidationToken() {
        return this.validationToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStopPriceType() {
        return this.stopPriceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getTriggerStopUpPrice() {
        return this.triggerStopUpPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getTriggerStopDownPrice() {
        return this.triggerStopDownPrice;
    }

    @NotNull
    public final SubmitAlterTpslOrderEntity copy(@Nullable String channel, @Nullable BigDecimal price, @Nullable BigDecimal size, @Nullable String stopPriceType, @Nullable String symbol, @Nullable String orderId, @Nullable String side, @Nullable BigDecimal triggerStopUpPrice, @Nullable BigDecimal triggerStopDownPrice, @Nullable String type, @Nullable String stop, @Nullable BigDecimal stopPrice, @Nullable String validationToken) {
        return new SubmitAlterTpslOrderEntity(channel, price, size, stopPriceType, symbol, orderId, side, triggerStopUpPrice, triggerStopDownPrice, type, stop, stopPrice, validationToken);
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
    public final String getStop() {
        return this.stop;
    }

    @Nullable
    public final BigDecimal getStopPrice() {
        return this.stopPrice;
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
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getValidationToken() {
        return this.validationToken;
    }

    public int hashCode() {
        String str = this.channel;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.price;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.size;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.stopPriceType;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.side;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.triggerStopUpPrice;
        int iHashCode8 = (iHashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.triggerStopDownPrice;
        int iHashCode9 = (iHashCode8 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str6 = this.type;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.stop;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.stopPrice;
        int iHashCode12 = (iHashCode11 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str8 = this.validationToken;
        return iHashCode12 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SubmitAlterTpslOrderEntity(channel=" + this.channel + ", price=" + this.price + ", size=" + this.size + ", stopPriceType=" + this.stopPriceType + ", symbol=" + this.symbol + ", orderId=" + this.orderId + ", side=" + this.side + ", triggerStopUpPrice=" + this.triggerStopUpPrice + ", triggerStopDownPrice=" + this.triggerStopDownPrice + ", type=" + this.type + ", stop=" + this.stop + ", stopPrice=" + this.stopPrice + ", validationToken=" + this.validationToken + ')';
    }

    public /* synthetic */ SubmitAlterTpslOrderEntity(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, String str3, String str4, String str5, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str6, String str7, BigDecimal bigDecimal5, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bigDecimal, bigDecimal2, str2, str3, str4, str5, bigDecimal3, bigDecimal4, str6, str7, bigDecimal5, (i11 & 4096) != 0 ? null : str8);
    }
}
