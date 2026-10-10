package com.tencent.cloud.tuikit.engine.call;

import android.content.Context;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.common.TUIVideoView;
import com.tencent.cloud.tuikit.engine.impl.call.TUICallEngineImpl;
import com.tencent.trtc.TRTCCloud;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public abstract class TUICallEngine {
    public abstract void accept(TUICommonDefine.Callback callback);

    public abstract void addObserver(TUICallObserver tUICallObserver);

    @Deprecated
    public abstract void call(TUICommonDefine.RoomId roomId, String str, TUICallDefine.MediaType mediaType, TUICallDefine.CallParams callParams, TUICommonDefine.Callback callback);

    @Deprecated
    public abstract void call(String str, TUICallDefine.MediaType mediaType, TUICallDefine.CallParams callParams, TUICommonDefine.Callback callback);

    public abstract void callExperimentalAPI(String str);

    public abstract void calls(List<String> list, TUICallDefine.MediaType mediaType, TUICallDefine.CallParams callParams, TUICommonDefine.Callback callback);

    public abstract void closeCamera();

    public abstract void closeMicrophone();

    public abstract void deleteRecordCalls(List<String> list, TUICommonDefine.ValueCallback valueCallback);

    public abstract void enableMultiDeviceAbility(boolean z11, TUICommonDefine.Callback callback);

    public abstract TRTCCloud getTRTCCloudInstance();

    @Deprecated
    public abstract void groupCall(TUICommonDefine.RoomId roomId, String str, List<String> list, TUICallDefine.MediaType mediaType, TUICallDefine.CallParams callParams, TUICommonDefine.Callback callback);

    @Deprecated
    public abstract void groupCall(String str, List<String> list, TUICallDefine.MediaType mediaType, TUICallDefine.CallParams callParams, TUICommonDefine.Callback callback);

    public abstract void hangup(TUICommonDefine.Callback callback);

    public abstract void ignore(TUICommonDefine.Callback callback);

    public abstract void init(int i11, String str, String str2, TUICommonDefine.Callback callback);

    public abstract void inviteUser(List<String> list, TUICallDefine.CallParams callParams, TUICommonDefine.ValueCallback<List<String>> valueCallback);

    public abstract void join(String str, TUICommonDefine.Callback callback);

    @Deprecated
    public abstract void joinInGroupCall(TUICommonDefine.RoomId roomId, String str, TUICallDefine.MediaType mediaType, TUICommonDefine.Callback callback);

    public abstract void openCamera(TUICommonDefine.Camera camera, TUIVideoView tUIVideoView, TUICommonDefine.Callback callback);

    public abstract void openMicrophone(TUICommonDefine.Callback callback);

    @Deprecated
    public abstract void queryOfflineCall();

    public abstract void queryRecentCalls(TUICallDefine.RecentCallsFilter recentCallsFilter, TUICommonDefine.ValueCallback valueCallback);

    public abstract void reject(TUICommonDefine.Callback callback);

    public abstract void removeObserver(TUICallObserver tUICallObserver);

    public abstract void selectAudioPlaybackDevice(TUICommonDefine.AudioPlaybackDevice audioPlaybackDevice);

    public abstract void setBeautyLevel(float f11, TUICommonDefine.Callback callback);

    public abstract void setBlurBackground(int i11, TUICommonDefine.Callback callback);

    public abstract void setSelfInfo(String str, String str2, TUICommonDefine.Callback callback);

    public abstract void setVideoEncoderParams(TUICommonDefine.VideoEncoderParams videoEncoderParams, TUICommonDefine.Callback callback);

    public abstract void setVideoRenderParams(String str, TUICommonDefine.VideoRenderParams videoRenderParams, TUICommonDefine.Callback callback);

    public abstract void setVirtualBackground(String str, TUICommonDefine.Callback callback);

    public abstract void startRemoteView(String str, TUIVideoView tUIVideoView, TUICommonDefine.PlayCallback playCallback);

    public abstract void stopRemoteView(String str);

    public abstract void switchCallMediaType(TUICallDefine.MediaType mediaType);

    public abstract void switchCamera(TUICommonDefine.Camera camera);

    public static TUICallEngine createInstance(Context context) {
        return TUICallEngineImpl.createInstance(context);
    }

    public static void destroyInstance() {
        TUICallEngineImpl.destroySharedInstance();
    }
}
