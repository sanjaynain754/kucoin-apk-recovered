package com.kubi.copytrading.assets;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CopyTdEntity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÚ\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b+\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b.\u0010 R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001b¨\u0006J"}, m90084d2 = {"Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;", "", "copyAmount", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.CURRENCY, "", "profitSharingRatio", "startDate", "", "thirtyDayProfitDetail", "Lcom/kubi/copytrading/assets/ThirtyDayProfitDetail;", "todayPnl", "totalPnl", "totalPnlRatio", "traderInfoResponse", "Lcom/kubi/copytrading/assets/TraderInfoResponse;", "copyConfigId", "fundsType", "userTrialFundId", "amount", "finalWithdrawAmount", "expireTime", "maxWithdrawAmount", "profitAmount", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Lcom/kubi/copytrading/assets/ThirtyDayProfitDetail;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/copytrading/assets/TraderInfoResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCopyAmount", "()Ljava/math/BigDecimal;", "getCurrency", "()Ljava/lang/String;", "getProfitSharingRatio", "getStartDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getThirtyDayProfitDetail", "()Lcom/kubi/copytrading/assets/ThirtyDayProfitDetail;", "getTodayPnl", "getTotalPnl", "getTotalPnlRatio", "getTraderInfoResponse", "()Lcom/kubi/copytrading/assets/TraderInfoResponse;", "getCopyConfigId", "getFundsType", "getUserTrialFundId", "getAmount", "getFinalWithdrawAmount", "getExpireTime", "getMaxWithdrawAmount", "getProfitAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Lcom/kubi/copytrading/assets/ThirtyDayProfitDetail;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/copytrading/assets/TraderInfoResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/copytrading/assets/CopyTradingTraderEntity;", "equals", "", "other", "hashCode", "", "toString", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CopyTradingTraderEntity {

    @Nullable
    private final BigDecimal amount;

    @Nullable
    private final BigDecimal copyAmount;

    @Nullable
    private final String copyConfigId;

    @Nullable
    private final String currency;

    @Nullable
    private final Long expireTime;

    @Nullable
    private final BigDecimal finalWithdrawAmount;

    @Nullable
    private final String fundsType;

    @Nullable
    private final BigDecimal maxWithdrawAmount;

    @Nullable
    private final BigDecimal profitAmount;

    @Nullable
    private final BigDecimal profitSharingRatio;

    @Nullable
    private final Long startDate;

    @Nullable
    private final ThirtyDayProfitDetail thirtyDayProfitDetail;

    @Nullable
    private final BigDecimal todayPnl;

    @Nullable
    private final BigDecimal totalPnl;

    @Nullable
    private final BigDecimal totalPnlRatio;

    @Nullable
    private final TraderInfoResponse traderInfoResponse;

    @Nullable
    private final Long userTrialFundId;

    public CopyTradingTraderEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ CopyTradingTraderEntity copy$default(CopyTradingTraderEntity copyTradingTraderEntity, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, Long l11, ThirtyDayProfitDetail thirtyDayProfitDetail, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, TraderInfoResponse traderInfoResponse, String str2, String str3, Long l12, BigDecimal bigDecimal6, BigDecimal bigDecimal7, Long l13, BigDecimal bigDecimal8, BigDecimal bigDecimal9, int i11, Object obj) {
        BigDecimal bigDecimal10;
        BigDecimal bigDecimal11;
        BigDecimal bigDecimal12 = (i11 & 1) != 0 ? copyTradingTraderEntity.copyAmount : bigDecimal;
        String str4 = (i11 & 2) != 0 ? copyTradingTraderEntity.currency : str;
        BigDecimal bigDecimal13 = (i11 & 4) != 0 ? copyTradingTraderEntity.profitSharingRatio : bigDecimal2;
        Long l14 = (i11 & 8) != 0 ? copyTradingTraderEntity.startDate : l11;
        ThirtyDayProfitDetail thirtyDayProfitDetail2 = (i11 & 16) != 0 ? copyTradingTraderEntity.thirtyDayProfitDetail : thirtyDayProfitDetail;
        BigDecimal bigDecimal14 = (i11 & 32) != 0 ? copyTradingTraderEntity.todayPnl : bigDecimal3;
        BigDecimal bigDecimal15 = (i11 & 64) != 0 ? copyTradingTraderEntity.totalPnl : bigDecimal4;
        BigDecimal bigDecimal16 = (i11 & 128) != 0 ? copyTradingTraderEntity.totalPnlRatio : bigDecimal5;
        TraderInfoResponse traderInfoResponse2 = (i11 & 256) != 0 ? copyTradingTraderEntity.traderInfoResponse : traderInfoResponse;
        String str5 = (i11 & 512) != 0 ? copyTradingTraderEntity.copyConfigId : str2;
        String str6 = (i11 & 1024) != 0 ? copyTradingTraderEntity.fundsType : str3;
        Long l15 = (i11 & 2048) != 0 ? copyTradingTraderEntity.userTrialFundId : l12;
        BigDecimal bigDecimal17 = (i11 & 4096) != 0 ? copyTradingTraderEntity.amount : bigDecimal6;
        BigDecimal bigDecimal18 = (i11 & 8192) != 0 ? copyTradingTraderEntity.finalWithdrawAmount : bigDecimal7;
        BigDecimal bigDecimal19 = bigDecimal12;
        Long l16 = (i11 & 16384) != 0 ? copyTradingTraderEntity.expireTime : l13;
        BigDecimal bigDecimal20 = (i11 & 32768) != 0 ? copyTradingTraderEntity.maxWithdrawAmount : bigDecimal8;
        if ((i11 & 65536) != 0) {
            bigDecimal11 = bigDecimal20;
            bigDecimal10 = copyTradingTraderEntity.profitAmount;
        } else {
            bigDecimal10 = bigDecimal9;
            bigDecimal11 = bigDecimal20;
        }
        return copyTradingTraderEntity.copy(bigDecimal19, str4, bigDecimal13, l14, thirtyDayProfitDetail2, bigDecimal14, bigDecimal15, bigDecimal16, traderInfoResponse2, str5, str6, l15, bigDecimal17, bigDecimal18, l16, bigDecimal11, bigDecimal10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CopyTradingTraderEntity)) {
            return false;
        }
        CopyTradingTraderEntity copyTradingTraderEntity = (CopyTradingTraderEntity) other;
        return Intrinsics.areEqual(this.copyAmount, copyTradingTraderEntity.copyAmount) && Intrinsics.areEqual(this.currency, copyTradingTraderEntity.currency) && Intrinsics.areEqual(this.profitSharingRatio, copyTradingTraderEntity.profitSharingRatio) && Intrinsics.areEqual(this.startDate, copyTradingTraderEntity.startDate) && Intrinsics.areEqual(this.thirtyDayProfitDetail, copyTradingTraderEntity.thirtyDayProfitDetail) && Intrinsics.areEqual(this.todayPnl, copyTradingTraderEntity.todayPnl) && Intrinsics.areEqual(this.totalPnl, copyTradingTraderEntity.totalPnl) && Intrinsics.areEqual(this.totalPnlRatio, copyTradingTraderEntity.totalPnlRatio) && Intrinsics.areEqual(this.traderInfoResponse, copyTradingTraderEntity.traderInfoResponse) && Intrinsics.areEqual(this.copyConfigId, copyTradingTraderEntity.copyConfigId) && Intrinsics.areEqual(this.fundsType, copyTradingTraderEntity.fundsType) && Intrinsics.areEqual(this.userTrialFundId, copyTradingTraderEntity.userTrialFundId) && Intrinsics.areEqual(this.amount, copyTradingTraderEntity.amount) && Intrinsics.areEqual(this.finalWithdrawAmount, copyTradingTraderEntity.finalWithdrawAmount) && Intrinsics.areEqual(this.expireTime, copyTradingTraderEntity.expireTime) && Intrinsics.areEqual(this.maxWithdrawAmount, copyTradingTraderEntity.maxWithdrawAmount) && Intrinsics.areEqual(this.profitAmount, copyTradingTraderEntity.profitAmount);
    }

    public CopyTradingTraderEntity(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable BigDecimal bigDecimal2, @Nullable Long l11, @Nullable ThirtyDayProfitDetail thirtyDayProfitDetail, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable TraderInfoResponse traderInfoResponse, @Nullable String str2, @Nullable String str3, @Nullable Long l12, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable Long l13, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9) {
        this.copyAmount = bigDecimal;
        this.currency = str;
        this.profitSharingRatio = bigDecimal2;
        this.startDate = l11;
        this.thirtyDayProfitDetail = thirtyDayProfitDetail;
        this.todayPnl = bigDecimal3;
        this.totalPnl = bigDecimal4;
        this.totalPnlRatio = bigDecimal5;
        this.traderInfoResponse = traderInfoResponse;
        this.copyConfigId = str2;
        this.fundsType = str3;
        this.userTrialFundId = l12;
        this.amount = bigDecimal6;
        this.finalWithdrawAmount = bigDecimal7;
        this.expireTime = l13;
        this.maxWithdrawAmount = bigDecimal8;
        this.profitAmount = bigDecimal9;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getCopyAmount() {
        return this.copyAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCopyConfigId() {
        return this.copyConfigId;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFundsType() {
        return this.fundsType;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getUserTrialFundId() {
        return this.userTrialFundId;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getFinalWithdrawAmount() {
        return this.finalWithdrawAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getMaxWithdrawAmount() {
        return this.maxWithdrawAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final BigDecimal getProfitAmount() {
        return this.profitAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getProfitSharingRatio() {
        return this.profitSharingRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getStartDate() {
        return this.startDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ThirtyDayProfitDetail getThirtyDayProfitDetail() {
        return this.thirtyDayProfitDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getTodayPnl() {
        return this.todayPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getTotalPnl() {
        return this.totalPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getTotalPnlRatio() {
        return this.totalPnlRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TraderInfoResponse getTraderInfoResponse() {
        return this.traderInfoResponse;
    }

    @NotNull
    public final CopyTradingTraderEntity copy(@Nullable BigDecimal copyAmount, @Nullable String currency, @Nullable BigDecimal profitSharingRatio, @Nullable Long startDate, @Nullable ThirtyDayProfitDetail thirtyDayProfitDetail, @Nullable BigDecimal todayPnl, @Nullable BigDecimal totalPnl, @Nullable BigDecimal totalPnlRatio, @Nullable TraderInfoResponse traderInfoResponse, @Nullable String copyConfigId, @Nullable String fundsType, @Nullable Long userTrialFundId, @Nullable BigDecimal amount, @Nullable BigDecimal finalWithdrawAmount, @Nullable Long expireTime, @Nullable BigDecimal maxWithdrawAmount, @Nullable BigDecimal profitAmount) {
        return new CopyTradingTraderEntity(copyAmount, currency, profitSharingRatio, startDate, thirtyDayProfitDetail, todayPnl, totalPnl, totalPnlRatio, traderInfoResponse, copyConfigId, fundsType, userTrialFundId, amount, finalWithdrawAmount, expireTime, maxWithdrawAmount, profitAmount);
    }

    @Nullable
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    public final BigDecimal getCopyAmount() {
        return this.copyAmount;
    }

    @Nullable
    public final String getCopyConfigId() {
        return this.copyConfigId;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    public final BigDecimal getFinalWithdrawAmount() {
        return this.finalWithdrawAmount;
    }

    @Nullable
    public final String getFundsType() {
        return this.fundsType;
    }

    @Nullable
    public final BigDecimal getMaxWithdrawAmount() {
        return this.maxWithdrawAmount;
    }

    @Nullable
    public final BigDecimal getProfitAmount() {
        return this.profitAmount;
    }

    @Nullable
    public final BigDecimal getProfitSharingRatio() {
        return this.profitSharingRatio;
    }

    @Nullable
    public final Long getStartDate() {
        return this.startDate;
    }

    @Nullable
    public final ThirtyDayProfitDetail getThirtyDayProfitDetail() {
        return this.thirtyDayProfitDetail;
    }

    @Nullable
    public final BigDecimal getTodayPnl() {
        return this.todayPnl;
    }

    @Nullable
    public final BigDecimal getTotalPnl() {
        return this.totalPnl;
    }

    @Nullable
    public final BigDecimal getTotalPnlRatio() {
        return this.totalPnlRatio;
    }

    @Nullable
    public final TraderInfoResponse getTraderInfoResponse() {
        return this.traderInfoResponse;
    }

    @Nullable
    public final Long getUserTrialFundId() {
        return this.userTrialFundId;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.copyAmount;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.profitSharingRatio;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Long l11 = this.startDate;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        ThirtyDayProfitDetail thirtyDayProfitDetail = this.thirtyDayProfitDetail;
        int iHashCode5 = (iHashCode4 + (thirtyDayProfitDetail == null ? 0 : thirtyDayProfitDetail.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.todayPnl;
        int iHashCode6 = (iHashCode5 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.totalPnl;
        int iHashCode7 = (iHashCode6 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.totalPnlRatio;
        int iHashCode8 = (iHashCode7 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        TraderInfoResponse traderInfoResponse = this.traderInfoResponse;
        int iHashCode9 = (iHashCode8 + (traderInfoResponse == null ? 0 : traderInfoResponse.hashCode())) * 31;
        String str2 = this.copyConfigId;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fundsType;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l12 = this.userTrialFundId;
        int iHashCode12 = (iHashCode11 + (l12 == null ? 0 : l12.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.amount;
        int iHashCode13 = (iHashCode12 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.finalWithdrawAmount;
        int iHashCode14 = (iHashCode13 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        Long l13 = this.expireTime;
        int iHashCode15 = (iHashCode14 + (l13 == null ? 0 : l13.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.maxWithdrawAmount;
        int iHashCode16 = (iHashCode15 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.profitAmount;
        return iHashCode16 + (bigDecimal9 != null ? bigDecimal9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CopyTradingTraderEntity(copyAmount=" + this.copyAmount + ", currency=" + this.currency + ", profitSharingRatio=" + this.profitSharingRatio + ", startDate=" + this.startDate + ", thirtyDayProfitDetail=" + this.thirtyDayProfitDetail + ", todayPnl=" + this.todayPnl + ", totalPnl=" + this.totalPnl + ", totalPnlRatio=" + this.totalPnlRatio + ", traderInfoResponse=" + this.traderInfoResponse + ", copyConfigId=" + this.copyConfigId + ", fundsType=" + this.fundsType + ", userTrialFundId=" + this.userTrialFundId + ", amount=" + this.amount + ", finalWithdrawAmount=" + this.finalWithdrawAmount + ", expireTime=" + this.expireTime + ", maxWithdrawAmount=" + this.maxWithdrawAmount + ", profitAmount=" + this.profitAmount + ')';
    }

    public /* synthetic */ CopyTradingTraderEntity(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, Long l11, ThirtyDayProfitDetail thirtyDayProfitDetail, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, TraderInfoResponse traderInfoResponse, String str2, String str3, Long l12, BigDecimal bigDecimal6, BigDecimal bigDecimal7, Long l13, BigDecimal bigDecimal8, BigDecimal bigDecimal9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? null : thirtyDayProfitDetail, (i11 & 32) != 0 ? null : bigDecimal3, (i11 & 64) != 0 ? null : bigDecimal4, (i11 & 128) != 0 ? null : bigDecimal5, (i11 & 256) != 0 ? null : traderInfoResponse, (i11 & 512) != 0 ? null : str2, (i11 & 1024) != 0 ? null : str3, (i11 & 2048) != 0 ? null : l12, (i11 & 4096) != 0 ? null : bigDecimal6, (i11 & 8192) != 0 ? null : bigDecimal7, (i11 & 16384) != 0 ? null : l13, (i11 & 32768) != 0 ? null : bigDecimal8, (i11 & 65536) != 0 ? null : bigDecimal9);
    }
}
