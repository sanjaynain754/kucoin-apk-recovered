package com.ishumei.smantifraud.l1111l111111Il;

import android.os.Build;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ishumei.smantifraud.SmAntiFraud;
import com.tencent.bugly.proguard.C33556b3;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes56.dex */
public final class l11l1111I1l {
    private final SmAntiFraud.SmOption l1111l111111Il;

    public static class l1111l111111Il {
        private static final l11l1111I1l l1111l111111Il = new l11l1111I1l(0);

        private l1111l111111Il() {
        }
    }

    private l11l1111I1l() {
        this.l1111l111111Il = SmAntiFraud.option;
    }

    public static l11l1111I1l l1111l111111Il() {
        return l1111l111111Il.l1111l111111Il;
    }

    private l11l1111I11l l111l11111lIl() {
        l11l1111I11l l11l1111i11l = new l11l1111I11l();
        l11l1111i11l.l11l1111I11l("exception");
        l11l1111i11l.l111l1111llIl("android");
        l11l1111i11l.l111l1111lIl("3.7.3");
        l11l1111i11l.l11l1111I1ll(com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l111l11111lIl());
        l11l1111i11l.l11l1111Il(com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l111l11111I1l());
        l11l1111i11l.l111l1111lI1l(Build.VERSION.RELEASE);
        l11l1111i11l.l11l1111lIIl(Build.MODEL);
        SmAntiFraud.SmOption smOption = this.l1111l111111Il;
        if (smOption != null) {
            l11l1111i11l.l111l11111Il(smOption.l11l1111I11l());
            l11l1111i11l.l111l1111l1Il(this.l1111l111111Il.l11l1111Ill());
        }
        l11l1111i11l.l111l11111lIl(com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il.l1111l111111Il().l111l11111Il());
        com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il.l1111l111111Il();
        l11l1111i11l.l111l11111I1l("");
        l11l1111i11l.l1111l111111Il(com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il.l1111l111111Il().l111l11111I1l());
        return l11l1111i11l;
    }

    public /* synthetic */ l11l1111I1l(byte b11) {
        this();
    }

    private static String l111l11111lIl(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            do {
                th2.printStackTrace(printWriter);
                th2 = th2.getCause();
            } while (th2 != null);
            printWriter.close();
            String string = stringWriter.toString();
            return string.length() > 4096 ? string.substring(0, 4096) : string;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String l1111l111111Il(Throwable th2) {
        try {
            l11l1111I11l l11l1111i11l = new l11l1111I11l();
            l11l1111i11l.l11l1111I11l("exception");
            l11l1111i11l.l111l1111llIl("android");
            l11l1111i11l.l111l1111lIl("3.7.3");
            l11l1111i11l.l11l1111I1ll(com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l111l11111lIl());
            l11l1111i11l.l11l1111Il(com.ishumei.smantifraud.l111l11111I1l.l111l11111lIl.l111l11111I1l());
            l11l1111i11l.l111l1111lI1l(Build.VERSION.RELEASE);
            l11l1111i11l.l11l1111lIIl(Build.MODEL);
            SmAntiFraud.SmOption smOption = this.l1111l111111Il;
            if (smOption != null) {
                l11l1111i11l.l111l11111Il(smOption.l11l1111I11l());
                l11l1111i11l.l111l1111l1Il(this.l1111l111111Il.l11l1111Ill());
            }
            l11l1111i11l.l111l11111lIl(com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il.l1111l111111Il().l111l11111Il());
            com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il.l1111l111111Il();
            l11l1111i11l.l111l11111I1l("");
            l11l1111i11l.l1111l111111Il(com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il.l1111l111111Il().l111l11111I1l());
            l11l1111i11l.l11l1111I1l(l111l11111lIl(th2));
            String strL1111l111111Il = com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il(com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il(l11l1111i11l, (Set<String>) null).toString().getBytes());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("organization", l11l1111i11l.l1111l111111Il());
            jSONObject.put(C33556b3.f69078o2, "android");
            SmAntiFraud.SmOption smOption2 = this.l1111l111111Il;
            if (smOption2 != null) {
                jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, smOption2.l11l1111Ill());
            }
            jSONObject.put("encode", 1);
            jSONObject.put("data", strL1111l111111Il);
            jSONObject.put("tn", "");
            jSONObject.put("ep", "");
            return jSONObject.toString();
        } catch (Throwable th3) {
            return th3.toString();
        }
    }
}
