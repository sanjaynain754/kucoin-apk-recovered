package com.github.penfeizhou.animation.apng.decode;

import com.github.penfeizhou.animation.p065io.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p010a8.C0190a;
import p010a8.C0193d;
import p010a8.C0194e;
import p010a8.C0195f;
import p010a8.C0196g;
import p010a8.C0197h;
import p010a8.C0198i;
import p036b8.C4503a;

/* JADX INFO: loaded from: classes.dex */
public class APNGParser {

    /* JADX INFO: loaded from: classes45.dex */
    public static class FormatException extends IOException {
        public FormatException() {
            super("APNG Format error");
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12746a(Reader reader) {
        C4503a c4503a = reader instanceof C4503a ? (C4503a) reader : new C4503a(reader);
        try {
            if (!c4503a.m4309a("\u0089PNG") || !c4503a.m4309a("\r\n\u001a\n")) {
                throw new FormatException();
            }
            while (c4503a.available() > 0) {
                if (m12748c(c4503a) instanceof C0190a) {
                    return true;
                }
            }
            return false;
        } catch (IOException e11) {
            if (e11 instanceof FormatException) {
                return false;
            }
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<C0193d> m12747b(C4503a c4503a) throws IOException {
        if (c4503a.m4309a("\u0089PNG") && c4503a.m4309a("\r\n\u001a\n")) {
            ArrayList arrayList = new ArrayList();
            while (c4503a.available() > 0) {
                arrayList.add(m12748c(c4503a));
            }
            return arrayList;
        }
        throw new FormatException();
    }

    /* JADX INFO: renamed from: c */
    public static C0193d m12748c(C4503a c4503a) throws IOException {
        C0193d c0193d;
        int iPosition = c4503a.position();
        int iM4311c = c4503a.m4311c();
        int iM4310b = c4503a.m4310b();
        if (iM4310b == C0190a.f561g) {
            c0193d = new C0190a();
        } else if (iM4310b == C0194e.f584n) {
            c0193d = new C0194e();
        } else if (iM4310b == C0195f.f594f) {
            c0193d = new C0195f();
        } else if (iM4310b == C0196g.f596e) {
            c0193d = new C0196g();
        } else if (iM4310b == C0197h.f597e) {
            c0193d = new C0197h();
        } else if (iM4310b == C0198i.f598h) {
            c0193d = new C0198i();
        } else {
            c0193d = new C0193d();
        }
        c0193d.f583d = iPosition;
        c0193d.f581b = iM4310b;
        c0193d.f580a = iM4311c;
        c0193d.m770c(c4503a);
        c0193d.f582c = c4503a.m4311c();
        return c0193d;
    }
}
