package com.kubi.payment.p2p.data.entities;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PTrade.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\"\u001a\u00020\tJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0086\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\rHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\b\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b!\u0010\u0016¨\u00063"}, m90084d2 = {"Lcom/kubi/payment/p2p/data/entities/TradeInfo;", "", "adSide", "", "appealingStatus", "createdAt", "", "digitalCurrency", "isMerchant", "", "legalCurrency", "orderId", "orderNumber", "", "orderStatus", "autoCancelOrderExpire", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)V", "getAdSide", "()Ljava/lang/String;", "getAppealingStatus", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDigitalCurrency", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLegalCurrency", "getOrderId", "getOrderNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOrderStatus", "getAutoCancelOrderExpire", "isBuy", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/payment/p2p/data/entities/TradeInfo;", "equals", "other", "hashCode", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TradeInfo {

    @Nullable
    private final String adSide;

    @Nullable
    private final String appealingStatus;

    @Nullable
    private final Long autoCancelOrderExpire;

    @Nullable
    private final Long createdAt;

    @Nullable
    private final String digitalCurrency;

    @Nullable
    private final Boolean isMerchant;

    @Nullable
    private final String legalCurrency;

    @Nullable
    private final String orderId;

    @Nullable
    private final Integer orderNumber;

    @Nullable
    private final String orderStatus;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeInfo)) {
            return false;
        }
        TradeInfo tradeInfo = (TradeInfo) other;
        return Intrinsics.areEqual(this.adSide, tradeInfo.adSide) && Intrinsics.areEqual(this.appealingStatus, tradeInfo.appealingStatus) && Intrinsics.areEqual(this.createdAt, tradeInfo.createdAt) && Intrinsics.areEqual(this.digitalCurrency, tradeInfo.digitalCurrency) && Intrinsics.areEqual(this.isMerchant, tradeInfo.isMerchant) && Intrinsics.areEqual(this.legalCurrency, tradeInfo.legalCurrency) && Intrinsics.areEqual(this.orderId, tradeInfo.orderId) && Intrinsics.areEqual(this.orderNumber, tradeInfo.orderNumber) && Intrinsics.areEqual(this.orderStatus, tradeInfo.orderStatus) && Intrinsics.areEqual(this.autoCancelOrderExpire, tradeInfo.autoCancelOrderExpire);
    }

    public static /* synthetic */ TradeInfo copy$default(TradeInfo tradeInfo, String str, String str2, Long l11, String str3, Boolean bool, String str4, String str5, Integer num, String str6, Long l12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tradeInfo.adSide;
        }
        if ((i11 & 2) != 0) {
            str2 = tradeInfo.appealingStatus;
        }
        if ((i11 & 4) != 0) {
            l11 = tradeInfo.createdAt;
        }
        if ((i11 & 8) != 0) {
            str3 = tradeInfo.digitalCurrency;
        }
        if ((i11 & 16) != 0) {
            bool = tradeInfo.isMerchant;
        }
        if ((i11 & 32) != 0) {
            str4 = tradeInfo.legalCurrency;
        }
        if ((i11 & 64) != 0) {
            str5 = tradeInfo.orderId;
        }
        if ((i11 & 128) != 0) {
            num = tradeInfo.orderNumber;
        }
        if ((i11 & 256) != 0) {
            str6 = tradeInfo.orderStatus;
        }
        if ((i11 & 512) != 0) {
            l12 = tradeInfo.autoCancelOrderExpire;
        }
        String str7 = str6;
        Long l13 = l12;
        String str8 = str5;
        Integer num2 = num;
        Boolean bool2 = bool;
        String str9 = str4;
        return tradeInfo.copy(str, str2, l11, str3, bool2, str9, str8, num2, str7, l13);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAdSide() {
        return this.adSide;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getAutoCancelOrderExpire() {
        return this.autoCancelOrderExpire;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppealingStatus() {
        return this.appealingStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDigitalCurrency() {
        return this.digitalCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsMerchant() {
        return this.isMerchant;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLegalCurrency() {
        return this.legalCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getOrderNumber() {
        return this.orderNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    @NotNull
    public final TradeInfo copy(@Nullable String adSide, @Nullable String appealingStatus, @Nullable Long createdAt, @Nullable String digitalCurrency, @Nullable Boolean isMerchant, @Nullable String legalCurrency, @Nullable String orderId, @Nullable Integer orderNumber, @Nullable String orderStatus, @Nullable Long autoCancelOrderExpire) {
        return new TradeInfo(adSide, appealingStatus, createdAt, digitalCurrency, isMerchant, legalCurrency, orderId, orderNumber, orderStatus, autoCancelOrderExpire);
    }

    @Nullable
    public final String getAdSide() {
        return this.adSide;
    }

    @Nullable
    public final String getAppealingStatus() {
        return this.appealingStatus;
    }

    @Nullable
    public final Long getAutoCancelOrderExpire() {
        return this.autoCancelOrderExpire;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getDigitalCurrency() {
        return this.digitalCurrency;
    }

    @Nullable
    public final String getLegalCurrency() {
        return this.legalCurrency;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final Integer getOrderNumber() {
        return this.orderNumber;
    }

    @Nullable
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    public int hashCode() {
        String str = this.adSide;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appealingStatus;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.createdAt;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.digitalCurrency;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isMerchant;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.legalCurrency;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.orderId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.orderNumber;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.orderStatus;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l12 = this.autoCancelOrderExpire;
        return iHashCode9 + (l12 != null ? l12.hashCode() : 0);
    }

    public final boolean isBuy() {
        return Intrinsics.areEqual("SELL", this.adSide);
    }

    @Nullable
    public final Boolean isMerchant() {
        return this.isMerchant;
    }

    @NotNull
    public String toString() {
        return "TradeInfo(adSide=" + this.adSide + ", appealingStatus=" + this.appealingStatus + ", createdAt=" + this.createdAt + ", digitalCurrency=" + this.digitalCurrency + ", isMerchant=" + this.isMerchant + ", legalCurrency=" + this.legalCurrency + ", orderId=" + this.orderId + ", orderNumber=" + this.orderNumber + ", orderStatus=" + this.orderStatus + ", autoCancelOrderExpire=" + this.autoCancelOrderExpire + ')';
    }

    public TradeInfo(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable String str6, @Nullable Long l12) {
        this.adSide = str;
        this.appealingStatus = str2;
        this.createdAt = l11;
        this.digitalCurrency = str3;
        this.isMerchant = bool;
        this.legalCurrency = str4;
        this.orderId = str5;
        this.orderNumber = num;
        this.orderStatus = str6;
        this.autoCancelOrderExpire = l12;
    }
}
