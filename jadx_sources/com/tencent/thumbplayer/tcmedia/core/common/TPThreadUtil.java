package com.tencent.thumbplayer.tcmedia.core.common;

import android.os.Process;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes63.dex */
public class TPThreadUtil {
    private static final String TAG = "PlayerCore.TPThreadUtil";

    public static void setThreadPriority(int i11) {
        if (i11 < -19 || i11 > 19) {
            TPNativeLog.printLog(4, "setThreadPriority error, priority range:[-19,20], priority:".concat(String.valueOf(i11)));
            return;
        }
        try {
            if (Process.getThreadPriority(0) != i11) {
                Process.setThreadPriority(i11);
            }
            TPNativeLog.printLog(2, "setThreadPriority, priority:".concat(String.valueOf(i11)));
        } catch (Exception e11) {
            TPNativeLog.printLog(4, TAG, e11.toString());
        }
    }

    public static void setThreadName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Thread.currentThread().setName(str);
    }
}
