package p611s;

import ai.advance.sdk.global.iqa.lib.EnumC0360w;
import ai.advance.sdk.global.iqa.lib.JNI;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import p277g.C37738d;
import p277g.C37739e;
import p277g.InterfaceC37735a;
import p442m.C42337g;
import p457n.C42685f;
import p457n.C42686g;
import p457n.C42687h;
import p482o.C42901a;
import p520p.AbstractC43343d;
import p520p.C43341b;
import p579r.C43890a;

/* JADX INFO: renamed from: s.m */
/* JADX INFO: loaded from: classes23.dex */
public class C44232m {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C37738d m97525c(C42687h c42687h, String str) {
        return new C37738d.b("network_performance").m85093j(c42687h.m93550b().m93571d()).m85094k("networkLib", "java").m85094k("url", str).m85094k("networkType", C42337g.m92907d(C43890a.m96661b())).m85094k("transactionId", c42687h.m93551c()).m85097n(true).m85096m();
    }

    /* JADX INFO: renamed from: d */
    public static void m97526d(EnumC0360w enumC0360w, C42687h c42687h, C37739e c37739e) {
        if (enumC0360w == EnumC0360w.MIXED_EVENT) {
            return;
        }
        m97528f(c42687h, JNI.getUrlByType(enumC0360w.name()), c37739e);
    }

    /* JADX INFO: renamed from: g */
    public static String m97529g(File file) {
        int i11;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[1024];
                while (true) {
                    int i12 = fileInputStream.read(bArr);
                    if (i12 == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i12);
                    e.printStackTrace();
                    return null;
                }
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb2 = new StringBuilder();
                for (byte b11 : bArrDigest) {
                    String hexString = Integer.toHexString(b11 & 255);
                    if (hexString.length() == 1) {
                        sb2.append('0');
                    }
                    sb2.append(hexString);
                }
                String string = sb2.toString();
                fileInputStream.close();
                return string;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static Pair<C42687h, Integer> m97531i(EnumC0360w enumC0360w, String str, C37739e c37739e) {
        return m97524b(enumC0360w, new C43341b.a().m95419c(str).m95418b(), c37739e);
    }

    /* JADX INFO: renamed from: b */
    public static Pair<C42687h, Integer> m97524b(EnumC0360w enumC0360w, AbstractC43343d abstractC43343d, C37739e c37739e) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String urlByType = JNI.getUrlByType(enumC0360w.name());
        String strName = enumC0360w.name();
        C42686g c42686gM93543h = new C42686g.a().m93547l(urlByType).m93542g(JNI.m1362g()).m93548m(abstractC43343d).m93543h();
        C42687h c42687hM93519n = new C42685f.b().m93526d(new C42901a()).m93529g(30000).m93528f(false).m93527e().m93519n(c42686gM93543h);
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
        m97526d(enumC0360w, c42687hM93519n, c37739e);
        m97527e(strName, c42686gM93543h, c42687hM93519n, urlByType, iCurrentTimeMillis);
        return Pair.create(c42687hM93519n, Integer.valueOf(iCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: f */
    public static void m97528f(final C42687h c42687h, final String str, C37739e c37739e) {
        C44211c1.m97482R().m83468K(new InterfaceC37735a() { // from class: s.l
            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: a */
            public final Object mo92a() {
                return C44232m.m97525c(c42687h, str);
            }
        }, c37739e);
    }

    /* JADX INFO: renamed from: h */
    public static Pair<C42687h, Integer> m97530h(String str, String str2, C37739e c37739e) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C42687h c42687hM93514i = new C42685f.b().m93529g(30000).m93526d(new C42901a()).m93527e().m93514i(new C42686g.a().m93547l(str).m93546k("GET").m93545j(str2).m93543h());
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
        m97528f(c42687hM93514i, str, c37739e);
        return Pair.create(c42687hM93514i, Integer.valueOf(iCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: e */
    public static void m97527e(String str, C42686g c42686g, C42687h c42687h, String str2, int i11) {
    }
}
