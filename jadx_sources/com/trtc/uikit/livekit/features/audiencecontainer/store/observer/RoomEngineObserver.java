package com.trtc.uikit.livekit.features.audiencecontainer.store.observer;

import android.content.Context;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.trtc.tuikit.common.system.ContextProvider;
import com.trtc.uikit.livekit.R$string;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import ee0.C37144f;
import io.trtc.tuikit.atomicx.widget.basicwidget.toast.AtomicToast;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RoomEngineObserver.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/observer/RoomEngineObserver;", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;", "store", "Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;", "<init>", "(Lcom/trtc/uikit/livekit/features/audiencecontainer/store/AudienceStore;)V", "liveStoreRef", "Ljava/lang/ref/WeakReference;", "onRoomDismissed", "", "roomId", "", "reason", "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomDismissedReason;", "onKickedOffLine", "message", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RoomEngineObserver extends TUIRoomObserver {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f78602e = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final LiveKitLogger f78603f = LiveKitLogger.f77564c.getLiveStreamLogger("RoomEngineObserver");

    /* JADX INFO: renamed from: d */
    @NotNull
    public final WeakReference<C37144f> f78604d;

    /* JADX INFO: compiled from: RoomEngineObserver.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/audiencecontainer/store/observer/RoomEngineObserver$Companion;", "", "<init>", "()V", "LOGGER", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public RoomEngineObserver(@NotNull C37144f store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f78604d = new WeakReference<>(store);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public void onKickedOffLine(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        LiveKitLogger liveKitLogger = f78603f;
        liveKitLogger.m79404b(hashCode() + " onKickedOffLine:[message:" + message + ']');
        Context contextM79397b = ContextProvider.m79397b();
        AtomicToast atomicToast = AtomicToast.f87566a;
        Intrinsics.checkNotNull(contextM79397b);
        AtomicToast.m88196j(atomicToast, contextM79397b, message, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
        C37144f c37144f = this.f78604d.get();
        TUICore.notifyEvent(TUIConstants.Privacy.EVENT_ROOM_STATE_CHANGED, TUIConstants.Privacy.EVENT_SUB_KEY_ROOM_STATE_STOP, null);
        if (c37144f != null) {
            TUICore.notifyEvent("EVENT_KEY_LIVE_KIT", "EVENT_SUB_KEY_DESTROY_LIVE_VIEW", null);
            return;
        }
        liveKitLogger.m79403a(hashCode() + " onKickedOffLine: AudienceStore is null");
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public void onRoomDismissed(@NotNull String roomId, @NotNull TUIRoomDefine.RoomDismissedReason reason) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        f78603f.m79404b(hashCode() + " onRoomDismissed:[roomId" + roomId + ']');
        Context contextM79397b = ContextProvider.m79397b();
        AtomicToast atomicToast = AtomicToast.f87566a;
        Intrinsics.checkNotNull(contextM79397b);
        String string = contextM79397b.getResources().getString(R$string.common_room_destroy);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        AtomicToast.m88196j(atomicToast, contextM79397b, string, AtomicToast.Style.INFO, null, null, null, null, null, 248, null);
        TUICore.notifyEvent(TUIConstants.Privacy.EVENT_ROOM_STATE_CHANGED, TUIConstants.Privacy.EVENT_SUB_KEY_ROOM_STATE_STOP, null);
        C37144f c37144f = this.f78604d.get();
        if (c37144f != null) {
            c37144f.m83104w(roomId);
        }
    }
}
