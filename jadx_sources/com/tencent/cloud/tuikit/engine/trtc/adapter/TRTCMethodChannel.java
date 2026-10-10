package com.tencent.cloud.tuikit.engine.trtc.adapter;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.tencent.cloud.tuikit.engine.common.ContextProvider;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.trtc.TRTCCloudImpl;
import com.tencent.rtmp.p148ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.tencent.trtc.TRTCStatistics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("tuikit::engine::trtc")
public class TRTCMethodChannel {
    private static final int CAMERA_ID_BACK = 0;
    private static final int CAMERA_ID_FRONT = 1;
    private static final int METHOD_ID_ADD_CALLBACK = 130;
    private static final int METHOD_ID_CALL_EXPERIMENTAL_API = 123;
    private static final int METHOD_ID_DESTROY_TRTC = 121;
    private static final int METHOD_ID_ENABLE_AUDIO_VOLUME_EVALUATION = 119;
    private static final int METHOD_ID_ENABLE_CAMERA_AUTO_FOCUS = 203;
    private static final int METHOD_ID_ENABLE_CAMERA_TORCH = 204;
    private static final int METHOD_ID_ENABLE_GRAVITY_SENSOR = 133;
    private static final int METHOD_ID_ENABLE_SMALL_VIDEO_STREAM = 124;
    private static final int METHOD_ID_ENTER_ROOM = 100;
    private static final int METHOD_ID_EXIT_ROOM = 101;
    private static final int METHOD_ID_GET_SCREEN_CAPTURE_SOURCES = 120;
    private static final int METHOD_ID_GET_SDK_VERSION = 134;
    private static final int METHOD_ID_IS_AUTO_FOCUS_ENABLED = 202;
    private static final int METHOD_ID_IS_FRONT_CAMERA = 200;
    private static final int METHOD_ID_MUTE_ALL_REMOTE_AUDIO = 147;
    private static final int METHOD_ID_MUTE_ALL_REMOTE_VIDEO_STREAMS = 146;
    private static final int METHOD_ID_MUTE_LOCAL_AUDIO = 108;
    private static final int METHOD_ID_MUTE_LOCAL_VIDEO = 107;
    private static final int METHOD_ID_MUTE_REMOTE_AUDIO = 122;
    private static final int METHOD_ID_MUTE_REMOTE_VIDEO = 148;
    private static final int METHOD_ID_REMOVE_CALLBACK = 131;
    private static final int METHOD_ID_SELECT_SCREEN_CAPTURE_TARGET = 111;
    private static final int METHOD_ID_SET_AUDIO_PLAYOUT_VOLUME = 145;
    private static final int METHOD_ID_SET_AUDIO_QUALITY = 110;
    private static final int METHOD_ID_SET_AUDIO_ROUTE = 205;
    private static final int METHOD_ID_SET_DEFAULT_STREAM_RECV_MODE = 143;
    private static final int METHOD_ID_SET_LOCAL_RENDER_PARAMS = 142;
    private static final int METHOD_ID_SET_REMOTE_RENDER_PARAMS = 129;
    private static final int METHOD_ID_SET_SUB_STREAM_ENCODER_PARAM = 132;
    private static final int METHOD_ID_SET_VIDEO_ENCODER_MIRROR = 144;
    private static final int METHOD_ID_SET_VIDEO_ENCODER_PARAM = 109;
    private static final int METHOD_ID_START_LOCAL_AUDIO = 105;
    private static final int METHOD_ID_START_LOCAL_PREVIEW = 127;
    private static final int METHOD_ID_START_REMOTE_VIEW = 116;
    private static final int METHOD_ID_START_SCREEN_SHARE = 114;
    private static final int METHOD_ID_START_SYSTEM_AUDIO_LOOPBACK = 140;
    private static final int METHOD_ID_STOP_LOCAL_AUDIO = 106;
    private static final int METHOD_ID_STOP_LOCAL_PREVIEW = 128;
    private static final int METHOD_ID_STOP_REMOTE_VIEW = 117;
    private static final int METHOD_ID_STOP_SCREEN_SHARE = 115;
    private static final int METHOD_ID_STOP_SYSTEM_AUDIO_LOOPBACK = 141;
    private static final int METHOD_ID_SWITCH_CAMERA = 201;
    private static final int METHOD_ID_SWITCH_ROLE = 104;
    private static final int METHOD_ID_UPDATE_LOCAL_VIEW = 102;
    private static final int METHOD_ID_UPDATE_REMOTE_VIEW = 103;
    private static final int METHOD_ID_WRITE_LOG = 118;
    private static final String METHOD_PARAMS_AUTO_RECV_AUDIO = "autoRecvAudio";
    private static final String METHOD_PARAMS_AUTO_RECV_VIDEO = "autoRecvVideo";
    private static final String METHOD_PARAMS_BUSINESS_INFO = "businessInfo";
    private static final String METHOD_PARAMS_CAMERA_ID = "cameraId";
    private static final String METHOD_PARAMS_ENABLE = "enable";
    private static final String METHOD_PARAMS_ENABLE_ADJUST_RES = "enableAdjustRes";
    private static final String METHOD_PARAMS_ENABLE_MIRROR = "enableMirror";
    private static final String METHOD_PARAMS_ENC_PARAM = "encParam";
    private static final String METHOD_PARAMS_FILL_MODE = "fillMode";
    private static final String METHOD_PARAMS_HEIGHT = "height";
    private static final String METHOD_PARAMS_ICON_SIZE = "iconSize";
    private static final String METHOD_PARAMS_INTERVAL = "interval";
    private static final String METHOD_PARAMS_IS_FRONT_CAMERA = "frontCamera";
    private static final String METHOD_PARAMS_MIN_VIDEO_BITRATE = "minVideoBitrate";
    private static final String METHOD_PARAMS_MIRROR_TYPE = "mirrorType";
    private static final String METHOD_PARAMS_MUTE = "mute";
    private static final String METHOD_PARAMS_PLAYOUT_VOLUME = "playoutVolume";
    private static final String METHOD_PARAMS_PRIVATE_MAP_KEY = "privateMapKey";
    private static final String METHOD_PARAMS_QUALITY = "quality";
    private static final String METHOD_PARAMS_RENDER_PARAMS = "renderParams";
    private static final String METHOD_PARAMS_RES_MODE = "resMode";
    private static final String METHOD_PARAMS_ROLE = "role";
    private static final String METHOD_PARAMS_ROOM_ID = "roomId";
    private static final String METHOD_PARAMS_ROTATION = "rotation";
    private static final String METHOD_PARAMS_ROUTE = "route";
    private static final String METHOD_PARAMS_SDK_APP_ID = "sdkAppId";
    private static final String METHOD_PARAMS_STREAM_ID = "streamId";
    private static final String METHOD_PARAMS_STREAM_TYPE = "streamType";
    private static final String METHOD_PARAMS_STR_ROOM_ID = "strRoomId";
    private static final String METHOD_PARAMS_TARGET_ID = "targetId";
    private static final String METHOD_PARAMS_THUMB_SIZE = "thumbSize";
    private static final String METHOD_PARAMS_TRTC_PARAMS = "trtcParams";
    private static final String METHOD_PARAMS_TRTC_SCENE = "trtcScene";
    private static final String METHOD_PARAMS_USER_DEFINE_RECORD_ID = "userDefineRecordId";
    private static final String METHOD_PARAMS_USER_ID = "userId";
    private static final String METHOD_PARAMS_USER_SIG = "userSig";
    private static final String METHOD_PARAMS_VIDEO_BITRATE = "videoBitrate";
    private static final String METHOD_PARAMS_VIDEO_FPS = "videoFps";
    private static final String METHOD_PARAMS_VIDEO_RESOLUTION = "videoResolution";
    private static final String METHOD_PARAMS_VIEW_ID = "viewId";
    private static final String METHOD_PARAMS_WIDTH = "width";
    private static final String TAG = "TRTCMethodChannel";
    private boolean mIsMainTRTC;
    private long mNativeTRTCMethodChannelAndroid;
    private TRTCCloud mTRTCCloud;
    private final Map<String, WeakReference<TXCloudVideoView>> mViewMap = new HashMap();
    private int mCurrentCameraId = 1;
    private final TRTCCloudListener mTrtcCloudListener = new TRTCCloudListener() { // from class: com.tencent.cloud.tuikit.engine.trtc.adapter.TRTCMethodChannel.1
        @Override // com.tencent.trtc.TRTCCloudListener
        public void onCameraDidReady() {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnCameraDidReady(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onConnectionLost() {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnConnectionLost(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onConnectionRecovery() {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnConnectionRecovery(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onEnterRoom(long j11) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnEnterRoom(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, j11);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onError(int i11, String str, Bundle bundle) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnError(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, i11, str);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onExitRoom(int i11) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnExitRoom(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, i11);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onFirstVideoFrame(String str, int i11, int i12, int i13) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnFirstVideoFrame(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, str, i11, i12, i13);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onMicDidReady() {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnMicDidReady(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onNetworkQuality(TRTCCloudDef.TRTCQuality tRTCQuality, ArrayList<TRTCCloudDef.TRTCQuality> arrayList) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnNetworkQuality(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, tRTCQuality.quality, arrayList);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onRecvSEIMsg(String str, byte[] bArr) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnRecvSEIMsg(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, str, bArr);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onRemoteUserEnterRoom(String str) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnRemoteUserEnterRoom(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, str);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onRemoteUserLeaveRoom(String str, int i11) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnRemoteUserLeaveRoom(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, str, i11);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onRemoteVideoStatusUpdated(String str, int i11, int i12, int i13, Bundle bundle) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnRemoteVideoStatusUpdated(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, str, i11, i12, i13);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onScreenCapturePaused() {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnScreenCapturePaused(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, 0);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onScreenCaptureResumed() {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnScreenCaptureResumed(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, 0);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onScreenCaptureStopped(int i11) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnScreenCaptureStopped(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, i11);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onSendFirstLocalAudioFrame() {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnSendFirstLocalAudioFrame(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onSendFirstLocalVideoFrame(int i11) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnSendFirstLocalVideoFrame(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, i11);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onStatistics(TRTCStatistics tRTCStatistics) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnStatistics(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, TRTCMethodChannel.convertStatisticsToJson(tRTCStatistics));
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onSwitchRole(int i11, String str) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnSwitchRole(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, i11, str);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onUserAudioAvailable(String str, boolean z11) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnUserAudioAvailable(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, str, z11);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onUserSubStreamAvailable(String str, boolean z11) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnUserSubStreamAvailable(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, str, z11);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onUserVideoAvailable(String str, boolean z11) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnUserVideoAvailable(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, str, z11);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onUserVideoSizeChanged(String str, int i11, int i12, int i13) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnUserVideoSizeChanged(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, str, i11, i12, i13);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onUserVoiceVolume(ArrayList<TRTCCloudDef.TRTCVolumeInfo> arrayList, int i11) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnUserVoiceVolume(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, arrayList, i11);
        }

        @Override // com.tencent.trtc.TRTCCloudListener
        public void onWarning(int i11, String str, Bundle bundle) {
            if (TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid == 0) {
                return;
            }
            TRTCMethodChannel.nativeOnWarning(TRTCMethodChannel.this.mNativeTRTCMethodChannelAndroid, i11, str);
        }
    };

    private int enableCameraTorch(String str) {
        try {
            return getTRTCCloud().getDeviceManager().enableCameraTorch(new JSONObject(str).getBoolean("enable")) ? 0 : -1;
        } catch (JSONException e11) {
            Log.e(TAG, e11.getLocalizedMessage());
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnCameraDidReady(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnConnectionLost(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnConnectionRecovery(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnEnterRoom(long j11, long j12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnError(long j11, int i11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnExitRoom(long j11, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnFirstVideoFrame(long j11, String str, int i11, int i12, int i13);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnMicDidReady(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnNetworkQuality(long j11, int i11, ArrayList<TRTCCloudDef.TRTCQuality> arrayList);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnRecvSEIMsg(long j11, String str, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnRemoteUserEnterRoom(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnRemoteUserLeaveRoom(long j11, String str, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnRemoteVideoStatusUpdated(long j11, String str, int i11, int i12, int i13);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnScreenCapturePaused(long j11, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnScreenCaptureResumed(long j11, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnScreenCaptureStopped(long j11, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnSendFirstLocalAudioFrame(long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnSendFirstLocalVideoFrame(long j11, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnStatistics(long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnSwitchRole(long j11, int i11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnUserAudioAvailable(long j11, String str, boolean z11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnUserSubStreamAvailable(long j11, String str, boolean z11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnUserVideoAvailable(long j11, String str, boolean z11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnUserVideoSizeChanged(long j11, String str, int i11, int i12, int i13);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnUserVoiceVolume(long j11, ArrayList<TRTCCloudDef.TRTCVolumeInfo> arrayList, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnWarning(long j11, int i11, String str);

    private void addCallback() {
        try {
            int i11 = TRTCCloud.f76642m;
            TRTCCloud.class.getDeclaredMethod("addListener", TRTCCloudListener.class).invoke(getTRTCCloud(), this.mTrtcCloudListener);
        } catch (NoSuchMethodException unused) {
            getTRTCCloud().setListener(this.mTrtcCloudListener);
        } catch (Exception e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    private TRTCCloudDef.TRTCVideoEncParam convertJsonToVideoEncParams(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam = new TRTCCloudDef.TRTCVideoEncParam();
            tRTCVideoEncParam.videoResolution = jSONObject.getInt(METHOD_PARAMS_VIDEO_RESOLUTION);
            tRTCVideoEncParam.videoFps = jSONObject.getInt(METHOD_PARAMS_VIDEO_FPS);
            tRTCVideoEncParam.videoBitrate = jSONObject.getInt(METHOD_PARAMS_VIDEO_BITRATE);
            if (jSONObject.has(METHOD_PARAMS_RES_MODE)) {
                tRTCVideoEncParam.videoResolutionMode = jSONObject.getInt(METHOD_PARAMS_RES_MODE);
            }
            if (jSONObject.has(METHOD_PARAMS_MIN_VIDEO_BITRATE)) {
                tRTCVideoEncParam.minVideoBitrate = jSONObject.getInt(METHOD_PARAMS_MIN_VIDEO_BITRATE);
            }
            if (jSONObject.has(METHOD_PARAMS_ENABLE_ADJUST_RES)) {
                tRTCVideoEncParam.enableAdjustRes = jSONObject.getBoolean(METHOD_PARAMS_ENABLE_ADJUST_RES);
            }
            return tRTCVideoEncParam;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String convertStatisticsToJson(TRTCStatistics tRTCStatistics) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appCpu", tRTCStatistics.appCpu);
            jSONObject.put("systemCpu", tRTCStatistics.systemCpu);
            jSONObject.put("upLoss", tRTCStatistics.upLoss);
            jSONObject.put("downLoss", tRTCStatistics.downLoss);
            jSONObject.put("rtt", tRTCStatistics.rtt);
            jSONObject.put("gatewayRtt", tRTCStatistics.gatewayRtt);
            jSONObject.put("sendBytes", tRTCStatistics.sendBytes);
            jSONObject.put("receiveBytes", tRTCStatistics.receiveBytes);
            JSONArray jSONArray = new JSONArray();
            for (TRTCStatistics.TRTCLocalStatistics tRTCLocalStatistics : tRTCStatistics.localArray) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", tRTCLocalStatistics.width);
                jSONObject2.put("height", tRTCLocalStatistics.height);
                jSONObject2.put("frameRate", tRTCLocalStatistics.frameRate);
                jSONObject2.put(METHOD_PARAMS_VIDEO_BITRATE, tRTCLocalStatistics.videoBitrate);
                jSONObject2.put("audioSampleRate", tRTCLocalStatistics.audioSampleRate);
                jSONObject2.put("audioBitrate", tRTCLocalStatistics.audioBitrate);
                jSONObject2.put(METHOD_PARAMS_STREAM_TYPE, tRTCLocalStatistics.streamType);
                jSONObject2.put("audioCaptureState", tRTCLocalStatistics.audioCaptureState);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("localArray", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (TRTCStatistics.TRTCRemoteStatistics tRTCRemoteStatistics : tRTCStatistics.remoteArray) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("userId", tRTCRemoteStatistics.userId);
                jSONObject3.put("audioPacketLoss", tRTCRemoteStatistics.audioPacketLoss);
                jSONObject3.put("videoPacketLoss", tRTCRemoteStatistics.videoPacketLoss);
                jSONObject3.put("width", tRTCRemoteStatistics.width);
                jSONObject3.put("height", tRTCRemoteStatistics.height);
                jSONObject3.put("frameRate", tRTCRemoteStatistics.frameRate);
                jSONObject3.put(METHOD_PARAMS_VIDEO_BITRATE, tRTCRemoteStatistics.videoBitrate);
                jSONObject3.put("audioSampleRate", tRTCRemoteStatistics.audioSampleRate);
                jSONObject3.put("audioBitrate", tRTCRemoteStatistics.audioBitrate);
                jSONObject3.put("jitterBufferDelay", tRTCRemoteStatistics.jitterBufferDelay);
                jSONObject3.put("point2PointDelay", tRTCRemoteStatistics.point2PointDelay);
                jSONObject3.put("audioTotalBlockTime", tRTCRemoteStatistics.audioTotalBlockTime);
                jSONObject3.put("audioBlockRate", tRTCRemoteStatistics.audioBlockRate);
                jSONObject3.put("videoTotalBlockTime", tRTCRemoteStatistics.videoTotalBlockTime);
                jSONObject3.put("videoBlockRate", tRTCRemoteStatistics.videoBlockRate);
                jSONObject3.put("finalLoss", tRTCRemoteStatistics.finalLoss);
                jSONObject3.put("remoteNetworkUplinkLoss", tRTCRemoteStatistics.remoteNetworkUplinkLoss);
                jSONObject3.put("remoteNetworkRTT", tRTCRemoteStatistics.remoteNetworkRTT);
                jSONObject3.put(METHOD_PARAMS_STREAM_TYPE, tRTCRemoteStatistics.streamType);
                jSONArray2.put(jSONObject3);
            }
            jSONObject.put("remoteArray", jSONArray2);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private void enableAudioVolumeEvaluation(String str) {
        try {
            int i11 = new JSONObject(str).getInt("interval");
            getTRTCCloud().enableAudioVolumeEvaluation(i11, i11 > 0);
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    private int enableCameraAutoFocus(String str) {
        try {
            return getTRTCCloud().getDeviceManager().enableCameraAutoFocus(new JSONObject(str).getBoolean("enable"));
        } catch (JSONException e11) {
            Log.e(TAG, e11.getLocalizedMessage());
            return -1;
        }
    }

    private void enableGravitySensor(String str) {
        try {
            getTRTCCloud().setGSensorMode(new JSONObject(str).getBoolean("enable") ? 1 : 0);
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    private void enableSmallVideoStream(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z11 = jSONObject.getBoolean("enable");
            JSONObject jSONObject2 = jSONObject.getJSONObject(METHOD_PARAMS_ENC_PARAM);
            TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam = new TRTCCloudDef.TRTCVideoEncParam();
            tRTCVideoEncParam.videoResolution = jSONObject2.getInt(METHOD_PARAMS_VIDEO_RESOLUTION);
            tRTCVideoEncParam.videoFps = jSONObject2.getInt(METHOD_PARAMS_VIDEO_FPS);
            tRTCVideoEncParam.videoBitrate = jSONObject2.getInt(METHOD_PARAMS_VIDEO_BITRATE);
            if (jSONObject2.has(METHOD_PARAMS_RES_MODE)) {
                tRTCVideoEncParam.videoResolutionMode = jSONObject2.getInt(METHOD_PARAMS_RES_MODE);
            }
            if (jSONObject2.has(METHOD_PARAMS_MIN_VIDEO_BITRATE)) {
                tRTCVideoEncParam.minVideoBitrate = jSONObject2.getInt(METHOD_PARAMS_MIN_VIDEO_BITRATE);
            }
            if (jSONObject2.has(METHOD_PARAMS_ENABLE_ADJUST_RES)) {
                tRTCVideoEncParam.enableAdjustRes = jSONObject2.getBoolean(METHOD_PARAMS_ENABLE_ADJUST_RES);
            }
            getTRTCCloud().enableEncSmallVideoStream(z11, tRTCVideoEncParam);
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    private void enterRoom(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i11 = jSONObject.getInt(METHOD_PARAMS_TRTC_SCENE);
            JSONObject jSONObject2 = jSONObject.getJSONObject(METHOD_PARAMS_TRTC_PARAMS);
            TRTCCloudDef.TRTCParams tRTCParams = new TRTCCloudDef.TRTCParams();
            tRTCParams.sdkAppId = jSONObject2.getInt("sdkAppId");
            tRTCParams.userId = jSONObject2.getString("userId");
            tRTCParams.userSig = jSONObject2.getString("userSig");
            tRTCParams.strRoomId = jSONObject2.getString(METHOD_PARAMS_STR_ROOM_ID);
            tRTCParams.role = jSONObject2.getInt("role");
            if (jSONObject2.has("roomId")) {
                tRTCParams.roomId = jSONObject2.getInt("roomId");
            }
            if (jSONObject2.has(METHOD_PARAMS_STREAM_ID)) {
                tRTCParams.streamId = jSONObject2.getString(METHOD_PARAMS_STREAM_ID);
            }
            if (jSONObject2.has(METHOD_PARAMS_USER_DEFINE_RECORD_ID)) {
                tRTCParams.userDefineRecordId = jSONObject2.getString(METHOD_PARAMS_USER_DEFINE_RECORD_ID);
            }
            if (jSONObject2.has(METHOD_PARAMS_PRIVATE_MAP_KEY)) {
                tRTCParams.privateMapKey = jSONObject2.getString(METHOD_PARAMS_PRIVATE_MAP_KEY);
            }
            if (jSONObject2.has(METHOD_PARAMS_BUSINESS_INFO)) {
                tRTCParams.businessInfo = jSONObject2.getString(METHOD_PARAMS_BUSINESS_INFO);
            }
            getTRTCCloud().enterRoom(tRTCParams, i11);
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    @CalledByNative
    public static float[] getVolumeInfoSpectrumDataArray(List<TRTCCloudDef.TRTCVolumeInfo> list, int i11) {
        if (i11 < 0 || i11 > list.size()) {
            return null;
        }
        return list.get(i11).spectrumData;
    }

    private void muteAllRemoteAudio(String str) {
        try {
            getTRTCCloud().muteAllRemoteAudio(new JSONObject(str).getBoolean(METHOD_PARAMS_MUTE));
        } catch (JSONException e11) {
            Log.e(TAG, e11.getLocalizedMessage());
        }
    }

    private void muteAllRemoteVideoStreams(String str) {
        try {
            getTRTCCloud().muteAllRemoteVideoStreams(new JSONObject(str).getBoolean(METHOD_PARAMS_MUTE));
        } catch (JSONException e11) {
            Log.e(TAG, e11.getLocalizedMessage());
        }
    }

    private void muteLocalAudio(String str) {
        try {
            getTRTCCloud().muteLocalAudio(new JSONObject(str).getBoolean(METHOD_PARAMS_MUTE));
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    private void muteLocalVideo(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            getTRTCCloud().muteLocalVideo(jSONObject.getInt(METHOD_PARAMS_STREAM_TYPE), jSONObject.getBoolean(METHOD_PARAMS_MUTE));
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    private void muteRemoteAudio(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            getTRTCCloud().muteRemoteAudio(jSONObject.getString("userId"), jSONObject.getBoolean(METHOD_PARAMS_MUTE));
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    private void muteRemoteVideo(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            getTRTCCloud().muteRemoteVideoStream(jSONObject.getString("userId"), jSONObject.getInt(METHOD_PARAMS_STREAM_TYPE), jSONObject.getBoolean(METHOD_PARAMS_MUTE));
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    private void setAudioPlayoutVolume(String str) {
        try {
            getTRTCCloud().setAudioPlayoutVolume(new JSONObject(str).getInt(METHOD_PARAMS_PLAYOUT_VOLUME));
        } catch (JSONException e11) {
            Log.e(TAG, e11.getLocalizedMessage());
        }
    }

    private int setAudioRoute(String str) {
        try {
            int i11 = new JSONObject(str).getInt(METHOD_PARAMS_ROUTE);
            TXDeviceManager.TXAudioRoute tXAudioRoute = TXDeviceManager.TXAudioRoute.TXAudioRouteSpeakerphone;
            if (i11 == 1) {
                tXAudioRoute = TXDeviceManager.TXAudioRoute.TXAudioRouteEarpiece;
            }
            getTRTCCloud().getDeviceManager().setAudioRoute(tXAudioRoute);
            return -1;
        } catch (JSONException e11) {
            Log.e(TAG, e11.getLocalizedMessage());
            return -1;
        }
    }

    private void setDefaultStreamRecvMode(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            getTRTCCloud().setDefaultStreamRecvMode(jSONObject.getBoolean(METHOD_PARAMS_AUTO_RECV_AUDIO), jSONObject.getBoolean(METHOD_PARAMS_AUTO_RECV_VIDEO));
        } catch (JSONException e11) {
            Log.e(TAG, e11.getLocalizedMessage());
        }
    }

    private void setLocalRenderParams(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(METHOD_PARAMS_RENDER_PARAMS);
            TRTCCloudDef.TRTCRenderParams tRTCRenderParams = new TRTCCloudDef.TRTCRenderParams();
            tRTCRenderParams.rotation = jSONObject.getInt("rotation");
            tRTCRenderParams.fillMode = jSONObject.getInt(METHOD_PARAMS_FILL_MODE);
            tRTCRenderParams.mirrorType = jSONObject.getInt(METHOD_PARAMS_MIRROR_TYPE);
            getTRTCCloud().setLocalRenderParams(tRTCRenderParams);
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    private void setRemoteRenderParams(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i11 = jSONObject.getInt(METHOD_PARAMS_STREAM_TYPE);
            String string = jSONObject.getString("userId");
            JSONObject jSONObject2 = jSONObject.getJSONObject(METHOD_PARAMS_RENDER_PARAMS);
            TRTCCloudDef.TRTCRenderParams tRTCRenderParams = new TRTCCloudDef.TRTCRenderParams();
            tRTCRenderParams.rotation = jSONObject2.getInt("rotation");
            tRTCRenderParams.fillMode = jSONObject2.getInt(METHOD_PARAMS_FILL_MODE);
            tRTCRenderParams.mirrorType = jSONObject2.getInt(METHOD_PARAMS_MIRROR_TYPE);
            getTRTCCloud().setRemoteRenderParams(string, i11, tRTCRenderParams);
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    private void setVideoEncoderMirror(String str) {
        try {
            getTRTCCloud().setVideoEncoderMirror(new JSONObject(str).getBoolean(METHOD_PARAMS_ENABLE_MIRROR));
        } catch (JSONException e11) {
            Log.e(TAG, e11.getLocalizedMessage());
        }
    }

    private void startLocalAudio(String str) {
        try {
            getTRTCCloud().startLocalAudio(new JSONObject(str).getInt("quality"));
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    private void startLocalPreview(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i11 = jSONObject.getInt(METHOD_PARAMS_CAMERA_ID);
            this.mCurrentCameraId = i11;
            WeakReference<TXCloudVideoView> weakReference = this.mViewMap.get(jSONObject.getString(METHOD_PARAMS_VIEW_ID));
            TXCloudVideoView tXCloudVideoView = weakReference == null ? null : weakReference.get();
            TRTCCloud tRTCCloud = getTRTCCloud();
            boolean z11 = true;
            if (i11 != 1) {
                z11 = false;
            }
            tRTCCloud.startLocalPreview(z11, tXCloudVideoView);
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    private void startRemoteView(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(METHOD_PARAMS_VIEW_ID);
            String string2 = jSONObject.getString("userId");
            int i11 = jSONObject.getInt(METHOD_PARAMS_STREAM_TYPE);
            WeakReference<TXCloudVideoView> weakReference = this.mViewMap.get(string);
            getTRTCCloud().startRemoteView(string2, i11, weakReference == null ? null : weakReference.get());
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    private void startScreenShare(String str) {
        TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParamConvertJsonToVideoEncParams;
        int i11 = 2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject(METHOD_PARAMS_ENC_PARAM);
            i11 = jSONObject.getInt(METHOD_PARAMS_STREAM_TYPE);
            tRTCVideoEncParamConvertJsonToVideoEncParams = convertJsonToVideoEncParams(jSONObject2.toString());
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
            tRTCVideoEncParamConvertJsonToVideoEncParams = null;
        }
        if (tRTCVideoEncParamConvertJsonToVideoEncParams == null) {
            LiteavLog.m76083e(TAG, "startScreenShare, error, param:" + str);
            return;
        }
        TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams = new TRTCCloudDef.TRTCScreenShareParams();
        LiteavLog.m76087i(TAG, "startScreenShare, param:" + str);
        getTRTCCloud().startScreenCapture(i11, tRTCVideoEncParamConvertJsonToVideoEncParams, tRTCScreenShareParams);
    }

    private void stopRemoteView(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            getTRTCCloud().stopRemoteView(jSONObject.getString("userId"), jSONObject.getInt(METHOD_PARAMS_STREAM_TYPE));
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    private int switchCamera(String str) {
        try {
            boolean z11 = new JSONObject(str).getBoolean(METHOD_PARAMS_IS_FRONT_CAMERA);
            this.mCurrentCameraId = z11 ? 1 : 0;
            return getTRTCCloud().getDeviceManager().switchCamera(z11);
        } catch (JSONException e11) {
            Log.e(TAG, e11.getLocalizedMessage());
            return -1;
        }
    }

    private void switchRole(String str) {
        try {
            getTRTCCloud().switchRole(new JSONObject(str).getInt("role"));
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    private void updateLocalView(String str) {
        try {
            WeakReference<TXCloudVideoView> weakReference = this.mViewMap.get(new JSONObject(str).getString(METHOD_PARAMS_VIEW_ID));
            getTRTCCloud().updateLocalView(weakReference == null ? null : weakReference.get());
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    private void updateRemoteView(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(METHOD_PARAMS_VIEW_ID);
            String string2 = jSONObject.getString("userId");
            int i11 = jSONObject.getInt(METHOD_PARAMS_STREAM_TYPE);
            WeakReference<TXCloudVideoView> weakReference = this.mViewMap.get(string);
            getTRTCCloud().updateRemoteView(string2, i11, weakReference == null ? null : weakReference.get());
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
        }
    }

    @CalledByNative
    public void addViewForKey(String str, TXCloudVideoView tXCloudVideoView) {
        this.mViewMap.put(str, new WeakReference<>(tXCloudVideoView));
    }

    @CalledByNative
    public void clearAllViewForKey() {
        this.mViewMap.clear();
    }

    @CalledByNative
    public void destroyInstance() {
        this.mViewMap.clear();
        this.mNativeTRTCMethodChannelAndroid = 0L;
        TRTCCloud tRTCCloud = this.mTRTCCloud;
        if (tRTCCloud == null || this.mIsMainTRTC) {
            return;
        }
        TRTCCloudImpl.destroyInstance(tRTCCloud);
    }

    @CalledByNative
    public int invokeGetCameraId() {
        return this.mCurrentCameraId;
    }

    @CalledByNative
    public String invokeMethod(int i11, String str) {
        if (i11 == 119) {
            enableAudioVolumeEvaluation(str);
            return "";
        }
        if (i11 == 201) {
            switchCamera(str);
            return "";
        }
        switch (i11) {
            case 100:
                enterRoom(str);
                return "";
            case 101:
                exitRoom();
                return "";
            case 102:
                updateLocalView(str);
                return "";
            case 103:
                updateRemoteView(str);
                return "";
            case 104:
                switchRole(str);
                return "";
            case 105:
                startLocalAudio(str);
                return "";
            case 106:
                stopLocalAudio();
                return "";
            case 107:
                muteLocalVideo(str);
                return "";
            case 108:
                muteLocalAudio(str);
                return "";
            case 109:
                setVideoEncoderParam(str);
                return "";
            default:
                switch (i11) {
                    case 114:
                        startScreenShare(str);
                        return "";
                    case 115:
                        stopScreenShare();
                        return "";
                    case 116:
                        startRemoteView(str);
                        return "";
                    case 117:
                        stopRemoteView(str);
                        return "";
                    default:
                        switch (i11) {
                            case 122:
                                muteRemoteAudio(str);
                                return "";
                            case 123:
                                return callExperimentalAPI(str);
                            case 124:
                                enableSmallVideoStream(str);
                                return "";
                            default:
                                switch (i11) {
                                    case 127:
                                        startLocalPreview(str);
                                        return "";
                                    case 128:
                                        stopLocalPreview();
                                        return "";
                                    case 129:
                                        setRemoteRenderParams(str);
                                        return "";
                                    case 130:
                                        addCallback();
                                        return "";
                                    case 131:
                                        removeCallback();
                                        return "";
                                    case 132:
                                        setSubStreamEncoderParam(str);
                                        return "";
                                    case 133:
                                        enableGravitySensor(str);
                                        return "";
                                    default:
                                        switch (i11) {
                                            case 140:
                                                startSystemAudioLoopback();
                                                return "";
                                            case 141:
                                                stopSystemAudioLoopback();
                                                return "";
                                            case 142:
                                                setLocalRenderParams(str);
                                                return "";
                                            case 143:
                                                setDefaultStreamRecvMode(str);
                                                return "";
                                            case 144:
                                                setVideoEncoderMirror(str);
                                                return "";
                                            case 145:
                                                setAudioPlayoutVolume(str);
                                                return "";
                                            case 146:
                                                muteAllRemoteVideoStreams(str);
                                                return "";
                                            case 147:
                                                muteAllRemoteAudio(str);
                                                return "";
                                            case 148:
                                                muteRemoteVideo(str);
                                                return "";
                                            default:
                                                switch (i11) {
                                                    case 203:
                                                        enableCameraAutoFocus(str);
                                                        return "";
                                                    case 204:
                                                        enableCameraTorch(str);
                                                        return "";
                                                    case 205:
                                                        setAudioRoute(str);
                                                        return "";
                                                    default:
                                                        return "";
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @CalledByNative
    public boolean invokeMethodWithBoolReturn(int i11) {
        if (i11 == 200) {
            return isFrontCamera();
        }
        if (i11 != 202) {
            return false;
        }
        return isAutoFocusEnabled();
    }

    @CalledByNative
    public void removeViewForKey(String str) {
        this.mViewMap.remove(str);
    }

    @CalledByNative
    public TRTCMethodChannel(long j11, boolean z11) {
        this.mNativeTRTCMethodChannelAndroid = j11;
        this.mIsMainTRTC = z11;
    }

    private String callExperimentalAPI(String str) {
        return getTRTCCloud().callExperimentalAPI(str);
    }

    @CalledByNative
    public static void callStaticExperimentalAPI(String str) {
        TRTCCloud.sharedInstance(ContextProvider.getApplicationContext()).callExperimentalAPI(str);
    }

    private void exitRoom() {
        getTRTCCloud().exitRoom();
    }

    @CalledByNative
    public static int[] getQualityArray(List<TRTCCloudDef.TRTCQuality> list) {
        int[] iArr = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr[i11] = list.get(i11).quality;
        }
        return iArr;
    }

    @CalledByNative
    public static String getSdkVersion() {
        return TRTCCloud.getSDKVersion();
    }

    @CalledByNative
    private TRTCCloud getTRTCCloud() {
        Context applicationContext = ContextProvider.getApplicationContext();
        if (this.mIsMainTRTC) {
            return TRTCCloud.sharedInstance(applicationContext);
        }
        if (this.mTRTCCloud == null) {
            this.mTRTCCloud = TRTCCloudImpl.createInstance(applicationContext);
        }
        return this.mTRTCCloud;
    }

    @CalledByNative
    public static String[] getUserIdArray(List<TRTCCloudDef.TRTCQuality> list) {
        String[] strArr = new String[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            strArr[i11] = list.get(i11).userId;
        }
        return strArr;
    }

    @CalledByNative
    public static String[] getVolumeInfoUserIdArray(List<TRTCCloudDef.TRTCVolumeInfo> list) {
        String[] strArr = new String[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            strArr[i11] = list.get(i11).userId;
        }
        return strArr;
    }

    @CalledByNative
    public static int[] getVolumeInfoVadArray(List<TRTCCloudDef.TRTCVolumeInfo> list) {
        int[] iArr = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr[i11] = list.get(i11).vad;
        }
        return iArr;
    }

    @CalledByNative
    public static int[] getVolumeInfoVolumeArray(List<TRTCCloudDef.TRTCVolumeInfo> list) {
        int[] iArr = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr[i11] = list.get(i11).volume;
        }
        return iArr;
    }

    private boolean isAutoFocusEnabled() {
        return getTRTCCloud().getDeviceManager().isAutoFocusEnabled();
    }

    private boolean isFrontCamera() {
        return getTRTCCloud().getDeviceManager().isFrontCamera();
    }

    private void removeCallback() {
        getTRTCCloud().setListener(null);
    }

    private void setSubStreamEncoderParam(String str) {
        TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParamConvertJsonToVideoEncParams = convertJsonToVideoEncParams(str);
        if (tRTCVideoEncParamConvertJsonToVideoEncParams == null) {
            LiteavLog.m76083e(TAG, "setSubStreamEncoderParam, error, param:" + str);
            return;
        }
        LiteavLog.m76087i(TAG, "setSubStreamEncoderParam, param:" + str);
        getTRTCCloud().setSubStreamEncoderParam(tRTCVideoEncParamConvertJsonToVideoEncParams);
    }

    private void setVideoEncoderParam(String str) {
        TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParamConvertJsonToVideoEncParams = convertJsonToVideoEncParams(str);
        if (tRTCVideoEncParamConvertJsonToVideoEncParams == null) {
            return;
        }
        getTRTCCloud().setVideoEncoderParam(tRTCVideoEncParamConvertJsonToVideoEncParams);
    }

    private void startSystemAudioLoopback() {
        getTRTCCloud().startSystemAudioLoopback();
    }

    private void stopLocalAudio() {
        getTRTCCloud().stopLocalAudio();
    }

    private void stopLocalPreview() {
        getTRTCCloud().stopLocalPreview();
    }

    private void stopScreenShare() {
        getTRTCCloud().stopScreenCapture();
    }

    private void stopSystemAudioLoopback() {
        getTRTCCloud().stopSystemAudioLoopback();
    }
}
