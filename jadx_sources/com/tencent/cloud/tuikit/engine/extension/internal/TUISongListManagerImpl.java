package com.tencent.cloud.tuikit.engine.extension.internal;

import android.os.Handler;
import android.os.Looper;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUISongListManager;
import com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine;
import com.tencent.cloud.tuikit.engine.impl.room.TUIRoomEngineJni;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class TUISongListManagerImpl extends TUISongListManager {
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private TUIRoomEngineJni mRoomEngineJni;
    private TUISongListManagerJni mTUISongListManagerJni;

    private void callAPI(String str, List<Object> list, TUIPipelineBridgeDefine.APICallRespondCallback aPICallRespondCallback) {
        this.mRoomEngineJni.getPipelineBridge().callAPI(str, new JSONArray((Collection) list).toString(), aPICallRespondCallback);
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
    public void handleSongListResponse(TUISongListManager.SongListCallback songListCallback, TUICommonDefine.Error error, String str, String str2) {
        if (songListCallback == null) {
            return;
        }
        if (error != TUICommonDefine.Error.SUCCESS) {
            songListCallback.onError(error, str);
            return;
        }
        try {
            songListCallback.onSuccess(SongListParamsParse.jsonToSongListResult((JSONObject) com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse.getParamFromJSONArray(com.tencent.cloud.tuikit.engine.impl.utils.ParamsParse.StringToJSONArray(str2), 0, JSONObject.class)));
        } catch (Exception e11) {
            songListCallback.onError(TUICommonDefine.Error.FAILED, "parse response failed: " + e11.getMessage());
        }
    }

    private void runOnMainThread(Runnable runnable) {
        if (this.mMainHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.mMainHandler.post(runnable);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUISongListManager
    public void addObserver(final TUISongListManager.Observer observer) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.s1
            @Override // java.lang.Runnable
            public final void run() {
                this.f72857b.mTUISongListManagerJni.addObserver(observer);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUISongListManager
    public void addSong(final List<TUISongListManager.SongInfo> list, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.u1
            @Override // java.lang.Runnable
            public final void run() {
                TUISongListManagerImpl.m75707l(this.f72873b, list, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUISongListManager
    public void getPlayedList(final String str, final int i11, final TUISongListManager.SongListCallback songListCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.a2
            @Override // java.lang.Runnable
            public final void run() {
                TUISongListManagerImpl.m75708m(this.f72695b, str, i11, songListCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUISongListManager
    public void getWaitingList(final String str, final int i11, final TUISongListManager.SongListCallback songListCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.t1
            @Override // java.lang.Runnable
            public final void run() {
                TUISongListManagerImpl.m75701f(this.f72865b, str, i11, songListCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUISongListManager
    public void playNextSong(final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.o1
            @Override // java.lang.Runnable
            public final void run() {
                TUISongListManagerImpl.m75704i(this.f72820b, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUISongListManager
    public void removeObserver(final TUISongListManager.Observer observer) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.y1
            @Override // java.lang.Runnable
            public final void run() {
                this.f72908b.mTUISongListManagerJni.removeObserver(observer);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUISongListManager
    public void removeSong(final List<String> list, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.p1
            @Override // java.lang.Runnable
            public final void run() {
                TUISongListManagerImpl.m75696a(this.f72830b, list, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUISongListManager
    public void setNextSong(final String str, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.b2
            @Override // java.lang.Runnable
            public final void run() {
                TUISongListManagerImpl.m75705j(this.f72708b, str, actionCallback);
            }
        });
    }

    public TUISongListManagerImpl(final TUIRoomEngineJni tUIRoomEngineJni, final long j11) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.w1
            @Override // java.lang.Runnable
            public final void run() {
                TUISongListManagerImpl.m75702g(this.f72889b, j11, tUIRoomEngineJni);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m75696a(final TUISongListManagerImpl tUISongListManagerImpl, List list, final TUIRoomDefine.ActionCallback actionCallback) {
        tUISongListManagerImpl.getClass();
        if (list == null) {
            list = new ArrayList();
        }
        JSONArray jSONArrayStringListToJsonArray = SongListParamsParse.stringListToJsonArray(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(jSONArrayStringListToJsonArray);
        tUISongListManagerImpl.callAPI("removeSong", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.z1
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                this.f72915a.handleCallback(actionCallback, error, str);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m75701f(final TUISongListManagerImpl tUISongListManagerImpl, String str, int i11, final TUISongListManager.SongListCallback songListCallback) {
        tUISongListManagerImpl.getClass();
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            str = "";
        }
        arrayList.add(str);
        arrayList.add(Integer.valueOf(i11));
        tUISongListManagerImpl.callAPI("getWaitingList", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.n1
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str2, String str3) {
                this.f72812a.handleSongListResponse(songListCallback, error, str2, str3);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m75702g(TUISongListManagerImpl tUISongListManagerImpl, long j11, TUIRoomEngineJni tUIRoomEngineJni) {
        tUISongListManagerImpl.getClass();
        tUISongListManagerImpl.mTUISongListManagerJni = new TUISongListManagerJni(j11);
        tUISongListManagerImpl.mRoomEngineJni = tUIRoomEngineJni;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m75704i(final TUISongListManagerImpl tUISongListManagerImpl, final TUIRoomDefine.ActionCallback actionCallback) {
        tUISongListManagerImpl.getClass();
        tUISongListManagerImpl.callAPI("playNextSong", new ArrayList(), new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.r1
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                this.f72850a.handleCallback(actionCallback, error, str);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m75705j(final TUISongListManagerImpl tUISongListManagerImpl, String str, final TUIRoomDefine.ActionCallback actionCallback) {
        tUISongListManagerImpl.getClass();
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            str = "";
        }
        arrayList.add(str);
        tUISongListManagerImpl.callAPI("setNextSong", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.q1
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str2, String str3) {
                this.f72840a.handleCallback(actionCallback, error, str2);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m75707l(final TUISongListManagerImpl tUISongListManagerImpl, List list, final TUIRoomDefine.ActionCallback actionCallback) {
        tUISongListManagerImpl.getClass();
        if (list == null) {
            list = new ArrayList();
        }
        JSONArray jSONArraySongListToJsonArray = SongListParamsParse.songListToJsonArray(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(jSONArraySongListToJsonArray);
        tUISongListManagerImpl.callAPI("addSong", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.v1
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str, String str2) {
                this.f72880a.handleCallback(actionCallback, error, str);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m75708m(final TUISongListManagerImpl tUISongListManagerImpl, String str, int i11, final TUISongListManager.SongListCallback songListCallback) {
        tUISongListManagerImpl.getClass();
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            str = "";
        }
        arrayList.add(str);
        arrayList.add(Integer.valueOf(i11));
        tUISongListManagerImpl.callAPI("getPlayedList", arrayList, new TUIPipelineBridgeDefine.APICallRespondCallback() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.x1
            @Override // com.tencent.cloud.tuikit.engine.impl.pipelinebridge.TUIPipelineBridgeDefine.APICallRespondCallback
            public final void onCallback(TUICommonDefine.Error error, String str2, String str3) {
                this.f72897a.handleSongListResponse(songListCallback, error, str2, str3);
            }
        });
    }
}
