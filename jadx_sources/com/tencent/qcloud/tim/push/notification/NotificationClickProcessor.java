package com.tencent.qcloud.tim.push.notification;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.tencent.imsdk.offlinepush.OfflinePushEventItem;
import com.tencent.qcloud.tim.push.TIMPushCallback;
import com.tencent.qcloud.tim.push.TIMPushConstants;
import com.tencent.qcloud.tim.push.config.TIMPushConfig;
import com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tim.push.utils.TIMPushLog;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
public class NotificationClickProcessor {

    /* JADX INFO: renamed from: e */
    public static final String f75144e = "NotificationClickProcessor";

    /* JADX INFO: renamed from: f */
    public static final String f75145f = "ext";

    /* JADX INFO: renamed from: g */
    public static final String f75146g = "key_message";

    /* JADX INFO: renamed from: h */
    public static final String f75147h = "clickExt";

    /* JADX INFO: renamed from: i */
    public static final String f75148i = "notifyMode";

    /* JADX INFO: renamed from: j */
    public static final String f75149j = "0";

    /* JADX INFO: renamed from: k */
    public static final String f75150k = "1";

    /* JADX INFO: renamed from: l */
    public static final String f75151l = "2";

    /* JADX INFO: renamed from: a */
    public String f75152a;

    /* JADX INFO: renamed from: b */
    public String f75153b;

    /* JADX INFO: renamed from: c */
    public String f75154c;

    /* JADX INFO: renamed from: d */
    public TIMPushProvider f75155d;

    /* JADX INFO: renamed from: a */
    public void m77005a(TIMPushProvider tIMPushProvider) {
        this.f75155d = tIMPushProvider;
    }

    /* JADX INFO: renamed from: b */
    public final void m77008b(Bundle bundle) {
        Map map = null;
        try {
            Serializable serializable = bundle.getSerializable(f75146g);
            map = (Map) serializable.getClass().getMethod("getExtra", null).invoke(serializable, null);
        } catch (Exception e11) {
            TIMPushLog.m77017e(f75144e, "processsXiaomiMessage e = " + e11);
        }
        if (map == null) {
            TIMPushLog.m77017e(f75144e, "processsXiaomiMessage is null");
            return;
        }
        Object obj = map.get(f75148i);
        if (obj != null) {
            this.f75152a = obj.toString();
        } else {
            TIMPushLog.m77017e(f75144e, "processsXiaomiMessage notifyMode is null");
        }
        String str = f75144e;
        TIMPushLog.m77016d(str, "processsXiaomiMessage notifyMode: " + this.f75152a);
        Object obj2 = map.get("ext");
        if (obj2 != null) {
            this.f75153b = obj2.toString();
        } else {
            TIMPushLog.m77017e(str, "processsXiaomiMessage extObj is null");
        }
        TIMPushLog.m77016d(str, "processsXiaomiMessage ext: " + this.f75153b);
        Object obj3 = map.get("clickExt");
        if (obj3 != null) {
            this.f75154c = obj3.toString();
        } else {
            TIMPushLog.m77017e(str, "processsXiaomiMessage extClickObj is null");
        }
        TIMPushLog.m77016d(str, "processsXiaomiMessage extClick: " + this.f75154c);
    }

    /* JADX INFO: renamed from: a */
    public void m77004a(Intent intent, Context context) {
        if (intent == null) {
            TIMPushLog.m77017e(f75144e, "notificationIntent is null");
            return;
        }
        Bundle extras = intent.getExtras();
        String str = f75144e;
        TIMPushLog.m77016d(str, "bundle: " + extras);
        if (extras == null) {
            TIMPushLog.m77016d(str, "bundle is null");
            return;
        }
        this.f75152a = extras.getString(f75148i);
        this.f75153b = extras.getString("ext");
        this.f75154c = extras.getString("clickExt");
        TIMPushLog.m77016d(str, "push custom data notifyMode:" + this.f75152a + ", ext:" + this.f75153b + "extClick:" + this.f75154c);
        if (extras.getBoolean(TUIConstants.TIMPush.NOTIFICATION_CREATED_BY_IM_KEY, false)) {
            TIMPushLog.m77016d(str, "buildNotificationBySDK");
        } else {
            int pushChannelId = TIMPushConfig.getInstance().getPushChannelId();
            if (pushChannelId == 2000) {
                m77008b(extras);
            } else if (pushChannelId == 2004 && TextUtils.isEmpty(this.f75153b)) {
                this.f75153b = m77001a(extras);
            }
        }
        m77003a(context, extras.getBoolean(TIMPushConstants.NOTIFICATION_FROM_ONLINE_MESSAGE, false));
    }

    /* JADX INFO: renamed from: c */
    public final void m77010c(String str, Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e11) {
            TIMPushLog.m77017e(f75144e, "startWebView e=" + e11);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m77009b(String str, Context context) {
        try {
            Intent intent = new Intent();
            if (TIMPushConfig.getInstance().getRunningPlatform() == 2) {
                intent.setClassName(context.getPackageName(), "io.dcloud.PandoraEntry");
            } else {
                intent.setAction("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setPackage(context.getPackageName());
            }
            intent.putExtra("ext", str);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e11) {
            TIMPushLog.m77017e(f75144e, "startLauncherActivity e = " + e11);
            m77002a(context, str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m77001a(Bundle bundle) {
        Set<String> setKeySet = bundle.keySet();
        if (setKeySet == null) {
            return null;
        }
        for (String str : setKeySet) {
            Object obj = bundle.get(str);
            TIMPushLog.m77016d(f75144e, "push custom data key: " + str + " value: " + obj);
            if (TextUtils.equals(TUIConstants.TIMPush.NOTIFICATION.ENTITY, str)) {
                return obj.toString();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m77003a(Context context, boolean z11) {
        TIMPushLog.m77016d(f75144e, "handleResult ext: " + this.f75153b);
        if (TextUtils.isEmpty(this.f75152a)) {
            this.f75152a = "2";
        }
        m77007a(this.f75154c, z11);
        TIMPushManagerImpl.m76884c().m76917c(this.f75153b);
        if (TextUtils.equals(this.f75152a, "0")) {
            m77009b(this.f75153b, context);
        } else if (TextUtils.equals(this.f75152a, "1")) {
            m77010c(this.f75153b, context);
        } else {
            m77006a(this.f75153b, context);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m77007a(String str, boolean z11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        OfflinePushEventItem offlinePushEventItem = new OfflinePushEventItem();
        offlinePushEventItem.setPushId(str);
        offlinePushEventItem.setEventTime(System.currentTimeMillis() / 1000);
        if (z11) {
            offlinePushEventItem.setEventType(2);
        } else {
            offlinePushEventItem.setEventType(0);
        }
        offlinePushEventItem.setStatus(0);
        final ArrayList arrayList = new ArrayList();
        arrayList.add(offlinePushEventItem);
        if (!this.f75155d.m76973d()) {
            TIMPushManagerImpl.m76884c().m76904a(arrayList);
        } else {
            this.f75155d.m76960a(arrayList, new TIMPushCallback() { // from class: com.tencent.qcloud.tim.push.notification.NotificationClickProcessor.1
                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onError(int i11, String str2, Object obj) {
                    TIMPushManagerImpl.m76884c().m76904a(arrayList);
                }

                @Override // com.tencent.qcloud.tim.push.TIMPushCallback
                public void onSuccess(Object obj) {
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m77006a(String str, Context context) {
        if (TIMPushConfig.getInstance().getRunningPlatform() == 2 || TIMPushConfig.getInstance().getRunningPlatform() == 3 || TIMPushConfig.getInstance().getRunningPlatform() == 7 || TIMPushConfig.getInstance().getRunningPlatform() == 6) {
            m77009b(str, context);
        }
        HashMap map = new HashMap();
        map.put("ext", str);
        TUICore.notifyEvent("TIMPushNotifyEvent", "TIMPushNotifyEvent", map);
        if (context != null) {
            Intent intent = new Intent(TUIConstants.TIMPush.NOTIFICATION_BROADCAST_ACTION);
            intent.putExtra("ext", str);
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        } else {
            TIMPushLog.m77017e(f75144e, "null context");
        }
        this.f75155d.m76967b(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m77002a(Context context, String str) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null) {
                TIMPushLog.m77016d(f75144e, "launchIntent");
                launchIntentForPackage.addFlags(268435456);
                launchIntentForPackage.putExtra("ext", str);
                context.startActivity(launchIntentForPackage);
                return;
            }
            TIMPushLog.m77017e(f75144e, "launchIntent is null");
        } catch (Exception e11) {
            TIMPushLog.m77017e(f75144e, "launchIntent e = " + e11);
        }
    }
}
