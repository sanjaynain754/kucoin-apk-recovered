package io.trtc.tuikit.atomicxcore.api.search;

import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003JK\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006+"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/search/FriendSearchInfo;", "", "userID", "", TUIConstants.TUIContact.FRIEND_REMARK, "friendAddTime", "", "friendCustomInfo", "", "", "userInfo", "Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;)V", "getFriendAddTime", "()J", "setFriendAddTime", "(J)V", "getFriendCustomInfo", "()Ljava/util/Map;", "setFriendCustomInfo", "(Ljava/util/Map;)V", "getFriendRemark", "()Ljava/lang/String;", "setFriendRemark", "(Ljava/lang/String;)V", "getUserID", "setUserID", "getUserInfo", "()Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;", "setUserInfo", "(Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class FriendSearchInfo {
    private long friendAddTime;

    @Nullable
    private Map<String, byte[]> friendCustomInfo;

    @Nullable
    private String friendRemark;

    @NotNull
    private String userID;

    @NotNull
    private UserProfile userInfo;

    public FriendSearchInfo(@NotNull String userID, @Nullable String str, long j11, @Nullable Map<String, byte[]> map, @NotNull UserProfile userInfo) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        this.userID = userID;
        this.friendRemark = str;
        this.friendAddTime = j11;
        this.friendCustomInfo = map;
        this.userInfo = userInfo;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendSearchInfo)) {
            return false;
        }
        FriendSearchInfo friendSearchInfo = (FriendSearchInfo) other;
        return Intrinsics.areEqual(this.userID, friendSearchInfo.userID) && Intrinsics.areEqual(this.friendRemark, friendSearchInfo.friendRemark) && this.friendAddTime == friendSearchInfo.friendAddTime && Intrinsics.areEqual(this.friendCustomInfo, friendSearchInfo.friendCustomInfo) && Intrinsics.areEqual(this.userInfo, friendSearchInfo.userInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FriendSearchInfo copy$default(FriendSearchInfo friendSearchInfo, String str, String str2, long j11, Map map, UserProfile userProfile, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = friendSearchInfo.userID;
        }
        if ((i11 & 2) != 0) {
            str2 = friendSearchInfo.friendRemark;
        }
        if ((i11 & 4) != 0) {
            j11 = friendSearchInfo.friendAddTime;
        }
        if ((i11 & 8) != 0) {
            map = friendSearchInfo.friendCustomInfo;
        }
        if ((i11 & 16) != 0) {
            userProfile = friendSearchInfo.userInfo;
        }
        long j12 = j11;
        return friendSearchInfo.copy(str, str2, j12, map, userProfile);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserID() {
        return this.userID;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFriendRemark() {
        return this.friendRemark;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getFriendAddTime() {
        return this.friendAddTime;
    }

    @Nullable
    public final Map<String, byte[]> component4() {
        return this.friendCustomInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final UserProfile getUserInfo() {
        return this.userInfo;
    }

    public final long getFriendAddTime() {
        return this.friendAddTime;
    }

    @Nullable
    public final Map<String, byte[]> getFriendCustomInfo() {
        return this.friendCustomInfo;
    }

    @Nullable
    public final String getFriendRemark() {
        return this.friendRemark;
    }

    @NotNull
    public final String getUserID() {
        return this.userID;
    }

    @NotNull
    public final UserProfile getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int iHashCode = this.userID.hashCode() * 31;
        String str = this.friendRemark;
        int iHashCode2 = (Long.hashCode(this.friendAddTime) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Map<String, byte[]> map = this.friendCustomInfo;
        return this.userInfo.hashCode() + ((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    public final void setFriendAddTime(long j11) {
        this.friendAddTime = j11;
    }

    public final void setFriendCustomInfo(@Nullable Map<String, byte[]> map) {
        this.friendCustomInfo = map;
    }

    public final void setFriendRemark(@Nullable String str) {
        this.friendRemark = str;
    }

    public final void setUserID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userID = str;
    }

    public final void setUserInfo(@NotNull UserProfile userProfile) {
        Intrinsics.checkNotNullParameter(userProfile, "<set-?>");
        this.userInfo = userProfile;
    }

    @NotNull
    public String toString() {
        return "FriendSearchInfo(userID=" + this.userID + ", friendRemark=" + this.friendRemark + ", friendAddTime=" + this.friendAddTime + ", friendCustomInfo=" + this.friendCustomInfo + ", userInfo=" + this.userInfo + ')';
    }

    @NotNull
    public final FriendSearchInfo copy(@NotNull String userID, @Nullable String friendRemark, long friendAddTime, @Nullable Map<String, byte[]> friendCustomInfo, @NotNull UserProfile userInfo) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        return new FriendSearchInfo(userID, friendRemark, friendAddTime, friendCustomInfo, userInfo);
    }

    public /* synthetic */ FriendSearchInfo(String str, String str2, long j11, Map map, UserProfile userProfile, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? null : map, userProfile);
    }
}
