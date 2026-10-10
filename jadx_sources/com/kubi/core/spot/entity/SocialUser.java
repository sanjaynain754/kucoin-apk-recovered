package com.kubi.core.spot.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReaperEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, m90084d2 = {"Lcom/kubi/core/spot/entity/SocialUser;", "", "avatar", "", "channelId", "", "nftUrl", "personalId", "uid", "userNickName", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getChannelId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNftUrl", "getPersonalId", "getUid", "getUserNickName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/kubi/core/spot/entity/SocialUser;", "equals", "", "other", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SocialUser {

    @Nullable
    private final String avatar;

    @Nullable
    private final Long channelId;

    @Nullable
    private final String nftUrl;

    @Nullable
    private final String personalId;

    @Nullable
    private final Long uid;

    @Nullable
    private final String userNickName;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialUser)) {
            return false;
        }
        SocialUser socialUser = (SocialUser) other;
        return Intrinsics.areEqual(this.avatar, socialUser.avatar) && Intrinsics.areEqual(this.channelId, socialUser.channelId) && Intrinsics.areEqual(this.nftUrl, socialUser.nftUrl) && Intrinsics.areEqual(this.personalId, socialUser.personalId) && Intrinsics.areEqual(this.uid, socialUser.uid) && Intrinsics.areEqual(this.userNickName, socialUser.userNickName);
    }

    public static /* synthetic */ SocialUser copy$default(SocialUser socialUser, String str, Long l11, String str2, String str3, Long l12, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = socialUser.avatar;
        }
        if ((i11 & 2) != 0) {
            l11 = socialUser.channelId;
        }
        if ((i11 & 4) != 0) {
            str2 = socialUser.nftUrl;
        }
        if ((i11 & 8) != 0) {
            str3 = socialUser.personalId;
        }
        if ((i11 & 16) != 0) {
            l12 = socialUser.uid;
        }
        if ((i11 & 32) != 0) {
            str4 = socialUser.userNickName;
        }
        Long l13 = l12;
        String str5 = str4;
        return socialUser.copy(str, l11, str2, str3, l13, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNftUrl() {
        return this.nftUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPersonalId() {
        return this.personalId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getUid() {
        return this.uid;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserNickName() {
        return this.userNickName;
    }

    @NotNull
    public final SocialUser copy(@Nullable String avatar, @Nullable Long channelId, @Nullable String nftUrl, @Nullable String personalId, @Nullable Long uid, @Nullable String userNickName) {
        return new SocialUser(avatar, channelId, nftUrl, personalId, uid, userNickName);
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final Long getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final String getNftUrl() {
        return this.nftUrl;
    }

    @Nullable
    public final String getPersonalId() {
        return this.personalId;
    }

    @Nullable
    public final Long getUid() {
        return this.uid;
    }

    @Nullable
    public final String getUserNickName() {
        return this.userNickName;
    }

    public int hashCode() {
        String str = this.avatar;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.channelId;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.nftUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.personalId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l12 = this.uid;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str4 = this.userNickName;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SocialUser(avatar=" + this.avatar + ", channelId=" + this.channelId + ", nftUrl=" + this.nftUrl + ", personalId=" + this.personalId + ", uid=" + this.uid + ", userNickName=" + this.userNickName + ')';
    }

    public SocialUser(@Nullable String str, @Nullable Long l11, @Nullable String str2, @Nullable String str3, @Nullable Long l12, @Nullable String str4) {
        this.avatar = str;
        this.channelId = l11;
        this.nftUrl = str2;
        this.personalId = str3;
        this.uid = l12;
        this.userNickName = str4;
    }
}
