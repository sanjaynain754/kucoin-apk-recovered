package com.tencent.cloud.tuikit.engine.extension.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.common.internal.TUIDefineConvert;
import com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("tuikit::extension")
public final class TUILiveGiftManagerImpl extends TUILiveGiftManager {
    private static final String TAG = "TUILiveGiftManagerImpl";
    private long mNativeLiveGiftManagerJni;
    private final List<TUILiveGiftManager.Observer> mObserverList = new CopyOnWriteArrayList();
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());

    public static final class ActionCallbackJni {
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

    public static final class GetGiftCountCallbackJni {
        private final TUILiveGiftManager.GetGiftCountCallback mCallback;

        @CalledByNative("GetGiftCountCallbackJni")
        public void onError(int i11, String str) {
            TUILiveGiftManager.GetGiftCountCallback getGiftCountCallback = this.mCallback;
            if (getGiftCountCallback != null) {
                getGiftCountCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("GetGiftCountCallbackJni")
        public void onSuccess(long j11, long j12, long j13) {
            TUILiveGiftManager.GetGiftCountCallback getGiftCountCallback = this.mCallback;
            if (getGiftCountCallback != null) {
                getGiftCountCallback.onSuccess(j11, j12, j13);
            }
        }

        public GetGiftCountCallbackJni(TUILiveGiftManager.GetGiftCountCallback getGiftCountCallback) {
            this.mCallback = getGiftCountCallback;
        }
    }

    public static final class GetGiftListCallbackJni {
        private final TUILiveGiftManager.GetGiftListCallback mCallback;

        @CalledByNative("GetGiftListCallbackJni")
        public void onError(int i11, String str) {
            TUILiveGiftManager.GetGiftListCallback getGiftListCallback = this.mCallback;
            if (getGiftListCallback != null) {
                getGiftListCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("GetGiftListCallbackJni")
        public void onSuccess(String str) {
            if (this.mCallback != null) {
                ArrayList arrayList = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        arrayList.add(TUILiveGiftManagerImpl.convertJsonToGiftCategory(jSONArray.getJSONObject(i11).toString()));
                    }
                } catch (JSONException e11) {
                    LiteavLog.m76083e(TUILiveGiftManagerImpl.TAG, e11.getLocalizedMessage());
                }
                this.mCallback.onSuccess(arrayList);
            }
        }

        public GetGiftListCallbackJni(TUILiveGiftManager.GetGiftListCallback getGiftListCallback) {
            this.mCallback = getGiftListCallback;
        }
    }

    public static final class GetLikesCountCallbackJni {
        private final TUILiveGiftManager.GetLikesCountCallback mCallback;

        @CalledByNative("GetLikesCountCallbackJni")
        public void onError(int i11, String str) {
            TUILiveGiftManager.GetLikesCountCallback getLikesCountCallback = this.mCallback;
            if (getLikesCountCallback != null) {
                getLikesCountCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("GetLikesCountCallbackJni")
        public void onSuccess(long j11) {
            TUILiveGiftManager.GetLikesCountCallback getLikesCountCallback = this.mCallback;
            if (getLikesCountCallback != null) {
                getLikesCountCallback.onSuccess(j11);
            }
        }

        public GetLikesCountCallbackJni(TUILiveGiftManager.GetLikesCountCallback getLikesCountCallback) {
            this.mCallback = getLikesCountCallback;
        }
    }

    private static native void nativeGetGiftCountByAnchor(long j11, String str, GetGiftCountCallbackJni getGiftCountCallbackJni);

    private static native void nativeGetGiftList(long j11, String str, GetGiftListCallbackJni getGiftListCallbackJni);

    private static native void nativeGetLikesCount(long j11, String str, GetLikesCountCallbackJni getLikesCountCallbackJni);

    private static native void nativeSendGift(long j11, String str, String str2, int i11, ActionCallbackJni actionCallbackJni);

    private static native void nativeSendLike(long j11, String str, int i11, ActionCallbackJni actionCallbackJni);

    private static native void nativeSetObserver(long j11, Object obj);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m75667a(TUILiveGiftManagerImpl tUILiveGiftManagerImpl, String str, int i11, TUIRoomDefine.ActionCallback actionCallback) {
        long j11 = tUILiveGiftManagerImpl.mNativeLiveGiftManagerJni;
        if (j11 != 0) {
            nativeSendLike(j11, str, i11, new ActionCallbackJni(actionCallback));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m75668b(TUILiveGiftManagerImpl tUILiveGiftManagerImpl, String str, TUILiveGiftManager.GetGiftListCallback getGiftListCallback) {
        long j11 = tUILiveGiftManagerImpl.mNativeLiveGiftManagerJni;
        if (j11 != 0) {
            nativeGetGiftList(j11, str, new GetGiftListCallbackJni(getGiftListCallback));
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m75669c(TUILiveGiftManagerImpl tUILiveGiftManagerImpl, String str, TUILiveGiftManager.GetGiftCountCallback getGiftCountCallback) {
        long j11 = tUILiveGiftManagerImpl.mNativeLiveGiftManagerJni;
        if (j11 != 0) {
            nativeGetGiftCountByAnchor(j11, str, new GetGiftCountCallbackJni(getGiftCountCallback));
        }
    }

    private List<TUILiveGiftManager.Observer> copyOnReadListeners() {
        return new CopyOnWriteArrayList(this.mObserverList);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m75670d(TUILiveGiftManagerImpl tUILiveGiftManagerImpl, String str, String str2, int i11, TUIRoomDefine.ActionCallback actionCallback) {
        long j11 = tUILiveGiftManagerImpl.mNativeLiveGiftManagerJni;
        if (j11 != 0) {
            nativeSendGift(j11, str, str2, i11, new ActionCallbackJni(actionCallback));
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m75671e(TUILiveGiftManagerImpl tUILiveGiftManagerImpl, String str, TUILiveGiftManager.GetLikesCountCallback getLikesCountCallback) {
        long j11 = tUILiveGiftManagerImpl.mNativeLiveGiftManagerJni;
        if (j11 != 0) {
            nativeGetLikesCount(j11, str, new GetLikesCountCallbackJni(getLikesCountCallback));
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m75672f(TUILiveGiftManagerImpl tUILiveGiftManagerImpl, TUILiveGiftManager.Observer observer) {
        if (tUILiveGiftManagerImpl.mObserverList.contains(observer)) {
            return;
        }
        tUILiveGiftManagerImpl.mObserverList.add(observer);
    }

    private void runOnMainThread(Runnable runnable) {
        this.mMainHandler.post(runnable);
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager
    public void addObserver(final TUILiveGiftManager.Observer observer) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.k0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveGiftManagerImpl.m75672f(this.f72787b, observer);
            }
        });
    }

    public void destroy() {
        this.mObserverList.clear();
        this.mNativeLiveGiftManagerJni = 0L;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager
    public void getGiftCountByAnchor(final String str, final TUILiveGiftManager.GetGiftCountCallback getGiftCountCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.n0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveGiftManagerImpl.m75669c(this.f72809b, str, getGiftCountCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager
    public void getGiftList(final String str, final TUILiveGiftManager.GetGiftListCallback getGiftListCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.o0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveGiftManagerImpl.m75668b(this.f72817b, str, getGiftListCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager
    public void getLikesCount(final String str, final TUILiveGiftManager.GetLikesCountCallback getLikesCountCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.q0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveGiftManagerImpl.m75671e(this.f72837b, str, getLikesCountCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager
    public void removeObserver(final TUILiveGiftManager.Observer observer) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72793b.mObserverList.remove(observer);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager
    public void sendGift(final String str, final String str2, final int i11, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.m0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveGiftManagerImpl.m75670d(this.f72799b, str, str2, i11, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveGiftManager
    public void sendLike(final String str, final int i11, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.p0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveGiftManagerImpl.m75667a(this.f72826b, str, i11, actionCallback);
            }
        });
    }

    public TUILiveGiftManagerImpl(long j11) {
        this.mNativeLiveGiftManagerJni = j11;
        if (j11 != 0) {
            nativeSetObserver(j11, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TUILiveGiftManager.GiftCategory convertJsonToGiftCategory(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        TUILiveGiftManager.GiftCategory giftCategory = new TUILiveGiftManager.GiftCategory();
        try {
            JSONObject jSONObject = new JSONObject(str);
            giftCategory.categoryId = jSONObject.getString("categoryID");
            giftCategory.name = jSONObject.getString("name");
            giftCategory.desc = jSONObject.getString("desc");
            JSONArray jSONArray = jSONObject.getJSONArray("giftList");
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                TUILiveGiftManager.GiftInfo giftInfoConvertJsonToGiftInfo = convertJsonToGiftInfo(jSONArray.getString(i11));
                if (giftInfoConvertJsonToGiftInfo != null) {
                    arrayList.add(giftInfoConvertJsonToGiftInfo);
                }
            }
            giftCategory.giftList = arrayList;
            giftCategory.extensionInfo = convertJsonToMap(jSONObject.getString("extensionInfo"));
            return giftCategory;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
            return null;
        }
    }

    private static TUILiveGiftManager.GiftInfo convertJsonToGiftInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        TUILiveGiftManager.GiftInfo giftInfo = new TUILiveGiftManager.GiftInfo();
        try {
            JSONObject jSONObject = new JSONObject(str);
            giftInfo.giftId = jSONObject.getString("giftID");
            giftInfo.name = jSONObject.getString("name");
            giftInfo.desc = jSONObject.getString("desc");
            giftInfo.iconUrl = jSONObject.getString("iconUrl");
            giftInfo.resourceUrl = jSONObject.getString("resourceUrl");
            giftInfo.level = jSONObject.getInt(FirebaseAnalytics.Param.LEVEL);
            giftInfo.coins = jSONObject.getInt("coins");
            giftInfo.extensionInfo = convertJsonToMap(jSONObject.getString("extensionInfo"));
            return giftInfo;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
            return null;
        }
    }

    private static Map<String, String> convertJsonToMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            return map;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
            return null;
        }
    }

    @CalledByNative
    private void onGiftCountChanged(String str, long j11, long j12, long j13) {
        List<TUILiveGiftManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            Iterator<TUILiveGiftManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onGiftCountChanged(str, j11, j12, j13);
            }
        }
    }

    @CalledByNative
    private void onReceiveGiftMessage(String str, String str2, long j11, String str3) {
        TUILiveGiftManager.GiftInfo giftInfoConvertJsonToGiftInfo;
        List<TUILiveGiftManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty() && (giftInfoConvertJsonToGiftInfo = convertJsonToGiftInfo(str2)) != null) {
            TUIRoomDefine.UserInfo userInfoConvertStringToUserInfo = TUIDefineConvert.convertStringToUserInfo(str3);
            Iterator<TUILiveGiftManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onReceiveGiftMessage(str, giftInfoConvertJsonToGiftInfo, j11, userInfoConvertStringToUserInfo);
            }
        }
    }

    @CalledByNative
    private void onReceiveLikesMessage(String str, long j11, String str2) {
        List<TUILiveGiftManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            TUIRoomDefine.UserInfo userInfoConvertStringToUserInfo = TUIDefineConvert.convertStringToUserInfo(str2);
            Iterator<TUILiveGiftManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onReceiveLikesMessage(str, j11, userInfoConvertStringToUserInfo);
            }
        }
    }
}
