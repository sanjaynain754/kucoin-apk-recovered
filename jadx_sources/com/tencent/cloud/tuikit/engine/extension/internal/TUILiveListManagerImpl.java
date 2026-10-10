package com.tencent.cloud.tuikit.engine.extension.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.common.TUIVideoView;
import com.tencent.cloud.tuikit.engine.extension.TUILiveListManager;
import com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine;
import com.tencent.cloud.tuikit.engine.impl.room.TUIRoomEngineJni;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class TUILiveListManagerImpl extends TUILiveListManager {
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private TUIRoomEngineJni mRoomEngineJni;
    private TUILiveListManagerJni mTUILiveListManagerJni;

    private void callAPI(String str, List<Object> list, TUIPipelineBridgeDefine.APICallRespondCallback aPICallRespondCallback) {
        this.mRoomEngineJni.getPipelineBridge().callAPI(str, new JSONArray((Collection) list).toString(), aPICallRespondCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getLiveStatisticsResponse(TUILiveListManager.LiveStatisticsCallback liveStatisticsCallback, TUICommonDefine.Error error, String str, String str2) {
        if (liveStatisticsCallback == null) {
            return;
        }
        if (error != TUICommonDefine.Error.SUCCESS) {
            liveStatisticsCallback.onError(error, str);
        } else {
            liveStatisticsCallback.onSuccess(ParamsParse.JsonToLiveStatisticsData((JSONObject) com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse.getParamFromJSONArray(com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse.StringToJSONArray(str2), 0, JSONObject.class)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCallback(TUIRoomDefine.ActionCallback actionCallback, TUICommonDefine.Error error, String str) {
        if (actionCallback == null) {
            return;
        }
        if (error == TUICommonDefine.Error.SUCCESS) {
            actionCallback.onSuccess();
        } else {
            actionCallback.onError(error, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void joinLiveResponse(TUILiveListManager.LiveInfoCallback liveInfoCallback, TUICommonDefine.Error error, String str, String str2) {
        if (liveInfoCallback == null) {
            return;
        }
        if (error != TUICommonDefine.Error.SUCCESS) {
            liveInfoCallback.onError(error, str);
        } else {
            liveInfoCallback.onSuccess(ParamsParse.JsonToLiveInfo((JSONObject) com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse.getParamFromJSONArray(com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse.StringToJSONArray(str2), 0, JSONObject.class)));
        }
    }

    private void runOnMainThread(Runnable runnable) {
        if (this.mMainHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.mMainHandler.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLiveResponse(TUILiveListManager.LiveInfoCallback liveInfoCallback, TUICommonDefine.Error error, String str, String str2) {
        if (liveInfoCallback == null) {
            return;
        }
        if (error != TUICommonDefine.Error.SUCCESS) {
            liveInfoCallback.onError(error, str);
        } else {
            liveInfoCallback.onSuccess(ParamsParse.JsonToLiveInfo((JSONObject) com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse.getParamFromJSONArray(com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse.StringToJSONArray(str2), 0, JSONObject.class)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPreloadVideoStreamResponse(TUIRoomDefine.PlayCallback playCallback, TUICommonDefine.Error error, String str, String str2) {
        if (playCallback == null) {
            return;
        }
        String str3 = (String) com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse.getParamFromJSONArray(com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse.StringToJSONArray(str2), 0, String.class);
        if (error == TUICommonDefine.Error.SUCCESS) {
            playCallback.onPlaying(str3);
        } else {
            playCallback.onPlayError(str3, error, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopLiveResponse(TUILiveListManager.StopLiveCallback stopLiveCallback, TUICommonDefine.Error error, String str, String str2) {
        if (stopLiveCallback == null) {
            return;
        }
        if (error != TUICommonDefine.Error.SUCCESS) {
            stopLiveCallback.onError(error, str);
        } else {
            stopLiveCallback.onSuccess(ParamsParse.JsonToLiveStatisticsData((JSONObject) com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse.getParamFromJSONArray(com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse.StringToJSONArray(str2), 0, JSONObject.class)));
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager
    public void addObserver(final TUILiveListManager.Observer observer) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.x0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72895b.mTUILiveListManagerJni.addObserver(observer);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager
    public void fetchLiveList(final String str, final int i11, final TUILiveListManager.LiveInfoListCallback liveInfoListCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.w0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72885b.mTUILiveListManagerJni.fetchLiveList(str, i11, liveInfoListCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager
    public void getLiveInfo(final String str, final TUILiveListManager.LiveInfoCallback liveInfoCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.e1
            @Override // java.lang.Runnable
            public final void run() {
                this.f72732b.mTUILiveListManagerJni.getLiveInfo(str, liveInfoCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager
    public void getLiveStatistics(final String str, final TUILiveListManager.LiveStatisticsCallback liveStatisticsCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.j1
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveListManagerImpl.m75689l(this.f72779b, str, liveStatisticsCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager
    public void joinLive(final String str, final TUILiveListManager.LiveInfoCallback liveInfoCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.d1
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveListManagerImpl.m75684g(this.f72721b, str, liveInfoCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager
    public void leaveLive(final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.i1
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveListManagerImpl.m75681d(this.f72773b, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager
    public void removeObserver(final TUILiveListManager.Observer observer) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.c1
            @Override // java.lang.Runnable
            public final void run() {
                this.f72715b.mTUILiveListManagerJni.removeObserver(observer);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager
    public void setLiveInfo(final TUILiveListManager.LiveInfo liveInfo, List<TUILiveListManager.LiveModifyFlag> list, final TUIRoomDefine.ActionCallback actionCallback) {
        if (liveInfo == null || list == null) {
            if (actionCallback != null) {
                actionCallback.onError(TUICommonDefine.Error.INVALID_PARAMETER, "modifyFlagList or liveInfo is null");
                return;
            }
            return;
        }
        String str = liveInfo.roomId;
        if (str == null || TextUtils.isEmpty(str)) {
            TUIRoomDefine.RoomInfo roomInfo = liveInfo.roomInfo;
            liveInfo.roomId = roomInfo == null ? "" : roomInfo.roomId;
        }
        Iterator<TUILiveListManager.LiveModifyFlag> it = list.iterator();
        final int value = 0;
        while (it.hasNext()) {
            value |= it.next().getValue();
        }
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.g1
            @Override // java.lang.Runnable
            public final void run() {
                this.f72752b.mTUILiveListManagerJni.setLiveInfo(liveInfo, value, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager
    public void startLive(final TUILiveListManager.LiveInfo liveInfo, final TUILiveListManager.LiveInfoCallback liveInfoCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.v0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveListManagerImpl.m75693p(this.f72877b, liveInfo, liveInfoCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager
    public void startPreloadVideoStream(final String str, final boolean z11, final TUIVideoView tUIVideoView, final TUIRoomDefine.PlayCallback playCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.y0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveListManagerImpl.m75682e(this.f72903b, str, z11, tUIVideoView, playCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager
    public void stopLive(final TUILiveListManager.StopLiveCallback stopLiveCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.b1
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveListManagerImpl.m75686i(this.f72706b, stopLiveCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveListManager
    public void stopPreloadVideoStream(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        callAPI("stopPreloadVideoStream", arrayList, null);
    }

    public TUILiveListManagerImpl(final TUIRoomEngineJni tUIRoomEngineJni, final long j11) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.z0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveListManagerImpl.m75694q(this.f72912b, j11, tUIRoomEngineJni);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m75681d(final TUILiveListManagerImpl tUILiveListManagerImpl, final TUIRoomDefine.ActionCallback actionCallback) {
        tUILiveListManagerImpl.getClass();
        tUILiveListManagerImpl.callAPI("leaveLive", new ArrayList(), new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.l1
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                this.f72795a.handleCallback(actionCallback, error, str);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m75682e(final TUILiveListManagerImpl tUILiveListManagerImpl, String str, boolean z11, TUIVideoView tUIVideoView, final TUIRoomDefine.PlayCallback playCallback) {
        tUILiveListManagerImpl.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(Boolean.valueOf(z11));
        arrayList.add(Long.valueOf(TUIRoomEngineJni.getJObjectAddress(tUIVideoView)));
        tUILiveListManagerImpl.callAPI("startPreloadVideoStream", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.m1
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str2, String str3) {
                this.f72804a.startPreloadVideoStreamResponse(playCallback, error, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m75684g(final TUILiveListManagerImpl tUILiveListManagerImpl, String str, final TUILiveListManager.LiveInfoCallback liveInfoCallback) {
        tUILiveListManagerImpl.getClass();
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            str = "";
        }
        arrayList.add(str);
        tUILiveListManagerImpl.callAPI("joinLive", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.a1
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str2, String str3) {
                this.f72693a.joinLiveResponse(liveInfoCallback, error, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m75686i(final TUILiveListManagerImpl tUILiveListManagerImpl, final TUILiveListManager.StopLiveCallback stopLiveCallback) {
        tUILiveListManagerImpl.getClass();
        tUILiveListManagerImpl.callAPI("stopLive", new ArrayList(), new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.k1
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                this.f72789a.stopLiveResponse(stopLiveCallback, error, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m75689l(final TUILiveListManagerImpl tUILiveListManagerImpl, String str, final TUILiveListManager.LiveStatisticsCallback liveStatisticsCallback) {
        tUILiveListManagerImpl.getClass();
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            str = "";
        }
        arrayList.add(str);
        tUILiveListManagerImpl.callAPI("getLiveStatistics", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.h1
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str2, String str3) {
                this.f72763a.getLiveStatisticsResponse(liveStatisticsCallback, error, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m75693p(final TUILiveListManagerImpl tUILiveListManagerImpl, TUILiveListManager.LiveInfo liveInfo, final TUILiveListManager.LiveInfoCallback liveInfoCallback) {
        tUILiveListManagerImpl.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ParamsParse.liveInfoToJson(liveInfo));
        tUILiveListManagerImpl.callAPI("startLive", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.f1
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                this.f72745a.startLiveResponse(liveInfoCallback, error, str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m75694q(TUILiveListManagerImpl tUILiveListManagerImpl, long j11, TUIRoomEngineJni tUIRoomEngineJni) {
        tUILiveListManagerImpl.getClass();
        tUILiveListManagerImpl.mTUILiveListManagerJni = new TUILiveListManagerJni(j11);
        tUILiveListManagerImpl.mRoomEngineJni = tUIRoomEngineJni;
    }
}
