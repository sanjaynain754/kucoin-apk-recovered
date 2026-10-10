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
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010+\u001a\u00020\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0014HÆ\u0003JÂ\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u000fHÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006B"}, m90084d2 = {"Lcom/kubi/copytrading/assets/LeaderTraderAccountInfoEntity;", "", "configId", "", "uid", "userId", "nickName", "avatar", "totalAssets", "Ljava/math/BigDecimal;", "aum", "totalPnl", "todayPnl", "unrealizedPnl", "currentCopyTraders", "", "cumulativeProfitSharingAmount", "unrealizedProfitSharingAmount", FirebaseAnalytics.Param.CURRENCY, "leadTraderUsedTrial", "Lcom/kubi/copytrading/assets/LeadTraderUsedTrialEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/kubi/copytrading/assets/LeadTraderUsedTrialEntity;)V", "getConfigId", "()Ljava/lang/String;", "getUid", "getUserId", "getNickName", "getAvatar", "getTotalAssets", "()Ljava/math/BigDecimal;", "getAum", "getTotalPnl", "getTodayPnl", "getUnrealizedPnl", "getCurrentCopyTraders", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCumulativeProfitSharingAmount", "getUnrealizedProfitSharingAmount", "getCurrency", "getLeadTraderUsedTrial", "()Lcom/kubi/copytrading/assets/LeadTraderUsedTrialEntity;", "getNoNullCurrency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/kubi/copytrading/assets/LeadTraderUsedTrialEntity;)Lcom/kubi/copytrading/assets/LeaderTraderAccountInfoEntity;", "equals", "", "other", "hashCode", "toString", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeaderTraderAccountInfoEntity {

    @Nullable
    private final BigDecimal aum;

    @Nullable
    private final String avatar;

    @Nullable
    private final String configId;

    @Nullable
    private final BigDecimal cumulativeProfitSharingAmount;

    @Nullable
    private final String currency;

    @Nullable
    private final Integer currentCopyTraders;

    @Nullable
    private final LeadTraderUsedTrialEntity leadTraderUsedTrial;

    @Nullable
    private final String nickName;

    @Nullable
    private final BigDecimal todayPnl;

    @Nullable
    private final BigDecimal totalAssets;

    @Nullable
    private final BigDecimal totalPnl;

    @Nullable
    private final String uid;

    @Nullable
    private final BigDecimal unrealizedPnl;

    @Nullable
    private final BigDecimal unrealizedProfitSharingAmount;

    @Nullable
    private final String userId;

    public LeaderTraderAccountInfoEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeaderTraderAccountInfoEntity)) {
            return false;
        }
        LeaderTraderAccountInfoEntity leaderTraderAccountInfoEntity = (LeaderTraderAccountInfoEntity) other;
        return Intrinsics.areEqual(this.configId, leaderTraderAccountInfoEntity.configId) && Intrinsics.areEqual(this.uid, leaderTraderAccountInfoEntity.uid) && Intrinsics.areEqual(this.userId, leaderTraderAccountInfoEntity.userId) && Intrinsics.areEqual(this.nickName, leaderTraderAccountInfoEntity.nickName) && Intrinsics.areEqual(this.avatar, leaderTraderAccountInfoEntity.avatar) && Intrinsics.areEqual(this.totalAssets, leaderTraderAccountInfoEntity.totalAssets) && Intrinsics.areEqual(this.aum, leaderTraderAccountInfoEntity.aum) && Intrinsics.areEqual(this.totalPnl, leaderTraderAccountInfoEntity.totalPnl) && Intrinsics.areEqual(this.todayPnl, leaderTraderAccountInfoEntity.todayPnl) && Intrinsics.areEqual(this.unrealizedPnl, leaderTraderAccountInfoEntity.unrealizedPnl) && Intrinsics.areEqual(this.currentCopyTraders, leaderTraderAccountInfoEntity.currentCopyTraders) && Intrinsics.areEqual(this.cumulativeProfitSharingAmount, leaderTraderAccountInfoEntity.cumulativeProfitSharingAmount) && Intrinsics.areEqual(this.unrealizedProfitSharingAmount, leaderTraderAccountInfoEntity.unrealizedProfitSharingAmount) && Intrinsics.areEqual(this.currency, leaderTraderAccountInfoEntity.currency) && Intrinsics.areEqual(this.leadTraderUsedTrial, leaderTraderAccountInfoEntity.leadTraderUsedTrial);
    }

    public LeaderTraderAccountInfoEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable Integer num, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable String str6, @Nullable LeadTraderUsedTrialEntity leadTraderUsedTrialEntity) {
        this.configId = str;
        this.uid = str2;
        this.userId = str3;
        this.nickName = str4;
        this.avatar = str5;
        this.totalAssets = bigDecimal;
        this.aum = bigDecimal2;
        this.totalPnl = bigDecimal3;
        this.todayPnl = bigDecimal4;
        this.unrealizedPnl = bigDecimal5;
        this.currentCopyTraders = num;
        this.cumulativeProfitSharingAmount = bigDecimal6;
        this.unrealizedProfitSharingAmount = bigDecimal7;
        this.currency = str6;
        this.leadTraderUsedTrial = leadTraderUsedTrialEntity;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConfigId() {
        return this.configId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getUnrealizedPnl() {
        return this.unrealizedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getCurrentCopyTraders() {
        return this.currentCopyTraders;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getCumulativeProfitSharingAmount() {
        return this.cumulativeProfitSharingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getUnrealizedProfitSharingAmount() {
        return this.unrealizedProfitSharingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final LeadTraderUsedTrialEntity getLeadTraderUsedTrial() {
        return this.leadTraderUsedTrial;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getTotalAssets() {
        return this.totalAssets;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getAum() {
        return this.aum;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getTotalPnl() {
        return this.totalPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getTodayPnl() {
        return this.todayPnl;
    }

    @NotNull
    public final LeaderTraderAccountInfoEntity copy(@Nullable String configId, @Nullable String uid, @Nullable String userId, @Nullable String nickName, @Nullable String avatar, @Nullable BigDecimal totalAssets, @Nullable BigDecimal aum, @Nullable BigDecimal totalPnl, @Nullable BigDecimal todayPnl, @Nullable BigDecimal unrealizedPnl, @Nullable Integer currentCopyTraders, @Nullable BigDecimal cumulativeProfitSharingAmount, @Nullable BigDecimal unrealizedProfitSharingAmount, @Nullable String currency, @Nullable LeadTraderUsedTrialEntity leadTraderUsedTrial) {
        return new LeaderTraderAccountInfoEntity(configId, uid, userId, nickName, avatar, totalAssets, aum, totalPnl, todayPnl, unrealizedPnl, currentCopyTraders, cumulativeProfitSharingAmount, unrealizedProfitSharingAmount, currency, leadTraderUsedTrial);
    }

    @Nullable
    public final BigDecimal getAum() {
        return this.aum;
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getConfigId() {
        return this.configId;
    }

    @Nullable
    public final BigDecimal getCumulativeProfitSharingAmount() {
        return this.cumulativeProfitSharingAmount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Integer getCurrentCopyTraders() {
        return this.currentCopyTraders;
    }

    @Nullable
    public final LeadTraderUsedTrialEntity getLeadTraderUsedTrial() {
        return this.leadTraderUsedTrial;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    public final String getNoNullCurrency() {
        return C11449b.m20668b(this.currency);
    }

    @Nullable
    public final BigDecimal getTodayPnl() {
        return this.todayPnl;
    }

    @Nullable
    public final BigDecimal getTotalAssets() {
        return this.totalAssets;
    }

    @Nullable
    public final BigDecimal getTotalPnl() {
        return this.totalPnl;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }

    @Nullable
    public final BigDecimal getUnrealizedPnl() {
        return this.unrealizedPnl;
    }

    @Nullable
    public final BigDecimal getUnrealizedProfitSharingAmount() {
        return this.unrealizedProfitSharingAmount;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.configId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nickName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.avatar;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.totalAssets;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.aum;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.totalPnl;
        int iHashCode8 = (iHashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.todayPnl;
        int iHashCode9 = (iHashCode8 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.unrealizedPnl;
        int iHashCode10 = (iHashCode9 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        Integer num = this.currentCopyTraders;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.cumulativeProfitSharingAmount;
        int iHashCode12 = (iHashCode11 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.unrealizedProfitSharingAmount;
        int iHashCode13 = (iHashCode12 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        String str6 = this.currency;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        LeadTraderUsedTrialEntity leadTraderUsedTrialEntity = this.leadTraderUsedTrial;
        return iHashCode14 + (leadTraderUsedTrialEntity != null ? leadTraderUsedTrialEntity.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LeaderTraderAccountInfoEntity(configId=" + this.configId + ", uid=" + this.uid + ", userId=" + this.userId + ", nickName=" + this.nickName + ", avatar=" + this.avatar + ", totalAssets=" + this.totalAssets + ", aum=" + this.aum + ", totalPnl=" + this.totalPnl + ", todayPnl=" + this.todayPnl + ", unrealizedPnl=" + this.unrealizedPnl + ", currentCopyTraders=" + this.currentCopyTraders + ", cumulativeProfitSharingAmount=" + this.cumulativeProfitSharingAmount + ", unrealizedProfitSharingAmount=" + this.unrealizedProfitSharingAmount + ", currency=" + this.currency + ", leadTraderUsedTrial=" + this.leadTraderUsedTrial + ')';
    }

    public /* synthetic */ LeaderTraderAccountInfoEntity(String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Integer num, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str6, LeadTraderUsedTrialEntity leadTraderUsedTrialEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : bigDecimal, (i11 & 64) != 0 ? null : bigDecimal2, (i11 & 128) != 0 ? null : bigDecimal3, (i11 & 256) != 0 ? null : bigDecimal4, (i11 & 512) != 0 ? null : bigDecimal5, (i11 & 1024) != 0 ? null : num, (i11 & 2048) != 0 ? null : bigDecimal6, (i11 & 4096) != 0 ? null : bigDecimal7, (i11 & 8192) != 0 ? null : str6, (i11 & 16384) != 0 ? null : leadTraderUsedTrialEntity);
    }
}
