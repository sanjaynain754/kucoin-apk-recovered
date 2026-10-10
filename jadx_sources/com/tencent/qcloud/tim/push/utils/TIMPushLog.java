package com.tencent.qcloud.tim.push.utils;

import android.util.Log;
import com.tencent.imsdk.common.IMLog;
import com.tencent.imsdk.manager.BaseManager;

/* JADX INFO: loaded from: classes56.dex */
public class TIMPushLog extends IMLog {

    /* JADX INFO: renamed from: a */
    public static final String f75162a = "TIMPush-";

    /* JADX INFO: renamed from: a */
    public static String m77014a(String str) {
        return "TIMPush-" + str;
    }

    /* JADX INFO: renamed from: a */
    public static void m77015a(int i11, String str, String str2) {
        if (BaseManager.getInstance().isInited()) {
            return;
        }
        if (i11 == 2) {
            Log.v(str, str2);
            return;
        }
        if (i11 == 3) {
            Log.d(str, str2);
            return;
        }
        if (i11 == 4) {
            Log.i(str, str2);
        } else if (i11 == 5) {
            Log.w(str, str2);
        } else {
            if (i11 != 6) {
                return;
            }
            Log.e(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m77016d(String str, String str2) {
        IMLog.m75913d(m77014a(str), str2);
        m77015a(3, m77014a(str), str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m77017e(String str, String str2) {
        IMLog.m75914e(m77014a(str), str2);
        m77015a(6, m77014a(str), str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m77018i(String str, String str2) {
        IMLog.m75915i(m77014a(str), str2);
        m77015a(4, m77014a(str), str2);
    }

    /* JADX INFO: renamed from: v */
    public static void m77019v(String str, String str2) {
        IMLog.m75916v(m77014a(str), str2);
        m77015a(2, m77014a(str), str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m77020w(String str, String str2) {
        IMLog.m75917w(m77014a(str), str2);
        m77015a(5, m77014a(str), str2);
    }
}
