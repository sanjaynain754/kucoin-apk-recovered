package com.tencent.bugly.proguard;

import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.Locale;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ph */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33864ph {

    /* JADX INFO: renamed from: a */
    public static final String f71455a = "success";

    /* JADX INFO: renamed from: b */
    public static final String f71456b = "fail";

    /* JADX INFO: renamed from: c */
    public static final String f71457c = "blocked";

    /* JADX INFO: renamed from: d */
    public static final String f71458d = "cached";

    /* JADX INFO: renamed from: e */
    public static final String f71459e = "RMonitor_report";

    /* JADX INFO: renamed from: a */
    public static void m74587a(String str, String str2, ReportData reportData) {
        try {
            Logger.INSTANCE.mo77132i(f71459e, String.format(Locale.getDefault(), "start upload with {type: %s, url: %s, reportData: %s}", str, str2, reportData));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74585a(IReporter.ReportCallback reportCallback, String str, ReportData reportData, int i11, String str2, int i12) {
        m74586a(str, reportData, i11, str2, i12);
        if (reportCallback != null) {
            try {
                if ("success".equals(str)) {
                    reportCallback.onSuccess(reportData.getDbId(), i12);
                    return;
                }
                if (f71456b.equals(str)) {
                    reportCallback.onFailure(i11, str2, reportData.getDbId(), i12);
                } else if (f71457c.equals(str)) {
                    reportCallback.onBlocked(reportData.getDbId());
                } else if (f71458d.equals(str)) {
                    reportCallback.onCached();
                }
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(f71459e, "onResult", th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74586a(String str, ReportData reportData, int i11, String str2, int i12) {
        try {
            if ("success".equals(str)) {
                Logger.INSTANCE.mo77132i(f71459e, String.format(Locale.getDefault(), "upload success with {code: %s, msg: %s, contentLength: %d, reportData: %s}", Integer.valueOf(i11), str2, Integer.valueOf(i12), reportData));
            } else if (f71456b.equals(str)) {
                Logger.INSTANCE.mo77132i(f71459e, String.format(Locale.getDefault(), "upload fail with {code: %d, msg: %s, contentLength: %d, reportData: %s}", Integer.valueOf(i11), str2, Integer.valueOf(i12), reportData));
            } else if (f71457c.equals(str)) {
                Logger.INSTANCE.mo77132i(f71459e, String.format(Locale.getDefault(), "upload blocked with {code: %d, msg: %s, contentLength: %d, reportData: %s}", Integer.valueOf(i11), str2, Integer.valueOf(i12), reportData));
            }
        } catch (Throwable unused) {
        }
    }
}
