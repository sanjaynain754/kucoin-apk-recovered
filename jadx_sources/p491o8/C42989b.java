package p491o8;

import java.util.List;
import org.ahocorasick.trie.Trie;

/* JADX INFO: renamed from: o8.b */
/* JADX INFO: compiled from: Pinyin.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C42989b {

    /* JADX INFO: renamed from: a */
    public static Trie f95133a;

    /* JADX INFO: renamed from: b */
    public static List<InterfaceC42994g> f95134b;

    /* JADX INFO: renamed from: a */
    public static short m94418a(byte[] bArr, byte[] bArr2, int i11) {
        int i12 = i11 % 8;
        short s11 = (short) (bArr2[i11] & 255);
        return (bArr[i11 / 8] & C42993f.f95141a[i12]) != 0 ? (short) (s11 | 256) : s11;
    }

    /* JADX INFO: renamed from: b */
    public static int m94419b(char c11) {
        int i11 = c11 - 19968;
        if (i11 < 0 || i11 >= 7000) {
            return (7000 > i11 || i11 >= 14000) ? m94418a(C42992e.f95139a, C42992e.f95140b, c11 - 33968) : m94418a(C42991d.f95137a, C42991d.f95138b, c11 - 26968);
        }
        return m94418a(C42990c.f95135a, C42990c.f95136b, i11);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m94420c(char c11) {
        return (19968 <= c11 && c11 <= 40869 && m94419b(c11) > 0) || 12295 == c11;
    }

    /* JADX INFO: renamed from: e */
    public static String m94422e(String str, String str2) {
        return C42988a.m94416b(str, f95133a, f95134b, str2, null);
    }

    /* JADX INFO: renamed from: d */
    public static String m94421d(char c11) {
        if (m94420c(c11)) {
            if (c11 == 12295) {
                return "LING";
            }
            return C42993f.f95142b[m94419b(c11)];
        }
        return String.valueOf(c11);
    }
}
