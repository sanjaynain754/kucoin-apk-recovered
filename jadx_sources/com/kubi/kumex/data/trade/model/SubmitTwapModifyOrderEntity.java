package com.kubi.kumex.data.trade.model;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubmitModifyOrderEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0092\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00064"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/SubmitTwapModifyOrderEntity;", "", "orderId", "", "symbol", "size", "Ljava/math/BigDecimal;", "twapDurationSec", "", "twapIntervalSec", "twapPriceLimit", "twapDistanceType", "twapDistanceValue", "side", AppsFlyerProperties.CHANNEL, "validationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getSymbol", "getSize", "()Ljava/math/BigDecimal;", "getTwapDurationSec", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTwapIntervalSec", "getTwapPriceLimit", "getTwapDistanceType", "getTwapDistanceValue", "getSide", "getChannel", "getValidationToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kumex/data/trade/model/SubmitTwapModifyOrderEntity;", "equals", "", "other", "hashCode", "", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SubmitTwapModifyOrderEntity {

    @Nullable
    private final String channel;

    @Nullable
    private final String orderId;

    @Nullable
    private final String side;

    @Nullable
    private final BigDecimal size;

    @Nullable
    private final String symbol;

    @Nullable
    private final String twapDistanceType;

    @Nullable
    private final BigDecimal twapDistanceValue;

    @Nullable
    private final Long twapDurationSec;

    @Nullable
    private final Long twapIntervalSec;

    @Nullable
    private final BigDecimal twapPriceLimit;

    @Nullable
    private final transient String validationToken;

    public SubmitTwapModifyOrderEntity(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable Long l11, @Nullable Long l12, @Nullable BigDecimal bigDecimal2, @Nullable String str3, @Nullable BigDecimal bigDecimal3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.orderId = str;
        this.symbol = str2;
        this.size = bigDecimal;
        this.twapDurationSec = l11;
        this.twapIntervalSec = l12;
        this.twapPriceLimit = bigDecimal2;
        this.twapDistanceType = str3;
        this.twapDistanceValue = bigDecimal3;
        this.side = str4;
        this.channel = str5;
        this.validationToken = str6;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitTwapModifyOrderEntity)) {
            return false;
        }
        SubmitTwapModifyOrderEntity submitTwapModifyOrderEntity = (SubmitTwapModifyOrderEntity) other;
        return Intrinsics.areEqual(this.orderId, submitTwapModifyOrderEntity.orderId) && Intrinsics.areEqual(this.symbol, submitTwapModifyOrderEntity.symbol) && Intrinsics.areEqual(this.size, submitTwapModifyOrderEntity.size) && Intrinsics.areEqual(this.twapDurationSec, submitTwapModifyOrderEntity.twapDurationSec) && Intrinsics.areEqual(this.twapIntervalSec, submitTwapModifyOrderEntity.twapIntervalSec) && Intrinsics.areEqual(this.twapPriceLimit, submitTwapModifyOrderEntity.twapPriceLimit) && Intrinsics.areEqual(this.twapDistanceType, submitTwapModifyOrderEntity.twapDistanceType) && Intrinsics.areEqual(this.twapDistanceValue, submitTwapModifyOrderEntity.twapDistanceValue) && Intrinsics.areEqual(this.side, submitTwapModifyOrderEntity.side) && Intrinsics.areEqual(this.channel, submitTwapModifyOrderEntity.channel) && Intrinsics.areEqual(this.validationToken, submitTwapModifyOrderEntity.validationToken);
    }

    public static /* synthetic */ SubmitTwapModifyOrderEntity copy$default(SubmitTwapModifyOrderEntity submitTwapModifyOrderEntity, String str, String str2, BigDecimal bigDecimal, Long l11, Long l12, BigDecimal bigDecimal2, String str3, BigDecimal bigDecimal3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = submitTwapModifyOrderEntity.orderId;
        }
        if ((i11 & 2) != 0) {
            str2 = submitTwapModifyOrderEntity.symbol;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = submitTwapModifyOrderEntity.size;
        }
        if ((i11 & 8) != 0) {
            l11 = submitTwapModifyOrderEntity.twapDurationSec;
        }
        if ((i11 & 16) != 0) {
            l12 = submitTwapModifyOrderEntity.twapIntervalSec;
        }
        if ((i11 & 32) != 0) {
            bigDecimal2 = submitTwapModifyOrderEntity.twapPriceLimit;
        }
        if ((i11 & 64) != 0) {
            str3 = submitTwapModifyOrderEntity.twapDistanceType;
        }
        if ((i11 & 128) != 0) {
            bigDecimal3 = submitTwapModifyOrderEntity.twapDistanceValue;
        }
        if ((i11 & 256) != 0) {
            str4 = submitTwapModifyOrderEntity.side;
        }
        if ((i11 & 512) != 0) {
            str5 = submitTwapModifyOrderEntity.channel;
        }
        if ((i11 & 1024) != 0) {
            str6 = submitTwapModifyOrderEntity.validationToken;
        }
        String str7 = str5;
        String str8 = str6;
        BigDecimal bigDecimal4 = bigDecimal3;
        String str9 = str4;
        BigDecimal bigDecimal5 = bigDecimal2;
        String str10 = str3;
        Long l13 = l12;
        BigDecimal bigDecimal6 = bigDecimal;
        return submitTwapModifyOrderEntity.copy(str, str2, bigDecimal6, l11, l13, bigDecimal5, str10, bigDecimal4, str9, str7, str8);
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
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTwapDurationSec() {
        return this.twapDurationSec;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTwapIntervalSec() {
        return this.twapIntervalSec;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getTwapPriceLimit() {
        return this.twapPriceLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTwapDistanceType() {
        return this.twapDistanceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getTwapDistanceValue() {
        return this.twapDistanceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @NotNull
    public final SubmitTwapModifyOrderEntity copy(@Nullable String orderId, @Nullable String symbol, @Nullable BigDecimal size, @Nullable Long twapDurationSec, @Nullable Long twapIntervalSec, @Nullable BigDecimal twapPriceLimit, @Nullable String twapDistanceType, @Nullable BigDecimal twapDistanceValue, @Nullable String side, @Nullable String channel, @Nullable String validationToken) {
        return new SubmitTwapModifyOrderEntity(orderId, symbol, size, twapDurationSec, twapIntervalSec, twapPriceLimit, twapDistanceType, twapDistanceValue, side, channel, validationToken);
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
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getTwapDistanceType() {
        return this.twapDistanceType;
    }

    @Nullable
    public final BigDecimal getTwapDistanceValue() {
        return this.twapDistanceValue;
    }

    @Nullable
    public final Long getTwapDurationSec() {
        return this.twapDurationSec;
    }

    @Nullable
    public final Long getTwapIntervalSec() {
        return this.twapIntervalSec;
    }

    @Nullable
    public final BigDecimal getTwapPriceLimit() {
        return this.twapPriceLimit;
    }

    @Nullable
    public final String getValidationToken() {
        return this.validationToken;
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.size;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Long l11 = this.twapDurationSec;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.twapIntervalSec;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.twapPriceLimit;
        int iHashCode6 = (iHashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str3 = this.twapDistanceType;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.twapDistanceValue;
        int iHashCode8 = (iHashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str4 = this.side;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.channel;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.validationToken;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SubmitTwapModifyOrderEntity(orderId=" + this.orderId + ", symbol=" + this.symbol + ", size=" + this.size + ", twapDurationSec=" + this.twapDurationSec + ", twapIntervalSec=" + this.twapIntervalSec + ", twapPriceLimit=" + this.twapPriceLimit + ", twapDistanceType=" + this.twapDistanceType + ", twapDistanceValue=" + this.twapDistanceValue + ", side=" + this.side + ", channel=" + this.channel + ", validationToken=" + this.validationToken + ')';
    }

    public /* synthetic */ SubmitTwapModifyOrderEntity(String str, String str2, BigDecimal bigDecimal, Long l11, Long l12, BigDecimal bigDecimal2, String str3, BigDecimal bigDecimal3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bigDecimal, l11, l12, bigDecimal2, str3, bigDecimal3, str4, str5, (i11 & 1024) != 0 ? null : str6);
    }
}
