package com.kubi.otc.entity;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.otc.R$color;
import com.kubi.otc.R$string;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0001UBÃ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u000208J\u0006\u00109\u001a\u00020:J\u0006\u0010;\u001a\u00020\u0014J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010K\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jð\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010PJ\u0013\u0010Q\u001a\u00020\u00142\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010S\u001a\u00020:HÖ\u0001J\t\u0010T\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u00101\u001a\u0004\b2\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001cR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001cR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001c¨\u0006V"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatRechargeInfo;", "", "orderId", "", "status", "channelType", "paymentMethodCode", "channelId", "channelName", "createdAt", "", "payinAmount", "payinCurrency", "depositPayinAmount", "depositPayinCurrency", "feeAmount", "feeCurrency", "errorReason", "Lcom/kubi/otc/entity/RechargeErrorInfo;", "customerRefundEntrance", "", "customerRefundFail", "fiatCurrency", "taxAmount", "taxCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/RechargeErrorInfo;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "setOrderId", "(Ljava/lang/String;)V", "getStatus", "getChannelType", "getPaymentMethodCode", "getChannelId", "getChannelName", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPayinAmount", "getPayinCurrency", "getDepositPayinAmount", "getDepositPayinCurrency", "getFeeAmount", "getFeeCurrency", "getErrorReason", "()Lcom/kubi/otc/entity/RechargeErrorInfo;", "getCustomerRefundEntrance", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCustomerRefundFail", "getFiatCurrency", "getTaxAmount", "getTaxCurrency", "getStatusString", "context", "Landroid/content/Context;", "getStatusColor", "", "isSuccess", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/RechargeErrorInfo;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/otc/entity/FiatRechargeInfo;", "equals", "other", "hashCode", "toString", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatRechargeInfo {

    @NotNull
    public static final String HIGH_THAN_DAY_LIMIT_BATCH = "HIGH_THAN_DAY_LIMIT_BATCH";

    @NotNull
    public static final String HIGH_THAN_DAY_LIMIT_REFUND = "HIGH_THAN_DAY_LIMIT_REFUND";

    @NotNull
    public static final String HIGH_THAN_LIMIT = "HIGH_THAN_LIMIT";

    @NotNull
    public static final String HIGH_THAN_MONTH_LIMIT_REFUND = "HIGH_THAN_MONTH_LIMIT_REFUND";

    @NotNull
    public static final String LOWER_THAN_LIMIT = "LOWER_THAN_LIMIT";

    @NotNull
    public static final String RISK_REJECT = "RISK_REJECT";

    @NotNull
    private static final String STATUS_DELAYED = "6";

    @NotNull
    private static final String STATUS_FAILED = "2";

    @NotNull
    private static final String STATUS_PROCESSING = "0";

    @NotNull
    private static final String STATUS_REFUND_COMPLETED = "5";

    @NotNull
    private static final String STATUS_REFUND_FAILED = "7";

    @NotNull
    private static final String STATUS_REFUND_PROCESSING = "4";

    @NotNull
    private static final String STATUS_SUCCESSFUL = "1";

    @Nullable
    private final String channelId;

    @Nullable
    private final String channelName;

    @Nullable
    private final String channelType;

    @Nullable
    private final Long createdAt;

    @Nullable
    private final Boolean customerRefundEntrance;

    @Nullable
    private final Boolean customerRefundFail;

    @Nullable
    private final String depositPayinAmount;

    @Nullable
    private final String depositPayinCurrency;

    @Nullable
    private final RechargeErrorInfo errorReason;

    @Nullable
    private final String feeAmount;

    @Nullable
    private final String feeCurrency;

    @Nullable
    private final String fiatCurrency;

    @NotNull
    private String orderId;

    @Nullable
    private final String payinAmount;

    @Nullable
    private final String payinCurrency;

    @Nullable
    private final String paymentMethodCode;

    @Nullable
    private final String status;

    @SerializedName("taxAmount")
    @Nullable
    private final String taxAmount;

    @SerializedName("taxCurrency")
    @Nullable
    private final String taxCurrency;

    public static /* synthetic */ FiatRechargeInfo copy$default(FiatRechargeInfo fiatRechargeInfo, String str, String str2, String str3, String str4, String str5, String str6, Long l11, String str7, String str8, String str9, String str10, String str11, String str12, RechargeErrorInfo rechargeErrorInfo, Boolean bool, Boolean bool2, String str13, String str14, String str15, int i11, Object obj) {
        String str16;
        String str17;
        String str18 = (i11 & 1) != 0 ? fiatRechargeInfo.orderId : str;
        String str19 = (i11 & 2) != 0 ? fiatRechargeInfo.status : str2;
        String str20 = (i11 & 4) != 0 ? fiatRechargeInfo.channelType : str3;
        String str21 = (i11 & 8) != 0 ? fiatRechargeInfo.paymentMethodCode : str4;
        String str22 = (i11 & 16) != 0 ? fiatRechargeInfo.channelId : str5;
        String str23 = (i11 & 32) != 0 ? fiatRechargeInfo.channelName : str6;
        Long l12 = (i11 & 64) != 0 ? fiatRechargeInfo.createdAt : l11;
        String str24 = (i11 & 128) != 0 ? fiatRechargeInfo.payinAmount : str7;
        String str25 = (i11 & 256) != 0 ? fiatRechargeInfo.payinCurrency : str8;
        String str26 = (i11 & 512) != 0 ? fiatRechargeInfo.depositPayinAmount : str9;
        String str27 = (i11 & 1024) != 0 ? fiatRechargeInfo.depositPayinCurrency : str10;
        String str28 = (i11 & 2048) != 0 ? fiatRechargeInfo.feeAmount : str11;
        String str29 = (i11 & 4096) != 0 ? fiatRechargeInfo.feeCurrency : str12;
        RechargeErrorInfo rechargeErrorInfo2 = (i11 & 8192) != 0 ? fiatRechargeInfo.errorReason : rechargeErrorInfo;
        String str30 = str18;
        Boolean bool3 = (i11 & 16384) != 0 ? fiatRechargeInfo.customerRefundEntrance : bool;
        Boolean bool4 = (i11 & 32768) != 0 ? fiatRechargeInfo.customerRefundFail : bool2;
        String str31 = (i11 & 65536) != 0 ? fiatRechargeInfo.fiatCurrency : str13;
        String str32 = (i11 & 131072) != 0 ? fiatRechargeInfo.taxAmount : str14;
        if ((i11 & 262144) != 0) {
            str17 = str32;
            str16 = fiatRechargeInfo.taxCurrency;
        } else {
            str16 = str15;
            str17 = str32;
        }
        return fiatRechargeInfo.copy(str30, str19, str20, str21, str22, str23, l12, str24, str25, str26, str27, str28, str29, rechargeErrorInfo2, bool3, bool4, str31, str17, str16);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiatRechargeInfo)) {
            return false;
        }
        FiatRechargeInfo fiatRechargeInfo = (FiatRechargeInfo) other;
        return Intrinsics.areEqual(this.orderId, fiatRechargeInfo.orderId) && Intrinsics.areEqual(this.status, fiatRechargeInfo.status) && Intrinsics.areEqual(this.channelType, fiatRechargeInfo.channelType) && Intrinsics.areEqual(this.paymentMethodCode, fiatRechargeInfo.paymentMethodCode) && Intrinsics.areEqual(this.channelId, fiatRechargeInfo.channelId) && Intrinsics.areEqual(this.channelName, fiatRechargeInfo.channelName) && Intrinsics.areEqual(this.createdAt, fiatRechargeInfo.createdAt) && Intrinsics.areEqual(this.payinAmount, fiatRechargeInfo.payinAmount) && Intrinsics.areEqual(this.payinCurrency, fiatRechargeInfo.payinCurrency) && Intrinsics.areEqual(this.depositPayinAmount, fiatRechargeInfo.depositPayinAmount) && Intrinsics.areEqual(this.depositPayinCurrency, fiatRechargeInfo.depositPayinCurrency) && Intrinsics.areEqual(this.feeAmount, fiatRechargeInfo.feeAmount) && Intrinsics.areEqual(this.feeCurrency, fiatRechargeInfo.feeCurrency) && Intrinsics.areEqual(this.errorReason, fiatRechargeInfo.errorReason) && Intrinsics.areEqual(this.customerRefundEntrance, fiatRechargeInfo.customerRefundEntrance) && Intrinsics.areEqual(this.customerRefundFail, fiatRechargeInfo.customerRefundFail) && Intrinsics.areEqual(this.fiatCurrency, fiatRechargeInfo.fiatCurrency) && Intrinsics.areEqual(this.taxAmount, fiatRechargeInfo.taxAmount) && Intrinsics.areEqual(this.taxCurrency, fiatRechargeInfo.taxCurrency);
    }

    public FiatRechargeInfo(@NotNull String orderId, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Long l11, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable RechargeErrorInfo rechargeErrorInfo, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.orderId = orderId;
        this.status = str;
        this.channelType = str2;
        this.paymentMethodCode = str3;
        this.channelId = str4;
        this.channelName = str5;
        this.createdAt = l11;
        this.payinAmount = str6;
        this.payinCurrency = str7;
        this.depositPayinAmount = str8;
        this.depositPayinCurrency = str9;
        this.feeAmount = str10;
        this.feeCurrency = str11;
        this.errorReason = rechargeErrorInfo;
        this.customerRefundEntrance = bool;
        this.customerRefundFail = bool2;
        this.fiatCurrency = str12;
        this.taxAmount = str13;
        this.taxCurrency = str14;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDepositPayinAmount() {
        return this.depositPayinAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDepositPayinCurrency() {
        return this.depositPayinCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFeeAmount() {
        return this.feeAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final RechargeErrorInfo getErrorReason() {
        return this.errorReason;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getCustomerRefundEntrance() {
        return this.customerRefundEntrance;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getCustomerRefundFail() {
        return this.customerRefundFail;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getTaxAmount() {
        return this.taxAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannelName() {
        return this.channelName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPayinAmount() {
        return this.payinAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPayinCurrency() {
        return this.payinCurrency;
    }

    @NotNull
    public final FiatRechargeInfo copy(@NotNull String orderId, @Nullable String status, @Nullable String channelType, @Nullable String paymentMethodCode, @Nullable String channelId, @Nullable String channelName, @Nullable Long createdAt, @Nullable String payinAmount, @Nullable String payinCurrency, @Nullable String depositPayinAmount, @Nullable String depositPayinCurrency, @Nullable String feeAmount, @Nullable String feeCurrency, @Nullable RechargeErrorInfo errorReason, @Nullable Boolean customerRefundEntrance, @Nullable Boolean customerRefundFail, @Nullable String fiatCurrency, @Nullable String taxAmount, @Nullable String taxCurrency) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new FiatRechargeInfo(orderId, status, channelType, paymentMethodCode, channelId, channelName, createdAt, payinAmount, payinCurrency, depositPayinAmount, depositPayinCurrency, feeAmount, feeCurrency, errorReason, customerRefundEntrance, customerRefundFail, fiatCurrency, taxAmount, taxCurrency);
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final String getChannelName() {
        return this.channelName;
    }

    @Nullable
    public final String getChannelType() {
        return this.channelType;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final Boolean getCustomerRefundEntrance() {
        return this.customerRefundEntrance;
    }

    @Nullable
    public final Boolean getCustomerRefundFail() {
        return this.customerRefundFail;
    }

    @Nullable
    public final String getDepositPayinAmount() {
        return this.depositPayinAmount;
    }

    @Nullable
    public final String getDepositPayinCurrency() {
        return this.depositPayinCurrency;
    }

    @Nullable
    public final RechargeErrorInfo getErrorReason() {
        return this.errorReason;
    }

    @Nullable
    public final String getFeeAmount() {
        return this.feeAmount;
    }

    @Nullable
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    @Nullable
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getPayinAmount() {
        return this.payinAmount;
    }

    @Nullable
    public final String getPayinCurrency() {
        return this.payinCurrency;
    }

    @Nullable
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r0.equals(com.kubi.otc.entity.FiatRechargeInfo.STATUS_DELAYED) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        if (r0.equals("5") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r0.equals("4") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r0.equals("2") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        return com.kubi.otc.R$color.secondary;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r0.equals("7") == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getStatusColor() {
        String str = this.status;
        if (str != null) {
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        return R$color.primary;
                    }
                    break;
                case 50:
                    break;
                case 52:
                    break;
                case 53:
                    break;
                case 54:
                    break;
                case 55:
                    break;
            }
        }
        return R$color.complementary;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    @NotNull
    public final String getStatusString(@NotNull Context context) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.status;
        if (str != null) {
            switch (str.hashCode()) {
                case 48:
                    if (!str.equals("0")) {
                        string = context.getString(R$string.in_progress);
                    } else {
                        string = context.getString(R$string.in_progress);
                    }
                    break;
                case 49:
                    if (!str.equals("1")) {
                        string = context.getString(R$string.in_progress);
                    } else {
                        string = context.getString(R$string.completed);
                    }
                    break;
                case 50:
                    if (!str.equals("2")) {
                        string = context.getString(R$string.in_progress);
                    } else {
                        string = context.getString(R$string.failed);
                    }
                    break;
                case 51:
                default:
                    string = context.getString(R$string.in_progress);
                    break;
                case 52:
                    if (!str.equals("4")) {
                        string = context.getString(R$string.in_progress);
                    } else {
                        string = context.getString(R$string.payment_order_under_refund);
                    }
                    break;
                case 53:
                    if (!str.equals("5")) {
                        string = context.getString(R$string.in_progress);
                    } else {
                        string = context.getString(R$string.payment_order_refunded);
                    }
                    break;
                case 54:
                    if (!str.equals(STATUS_DELAYED)) {
                        string = context.getString(R$string.in_progress);
                    } else {
                        string = context.getString(R$string.payment_order_delayed_settlement);
                    }
                    break;
                case 55:
                    if (!str.equals("7")) {
                        string = context.getString(R$string.in_progress);
                    } else {
                        string = context.getString(R$string.payment_order_refunded_failure);
                    }
                    break;
            }
        } else {
            string = context.getString(R$string.in_progress);
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    @Nullable
    public final String getTaxAmount() {
        return this.taxAmount;
    }

    @Nullable
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    public int hashCode() {
        int iHashCode = this.orderId.hashCode() * 31;
        String str = this.status;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.channelType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethodCode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.channelId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.channelName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l11 = this.createdAt;
        int iHashCode7 = (iHashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str6 = this.payinAmount;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.payinCurrency;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.depositPayinAmount;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.depositPayinCurrency;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.feeAmount;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.feeCurrency;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        RechargeErrorInfo rechargeErrorInfo = this.errorReason;
        int iHashCode14 = (iHashCode13 + (rechargeErrorInfo == null ? 0 : rechargeErrorInfo.hashCode())) * 31;
        Boolean bool = this.customerRefundEntrance;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.customerRefundFail;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str12 = this.fiatCurrency;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.taxAmount;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.taxCurrency;
        return iHashCode18 + (str14 != null ? str14.hashCode() : 0);
    }

    public final boolean isSuccess() {
        return Intrinsics.areEqual(this.status, "1");
    }

    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderId = str;
    }

    @NotNull
    public String toString() {
        return "FiatRechargeInfo(orderId=" + this.orderId + ", status=" + this.status + ", channelType=" + this.channelType + ", paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", channelName=" + this.channelName + ", createdAt=" + this.createdAt + ", payinAmount=" + this.payinAmount + ", payinCurrency=" + this.payinCurrency + ", depositPayinAmount=" + this.depositPayinAmount + ", depositPayinCurrency=" + this.depositPayinCurrency + ", feeAmount=" + this.feeAmount + ", feeCurrency=" + this.feeCurrency + ", errorReason=" + this.errorReason + ", customerRefundEntrance=" + this.customerRefundEntrance + ", customerRefundFail=" + this.customerRefundFail + ", fiatCurrency=" + this.fiatCurrency + ", taxAmount=" + this.taxAmount + ", taxCurrency=" + this.taxCurrency + ')';
    }
}
