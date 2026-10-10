package com.github.penfeizhou.animation.webp.decode;

import com.github.penfeizhou.animation.p065io.Reader;
import com.jumio.core.constants.ConstantsKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p451m8.C42474a;
import p451m8.C42475b;
import p451m8.C42476c;
import p451m8.C42478e;
import p451m8.C42479f;
import p451m8.C42480g;
import p451m8.C42482i;
import p451m8.C42483j;
import p451m8.C42484k;
import p451m8.C42486m;
import p466n8.C42774a;

/* JADX INFO: loaded from: classes.dex */
public class WebPParser {

    /* JADX INFO: loaded from: classes45.dex */
    public static class FormatException extends IOException {
        public FormatException() {
            super("WebP Format error");
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m12803a(Reader reader) {
        C42774a c42774a = reader instanceof C42774a ? (C42774a) reader : new C42774a(reader);
        try {
            if (!c42774a.m93727f("RIFF")) {
                return false;
            }
            c42774a.skip(4L);
            if (!c42774a.m93727f(ConstantsKt.FILE_TYPE_WEBP)) {
                return false;
            }
            while (c42774a.available() > 0) {
                C42478e c42478eM12805c = m12805c(c42774a);
                if (c42478eM12805c instanceof C42484k) {
                    return ((C42484k) c42478eM12805c).m93171e();
                }
            }
        } catch (IOException e11) {
            if (!(e11 instanceof FormatException)) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static List<C42478e> m12804b(C42774a c42774a) throws IOException {
        if (!c42774a.m93727f("RIFF")) {
            throw new FormatException();
        }
        c42774a.skip(4L);
        if (!c42774a.m93727f(ConstantsKt.FILE_TYPE_WEBP)) {
            throw new FormatException();
        }
        ArrayList arrayList = new ArrayList();
        while (c42774a.available() > 0) {
            arrayList.add(m12805c(c42774a));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static C42478e m12805c(C42774a c42774a) throws IOException {
        C42478e c42478e;
        int iPosition = c42774a.position();
        int iM93723b = c42774a.m93723b();
        int iM93726e = c42774a.m93726e();
        if (C42484k.f94127g == iM93723b) {
            c42478e = new C42484k();
        } else if (C42475b.f94100f == iM93723b) {
            c42478e = new C42475b();
        } else if (C42476c.f94103m == iM93723b) {
            c42478e = new C42476c();
        } else if (C42474a.f94099d == iM93723b) {
            c42478e = new C42474a();
        } else if (C42482i.f94125d == iM93723b) {
            c42478e = new C42482i();
        } else if (C42483j.f94126d == iM93723b) {
            c42478e = new C42483j();
        } else if (C42480g.f94124d == iM93723b) {
            c42478e = new C42480g();
        } else if (C42486m.f94139d == iM93723b) {
            c42478e = new C42486m();
        } else if (C42479f.f94123d == iM93723b) {
            c42478e = new C42479f();
        } else {
            c42478e = new C42478e();
        }
        c42478e.f94120a = iM93723b;
        c42478e.f94121b = iM93726e;
        c42478e.f94122c = iPosition;
        c42478e.m93168c(c42774a);
        return c42478e;
    }
}
