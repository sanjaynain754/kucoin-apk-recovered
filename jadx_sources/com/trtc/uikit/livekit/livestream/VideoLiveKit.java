package com.trtc.uikit.livekit.livestream;

import android.content.Context;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.livestream.impl.VideoLiveKitImpl;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoLiveKit.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\rH&J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/livestream/VideoLiveKit;", "", "startLive", "", "roomId", "", "stopLive", TUIConstants.TUIChat.CALL_BACK, "Lio/trtc/tuikit/atomicxcore/api/live/StopLiveCompletionHandler;", "joinLive", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "leaveLive", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "enterRoom", "roomOwnerId", "loginTxUserId", "joinAudienceClient", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface VideoLiveKit {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f79324a = Companion.f79325a;

    /* JADX INFO: compiled from: VideoLiveKit.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/livestream/VideoLiveKit$Companion;", "", "<init>", "()V", "createInstance", "Lcom/trtc/uikit/livekit/livestream/VideoLiveKit;", "context", "Landroid/content/Context;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f79325a = new Companion();

        @NotNull
        public final VideoLiveKit createInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return VideoLiveKitImpl.f79326j.createInstance(context);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo81736a(@Nullable CompletionHandler completionHandler);
}
