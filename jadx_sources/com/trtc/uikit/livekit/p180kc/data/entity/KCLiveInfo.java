package com.trtc.uikit.livekit.p180kc.data.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCLiveInfo.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/KCLiveInfo;", "", "subscribed", "", "refreshHitPeriod", "", "hotCount", "reserveInfo", "Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$ReserveInfo;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$ReserveInfo;)V", "getSubscribed", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRefreshHitPeriod", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHotCount", "getReserveInfo", "()Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$ReserveInfo;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Lcom/trtc/uikit/livekit/kc/data/entity/Reserve$ReserveInfo;)Lcom/trtc/uikit/livekit/kc/data/entity/KCLiveInfo;", "equals", "", "other", "hashCode", "toString", "", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KCLiveInfo {

    @SerializedName("hotCount")
    @Nullable
    private final Long hotCount;

    @SerializedName("refreshHitPeriod")
    @Nullable
    private final Long refreshHitPeriod;

    @SerializedName("reserveInfo")
    @Nullable
    private final Reserve.ReserveInfo reserveInfo;

    @SerializedName("subscribe")
    @Nullable
    private final Integer subscribed;

    public KCLiveInfo(@Nullable Integer num, @Nullable Long l11, @Nullable Long l12, @Nullable Reserve.ReserveInfo reserveInfo) {
        this.subscribed = num;
        this.refreshHitPeriod = l11;
        this.hotCount = l12;
        this.reserveInfo = reserveInfo;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCLiveInfo)) {
            return false;
        }
        KCLiveInfo kCLiveInfo = (KCLiveInfo) other;
        return Intrinsics.areEqual(this.subscribed, kCLiveInfo.subscribed) && Intrinsics.areEqual(this.refreshHitPeriod, kCLiveInfo.refreshHitPeriod) && Intrinsics.areEqual(this.hotCount, kCLiveInfo.hotCount) && Intrinsics.areEqual(this.reserveInfo, kCLiveInfo.reserveInfo);
    }

    public static /* synthetic */ KCLiveInfo copy$default(KCLiveInfo kCLiveInfo, Integer num, Long l11, Long l12, Reserve.ReserveInfo reserveInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = kCLiveInfo.subscribed;
        }
        if ((i11 & 2) != 0) {
            l11 = kCLiveInfo.refreshHitPeriod;
        }
        if ((i11 & 4) != 0) {
            l12 = kCLiveInfo.hotCount;
        }
        if ((i11 & 8) != 0) {
            reserveInfo = kCLiveInfo.reserveInfo;
        }
        return kCLiveInfo.copy(num, l11, l12, reserveInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getSubscribed() {
        return this.subscribed;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getRefreshHitPeriod() {
        return this.refreshHitPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getHotCount() {
        return this.hotCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Reserve.ReserveInfo getReserveInfo() {
        return this.reserveInfo;
    }

    @NotNull
    public final KCLiveInfo copy(@Nullable Integer subscribed, @Nullable Long refreshHitPeriod, @Nullable Long hotCount, @Nullable Reserve.ReserveInfo reserveInfo) {
        return new KCLiveInfo(subscribed, refreshHitPeriod, hotCount, reserveInfo);
    }

    @Nullable
    public final Long getHotCount() {
        return this.hotCount;
    }

    @Nullable
    public final Long getRefreshHitPeriod() {
        return this.refreshHitPeriod;
    }

    @Nullable
    public final Reserve.ReserveInfo getReserveInfo() {
        return this.reserveInfo;
    }

    @Nullable
    public final Integer getSubscribed() {
        return this.subscribed;
    }

    public int hashCode() {
        Integer num = this.subscribed;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l11 = this.refreshHitPeriod;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.hotCount;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Reserve.ReserveInfo reserveInfo = this.reserveInfo;
        return iHashCode3 + (reserveInfo != null ? reserveInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCLiveInfo(subscribed=" + this.subscribed + ", refreshHitPeriod=" + this.refreshHitPeriod + ", hotCount=" + this.hotCount + ", reserveInfo=" + this.reserveInfo + ')';
    }

    public /* synthetic */ KCLiveInfo(Integer num, Long l11, Long l12, Reserve.ReserveInfo reserveInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, l11, l12, (i11 & 8) != 0 ? null : reserveInfo);
    }
}
