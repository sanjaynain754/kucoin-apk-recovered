package com.trtc.uikit.livekit.p180kc.data.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LiveShareLink.kt */
/* JADX INFO: loaded from: classes60.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/data/entity/LiveShareLink;", "", "oneLinkUrl", "", "roomTitle", "roomDescription", "avatar", "nickname", "coverUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOneLinkUrl", "()Ljava/lang/String;", "getRoomTitle", "getRoomDescription", "getAvatar", "getNickname", "getCoverUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LiveShareLink {

    @SerializedName("avatar")
    @Nullable
    private final String avatar;

    @SerializedName("coverUrl")
    @Nullable
    private final String coverUrl;

    @SerializedName("nickname")
    @Nullable
    private final String nickname;

    @SerializedName("oneLinkUrl")
    @Nullable
    private final String oneLinkUrl;

    @SerializedName("roomDescription")
    @Nullable
    private final String roomDescription;

    @SerializedName("roomTitle")
    @Nullable
    private final String roomTitle;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveShareLink)) {
            return false;
        }
        LiveShareLink liveShareLink = (LiveShareLink) other;
        return Intrinsics.areEqual(this.oneLinkUrl, liveShareLink.oneLinkUrl) && Intrinsics.areEqual(this.roomTitle, liveShareLink.roomTitle) && Intrinsics.areEqual(this.roomDescription, liveShareLink.roomDescription) && Intrinsics.areEqual(this.avatar, liveShareLink.avatar) && Intrinsics.areEqual(this.nickname, liveShareLink.nickname) && Intrinsics.areEqual(this.coverUrl, liveShareLink.coverUrl);
    }

    public static /* synthetic */ LiveShareLink copy$default(LiveShareLink liveShareLink, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = liveShareLink.oneLinkUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = liveShareLink.roomTitle;
        }
        if ((i11 & 4) != 0) {
            str3 = liveShareLink.roomDescription;
        }
        if ((i11 & 8) != 0) {
            str4 = liveShareLink.avatar;
        }
        if ((i11 & 16) != 0) {
            str5 = liveShareLink.nickname;
        }
        if ((i11 & 32) != 0) {
            str6 = liveShareLink.coverUrl;
        }
        String str7 = str5;
        String str8 = str6;
        return liveShareLink.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOneLinkUrl() {
        return this.oneLinkUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRoomTitle() {
        return this.roomTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRoomDescription() {
        return this.roomDescription;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    @NotNull
    public final LiveShareLink copy(@Nullable String oneLinkUrl, @Nullable String roomTitle, @Nullable String roomDescription, @Nullable String avatar, @Nullable String nickname, @Nullable String coverUrl) {
        return new LiveShareLink(oneLinkUrl, roomTitle, roomDescription, avatar, nickname, coverUrl);
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final String getOneLinkUrl() {
        return this.oneLinkUrl;
    }

    @Nullable
    public final String getRoomDescription() {
        return this.roomDescription;
    }

    @Nullable
    public final String getRoomTitle() {
        return this.roomTitle;
    }

    public int hashCode() {
        String str = this.oneLinkUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.roomTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.roomDescription;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.avatar;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nickname;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.coverUrl;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LiveShareLink(oneLinkUrl=" + this.oneLinkUrl + ", roomTitle=" + this.roomTitle + ", roomDescription=" + this.roomDescription + ", avatar=" + this.avatar + ", nickname=" + this.nickname + ", coverUrl=" + this.coverUrl + ')';
    }

    public LiveShareLink(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.oneLinkUrl = str;
        this.roomTitle = str2;
        this.roomDescription = str3;
        this.avatar = str4;
        this.nickname = str5;
        this.coverUrl = str6;
    }
}
