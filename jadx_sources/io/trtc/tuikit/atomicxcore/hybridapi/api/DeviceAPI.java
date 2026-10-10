package io.trtc.tuikit.atomicxcore.hybridapi.api;

import android.content.Context;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.live2.impl.V2TXLiveDefInner;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.device.AudioRoute;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.device.MirrorType;
import io.trtc.tuikit.atomicxcore.api.device.VideoQuality;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridRequest;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridResponse;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/api/DeviceAPI;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "closeLocalCamera", "", "request", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "closeLocalMicrophone", "openLocalCamera", "openLocalMicrophone", "reset", V2TXLiveDefInner.TXLivePropertyKey.kV2SetAudioRoute, "setCaptureVolume", "setOutputVolume", "startScreenShare", "stopScreenShare", "switchCamera", "switchMirror", "updateVideoQuality", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class DeviceAPI {

    @NotNull
    private final Context context;

    public DeviceAPI(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final void closeLocalCamera(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        DeviceStore.INSTANCE.shared().closeLocalCamera();
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    public final void closeLocalMicrophone(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        DeviceStore.INSTANCE.shared().closeLocalMicrophone();
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    public final void openLocalCamera(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("isFront") : null;
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        DeviceStore.INSTANCE.shared().openLocalCamera(bool != null ? bool.booleanValue() : true, new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.DeviceAPI$openLocalCamera$completionHandler$1
            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onFailure(int code, @NotNull String desc) {
                Intrinsics.checkNotNullParameter(desc, "desc");
                callback.invoke(HybridResponse.Companion.failure$default(HybridResponse.INSTANCE, request.getApi(), code, desc, null, 8, null));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onSuccess() {
                callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
            }
        });
    }

    public final void openLocalMicrophone(@NotNull final HybridRequest request, @NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        DeviceStore.INSTANCE.shared().openLocalMicrophone(new CompletionHandler() { // from class: io.trtc.tuikit.atomicxcore.hybridapi.api.DeviceAPI$openLocalMicrophone$completionHandler$1
            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onFailure(int code, @NotNull String desc) {
                Intrinsics.checkNotNullParameter(desc, "desc");
                callback.invoke(HybridResponse.Companion.failure$default(HybridResponse.INSTANCE, request.getApi(), code, desc, null, 8, null));
            }

            @Override // io.trtc.tuikit.atomicxcore.api.CompletionHandler
            public void onSuccess() {
                callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
            }
        });
    }

    public final void reset(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        DeviceStore.INSTANCE.shared().reset();
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    public final void setAudioRoute(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("audioRoute") : null;
        Number number = obj instanceof Number ? (Number) obj : null;
        DeviceStore.INSTANCE.shared().setAudioRoute(AudioRoute.INSTANCE.parse(number != null ? number.intValue() : 0));
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    public final void setCaptureVolume(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("volume") : null;
        Number number = obj instanceof Number ? (Number) obj : null;
        DeviceStore.INSTANCE.shared().setCaptureVolume(number != null ? number.intValue() : 0);
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    public final void setOutputVolume(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("volume") : null;
        Number number = obj instanceof Number ? (Number) obj : null;
        DeviceStore.INSTANCE.shared().setOutputVolume(number != null ? number.intValue() : 0);
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    public final void startScreenShare(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        DeviceStore.INSTANCE.shared().startScreenShare();
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    public final void stopScreenShare(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        DeviceStore.INSTANCE.shared().stopScreenShare();
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    public final void switchCamera(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("isFront") : null;
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        DeviceStore.INSTANCE.shared().switchCamera(bool != null ? bool.booleanValue() : true);
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    public final void switchMirror(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("mirrorType") : null;
        Number number = obj instanceof Number ? (Number) obj : null;
        DeviceStore.INSTANCE.shared().switchMirror(MirrorType.INSTANCE.parse(number != null ? number.intValue() : 0));
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    public final void updateVideoQuality(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get(C33757kf.f70665k) : null;
        Number number = obj instanceof Number ? (Number) obj : null;
        DeviceStore.INSTANCE.shared().updateVideoQuality(VideoQuality.INSTANCE.parse(number != null ? number.intValue() : 1));
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }
}
