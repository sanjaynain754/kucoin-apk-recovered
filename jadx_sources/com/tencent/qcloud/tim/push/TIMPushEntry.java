package com.tencent.qcloud.tim.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.imsdk.offlinepush.OfflinePushEventItem;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.qcloud.tim.push.config.TIMPushConfig;
import com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl;
import com.tencent.qcloud.tim.push.utils.TIMPushLog;
import com.tencent.qcloud.tuicore.ServiceInitializer;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.interfaces.ITUINotification;
import com.tencent.qcloud.tuicore.interfaces.ITUIService;
import com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public class TIMPushEntry extends ServiceInitializer implements ITUINotification, ITUIService {
    public static final String TAG = "TIMPushEntry";
    public static Context mAppContext;
    private static TIMPushEntry mInstance;
    public String mUserId;

    @Override // com.tencent.qcloud.tuicore.interfaces.ITUIService
    public Object onCall(String str, Map<String, Object> map, final TUIServiceCallback tUIServiceCallback) {
        Context context;
        String str2 = TAG;
        TIMPushLog.m77016d(str2, "onCall method callback = " + str);
        if (TextUtils.equals(TUIConstants.TIMPush.METHOD_REGISTER_PUSH, str)) {
            if (map == null) {
                TIMPushLog.m77017e(str2, "METHOD_REGISTER_PUSH param is null");
                context = null;
            } else {
                context = (Context) map.get("context");
            }
            TIMPushManager.getInstance().registerPush(context, 0, "", new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.TIMPushEntry.3
                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onError(int i11, String str3, Object obj) {
                    TUIServiceCallback tUIServiceCallback2 = tUIServiceCallback;
                    if (tUIServiceCallback2 != null) {
                        tUIServiceCallback2.onServiceCallback(i11, str3, null);
                    }
                }

                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onSuccess(Object obj) {
                    if (tUIServiceCallback != null) {
                        String str3 = obj instanceof String ? (String) obj : null;
                        Bundle bundle = new Bundle();
                        bundle.putString(InterfaceC33826o0.f71244p, str3);
                        tUIServiceCallback.onServiceCallback(0, "", bundle);
                    }
                }
            });
        } else if (TextUtils.equals(TUIConstants.TIMPush.METHOD_DO_BACKGROUND, str)) {
            TIMPushManagerImpl.m76884c().m76894a(map != null ? ((Integer) map.get(TUIConstants.TIMPush.APP_UNREAD_COUNT_KEY)).intValue() : 0, new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.TIMPushEntry.4
                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onError(int i11, String str3, Object obj) {
                    TUIServiceCallback tUIServiceCallback2 = tUIServiceCallback;
                    if (tUIServiceCallback2 != null) {
                        tUIServiceCallback2.onServiceCallback(i11, str3, new Bundle());
                    }
                }

                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onSuccess(Object obj) {
                    TUIServiceCallback tUIServiceCallback2 = tUIServiceCallback;
                    if (tUIServiceCallback2 != null) {
                        tUIServiceCallback2.onServiceCallback(0, "", new Bundle());
                    }
                }
            });
        } else if (TextUtils.equals(TUIConstants.TIMPush.METHOD_DO_FOREGROUND, str)) {
            TIMPushManagerImpl.m76884c().m76900a(new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.TIMPushEntry.5
                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onError(int i11, String str3, Object obj) {
                    TUIServiceCallback tUIServiceCallback2 = tUIServiceCallback;
                    if (tUIServiceCallback2 != null) {
                        tUIServiceCallback2.onServiceCallback(i11, str3, new Bundle());
                    }
                }

                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onSuccess(Object obj) {
                    TUIServiceCallback tUIServiceCallback2 = tUIServiceCallback;
                    if (tUIServiceCallback2 != null) {
                        tUIServiceCallback2.onServiceCallback(0, "", new Bundle());
                    }
                }
            });
        } else if (TextUtils.equals("reportPushMessageData", str)) {
            if (map == null) {
                TIMPushLog.m77017e(str2, "param is null");
                if (tUIServiceCallback != null) {
                    tUIServiceCallback.onServiceCallback(TIMPushConstants.ERR_INVALID_PARAM, "param is null", null);
                }
                return null;
            }
            String str3 = (String) map.get("url");
            String str4 = (String) map.get("pushId");
            long jLongValue = ((Long) map.get("time")).longValue();
            int iIntValue = ((Integer) map.get("type")).intValue();
            TIMPushLog.m77016d(str2, "url:" + str3 + ", pushID:" + str4 + ", type:" + iIntValue + ", time:" + jLongValue);
            TIMPushManagerImpl.m76884c().m76903a(str3, str4, iIntValue, jLongValue, new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.TIMPushEntry.6
                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onError(int i11, String str5, Object obj) {
                    TUIServiceCallback tUIServiceCallback2 = tUIServiceCallback;
                    if (tUIServiceCallback2 != null) {
                        tUIServiceCallback2.onServiceCallback(i11, str5, null);
                    }
                }

                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onSuccess(Object obj) {
                    TUIServiceCallback tUIServiceCallback2 = tUIServiceCallback;
                    if (tUIServiceCallback2 != null) {
                        tUIServiceCallback2.onServiceCallback(0, "", null);
                    }
                }
            });
        } else if (TextUtils.equals("callPushMethod", str)) {
            if (map == null) {
                TIMPushLog.m77017e(str2, "param is null");
                if (tUIServiceCallback != null) {
                    tUIServiceCallback.onServiceCallback(TIMPushConstants.ERR_INVALID_PARAM, "param is null", null);
                }
                return null;
            }
            if (TextUtils.equals("disableRequestPostNotificationPermission", (String) map.get("callPushSubMethod"))) {
                TIMPushConfig.getInstance().enableRequestPostNotificationPermission(!((Boolean) map.get("disable")).booleanValue());
                if (tUIServiceCallback != null) {
                    tUIServiceCallback.onServiceCallback(0, "", null);
                }
            }
        }
        return null;
    }

    public static TIMPushEntry getInstance() {
        return mInstance;
    }

    private void initListener() {
        TUICore.registerService("TIMPushService", this);
        TUICore.registerEvent(TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_KICKED_OFFLINE, this);
        TUICore.registerEvent(TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_SIG_EXPIRED, this);
        TUICore.registerEvent(TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_LOGIN_SUCCESS, this);
        TUICore.registerEvent(TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED, TUIConstants.TUILogin.EVENT_SUB_KEY_USER_LOGOUT_SUCCESS, this);
    }

    public Context getApplicationContext() {
        if (mAppContext == null) {
            TIMPushLog.m77016d(TAG, "appContext is null");
            if (getContext() != null) {
                mAppContext = getContext().getApplicationContext();
            }
        }
        return mAppContext;
    }

    @Override // com.tencent.qcloud.tuicore.ServiceInitializer
    public void init(Context context) {
        TIMPushLog.m77016d(TAG, "init");
        mInstance = this;
        mAppContext = context;
        this.mUserId = V2TIMManager.getInstance().getLoginUser();
        TIMPushManagerImpl.m76884c().m76911b(mAppContext);
        initListener();
    }

    @Override // com.tencent.qcloud.tuicore.interfaces.ITUINotification
    public void onNotifyEvent(String str, String str2, Map<String, Object> map) {
        TIMPushLog.m77016d(TAG, "onNotifyEvent key = " + str + "subKey = " + str2);
        if (TUIConstants.TUILogin.EVENT_LOGIN_STATE_CHANGED.equals(str) && TIMPushConfig.getInstance().getAutoRegisterPush()) {
            if (TUIConstants.TUILogin.EVENT_SUB_KEY_USER_KICKED_OFFLINE.equals(str2) || TUIConstants.TUILogin.EVENT_SUB_KEY_USER_SIG_EXPIRED.equals(str2) || TUIConstants.TUILogin.EVENT_SUB_KEY_USER_LOGOUT_SUCCESS.equals(str2)) {
                TIMPushManager.getInstance().unRegisterPush(new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.TIMPushEntry.1
                });
            } else if (TUIConstants.TUILogin.EVENT_SUB_KEY_USER_LOGIN_SUCCESS.equals(str2)) {
                if (mAppContext == null) {
                    mAppContext = getContext().getApplicationContext();
                }
                TIMPushManager.getInstance().registerPush(mAppContext, 0, "", new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.TIMPushEntry.2
                });
            }
        }
    }

    @Override // com.tencent.qcloud.tuicore.interfaces.ITUIService
    public Object onCall(String str, Map<String, Object> map) {
        String str2 = TAG;
        TIMPushLog.m77016d(str2, "onCall method = " + str);
        if (TextUtils.equals(TUIConstants.TIMPush.METHOD_XIAOMI_CLICK_INTENT, str)) {
            if (map == null) {
                TIMPushLog.m77017e(str2, "METHOD_XIAOMI_CLICK_INTENT param is null");
                return null;
            }
            TIMPushManagerImpl.m76884c().m76899a((Intent) map.get(TUIConstants.TIMPush.XIAOMI_CLICK_INTENT_KEY), getApplicationContext());
        } else if (TextUtils.equals(TUIConstants.TIMPush.METHOD_SET_PUSH_MESSAGE_DATA, str)) {
            if (map == null) {
                TIMPushLog.m77017e(str2, "METHOD_SET_PUSH_MESSAGE_DATA param is null");
                return null;
            }
            TIMPushManagerImpl.m76884c().m76906a((Map<String, String>) map.get(TUIConstants.TIMPush.PUSH_MESSAGE_DATA_KEY));
        } else if (TextUtils.equals(TUIConstants.TIMPush.METHOD_REPORT_NOTIFICATION_CLICKED, str)) {
            if (map == null) {
                TIMPushLog.m77017e(str2, "METHOD_CALL_NOTIFICATION_CLICKED param is null");
                return null;
            }
            ArrayList arrayList = new ArrayList();
            OfflinePushEventItem offlinePushEventItem = new OfflinePushEventItem();
            try {
                offlinePushEventItem.setPushId((String) map.get("clickExt"));
                offlinePushEventItem.setEventTime(((Long) map.get(TUIConstants.TIMPush.NOTIFICATION.PUSH_EVENT_TIME_KEY)).longValue());
                offlinePushEventItem.setEventType(((Integer) map.get(TUIConstants.TIMPush.NOTIFICATION.PUSH_EVENT_TYPE_KEY)).intValue());
            } catch (Exception e11) {
                TIMPushLog.m77017e(TAG, "METHOD_CALL_NOTIFICATION_CLICKED e = " + e11);
            }
            arrayList.add(offlinePushEventItem);
            TIMPushManagerImpl.m76884c().m76914b(arrayList);
        }
        return null;
    }
}
