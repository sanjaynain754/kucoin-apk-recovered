package com.forter.mobile.fortersdk;

import com.tencent.bugly.proguard.RunnableC33958ua;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.UUID;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6555j {

    /* JADX INFO: renamed from: a */
    public static final DecimalFormat f10971a = new DecimalFormat(RunnableC33958ua.f72251f);

    /* JADX INFO: renamed from: a */
    public final C6510ae m12399a(String str, String str2, C6511aj c6511aj, int i11) {
        C6511aj.d dVarM12137a;
        if (i11 <= 0) {
            return new C6510ae();
        }
        C6511aj.d dVar = null;
        try {
            String strReplace = "https://#SID#.cdn4.forter.com/mob/v3/#SID#/prop.json?t=#TS#&s=#BS#&u=#UID#&r=#RT#&seed=#SEED#&bn=#BNUMBER#".replace("#SID#", str).replace("#UID#", str2).replace("#TS#", f10971a.format(System.currentTimeMillis() / 60000)).replace("#RT#", String.valueOf(i11)).replace("#BS#", "5d28616add6fd8b22170274424d204a7").replace("#BNUMBER#", "75").replace("#BNAME#", "2.4.12").replace("#SEED#", UUID.randomUUID().toString());
            "Fetching conf from URL: ".concat(String.valueOf(strReplace));
            AbstractC6524c3.m12214f();
            dVarM12137a = c6511aj.m12137a(strReplace, null, null);
            try {
                C6595r c6595r = new C6595r(dVarM12137a);
                int i12 = c6595r.f11047a;
                if (i12 >= 300 || i12 == -1) {
                    C6510ae c6510aeM12399a = m12399a(str, str2, c6511aj, i11 - 1);
                    C6585p.m12460d(dVarM12137a);
                    return c6510aeM12399a;
                }
                try {
                    String strM12178c = C6519bk.m12178c(c6595r.f11048b);
                    if (strM12178c != null && strM12178c.length() > 0) {
                        C6510ae c6510ae = new C6510ae(strM12178c);
                        C6585p.m12460d(dVarM12137a);
                        return c6510ae;
                    }
                    AbstractC6524c3.m12209a();
                    C6510ae c6510aeM12399a2 = m12399a(str, str2, c6511aj, i11 - 1);
                    C6585p.m12460d(dVarM12137a);
                    return c6510aeM12399a2;
                } catch (Throwable unused) {
                    AbstractC6524c3.m12212d();
                    C6510ae c6510aeM12399a3 = m12399a(str, str2, c6511aj, i11 - 1);
                    C6585p.m12460d(dVarM12137a);
                    return c6510aeM12399a3;
                }
            } catch (Throwable unused2) {
                try {
                    AbstractC6524c3.m12212d();
                    C6585p.m12460d(dVarM12137a);
                    try {
                        C6510ae c6510aeM12399a4 = m12399a(str, str2, c6511aj, i11 - 1);
                        C6585p.m12460d(null);
                        return c6510aeM12399a4;
                    } catch (Throwable th2) {
                        th = th2;
                        C6585p.m12460d(dVar);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dVar = dVarM12137a;
                }
            }
        } catch (Throwable unused3) {
            dVarM12137a = null;
        }
    }

    public C6555j() {
        f10971a.setRoundingMode(RoundingMode.UP);
    }
}
