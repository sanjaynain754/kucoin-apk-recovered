package com.kubi.copytrading.assets;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CopyTdEntity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J¼\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 ¨\u0006?"}, m90084d2 = {"Lcom/kubi/copytrading/assets/LeadTradingItemEntity;", "", "nickName", "", TUIConstantDefine.AVATAR_URL, "leadConfigId", "", "currentCopyUserCount", "maxCopyUserCount", "daysAsLeader", "followerPnl", "Ljava/math/BigDecimal;", "followerAum", "totalPnlDate", "", "thirtyDayPnl", "thirtyDayPnlRatio", FirebaseAnalytics.Param.CURRENCY, "totalPnl", "totalPnlRatio", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getNickName", "()Ljava/lang/String;", "getAvatarUrl", "getLeadConfigId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrentCopyUserCount", "getMaxCopyUserCount", "getDaysAsLeader", "getFollowerPnl", "()Ljava/math/BigDecimal;", "getFollowerAum", "getTotalPnlDate", "()Ljava/util/List;", "getThirtyDayPnl", "getThirtyDayPnlRatio", "getCurrency", "getTotalPnl", "getTotalPnlRatio", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/copytrading/assets/LeadTradingItemEntity;", "equals", "", "other", "hashCode", "", "toString", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeadTradingItemEntity {

    @Nullable
    private final String avatarUrl;

    @Nullable
    private final String currency;

    @Nullable
    private final Long currentCopyUserCount;

    @Nullable
    private final Long daysAsLeader;

    @Nullable
    private final BigDecimal followerAum;

    @Nullable
    private final BigDecimal followerPnl;

    @Nullable
    private final Long leadConfigId;

    @Nullable
    private final Long maxCopyUserCount;

    @Nullable
    private final String nickName;

    @Nullable
    private final BigDecimal thirtyDayPnl;

    @Nullable
    private final BigDecimal thirtyDayPnlRatio;

    @Nullable
    private final BigDecimal totalPnl;

    @Nullable
    private final List<BigDecimal> totalPnlDate;

    @Nullable
    private final BigDecimal totalPnlRatio;

    public LeadTradingItemEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeadTradingItemEntity)) {
            return false;
        }
        LeadTradingItemEntity leadTradingItemEntity = (LeadTradingItemEntity) other;
        return Intrinsics.areEqual(this.nickName, leadTradingItemEntity.nickName) && Intrinsics.areEqual(this.avatarUrl, leadTradingItemEntity.avatarUrl) && Intrinsics.areEqual(this.leadConfigId, leadTradingItemEntity.leadConfigId) && Intrinsics.areEqual(this.currentCopyUserCount, leadTradingItemEntity.currentCopyUserCount) && Intrinsics.areEqual(this.maxCopyUserCount, leadTradingItemEntity.maxCopyUserCount) && Intrinsics.areEqual(this.daysAsLeader, leadTradingItemEntity.daysAsLeader) && Intrinsics.areEqual(this.followerPnl, leadTradingItemEntity.followerPnl) && Intrinsics.areEqual(this.followerAum, leadTradingItemEntity.followerAum) && Intrinsics.areEqual(this.totalPnlDate, leadTradingItemEntity.totalPnlDate) && Intrinsics.areEqual(this.thirtyDayPnl, leadTradingItemEntity.thirtyDayPnl) && Intrinsics.areEqual(this.thirtyDayPnlRatio, leadTradingItemEntity.thirtyDayPnlRatio) && Intrinsics.areEqual(this.currency, leadTradingItemEntity.currency) && Intrinsics.areEqual(this.totalPnl, leadTradingItemEntity.totalPnl) && Intrinsics.areEqual(this.totalPnlRatio, leadTradingItemEntity.totalPnlRatio);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LeadTradingItemEntity(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable List<? extends BigDecimal> list, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable String str3, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6) {
        this.nickName = str;
        this.avatarUrl = str2;
        this.leadConfigId = l11;
        this.currentCopyUserCount = l12;
        this.maxCopyUserCount = l13;
        this.daysAsLeader = l14;
        this.followerPnl = bigDecimal;
        this.followerAum = bigDecimal2;
        this.totalPnlDate = list;
        this.thirtyDayPnl = bigDecimal3;
        this.thirtyDayPnlRatio = bigDecimal4;
        this.currency = str3;
        this.totalPnl = bigDecimal5;
        this.totalPnlRatio = bigDecimal6;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getThirtyDayPnl() {
        return this.thirtyDayPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getThirtyDayPnlRatio() {
        return this.thirtyDayPnlRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getTotalPnl() {
        return this.totalPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getTotalPnlRatio() {
        return this.totalPnlRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getLeadConfigId() {
        return this.leadConfigId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCurrentCopyUserCount() {
        return this.currentCopyUserCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getMaxCopyUserCount() {
        return this.maxCopyUserCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getDaysAsLeader() {
        return this.daysAsLeader;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getFollowerPnl() {
        return this.followerPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getFollowerAum() {
        return this.followerAum;
    }

    @Nullable
    public final List<BigDecimal> component9() {
        return this.totalPnlDate;
    }

    @NotNull
    public final LeadTradingItemEntity copy(@Nullable String nickName, @Nullable String avatarUrl, @Nullable Long leadConfigId, @Nullable Long currentCopyUserCount, @Nullable Long maxCopyUserCount, @Nullable Long daysAsLeader, @Nullable BigDecimal followerPnl, @Nullable BigDecimal followerAum, @Nullable List<? extends BigDecimal> totalPnlDate, @Nullable BigDecimal thirtyDayPnl, @Nullable BigDecimal thirtyDayPnlRatio, @Nullable String currency, @Nullable BigDecimal totalPnl, @Nullable BigDecimal totalPnlRatio) {
        return new LeadTradingItemEntity(nickName, avatarUrl, leadConfigId, currentCopyUserCount, maxCopyUserCount, daysAsLeader, followerPnl, followerAum, totalPnlDate, thirtyDayPnl, thirtyDayPnlRatio, currency, totalPnl, totalPnlRatio);
    }

    @Nullable
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Long getCurrentCopyUserCount() {
        return this.currentCopyUserCount;
    }

    @Nullable
    public final Long getDaysAsLeader() {
        return this.daysAsLeader;
    }

    @Nullable
    public final BigDecimal getFollowerAum() {
        return this.followerAum;
    }

    @Nullable
    public final BigDecimal getFollowerPnl() {
        return this.followerPnl;
    }

    @Nullable
    public final Long getLeadConfigId() {
        return this.leadConfigId;
    }

    @Nullable
    public final Long getMaxCopyUserCount() {
        return this.maxCopyUserCount;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final BigDecimal getThirtyDayPnl() {
        return this.thirtyDayPnl;
    }

    @Nullable
    public final BigDecimal getThirtyDayPnlRatio() {
        return this.thirtyDayPnlRatio;
    }

    @Nullable
    public final BigDecimal getTotalPnl() {
        return this.totalPnl;
    }

    @Nullable
    public final List<BigDecimal> getTotalPnlDate() {
        return this.totalPnlDate;
    }

    @Nullable
    public final BigDecimal getTotalPnlRatio() {
        return this.totalPnlRatio;
    }

    public int hashCode() {
        String str = this.nickName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avatarUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.leadConfigId;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.currentCopyUserCount;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.maxCopyUserCount;
        int iHashCode5 = (iHashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.daysAsLeader;
        int iHashCode6 = (iHashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
        BigDecimal bigDecimal = this.followerPnl;
        int iHashCode7 = (iHashCode6 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.followerAum;
        int iHashCode8 = (iHashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        List<BigDecimal> list = this.totalPnlDate;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.thirtyDayPnl;
        int iHashCode10 = (iHashCode9 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.thirtyDayPnlRatio;
        int iHashCode11 = (iHashCode10 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.totalPnl;
        int iHashCode13 = (iHashCode12 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.totalPnlRatio;
        return iHashCode13 + (bigDecimal6 != null ? bigDecimal6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LeadTradingItemEntity(nickName=" + this.nickName + ", avatarUrl=" + this.avatarUrl + ", leadConfigId=" + this.leadConfigId + ", currentCopyUserCount=" + this.currentCopyUserCount + ", maxCopyUserCount=" + this.maxCopyUserCount + ", daysAsLeader=" + this.daysAsLeader + ", followerPnl=" + this.followerPnl + ", followerAum=" + this.followerAum + ", totalPnlDate=" + this.totalPnlDate + ", thirtyDayPnl=" + this.thirtyDayPnl + ", thirtyDayPnlRatio=" + this.thirtyDayPnlRatio + ", currency=" + this.currency + ", totalPnl=" + this.totalPnl + ", totalPnlRatio=" + this.totalPnlRatio + ')';
    }

    public /* synthetic */ LeadTradingItemEntity(String str, String str2, Long l11, Long l12, Long l13, Long l14, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str3, BigDecimal bigDecimal5, BigDecimal bigDecimal6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : l12, (i11 & 16) != 0 ? null : l13, (i11 & 32) != 0 ? null : l14, (i11 & 64) != 0 ? null : bigDecimal, (i11 & 128) != 0 ? null : bigDecimal2, (i11 & 256) != 0 ? null : list, (i11 & 512) != 0 ? null : bigDecimal3, (i11 & 1024) != 0 ? null : bigDecimal4, (i11 & 2048) != 0 ? null : str3, (i11 & 4096) != 0 ? null : bigDecimal5, (i11 & 8192) != 0 ? null : bigDecimal6);
    }
}
