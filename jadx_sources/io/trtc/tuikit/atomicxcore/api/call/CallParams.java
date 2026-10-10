package io.trtc.tuikit.atomicxcore.api.call;

import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J;\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000e¨\u0006$"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/call/CallParams;", "", "roomId", "", "timeout", "", TUIConstants.TUIContact.USER_DATA, "chatGroupId", "isEphemeralCall", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "getChatGroupId", "()Ljava/lang/String;", "setChatGroupId", "(Ljava/lang/String;)V", "()Z", "setEphemeralCall", "(Z)V", "getRoomId", "setRoomId", "getTimeout", "()I", "setTimeout", "(I)V", "getUserData", "setUserData", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class CallParams {

    @NotNull
    private String chatGroupId;
    private boolean isEphemeralCall;

    @NotNull
    private String roomId;
    private int timeout;

    @NotNull
    private String userData;

    public CallParams() {
        this(null, 0, null, null, false, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallParams)) {
            return false;
        }
        CallParams callParams = (CallParams) other;
        return Intrinsics.areEqual(this.roomId, callParams.roomId) && this.timeout == callParams.timeout && Intrinsics.areEqual(this.userData, callParams.userData) && Intrinsics.areEqual(this.chatGroupId, callParams.chatGroupId) && this.isEphemeralCall == callParams.isEphemeralCall;
    }

    public CallParams(@NotNull String roomId, int i11, @NotNull String userData, @NotNull String chatGroupId, boolean z11) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(chatGroupId, "chatGroupId");
        this.roomId = roomId;
        this.timeout = i11;
        this.userData = userData;
        this.chatGroupId = chatGroupId;
        this.isEphemeralCall = z11;
    }

    public static /* synthetic */ CallParams copy$default(CallParams callParams, String str, int i11, String str2, String str3, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = callParams.roomId;
        }
        if ((i12 & 2) != 0) {
            i11 = callParams.timeout;
        }
        if ((i12 & 4) != 0) {
            str2 = callParams.userData;
        }
        if ((i12 & 8) != 0) {
            str3 = callParams.chatGroupId;
        }
        if ((i12 & 16) != 0) {
            z11 = callParams.isEphemeralCall;
        }
        boolean z12 = z11;
        String str4 = str2;
        return callParams.copy(str, i11, str4, str3, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoomId() {
        return this.roomId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTimeout() {
        return this.timeout;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserData() {
        return this.userData;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChatGroupId() {
        return this.chatGroupId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsEphemeralCall() {
        return this.isEphemeralCall;
    }

    @NotNull
    public final CallParams copy(@NotNull String roomId, int timeout, @NotNull String userData, @NotNull String chatGroupId, boolean isEphemeralCall) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(chatGroupId, "chatGroupId");
        return new CallParams(roomId, timeout, userData, chatGroupId, isEphemeralCall);
    }

    @NotNull
    public final String getChatGroupId() {
        return this.chatGroupId;
    }

    @NotNull
    public final String getRoomId() {
        return this.roomId;
    }

    public final int getTimeout() {
        return this.timeout;
    }

    @NotNull
    public final String getUserData() {
        return this.userData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iM88220a = AbstractC39391a.m88220a(this.chatGroupId, AbstractC39391a.m88220a(this.userData, AbstractC39396a.m88225a(this.timeout, this.roomId.hashCode() * 31, 31), 31), 31);
        boolean z11 = this.isEphemeralCall;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return iM88220a + r11;
    }

    public final boolean isEphemeralCall() {
        return this.isEphemeralCall;
    }

    public final void setChatGroupId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chatGroupId = str;
    }

    public final void setEphemeralCall(boolean z11) {
        this.isEphemeralCall = z11;
    }

    public final void setRoomId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomId = str;
    }

    public final void setTimeout(int i11) {
        this.timeout = i11;
    }

    public final void setUserData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userData = str;
    }

    @NotNull
    public String toString() {
        return "CallParams(roomId=" + this.roomId + ", timeout=" + this.timeout + ", userData=" + this.userData + ", chatGroupId=" + this.chatGroupId + ", isEphemeralCall=" + this.isEphemeralCall + ')';
    }

    public /* synthetic */ CallParams(String str, int i11, String str2, String str3, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? 30 : i11, (i12 & 4) != 0 ? "" : str2, (i12 & 8) != 0 ? "" : str3, (i12 & 16) != 0 ? false : z11);
    }
}
