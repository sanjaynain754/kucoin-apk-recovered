package com.tencent.qcloud.tuicore;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.imsdk.p128v2.V2TIMCallback;
import com.tencent.imsdk.p128v2.V2TIMLogListener;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMSDKConfig;
import com.tencent.imsdk.p128v2.V2TIMSDKListener;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import com.tencent.qcloud.tuicore.interfaces.TUICallback;
import com.tencent.qcloud.tuicore.interfaces.TUILogListener;
import com.tencent.qcloud.tuicore.interfaces.TUILoginConfig;
import com.tencent.qcloud.tuicore.interfaces.TUILoginListener;
import com.tencent.qcloud.tuicore.util.ErrorMessageConverter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes56.dex */
public class TUILogin {
    private static final String TAG = "TUILogin";
    private static Context appContext;
    private int currentBusinessScene;
    private boolean hasLoginSuccess;
    private final V2TIMSDKListener imSdkListener;
    private final List<TUILoginListener> listenerList;
    private int sdkAppId;
    private String userId;
    private String userSig;

    public static class TUIBusinessScene {
        public static final int IN_CALLING_ROOM = 2;
        public static final int IN_LIVING_ROOM = 4;
        public static final int IN_MEETING_ROOM = 3;
        public static final int IN_RECORDING = 1;
        public static final int NONE = 0;
    }

    public static class TUILoginHolder {
        private static final TUILogin loginInstance = new TUILogin();

        private TUILoginHolder() {
        }
    }

    public static void init(Context context) {
        appContext = context.getApplicationContext();
    }

    public static void login(@NonNull Context context, int i11, String str, String str2, TUICallback tUICallback) {
        getInstance().internalLogin(context, i11, str, str2, null, tUICallback);
    }

    public static void logout(TUICallback tUICallback) {
        getInstance().internalLogout(tUICallback);
    }

    private TUILogin() {
        this.sdkAppId = 0;
        this.hasLoginSuccess = false;
        this.currentBusinessScene = 0;
        this.listenerList = new CopyOnWriteArrayList();
        this.imSdkListener = new V2TIMSDKListener() { // from class: com.tencent.qcloud.tuicore.TUILogin.1
            @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
            public void onConnectFailed(int i11, String str) {
                Iterator it = TUILogin.this.listenerList.iterator();
                while (it.hasNext()) {
                    ((TUILoginListener) it.next()).onConnectFailed(i11, str);
                }
                TUICore.notifyEvent(TUIConstants.NetworkConnection.EVENT_CONNECTION_STATE_CHANGED, TUIConstants.NetworkConnection.EVENT_SUB_KEY_CONNECT_FAILED, null);
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
            public void onConnectSuccess() {
                Iterator it = TUILogin.this.listenerList.iterator();
                while (it.hasNext()) {
                    ((TUILoginListener) it.next()).onConnectSuccess();
                }
                TUICore.notifyEvent(TUIConstants.NetworkConnection.EVENT_CONNECTION_STATE_CHANGED, TUIConstants.NetworkConnection.EVENT_SUB_KEY_CONNECT_SUCCESS, null);
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
            public void onConnecting() {
                Iterator it = TUILogin.this.listenerList.iterator();
                while (it.hasNext()) {
                    ((TUILoginListener) it.next()).onConnecting();
                }
                TUICore.notifyEvent(TUIConstants.NetworkConnection.EVENT_CONNECTION_STATE_CHANGED, TUIConstants.NetworkConnection.EVENT_SUB_KEY_CONNECTING, null);
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
            public void onKickedOffline() {
                Iterator it = TUILogin.this.listenerList.iterator();
                while (it.hasNext()) {
                    ((TUILoginListener) it.next()).onKickedOffline();
                }
                TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_KICKED_OFFLINE, null);
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
            public void onUserSigExpired() {
                Iterator it = TUILogin.this.listenerList.iterator();
                while (it.hasNext()) {
                    ((TUILoginListener) it.next()).onUserSigExpired();
                }
                TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_SIG_EXPIRED, null);
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
            public void onSelfInfoUpdated(V2TIMUserFullInfo v2TIMUserFullInfo) {
                TUIConfig.setSelfInfo(v2TIMUserFullInfo);
                TUILogin.notifyUserInfoChanged(v2TIMUserFullInfo);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getUserInfo(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        V2TIMManager.getInstance().getUsersInfo(arrayList, new V2TIMValueCallback<List<V2TIMUserFullInfo>>() { // from class: com.tencent.qcloud.tuicore.TUILogin.10
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(List<V2TIMUserFullInfo> list) {
                if (list.isEmpty()) {
                    Log.e(TUILogin.TAG, "get logined userInfo failed. list is empty");
                    return;
                }
                V2TIMUserFullInfo v2TIMUserFullInfo = list.get(0);
                TUIConfig.setSelfInfo(v2TIMUserFullInfo);
                TUILogin.notifyUserInfoChanged(v2TIMUserFullInfo);
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i11, String str2) {
                Log.e(TUILogin.TAG, "get logined userInfo failed. code : " + i11 + " desc : " + ErrorMessageConverter.convertIMError(i11, str2));
            }
        });
    }

    @Deprecated
    public static boolean init(@NonNull Context context, int i11, @Nullable V2TIMSDKConfig v2TIMSDKConfig, @Nullable final V2TIMSDKListener v2TIMSDKListener) {
        if (getInstance().sdkAppId != 0 && i11 != getInstance().sdkAppId) {
            logout((V2TIMCallback) null);
            unInit();
        }
        getInstance();
        appContext = context.getApplicationContext();
        getInstance().sdkAppId = i11;
        V2TIMManager.getInstance().addIMSDKListener(new V2TIMSDKListener() { // from class: com.tencent.qcloud.tuicore.TUILogin.9
            @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
            public void onConnectFailed(int i12, String str) {
                V2TIMSDKListener v2TIMSDKListener2 = v2TIMSDKListener;
                if (v2TIMSDKListener2 != null) {
                    v2TIMSDKListener2.onConnectFailed(i12, ErrorMessageConverter.convertIMError(i12, str));
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
            public void onConnectSuccess() {
                V2TIMSDKListener v2TIMSDKListener2 = v2TIMSDKListener;
                if (v2TIMSDKListener2 != null) {
                    v2TIMSDKListener2.onConnectSuccess();
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
            public void onConnecting() {
                V2TIMSDKListener v2TIMSDKListener2 = v2TIMSDKListener;
                if (v2TIMSDKListener2 != null) {
                    v2TIMSDKListener2.onConnecting();
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
            public void onKickedOffline() {
                V2TIMSDKListener v2TIMSDKListener2 = v2TIMSDKListener;
                if (v2TIMSDKListener2 != null) {
                    v2TIMSDKListener2.onKickedOffline();
                }
                TUILogin.setCurrentBusinessScene(0);
                TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_KICKED_OFFLINE, null);
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
            public void onSelfInfoUpdated(V2TIMUserFullInfo v2TIMUserFullInfo) {
                V2TIMSDKListener v2TIMSDKListener2 = v2TIMSDKListener;
                if (v2TIMSDKListener2 != null) {
                    v2TIMSDKListener2.onSelfInfoUpdated(v2TIMUserFullInfo);
                }
                TUIConfig.setSelfInfo(v2TIMUserFullInfo);
                TUILogin.notifyUserInfoChanged(v2TIMUserFullInfo);
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
            public void onUserSigExpired() {
                V2TIMSDKListener v2TIMSDKListener2 = v2TIMSDKListener;
                if (v2TIMSDKListener2 != null) {
                    v2TIMSDKListener2.onUserSigExpired();
                }
                TUILogin.setCurrentBusinessScene(0);
                TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_SIG_EXPIRED, null);
            }
        });
        boolean zInitSDK = V2TIMManager.getInstance().initSDK(context, i11, v2TIMSDKConfig);
        TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_IMSDK_INIT_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_START_INIT, null);
        return zInitSDK;
    }

    private void internalAddLoginListener(TUILoginListener tUILoginListener) {
        Log.i(TAG, "addLoginListener listener : " + tUILoginListener);
        if (tUILoginListener == null || this.listenerList.contains(tUILoginListener)) {
            return;
        }
        this.listenerList.add(tUILoginListener);
    }

    private void internalLogin(Context context, int i11, final String str, final String str2, final TUILoginConfig tUILoginConfig, final TUICallback tUICallback) {
        V2TIMSDKConfig v2TIMSDKConfig;
        String str3 = TAG;
        Log.i(str3, "internalLogin");
        int i12 = this.sdkAppId;
        if (i12 != 0 && i11 != i12) {
            logout((TUICallback) null);
        }
        appContext = context.getApplicationContext();
        this.sdkAppId = i11;
        this.currentBusinessScene = 0;
        V2TIMManager.getInstance().addIMSDKListener(this.imSdkListener);
        TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_IMSDK_INIT_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_START_INIT, null);
        if (tUILoginConfig != null) {
            v2TIMSDKConfig = new V2TIMSDKConfig();
            v2TIMSDKConfig.setLogLevel(tUILoginConfig.getLogLevel());
            final TUILogListener logListener = tUILoginConfig.getLogListener();
            if (logListener != null) {
                v2TIMSDKConfig.setLogListener(new V2TIMLogListener() { // from class: com.tencent.qcloud.tuicore.TUILogin.4
                    @Override // com.tencent.imsdk.p128v2.V2TIMLogListener
                    public void onLog(int i13, String str4) {
                        logListener.onLog(i13, str4);
                    }
                });
            }
        } else {
            v2TIMSDKConfig = null;
        }
        if (!V2TIMManager.getInstance().initSDK(context, i11, v2TIMSDKConfig)) {
            Log.i(str3, "internalLogin initSDK failed");
            TUICallback.onError(tUICallback, -1, "init failed");
        } else {
            this.userId = str;
            this.userSig = str2;
            TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_IMSDK_INIT_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_INIT_SUCCESS, null);
            V2TIMManager.getInstance().callExperimentalAPI("getLoginAccountType", null, new V2TIMValueCallback<Object>() { // from class: com.tencent.qcloud.tuicore.TUILogin.5
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(Object obj) {
                    TUILogin.this.internalLoginImpl(((Integer) obj).intValue(), str, str2, tUILoginConfig, tUICallback);
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i13, String str4) {
                    Log.e(TUILogin.TAG, "getLoginAccountType error:" + i13 + ", desc:" + str4);
                    TUILogin.this.internalLoginImpl(0, str, str2, tUILoginConfig, tUICallback);
                }
            });
        }
    }

    private void internalLogout(final TUICallback tUICallback) {
        Log.i(TAG, "internalLogout");
        this.currentBusinessScene = 0;
        TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_IMSDK_INIT_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_START_UNINIT, null);
        V2TIMManager.getInstance().logout(new V2TIMCallback() { // from class: com.tencent.qcloud.tuicore.TUILogin.8
            @Override // com.tencent.imsdk.p128v2.V2TIMCallback
            public void onError(int i11, String str) {
                Log.i(TUILogin.TAG, "internalLogout onError code=" + i11 + " desc=" + str);
                TUICallback.onError(tUICallback, i11, str);
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMCallback
            public void onSuccess() {
                Log.i(TUILogin.TAG, "internalLogout onSuccess");
                TUILogin.this.sdkAppId = 0;
                TUILogin.this.userId = null;
                TUILogin.this.userSig = null;
                V2TIMManager.getInstance().unInitSDK();
                TUIConfig.clearSelfInfo();
                TUICallback.onSuccess(tUICallback);
                TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_LOGOUT_SUCCESS, null);
            }
        });
    }

    private void internalRemoveLoginListener(TUILoginListener tUILoginListener) {
        Log.i(TAG, "removeLoginListener listener : " + tUILoginListener);
        if (tUILoginListener == null) {
            return;
        }
        this.listenerList.remove(tUILoginListener);
    }

    public static void login(@NonNull Context context, int i11, String str, String str2, TUILoginConfig tUILoginConfig, TUICallback tUICallback) {
        getInstance().internalLogin(context, i11, str, str2, tUILoginConfig, tUICallback);
    }

    @Deprecated
    public static void logout(@Nullable final V2TIMCallback v2TIMCallback) {
        V2TIMManager.getInstance().logout(new V2TIMCallback() { // from class: com.tencent.qcloud.tuicore.TUILogin.3
            @Override // com.tencent.imsdk.p128v2.V2TIMCallback
            public void onError(int i11, String str) {
                V2TIMCallback v2TIMCallback2 = v2TIMCallback;
                if (v2TIMCallback2 != null) {
                    v2TIMCallback2.onError(i11, ErrorMessageConverter.convertIMError(i11, str));
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMCallback
            public void onSuccess() {
                TUILogin.getInstance().userId = null;
                TUILogin.getInstance().userSig = null;
                V2TIMCallback v2TIMCallback2 = v2TIMCallback;
                if (v2TIMCallback2 != null) {
                    v2TIMCallback2.onSuccess();
                }
                TUIConfig.clearSelfInfo();
                TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_LOGOUT_SUCCESS, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyUserInfoChanged(V2TIMUserFullInfo v2TIMUserFullInfo) {
        HashMap map = new HashMap();
        map.put(TUIConstants.TUILogin.SELF_ID, v2TIMUserFullInfo.getUserID());
        map.put(TUIConstants.TUILogin.SELF_SIGNATURE, v2TIMUserFullInfo.getSelfSignature());
        map.put(TUIConstants.TUILogin.SELF_NICK_NAME, v2TIMUserFullInfo.getNickName());
        map.put(TUIConstants.TUILogin.SELF_FACE_URL, v2TIMUserFullInfo.getFaceUrl());
        map.put(TUIConstants.TUILogin.SELF_BIRTHDAY, Long.valueOf(v2TIMUserFullInfo.getBirthday()));
        map.put(TUIConstants.TUILogin.SELF_ROLE, Integer.valueOf(v2TIMUserFullInfo.getRole()));
        map.put(TUIConstants.TUILogin.SELF_GENDER, Integer.valueOf(v2TIMUserFullInfo.getGender()));
        map.put(TUIConstants.TUILogin.SELF_LEVEL, Integer.valueOf(v2TIMUserFullInfo.getLevel()));
        map.put(TUIConstants.TUILogin.SELF_ALLOW_TYPE, Integer.valueOf(v2TIMUserFullInfo.getAllowType()));
        TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_INFO_UPDATED, map);
    }

    public static void addLoginListener(TUILoginListener tUILoginListener) {
        getInstance().internalAddLoginListener(tUILoginListener);
    }

    public static Context getAppContext() {
        getInstance();
        return appContext;
    }

    public static int getCurrentBusinessScene() {
        return getInstance().currentBusinessScene;
    }

    public static String getFaceUrl() {
        return TUIConfig.getSelfFaceUrl();
    }

    public static TUILogin getInstance() {
        return TUILoginHolder.loginInstance;
    }

    public static String getLoginUser() {
        if (!TextUtils.isEmpty(V2TIMManager.getInstance().getLoginUser())) {
            return V2TIMManager.getInstance().getLoginUser();
        }
        return getInstance().userId;
    }

    public static String getNickName() {
        return TUIConfig.getSelfNickName();
    }

    public static int getSdkAppId() {
        return getInstance().sdkAppId;
    }

    public static String getUserId() {
        return getInstance().userId;
    }

    public static String getUserSig() {
        return getInstance().userSig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalLoginImpl(int i11, final String str, String str2, TUILoginConfig tUILoginConfig, final TUICallback tUICallback) {
        if (TextUtils.equals(str, V2TIMManager.getInstance().getLoginUser()) && !TextUtils.isEmpty(str) && i11 == 1) {
            Log.i(TAG, "internalLogin already login");
            this.hasLoginSuccess = true;
            getUserInfo(str);
            TUICallback.onSuccess(tUICallback);
            TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_LOGIN_SUCCESS, null);
            return;
        }
        if (tUILoginConfig != null && tUILoginConfig.isInitLocalStorageOnly()) {
            V2TIMManager.getInstance().callExperimentalAPI("initLocalStorage", str, new V2TIMValueCallback<Object>() { // from class: com.tencent.qcloud.tuicore.TUILogin.6
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(Object obj) {
                    TUILogin.getUserInfo(str);
                    TUICallback.onSuccess(tUICallback);
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i12, String str3) {
                    Log.e(TUILogin.TAG, "initLocalStorage error:" + i12 + ", desc:" + str3);
                    TUICallback.onError(tUICallback, i12, ErrorMessageConverter.convertIMError(i12, str3));
                }
            });
        } else {
            V2TIMManager.getInstance().login(str, str2, new V2TIMCallback() { // from class: com.tencent.qcloud.tuicore.TUILogin.7
                @Override // com.tencent.imsdk.p128v2.V2TIMCallback
                public void onError(int i12, String str3) {
                    Log.i(TUILogin.TAG, "internalLogin login onError code=" + i12 + " desc=" + str3);
                    TUICallback.onError(tUICallback, i12, ErrorMessageConverter.convertIMError(i12, str3));
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMCallback
                public void onSuccess() {
                    Log.i(TUILogin.TAG, "internalLogin login onSuccess");
                    TUILogin.this.hasLoginSuccess = true;
                    TUILogin.getUserInfo(str);
                    TUICallback.onSuccess(tUICallback);
                    TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_LOGIN_SUCCESS, null);
                }
            });
        }
    }

    public static boolean isUserLogined() {
        if (getInstance().hasLoginSuccess && V2TIMManager.getInstance().getLoginStatus() == 1) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static void login(@NonNull final String str, @NonNull String str2, @Nullable final V2TIMCallback v2TIMCallback) {
        getInstance().userId = str;
        getInstance().userSig = str2;
        if (TextUtils.equals(str, V2TIMManager.getInstance().getLoginUser()) && !TextUtils.isEmpty(str)) {
            if (v2TIMCallback != null) {
                v2TIMCallback.onSuccess();
            }
            getUserInfo(str);
            return;
        }
        V2TIMManager.getInstance().login(str, str2, new V2TIMCallback() { // from class: com.tencent.qcloud.tuicore.TUILogin.2
            @Override // com.tencent.imsdk.p128v2.V2TIMCallback
            public void onError(int i11, String str3) {
                V2TIMCallback v2TIMCallback2 = v2TIMCallback;
                if (v2TIMCallback2 != null) {
                    v2TIMCallback2.onError(i11, ErrorMessageConverter.convertIMError(i11, str3));
                }
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMCallback
            public void onSuccess() {
                TUILogin.getInstance().hasLoginSuccess = true;
                V2TIMCallback v2TIMCallback2 = v2TIMCallback;
                if (v2TIMCallback2 != null) {
                    v2TIMCallback2.onSuccess();
                }
                TUILogin.getUserInfo(str);
                TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_LOGIN_SUCCESS, null);
            }
        });
    }

    public static void removeLoginListener(TUILoginListener tUILoginListener) {
        getInstance().internalRemoveLoginListener(tUILoginListener);
    }

    public static void setCurrentBusinessScene(int i11) {
        getInstance().currentBusinessScene = i11;
    }

    @Deprecated
    public static void unInit() {
        getInstance().sdkAppId = 0;
        TUICore.notifyEvent(TUIConstants.TUILogin.EVENT_IMSDK_INIT_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_START_UNINIT, null);
        V2TIMManager.getInstance().unInitSDK();
        TUIConfig.clearSelfInfo();
    }
}
