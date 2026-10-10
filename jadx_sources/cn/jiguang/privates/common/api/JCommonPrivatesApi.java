package cn.jiguang.privates.common.api;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.jiguang.privates.common.JCommon;
import cn.jiguang.privates.common.binder.JMessenger;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.handler.JHandler;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.common.observer.JObservable;
import cn.jiguang.privates.common.observer.JObserver;

/* JADX INFO: loaded from: classes.dex */
public class JCommonPrivatesApi {
    public static final int SDK_VERSION_CODE = 220;
    public static final String SDK_VERSION_NAME = "2.2.0";
    private static final String TAG = "JCommonPrivatesApi";

    public static void buildHandler(Context context, String str) {
        JHandler.getInstance().buildHandler(context, str);
    }

    public static void buildHandler(Context context, String str, int i11) {
        JHandler.getInstance().buildHandler(context, str, i11);
    }

    public static void init(Context context, boolean z11) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "can't init with empty context");
            return;
        }
        if (JGlobal.isMainProcess(context.getApplicationContext()) || JGlobal.isRemoteProcess(context.getApplicationContext())) {
            JGlobal.context = context.getApplicationContext();
            JGlobal.isNeedRemoteProcess = z11 || JGlobal.isNeedRemoteProcess;
            if (JGlobal.isMainProcess(context.getApplicationContext())) {
                sendMessage(context, JCommon.THREAD_COMMON, 1000, null);
            }
        }
    }

    public static void observer(Context context, JObserver jObserver) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "can't observer with empty context");
        } else if (JGlobal.isMainProcess(context.getApplicationContext())) {
            JObservable.getInstance().observer(context.getApplicationContext(), jObserver);
        } else {
            JCommonLog.m5431e(TAG, "can't observer in another process");
        }
    }

    public static void sendMessage(Context context, String str, int i11, Bundle bundle) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "can't sendMessage with empty context");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5431e(TAG, "can't sendMessage with empty name");
        } else if (JGlobal.isMainProcess(context.getApplicationContext()) || JGlobal.isRemoteProcess(context.getApplicationContext())) {
            JHandler.getInstance().sendMessage(context, str, i11, bundle);
        } else {
            JCommonLog.m5431e(TAG, "can't sendMessage in another process");
        }
    }

    public static void sendMessageDelayed(Context context, String str, int i11, Bundle bundle, long j11) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "can't sendMessageDelayed with empty context");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            JCommonLog.m5431e(TAG, "can't sendMessageDelayed with empty name");
        } else if (JGlobal.isMainProcess(context.getApplicationContext()) || JGlobal.isRemoteProcess(context.getApplicationContext())) {
            JHandler.getInstance().sendMessageDelayed(context, str, i11, bundle, j11);
        } else {
            JCommonLog.m5431e(TAG, "can't sendMessageDelayed in another process");
        }
    }

    public static void sendMessageToMainProcess(Context context, int i11, Bundle bundle) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "can't sendMessageToMainProcess with empty context");
        } else {
            JMessenger.getInstance().sendMessageToMainProcess(context.getApplicationContext(), i11, bundle);
        }
    }

    public static void sendMessageToRemoteProcess(Context context, int i11, Bundle bundle) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "can't sendMessageToRemoteProcess with empty context");
        } else {
            JMessenger.getInstance().sendMessageToRemoteProcess(context.getApplicationContext(), i11, bundle);
        }
    }

    public static void releaseHandler(Context context, String str) {
        JHandler.getInstance().releaseHandler(context, str);
    }

    public static void removeMessages(Context context, String str, int i11) {
        JHandler.getInstance().removeMessages(context, str, i11);
    }
}
