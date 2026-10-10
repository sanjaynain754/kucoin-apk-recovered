package com.tencent.cloud.tuikit.engine.impl.call;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.cloud.tuikit.engine.call.TUICallDefine;
import com.tencent.cloud.tuikit.engine.call.TUICallEngine;
import com.tencent.cloud.tuikit.engine.call.TUICallObserver;
import com.tencent.cloud.tuikit.engine.common.ContextProvider;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.common.TUIVideoView;
import com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine;
import com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse;
import com.tencent.cloud.tuikit.engine.impl.utils.PathUtils;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.trtc.TRTCCloud;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes59.dex */
public class TUICallEngineImpl extends TUICallEngine {
    private static final int INVALID_ENUM_VALUE = Integer.MIN_VALUE;
    private static final String TAG = "TUICallEngineImpl";
    private static TUICallEngineImpl sInstance;
    private final Context mContext;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private final TUICallObserverProxy mObserverProxy;
    private final TUICallEngineJni mTUICallEngineJni;

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void call(TUICommonDefine.RoomId roomId, String str, TUICallDefine.MediaType mediaType, TUICallDefine.CallParams callParams, TUICommonDefine.Callback callback) {
        if (callParams == null) {
            callParams = new TUICallDefine.CallParams();
        }
        if (roomId != null) {
            callParams.roomId = roomId;
        }
        call(str, mediaType, callParams, callback);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void groupCall(TUICommonDefine.RoomId roomId, String str, List<String> list, TUICallDefine.MediaType mediaType, TUICallDefine.CallParams callParams, TUICommonDefine.Callback callback) {
        if (callParams == null) {
            callParams = new TUICallDefine.CallParams();
        }
        TUICallDefine.CallParams callParams2 = callParams;
        if (roomId != null) {
            callParams2.roomId = roomId;
        }
        groupCall(str, list, mediaType, callParams2, callback);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m75714c(TUICallEngineImpl tUICallEngineImpl) {
        tUICallEngineImpl.mObserverProxy.destroy();
        tUICallEngineImpl.mTUICallEngineJni.destroy();
        tUICallEngineImpl.mMainHandler.removeCallbacksAndMessages(null);
    }

    private void callAPI(final String str, final List<Object> list, final TUIPipelineBridgeDefine.APICallRespondCallback aPICallRespondCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.call.n
            @Override // java.lang.Runnable
            public final void run() {
                TUICallEngineImpl.m75722k(this.f72971b, list, str, aPICallRespondCallback);
            }
        });
    }

    public static TUICallEngineImpl createInstance(Context context) {
        TUICallEngineImpl tUICallEngineImpl;
        synchronized (TUICallEngineImpl.class) {
            try {
                if (sInstance == null) {
                    sInstance = new TUICallEngineImpl(context);
                    ContextProvider.setContext(context);
                }
                tUICallEngineImpl = sInstance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tUICallEngineImpl;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m75715d(TUICommonDefine.ValueCallback valueCallback, TUICommonDefine.Error error, String str, String str2) {
        if (valueCallback == null) {
            return;
        }
        if (error == TUICommonDefine.Error.SUCCESS) {
            valueCallback.onSuccess(ParamsParse.JSONArrayToList(ParamsParse.StringToJSONArray(str2), String.class));
            return;
        }
        valueCallback.onError(error.getValue(), "inviteUser failed: " + str);
    }

    private void destroy() {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.call.g
            @Override // java.lang.Runnable
            public final void run() {
                TUICallEngineImpl.m75714c(this.f72943b);
            }
        });
    }

    public static void destroySharedInstance() {
        synchronized (TUICallEngineImpl.class) {
            try {
                TUICallEngineImpl tUICallEngineImpl = sInstance;
                if (tUICallEngineImpl != null) {
                    tUICallEngineImpl.destroy();
                    sInstance = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCallback(TUICommonDefine.Callback callback, TUICommonDefine.Error error, String str, String str2) {
        if (callback == null) {
            return;
        }
        if (error == TUICommonDefine.Error.SUCCESS) {
            callback.onSuccess();
            return;
        }
        callback.onError(error.getValue(), "[" + str + "] API call failed: " + str2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m75721j(TUICommonDefine.ValueCallback valueCallback, List list, TUICommonDefine.Error error, String str, String str2) {
        if (valueCallback == null) {
            return;
        }
        if (error == TUICommonDefine.Error.SUCCESS && Boolean.parseBoolean(str2)) {
            valueCallback.onSuccess(list);
        } else {
            valueCallback.onError(error.getValue(), str);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m75725n(TUICommonDefine.PlayCallback playCallback, TUICommonDefine.Error error, String str, String str2) {
        if (playCallback == null) {
            return;
        }
        if (error != TUICommonDefine.Error.SUCCESS) {
            playCallback.onError(str2, error.getValue(), str);
        } else if ("onPlaying".equals(str)) {
            playCallback.onPlaying(str2);
        } else if ("onLoading".equals(str)) {
            playCallback.onLoading(str2);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m75726o(TUICommonDefine.ValueCallback valueCallback, TUICommonDefine.Error error, String str, String str2) {
        if (valueCallback == null) {
            return;
        }
        if (error == TUICommonDefine.Error.SUCCESS) {
            valueCallback.onSuccess(ParamsParse.getCallRecordsFromJSONArray(ParamsParse.StringToJSONArray(str2)));
            return;
        }
        valueCallback.onError(error.getValue(), "queryRecentCalls failed: " + str);
    }

    private void runOnMainThread(Runnable runnable) {
        if (this.mMainHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.mMainHandler.post(runnable);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void accept(final TUICommonDefine.Callback callback) {
        callAPI("accept", new ArrayList(), new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.e
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                this.f72933a.handleCallback(callback, error, "accept", str);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void addObserver(final TUICallObserver tUICallObserver) {
        if (tUICallObserver == null) {
            LiteavLog.m76093w(TAG, "call_engine - observer cannot be null");
        } else {
            runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.call.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73017b.mObserverProxy.addObserver(tUICallObserver);
                }
            });
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void callExperimentalAPI(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        callAPI("callExperimentalAPI", arrayList, null);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void calls(List<String> list, TUICallDefine.MediaType mediaType, TUICallDefine.CallParams callParams, final TUICommonDefine.Callback callback) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (callParams == null || (str = callParams.chatGroupId) == null) {
            str = "";
        }
        arrayList.add(str);
        arrayList.add(list);
        arrayList.add(Integer.valueOf(mediaType != null ? mediaType.getValue() : TUICallDefine.MediaType.Unknown.getValue()));
        arrayList.add(ParamsParse.callParamsToJsonObject(callParams));
        callAPI("calls", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.m
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str2, String str3) {
                this.f72968a.handleCallback(callback, error, "calls", str2);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void closeCamera() {
        callAPI("closeCamera", new ArrayList(), null);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void closeMicrophone() {
        callAPI("closeMicrophone", new ArrayList(), null);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void deleteRecordCalls(final List<String> list, final TUICommonDefine.ValueCallback valueCallback) {
        if (list == null || list.isEmpty()) {
            if (valueCallback != null) {
                valueCallback.onError(TUICommonDefine.Error.INVALID_PARAMETER.getValue(), "Call ID list cannot be empty");
            }
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(list);
            callAPI("deleteRecordCalls", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.v
                @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
                public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                    TUICallEngineImpl.m75721j(valueCallback, list, error, str, str2);
                }
            });
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void enableMultiDeviceAbility(boolean z11, final TUICommonDefine.Callback callback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Boolean.valueOf(z11));
        callAPI(TUIConstants.TUICalling.PARAM_NAME_ENABLE_MULTI_DEVICE, arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.o
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                this.f72977a.handleCallback(callback, error, TUIConstants.TUICalling.PARAM_NAME_ENABLE_MULTI_DEVICE, str);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public TRTCCloud getTRTCCloudInstance() {
        return this.mTUICallEngineJni.getTRTCCloudInstance();
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void hangup(final TUICommonDefine.Callback callback) {
        callAPI("hangup", new ArrayList(), new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.i
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                this.f72955a.handleCallback(callback, error, "hangup", str);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void ignore(final TUICommonDefine.Callback callback) {
        callAPI("ignore", new ArrayList(), new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.b
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                this.f72921a.handleCallback(callback, error, "ignore", str);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void init(int i11, String str, String str2, final TUICommonDefine.Callback callback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i11));
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(PathUtils.getSDKInitPath(this.mContext));
        arrayList.add(PathUtils.getSDKLogPath(this.mContext));
        callAPI(FirebaseAnalytics.Event.LOGIN, arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.c
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str3, String str4) {
                this.f72923a.handleCallback(callback, error, "init", str3);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void inviteUser(List<String> list, TUICallDefine.CallParams callParams, final TUICommonDefine.ValueCallback<List<String>> valueCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(list);
        arrayList.add(ParamsParse.callParamsToJsonObject(callParams));
        callAPI("inviteUser", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.w
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                TUICallEngineImpl.m75715d(valueCallback, error, str, str2);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void join(String str, final TUICommonDefine.Callback callback) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            str = "";
        }
        arrayList.add(str);
        callAPI("join", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.h
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str2, String str3) {
                this.f72949a.handleCallback(callback, error, "join", str2);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void joinInGroupCall(TUICommonDefine.RoomId roomId, String str, TUICallDefine.MediaType mediaType, final TUICommonDefine.Callback callback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ParamsParse.roomIdToJsonObject(roomId));
        arrayList.add(str);
        arrayList.add(Integer.valueOf(mediaType != null ? mediaType.getValue() : TUICallDefine.MediaType.Unknown.getValue()));
        callAPI("joinInGroupCall", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.r
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str2, String str3) {
                this.f72990a.handleCallback(callback, error, "joinInGroupCall", str2);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void openCamera(TUICommonDefine.Camera camera, TUIVideoView tUIVideoView, final TUICommonDefine.Callback callback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Boolean.valueOf(camera == TUICommonDefine.Camera.Front));
        arrayList.add(Long.valueOf(TUICallEngineJni.getJObjectAddress(tUIVideoView)));
        callAPI("openCamera", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.k
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                this.f72962a.handleCallback(callback, error, "openCamera", str);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void openMicrophone(final TUICommonDefine.Callback callback) {
        callAPI("openMicrophone", new ArrayList(), new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.f
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                this.f72936a.handleCallback(callback, error, "openMicrophone", str);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void queryOfflineCall() {
        callAPI("queryOfflineCall", new ArrayList(), null);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void queryRecentCalls(TUICallDefine.RecentCallsFilter recentCallsFilter, final TUICommonDefine.ValueCallback valueCallback) {
        if (recentCallsFilter == null) {
            recentCallsFilter = new TUICallDefine.RecentCallsFilter();
        }
        ArrayList arrayList = new ArrayList();
        TUICallDefine.CallRecords.Result result = recentCallsFilter.result;
        if (result == null) {
            result = TUICallDefine.CallRecords.Result.Unknown;
        }
        arrayList.add(Integer.valueOf(result.getValue()));
        callAPI("queryRecentCalls", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.p
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                TUICallEngineImpl.m75726o(valueCallback, error, str, str2);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void reject(final TUICommonDefine.Callback callback) {
        callAPI("reject", new ArrayList(), new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.t
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                this.f73004a.handleCallback(callback, error, "reject", str);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void removeObserver(final TUICallObserver tUICallObserver) {
        if (tUICallObserver == null) {
            LiteavLog.m76093w(TAG, "call_engine - observer cannot be null");
        } else {
            runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.call.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73020b.mObserverProxy.removeObserver(tUICallObserver);
                }
            });
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void selectAudioPlaybackDevice(TUICommonDefine.AudioPlaybackDevice audioPlaybackDevice) {
        ArrayList arrayList = new ArrayList();
        if (audioPlaybackDevice == null) {
            audioPlaybackDevice = TUICommonDefine.AudioPlaybackDevice.Speakerphone;
        }
        arrayList.add(Integer.valueOf(audioPlaybackDevice.getValue()));
        callAPI("selectAudioPlaybackDevice", arrayList, null);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void setBeautyLevel(final float f11, final TUICommonDefine.Callback callback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.impl.call.j
            @Override // java.lang.Runnable
            public final void run() {
                TUICallEngineImpl.m75711A(this.f72958b, callback, f11);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void setBlurBackground(int i11, final TUICommonDefine.Callback callback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i11));
        callAPI("setBlurBackground", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.s
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                this.f72998a.handleCallback(callback, error, "setBlurBackground", str);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void setSelfInfo(String str, String str2, final TUICommonDefine.Callback callback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        callAPI("setSelfInfo", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.a0
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str3, String str4) {
                this.f72919a.handleCallback(callback, error, "setSelfInfo", str3);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void setVideoEncoderParams(TUICommonDefine.VideoEncoderParams videoEncoderParams, final TUICommonDefine.Callback callback) {
        if (videoEncoderParams == null) {
            if (callback != null) {
                callback.onError(TUICommonDefine.Error.INVALID_PARAMETER.getValue(), "video encoder params cannot be null");
            }
            LiteavLog.m76083e(TAG, "call_engine - set video encoder error, params is null");
        } else {
            ArrayList arrayList = new ArrayList();
            TUICommonDefine.VideoEncoderParams.Resolution resolution = videoEncoderParams.resolution;
            arrayList.add(Integer.valueOf(resolution != null ? resolution.getValue() : Integer.MIN_VALUE));
            TUICommonDefine.VideoEncoderParams.ResolutionMode resolutionMode = videoEncoderParams.resolutionMode;
            arrayList.add(Integer.valueOf(resolutionMode != null ? resolutionMode.getValue() : Integer.MIN_VALUE));
            callAPI("setVideoEncoderParams", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.a
                @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
                public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                    this.f72917a.handleCallback(callback, error, "setVideoEncoderParams", str);
                }
            });
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void setVirtualBackground(String str, final TUICommonDefine.Callback callback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        callAPI("setVirtualBackground", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.d
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str2, String str3) {
                this.f72928a.handleCallback(callback, error, "setVirtualBackground", str2);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void startRemoteView(String str, TUIVideoView tUIVideoView, final TUICommonDefine.PlayCallback playCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(Long.valueOf(TUICallEngineJni.getJObjectAddress(tUIVideoView)));
        callAPI("startRemoteView", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.z
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str2, String str3) {
                TUICallEngineImpl.m75725n(playCallback, error, str2, str3);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void stopRemoteView(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        callAPI("stopRemoteView", arrayList, null);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void switchCallMediaType(TUICallDefine.MediaType mediaType) {
        ArrayList arrayList = new ArrayList();
        if (mediaType == null) {
            mediaType = TUICallDefine.MediaType.Unknown;
        }
        arrayList.add(Integer.valueOf(mediaType.getValue()));
        callAPI("switchCallMediaType", arrayList, null);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void switchCamera(TUICommonDefine.Camera camera) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Boolean.valueOf(camera == TUICommonDefine.Camera.Front));
        callAPI("switchCamera", arrayList, null);
    }

    private TUICallEngineImpl(Context context) {
        this.mContext = context.getApplicationContext();
        TUICallEngineJni tUICallEngineJni = new TUICallEngineJni();
        this.mTUICallEngineJni = tUICallEngineJni;
        TUICallObserverProxy tUICallObserverProxy = new TUICallObserverProxy();
        this.mObserverProxy = tUICallObserverProxy;
        tUICallEngineJni.getPipelineBridge().addObserver(tUICallObserverProxy);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m75711A(TUICallEngineImpl tUICallEngineImpl, TUICommonDefine.Callback callback, float f11) {
        TRTCCloud tRTCCloudInstance = tUICallEngineImpl.getTRTCCloudInstance();
        if (tRTCCloudInstance == null) {
            LiteavLog.m76083e(TAG, "call_engine - TRTCCloud instance is null, failed to set beauty level");
            if (callback != null) {
                callback.onError(TUICommonDefine.Error.FAILED.getValue(), "failed to set beauty level");
                return;
            }
            return;
        }
        TXBeautyManager beautyManager = tRTCCloudInstance.getBeautyManager();
        beautyManager.setBeautyStyle(1);
        beautyManager.setBeautyLevel(f11);
        if (callback != null) {
            callback.onSuccess();
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m75722k(TUICallEngineImpl tUICallEngineImpl, List list, String str, TUIPipelineBridgeDefine.APICallRespondCallback aPICallRespondCallback) {
        tUICallEngineImpl.getClass();
        tUICallEngineImpl.mTUICallEngineJni.getPipelineBridge().callAPI(str, new JSONArray((Collection) list).toString(), aPICallRespondCallback);
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void setVideoRenderParams(String str, TUICommonDefine.VideoRenderParams videoRenderParams, final TUICommonDefine.Callback callback) {
        int value;
        if (TextUtils.isEmpty(str)) {
            if (callback != null) {
                callback.onError(TUICommonDefine.Error.INVALID_PARAMETER.getValue(), "userId cannot be null or empty");
            }
            LiteavLog.m76083e(TAG, "call_engine - userId is null or empty");
            return;
        }
        if (videoRenderParams == null) {
            if (callback != null) {
                callback.onError(TUICommonDefine.Error.INVALID_PARAMETER.getValue(), "video render params cannot be null");
            }
            LiteavLog.m76083e(TAG, "call_engine - set video render error, params is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        TUICommonDefine.VideoRenderParams.FillMode fillMode = videoRenderParams.fillMode;
        int value2 = Integer.MIN_VALUE;
        if (fillMode != null) {
            value = fillMode.getValue();
        } else {
            value = Integer.MIN_VALUE;
        }
        arrayList.add(Integer.valueOf(value));
        TUICommonDefine.VideoRenderParams.Rotation rotation = videoRenderParams.rotation;
        if (rotation != null) {
            value2 = rotation.getValue();
        }
        arrayList.add(Integer.valueOf(value2));
        callAPI("setVideoRenderParams", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.u
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str2, String str3) {
                this.f73007a.handleCallback(callback, error, "setVideoRenderParams", str2);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void call(String str, TUICallDefine.MediaType mediaType, TUICallDefine.CallParams callParams, final TUICommonDefine.Callback callback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(Integer.valueOf(mediaType != null ? mediaType.getValue() : TUICallDefine.MediaType.Unknown.getValue()));
        arrayList.add(ParamsParse.callParamsToJsonObject(callParams));
        callAPI("call", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.q
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str2, String str3) {
                this.f72987a.handleCallback(callback, error, "call", str2);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.call.TUICallEngine
    public void groupCall(String str, List<String> list, TUICallDefine.MediaType mediaType, TUICallDefine.CallParams callParams, final TUICommonDefine.Callback callback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(list);
        arrayList.add(Integer.valueOf(mediaType != null ? mediaType.getValue() : TUICallDefine.MediaType.Unknown.getValue()));
        arrayList.add(ParamsParse.callParamsToJsonObject(callParams));
        callAPI("groupCall", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.impl.call.l
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str2, String str3) {
                this.f72966a.handleCallback(callback, error, "groupCall", str2);
            }
        });
    }
}
