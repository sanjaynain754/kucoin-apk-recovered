package io.trtc.tuikit.atomicxcore.api.call;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39391a;
import java.util.LinkedHashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0002\u0010\u0011J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0019\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\bHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\t\u00105\u001a\u00020\u000fHÆ\u0003J\t\u00106\u001a\u00020\u000fHÆ\u0003Ju\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0010\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001b¨\u0006>"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;", "", TUIConstants.TUICalling.CALL_ID, "", "roomId", "inviterId", "inviteeIds", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "chatGroupId", "mediaType", "Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;", DbParams.KEY_CHANNEL_RESULT, "Lio/trtc/tuikit/atomicxcore/api/call/CallDirection;", "startTime", "", TypedValues.TransitionType.S_DURATION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;Lio/trtc/tuikit/atomicxcore/api/call/CallDirection;JJ)V", "getCallId", "()Ljava/lang/String;", "setCallId", "(Ljava/lang/String;)V", "getChatGroupId", "setChatGroupId", "getDuration", "()J", "setDuration", "(J)V", "getInviteeIds", "()Ljava/util/LinkedHashSet;", "setInviteeIds", "(Ljava/util/LinkedHashSet;)V", "getInviterId", "setInviterId", "getMediaType", "()Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;", "setMediaType", "(Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;)V", "getResult", "()Lio/trtc/tuikit/atomicxcore/api/call/CallDirection;", "setResult", "(Lio/trtc/tuikit/atomicxcore/api/call/CallDirection;)V", "getRoomId", "setRoomId", "getStartTime", "setStartTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class CallInfo {

    @NotNull
    private String callId;

    @NotNull
    private String chatGroupId;
    private long duration;

    @NotNull
    private LinkedHashSet<String> inviteeIds;

    @NotNull
    private String inviterId;

    @Nullable
    private CallMediaType mediaType;

    @NotNull
    private CallDirection result;

    @NotNull
    private String roomId;
    private long startTime;

    public CallInfo() {
        this(null, null, null, null, null, null, null, 0L, 0L, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallInfo)) {
            return false;
        }
        CallInfo callInfo = (CallInfo) other;
        return Intrinsics.areEqual(this.callId, callInfo.callId) && Intrinsics.areEqual(this.roomId, callInfo.roomId) && Intrinsics.areEqual(this.inviterId, callInfo.inviterId) && Intrinsics.areEqual(this.inviteeIds, callInfo.inviteeIds) && Intrinsics.areEqual(this.chatGroupId, callInfo.chatGroupId) && this.mediaType == callInfo.mediaType && this.result == callInfo.result && this.startTime == callInfo.startTime && this.duration == callInfo.duration;
    }

    public CallInfo(@NotNull String callId, @NotNull String roomId, @NotNull String inviterId, @NotNull LinkedHashSet<String> inviteeIds, @NotNull String chatGroupId, @Nullable CallMediaType callMediaType, @NotNull CallDirection result, long j11, long j12) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(inviterId, "inviterId");
        Intrinsics.checkNotNullParameter(inviteeIds, "inviteeIds");
        Intrinsics.checkNotNullParameter(chatGroupId, "chatGroupId");
        Intrinsics.checkNotNullParameter(result, "result");
        this.callId = callId;
        this.roomId = roomId;
        this.inviterId = inviterId;
        this.inviteeIds = inviteeIds;
        this.chatGroupId = chatGroupId;
        this.mediaType = callMediaType;
        this.result = result;
        this.startTime = j11;
        this.duration = j12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallInfo copy$default(CallInfo callInfo, String str, String str2, String str3, LinkedHashSet linkedHashSet, String str4, CallMediaType callMediaType, CallDirection callDirection, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = callInfo.callId;
        }
        if ((i11 & 2) != 0) {
            str2 = callInfo.roomId;
        }
        if ((i11 & 4) != 0) {
            str3 = callInfo.inviterId;
        }
        if ((i11 & 8) != 0) {
            linkedHashSet = callInfo.inviteeIds;
        }
        if ((i11 & 16) != 0) {
            str4 = callInfo.chatGroupId;
        }
        if ((i11 & 32) != 0) {
            callMediaType = callInfo.mediaType;
        }
        if ((i11 & 64) != 0) {
            callDirection = callInfo.result;
        }
        if ((i11 & 128) != 0) {
            j11 = callInfo.startTime;
        }
        if ((i11 & 256) != 0) {
            j12 = callInfo.duration;
        }
        long j13 = j12;
        long j14 = j11;
        CallMediaType callMediaType2 = callMediaType;
        CallDirection callDirection2 = callDirection;
        String str5 = str4;
        String str6 = str3;
        return callInfo.copy(str, str2, str6, linkedHashSet, str5, callMediaType2, callDirection2, j14, j13);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRoomId() {
        return this.roomId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInviterId() {
        return this.inviterId;
    }

    @NotNull
    public final LinkedHashSet<String> component4() {
        return this.inviteeIds;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChatGroupId() {
        return this.chatGroupId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CallMediaType getMediaType() {
        return this.mediaType;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CallDirection getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final CallInfo copy(@NotNull String callId, @NotNull String roomId, @NotNull String inviterId, @NotNull LinkedHashSet<String> inviteeIds, @NotNull String chatGroupId, @Nullable CallMediaType mediaType, @NotNull CallDirection result, long startTime, long duration) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(inviterId, "inviterId");
        Intrinsics.checkNotNullParameter(inviteeIds, "inviteeIds");
        Intrinsics.checkNotNullParameter(chatGroupId, "chatGroupId");
        Intrinsics.checkNotNullParameter(result, "result");
        return new CallInfo(callId, roomId, inviterId, inviteeIds, chatGroupId, mediaType, result, startTime, duration);
    }

    @NotNull
    public final String getCallId() {
        return this.callId;
    }

    @NotNull
    public final String getChatGroupId() {
        return this.chatGroupId;
    }

    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final LinkedHashSet<String> getInviteeIds() {
        return this.inviteeIds;
    }

    @NotNull
    public final String getInviterId() {
        return this.inviterId;
    }

    @Nullable
    public final CallMediaType getMediaType() {
        return this.mediaType;
    }

    @NotNull
    public final CallDirection getResult() {
        return this.result;
    }

    @NotNull
    public final String getRoomId() {
        return this.roomId;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int iM88220a = AbstractC39391a.m88220a(this.chatGroupId, (this.inviteeIds.hashCode() + AbstractC39391a.m88220a(this.inviterId, AbstractC39391a.m88220a(this.roomId, this.callId.hashCode() * 31, 31), 31)) * 31, 31);
        CallMediaType callMediaType = this.mediaType;
        return Long.hashCode(this.duration) + ((Long.hashCode(this.startTime) + ((this.result.hashCode() + ((iM88220a + (callMediaType == null ? 0 : callMediaType.hashCode())) * 31)) * 31)) * 31);
    }

    public final void setCallId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.callId = str;
    }

    public final void setChatGroupId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chatGroupId = str;
    }

    public final void setDuration(long j11) {
        this.duration = j11;
    }

    public final void setInviteeIds(@NotNull LinkedHashSet<String> linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<set-?>");
        this.inviteeIds = linkedHashSet;
    }

    public final void setInviterId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.inviterId = str;
    }

    public final void setMediaType(@Nullable CallMediaType callMediaType) {
        this.mediaType = callMediaType;
    }

    public final void setResult(@NotNull CallDirection callDirection) {
        Intrinsics.checkNotNullParameter(callDirection, "<set-?>");
        this.result = callDirection;
    }

    public final void setRoomId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomId = str;
    }

    public final void setStartTime(long j11) {
        this.startTime = j11;
    }

    @NotNull
    public String toString() {
        return "CallInfo(callId=" + this.callId + ", roomId=" + this.roomId + ", inviterId=" + this.inviterId + ", inviteeIds=" + this.inviteeIds + ", chatGroupId=" + this.chatGroupId + ", mediaType=" + this.mediaType + ", result=" + this.result + ", startTime=" + this.startTime + ", duration=" + this.duration + ')';
    }

    public /* synthetic */ CallInfo(String str, String str2, String str3, LinkedHashSet linkedHashSet, String str4, CallMediaType callMediaType, CallDirection callDirection, long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? new LinkedHashSet() : linkedHashSet, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? null : callMediaType, (i11 & 64) != 0 ? CallDirection.Unknown : callDirection, (i11 & 128) != 0 ? 0L : j11, (i11 & 256) != 0 ? 0L : j12);
    }
}
