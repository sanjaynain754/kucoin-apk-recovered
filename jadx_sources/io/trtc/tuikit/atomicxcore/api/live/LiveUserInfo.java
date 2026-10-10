package io.trtc.tuikit.atomicxcore.api.live;

import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39392b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;", "", "userID", "", TUIConstantDefine.USER_NAME, "avatarURL", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarURL", "()Ljava/lang/String;", "setAvatarURL", "(Ljava/lang/String;)V", "getUserID", "setUserID", "getUserName", "setUserName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class LiveUserInfo {

    @NotNull
    private String avatarURL;

    @NotNull
    private String userID;

    @NotNull
    private String userName;

    public LiveUserInfo() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveUserInfo)) {
            return false;
        }
        LiveUserInfo liveUserInfo = (LiveUserInfo) other;
        return Intrinsics.areEqual(this.userID, liveUserInfo.userID) && Intrinsics.areEqual(this.userName, liveUserInfo.userName) && Intrinsics.areEqual(this.avatarURL, liveUserInfo.avatarURL);
    }

    public LiveUserInfo(@NotNull String userID, @NotNull String userName, @NotNull String avatarURL) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(avatarURL, "avatarURL");
        this.userID = userID;
        this.userName = userName;
        this.avatarURL = avatarURL;
    }

    public static /* synthetic */ LiveUserInfo copy$default(LiveUserInfo liveUserInfo, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = liveUserInfo.userID;
        }
        if ((i11 & 2) != 0) {
            str2 = liveUserInfo.userName;
        }
        if ((i11 & 4) != 0) {
            str3 = liveUserInfo.avatarURL;
        }
        return liveUserInfo.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    @NotNull
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    @NotNull
    public final String getUserID() {
        return this.userID;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return this.avatarURL.hashCode() + AbstractC39391a.m88220a(this.userName, this.userID.hashCode() * 31, 31);
    }

    public final void setAvatarURL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.avatarURL = str;
    }

    public final void setUserID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userID = str;
    }

    public final void setUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userName = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LiveUserInfo(userID=");
        sb2.append(this.userID);
        sb2.append(", userName=");
        sb2.append(this.userName);
        sb2.append(", avatarURL=");
        return AbstractC39392b.m88221a(sb2, this.avatarURL, ')');
    }

    @NotNull
    public final LiveUserInfo copy(@NotNull String userID, @NotNull String userName, @NotNull String avatarURL) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(avatarURL, "avatarURL");
        return new LiveUserInfo(userID, userName, avatarURL);
    }

    public /* synthetic */ LiveUserInfo(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3);
    }
}
