package com.tencent.timpush.fcm;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.NotificationParams;
import com.google.firebase.messaging.RemoteMessage;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.qcloud.tuicore.TUICore;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public class TIMPushFCMMsgService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: a */
    public static final String f76631a = "TIMPushFCMMsgService";

    /* JADX INFO: renamed from: b */
    public static final int f76632b = 10;

    /* JADX INFO: renamed from: c */
    public static final String f76633c = "com.google.android.c2dm.intent.RECEIVE";

    /* JADX INFO: renamed from: d */
    public static final Queue<String> f76634d = new ArrayDeque(10);

    /* JADX INFO: renamed from: a */
    public static Map<String, String> m78951a(Intent intent, boolean z11) {
        if (intent == null) {
            Log.e(f76631a, "intent is null");
            return null;
        }
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID);
        String str = f76631a;
        Log.d(str, "action=" + action + ", messageId=" + stringExtra + ", skipNotificationTypeFilter=" + z11);
        try {
            if (!f76633c.equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
                Log.i(str, "skip unknown action=" + action);
                return null;
            }
            String stringExtra2 = intent.getStringExtra(Constants.MessagePayloadKeys.MESSAGE_TYPE);
            if (stringExtra2 != null && !Constants.MessageTypes.MESSAGE.equals(stringExtra2)) {
                Log.i(str, "skip messageType=" + stringExtra2 + ", messageId=" + stringExtra);
                return null;
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                Log.w(str, "skip null extras, messageId=" + stringExtra);
                return null;
            }
            if (!z11 && !NotificationParams.isNotification(extras)) {
                Log.i(str, "skip non-notification payload, messageId=" + stringExtra);
                return null;
            }
            if (m78952a(stringExtra)) {
                return null;
            }
            Map<String, String> data = new RemoteMessage(extras).getData();
            if (data != null && !data.isEmpty()) {
                Log.i(str, "parse success, messageId=" + stringExtra + ", pushId=" + data.get("clickExt"));
                return data;
            }
            Log.w(str, "skip empty data map, messageId=" + stringExtra);
            return null;
        } catch (Exception e11) {
            e = e11;
            Log.e(f76631a, "handle failed, messageId=" + stringExtra, e);
            return null;
        } catch (LinkageError e12) {
            e = e12;
            Log.e(f76631a, "handle failed, messageId=" + stringExtra, e);
            return null;
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) throws Throwable {
        HashMap map = new HashMap();
        if (remoteMessage == null || remoteMessage.getData() == null || remoteMessage.getData().isEmpty()) {
            Log.e(f76631a, "received message is null");
            map.put(TUIConstants.TIMPush.PUSH_MESSAGE_DATA_KEY, new HashMap());
            TUICore.callService("TIMPushService", TUIConstants.TIMPush.METHOD_SET_PUSH_MESSAGE_DATA, map);
            return;
        }
        Map<String, String> data = remoteMessage.getData();
        Log.d(f76631a, "Message data payload: " + data);
        map.put(TUIConstants.TIMPush.PUSH_MESSAGE_DATA_KEY, data);
        TUICore.callService("TIMPushService", TUIConstants.TIMPush.METHOD_SET_PUSH_MESSAGE_DATA, map);
        m78953a(remoteMessage.getData());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) throws Throwable {
        super.handleIntent(intent);
        Map<String, String> mapM78951a = m78951a(intent, false);
        if (mapM78951a == null) {
            return;
        }
        m78953a(mapM78951a);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        Log.i(f76631a, "onNewToken: " + str);
        TIMPushErrorBean tIMPushErrorBean = new TIMPushErrorBean();
        tIMPushErrorBean.m78941a(0L);
        tIMPushErrorBean.m78942a(str);
        TIMPushFCMService.getInstance().callbackData(tIMPushErrorBean);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m78952a(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.w(f76631a, "empty messageId, dedup disabled");
            return false;
        }
        Queue<String> queue = f76634d;
        if (queue.contains(str)) {
            Log.i(f76631a, "duplicate message, messageId=" + str);
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m78953a(Map<String, String> map) throws Throwable {
        String str = map.get("IMReportURL");
        String str2 = map.get("clickExt");
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        WorkManager.getInstance(getApplicationContext()).enqueue(new OneTimeWorkRequest.Builder(TIMPushFCMWorker.class).setInputData(new Data.Builder().putString("url", str).putString("pushId", str2).putLong("time", System.currentTimeMillis() / 1000).putInt("type", 1).build()).build());
    }
}
