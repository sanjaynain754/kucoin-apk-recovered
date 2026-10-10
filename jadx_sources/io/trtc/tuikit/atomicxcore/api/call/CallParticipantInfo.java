package io.trtc.tuikit.atomicxcore.api.call;

import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010'\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0013\"\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006,"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;", "", "id", "", "name", TUIConstantDefine.AVATAR_URL, "remark", "status", "Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;", "isMicrophoneOpened", "", "isCameraOpened", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;ZZ)V", "getAvatarUrl", "()Ljava/lang/String;", "setAvatarUrl", "(Ljava/lang/String;)V", "getId", "setId", "()Z", "setCameraOpened", "(Z)V", "setMicrophoneOpened", "getName", "setName", "getRemark", "setRemark", "getStatus", "()Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;", "setStatus", "(Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class CallParticipantInfo {

    @NotNull
    private String avatarUrl;

    @NotNull
    private String id;
    private boolean isCameraOpened;
    private boolean isMicrophoneOpened;

    @NotNull
    private String name;

    @NotNull
    private String remark;

    @NotNull
    private CallParticipantStatus status;

    public CallParticipantInfo() {
        this(null, null, null, null, null, false, false, 127, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallParticipantInfo)) {
            return false;
        }
        CallParticipantInfo callParticipantInfo = (CallParticipantInfo) other;
        return Intrinsics.areEqual(this.id, callParticipantInfo.id) && Intrinsics.areEqual(this.name, callParticipantInfo.name) && Intrinsics.areEqual(this.avatarUrl, callParticipantInfo.avatarUrl) && Intrinsics.areEqual(this.remark, callParticipantInfo.remark) && this.status == callParticipantInfo.status && this.isMicrophoneOpened == callParticipantInfo.isMicrophoneOpened && this.isCameraOpened == callParticipantInfo.isCameraOpened;
    }

    public CallParticipantInfo(@NotNull String id2, @NotNull String name, @NotNull String avatarUrl, @NotNull String remark, @NotNull CallParticipantStatus status, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(status, "status");
        this.id = id2;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.remark = remark;
        this.status = status;
        this.isMicrophoneOpened = z11;
        this.isCameraOpened = z12;
    }

    public static /* synthetic */ CallParticipantInfo copy$default(CallParticipantInfo callParticipantInfo, String str, String str2, String str3, String str4, CallParticipantStatus callParticipantStatus, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = callParticipantInfo.id;
        }
        if ((i11 & 2) != 0) {
            str2 = callParticipantInfo.name;
        }
        if ((i11 & 4) != 0) {
            str3 = callParticipantInfo.avatarUrl;
        }
        if ((i11 & 8) != 0) {
            str4 = callParticipantInfo.remark;
        }
        if ((i11 & 16) != 0) {
            callParticipantStatus = callParticipantInfo.status;
        }
        if ((i11 & 32) != 0) {
            z11 = callParticipantInfo.isMicrophoneOpened;
        }
        if ((i11 & 64) != 0) {
            z12 = callParticipantInfo.isCameraOpened;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        CallParticipantStatus callParticipantStatus2 = callParticipantStatus;
        String str5 = str3;
        return callParticipantInfo.copy(str, str2, str5, str4, callParticipantStatus2, z13, z14);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CallParticipantStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsMicrophoneOpened() {
        return this.isMicrophoneOpened;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsCameraOpened() {
        return this.isCameraOpened;
    }

    @NotNull
    public final CallParticipantInfo copy(@NotNull String id2, @NotNull String name, @NotNull String avatarUrl, @NotNull String remark, @NotNull CallParticipantStatus status, boolean isMicrophoneOpened, boolean isCameraOpened) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(remark, "remark");
        Intrinsics.checkNotNullParameter(status, "status");
        return new CallParticipantInfo(id2, name, avatarUrl, remark, status, isMicrophoneOpened, isCameraOpened);
    }

    @NotNull
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getRemark() {
        return this.remark;
    }

    @NotNull
    public final CallParticipantStatus getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = (this.status.hashCode() + AbstractC39391a.m88220a(this.remark, AbstractC39391a.m88220a(this.avatarUrl, AbstractC39391a.m88220a(this.name, this.id.hashCode() * 31, 31), 31), 31)) * 31;
        boolean z11 = this.isMicrophoneOpened;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        boolean z12 = this.isCameraOpened;
        return i11 + (z12 ? 1 : z12);
    }

    public final boolean isCameraOpened() {
        return this.isCameraOpened;
    }

    public final boolean isMicrophoneOpened() {
        return this.isMicrophoneOpened;
    }

    public final void setAvatarUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.avatarUrl = str;
    }

    public final void setCameraOpened(boolean z11) {
        this.isCameraOpened = z11;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setMicrophoneOpened(boolean z11) {
        this.isMicrophoneOpened = z11;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setRemark(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.remark = str;
    }

    public final void setStatus(@NotNull CallParticipantStatus callParticipantStatus) {
        Intrinsics.checkNotNullParameter(callParticipantStatus, "<set-?>");
        this.status = callParticipantStatus;
    }

    @NotNull
    public String toString() {
        return "CallParticipantInfo(id=" + this.id + ", name=" + this.name + ", avatarUrl=" + this.avatarUrl + ", remark=" + this.remark + ", status=" + this.status + ", isMicrophoneOpened=" + this.isMicrophoneOpened + ", isCameraOpened=" + this.isCameraOpened + ')';
    }

    public /* synthetic */ CallParticipantInfo(String str, String str2, String str3, String str4, CallParticipantStatus callParticipantStatus, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? CallParticipantStatus.None : callParticipantStatus, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? false : z12);
    }
}
