package io.trtc.tuikit.atomicxcore.hybridapi.api;

import android.content.Context;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.device.AudioChangerType;
import io.trtc.tuikit.atomicxcore.api.device.AudioEffectStore;
import io.trtc.tuikit.atomicxcore.api.device.AudioReverbType;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridRequest;
import io.trtc.tuikit.atomicxcore.hybridapi.bridge.HybridResponse;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nJ\"\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/hybridapi/api/AudioEffectAPI;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "reset", "", "request", "Lio/trtc/tuikit/atomicxcore/hybridapi/bridge/HybridRequest;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "setAudioChangerType", "setAudioReverbType", "setVoiceEarMonitorEnable", "setVoiceEarMonitorVolume", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class AudioEffectAPI {

    @NotNull
    private final Context context;

    public AudioEffectAPI(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final void reset(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AudioEffectStore.INSTANCE.shared().reset();
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    public final void setAudioChangerType(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("changerType") : null;
        Number number = obj instanceof Number ? (Number) obj : null;
        AudioEffectStore.INSTANCE.shared().setAudioChangerType(AudioChangerType.INSTANCE.parse(number != null ? number.intValue() : 0));
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    public final void setAudioReverbType(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("reverbType") : null;
        Number number = obj instanceof Number ? (Number) obj : null;
        AudioEffectStore.INSTANCE.shared().setAudioReverbType(AudioReverbType.INSTANCE.parse(number != null ? number.intValue() : 0));
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    public final void setVoiceEarMonitorEnable(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get(BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE) : null;
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        AudioEffectStore.INSTANCE.shared().setVoiceEarMonitorEnable(bool != null ? bool.booleanValue() : false);
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }

    public final void setVoiceEarMonitorVolume(@NotNull HybridRequest request, @NotNull Function1<? super String, Unit> callback) {
        Map mapM88231a = AbstractC39400a.m88231a(request, "request", callback, TUIConstants.TUIChat.CALL_BACK);
        Object obj = mapM88231a != null ? mapM88231a.get("volume") : null;
        Number number = obj instanceof Number ? (Number) obj : null;
        AudioEffectStore.INSTANCE.shared().setVoiceEarMonitorVolume(number != null ? number.intValue() : 0);
        callback.invoke(HybridResponse.Companion.success$default(HybridResponse.INSTANCE, request.getApi(), null, 2, null));
    }
}
