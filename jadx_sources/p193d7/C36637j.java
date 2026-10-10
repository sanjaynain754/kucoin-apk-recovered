package p193d7;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* JADX INFO: renamed from: d7.j */
/* JADX INFO: compiled from: YogaNodeJNIFinalizer.java */
/* JADX INFO: loaded from: classes45.dex */
public class C36637j extends YogaNodeJNIBase {
    /* JADX INFO: renamed from: p0 */
    public void m81969p0() {
        long j11 = this.f9979g;
        if (j11 != 0) {
            this.f9979g = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j11);
        }
    }

    public C36637j(AbstractC36629b abstractC36629b) {
        super(abstractC36629b);
    }

    public void finalize() throws Throwable {
        try {
            m81969p0();
        } finally {
            super.finalize();
        }
    }
}
