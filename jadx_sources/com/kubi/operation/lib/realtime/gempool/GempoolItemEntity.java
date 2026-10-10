package com.kubi.operation.lib.realtime.gempool;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: GemPoolRealtimeData.kt */
/* JADX INFO: loaded from: classes32.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\u001fJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0080\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u001f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00062"}, m90084d2 = {"Lcom/kubi/operation/lib/realtime/gempool/GempoolItemEntity;", "", "campaignId", "", "earnTokenName", "earnTokenLogo", "status", "pools", "", "Lcom/kubi/operation/lib/realtime/gempool/GempoolItemPoolEntity;", "summaryEarnedAmount", "remainSeconds", "", "stakingEndTime", "detailUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignId", "()Ljava/lang/String;", "getEarnTokenName", "getEarnTokenLogo", "getStatus", "getPools", "()Ljava/util/List;", "getSummaryEarnedAmount", "getRemainSeconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStakingEndTime", "getDetailUrl", "isOngoing", "", "isFinished", "isCanShow", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/operation/lib/realtime/gempool/GempoolItemEntity;", "equals", "other", "hashCode", "", "toString", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class GempoolItemEntity {

    @Nullable
    private final String campaignId;

    @Nullable
    private final String detailUrl;

    @Nullable
    private final String earnTokenLogo;

    @Nullable
    private final String earnTokenName;

    @Nullable
    private final List<GempoolItemPoolEntity> pools;

    @Nullable
    private final Long remainSeconds;

    @Nullable
    private final String stakingEndTime;

    @Nullable
    private final String status;

    @Nullable
    private final String summaryEarnedAmount;

    public GempoolItemEntity() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GempoolItemEntity copy$default(GempoolItemEntity gempoolItemEntity, String str, String str2, String str3, String str4, List list, String str5, Long l11, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gempoolItemEntity.campaignId;
        }
        if ((i11 & 2) != 0) {
            str2 = gempoolItemEntity.earnTokenName;
        }
        if ((i11 & 4) != 0) {
            str3 = gempoolItemEntity.earnTokenLogo;
        }
        if ((i11 & 8) != 0) {
            str4 = gempoolItemEntity.status;
        }
        if ((i11 & 16) != 0) {
            list = gempoolItemEntity.pools;
        }
        if ((i11 & 32) != 0) {
            str5 = gempoolItemEntity.summaryEarnedAmount;
        }
        if ((i11 & 64) != 0) {
            l11 = gempoolItemEntity.remainSeconds;
        }
        if ((i11 & 128) != 0) {
            str6 = gempoolItemEntity.stakingEndTime;
        }
        if ((i11 & 256) != 0) {
            str7 = gempoolItemEntity.detailUrl;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        Long l12 = l11;
        List list2 = list;
        String str11 = str3;
        return gempoolItemEntity.copy(str, str2, str11, str4, list2, str10, l12, str8, str9);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GempoolItemEntity)) {
            return false;
        }
        GempoolItemEntity gempoolItemEntity = (GempoolItemEntity) other;
        return Intrinsics.areEqual(this.campaignId, gempoolItemEntity.campaignId) && Intrinsics.areEqual(this.earnTokenName, gempoolItemEntity.earnTokenName) && Intrinsics.areEqual(this.earnTokenLogo, gempoolItemEntity.earnTokenLogo) && Intrinsics.areEqual(this.status, gempoolItemEntity.status) && Intrinsics.areEqual(this.pools, gempoolItemEntity.pools) && Intrinsics.areEqual(this.summaryEarnedAmount, gempoolItemEntity.summaryEarnedAmount) && Intrinsics.areEqual(this.remainSeconds, gempoolItemEntity.remainSeconds) && Intrinsics.areEqual(this.stakingEndTime, gempoolItemEntity.stakingEndTime) && Intrinsics.areEqual(this.detailUrl, gempoolItemEntity.detailUrl);
    }

    public GempoolItemEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<GempoolItemPoolEntity> list, @Nullable String str5, @Nullable Long l11, @Nullable String str6, @Nullable String str7) {
        this.campaignId = str;
        this.earnTokenName = str2;
        this.earnTokenLogo = str3;
        this.status = str4;
        this.pools = list;
        this.summaryEarnedAmount = str5;
        this.remainSeconds = l11;
        this.stakingEndTime = str6;
        this.detailUrl = str7;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEarnTokenName() {
        return this.earnTokenName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEarnTokenLogo() {
        return this.earnTokenLogo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final List<GempoolItemPoolEntity> component5() {
        return this.pools;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSummaryEarnedAmount() {
        return this.summaryEarnedAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getRemainSeconds() {
        return this.remainSeconds;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStakingEndTime() {
        return this.stakingEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDetailUrl() {
        return this.detailUrl;
    }

    @NotNull
    public final GempoolItemEntity copy(@Nullable String campaignId, @Nullable String earnTokenName, @Nullable String earnTokenLogo, @Nullable String status, @Nullable List<GempoolItemPoolEntity> pools, @Nullable String summaryEarnedAmount, @Nullable Long remainSeconds, @Nullable String stakingEndTime, @Nullable String detailUrl) {
        return new GempoolItemEntity(campaignId, earnTokenName, earnTokenLogo, status, pools, summaryEarnedAmount, remainSeconds, stakingEndTime, detailUrl);
    }

    @Nullable
    public final String getCampaignId() {
        return this.campaignId;
    }

    @Nullable
    public final String getDetailUrl() {
        return this.detailUrl;
    }

    @Nullable
    public final String getEarnTokenLogo() {
        return this.earnTokenLogo;
    }

    @Nullable
    public final String getEarnTokenName() {
        return this.earnTokenName;
    }

    @Nullable
    public final List<GempoolItemPoolEntity> getPools() {
        return this.pools;
    }

    @Nullable
    public final Long getRemainSeconds() {
        return this.remainSeconds;
    }

    @Nullable
    public final String getStakingEndTime() {
        return this.stakingEndTime;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSummaryEarnedAmount() {
        return this.summaryEarnedAmount;
    }

    public int hashCode() {
        String str = this.campaignId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.earnTokenName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.earnTokenLogo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.status;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<GempoolItemPoolEntity> list = this.pools;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.summaryEarnedAmount;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l11 = this.remainSeconds;
        int iHashCode7 = (iHashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str6 = this.stakingEndTime;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.detailUrl;
        return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final boolean isFinished() {
        return StringsKt.equals(GemPoolStatus.FINISHED.getValue(), this.status, true);
    }

    public final boolean isOngoing() {
        return StringsKt.equals(GemPoolStatus.ONGOING.getValue(), this.status, true);
    }

    @NotNull
    public String toString() {
        return "GempoolItemEntity(campaignId=" + this.campaignId + ", earnTokenName=" + this.earnTokenName + ", earnTokenLogo=" + this.earnTokenLogo + ", status=" + this.status + ", pools=" + this.pools + ", summaryEarnedAmount=" + this.summaryEarnedAmount + ", remainSeconds=" + this.remainSeconds + ", stakingEndTime=" + this.stakingEndTime + ", detailUrl=" + this.detailUrl + ')';
    }

    public final boolean isCanShow() {
        boolean z11;
        boolean z12;
        if (!isOngoing() && !isFinished()) {
            z11 = false;
        } else {
            z11 = true;
        }
        Long l11 = this.remainSeconds;
        if (l11 != null && l11.longValue() <= 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z11 && z12) {
            return true;
        }
        return false;
    }

    public /* synthetic */ GempoolItemEntity(String str, String str2, String str3, String str4, List list, String str5, Long l11, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : list, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : l11, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7);
    }
}
