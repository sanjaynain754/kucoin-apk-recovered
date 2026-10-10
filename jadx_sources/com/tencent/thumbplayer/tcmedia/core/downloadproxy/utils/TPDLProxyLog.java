package com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils;

import android.util.Log;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener;

/* JADX INFO: loaded from: classes63.dex */
public class TPDLProxyLog {
    private static ITPDLProxyLogListener mLogListener;
    private static int mServiceType;

    /* JADX INFO: renamed from: d */
    public static void m78073d(String str, int i11, String str2, String str3) {
        ITPDLProxyLogListener iTPDLProxyLogListener = mLogListener;
        if (iTPDLProxyLogListener != null) {
            iTPDLProxyLogListener.mo78015d(str, i11, str2, str3);
            return;
        }
        Log.d("[" + str2 + "][" + str + C33844oi.f71346o + i11 + "]", str3);
    }

    /* JADX INFO: renamed from: e */
    public static void m78074e(String str, int i11, String str2, String str3) {
        ITPDLProxyLogListener iTPDLProxyLogListener = mLogListener;
        if (iTPDLProxyLogListener != null) {
            iTPDLProxyLogListener.mo78016e(str, i11, str2, str3);
            return;
        }
        Log.e("[" + str2 + "][" + str + C33844oi.f71346o + i11 + "]", str3);
    }

    /* JADX INFO: renamed from: i */
    public static void m78075i(String str, int i11, String str2, String str3) {
        ITPDLProxyLogListener iTPDLProxyLogListener = mLogListener;
        if (iTPDLProxyLogListener != null) {
            iTPDLProxyLogListener.mo78017i(str, i11, str2, str3);
            return;
        }
        Log.i("[" + str2 + "][" + str + C33844oi.f71346o + i11 + "]", str3);
    }

    public static void setLogListener(int i11, ITPDLProxyLogListener iTPDLProxyLogListener) {
        mServiceType = i11;
        mLogListener = iTPDLProxyLogListener;
    }

    /* JADX INFO: renamed from: w */
    public static void m78076w(String str, int i11, String str2, String str3) {
        ITPDLProxyLogListener iTPDLProxyLogListener = mLogListener;
        if (iTPDLProxyLogListener != null) {
            iTPDLProxyLogListener.mo78018w(str, i11, str2, str3);
            return;
        }
        Log.w("[" + str2 + "][" + str + C33844oi.f71346o + i11 + "]", str3);
    }
}
