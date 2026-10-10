package com.kubi.spot.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReaperEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/spot/entity/ReaperUserInfo;", "", "avatar", "", "name", "nftUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getName", "getNftUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ReaperUserInfo {

    @Nullable
    private final String avatar;

    @Nullable
    private final String name;

    @Nullable
    private final String nftUrl;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReaperUserInfo)) {
            return false;
        }
        ReaperUserInfo reaperUserInfo = (ReaperUserInfo) other;
        return Intrinsics.areEqual(this.avatar, reaperUserInfo.avatar) && Intrinsics.areEqual(this.name, reaperUserInfo.name) && Intrinsics.areEqual(this.nftUrl, reaperUserInfo.nftUrl);
    }

    public static /* synthetic */ ReaperUserInfo copy$default(ReaperUserInfo reaperUserInfo, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reaperUserInfo.avatar;
        }
        if ((i11 & 2) != 0) {
            str2 = reaperUserInfo.name;
        }
        if ((i11 & 4) != 0) {
            str3 = reaperUserInfo.nftUrl;
        }
        return reaperUserInfo.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNftUrl() {
        return this.nftUrl;
    }

    @NotNull
    public final ReaperUserInfo copy(@Nullable String avatar, @Nullable String name, @Nullable String nftUrl) {
        return new ReaperUserInfo(avatar, name, nftUrl);
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNftUrl() {
        return this.nftUrl;
    }

    public int hashCode() {
        String str = this.avatar;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nftUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReaperUserInfo(avatar=" + this.avatar + ", name=" + this.name + ", nftUrl=" + this.nftUrl + ')';
    }

    public ReaperUserInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.avatar = str;
        this.name = str2;
        this.nftUrl = str3;
    }
}
