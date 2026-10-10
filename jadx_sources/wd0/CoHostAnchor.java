package wd0;

import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.trtc.uikit.livekit.features.anchorboardcast.store.ConnectionStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wd0.m, reason: from toString */
/* JADX INFO: compiled from: AnchorCoHostStore.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003JE\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006,"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/anchorboardcast/store/CoHostAnchor;", "", "roomId", "", "userId", TUIConstantDefine.USER_NAME, TUIConstantDefine.AVATAR_URL, "joinConnectionTime", "", "connectionStatus", "Lcom/trtc/uikit/livekit/features/anchorboardcast/store/ConnectionStatus;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/trtc/uikit/livekit/features/anchorboardcast/store/ConnectionStatus;)V", "getRoomId", "()Ljava/lang/String;", "setRoomId", "(Ljava/lang/String;)V", "getUserId", "setUserId", "getUserName", "setUserName", "getAvatarUrl", "setAvatarUrl", "getJoinConnectionTime", "()J", "setJoinConnectionTime", "(J)V", "getConnectionStatus", "()Lcom/trtc/uikit/livekit/features/anchorboardcast/store/ConnectionStatus;", "setConnectionStatus", "(Lcom/trtc/uikit/livekit/features/anchorboardcast/store/ConnectionStatus;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CoHostAnchor {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public String roomId;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public String userId;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public String userName;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public String avatarUrl;

    /* JADX INFO: renamed from: e, reason: from toString */
    public long joinConnectionTime;

    /* JADX INFO: renamed from: f, reason: from toString */
    @NotNull
    public ConnectionStatus connectionStatus;

    public CoHostAnchor() {
        this(null, null, null, null, 0L, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoHostAnchor)) {
            return false;
        }
        CoHostAnchor coHostAnchor = (CoHostAnchor) other;
        return Intrinsics.areEqual(this.roomId, coHostAnchor.roomId) && Intrinsics.areEqual(this.userId, coHostAnchor.userId) && Intrinsics.areEqual(this.userName, coHostAnchor.userName) && Intrinsics.areEqual(this.avatarUrl, coHostAnchor.avatarUrl) && this.joinConnectionTime == coHostAnchor.joinConnectionTime && this.connectionStatus == coHostAnchor.connectionStatus;
    }

    public CoHostAnchor(@NotNull String roomId, @NotNull String userId, @NotNull String userName, @NotNull String avatarUrl, long j11, @NotNull ConnectionStatus connectionStatus) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(connectionStatus, "connectionStatus");
        this.roomId = roomId;
        this.userId = userId;
        this.userName = userName;
        this.avatarUrl = avatarUrl;
        this.joinConnectionTime = j11;
        this.connectionStatus = connectionStatus;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ CoHostAnchor m101173b(CoHostAnchor coHostAnchor, String str, String str2, String str3, String str4, long j11, ConnectionStatus connectionStatus, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = coHostAnchor.roomId;
        }
        if ((i11 & 2) != 0) {
            str2 = coHostAnchor.userId;
        }
        if ((i11 & 4) != 0) {
            str3 = coHostAnchor.userName;
        }
        if ((i11 & 8) != 0) {
            str4 = coHostAnchor.avatarUrl;
        }
        if ((i11 & 16) != 0) {
            j11 = coHostAnchor.joinConnectionTime;
        }
        if ((i11 & 32) != 0) {
            connectionStatus = coHostAnchor.connectionStatus;
        }
        ConnectionStatus connectionStatus2 = connectionStatus;
        long j12 = j11;
        return coHostAnchor.m101174a(str, str2, str3, str4, j12, connectionStatus2);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final CoHostAnchor m101174a(@NotNull String roomId, @NotNull String userId, @NotNull String userName, @NotNull String avatarUrl, long j11, @NotNull ConnectionStatus connectionStatus) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(connectionStatus, "connectionStatus");
        return new CoHostAnchor(roomId, userId, userName, avatarUrl, j11, connectionStatus);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ConnectionStatus getConnectionStatus() {
        return this.connectionStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRoomId() {
        return this.roomId;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: h */
    public final void m101180h(@NotNull ConnectionStatus connectionStatus) {
        Intrinsics.checkNotNullParameter(connectionStatus, "<set-?>");
        this.connectionStatus = connectionStatus;
    }

    public int hashCode() {
        return (((((((((this.roomId.hashCode() * 31) + this.userId.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + Long.hashCode(this.joinConnectionTime)) * 31) + this.connectionStatus.hashCode();
    }

    @NotNull
    public String toString() {
        return "CoHostAnchor(roomId=" + this.roomId + ", userId=" + this.userId + ", userName=" + this.userName + ", avatarUrl=" + this.avatarUrl + ", joinConnectionTime=" + this.joinConnectionTime + ", connectionStatus=" + this.connectionStatus + ')';
    }

    public /* synthetic */ CoHostAnchor(String str, String str2, String str3, String str4, long j11, ConnectionStatus connectionStatus, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? 0L : j11, (i11 & 32) != 0 ? ConnectionStatus.UNKNOWN : connectionStatus);
    }
}
