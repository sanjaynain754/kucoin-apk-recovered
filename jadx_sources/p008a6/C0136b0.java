package p008a6;

import com.facebook.imagepipeline.memory.BasePool;
import com.facebook.imagepipeline.memory.PoolStatsTracker;

/* JADX INFO: renamed from: a6.b0 */
/* JADX INFO: compiled from: NoOpPoolStatsTracker.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0136b0 implements PoolStatsTracker {

    /* JADX INFO: renamed from: a */
    public static C0136b0 f464a;

    /* JADX INFO: renamed from: h */
    public static synchronized C0136b0 m614h() {
        try {
            if (f464a == null) {
                f464a = new C0136b0();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f464a;
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    /* JADX INFO: renamed from: c */
    public void mo617c() {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    /* JADX INFO: renamed from: d */
    public void mo618d() {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    /* JADX INFO: renamed from: a */
    public void mo615a(int i11) {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    /* JADX INFO: renamed from: b */
    public void mo616b(int i11) {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    /* JADX INFO: renamed from: e */
    public void mo619e(int i11) {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    /* JADX INFO: renamed from: f */
    public void mo620f(int i11) {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    /* JADX INFO: renamed from: g */
    public void mo621g(BasePool basePool) {
    }
}
