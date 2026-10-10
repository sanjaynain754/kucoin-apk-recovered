package a3d20260409;

import aai.liveness.Detector$DetectionType;
import ai.advance.liveness.lib.Market;
import android.app.Application;
import android.text.TextUtils;
import com.datavisor.vangogh.face.DVTokenClient;
import java.util.ArrayList;
import java.util.List;
import p387k.C40826a;
import p387k.C40828c;
import p387k.C40833h;
import p442m.C42334d;
import p579r.C43890a;

/* JADX INFO: renamed from: a3d20260409.s */
/* JADX INFO: loaded from: classes23.dex */
public class C0106s extends C43890a {

    /* JADX INFO: renamed from: d */
    public static boolean f424d;

    /* JADX INFO: renamed from: e */
    public static int f425e;

    /* JADX INFO: renamed from: g */
    public static boolean f427g;

    /* JADX INFO: renamed from: f */
    public static List<Detector$DetectionType> f426f = new ArrayList();

    /* JADX INFO: renamed from: h */
    public static long f428h = 10000;

    /* JADX INFO: renamed from: i */
    public static long f429i = 50000;

    /* JADX INFO: renamed from: j */
    public static int f430j = -1;

    /* JADX INFO: renamed from: k */
    public static boolean f431k = false;

    /* JADX INFO: renamed from: l */
    public static boolean f432l = false;

    /* JADX INFO: renamed from: m */
    public static int f433m = 60;

    /* JADX INFO: renamed from: n */
    public static String f434n = null;

    /* JADX INFO: renamed from: n */
    public static void m488n(Application application, Market market) {
        m489o(application, market, false);
    }

    /* JADX INFO: renamed from: g */
    public static void m481g() {
        if (f431k) {
            return;
        }
        f430j = C40828c.m89332f();
        f431k = true;
    }

    /* JADX INFO: renamed from: h */
    public static void m482h(String str) {
        f434n = str;
        j3d20260409.O0OO0oOo0o(str);
    }

    /* JADX INFO: renamed from: k */
    public static String m485k() {
        return "3.6.14";
    }

    /* JADX INFO: renamed from: l */
    public static int m486l() {
        int iM527P = f425e;
        if (iM527P == 0) {
            iM527P = C0109v.m527P();
        }
        if (iM527P == 0) {
            return 600;
        }
        return iM527P;
    }

    /* JADX INFO: renamed from: m */
    public static String m487m() {
        return "3.6.14";
    }

    /* JADX INFO: renamed from: o */
    public static void m489o(Application application, Market market, boolean z11) {
        m490p(application, "", "", market, z11);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m492r() {
        return f424d;
    }

    /* JADX INFO: renamed from: f */
    public static DVTokenClient m480f() {
        try {
            return DVTokenClient.getInstance(C43890a.m96661b());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m483i() {
        m481g();
        if (C43890a.f96982c) {
            return C40826a.m89321g();
        }
        return f430j;
    }

    /* JADX INFO: renamed from: j */
    public static String m484j() {
        return C0109v.m549x();
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public static void m490p(Application application, String str, String str2, Market market, boolean z11) {
        if (!TextUtils.isEmpty(str)) {
            C40833h.m89363g("Static key authentication method is not secure, we will no longer support this authentication method in the future, please use license authentication method as soon as possible.");
            m482h("staticKey");
        }
        m493s(application, str, str2, market.getAlias(), z11);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m491q() {
        boolean z11;
        if (j3d20260409.O0OOOoOooo() && C40828c.m89334h(m483i()) != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            C0108u.m502b(intl.OOOoooooo.DEVICE_NOT_SUPPORT);
        }
        return z11;
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public static void m493s(Application application, String str, String str2, String str3, boolean z11) {
        if (!TextUtils.isEmpty(str3)) {
            C43890a.m96663d(application);
            C0109v.m543q(str.trim(), str2.trim(), m487m(), str3, "release", z11, C42334d.m92896d(application));
            return;
        }
        throw new RuntimeException("Market alias can not be empty!");
    }

    /* JADX INFO: renamed from: t */
    public static String m494t(String str) {
        m482h("license");
        return C0109v.m546u(str);
    }
}
