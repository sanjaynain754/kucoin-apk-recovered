package p193d7;

import com.facebook.yoga.YogaNative;

/* JADX INFO: renamed from: d7.e */
/* JADX INFO: compiled from: YogaConfigJNIFinalizer.java */
/* JADX INFO: loaded from: classes45.dex */
public class C36632e extends AbstractC36631d {
    /* JADX INFO: renamed from: c */
    public void m81964c() {
        long j11 = this.f79440a;
        if (j11 != 0) {
            this.f79440a = 0L;
            YogaNative.jni_YGConfigFreeJNI(j11);
        }
    }

    public void finalize() throws Throwable {
        try {
            m81964c();
        } finally {
            super.finalize();
        }
    }
}
