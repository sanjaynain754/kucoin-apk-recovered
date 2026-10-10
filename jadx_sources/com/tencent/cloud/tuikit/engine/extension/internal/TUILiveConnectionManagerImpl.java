package com.tencent.cloud.tuikit.engine.extension.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("tuikit::extension")
public final class TUILiveConnectionManagerImpl extends TUILiveConnectionManager {
    private static final String TAG = "TUILiveConnectionManagerImpl";
    private long mNativeLiveConnectionManagerJni;
    private final List<TUILiveConnectionManager.Observer> mObserverList = new CopyOnWriteArrayList();
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());

    public static class ActionCallbackJni {
        private final TUIRoomDefine.ActionCallback mCallback;

        @CalledByNative("ActionCallbackJni")
        public void onError(int i11, String str) {
            TUIRoomDefine.ActionCallback actionCallback = this.mCallback;
            if (actionCallback != null) {
                actionCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("ActionCallbackJni")
        public void onSuccess() {
            TUIRoomDefine.ActionCallback actionCallback = this.mCallback;
            if (actionCallback != null) {
                actionCallback.onSuccess();
            }
        }

        public ActionCallbackJni(TUIRoomDefine.ActionCallback actionCallback) {
            this.mCallback = actionCallback;
        }
    }

    public static final class ConnectionRequestCallbackJni {
        private final TUILiveConnectionManager.ConnectionRequestCallback mCallback;

        @CalledByNative("ConnectionRequestCallbackJni")
        public void onError(int i11, String str) {
            TUILiveConnectionManager.ConnectionRequestCallback connectionRequestCallback = this.mCallback;
            if (connectionRequestCallback != null) {
                connectionRequestCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("ConnectionRequestCallbackJni")
        public void onSuccess(String str) {
            if (this.mCallback != null) {
                HashMap map = new HashMap();
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i11);
                        map.put(jSONObject.getString("userId"), TUILiveConnectionManager.ConnectionCode.fromInt(jSONObject.getInt("errorCode")));
                    }
                } catch (JSONException e11) {
                    LiteavLog.m76083e(TUILiveConnectionManagerImpl.TAG, e11.getLocalizedMessage());
                }
                this.mCallback.onSuccess(map);
            }
        }

        public ConnectionRequestCallbackJni(TUILiveConnectionManager.ConnectionRequestCallback connectionRequestCallback) {
            this.mCallback = connectionRequestCallback;
        }
    }

    private static native void nativeAcceptConnection(long j11, String str, ActionCallbackJni actionCallbackJni);

    private static native void nativeCancelConnectionRequest(long j11, String[] strArr, ActionCallbackJni actionCallbackJni);

    private static native void nativeDisconnect(long j11, ActionCallbackJni actionCallbackJni);

    private static native void nativeRejectConnection(long j11, String str, ActionCallbackJni actionCallbackJni);

    private static native void nativeRequestConnection(long j11, String[] strArr, int i11, String str, ConnectionRequestCallbackJni connectionRequestCallbackJni);

    private static native void nativeSetObserver(long j11, Object obj);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m75659a(TUILiveConnectionManagerImpl tUILiveConnectionManagerImpl, String str, TUIRoomDefine.ActionCallback actionCallback) {
        long j11 = tUILiveConnectionManagerImpl.mNativeLiveConnectionManagerJni;
        if (j11 != 0) {
            nativeAcceptConnection(j11, str, new ActionCallbackJni(actionCallback));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m75660b(TUILiveConnectionManagerImpl tUILiveConnectionManagerImpl, List list, int i11, String str, TUILiveConnectionManager.ConnectionRequestCallback connectionRequestCallback) {
        long j11 = tUILiveConnectionManagerImpl.mNativeLiveConnectionManagerJni;
        if (j11 != 0) {
            nativeRequestConnection(j11, (String[]) list.toArray(new String[0]), i11, str, new ConnectionRequestCallbackJni(connectionRequestCallback));
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m75661c(TUILiveConnectionManagerImpl tUILiveConnectionManagerImpl, List list, TUIRoomDefine.ActionCallback actionCallback) {
        long j11 = tUILiveConnectionManagerImpl.mNativeLiveConnectionManagerJni;
        if (j11 != 0) {
            nativeCancelConnectionRequest(j11, (String[]) list.toArray(new String[0]), new ActionCallbackJni(actionCallback));
        }
    }

    private static List<TUILiveConnectionManager.ConnectionUser> convertJsonToConnectionUserList(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    TUILiveConnectionManager.ConnectionUser connectionUserConvertJsonToConnectionUser = convertJsonToConnectionUser(jSONArray.getString(i11));
                    if (connectionUserConvertJsonToConnectionUser != null) {
                        arrayList.add(connectionUserConvertJsonToConnectionUser);
                    }
                }
            } catch (JSONException e11) {
                LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
            }
        }
        return arrayList;
    }

    private List<TUILiveConnectionManager.Observer> copyOnReadListeners() {
        return new CopyOnWriteArrayList(this.mObserverList);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m75662d(TUILiveConnectionManagerImpl tUILiveConnectionManagerImpl, String str, TUIRoomDefine.ActionCallback actionCallback) {
        long j11 = tUILiveConnectionManagerImpl.mNativeLiveConnectionManagerJni;
        if (j11 != 0) {
            nativeRejectConnection(j11, str, new ActionCallbackJni(actionCallback));
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m75663e(TUILiveConnectionManagerImpl tUILiveConnectionManagerImpl, TUILiveConnectionManager.Observer observer) {
        if (tUILiveConnectionManagerImpl.mObserverList.contains(observer)) {
            return;
        }
        tUILiveConnectionManagerImpl.mObserverList.add(observer);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m75665g(TUILiveConnectionManagerImpl tUILiveConnectionManagerImpl) {
        tUILiveConnectionManagerImpl.mObserverList.clear();
        tUILiveConnectionManagerImpl.mNativeLiveConnectionManagerJni = 0L;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m75666h(TUILiveConnectionManagerImpl tUILiveConnectionManagerImpl, TUIRoomDefine.ActionCallback actionCallback) {
        long j11 = tUILiveConnectionManagerImpl.mNativeLiveConnectionManagerJni;
        if (j11 != 0) {
            nativeDisconnect(j11, new ActionCallbackJni(actionCallback));
        }
    }

    private void runOnMainThread(Runnable runnable) {
        this.mMainHandler.post(runnable);
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager
    public void acceptConnection(final String str, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.i0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveConnectionManagerImpl.m75659a(this.f72770b, str, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager
    public void addObserver(final TUILiveConnectionManager.Observer observer) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.j0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveConnectionManagerImpl.m75663e(this.f72777b, observer);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager
    public void cancelConnectionRequest(final List<String> list, final TUIRoomDefine.ActionCallback actionCallback) {
        if (list != null) {
            runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.h0
                @Override // java.lang.Runnable
                public final void run() {
                    TUILiveConnectionManagerImpl.m75661c(this.f72760b, list, actionCallback);
                }
            });
        } else if (actionCallback != null) {
            actionCallback.onError(TUICommonDefine.Error.INVALID_PARAMETER, "roomIdList is null");
        }
    }

    public void destroy() {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.c0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveConnectionManagerImpl.m75665g(this.f72714b);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager
    public void disconnect(final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.e0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveConnectionManagerImpl.m75666h(this.f72730b, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager
    public void rejectConnection(final String str, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.g0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveConnectionManagerImpl.m75662d(this.f72749b, str, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager
    public void removeObserver(final TUILiveConnectionManager.Observer observer) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72719b.mObserverList.remove(observer);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager
    public void requestConnection(final List<String> list, final int i11, final String str, final TUILiveConnectionManager.ConnectionRequestCallback connectionRequestCallback) {
        if (list != null) {
            runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.f0
                @Override // java.lang.Runnable
                public final void run() {
                    TUILiveConnectionManagerImpl.m75660b(this.f72740b, list, i11, str, connectionRequestCallback);
                }
            });
        } else if (connectionRequestCallback != null) {
            connectionRequestCallback.onError(TUICommonDefine.Error.INVALID_PARAMETER, "roomIdList is null");
        }
    }

    public TUILiveConnectionManagerImpl(long j11) {
        this.mNativeLiveConnectionManagerJni = j11;
        if (j11 != 0) {
            nativeSetObserver(j11, this);
        }
    }

    private static TUILiveConnectionManager.ConnectionUser convertJsonToConnectionUser(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        TUILiveConnectionManager.ConnectionUser connectionUser = new TUILiveConnectionManager.ConnectionUser();
        try {
            JSONObject jSONObject = new JSONObject(str);
            connectionUser.userId = jSONObject.getString("userId");
            connectionUser.userName = jSONObject.getString(TUIConstantDefine.USER_NAME);
            connectionUser.avatarUrl = jSONObject.getString(TUIConstantDefine.AVATAR_URL);
            connectionUser.roomId = jSONObject.getString("roomId");
            connectionUser.joinConnectionTime = jSONObject.getLong("joinConnectionTime");
            return connectionUser;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
            return null;
        }
    }

    @CalledByNative
    private void onConnectionRequestAccept(String str) {
        List<TUILiveConnectionManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            TUILiveConnectionManager.ConnectionUser connectionUserConvertJsonToConnectionUser = convertJsonToConnectionUser(str);
            Iterator<TUILiveConnectionManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onConnectionRequestAccept(connectionUserConvertJsonToConnectionUser);
            }
        }
    }

    @CalledByNative
    private void onConnectionRequestCancelled(String str) {
        List<TUILiveConnectionManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            TUILiveConnectionManager.ConnectionUser connectionUserConvertJsonToConnectionUser = convertJsonToConnectionUser(str);
            Iterator<TUILiveConnectionManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onConnectionRequestCancelled(connectionUserConvertJsonToConnectionUser);
            }
        }
    }

    @CalledByNative
    private void onConnectionRequestReceived(String str, String str2, String str3) {
        List<TUILiveConnectionManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            TUILiveConnectionManager.ConnectionUser connectionUserConvertJsonToConnectionUser = convertJsonToConnectionUser(str);
            List<TUILiveConnectionManager.ConnectionUser> listConvertJsonToConnectionUserList = convertJsonToConnectionUserList(str2);
            Iterator<TUILiveConnectionManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onConnectionRequestReceived(connectionUserConvertJsonToConnectionUser, listConvertJsonToConnectionUserList, str3);
            }
        }
    }

    @CalledByNative
    private void onConnectionRequestReject(String str) {
        List<TUILiveConnectionManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            TUILiveConnectionManager.ConnectionUser connectionUserConvertJsonToConnectionUser = convertJsonToConnectionUser(str);
            Iterator<TUILiveConnectionManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onConnectionRequestReject(connectionUserConvertJsonToConnectionUser);
            }
        }
    }

    @CalledByNative
    private void onConnectionRequestTimeout(String str, String str2) {
        List<TUILiveConnectionManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            TUILiveConnectionManager.ConnectionUser connectionUserConvertJsonToConnectionUser = convertJsonToConnectionUser(str);
            TUILiveConnectionManager.ConnectionUser connectionUserConvertJsonToConnectionUser2 = convertJsonToConnectionUser(str2);
            Iterator<TUILiveConnectionManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onConnectionRequestTimeout(connectionUserConvertJsonToConnectionUser, connectionUserConvertJsonToConnectionUser2);
            }
        }
    }

    @CalledByNative
    private void onConnectionUserListChanged(String str, String str2, String str3) {
        List<TUILiveConnectionManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            List<TUILiveConnectionManager.ConnectionUser> listConvertJsonToConnectionUserList = convertJsonToConnectionUserList(str);
            List<TUILiveConnectionManager.ConnectionUser> listConvertJsonToConnectionUserList2 = convertJsonToConnectionUserList(str2);
            List<TUILiveConnectionManager.ConnectionUser> listConvertJsonToConnectionUserList3 = convertJsonToConnectionUserList(str3);
            Iterator<TUILiveConnectionManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onConnectionUserListChanged(listConvertJsonToConnectionUserList, listConvertJsonToConnectionUserList2, listConvertJsonToConnectionUserList3);
            }
        }
    }
}
