package com.sumsub.sns.internal.log;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.logger.C33295a;
import com.sumsub.sns.internal.log.logger.C33296b;
import com.sumsub.sns.internal.log.logger.C33305k;
import p852kotlin.collections.SetsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33270a implements Logger {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C33296b f67810a;

    /* JADX INFO: renamed from: b */
    public final C33295a f67811b;

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: d */
    public final void mo68955d(String str, String str2, Throwable th2) {
        this.f67810a.mo68955d(str, str2, th2);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: e */
    public final void mo68956e(String str, String str2, Throwable th2) {
        this.f67810a.mo68956e(str, str2, th2);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: i */
    public final void mo68957i(String str, String str2, Throwable th2) {
        this.f67810a.mo68957i(str, str2, th2);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: v */
    public final void mo68958v(String str, String str2, Throwable th2) {
        this.f67810a.mo68958v(str, str2, th2);
    }

    @Override // com.sumsub.log.logger.Logger
    /* JADX INFO: renamed from: w */
    public final void mo68959w(String str, String str2, Throwable th2) {
        this.f67810a.mo68959w(str, str2, th2);
    }

    public C33270a(C33295a c33295a, C33305k c33305k) {
        this.f67810a = new C33296b(SetsKt.setOf((Object[]) new Logger[]{c33305k, c33295a}));
        this.f67811b = c33295a;
    }
}
