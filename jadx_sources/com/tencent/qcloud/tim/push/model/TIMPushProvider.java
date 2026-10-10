package com.tencent.qcloud.tim.push.model;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.imsdk.common.IMContext;
import com.tencent.imsdk.offlinepush.OfflinePushEventItem;
import com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener;
import com.tencent.imsdk.p128v2.V2TIMCallback;
import com.tencent.imsdk.p128v2.V2TIMConversationListener;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMMessage;
import com.tencent.imsdk.p128v2.V2TIMOfflinePushConfig;
import com.tencent.imsdk.p128v2.V2TIMOfflinePushInfo;
import com.tencent.imsdk.p128v2.V2TIMSDKConfig;
import com.tencent.imsdk.p128v2.V2TIMSDKListener;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import com.tencent.qcloud.tim.push.TIMPushCallback;
import com.tencent.qcloud.tim.push.TIMPushConstants;
import com.tencent.qcloud.tim.push.TIMPushListener;
import com.tencent.qcloud.tim.push.TIMPushMessage;
import com.tencent.qcloud.tim.push.components.ActivityLifecycleHandler;
import com.tencent.qcloud.tim.push.config.TIMPushConfig;
import com.tencent.qcloud.tim.push.interfaces.IMEventListener;
import com.tencent.qcloud.tim.push.notification.NotificationBuilder;
import com.tencent.qcloud.tim.push.utils.TIMPushLog;
import com.tencent.qcloud.tim.push.utils.TIMPushUtils;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes56.dex */
public class TIMPushProvider {

    /* JADX INFO: renamed from: a */
    public static final String f75049a = "TIMPushProvider";

    /* JADX INFO: renamed from: b */
    public static final long f75050b = 0;

    /* JADX INFO: renamed from: c */
    public static final long f75051c = 13;

    /* JADX INFO: renamed from: d */
    public static final long f75052d = 19;

    /* JADX INFO: renamed from: e */
    public static final long f75053e = 10000;

    /* JADX INFO: renamed from: f */
    public static final int f75054f = 500;

    /* JADX INFO: renamed from: g */
    public static final int f75055g = 1000;

    /* JADX INFO: renamed from: h */
    public static final int f75056h = 10;

    /* JADX INFO: renamed from: i */
    public static final int f75057i = 15;

    /* JADX INFO: renamed from: j */
    public static final int f75058j = 7009;

    /* JADX INFO: renamed from: k */
    public static final long f75059k = 500;

    /* JADX INFO: renamed from: l */
    public static final int f75060l = 1;

    /* JADX INFO: renamed from: m */
    public static final String f75061m = "foregroundShow";

    /* JADX INFO: renamed from: n */
    public static final String f75062n = "show";

    /* JADX INFO: renamed from: o */
    public static final String f75063o = "hide";

    /* JADX INFO: renamed from: p */
    public static final int f75064p = 0;

    /* JADX INFO: renamed from: q */
    public static final int f75065q = 1;

    /* JADX INFO: renamed from: r */
    public static final int f75066r = 2;

    /* JADX INFO: renamed from: s */
    public static final int f75067s = 5;

    /* JADX INFO: renamed from: t */
    public static final int f75068t = 6;

    /* JADX INFO: renamed from: C */
    public Handler f75071C;

    /* JADX INFO: renamed from: D */
    public Runnable f75072D;

    /* JADX INFO: renamed from: u */
    public V2TIMConversationListener f75075u;

    /* JADX INFO: renamed from: v */
    public V2TIMAdvancedMsgListener f75076v;

    /* JADX INFO: renamed from: w */
    public V2TIMSDKListener f75077w;

    /* JADX INFO: renamed from: x */
    public List<TIMPushListener> f75078x = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y */
    public int f75079y = 0;

    /* JADX INFO: renamed from: z */
    public String f75080z = null;

    /* JADX INFO: renamed from: A */
    public long f75069A = 0;

    /* JADX INFO: renamed from: B */
    public long f75070B = 0;

    /* JADX INFO: renamed from: E */
    public int f75073E = 0;

    /* JADX INFO: renamed from: F */
    public final V2TIMSDKListener f75074F = new V2TIMSDKListener() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.20
        @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
        public void onConnectFailed(int i11, String str) {
            TIMPushLog.m77017e(TIMPushProvider.f75049a, "onConnectFailed errCode = " + i11 + ", errMsg = " + str);
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
        public void onConnectSuccess() {
            TIMPushLog.m77016d(TIMPushProvider.f75049a, "onConnectSuccess");
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
        public void onKickedOffline() {
            TIMPushLog.m77017e(TIMPushProvider.f75049a, "onKickedOffline");
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
        public void onUserSigExpired() {
            TIMPushLog.m77017e(TIMPushProvider.f75049a, "onUserSigExpired");
        }

        @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
        public void onConnecting() {
        }
    };

    /* JADX INFO: renamed from: d */
    public void m76972d(final TIMPushCallback tIMPushCallback) {
        V2TIMManager.getInstance().logout(new V2TIMCallback() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.11
            @Override // com.tencent.imsdk.p128v2.V2TIMCallback
            public void onError(int i11, String str) {
                TIMPushUtils.m77025a(tIMPushCallback, i11, str, null);
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMCallback
            public void onSuccess() {
                TIMPushProvider.this.f75079y = 0;
                V2TIMManager.getInstance().unInitSDK();
                TIMPushUtils.m77026a(tIMPushCallback, null);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m76975e(final TIMPushCallback tIMPushCallback) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("UIComponentType", 13L);
            jSONObject.put("UIStyleType", 0L);
            V2TIMManager.getInstance().callExperimentalAPI("reportTUIComponentUsage", jSONObject.toString(), new V2TIMValueCallback<Object>() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.7
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    TIMPushLog.m77017e(TIMPushProvider.f75049a, "reportTIMPushComponentUsage err = " + i11 + ", desc = " + str);
                    TIMPushUtils.m77025a(tIMPushCallback, i11, str, null);
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(Object obj) {
                    TIMPushLog.m77018i(TIMPushProvider.f75049a, "reportTIMPushComponentUsage success");
                    TIMPushUtils.m77026a(tIMPushCallback, obj);
                }
            });
        } catch (Exception e11) {
            TIMPushLog.m77018i(f75049a, "reportTIMPushComponentUsage exception = " + e11);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m76977f(final TIMPushCallback tIMPushCallback) {
        TIMPushLog.m77016d(f75049a, "unRegisterPush");
        V2TIMManager.getOfflinePushManager().setOfflinePushConfig(null, new V2TIMCallback() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.3
            @Override // com.tencent.imsdk.p128v2.V2TIMCallback
            public void onError(int i11, String str) {
                TIMPushLog.m77017e(TIMPushProvider.f75049a, "unRegisterPush err code = " + i11 + " desc = " + str);
                TIMPushUtils.m77025a(tIMPushCallback, i11, str, null);
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMCallback
            public void onSuccess() {
                TIMPushLog.m77016d(TIMPushProvider.f75049a, "unRegisterPush success");
                TIMPushUtils.m77026a(tIMPushCallback, null);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m76978g() {
        Runnable runnable;
        this.f75073E = 0;
        long j11 = this.f75070B - this.f75069A;
        TIMPushLog.m77016d(f75049a, "notifyNotificationClicked launchingTime:" + j11);
        Handler handler = this.f75071C;
        if (handler != null && (runnable = this.f75072D) != null) {
            handler.removeCallbacks(runnable);
        }
        if (j11 > 10000) {
            m76974e();
            return;
        }
        this.f75071C = new Handler(Looper.getMainLooper());
        Runnable runnable2 = new Runnable() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.15
            @Override // java.lang.Runnable
            public void run() {
                if (TIMPushProvider.this.f75073E < 10) {
                    TIMPushProvider.this.m76948a(500L);
                } else {
                    if (TIMPushProvider.this.f75073E < 15) {
                        TIMPushProvider.this.m76948a(1000L);
                        return;
                    }
                    TIMPushLog.m77016d(TIMPushProvider.f75049a, "exceed MAX_NOTIFY_NOTIFICATION_COUNT");
                    TIMPushProvider.this.f75080z = null;
                    TIMPushProvider.this.f75071C.removeCallbacks(this);
                }
            }
        };
        this.f75072D = runnable2;
        this.f75071C.postDelayed(runnable2, 0L);
    }

    /* JADX INFO: renamed from: c */
    public void m76969c() {
        this.f75077w = new V2TIMSDKListener() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.1
            @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
            public void onExperimentalNotify(String str, Object obj) {
                if (TextUtils.equals(str, "onRecvPushMessage")) {
                    TIMPushProvider.this.m76950a((V2TIMMessage) obj);
                    return;
                }
                if (TextUtils.equals(str, "onRevokePushMessage")) {
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        String str2 = (String) jSONObject.get("messageID");
                        String str3 = (String) jSONObject.get("userID");
                        TIMPushLog.m77016d(TIMPushProvider.f75049a, "onRevokePushMessage id = " + str2);
                        TIMPushProvider.this.m76958a(str2, str3);
                    } catch (Exception e11) {
                        TIMPushLog.m77017e(TIMPushProvider.f75049a, "onRevokePushMessage e = " + e11);
                    }
                }
            }
        };
        V2TIMManager.getInstance().addIMSDKListener(this.f75077w);
        this.f75076v = new V2TIMAdvancedMsgListener() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.2
            @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
            public void onRecvMessageRevoked(String str, V2TIMUserFullInfo v2TIMUserFullInfo, String str2) {
                TIMPushLog.m77016d(TIMPushProvider.f75049a, "onRecvMessageRevoked id = " + str);
                TIMPushProvider.this.m76958a(str, v2TIMUserFullInfo.getUserID());
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMAdvancedMsgListener
            public void onRecvNewMessage(final V2TIMMessage v2TIMMessage) {
                V2TIMManager.getInstance().callExperimentalAPI("getMessageSource", v2TIMMessage, new V2TIMValueCallback<Object>() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.2.1
                    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                    public void onSuccess(Object obj) {
                        Integer num = (Integer) obj;
                        if (num.intValue() != 5 && num.intValue() != 6) {
                            TIMPushProvider.this.m76950a(v2TIMMessage);
                            return;
                        }
                        TIMPushLog.m77016d(TIMPushProvider.f75049a, "synchrorized message：" + v2TIMMessage.toString());
                    }

                    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                    public void onError(int i11, String str) {
                        TIMPushLog.m77017e(TIMPushProvider.f75049a, "getMessageSource code = " + i11 + ", desc = " + str);
                        TIMPushProvider.this.m76950a(v2TIMMessage);
                    }
                });
            }
        };
        V2TIMManager.getMessageManager().addAdvancedMsgListener(this.f75076v);
        this.f75069A = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: d */
    public boolean m76973d() {
        return V2TIMManager.getInstance().getLoginStatus() == 1;
    }

    /* JADX INFO: renamed from: f */
    public void m76976f() {
        V2TIMManager.getConversationManager().removeConversationListener(this.f75075u);
    }

    /* JADX INFO: renamed from: b */
    public String m76963b() {
        return V2TIMManager.getInstance().getLoginUser();
    }

    /* JADX INFO: renamed from: b */
    public void m76965b(final TIMPushCallback<String> tIMPushCallback) {
        V2TIMManager.getInstance().callExperimentalAPI("getBuiltInPushUserID", null, new V2TIMValueCallback<Object>() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.12
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onSuccess(Object obj) {
                TIMPushUtils.m77026a(tIMPushCallback, obj instanceof String ? (String) obj : "");
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i11, String str) {
                TIMPushLog.m77017e(TIMPushProvider.f75049a, "getBuiltInPushUserID code = " + i11 + ", desc = " + str);
                TIMPushUtils.m77025a(tIMPushCallback, i11, str, null);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m76974e() {
        TIMPushLog.m77016d(f75049a, "notifyNotificationClicked = " + this.f75080z);
        String str = new String(this.f75080z);
        Iterator<TIMPushListener> it = this.f75078x.iterator();
        while (it.hasNext()) {
            it.next().onNotificationClicked(str);
        }
        this.f75080z = null;
    }

    /* JADX INFO: renamed from: b */
    public void m76966b(TIMPushListener tIMPushListener) {
        if (tIMPushListener == null) {
            TIMPushLog.m77017e(f75049a, "removePushMessageListener is null");
        } else {
            this.f75078x.remove(tIMPushListener);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m76971c(final TIMPushCallback tIMPushCallback) {
        V2TIMManager.getConversationManager().getTotalUnreadMessageCount(new V2TIMValueCallback<Long>() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.16
            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Long l11) {
                TIMPushUtils.m77026a(tIMPushCallback, l11);
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
            public void onError(int i11, String str) {
                TIMPushUtils.m77025a(tIMPushCallback, i11, str, null);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m76970c(V2TIMMessage v2TIMMessage) {
        if (ActivityLifecycleHandler.f74844i) {
            int iM76946a = m76946a(v2TIMMessage.getOfflinePushInfo());
            if (iM76946a == 1) {
                m76964b(v2TIMMessage);
                return;
            }
            if (iM76946a == 2) {
                TIMPushLog.m77016d(f75049a, "foregroundShow hide");
                return;
            }
            int iCanPostNotificationInForeground = TIMPushConfig.getInstance().canPostNotificationInForeground();
            if (iCanPostNotificationInForeground == 0) {
                return;
            }
            if (iCanPostNotificationInForeground == 1) {
                m76964b(v2TIMMessage);
                return;
            }
            if (iCanPostNotificationInForeground == -1) {
                int runningScene = TIMPushConfig.getInstance().getRunningScene();
                if (runningScene == 4) {
                    m76964b(v2TIMMessage);
                    return;
                } else {
                    if (runningScene == 6) {
                        TIMPushLog.m77016d(f75049a, "RUNNING_SCENE_IN_MIXED_APP");
                        return;
                    }
                    return;
                }
            }
            TIMPushLog.m77016d(f75049a, "invalid mShowNotificationInForeground");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m76967b(final String str) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.14
            @Override // java.lang.Runnable
            public void run() {
                TIMPushProvider.this.f75070B = System.currentTimeMillis();
                String str2 = str;
                if (str2 == null) {
                    TIMPushProvider.this.f75080z = "";
                } else {
                    TIMPushProvider.this.f75080z = str2;
                }
                TIMPushProvider.this.m76978g();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final boolean m76968b(V2TIMOfflinePushInfo v2TIMOfflinePushInfo) {
        if (!TextUtils.isEmpty(v2TIMOfflinePushInfo.getDesc()) || !TextUtils.isEmpty(v2TIMOfflinePushInfo.getTitle())) {
            return true;
        }
        if (v2TIMOfflinePushInfo.getExt() != null && v2TIMOfflinePushInfo.getExt().length != 0) {
            return true;
        }
        TIMPushLog.m77016d(f75049a, "invalid offlinePushInfo");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m76956a(String str, long j11, TIMPushCallback tIMPushCallback) {
        String str2 = f75049a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setOfflinePushConfig businessID = ");
        sb2.append(j11);
        sb2.append(" pushTokenState = ");
        sb2.append((TextUtils.isEmpty(str) || TextUtils.equals(TIMPushConstants.EMPTY_PUSH_TOKEN_KEY, str)) ? "empty" : "valid");
        TIMPushLog.m77016d(str2, sb2.toString());
        if (j11 <= 0) {
            TIMPushLog.m77017e(str2, "setOfflinePushConfig invalid businessID!");
        }
        m76957a(str, j11, tIMPushCallback, 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m76964b(V2TIMMessage v2TIMMessage) {
        final V2TIMOfflinePushInfo offlinePushInfo = v2TIMMessage.getOfflinePushInfo();
        if (offlinePushInfo == null) {
            TIMPushLog.m77016d(f75049a, "v2TIMOfflinePushInfo is null or disable");
        } else {
            V2TIMManager.getInstance().callExperimentalAPI("getPushMessageID", v2TIMMessage, new V2TIMValueCallback<Object>() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.19
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(Object obj) {
                    TIMPushProvider.this.m76951a(offlinePushInfo, (String) obj);
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    TIMPushLog.m77017e(TIMPushProvider.f75049a, "getPushMessageID code = " + i11 + ", desc = " + str);
                    TIMPushProvider.this.m76951a(offlinePushInfo, "");
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76947a(int i11, final TIMPushCallback tIMPushCallback) {
        TIMPushLog.m77016d(f75049a, TUIConstants.TIMPush.METHOD_DO_BACKGROUND);
        V2TIMManager.getOfflinePushManager().doBackground(i11, new V2TIMCallback() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.4
            @Override // com.tencent.imsdk.p128v2.V2TIMCallback
            public void onError(int i12, String str) {
                TIMPushLog.m77017e(TIMPushProvider.f75049a, "doBackground err = " + i12 + ", desc = " + str);
                TIMPushUtils.m77025a(tIMPushCallback, i12, str, null);
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMCallback
            public void onSuccess() {
                TIMPushLog.m77016d(TIMPushProvider.f75049a, "doBackground success");
                TIMPushUtils.m77026a(tIMPushCallback, null);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m76952a(final TIMPushCallback tIMPushCallback) {
        TIMPushLog.m77016d(f75049a, TUIConstants.TIMPush.METHOD_DO_FOREGROUND);
        V2TIMManager.getOfflinePushManager().doForeground(new V2TIMCallback() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.5
            @Override // com.tencent.imsdk.p128v2.V2TIMCallback
            public void onError(int i11, String str) {
                TIMPushLog.m77017e(TIMPushProvider.f75049a, "doForeground err = " + i11 + ", desc = " + str);
                TIMPushUtils.m77025a(tIMPushCallback, i11, str, null);
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMCallback
            public void onSuccess() {
                TIMPushLog.m77016d(TIMPushProvider.f75049a, "doForeground success");
                TIMPushUtils.m77026a(tIMPushCallback, null);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m76960a(List<OfflinePushEventItem> list, final TIMPushCallback tIMPushCallback) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (OfflinePushEventItem offlinePushEventItem : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", offlinePushEventItem.getEventType());
                jSONObject.put("time", offlinePushEventItem.getEventTime());
                jSONObject.put("pushId", offlinePushEventItem.getPushId());
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(TIMPushConstants.PUSH_REPORT_EVENT_LIST_KEY, jSONArray);
            V2TIMManager.getInstance().callExperimentalAPI("reportOfflinePushEvent", jSONObject2.toString(), new V2TIMValueCallback<Object>() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.6
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str) {
                    TIMPushLog.m77017e(TIMPushProvider.f75049a, "reportOfflinePushEvent err = " + i11 + ", desc = " + str);
                    TIMPushUtils.m77025a(tIMPushCallback, i11, str, null);
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(Object obj) {
                    TIMPushLog.m77018i(TIMPushProvider.f75049a, "reportOfflinePushEvent success");
                    TIMPushUtils.m77026a(tIMPushCallback, obj);
                }
            });
        } catch (Exception e11) {
            TIMPushLog.m77018i(f75049a, "reportOfflinePushEvent exception = " + e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76955a(String str, int i11, String str2, int i12, String str3, final TIMPushCallback tIMPushCallback) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("notification_bar_state", i11);
            jSONObject.put("tim_push_plugin_version", str);
            jSONObject.put("system_language", str2);
            jSONObject.put("token_error_code", i12);
            jSONObject.put("token_error_msg", str3);
            V2TIMManager.getInstance().callExperimentalAPI("setOfflinePushInfo", jSONObject.toString(), new V2TIMValueCallback<Object>() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.8
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i13, String str4) {
                    TIMPushLog.m77017e(TIMPushProvider.f75049a, "reportTIMPushInfo err = " + i13 + ", desc = " + str4);
                    TIMPushUtils.m77025a(tIMPushCallback, i13, str4, null);
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(Object obj) {
                    TIMPushLog.m77018i(TIMPushProvider.f75049a, "reportTIMPushInfo success");
                    TIMPushUtils.m77026a(tIMPushCallback, obj);
                }
            });
        } catch (Exception e11) {
            TIMPushLog.m77018i(f75049a, "reportTIMPushInfo exception = " + e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76949a(long j11, long j12, long j13, String str, String str2, String str3, final TIMPushCallback tIMPushCallback) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_id", j11);
            jSONObject.put("event_code", j12);
            jSONObject.put("event_result", j13);
            jSONObject.put("event_message", str);
            jSONObject.put("more_message", str2);
            jSONObject.put("extension_message", str3);
            V2TIMManager.getInstance().callExperimentalAPI("reportPushSDKEvent", jSONObject.toString(), new V2TIMValueCallback<Object>() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.9
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str4) {
                    TIMPushLog.m77017e(TIMPushProvider.f75049a, "reportPushSDKEvent err = " + i11 + ", desc = " + str4);
                    TIMPushUtils.m77025a(tIMPushCallback, i11, str4, null);
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(Object obj) {
                    TIMPushLog.m77018i(TIMPushProvider.f75049a, "reportPushSDKEvent success");
                    TIMPushUtils.m77026a(tIMPushCallback, obj);
                }
            });
        } catch (Exception e11) {
            TIMPushLog.m77018i(f75049a, "reportPushSDKEvent exception = " + e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m76961a(Context context, int i11) {
        int i12 = this.f75079y;
        if (i12 != 0 && i11 != i12) {
            V2TIMManager.getInstance().unInitSDK();
        }
        this.f75079y = i11;
        V2TIMManager.getInstance().addIMSDKListener(this.f75074F);
        return V2TIMManager.getInstance().initSDK(context, i11, new V2TIMSDKConfig());
    }

    /* JADX INFO: renamed from: a */
    public void m76959a(String str, String str2, final TIMPushCallback tIMPushCallback) {
        if (TextUtils.equals(str, V2TIMManager.getInstance().getLoginUser()) && !TextUtils.isEmpty(str)) {
            TIMPushLog.m77016d(f75049a, "already login");
            TIMPushUtils.m77026a(tIMPushCallback, null);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userID", str);
            jSONObject.put("appKey", str2);
            V2TIMManager.getInstance().callExperimentalAPI("pushLogin", jSONObject.toString(), new V2TIMValueCallback<Object>() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.10
                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onError(int i11, String str3) {
                    TIMPushLog.m77017e(TIMPushProvider.f75049a, "pushLogin code = " + i11 + ", desc = " + str3);
                    TIMPushUtils.m77025a(tIMPushCallback, i11, str3, null);
                }

                @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
                public void onSuccess(Object obj) {
                    TIMPushLog.m77016d(TIMPushProvider.f75049a, "pushLogin success");
                    TIMPushUtils.m77026a(tIMPushCallback, null);
                }
            });
        } catch (Exception e11) {
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_REGISTER_PUSH_CONNECT_FAILED, "connect failed: " + e11, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m76954a(final IMEventListener iMEventListener) {
        this.f75075u = new V2TIMConversationListener() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.13
            @Override // com.tencent.imsdk.p128v2.V2TIMConversationListener
            public void onTotalUnreadMessageCountChanged(long j11) {
                IMEventListener iMEventListener2 = iMEventListener;
                if (iMEventListener2 != null) {
                    iMEventListener2.mo76827a(j11);
                }
            }
        };
        V2TIMManager.getConversationManager().addConversationListener(this.f75075u);
    }

    /* JADX INFO: renamed from: a */
    public void m76953a(TIMPushListener tIMPushListener) {
        if (tIMPushListener == null) {
            TIMPushLog.m77017e(f75049a, "addPushMessageListener is null");
        } else {
            if (this.f75078x.contains(tIMPushListener)) {
                return;
            }
            this.f75078x.add(tIMPushListener);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76948a(long j11) {
        if (this.f75078x.size() == 0) {
            this.f75073E++;
            this.f75071C.postDelayed(this.f75072D, j11);
        } else {
            m76974e();
            this.f75071C.removeCallbacks(this.f75072D);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76962a(String str) {
        boolean zEquals = TextUtils.equals(V2TIMManager.getInstance().getLoginUser(), str);
        long runningPlatform = TIMPushConfig.getInstance().getRunningPlatform();
        if (zEquals) {
            return (runningPlatform == 2 || runningPlatform == 5 || runningPlatform == 3) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m76950a(final V2TIMMessage v2TIMMessage) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.17
            @Override // java.lang.Runnable
            public void run() {
                V2TIMMessage v2TIMMessage2 = v2TIMMessage;
                if (v2TIMMessage2 == null) {
                    TIMPushLog.m77016d(TIMPushProvider.f75049a, "message is null");
                    return;
                }
                if (!TIMPushProvider.this.m76962a(v2TIMMessage2.getSender())) {
                    TIMPushLog.m77016d(TIMPushProvider.f75049a, "message is self and return");
                    return;
                }
                V2TIMOfflinePushInfo offlinePushInfo = v2TIMMessage.getOfflinePushInfo();
                if (offlinePushInfo == null || !TIMPushProvider.this.m76968b(offlinePushInfo)) {
                    TIMPushLog.m77017e(TIMPushProvider.f75049a, "offlinePushInfo is null");
                    return;
                }
                TIMPushMessage tIMPushMessage = new TIMPushMessage();
                tIMPushMessage.setTitle(offlinePushInfo.getTitle());
                tIMPushMessage.setDesc(offlinePushInfo.getDesc());
                byte[] ext = offlinePushInfo.getExt();
                if (ext != null) {
                    tIMPushMessage.setExt(new String(ext));
                }
                tIMPushMessage.setMessageID(v2TIMMessage.getMsgID());
                Iterator it = TIMPushProvider.this.f75078x.iterator();
                while (it.hasNext()) {
                    ((TIMPushListener) it.next()).onRecvPushMessage(tIMPushMessage);
                }
                if (TextUtils.equals(V2TIMManager.getInstance().getLoginUser(), v2TIMMessage.getSender())) {
                    TIMPushLog.m77016d(TIMPushProvider.f75049a, "message is self");
                } else {
                    TIMPushProvider.this.m76970c(v2TIMMessage);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m76958a(final String str, final String str2) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.18
            @Override // java.lang.Runnable
            public void run() {
                if (!TIMPushProvider.this.m76962a(str2)) {
                    TIMPushLog.m77016d(TIMPushProvider.f75049a, "revoke message is self and return");
                    return;
                }
                Iterator it = TIMPushProvider.this.f75078x.iterator();
                while (it.hasNext()) {
                    ((TIMPushListener) it.next()).onRevokePushMessage(str);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final int m76946a(V2TIMOfflinePushInfo v2TIMOfflinePushInfo) {
        String strOptString;
        if (v2TIMOfflinePushInfo != null && !TextUtils.isEmpty(v2TIMOfflinePushInfo.getVendorParams())) {
            try {
                JSONObject jSONObject = new JSONObject(v2TIMOfflinePushInfo.getVendorParams());
                Iterator<String> itKeys = jSONObject.keys();
                while (true) {
                    strOptString = "";
                    if (!itKeys.hasNext()) {
                        break;
                    }
                    String next = itKeys.next();
                    if (f75061m.equalsIgnoreCase(next)) {
                        strOptString = jSONObject.optString(next, "");
                        break;
                    }
                }
                if (f75062n.equalsIgnoreCase(strOptString)) {
                    return 1;
                }
                if (f75063o.equalsIgnoreCase(strOptString)) {
                    return 2;
                }
            } catch (Exception e11) {
                TIMPushLog.m77017e(f75049a, "parse foregroundShow failed, e = " + e11);
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m76951a(V2TIMOfflinePushInfo v2TIMOfflinePushInfo, String str) {
        HashMap map = new HashMap();
        map.put(TUIConstants.TIMPush.NOTIFICATION.TITLE, v2TIMOfflinePushInfo.getTitle());
        map.put(TUIConstants.TIMPush.NOTIFICATION.DESCPTION, v2TIMOfflinePushInfo.getDesc());
        map.put("clickExt", str);
        map.put(TIMPushConstants.NOTIFICATION_FROM_ONLINE_MESSAGE, TIMPushConstants.NOTIFICATION_FROM_ONLINE_MESSAGE);
        byte[] ext = v2TIMOfflinePushInfo.getExt();
        if (ext != null) {
            map.put("ext", new String(ext));
        }
        String androidSound = v2TIMOfflinePushInfo.getAndroidSound();
        if (!TextUtils.isEmpty(androidSound)) {
            map.put(TUIConstants.TIMPush.NOTIFICATION.SOUND, androidSound);
        }
        NotificationBuilder.m76983c().m76990a(map);
    }

    /* JADX INFO: renamed from: a */
    public final void m76957a(final String str, final long j11, final TIMPushCallback tIMPushCallback, final int i11) {
        V2TIMManager.getOfflinePushManager().setOfflinePushConfig(new V2TIMOfflinePushConfig(j11, str), new V2TIMCallback() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.21
            @Override // com.tencent.imsdk.p128v2.V2TIMCallback
            public void onError(int i12, String str2) {
                TIMPushLog.m77017e(TIMPushProvider.f75049a, "setOfflinePushToken errcode = " + i12 + " desc = " + str2);
                if (i12 == 7009 && i11 < 1) {
                    TIMPushLog.m77020w(TIMPushProvider.f75049a, "setOfflinePushConfig interrupted by relogin, retry after 500ms, retriedCount = " + i11);
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.tencent.qcloud.tim.push.model.TIMPushProvider.21.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C3505221 c3505221 = C3505221.this;
                            TIMPushProvider.this.m76957a(str, j11, tIMPushCallback, i11 + 1);
                        }
                    }, 500L);
                    return;
                }
                TIMPushUtils.m77025a(tIMPushCallback, i12, str2, null);
            }

            @Override // com.tencent.imsdk.p128v2.V2TIMCallback
            public void onSuccess() {
                TIMPushLog.m77016d(TIMPushProvider.f75049a, "setOfflinePushToken success");
                TIMPushUtils.m77026a(tIMPushCallback, null);
            }
        });
    }
}
