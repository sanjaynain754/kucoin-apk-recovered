package com.kubi.spot.api;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ISpotWSDynamicTopic.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jª\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018¨\u0006;"}, m90084d2 = {"Lcom/kubi/spot/api/SavingBalancePushEntity;", "", "available", "Ljava/math/BigDecimal;", "availableChange", FirebaseAnalytics.Param.CURRENCY, "", "hold", "holdChange", "redeeming", "redeemingChange", "total", "relationContext", "relationEvent", "relationEventId", "time", "", "userId", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getAvailable", "()Ljava/math/BigDecimal;", "getAvailableChange", "getCurrency", "()Ljava/lang/String;", "getHold", "getHoldChange", "getRedeeming", "getRedeemingChange", "getTotal", "getRelationContext", "()Ljava/lang/Object;", "getRelationEvent", "getRelationEventId", "getTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/kubi/spot/api/SavingBalancePushEntity;", "equals", "", "other", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SavingBalancePushEntity {

    @Nullable
    private final BigDecimal available;

    @Nullable
    private final BigDecimal availableChange;

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal hold;

    @Nullable
    private final BigDecimal holdChange;

    @Nullable
    private final BigDecimal redeeming;

    @Nullable
    private final BigDecimal redeemingChange;

    @Nullable
    private final Object relationContext;

    @Nullable
    private final String relationEvent;

    @Nullable
    private final String relationEventId;

    @Nullable
    private final Long time;

    @Nullable
    private final String total;

    @Nullable
    private final String userId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingBalancePushEntity)) {
            return false;
        }
        SavingBalancePushEntity savingBalancePushEntity = (SavingBalancePushEntity) other;
        return Intrinsics.areEqual(this.available, savingBalancePushEntity.available) && Intrinsics.areEqual(this.availableChange, savingBalancePushEntity.availableChange) && Intrinsics.areEqual(this.currency, savingBalancePushEntity.currency) && Intrinsics.areEqual(this.hold, savingBalancePushEntity.hold) && Intrinsics.areEqual(this.holdChange, savingBalancePushEntity.holdChange) && Intrinsics.areEqual(this.redeeming, savingBalancePushEntity.redeeming) && Intrinsics.areEqual(this.redeemingChange, savingBalancePushEntity.redeemingChange) && Intrinsics.areEqual(this.total, savingBalancePushEntity.total) && Intrinsics.areEqual(this.relationContext, savingBalancePushEntity.relationContext) && Intrinsics.areEqual(this.relationEvent, savingBalancePushEntity.relationEvent) && Intrinsics.areEqual(this.relationEventId, savingBalancePushEntity.relationEventId) && Intrinsics.areEqual(this.time, savingBalancePushEntity.time) && Intrinsics.areEqual(this.userId, savingBalancePushEntity.userId);
    }

    public static /* synthetic */ SavingBalancePushEntity copy$default(SavingBalancePushEntity savingBalancePushEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str2, Object obj, String str3, String str4, Long l11, String str5, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            bigDecimal = savingBalancePushEntity.available;
        }
        return savingBalancePushEntity.copy(bigDecimal, (i11 & 2) != 0 ? savingBalancePushEntity.availableChange : bigDecimal2, (i11 & 4) != 0 ? savingBalancePushEntity.currency : str, (i11 & 8) != 0 ? savingBalancePushEntity.hold : bigDecimal3, (i11 & 16) != 0 ? savingBalancePushEntity.holdChange : bigDecimal4, (i11 & 32) != 0 ? savingBalancePushEntity.redeeming : bigDecimal5, (i11 & 64) != 0 ? savingBalancePushEntity.redeemingChange : bigDecimal6, (i11 & 128) != 0 ? savingBalancePushEntity.total : str2, (i11 & 256) != 0 ? savingBalancePushEntity.relationContext : obj, (i11 & 512) != 0 ? savingBalancePushEntity.relationEvent : str3, (i11 & 1024) != 0 ? savingBalancePushEntity.relationEventId : str4, (i11 & 2048) != 0 ? savingBalancePushEntity.time : l11, (i11 & 4096) != 0 ? savingBalancePushEntity.userId : str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAvailable() {
        return this.available;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRelationEvent() {
        return this.relationEvent;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRelationEventId() {
        return this.relationEventId;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getAvailableChange() {
        return this.availableChange;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getHold() {
        return this.hold;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getHoldChange() {
        return this.holdChange;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getRedeeming() {
        return this.redeeming;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getRedeemingChange() {
        return this.redeemingChange;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTotal() {
        return this.total;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Object getRelationContext() {
        return this.relationContext;
    }

    @NotNull
    public final SavingBalancePushEntity copy(@Nullable BigDecimal available, @Nullable BigDecimal availableChange, @Nullable String currency, @Nullable BigDecimal hold, @Nullable BigDecimal holdChange, @Nullable BigDecimal redeeming, @Nullable BigDecimal redeemingChange, @Nullable String total, @Nullable Object relationContext, @Nullable String relationEvent, @Nullable String relationEventId, @Nullable Long time, @Nullable String userId) {
        return new SavingBalancePushEntity(available, availableChange, currency, hold, holdChange, redeeming, redeemingChange, total, relationContext, relationEvent, relationEventId, time, userId);
    }

    @Nullable
    public final BigDecimal getAvailable() {
        return this.available;
    }

    @Nullable
    public final BigDecimal getAvailableChange() {
        return this.availableChange;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getHold() {
        return this.hold;
    }

    @Nullable
    public final BigDecimal getHoldChange() {
        return this.holdChange;
    }

    @Nullable
    public final BigDecimal getRedeeming() {
        return this.redeeming;
    }

    @Nullable
    public final BigDecimal getRedeemingChange() {
        return this.redeemingChange;
    }

    @Nullable
    public final Object getRelationContext() {
        return this.relationContext;
    }

    @Nullable
    public final String getRelationEvent() {
        return this.relationEvent;
    }

    @Nullable
    public final String getRelationEventId() {
        return this.relationEventId;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    public final String getTotal() {
        return this.total;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.available;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.availableChange;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.currency;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.hold;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.holdChange;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.redeeming;
        int iHashCode6 = (iHashCode5 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.redeemingChange;
        int iHashCode7 = (iHashCode6 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        String str2 = this.total;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.relationContext;
        int iHashCode9 = (iHashCode8 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str3 = this.relationEvent;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.relationEventId;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l11 = this.time;
        int iHashCode12 = (iHashCode11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str5 = this.userId;
        return iHashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SavingBalancePushEntity(available=" + this.available + ", availableChange=" + this.availableChange + ", currency=" + this.currency + ", hold=" + this.hold + ", holdChange=" + this.holdChange + ", redeeming=" + this.redeeming + ", redeemingChange=" + this.redeemingChange + ", total=" + this.total + ", relationContext=" + this.relationContext + ", relationEvent=" + this.relationEvent + ", relationEventId=" + this.relationEventId + ", time=" + this.time + ", userId=" + this.userId + ')';
    }

    public SavingBalancePushEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable String str2, @Nullable Object obj, @Nullable String str3, @Nullable String str4, @Nullable Long l11, @Nullable String str5) {
        this.available = bigDecimal;
        this.availableChange = bigDecimal2;
        this.currency = str;
        this.hold = bigDecimal3;
        this.holdChange = bigDecimal4;
        this.redeeming = bigDecimal5;
        this.redeemingChange = bigDecimal6;
        this.total = str2;
        this.relationContext = obj;
        this.relationEvent = str3;
        this.relationEventId = str4;
        this.time = l11;
        this.userId = str5;
    }
}
