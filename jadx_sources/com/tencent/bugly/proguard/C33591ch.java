package com.tencent.bugly.proguard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.common.utils.ProcessUtil;
import com.tencent.bugly.common.utils.StringUtil;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.Random;
import java.util.UUID;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ch */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33591ch {

    /* JADX INFO: renamed from: a */
    public static final int f69460a = 16;

    /* JADX INFO: renamed from: b */
    public static final int f69461b = 8;

    /* JADX INFO: renamed from: c */
    public static final int f69462c = 255;

    /* JADX INFO: renamed from: e */
    public static final String f69464e = "RMonitor_trace";

    /* JADX INFO: renamed from: d */
    public static final Random f69463d = new Random();

    /* JADX INFO: renamed from: f */
    public static final String f69465f = m72739a();

    /* JADX INFO: renamed from: a */
    public static String m72741a(Context context) {
        return ProcessUtil.isMainProcess(context) ? f69465f : m72743b(context);
    }

    /* JADX INFO: renamed from: b */
    public static String m72743b(Context context) {
        String string;
        if (context != null) {
            try {
                string = C33716ig.m73433a().m73434a(context).getString(InterfaceC33611dg.f69593b, f69465f);
            } catch (Throwable th2) {
                Logger.INSTANCE.mo77131e(f69464e, "getLaunchIdFromCache, e: " + th2.getMessage());
                string = "";
            }
        } else {
            string = "";
        }
        return TextUtils.isEmpty(string) ? f69465f : string;
    }

    @SuppressLint({"ApplySharedPref"})
    /* JADX INFO: renamed from: c */
    public static void m72745c(Context context) {
        boolean zIsMainProcess = ProcessUtil.isMainProcess(context);
        if (zIsMainProcess) {
            try {
                C33716ig.m73433a().m73434a(context).edit().putString(InterfaceC33611dg.f69593b, f69465f).commit();
            } catch (Throwable th2) {
                Logger.INSTANCE.mo77131e(f69464e, "updateLaunchIdCache, e: " + th2.getMessage());
            }
        }
        Logger.INSTANCE.mo77132i(f69464e, "updateLaunchIdCache, launchId: " + f69465f + ", isMainProcess: " + zIsMainProcess);
    }

    /* JADX INFO: renamed from: d */
    public static String m72746d() {
        return f69465f;
    }

    /* JADX INFO: renamed from: a */
    public static String m72740a(int i11) {
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) (f69463d.nextInt(255) - 128);
        }
        return StringUtil.bytes2HexStr(bArr).toUpperCase();
    }

    /* JADX INFO: renamed from: b */
    public static String m72742b() {
        return m72740a(8);
    }

    /* JADX INFO: renamed from: c */
    public static String m72744c() {
        return m72740a(16);
    }

    /* JADX INFO: renamed from: a */
    public static String m72739a() {
        return StringUtil.getMD5(UUID.randomUUID().toString() + UUID.randomUUID().toString() + System.currentTimeMillis());
    }
}
