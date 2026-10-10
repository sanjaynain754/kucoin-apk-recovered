package io.trtc.tuikit.atomicxcore.api.call;

import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000f"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/call/CallListener;", "", "()V", "onCallEnded", "", TUIConstants.TUICalling.CALL_ID, "", "mediaType", "Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;", "reason", "Lio/trtc/tuikit/atomicxcore/api/call/CallEndReason;", "userId", "onCallReceived", TUIConstants.TUIContact.USER_DATA, "onCallStarted", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class CallListener {
    public void onCallEnded(@NotNull String callId, @NotNull CallMediaType mediaType, @NotNull CallEndReason reason, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(userId, "userId");
    }

    public void onCallReceived(@NotNull String callId, @NotNull CallMediaType mediaType, @NotNull String userData) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(userData, "userData");
    }

    public void onCallStarted(@NotNull String callId, @NotNull CallMediaType mediaType) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
    }
}
