package com.tencent.cloud.tuikit.engine.extension.internal;

import android.os.Handler;
import android.os.Looper;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveLayoutManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("tuikit::extension")
public final class TUILiveLayoutManagerImpl extends TUILiveLayoutManager {
    private static final String TAG = "TUILiveLayoutManagerImpl";
    private long mNativeLiveLayoutManagerJni;
    private final List<TUILiveLayoutManager.Observer> mObserverList = new CopyOnWriteArrayList();
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

    private static native void nativeSetLiveStreamLayoutInfo(long j11, String str, String str2, ActionCallbackJni actionCallbackJni);

    private static native void nativeSetObserver(long j11, Object obj);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m75674a(TUILiveLayoutManagerImpl tUILiveLayoutManagerImpl) {
        tUILiveLayoutManagerImpl.mObserverList.clear();
        tUILiveLayoutManagerImpl.mNativeLiveLayoutManagerJni = 0L;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m75675b(TUILiveLayoutManagerImpl tUILiveLayoutManagerImpl, String str, String str2, TUIRoomDefine.ActionCallback actionCallback) {
        long j11 = tUILiveLayoutManagerImpl.mNativeLiveLayoutManagerJni;
        if (j11 != 0) {
            nativeSetLiveStreamLayoutInfo(j11, str, str2, new ActionCallbackJni(actionCallback));
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m75676c(TUILiveLayoutManagerImpl tUILiveLayoutManagerImpl, TUILiveLayoutManager.Observer observer) {
        if (tUILiveLayoutManagerImpl.mObserverList.contains(observer)) {
            return;
        }
        tUILiveLayoutManagerImpl.mObserverList.add(observer);
    }

    private List<TUILiveLayoutManager.Observer> copyOnReadListeners() {
        return new CopyOnWriteArrayList(this.mObserverList);
    }

    private void runOnMainThread(Runnable runnable) {
        this.mMainHandler.post(runnable);
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveLayoutManager
    public void addObserver(final TUILiveLayoutManager.Observer observer) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.t0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveLayoutManagerImpl.m75676c(this.f72863b, observer);
            }
        });
    }

    public void destroy() {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.u0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveLayoutManagerImpl.m75674a(this.f72872b);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveLayoutManager
    public void removeObserver(final TUILiveLayoutManager.Observer observer) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72855b.mObserverList.remove(observer);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveLayoutManager
    public void setLiveStreamLayoutInfo(final String str, final String str2, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.r0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveLayoutManagerImpl.m75675b(this.f72846b, str, str2, actionCallback);
            }
        });
    }

    public TUILiveLayoutManagerImpl(long j11) {
        this.mNativeLiveLayoutManagerJni = j11;
        if (j11 != 0) {
            nativeSetObserver(j11, this);
        }
    }

    @CalledByNative
    private void onLiveVideoLayoutChanged(String str, String str2) {
        List<TUILiveLayoutManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            Iterator<TUILiveLayoutManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onLiveVideoLayoutChanged(str, str2);
            }
        }
    }

    @CalledByNative
    private void onSeatLayoutChanged(String str, String str2) throws JSONException {
        List<TUILiveLayoutManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            TUILiveLayoutManager.SeatLayout seatLayoutFromJSONObject = LiveLayoutParamsParse.getSeatLayoutFromJSONObject(new JSONObject(str2));
            Iterator<TUILiveLayoutManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onSeatLayoutChanged(str, seatLayoutFromJSONObject);
            }
        }
    }
}
