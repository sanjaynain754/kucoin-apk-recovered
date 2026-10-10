package com.kubi.margin.entity;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReaperEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/margin/entity/ReaperWarpEntity;", "", "userInfo", "Lcom/kubi/margin/entity/ReaperUserInfo;", "postList", "", "Lcom/kubi/margin/entity/PostItem;", "<init>", "(Lcom/kubi/margin/entity/ReaperUserInfo;Ljava/util/List;)V", "getUserInfo", "()Lcom/kubi/margin/entity/ReaperUserInfo;", "setUserInfo", "(Lcom/kubi/margin/entity/ReaperUserInfo;)V", "getPostList", "()Ljava/util/List;", "setPostList", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ReaperWarpEntity {

    @NotNull
    private List<PostItem> postList;

    @Nullable
    private ReaperUserInfo userInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ReaperWarpEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReaperWarpEntity)) {
            return false;
        }
        ReaperWarpEntity reaperWarpEntity = (ReaperWarpEntity) other;
        return Intrinsics.areEqual(this.userInfo, reaperWarpEntity.userInfo) && Intrinsics.areEqual(this.postList, reaperWarpEntity.postList);
    }

    public ReaperWarpEntity(@Nullable ReaperUserInfo reaperUserInfo, @NotNull List<PostItem> postList) {
        Intrinsics.checkNotNullParameter(postList, "postList");
        this.userInfo = reaperUserInfo;
        this.postList = postList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReaperWarpEntity copy$default(ReaperWarpEntity reaperWarpEntity, ReaperUserInfo reaperUserInfo, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            reaperUserInfo = reaperWarpEntity.userInfo;
        }
        if ((i11 & 2) != 0) {
            list = reaperWarpEntity.postList;
        }
        return reaperWarpEntity.copy(reaperUserInfo, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ReaperUserInfo getUserInfo() {
        return this.userInfo;
    }

    @NotNull
    public final List<PostItem> component2() {
        return this.postList;
    }

    @NotNull
    public final ReaperWarpEntity copy(@Nullable ReaperUserInfo userInfo, @NotNull List<PostItem> postList) {
        Intrinsics.checkNotNullParameter(postList, "postList");
        return new ReaperWarpEntity(userInfo, postList);
    }

    @NotNull
    public final List<PostItem> getPostList() {
        return this.postList;
    }

    @Nullable
    public final ReaperUserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        ReaperUserInfo reaperUserInfo = this.userInfo;
        return ((reaperUserInfo == null ? 0 : reaperUserInfo.hashCode()) * 31) + this.postList.hashCode();
    }

    public final void setPostList(@NotNull List<PostItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.postList = list;
    }

    public final void setUserInfo(@Nullable ReaperUserInfo reaperUserInfo) {
        this.userInfo = reaperUserInfo;
    }

    @NotNull
    public String toString() {
        return "ReaperWarpEntity(userInfo=" + this.userInfo + ", postList=" + this.postList + ')';
    }

    public /* synthetic */ ReaperWarpEntity(ReaperUserInfo reaperUserInfo, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : reaperUserInfo, (i11 & 2) != 0 ? new ArrayList() : list);
    }
}
