package p193d7;

import com.facebook.yoga.YogaErrata;
import com.facebook.yoga.YogaNative;

/* JADX INFO: renamed from: d7.d */
/* JADX INFO: compiled from: YogaConfigJNIBase.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC36631d extends AbstractC36629b {

    /* JADX INFO: renamed from: a */
    public long f79440a;

    public AbstractC36631d(long j11) {
        if (j11 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f79440a = j11;
    }

    @Override // p193d7.AbstractC36629b
    /* JADX INFO: renamed from: a */
    public void mo81961a(YogaErrata yogaErrata) {
        YogaNative.jni_YGConfigSetErrataJNI(this.f79440a, yogaErrata.intValue());
    }

    @Override // p193d7.AbstractC36629b
    /* JADX INFO: renamed from: b */
    public void mo81962b(float f11) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.f79440a, f11);
    }

    public AbstractC36631d() {
        this(YogaNative.jni_YGConfigNewJNI());
    }
}
