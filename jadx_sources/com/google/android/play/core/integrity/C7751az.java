package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.az */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7751az implements StandardIntegrityManager {

    /* JADX INFO: renamed from: a */
    private final C7766bn f12004a;

    /* JADX INFO: renamed from: b */
    private final C7772bt f12005b;

    public C7751az(C7766bn c7766bn, C7772bt c7772bt) {
        this.f12004a = c7766bn;
        this.f12005b = c7772bt;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Task m13238a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l11) throws Exception {
        final long jMo13212b = prepareIntegrityTokenRequest.mo13212b();
        final long jLongValue = l11.longValue();
        prepareIntegrityTokenRequest.mo13211a();
        final C7772bt c7772bt = this.f12005b;
        final int i11 = 0;
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider(jMo13212b, jLongValue, i11) { // from class: com.google.android.play.core.integrity.bs

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f12050b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ long f12051c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return this.f12049a.m13259a(this.f12050b, this.f12051c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long jMo13212b = prepareIntegrityTokenRequest.mo13212b();
        prepareIntegrityTokenRequest.mo13211a();
        return this.f12004a.m13258e(jMo13212b, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f12002a.m13238a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}
