package p451m8;

import android.text.TextUtils;
import java.io.IOException;
import p466n8.C42774a;

/* JADX INFO: renamed from: m8.e */
/* JADX INFO: compiled from: BaseChunk.java */
/* JADX INFO: loaded from: classes.dex */
public class C42478e {

    /* JADX INFO: renamed from: a */
    public int f94120a;

    /* JADX INFO: renamed from: b */
    public int f94121b;

    /* JADX INFO: renamed from: c */
    public int f94122c;

    /* JADX INFO: renamed from: a */
    public static int m93167a(String str) {
        if (!TextUtils.isEmpty(str) && str.length() == 4) {
            return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
        }
        return -1159790593;
    }

    /* JADX INFO: renamed from: c */
    public final void m93168c(C42774a c42774a) throws IOException {
        int iAvailable = c42774a.available();
        mo93162b(c42774a);
        int iAvailable2 = iAvailable - c42774a.available();
        int i11 = this.f94121b;
        int i12 = i11 + (i11 & 1);
        if (iAvailable2 <= i12) {
            if (iAvailable2 < i12) {
                c42774a.skip(i12 - iAvailable2);
                return;
            }
            return;
        }
        throw new IOException("Out of chunk area");
    }

    /* JADX INFO: renamed from: b */
    public void mo93162b(C42774a c42774a) throws IOException {
    }
}
