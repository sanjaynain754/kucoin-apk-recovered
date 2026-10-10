package com.tencent.cloud.tuikit.engine.extension.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager;
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
public final class TUILiveBattleManagerImpl extends TUILiveBattleManager {
    private static final String TAG = "TUILiveBattleManagerImpl";
    private long mNativeLiveBattleManagerJni;
    private final List<TUILiveBattleManager.Observer> mObserverList = new CopyOnWriteArrayList();
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

    public static final class BattleRequestCallbackJni {
        private final TUILiveBattleManager.BattleConfig battleConfig;
        private final TUILiveBattleManager.BattleRequestCallback mCallback;

        @CalledByNative("BattleRequestCallbackJni")
        public void onError(int i11, String str) {
            TUILiveBattleManager.BattleRequestCallback battleRequestCallback = this.mCallback;
            if (battleRequestCallback != null) {
                battleRequestCallback.onError(TUICommonDefine.Error.fromInt(i11), str);
            }
        }

        @CalledByNative("BattleRequestCallbackJni")
        public void onSuccess(String str) {
            if (this.mCallback != null) {
                HashMap map = new HashMap();
                String string = "";
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    string = jSONObject.getString("battleId");
                    JSONArray jSONArray = jSONObject.getJSONArray("resultList");
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                        map.put(jSONObject2.getString("userId"), TUILiveBattleManager.BattleCode.fromInt(jSONObject2.getInt("errorCode")));
                    }
                } catch (JSONException e11) {
                    LiteavLog.m76083e(TUILiveBattleManagerImpl.TAG, e11.getLocalizedMessage());
                }
                TUILiveBattleManager.BattleInfo battleInfo = new TUILiveBattleManager.BattleInfo();
                battleInfo.battleId = string;
                battleInfo.config = this.battleConfig;
                this.mCallback.onSuccess(battleInfo, map);
            }
        }

        public BattleRequestCallbackJni(TUILiveBattleManager.BattleConfig battleConfig, TUILiveBattleManager.BattleRequestCallback battleRequestCallback) {
            this.battleConfig = battleConfig;
            this.mCallback = battleRequestCallback;
        }
    }

    private static TUILiveBattleManager.BattleUser convertJsonToBattleUser(String str) {
        try {
            return convertJsonToBattleUser(new JSONObject(str));
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
            return null;
        }
    }

    private static native void nativeAcceptBattle(long j11, String str, ActionCallbackJni actionCallbackJni);

    private static native void nativeCancelBattleRequest(long j11, String str, String[] strArr, ActionCallbackJni actionCallbackJni);

    private static native void nativeExitBattle(long j11, String str, ActionCallbackJni actionCallbackJni);

    private static native void nativeRejectBattle(long j11, String str, ActionCallbackJni actionCallbackJni);

    private static native void nativeRequestBattle(long j11, int i11, boolean z11, String str, String[] strArr, int i12, BattleRequestCallbackJni battleRequestCallbackJni);

    private static native void nativeSetObserver(long j11, Object obj);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m75651a(TUILiveBattleManagerImpl tUILiveBattleManagerImpl, String str, TUIRoomDefine.ActionCallback actionCallback) {
        long j11 = tUILiveBattleManagerImpl.mNativeLiveBattleManagerJni;
        if (j11 != 0) {
            nativeRejectBattle(j11, str, new ActionCallbackJni(actionCallback));
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m75652b(TUILiveBattleManagerImpl tUILiveBattleManagerImpl, TUILiveBattleManager.Observer observer) {
        if (tUILiveBattleManagerImpl.mObserverList.contains(observer)) {
            return;
        }
        tUILiveBattleManagerImpl.mObserverList.add(observer);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m75653c(TUILiveBattleManagerImpl tUILiveBattleManagerImpl, String str, TUIRoomDefine.ActionCallback actionCallback) {
        long j11 = tUILiveBattleManagerImpl.mNativeLiveBattleManagerJni;
        if (j11 != 0) {
            nativeExitBattle(j11, str, new ActionCallbackJni(actionCallback));
        }
    }

    private static List<TUILiveBattleManager.BattleUser> convertJsonToBattleUserList(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    TUILiveBattleManager.BattleUser battleUserConvertJsonToBattleUser = convertJsonToBattleUser(jSONArray.getString(i11));
                    if (battleUserConvertJsonToBattleUser != null) {
                        arrayList.add(battleUserConvertJsonToBattleUser);
                    }
                }
            } catch (JSONException e11) {
                LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
            }
        }
        return arrayList;
    }

    private List<TUILiveBattleManager.Observer> copyOnReadListeners() {
        return new CopyOnWriteArrayList(this.mObserverList);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m75654d(TUILiveBattleManagerImpl tUILiveBattleManagerImpl, TUILiveBattleManager.BattleConfig battleConfig, List list, int i11, TUILiveBattleManager.BattleRequestCallback battleRequestCallback) {
        long j11 = tUILiveBattleManagerImpl.mNativeLiveBattleManagerJni;
        if (j11 != 0) {
            nativeRequestBattle(j11, battleConfig.duration, battleConfig.needResponse, battleConfig.extensionInfo, (String[]) list.toArray(new String[0]), i11, new BattleRequestCallbackJni(battleConfig, battleRequestCallback));
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m75656f(TUILiveBattleManagerImpl tUILiveBattleManagerImpl) {
        tUILiveBattleManagerImpl.mObserverList.clear();
        tUILiveBattleManagerImpl.mNativeLiveBattleManagerJni = 0L;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m75657g(TUILiveBattleManagerImpl tUILiveBattleManagerImpl, String str, List list, TUIRoomDefine.ActionCallback actionCallback) {
        long j11 = tUILiveBattleManagerImpl.mNativeLiveBattleManagerJni;
        if (j11 != 0) {
            nativeCancelBattleRequest(j11, str, (String[]) list.toArray(new String[0]), new ActionCallbackJni(actionCallback));
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m75658h(TUILiveBattleManagerImpl tUILiveBattleManagerImpl, String str, TUIRoomDefine.ActionCallback actionCallback) {
        long j11 = tUILiveBattleManagerImpl.mNativeLiveBattleManagerJni;
        if (j11 != 0) {
            nativeAcceptBattle(j11, str, new ActionCallbackJni(actionCallback));
        }
    }

    private void runOnMainThread(Runnable runnable) {
        this.mMainHandler.post(runnable);
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager
    public void acceptBattle(final String str, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.w
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveBattleManagerImpl.m75658h(this.f72882b, str, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager
    public void addObserver(final TUILiveBattleManager.Observer observer) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.a0
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveBattleManagerImpl.m75652b(this.f72691b, observer);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager
    public void cancelBattleRequest(final String str, final List<String> list, final TUIRoomDefine.ActionCallback actionCallback) {
        if (list != null) {
            runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.y
                @Override // java.lang.Runnable
                public final void run() {
                    TUILiveBattleManagerImpl.m75657g(this.f72899b, str, list, actionCallback);
                }
            });
        } else if (actionCallback != null) {
            actionCallback.onError(TUICommonDefine.Error.INVALID_PARAMETER, "userIdList is null");
        }
    }

    public void destroy() {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.v
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveBattleManagerImpl.m75656f(this.f72876b);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager
    public void exitBattle(final String str, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.x
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveBattleManagerImpl.m75653c(this.f72892b, str, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager
    public void rejectBattle(final String str, final TUIRoomDefine.ActionCallback actionCallback) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.u
            @Override // java.lang.Runnable
            public final void run() {
                TUILiveBattleManagerImpl.m75651a(this.f72869b, str, actionCallback);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager
    public void removeObserver(final TUILiveBattleManager.Observer observer) {
        runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f72910b.mObserverList.remove(observer);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveBattleManager
    public void requestBattle(final TUILiveBattleManager.BattleConfig battleConfig, final List<String> list, final int i11, final TUILiveBattleManager.BattleRequestCallback battleRequestCallback) {
        if (list != null) {
            runOnMainThread(new Runnable() { // from class: com.tencent.cloud.tuikit.engine.extension.internal.b0
                @Override // java.lang.Runnable
                public final void run() {
                    TUILiveBattleManagerImpl.m75654d(this.f72701b, battleConfig, list, i11, battleRequestCallback);
                }
            });
        } else if (battleRequestCallback != null) {
            battleRequestCallback.onError(TUICommonDefine.Error.INVALID_PARAMETER, "userIdList is null");
        }
    }

    public TUILiveBattleManagerImpl(long j11) {
        this.mNativeLiveBattleManagerJni = j11;
        if (j11 != 0) {
            nativeSetObserver(j11, this);
        }
    }

    private static TUILiveBattleManager.BattleInfo convertJsonToBattleInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        TUILiveBattleManager.BattleInfo battleInfo = new TUILiveBattleManager.BattleInfo();
        try {
            JSONObject jSONObject = new JSONObject(str);
            TUILiveBattleManager.BattleConfig battleConfig = new TUILiveBattleManager.BattleConfig();
            battleInfo.config = battleConfig;
            battleConfig.extensionInfo = jSONObject.getString("extensionInfo");
            battleInfo.config.needResponse = jSONObject.getBoolean("needResponse");
            battleInfo.config.duration = jSONObject.getInt(TypedValues.TransitionType.S_DURATION);
            battleInfo.battleId = jSONObject.getString("battleId");
            battleInfo.startTime = jSONObject.getInt("startTime");
            battleInfo.endTime = jSONObject.getInt("endTime");
            battleInfo.inviter = convertJsonToBattleUser(jSONObject.getString("fromUser"));
            battleInfo.inviteeList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("toUserList");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                TUILiveBattleManager.BattleUser battleUserConvertJsonToBattleUser = convertJsonToBattleUser(jSONArray.getString(i11));
                if (battleUserConvertJsonToBattleUser != null) {
                    battleInfo.inviteeList.add(battleUserConvertJsonToBattleUser);
                }
            }
            return battleInfo;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
            return null;
        }
    }

    @CalledByNative
    private void onBattleEnded(String str, int i11) {
        List<TUILiveBattleManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            TUILiveBattleManager.BattleInfo battleInfoConvertJsonToBattleInfo = convertJsonToBattleInfo(str);
            Iterator<TUILiveBattleManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onBattleEnded(battleInfoConvertJsonToBattleInfo, TUILiveBattleManager.BattleStoppedReason.fromInt(i11));
            }
        }
    }

    @CalledByNative
    private void onBattleRequestAccept(String str, String str2, String str3) {
        List<TUILiveBattleManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            TUILiveBattleManager.BattleInfo battleInfoConvertJsonToBattleInfo = convertJsonToBattleInfo(str);
            TUILiveBattleManager.BattleUser battleUserConvertJsonToBattleUser = convertJsonToBattleUser(str2);
            TUILiveBattleManager.BattleUser battleUserConvertJsonToBattleUser2 = convertJsonToBattleUser(str3);
            Iterator<TUILiveBattleManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onBattleRequestAccept(battleInfoConvertJsonToBattleInfo, battleUserConvertJsonToBattleUser, battleUserConvertJsonToBattleUser2);
            }
        }
    }

    @CalledByNative
    private void onBattleRequestCancelled(String str, String str2, String str3) {
        List<TUILiveBattleManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            TUILiveBattleManager.BattleInfo battleInfoConvertJsonToBattleInfo = convertJsonToBattleInfo(str);
            TUILiveBattleManager.BattleUser battleUserConvertJsonToBattleUser = convertJsonToBattleUser(str2);
            TUILiveBattleManager.BattleUser battleUserConvertJsonToBattleUser2 = convertJsonToBattleUser(str3);
            Iterator<TUILiveBattleManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onBattleRequestCancelled(battleInfoConvertJsonToBattleInfo, battleUserConvertJsonToBattleUser, battleUserConvertJsonToBattleUser2);
            }
        }
    }

    @CalledByNative
    private void onBattleRequestReceived(String str, String str2, String str3) {
        List<TUILiveBattleManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            TUILiveBattleManager.BattleInfo battleInfoConvertJsonToBattleInfo = convertJsonToBattleInfo(str);
            TUILiveBattleManager.BattleUser battleUserConvertJsonToBattleUser = convertJsonToBattleUser(str2);
            TUILiveBattleManager.BattleUser battleUserConvertJsonToBattleUser2 = convertJsonToBattleUser(str3);
            Iterator<TUILiveBattleManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onBattleRequestReceived(battleInfoConvertJsonToBattleInfo, battleUserConvertJsonToBattleUser, battleUserConvertJsonToBattleUser2);
            }
        }
    }

    @CalledByNative
    private void onBattleRequestReject(String str, String str2, String str3) {
        List<TUILiveBattleManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            TUILiveBattleManager.BattleInfo battleInfoConvertJsonToBattleInfo = convertJsonToBattleInfo(str);
            TUILiveBattleManager.BattleUser battleUserConvertJsonToBattleUser = convertJsonToBattleUser(str2);
            TUILiveBattleManager.BattleUser battleUserConvertJsonToBattleUser2 = convertJsonToBattleUser(str3);
            Iterator<TUILiveBattleManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onBattleRequestReject(battleInfoConvertJsonToBattleInfo, battleUserConvertJsonToBattleUser, battleUserConvertJsonToBattleUser2);
            }
        }
    }

    @CalledByNative
    private void onBattleRequestTimeout(String str, String str2, String str3) {
        List<TUILiveBattleManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            TUILiveBattleManager.BattleInfo battleInfoConvertJsonToBattleInfo = convertJsonToBattleInfo(str);
            TUILiveBattleManager.BattleUser battleUserConvertJsonToBattleUser = convertJsonToBattleUser(str2);
            TUILiveBattleManager.BattleUser battleUserConvertJsonToBattleUser2 = convertJsonToBattleUser(str3);
            Iterator<TUILiveBattleManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onBattleRequestTimeout(battleInfoConvertJsonToBattleInfo, battleUserConvertJsonToBattleUser, battleUserConvertJsonToBattleUser2);
            }
        }
    }

    @CalledByNative
    private void onBattleScoreChanged(String str, String str2) {
        List<TUILiveBattleManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            List<TUILiveBattleManager.BattleUser> listConvertJsonToBattleUserList = convertJsonToBattleUserList(str2);
            Iterator<TUILiveBattleManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onBattleScoreChanged(str, listConvertJsonToBattleUserList);
            }
        }
    }

    @CalledByNative
    private void onBattleStarted(String str) {
        List<TUILiveBattleManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            TUILiveBattleManager.BattleInfo battleInfoConvertJsonToBattleInfo = convertJsonToBattleInfo(str);
            Iterator<TUILiveBattleManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onBattleStarted(battleInfoConvertJsonToBattleInfo);
            }
        }
    }

    @CalledByNative
    private void onUserExitBattle(String str, String str2) {
        List<TUILiveBattleManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            TUILiveBattleManager.BattleUser battleUserConvertJsonToBattleUser = convertJsonToBattleUser(str2);
            Iterator<TUILiveBattleManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onUserExitBattle(str, battleUserConvertJsonToBattleUser);
            }
        }
    }

    @CalledByNative
    private void onUserJoinBattle(String str, String str2) {
        List<TUILiveBattleManager.Observer> listCopyOnReadListeners = copyOnReadListeners();
        if (!listCopyOnReadListeners.isEmpty()) {
            TUILiveBattleManager.BattleUser battleUserConvertJsonToBattleUser = convertJsonToBattleUser(str2);
            Iterator<TUILiveBattleManager.Observer> it = listCopyOnReadListeners.iterator();
            while (it.hasNext()) {
                it.next().onUserJoinBattle(str, battleUserConvertJsonToBattleUser);
            }
        }
    }

    private static TUILiveBattleManager.BattleUser convertJsonToBattleUser(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        TUILiveBattleManager.BattleUser battleUser = new TUILiveBattleManager.BattleUser();
        try {
            battleUser.userId = jSONObject.getString("userId");
            battleUser.userName = jSONObject.getString(TUIConstantDefine.USER_NAME);
            battleUser.avatarUrl = jSONObject.getString(TUIConstantDefine.AVATAR_URL);
            battleUser.roomId = jSONObject.getString("roomId");
            battleUser.score = jSONObject.getInt(FirebaseAnalytics.Param.SCORE);
            return battleUser;
        } catch (JSONException e11) {
            LiteavLog.m76083e(TAG, e11.getLocalizedMessage());
            return null;
        }
    }
}
