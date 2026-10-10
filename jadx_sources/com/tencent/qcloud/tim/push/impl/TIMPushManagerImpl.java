package com.tencent.qcloud.tim.push.impl;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.webkit.ProxyConfig;
import com.google.gson.Gson;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.imsdk.common.IMContext;
import com.tencent.imsdk.offlinepush.OfflinePushEventItem;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMSDKConfig;
import com.tencent.qcloud.tim.push.TIMPushCallback;
import com.tencent.qcloud.tim.push.TIMPushConstants;
import com.tencent.qcloud.tim.push.TIMPushListener;
import com.tencent.qcloud.tim.push.TIMPushManager;
import com.tencent.qcloud.tim.push.bean.ConfigBean;
import com.tencent.qcloud.tim.push.components.ActivityLifecycleHandler;
import com.tencent.qcloud.tim.push.components.HttpClient;
import com.tencent.qcloud.tim.push.components.StatisticDataStorage;
import com.tencent.qcloud.tim.push.components.TokenLogic;
import com.tencent.qcloud.tim.push.config.TIMPushConfig;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tim.push.notification.NotificationBuilder;
import com.tencent.qcloud.tim.push.notification.NotificationClickProcessor;
import com.tencent.qcloud.tim.push.utils.TIMPushLog;
import com.tencent.qcloud.tim.push.utils.TIMPushUtils;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes56.dex */
public class TIMPushManagerImpl extends TIMPushManager {

    /* JADX INFO: renamed from: p */
    public static final String f74937p = "TIMPushManagerImpl";

    /* JADX INFO: renamed from: q */
    public static final int f74938q = 128;

    /* JADX INFO: renamed from: a */
    public String f74939a;

    /* JADX INFO: renamed from: b */
    public Intent f74940b;

    /* JADX INFO: renamed from: c */
    public Context f74941c;

    /* JADX INFO: renamed from: g */
    public StatisticDataStorage f74945g;

    /* JADX INFO: renamed from: d */
    public TIMPushProvider f74942d = new TIMPushProvider();

    /* JADX INFO: renamed from: e */
    public ActivityLifecycleHandler f74943e = new ActivityLifecycleHandler();

    /* JADX INFO: renamed from: f */
    public NotificationClickProcessor f74944f = new NotificationClickProcessor();

    /* JADX INFO: renamed from: h */
    public TokenLogic f74946h = new TokenLogic();

    /* JADX INFO: renamed from: i */
    public String f74947i = "";

    /* JADX INFO: renamed from: j */
    public String f74948j = "";

    /* JADX INFO: renamed from: k */
    public boolean f74949k = false;

    /* JADX INFO: renamed from: l */
    public boolean f74950l = false;

    /* JADX INFO: renamed from: m */
    public String f74951m = "";

    /* JADX INFO: renamed from: n */
    public TokenResultCallback f74952n = new TokenResultCallback();

    /* JADX INFO: renamed from: o */
    public TokenResultCallback f74953o = new TokenResultCallback();

    /* JADX INFO: renamed from: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl$10 */
    public class RunnableC3501410 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f74959a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TIMPushCallback f74960b;

        public RunnableC3501410(int i11, TIMPushCallback tIMPushCallback) {
            this.f74959a = i11;
            this.f74960b = tIMPushCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            TIMPushLog.m77016d(TIMPushManagerImpl.f74937p, "doBackground，unreadCount= " + this.f74959a);
            TIMPushManagerImpl.this.f74942d.m76947a(this.f74959a, new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.10.1
                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onError(final int i11, final String str, final Object obj) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.10.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            TIMPushUtils.m77025a(RunnableC3501410.this.f74960b, i11, str, obj);
                        }
                    });
                }

                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onSuccess(final Object obj) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.10.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TIMPushUtils.m77026a(RunnableC3501410.this.f74960b, obj);
                            if (TIMPushConfig.getInstance().getRunningPlatform() == 3) {
                                ActivityLifecycleHandler.f74844i = false;
                            }
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl$11 */
    public class RunnableC3501511 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TIMPushCallback f74969a;

        public RunnableC3501511(TIMPushCallback tIMPushCallback) {
            this.f74969a = tIMPushCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            TIMPushLog.m77016d(TIMPushManagerImpl.f74937p, TUIConstants.TIMPush.METHOD_DO_FOREGROUND);
            TIMPushManagerImpl.this.f74942d.m76952a(new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.11.1
                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onError(final int i11, final String str, final Object obj) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.11.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            TIMPushUtils.m77025a(RunnableC3501511.this.f74969a, i11, str, obj);
                        }
                    });
                }

                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onSuccess(final Object obj) {
                    IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.11.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TIMPushUtils.m77026a(RunnableC3501511.this.f74969a, obj);
                            if (TIMPushConfig.getInstance().getRunningPlatform() == 3) {
                                ActivityLifecycleHandler.f74844i = true;
                            }
                        }
                    });
                }
            });
        }
    }

    public static class TIMPushManagerImplHolder {

        /* JADX INFO: renamed from: a */
        public static final TIMPushManagerImpl f75041a = new TIMPushManagerImpl();

        private TIMPushManagerImplHolder() {
        }
    }

    public class TokenResultCallback extends TIMPushCallback<Object> implements TokenLogic.OnRequestTokenComplete {

        /* JADX INFO: renamed from: a */
        public List<TIMPushCallback> f75042a = new CopyOnWriteArrayList();

        public TokenResultCallback() {
        }

        /* JADX INFO: renamed from: a */
        public void m76929a(TIMPushCallback tIMPushCallback) {
            this.f75042a.add(tIMPushCallback);
        }

        @Override // com.tencent.qcloud.tim.push.components.TokenLogic.OnRequestTokenComplete
        /* JADX INFO: renamed from: a */
        public void mo76856a(int i11, String str, Object obj) {
            String string;
            if (i11 == 0 && (obj instanceof Bundle)) {
                string = ((Bundle) obj).getString("pushTokenKey");
            } else {
                string = "";
            }
            TIMPushManagerImpl.this.m76895a(i11, str, 0L, string, this);
        }

        @Override // com.tencent.qcloud.tim.push.TIMPushCallback
        public void onError(final int i11, final String str, Object obj) {
            IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.TokenResultCallback.2
                @Override // java.lang.Runnable
                public void run() {
                    TIMPushConfig.getInstance().setPushStatus(1);
                    Iterator it = TokenResultCallback.this.f75042a.iterator();
                    while (it.hasNext()) {
                        TIMPushUtils.m77025a((TIMPushCallback) it.next(), i11, str, null);
                    }
                    TokenResultCallback.this.f75042a.clear();
                }
            });
        }

        @Override // com.tencent.qcloud.tim.push.TIMPushCallback
        public void onSuccess(final Object obj) {
            IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.TokenResultCallback.1
                @Override // java.lang.Runnable
                public void run() {
                    TIMPushConfig.getInstance().setPushStatus(0);
                    Iterator it = TokenResultCallback.this.f75042a.iterator();
                    while (it.hasNext()) {
                        TIMPushUtils.m77026a((TIMPushCallback) it.next(), obj);
                    }
                    TokenResultCallback.this.f75042a.clear();
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public static TIMPushManagerImpl m76884c() {
        return TIMPushManagerImplHolder.f75041a;
    }

    /* JADX INFO: renamed from: b */
    public void m76911b(Context context) {
        this.f74941c = context;
        this.f74943e.m76824a(context, this.f74942d);
        this.f74944f.m77005a(this.f74942d);
        this.f74946h.m76850a(this.f74941c);
        NotificationBuilder.m76983c().m76986a(this.f74941c, this.f74942d);
        this.f74942d.m76969c();
        this.f74945g = new StatisticDataStorage(this.f74941c);
        this.f74947i = "";
        ((Application) this.f74941c.getApplicationContext()).registerActivityLifecycleCallbacks(this.f74943e);
        TIMPushConfig.getInstance().setContext(this.f74941c);
        TIMPushConfig.getInstance().setPushChannelId(TIMPushUtils.m77036i());
        this.f74939a = (String) m76892a(TIMPushConstants.CUSTOM_TIMPUSH_CONFIGS);
    }

    /* JADX INFO: renamed from: d */
    public final void m76919d(final TIMPushCallback tIMPushCallback) {
        TIMPushLog.m77016d(f74937p, "unRegisterPush");
        this.f74946h.m76853b();
        this.f74942d.m76977f(new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.20
            @Override // com.tencent.qcloud.tim.push.TIMPushCallback
            public void onError(int i11, String str, Object obj) {
                TIMPushUtils.m77025a(tIMPushCallback, i11, str, obj);
            }

            @Override // com.tencent.qcloud.tim.push.TIMPushCallback
            public void onSuccess(Object obj) {
                TIMPushConfig.getInstance().setPushStatus(-1);
                TIMPushManagerImpl.this.f74949k = false;
                if (TIMPushConfig.getInstance().getRunningScene() == 4) {
                    TIMPushManagerImpl.this.f74942d.m76972d(new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.20.1
                        @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                        public void onError(int i11, String str, Object obj2) {
                            TIMPushUtils.m77025a(tIMPushCallback, i11, str, obj2);
                        }

                        @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                        public void onSuccess(Object obj2) {
                            TIMPushUtils.m77026a(tIMPushCallback, obj2);
                        }
                    });
                } else {
                    TIMPushUtils.m77026a(tIMPushCallback, null);
                }
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m76922e(final Object obj, final TIMPushCallback tIMPushCallback) {
        if (obj instanceof Intent) {
            IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.21
                @Override // java.lang.Runnable
                public void run() {
                    HashMap map = new HashMap();
                    map.put("fcmPushIntentKey", obj);
                    Object objCallService = TUICore.callService(TUIConstants.TIMPush.FCM.FCM_SERVICE_NAME, "parseFCMPushIntent", map);
                    if (!(objCallService instanceof Map)) {
                        TIMPushLog.m77017e(TIMPushManagerImpl.f74937p, "parse fcm intent failed, fcm plugin not integrated or message filtered");
                        TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_INVALID_PARAM, "fcm plugin not integrated or message filtered", null);
                        return;
                    }
                    Map map2 = (Map) objCallService;
                    String str = (String) map2.get("IMReportURL");
                    String str2 = (String) map2.get("clickExt");
                    TIMPushLog.m77016d(TIMPushManagerImpl.f74937p, "reportFCMPushArrived url =" + str + ", pushID = " + str2);
                    TIMPushManagerImpl.this.m76903a(str, str2, 1, System.currentTimeMillis() / 1000, tIMPushCallback);
                }
            });
        } else {
            TIMPushLog.m77017e(f74937p, "param is not Intent");
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_INVALID_PARAM, "param must be Intent", null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m76923f(Object obj, TIMPushCallback tIMPushCallback) {
        if (obj == null || !(obj instanceof String)) {
            TIMPushLog.m77017e(f74937p, "param is not string");
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_SET_APP_LANGUAGE_FAILED, "param is not string", null);
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            TIMPushLog.m77017e(f74937p, "param is null");
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_SET_APP_LANGUAGE_FAILED, "param is null", null);
            return;
        }
        try {
            TIMPushLog.m77016d(f74937p, "setAppLanguage :" + str);
            TIMPushUtils.m77027a(str);
            TIMPushUtils.m77026a(tIMPushCallback, null);
        } catch (Exception e11) {
            TIMPushLog.m77017e(f74937p, "setAppLanguage e = " + e11);
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_SET_APP_LANGUAGE_FAILED, "exception: " + e11, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m76924g(Object obj, TIMPushCallback tIMPushCallback) {
        if (obj == null || !(obj instanceof Integer)) {
            TIMPushLog.m77017e(f74937p, "param is not int");
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_INVALID_PARAM, "param is not int", null);
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        TIMPushLog.m77016d(f74937p, "setCustomBadgeNumber :" + iIntValue);
        TIMPushConfig.getInstance().setCustomBadgeNumber(iIntValue);
        TIMPushUtils.m77024a(this.f74941c, iIntValue, tIMPushCallback);
    }

    /* JADX INFO: renamed from: h */
    public final void m76925h(Object obj, TIMPushCallback tIMPushCallback) {
        if (obj == null || !(obj instanceof String)) {
            TIMPushLog.m77017e(f74937p, "param is not string");
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_SET_PUSH_CONFIG_FAILED, "param is not string", null);
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            TIMPushLog.m77017e(f74937p, "param is null");
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_SET_PUSH_CONFIG_FAILED, "param is null", null);
            return;
        }
        try {
            TIMPushLog.m77016d(f74937p, "setPushConfig :" + str);
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("runningPlatform")) {
                TIMPushConfig.getInstance().setRunningPlatform(jSONObject.getLong("runningPlatform"));
            }
            if (jSONObject.has("enableBackupChannels")) {
                TIMPushConfig.getInstance().enableBackupChannels(jSONObject.getBoolean("enableBackupChannels"));
            }
            if (jSONObject.has("customConfigFile")) {
                this.f74939a = jSONObject.getString("customConfigFile");
            }
            TIMPushUtils.m77026a(tIMPushCallback, null);
        } catch (Exception e11) {
            TIMPushLog.m77017e(f74937p, "setPushConfig e = " + e11);
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_SET_PUSH_CONFIG_FAILED, "exception: " + e11, null);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m76926i(Object obj, final TIMPushCallback tIMPushCallback) {
        if (obj == null || !(obj instanceof String)) {
            TIMPushLog.m77017e(f74937p, "param is not string");
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_SET_PUSH_TOKEN_FAILED, "param is not string", null);
            return;
        }
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            TIMPushLog.m77017e(f74937p, "param is null");
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_SET_PUSH_TOKEN_FAILED, "param is null", null);
            return;
        }
        try {
            m76918d();
            m76921e();
            int length = 0;
            m76910b(0, "set token");
            JSONObject jSONObject = new JSONObject(str);
            long jOptLong = jSONObject.optLong("businessID");
            String strOptString = jSONObject.optString(InterfaceC33826o0.f71244p);
            String str2 = f74937p;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setPushToken businessId = ");
            sb2.append(jOptLong);
            sb2.append(", tokenLength = ");
            if (strOptString != null) {
                length = strOptString.length();
            }
            sb2.append(length);
            TIMPushLog.m77016d(str2, sb2.toString());
            if (jOptLong <= 0) {
                TIMPushLog.m77017e(str2, "invalid businessId " + jOptLong);
            }
            this.f74946h.m76855b(strOptString);
            m76895a(0, "", jOptLong, strOptString, new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.22
                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onError(int i11, String str3, Object obj2) {
                    TIMPushConfig.getInstance().setPushStatus(1);
                    TIMPushUtils.m77025a(tIMPushCallback, i11, str3, obj2);
                }

                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onSuccess(Object obj2) {
                    TIMPushConfig.getInstance().setPushStatus(0);
                    TIMPushUtils.m77026a(tIMPushCallback, obj2);
                }
            });
        } catch (Exception e11) {
            TIMPushLog.m77017e(f74937p, "setPushToken e = " + e11);
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_SET_PUSH_TOKEN_FAILED, "exception: " + e11, null);
        }
    }

    @Override // com.tencent.qcloud.tim.push.TIMPushManager
    public void addPushListener(final TIMPushListener tIMPushListener) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.5
            @Override // java.lang.Runnable
            public void run() {
                TIMPushManagerImpl.this.f74942d.m76953a(tIMPushListener);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m76917c(String str) {
        this.f74951m = str;
    }

    @Override // com.tencent.qcloud.tim.push.TIMPushManager
    public void callExperimentalAPI(final String str, final Object obj, final TIMPushCallback tIMPushCallback) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.9
            @Override // java.lang.Runnable
            public void run() {
                TIMPushManagerImpl.this.m76902a(str, obj, tIMPushCallback);
            }
        });
    }

    @Override // com.tencent.qcloud.tim.push.TIMPushManager
    public void disablePostNotificationInForeground(final boolean z11) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.8
            @Override // java.lang.Runnable
            public void run() {
                TIMPushLog.m77016d(TIMPushManagerImpl.f74937p, "disablePostNotificationInForeground disable = " + z11);
                if (z11) {
                    TIMPushConfig.getInstance().enablePostNotificationInForeground(0);
                } else {
                    TIMPushConfig.getInstance().enablePostNotificationInForeground(1);
                }
            }
        });
    }

    @Override // com.tencent.qcloud.tim.push.TIMPushManager
    public void forceUseFCMPushChannel(final boolean z11) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.7
            @Override // java.lang.Runnable
            public void run() {
                TIMPushLog.m77016d(TIMPushManagerImpl.f74937p, "forceUseFCMPushChannel enable = " + z11);
                if (z11) {
                    TIMPushConfig.getInstance().setPushChannelId(2002);
                } else {
                    TIMPushConfig.getInstance().setPushChannelId(TIMPushUtils.m77036i());
                }
                TIMPushManagerImpl.this.f74946h.m76853b();
            }
        });
    }

    @Override // com.tencent.qcloud.tim.push.TIMPushManager
    public void getRegistrationID(final TIMPushCallback tIMPushCallback) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.3
            @Override // java.lang.Runnable
            public void run() {
                if (TIMPushManagerImpl.this.f74949k) {
                    TIMPushManagerImpl.this.f74942d.m76965b(new TIMPushCallback<String>() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.3.1
                        @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                        public void onError(int i11, String str, String str2) {
                            String strM76963b = TIMPushManagerImpl.this.f74942d.m76963b();
                            TIMPushLog.m77017e(TIMPushManagerImpl.f74937p, "getBuiltInPushUserID failed, errCode = " + i11 + ", errMsg = " + str + ", fallback getRegistrationID = " + strM76963b);
                            TIMPushUtils.m77026a(tIMPushCallback, strM76963b);
                        }

                        @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                        public void onSuccess(String str) {
                            if (TextUtils.isEmpty(str)) {
                                str = TIMPushManagerImpl.this.f74942d.m76963b();
                            }
                            TIMPushLog.m77016d(TIMPushManagerImpl.f74937p, "getRegistrationID = " + str + ", from built-in push account");
                            TIMPushUtils.m77026a(tIMPushCallback, str);
                        }
                    });
                    return;
                }
                String strM76963b = TIMPushManagerImpl.this.f74942d.m76963b();
                TIMPushLog.m77016d(TIMPushManagerImpl.f74937p, "getRegistrationID = " + strM76963b);
                TIMPushUtils.m77026a(tIMPushCallback, strM76963b);
            }
        });
    }

    @Override // com.tencent.qcloud.tim.push.TIMPushManager
    public void registerPush(final Context context, final int i11, final String str, final TIMPushCallback tIMPushCallback) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.1
            @Override // java.lang.Runnable
            public void run() {
                TIMPushManagerImpl.this.m76898a(context, i11, str, tIMPushCallback);
            }
        });
    }

    @Override // com.tencent.qcloud.tim.push.TIMPushManager
    public void removePushListener(final TIMPushListener tIMPushListener) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.6
            @Override // java.lang.Runnable
            public void run() {
                TIMPushManagerImpl.this.f74942d.m76966b(tIMPushListener);
            }
        });
    }

    @Override // com.tencent.qcloud.tim.push.TIMPushManager
    public void setRegistrationID(final String str, final TIMPushCallback tIMPushCallback) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.4
            @Override // java.lang.Runnable
            public void run() {
                TIMPushLog.m77016d(TIMPushManagerImpl.f74937p, "setRegistrationID = " + str);
                TIMPushManagerImpl.this.f74948j = str;
                TIMPushUtils.m77026a(tIMPushCallback, null);
            }
        });
    }

    @Override // com.tencent.qcloud.tim.push.TIMPushManager
    public void unRegisterPush(final TIMPushCallback tIMPushCallback) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.2
            @Override // java.lang.Runnable
            public void run() {
                TIMPushManagerImpl.this.m76919d(tIMPushCallback);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m76916c(Object obj, TIMPushCallback tIMPushCallback) {
        if (obj == null) {
            TIMPushLog.m77016d(f74937p, "disableRequestPostNotificationPermission");
            TIMPushConfig.getInstance().enableRequestPostNotificationPermission(false);
            TIMPushUtils.m77026a(tIMPushCallback, null);
        } else {
            if (!(obj instanceof Boolean)) {
                TIMPushLog.m77017e(f74937p, "param is not Boolean");
                TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_DISABLE_REQUEST_POST_NOTIFICATION_PERMISSION_FAILED, "param is not Boolean", null);
                return;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            TIMPushLog.m77016d(f74937p, "disableRequestPostNotificationPermission " + zBooleanValue);
            TIMPushConfig.getInstance().enableRequestPostNotificationPermission(zBooleanValue ^ true);
            TIMPushUtils.m77026a(tIMPushCallback, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m76920d(Object obj, final TIMPushCallback tIMPushCallback) {
        String strM76844a = this.f74946h.m76844a();
        if (TextUtils.isEmpty(strM76844a)) {
            if (this.f74941c == null) {
                TIMPushLog.m77017e(f74937p, "invalid context");
                TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_INVALID_PARAM, "invalid context", null);
                return;
            } else {
                m76918d();
                this.f74946h.m76851a(new TokenLogic.OnRequestTokenComplete() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.23
                    @Override // com.tencent.qcloud.tim.push.components.TokenLogic.OnRequestTokenComplete
                    /* JADX INFO: renamed from: a */
                    public void mo76856a(final int i11, final String str, final Object obj2) {
                        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.23.1
                            @Override // java.lang.Runnable
                            public void run() {
                                int i12 = i11;
                                if (i12 == 0) {
                                    Object obj3 = obj2;
                                    if (obj3 instanceof Bundle) {
                                        TIMPushUtils.m77026a(tIMPushCallback, ((Bundle) obj3).getString("pushTokenKey"));
                                        return;
                                    }
                                }
                                TIMPushUtils.m77025a(tIMPushCallback, i12, str, obj2);
                            }
                        });
                    }
                });
                return;
            }
        }
        TIMPushUtils.m77026a(tIMPushCallback, strM76844a);
    }

    /* JADX INFO: renamed from: e */
    public final void m76921e() {
        String str;
        this.f74942d.m76975e(null);
        long runningPlatform = TIMPushConfig.getInstance().getRunningPlatform();
        if (TIMPushConfig.getInstance().getRunningScene() == 6) {
            str = "3";
        } else {
            str = TIMPushConfig.getInstance().getRunningScene() == 4 ? "2" : "1";
        }
        m76896a(1L, 1L, runningPlatform, str, TIMPushUtils.m77030c(), TIMPushUtils.m77035h(), null);
        StatisticDataStorage statisticDataStorage = this.f74945g;
        if (statisticDataStorage == null) {
            return;
        }
        statisticDataStorage.m76839a(new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.24
            @Override // com.tencent.qcloud.tim.push.TIMPushCallback
            public void onSuccess(Object obj) {
                if (!(obj instanceof List)) {
                    TIMPushLog.m77017e(TIMPushManagerImpl.f74937p, "queryOfflineEventData invalid data");
                    return;
                }
                final List<OfflinePushEventItem> list = (List) obj;
                if (list == null || list.isEmpty()) {
                    TIMPushLog.m77016d(TIMPushManagerImpl.f74937p, "queryOfflineEventData is null");
                } else {
                    TIMPushManagerImpl.this.f74942d.m76960a(list, new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.24.1
                        @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                        public void onSuccess(Object obj2) {
                            TIMPushManagerImpl.this.f74945g.m76840a(list, 1);
                        }

                        @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                        public void onError(int i11, String str2, Object obj2) {
                            TIMPushLog.m77017e(TIMPushManagerImpl.f74937p, "reportOfflinePushEvent errCode = " + i11 + ", errMsg = " + str2);
                        }
                    });
                }
            }

            @Override // com.tencent.qcloud.tim.push.TIMPushCallback
            public void onError(int i11, String str2, Object obj) {
                TIMPushLog.m77017e(TIMPushManagerImpl.f74937p, "queryOfflineEventData errCode = " + i11 + ", errMsg = " + str2);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m76894a(int i11, TIMPushCallback tIMPushCallback) {
        IMContext.getInstance().runOnMainThread(new RunnableC3501410(i11, tIMPushCallback));
    }

    /* JADX INFO: renamed from: a */
    public void m76900a(TIMPushCallback tIMPushCallback) {
        IMContext.getInstance().runOnMainThread(new RunnableC3501511(tIMPushCallback));
    }

    /* JADX INFO: renamed from: a */
    public void m76899a(Intent intent, Context context) {
        TIMPushLog.m77016d(f74937p, "clickNotification");
        this.f74940b = intent;
        NotificationBuilder.m76983c().m76988a(this.f74940b);
        this.f74944f.m77004a(this.f74940b, context);
    }

    /* JADX INFO: renamed from: d */
    public final void m76918d() {
        String str;
        String string;
        if (!TextUtils.isEmpty(this.f74939a)) {
            if (!this.f74939a.endsWith(".json")) {
                this.f74939a += ".json";
            }
            str = this.f74939a;
        } else {
            str = "timpush-configs.json";
        }
        String packageName = this.f74941c.getPackageName();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(this.f74941c.getAssets().open(str), "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    sb2.append(line);
                }
            }
            bufferedReader.close();
            inputStreamReader.close();
            JSONObject jSONObject = new JSONObject(sb2.toString());
            JSONObject jSONObject2 = (JSONObject) jSONObject.get(packageName);
            TIMPushConfig.getInstance().setReadJsonVersion((String) jSONObject.get("version"));
            string = jSONObject2.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            TIMPushLog.m77017e(f74937p, "read json exception = " + e11);
            string = null;
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                ConfigBean configBean = (ConfigBean) new Gson().fromJson(string, ConfigBean.class);
                if (configBean != null) {
                    TIMPushConfig.getInstance().setRegisterConfigBean(configBean);
                } else {
                    TIMPushLog.m77017e(f74937p, "timPushConfigsBean is null");
                }
                this.f74950l = true;
                return;
            } catch (Exception e12) {
                this.f74950l = false;
                e12.printStackTrace();
                TIMPushLog.m77017e(f74937p, "parse json exception = " + e12);
                return;
            }
        }
        this.f74950l = false;
        TIMPushLog.m77017e(f74937p, "jsonConfig is null");
    }

    /* JADX INFO: renamed from: b */
    public void m76914b(final List<OfflinePushEventItem> list) {
        if (list != null && !list.isEmpty()) {
            this.f74942d.m76960a(list, new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.15
                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onError(int i11, String str, Object obj) {
                    TIMPushManagerImpl.this.m76904a(list);
                }

                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onSuccess(Object obj) {
                }
            });
        } else {
            TIMPushLog.m77017e(f74937p, "eventItemList null");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m76915c(TIMPushCallback tIMPushCallback) {
        TIMPushUtils.m77026a(tIMPushCallback, Integer.valueOf(TIMPushConfig.getInstance().getPushChannelId()));
    }

    /* JADX INFO: renamed from: a */
    public void m76906a(final Map<String, String> map) {
        IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.12
            @Override // java.lang.Runnable
            public void run() {
                Map map2 = map;
                if (map2 == null || map2.isEmpty()) {
                    TIMPushLog.m77017e(TIMPushManagerImpl.f74937p, "receivePushMessage is null");
                } else {
                    NotificationBuilder.m76983c().m76990a(map);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m76903a(String str, String str2, int i11, long j11, final TIMPushCallback tIMPushCallback) {
        if (TextUtils.isEmpty(str2)) {
            TIMPushLog.m77017e(f74937p, "pushID is null");
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_INVALID_PARAM, "pushID is null", null);
            return;
        }
        OfflinePushEventItem offlinePushEventItem = new OfflinePushEventItem();
        offlinePushEventItem.setPushId(str2);
        offlinePushEventItem.setEventTime(j11);
        offlinePushEventItem.setEventType(i11);
        offlinePushEventItem.setStatus(0);
        final ArrayList arrayList = new ArrayList();
        arrayList.add(offlinePushEventItem);
        if (!TextUtils.isEmpty(str) && (str.toLowerCase().startsWith("http") || str.toLowerCase().startsWith(ProxyConfig.MATCH_HTTPS))) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (OfflinePushEventItem offlinePushEventItem2 : arrayList) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", offlinePushEventItem2.getEventType());
                    jSONObject.put("time", offlinePushEventItem2.getEventTime());
                    jSONObject.put("pushId", offlinePushEventItem2.getPushId());
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(TIMPushConstants.PUSH_REPORT_EVENT_LIST_KEY, jSONArray);
                HttpClient.m76828a().m76834a(str, (Map<String, String>) null, jSONObject2.toString(), new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.13
                    @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                    public void onError(int i12, String str3, Object obj) {
                        TIMPushLog.m77017e(TIMPushManagerImpl.f74937p, "post err = " + i12 + ", desc = " + str3 + ", try report by IMChannel.");
                        TIMPushManagerImpl.this.m76905a((List<OfflinePushEventItem>) arrayList, tIMPushCallback);
                    }

                    @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                    public void onSuccess(Object obj) {
                        TIMPushLog.m77018i(TIMPushManagerImpl.f74937p, "post success");
                        if ((obj instanceof String) && !((String) obj).isEmpty()) {
                            try {
                                JSONObject jSONObject3 = new JSONObject((String) obj);
                                int iOptInt = jSONObject3.optInt("code");
                                if (iOptInt == 200) {
                                    TIMPushLog.m77018i(TIMPushManagerImpl.f74937p, "post final success.");
                                    TIMPushUtils.m77026a(tIMPushCallback, null);
                                    return;
                                } else {
                                    onError(iOptInt, jSONObject3.optString("message", "Unknown business error"), null);
                                    return;
                                }
                            } catch (JSONException e11) {
                                onError(TIMPushConstants.ERR_HTTPS_REQUEST_FAILED, "json exception:" + e11, null);
                                return;
                            }
                        }
                        onError(TIMPushConstants.ERR_HTTPS_REQUEST_FAILED, "json is not a valid string.", null);
                    }
                });
                return;
            } catch (Exception e11) {
                TIMPushLog.m77018i(f74937p, "post exception = " + e11 + ", try report by IMChannel.");
                m76905a((List<OfflinePushEventItem>) arrayList, tIMPushCallback);
                return;
            }
        }
        TIMPushLog.m77017e(f74937p, "url is invalid, try report by IMChannel.");
        m76905a((List<OfflinePushEventItem>) arrayList, tIMPushCallback);
    }

    /* JADX INFO: renamed from: b */
    public final void m76912b(TIMPushCallback tIMPushCallback) {
        if (TextUtils.isEmpty(this.f74951m)) {
            TIMPushLog.m77016d(f74937p, "getNotificationExtInfo is null");
            TIMPushUtils.m77026a(tIMPushCallback, null);
            return;
        }
        TIMPushLog.m77016d(f74937p, "getNotificationExtInfo = " + this.f74951m);
        String str = new String(this.f74951m);
        this.f74951m = null;
        TIMPushUtils.m77026a(tIMPushCallback, str);
    }

    /* JADX INFO: renamed from: b */
    public final void m76913b(Object obj, TIMPushCallback tIMPushCallback) {
        if (obj == null) {
            TIMPushLog.m77016d(f74937p, TUIConstants.TIMPush.METHOD_DISABLE_AUTO_REGISTER_PUSH);
            TIMPushConfig.getInstance().setAutoRegisterPush(false);
            TIMPushUtils.m77026a(tIMPushCallback, null);
        } else {
            if (!(obj instanceof Boolean)) {
                TIMPushLog.m77017e(f74937p, "param is not Boolean");
                TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_DISABLE_AUTO_REGISTER_PUSH_FAILED, "param is not Boolean", null);
                return;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            TIMPushLog.m77016d(f74937p, "disableAutoRegisterPush " + zBooleanValue);
            TIMPushConfig.getInstance().setAutoRegisterPush(zBooleanValue ^ true);
            TIMPushUtils.m77026a(tIMPushCallback, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m76908b(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (Exception unused) {
            return str.length();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m76910b(int i11, String str) {
        String strM77038k = TIMPushUtils.m77038k();
        TIMPushLog.m77016d(f74937p, "systemLanguage: " + strM77038k + ", tokenErrorCode: " + i11 + ",tokenErrorMsg: " + str);
        this.f74942d.m76955a("9.0.7667", TIMPushUtils.m77021a(this.f74941c), strM77038k, i11, str, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m76909b() {
        if (TIMPushConfig.getInstance().canRequestPostNotificationPermission() && Build.VERSION.SDK_INT >= 33) {
            if (ContextCompat.checkSelfPermission(this.f74941c, "android.permission.POST_NOTIFICATIONS") == 0) {
                TIMPushConfig.getInstance().setNotificationPermissionDenied(false);
                return;
            }
            if (TIMPushConfig.getInstance().getNotificationPermissionDenied()) {
                TIMPushLog.m77016d(f74937p, "requestNotificationPermission denied");
                return;
            }
            try {
                Intent intent = new Intent();
                intent.setClassName(this.f74941c.getPackageName(), "com.tencent.qcloud.tim.push.permission.PermissionRequestActivity");
                intent.addFlags(268435456);
                this.f74941c.startActivity(intent);
            } catch (Exception e11) {
                TIMPushLog.m77016d(f74937p, "requestNotificationPermission exception = " + e11);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76905a(final List<OfflinePushEventItem> list, final TIMPushCallback tIMPushCallback) {
        if (!this.f74942d.m76973d()) {
            TIMPushLog.m77017e(f74937p, "IMChannel not available, insert to database.");
            m76904a(list);
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_NOT_LOGINED, "not logined, insert to database", null);
            return;
        }
        this.f74942d.m76960a(list, new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.14
            @Override // com.tencent.qcloud.tim.push.TIMPushCallback
            public void onError(int i11, String str, Object obj) {
                TIMPushLog.m77017e(TIMPushManagerImpl.f74937p, "report by IMChannel err = " + i11 + ", desc = " + str + ", insert to database.");
                TIMPushManagerImpl.this.m76904a(list);
                TIMPushUtils.m77025a(tIMPushCallback, i11, str, null);
            }

            @Override // com.tencent.qcloud.tim.push.TIMPushCallback
            public void onSuccess(Object obj) {
                TIMPushLog.m77018i(TIMPushManagerImpl.f74937p, "report by IMChannel success.");
                TIMPushUtils.m77026a(tIMPushCallback, null);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m76904a(List<OfflinePushEventItem> list) {
        StatisticDataStorage statisticDataStorage = this.f74945g;
        if (statisticDataStorage != null) {
            statisticDataStorage.m76841a(list, (TIMPushCallback) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76895a(int i11, String str, long j11, String str2, final TIMPushCallback tIMPushCallback) {
        final String str3;
        if (i11 == 0) {
            if (TextUtils.isEmpty(str2)) {
                TIMPushLog.m77017e(f74937p, "token is empty");
                if (TextUtils.isEmpty(str)) {
                    str = "Push token empty";
                }
                i11 = 800009;
            } else {
                if (TextUtils.isEmpty(str)) {
                    str = "Token request success";
                }
                str3 = str2;
                i11 = 0;
            }
        } else {
            str3 = TextUtils.isEmpty(str2) ? TIMPushConstants.EMPTY_PUSH_TOKEN_KEY : str2;
        }
        long jM77033f = j11 <= 0 ? TIMPushUtils.m77033f() : j11;
        if (jM77033f <= 0) {
            String strM77023a = TIMPushUtils.m77023a(TIMPushConfig.getInstance().getPushChannelId());
            TIMPushLog.m77017e(f74937p, "invalid businessID, channel = " + strM77023a + ", inputBusinessId = " + j11 + ", resolvedBusinessId = " + jM77033f);
            if (i11 == 0) {
                str = "BusinessID invalid for " + strM77023a;
                i11 = TIMPushConstants.ERR_SET_PUSH_CONFIG_FAILED;
            }
        }
        final int i12 = i11;
        final String strM76893a = m76893a(i12, str);
        if (i12 == 0) {
            if (!this.f74943e.m76825a()) {
                this.f74942d.m76971c(new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.16
                    @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                    public void onError(int i13, String str4, Object obj) {
                        TIMPushManagerImpl.this.f74943e.m76826b();
                    }

                    @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                    public void onSuccess(Object obj) {
                        if (obj instanceof Long) {
                            TIMPushManagerImpl.this.f74943e.m76823a(((Long) obj).longValue());
                        }
                        TIMPushManagerImpl.this.f74943e.m76826b();
                    }
                });
            } else {
                this.f74943e.m76823a(TIMPushConfig.getInstance().getCustomBadgeNumber());
                this.f74943e.m76826b();
            }
        }
        m76910b(i12, strM76893a);
        this.f74942d.m76956a(str3, jM77033f, new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.17
            @Override // com.tencent.qcloud.tim.push.TIMPushCallback
            public void onError(final int i13, final String str4, Object obj) {
                IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.17.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (i12 == 0) {
                            TIMPushLog.m77017e(TIMPushManagerImpl.f74937p, "setOfflinePushConfig failed after token success, errCode = " + i13 + ", errMsg = " + str4);
                            TIMPushUtils.m77025a(tIMPushCallback, i13, str4, null);
                            return;
                        }
                        TIMPushLog.m77017e(TIMPushManagerImpl.f74937p, "setOfflinePushConfig failed and push token report failed, errCode = " + i12 + ", errMsg = " + strM76893a);
                        C3502117 c3502117 = C3502117.this;
                        TIMPushUtils.m77025a(tIMPushCallback, i12, strM76893a, null);
                    }
                });
            }

            @Override // com.tencent.qcloud.tim.push.TIMPushCallback
            public void onSuccess(Object obj) {
                IMContext.getInstance().runOnMainThread(new Runnable() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.17.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C3502117 c3502117 = C3502117.this;
                        if (i12 != 0) {
                            TIMPushLog.m77017e(TIMPushManagerImpl.f74937p, "setOfflinePushConfig finished, but push token report failed, errCode = " + i12 + ", errMsg = " + strM76893a);
                            C3502117 c3502118 = C3502117.this;
                            TIMPushUtils.m77025a(tIMPushCallback, i12, strM76893a, null);
                            return;
                        }
                        TIMPushUtils.m77026a(tIMPushCallback, str3);
                        TIMPushManagerImpl.this.m76909b();
                        if (TIMPushConfig.getInstance().getPushChannelId() == 2002) {
                            String str4 = "notificationEnabled:" + TIMPushUtils.m77021a(TIMPushManagerImpl.this.f74941c) + "|floatPermission:" + TIMPushUtils.m77041n() + "|bgStartPermission:" + TIMPushUtils.m77040m();
                            TIMPushLog.m77016d(TIMPushManagerImpl.f74937p, str4);
                            TIMPushManagerImpl.this.m76896a(4L, 1L, 1L, str4, TIMPushUtils.m77030c(), TIMPushUtils.m77035h(), null);
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m76896a(long j11, long j12, long j13, String str, String str2, String str3, final TIMPushCallback tIMPushCallback) {
        this.f74942d.m76949a(j11, j12, j13, str, str2, str3, new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.18
            @Override // com.tencent.qcloud.tim.push.TIMPushCallback
            public void onError(int i11, String str4, Object obj) {
                TIMPushUtils.m77025a(tIMPushCallback, i11, str4, null);
            }

            @Override // com.tencent.qcloud.tim.push.TIMPushCallback
            public void onSuccess(Object obj) {
                TIMPushUtils.m77026a(tIMPushCallback, null);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m76897a(Context context, int i11, TIMPushCallback tIMPushCallback) {
        if (i11 > 0) {
            TIMPushLog.m77016d(f74937p, "initSDK:" + i11);
            V2TIMManager.getInstance().initSDK(context, i11, new V2TIMSDKConfig());
        }
        if (V2TIMManager.getInstance().getLoginStatus() != 1) {
            TIMPushLog.m77016d(f74937p, "errcode:800001errMsg:not logined");
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_NOT_LOGINED, "not logined", null);
            return;
        }
        if (!m76907a(context)) {
            TIMPushLog.m77017e(f74937p, "invalid context");
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_INVALID_PARAM, "invalid context", null);
            return;
        }
        m76918d();
        TIMPushConfig.getInstance().setRunningScene(2, V2TIMManager.getInstance().getLoginUser());
        this.f74947i = TIMPushUtils.m77034g();
        String str = f74937p;
        TIMPushLog.m77016d(str, "registerPush mDeviceInfo = " + this.f74947i);
        TIMPushLog.m77016d(str, "push sdk version:9.0.7667, type:1, platform:" + TIMPushConfig.getInstance().getRunningPlatform() + ", scene:2");
        m76921e();
        this.f74952n.m76929a(tIMPushCallback);
        if (this.f74950l) {
            this.f74946h.m76851a(this.f74952n);
        } else {
            m76895a(TIMPushConstants.ERR_SET_PUSH_CONFIG_FAILED, "timpush-configs.json parse failed", 0L, "", this.f74952n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0107  */
    /* JADX INFO: renamed from: a */
    public final void m76898a(Context context, int i11, String str, TIMPushCallback tIMPushCallback) {
        if (TextUtils.isEmpty(str)) {
            m76897a(context, i11, tIMPushCallback);
            return;
        }
        if (i11 <= 0) {
            TIMPushLog.m77016d(f74937p, "errcode:800002errMsg:invalid sdkAppId:" + i11);
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_INVALID_SDK_APPID, "invalid sdkAppId", null);
            return;
        }
        if (!m76907a(context)) {
            TIMPushLog.m77017e(f74937p, "invalid context");
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_INVALID_PARAM, "invalid context", null);
            return;
        }
        m76918d();
        final boolean z11 = true;
        if (TIMPushConfig.getInstance().getRunningPlatform() == 3) {
            ActivityLifecycleHandler.f74844i = true;
        }
        this.f74947i = TIMPushUtils.m77034g();
        String str2 = f74937p;
        TIMPushLog.m77016d(str2, "register push mDeviceInfo = " + this.f74947i);
        TIMPushLog.m77016d(str2, "push sdk version:9.0.7667, type:1, platform:" + TIMPushConfig.getInstance().getRunningPlatform() + ", scene:4");
        this.f74953o.m76929a(tIMPushCallback);
        if (!this.f74942d.m76961a(this.f74941c, i11)) {
            TIMPushLog.m77017e(str2, "initSDK failed");
            this.f74953o.onError(TIMPushConstants.ERR_REGISTER_PUSH_INIT_FAILED, "init failed", null);
            return;
        }
        final String str3 = this.f74948j;
        if (TextUtils.isEmpty(str3)) {
            String loginUser = V2TIMManager.getInstance().getLoginUser();
            if (TextUtils.isEmpty(loginUser)) {
                z11 = false;
            } else {
                TIMPushLog.m77016d(str2, "register with loginUserID: " + loginUser);
                str3 = loginUser;
            }
        } else {
            TIMPushLog.m77016d(str2, "register registrationID: " + this.f74948j);
            if (!TextUtils.equals(str3, V2TIMManager.getInstance().getLoginUser())) {
                z11 = false;
            }
        }
        final boolean zIsEmpty = TextUtils.isEmpty(str3);
        this.f74942d.m76959a(str3, str, new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl.19
            @Override // com.tencent.qcloud.tim.push.TIMPushCallback
            public void onError(int i12, String str4, Object obj) {
                TIMPushManagerImpl.this.m76895a(i12, "Push login failed code=" + i12, 0L, "", TIMPushManagerImpl.this.f74953o);
            }

            @Override // com.tencent.qcloud.tim.push.TIMPushCallback
            public void onSuccess(Object obj) {
                TIMPushConfig.getInstance().setRunningScene(z11 ? 2 : 4, str3);
                TIMPushManagerImpl.this.m76921e();
                if (TIMPushManagerImpl.this.f74950l) {
                    TIMPushManagerImpl.this.f74946h.m76851a(TIMPushManagerImpl.this.f74953o);
                } else {
                    TIMPushManagerImpl tIMPushManagerImpl = TIMPushManagerImpl.this;
                    tIMPushManagerImpl.m76895a(TIMPushConstants.ERR_SET_PUSH_CONFIG_FAILED, "timpush-configs.json parse failed", 0L, "", tIMPushManagerImpl.f74953o);
                }
                if (zIsEmpty) {
                    TIMPushManagerImpl.this.f74949k = true;
                } else if (!z11) {
                    TIMPushManagerImpl.this.f74949k = false;
                }
                TIMPushLog.m77016d(TIMPushManagerImpl.f74937p, "push login success, isBuiltInPushAccount = " + zIsEmpty + ", isIMScene = " + z11 + ", registeredWithBuiltInAccount = " + TIMPushManagerImpl.this.f74949k);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m76902a(String str, Object obj, TIMPushCallback tIMPushCallback) {
        if (TextUtils.isEmpty(str)) {
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_CALL_EXPERIMENTAL_API_FAILED, "invalid api", null);
            return;
        }
        if (TextUtils.equals("getNotificationExtInfo", str)) {
            m76912b(tIMPushCallback);
            return;
        }
        if (TextUtils.equals(TUIConstants.TIMPush.METHOD_SET_PUSH_TOKEN, str)) {
            m76926i(obj, tIMPushCallback);
            return;
        }
        if (TextUtils.equals(TUIConstants.TIMPush.METHOD_GET_PUSH_TOKEN, str)) {
            m76920d(obj, tIMPushCallback);
            return;
        }
        if (TextUtils.equals(TUIConstants.TIMPush.METHOD_DISABLE_AUTO_REGISTER_PUSH, str)) {
            m76913b(obj, tIMPushCallback);
            return;
        }
        if (TextUtils.equals("disableRequestPostNotificationPermission", str)) {
            m76916c(obj, tIMPushCallback);
            return;
        }
        if (TextUtils.equals("createNotificationChannel", str)) {
            m76901a(obj, tIMPushCallback);
            return;
        }
        if (TextUtils.equals("setPushConfig", str)) {
            m76925h(obj, tIMPushCallback);
            return;
        }
        if (TextUtils.equals("getPushChannelId", str)) {
            m76915c(tIMPushCallback);
            return;
        }
        if (TextUtils.equals("setCustomBadgeNumber", str)) {
            m76924g(obj, tIMPushCallback);
            return;
        }
        if (TextUtils.equals("setAppLanguage", str)) {
            m76923f(obj, tIMPushCallback);
        } else if (TextUtils.equals("reportFCMPushArrived", str)) {
            m76922e(obj, tIMPushCallback);
        } else {
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_CALL_EXPERIMENTAL_API_FAILED, "unsupported api", null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76901a(Object obj, TIMPushCallback tIMPushCallback) {
        TIMPushCallback tIMPushCallback2;
        if (obj != null && (obj instanceof String)) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                TIMPushLog.m77017e(f74937p, "param is null");
                TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_CREATE_NOTIFICATION_CHANNEL_FAILED, "param is null", null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                tIMPushCallback2 = tIMPushCallback;
                try {
                    NotificationBuilder.m76983c().m76987a(this.f74941c, jSONObject.optString("channelName"), jSONObject.optString("channelID"), jSONObject.optString("channelDesc"), jSONObject.optString("channelSound"), tIMPushCallback2);
                } catch (Exception e11) {
                    e = e11;
                    Exception exc = e;
                    TIMPushLog.m77017e(f74937p, "createNotificationChannel e = " + exc);
                    TIMPushUtils.m77025a(tIMPushCallback2, TIMPushConstants.ERR_CREATE_NOTIFICATION_CHANNEL_FAILED, "exception: " + exc, null);
                }
            } catch (Exception e12) {
                e = e12;
                tIMPushCallback2 = tIMPushCallback;
            }
        } else {
            TIMPushLog.m77017e(f74937p, "param is not string");
            TIMPushUtils.m77025a(tIMPushCallback, TIMPushConstants.ERR_CREATE_NOTIFICATION_CHANNEL_FAILED, "param is not string", null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76907a(Context context) {
        if (this.f74941c == null && context != null) {
            m76911b(context.getApplicationContext());
        }
        return this.f74941c != null;
    }

    /* JADX INFO: renamed from: a */
    public final Object m76892a(String str) {
        try {
            String packageName = this.f74941c.getPackageName();
            if (TextUtils.equals("com.tencent.qcloud.tim.tuikit", packageName)) {
                packageName = "com.tencent.qcloud.tim.demo";
            }
            return Class.forName(packageName + ".BuildConfig").getField(str).get(null);
        } catch (Exception e11) {
            TIMPushLog.m77016d(f74937p, "getBuildConfigValue e = " + e11);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m76893a(int i11, String str) {
        if (i11 == 0) {
            return "Token request success";
        }
        return (!TextUtils.isEmpty(str) && m76908b(str) <= 128) ? str : "Token request failed";
    }
}
