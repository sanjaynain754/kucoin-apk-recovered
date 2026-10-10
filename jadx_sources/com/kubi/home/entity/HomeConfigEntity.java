package com.kubi.home.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeConfigEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\f¨\u0006!"}, m90084d2 = {"Lcom/kubi/home/entity/HomeConfigEntity;", "", "useHomeV2", "", "bizApiCacheTime", "", "assetBizApiCacheTime", "bizApiLoopTime", "videoPlayerInApp", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getUseHomeV2", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBizApiCacheTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAssetBizApiCacheTime", "getBizApiLoopTime", "getVideoPlayerInApp", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/kubi/home/entity/HomeConfigEntity;", "equals", "other", "hashCode", "", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HomeConfigEntity {

    @SerializedName("asset_api_cache_time")
    @Nullable
    private final Long assetBizApiCacheTime;

    @SerializedName("biz_api_cache_time")
    @Nullable
    private final Long bizApiCacheTime;

    @SerializedName("biz_api_loop_time")
    @Nullable
    private final Long bizApiLoopTime;

    @SerializedName("use_home_v2")
    @Nullable
    private final Boolean useHomeV2;

    @SerializedName("video_player_inapp")
    @Nullable
    private final Boolean videoPlayerInApp;

    public HomeConfigEntity() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeConfigEntity)) {
            return false;
        }
        HomeConfigEntity homeConfigEntity = (HomeConfigEntity) other;
        return Intrinsics.areEqual(this.useHomeV2, homeConfigEntity.useHomeV2) && Intrinsics.areEqual(this.bizApiCacheTime, homeConfigEntity.bizApiCacheTime) && Intrinsics.areEqual(this.assetBizApiCacheTime, homeConfigEntity.assetBizApiCacheTime) && Intrinsics.areEqual(this.bizApiLoopTime, homeConfigEntity.bizApiLoopTime) && Intrinsics.areEqual(this.videoPlayerInApp, homeConfigEntity.videoPlayerInApp);
    }

    public HomeConfigEntity(@Nullable Boolean bool, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Boolean bool2) {
        this.useHomeV2 = bool;
        this.bizApiCacheTime = l11;
        this.assetBizApiCacheTime = l12;
        this.bizApiLoopTime = l13;
        this.videoPlayerInApp = bool2;
    }

    public static /* synthetic */ HomeConfigEntity copy$default(HomeConfigEntity homeConfigEntity, Boolean bool, Long l11, Long l12, Long l13, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = homeConfigEntity.useHomeV2;
        }
        if ((i11 & 2) != 0) {
            l11 = homeConfigEntity.bizApiCacheTime;
        }
        if ((i11 & 4) != 0) {
            l12 = homeConfigEntity.assetBizApiCacheTime;
        }
        if ((i11 & 8) != 0) {
            l13 = homeConfigEntity.bizApiLoopTime;
        }
        if ((i11 & 16) != 0) {
            bool2 = homeConfigEntity.videoPlayerInApp;
        }
        Boolean bool3 = bool2;
        Long l14 = l12;
        return homeConfigEntity.copy(bool, l11, l14, l13, bool3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getUseHomeV2() {
        return this.useHomeV2;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getBizApiCacheTime() {
        return this.bizApiCacheTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getAssetBizApiCacheTime() {
        return this.assetBizApiCacheTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getBizApiLoopTime() {
        return this.bizApiLoopTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getVideoPlayerInApp() {
        return this.videoPlayerInApp;
    }

    @NotNull
    public final HomeConfigEntity copy(@Nullable Boolean useHomeV2, @Nullable Long bizApiCacheTime, @Nullable Long assetBizApiCacheTime, @Nullable Long bizApiLoopTime, @Nullable Boolean videoPlayerInApp) {
        return new HomeConfigEntity(useHomeV2, bizApiCacheTime, assetBizApiCacheTime, bizApiLoopTime, videoPlayerInApp);
    }

    @Nullable
    public final Long getAssetBizApiCacheTime() {
        return this.assetBizApiCacheTime;
    }

    @Nullable
    public final Long getBizApiCacheTime() {
        return this.bizApiCacheTime;
    }

    @Nullable
    public final Long getBizApiLoopTime() {
        return this.bizApiLoopTime;
    }

    @Nullable
    public final Boolean getUseHomeV2() {
        return this.useHomeV2;
    }

    @Nullable
    public final Boolean getVideoPlayerInApp() {
        return this.videoPlayerInApp;
    }

    public int hashCode() {
        Boolean bool = this.useHomeV2;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l11 = this.bizApiCacheTime;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.assetBizApiCacheTime;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.bizApiLoopTime;
        int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Boolean bool2 = this.videoPlayerInApp;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HomeConfigEntity(useHomeV2=" + this.useHomeV2 + ", bizApiCacheTime=" + this.bizApiCacheTime + ", assetBizApiCacheTime=" + this.assetBizApiCacheTime + ", bizApiLoopTime=" + this.bizApiLoopTime + ", videoPlayerInApp=" + this.videoPlayerInApp + ')';
    }

    public /* synthetic */ HomeConfigEntity(Boolean bool, Long l11, Long l12, Long l13, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : l12, (i11 & 8) != 0 ? null : l13, (i11 & 16) != 0 ? null : bool2);
    }
}
