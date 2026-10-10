package p611s;

import ai.advance.sdk.global.iqa.lib.JNI;
import ai.advance.sdk.global.iqa.lib.code.ErrorCode;
import android.app.Application;
import p387k.C40828c;
import p579r.C43890a;

/* JADX INFO: renamed from: s.b */
/* JADX INFO: loaded from: classes23.dex */
public final class C44206b extends C44226j {

    /* JADX INFO: renamed from: d */
    public static String f97560d;

    /* JADX INFO: renamed from: g */
    public static String m97447g() {
        return "1.5.4";
    }

    /* JADX INFO: renamed from: f */
    public static int m97446f() {
        return C40828c.m89330d();
    }

    /* JADX INFO: renamed from: h */
    public static void m97448h(Application application) {
        C43890a.m96663d(application);
        C43890a.m96664e("global-iqa");
        JNI.m1358c(m97447g(), application.getPackageName());
    }

    /* JADX INFO: renamed from: i */
    public static boolean m97449i() {
        boolean z11;
        if (JNI.m1359d() && C40828c.m89334h(m97446f()) != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            C44203a.m97442o(ErrorCode.DEVICE_NOT_SUPPORT);
        }
        return z11;
    }

    /* JADX INFO: renamed from: j */
    public static String m97450j(String str) {
        return JNI.nativeLicenseAuth(str);
    }
}
