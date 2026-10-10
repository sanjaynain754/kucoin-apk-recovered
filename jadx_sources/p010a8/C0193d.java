package p010a8;

import android.text.TextUtils;
import java.io.IOException;
import p036b8.C4503a;

/* JADX INFO: renamed from: a8.d */
/* JADX INFO: compiled from: Chunk.java */
/* JADX INFO: loaded from: classes.dex */
public class C0193d {

    /* JADX INFO: renamed from: a */
    public int f580a;

    /* JADX INFO: renamed from: b */
    public int f581b;

    /* JADX INFO: renamed from: c */
    public int f582c;

    /* JADX INFO: renamed from: d */
    public int f583d;

    /* JADX INFO: renamed from: a */
    public static int m769a(String str) {
        if (!TextUtils.isEmpty(str) && str.length() == 4) {
            return ((str.charAt(3) & 255) << 24) | (str.charAt(0) & 255) | ((str.charAt(1) & 255) << 8) | ((str.charAt(2) & 255) << 16);
        }
        return -1159790593;
    }

    /* JADX INFO: renamed from: c */
    public void m770c(C4503a c4503a) throws IOException {
        int iAvailable = c4503a.available();
        mo756b(c4503a);
        int iAvailable2 = iAvailable - c4503a.available();
        int i11 = this.f580a;
        if (iAvailable2 <= i11) {
            if (iAvailable2 < i11) {
                c4503a.skip(i11 - iAvailable2);
                return;
            }
            return;
        }
        throw new IOException("Out of chunk area");
    }

    /* JADX INFO: renamed from: b */
    public void mo756b(C4503a c4503a) throws IOException {
    }
}
