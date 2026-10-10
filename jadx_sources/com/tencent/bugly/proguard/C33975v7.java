package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.logger.Logger;
import java.net.SocketException;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.v7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33975v7 {

    /* JADX INFO: renamed from: a */
    public static final String f72328a = "HttpErrorUtils";

    /* JADX INFO: renamed from: b */
    public static final int f72329b = 900;

    /* JADX INFO: renamed from: c */
    public static final int f72330c = 901;

    /* JADX INFO: renamed from: d */
    public static final int f72331d = 902;

    /* JADX INFO: renamed from: e */
    public static final int f72332e = 903;

    /* JADX INFO: renamed from: f */
    public static final int f72333f = 904;

    /* JADX INFO: renamed from: g */
    public static final int f72334g = 907;

    /* JADX INFO: renamed from: h */
    public static final int f72335h = 908;

    /* JADX INFO: renamed from: i */
    public static final int f72336i = 911;

    /* JADX INFO: renamed from: j */
    public static final int f72337j = 917;

    /* JADX INFO: renamed from: k */
    public static volatile C33975v7 f72338k;

    /* JADX INFO: renamed from: a */
    public static C33975v7 m75289a() {
        if (f72338k == null) {
            synchronized (C33975v7.class) {
                try {
                    if (f72338k == null) {
                        f72338k = new C33975v7();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f72338k;
    }

    /* JADX INFO: renamed from: a */
    public boolean m75290a(Exception exc) {
        if (exc == null) {
            return false;
        }
        try {
            return (exc instanceof SocketException) && exc.getMessage().contains("recvfrom failed: ECONNRESET (Connection reset by peer)");
        } catch (Exception e11) {
            Logger.INSTANCE.exception(f72328a, "isSocketECONNRESET error", e11);
            return false;
        }
    }
}
