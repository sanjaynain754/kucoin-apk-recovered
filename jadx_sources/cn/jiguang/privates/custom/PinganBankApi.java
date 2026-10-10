package cn.jiguang.privates.custom;

import android.content.Context;
import cn.jiguang.privates.common.global.JGlobal;
import cn.jiguang.privates.common.log.JCommonLog;
import cn.jiguang.privates.core.global.JCoreGlobal;

/* JADX INFO: loaded from: classes34.dex */
public class PinganBankApi {
    private static final String TAG = "PinganBankApi";

    public static void configOnlyBeWake(Context context, boolean z11) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "configOnlyBeWake context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext()) || JGlobal.isRemoteProcess(context.getApplicationContext())) {
            JCoreGlobal.setOnlyBeWakeState(z11);
        }
    }

    public static void configOnlyWake(Context context, boolean z11) {
        if (context == null) {
            JCommonLog.m5431e(TAG, "configOnlyWake context can't be null, please check it");
        } else if (JGlobal.isMainProcess(context.getApplicationContext()) || JGlobal.isRemoteProcess(context.getApplicationContext())) {
            JCoreGlobal.setOnlyWakeState(z11);
        }
    }
}
