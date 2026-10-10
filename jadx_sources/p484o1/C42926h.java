package p484o1;

import androidx.core.os.TraceCompat;
import com.tencent.bugly.proguard.C33978va;

/* JADX INFO: renamed from: o1.h */
/* JADX INFO: compiled from: LottieTrace.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42926h {

    /* JADX INFO: renamed from: a */
    public final String[] f95032a = new String[5];

    /* JADX INFO: renamed from: b */
    public final long[] f95033b = new long[5];

    /* JADX INFO: renamed from: c */
    public int f95034c = 0;

    /* JADX INFO: renamed from: d */
    public int f95035d = 0;

    /* JADX INFO: renamed from: a */
    public void m94160a(String str) {
        int i11 = this.f95034c;
        if (i11 == 5) {
            this.f95035d++;
            return;
        }
        this.f95032a[i11] = str;
        this.f95033b[i11] = System.nanoTime();
        TraceCompat.beginSection(str);
        this.f95034c++;
    }

    /* JADX INFO: renamed from: b */
    public float m94161b(String str) {
        int i11 = this.f95035d;
        if (i11 > 0) {
            this.f95035d = i11 - 1;
            return 0.0f;
        }
        int i12 = this.f95034c - 1;
        this.f95034c = i12;
        if (i12 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f95032a[i12])) {
            TraceCompat.endSection();
            return (System.nanoTime() - this.f95033b[this.f95034c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f95032a[this.f95034c] + C33978va.f72339h);
    }
}
