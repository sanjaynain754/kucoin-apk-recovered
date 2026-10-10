package cn.jiguang.privates.common.component;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.core.api.WakeMessage;
import cn.jiguang.privates.push.api.AliasMessage;
import cn.jiguang.privates.push.api.CustomMessage;
import cn.jiguang.privates.push.api.MobileNumberMessage;
import cn.jiguang.privates.push.api.NotificationMessage;
import cn.jiguang.privates.push.api.PlatformTokenMessage;
import cn.jiguang.privates.push.api.TagMessage;

/* JADX INFO: loaded from: classes.dex */
public class JCommonReceiver extends BroadcastReceiver {
    private static final String TAG = "JCommonReceiver";

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            if (TextUtils.equals(action, "android.net.conn.CONNECTIVITY_CHANGE")) {
                JCommonPrivatesApi.sendMessageToMainProcess(context.getApplicationContext(), 1007, extras);
            } else {
                JCommonPrivatesApi.sendMessageToMainProcess(context.getApplicationContext(), Integer.parseInt(action), extras);
            }
        } catch (Throwable th2) {
            JCommonLog.m5433w(TAG, "onReceiver failed " + th2.getMessage());
        }
    }

    public void onAliasMessage(Context context, AliasMessage aliasMessage) {
    }

    public void onConnectStatus(Context context, boolean z11) {
    }

    public void onCustomMessage(Context context, CustomMessage customMessage) {
    }

    public void onMobileNumber(Context context, MobileNumberMessage mobileNumberMessage) {
    }

    public void onNotificationArrived(Context context, NotificationMessage notificationMessage) {
    }

    public void onNotificationClicked(Context context, NotificationMessage notificationMessage) {
    }

    public void onNotificationDeleted(Context context, NotificationMessage notificationMessage) {
    }

    public void onNotificationStatus(Context context, boolean z11) {
    }

    public void onPlatformToken(Context context, PlatformTokenMessage platformTokenMessage) {
    }

    public void onTagMessage(Context context, TagMessage tagMessage) {
    }

    public void onWake(Context context, WakeMessage wakeMessage) {
    }
}
