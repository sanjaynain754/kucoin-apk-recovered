package com.sumsub.sentry;

import android.content.Context;
import com.sumsub.log.logger.Logger;
import com.sumsub.sentry.android.C27913a;
import com.sumsub.sentry.android.C27917e;
import com.sumsub.sentry.android.C27919g;
import com.sumsub.sns.internal.core.exception.SNSCallbacksLostOnRestoreException;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.sumsub.sentry.c0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C27929c0 {

    /* JADX INFO: renamed from: a */
    public final Context f57057a;

    /* JADX INFO: renamed from: b */
    public final C27870G f57058b = new C27870G((C27864D) C27864D.f56904i.getValue());

    /* JADX INFO: renamed from: a */
    public final C27925b0 m69005a(Thread thread, Throwable th2, String str) {
        Logger.DefaultImpls.d$default(C33272c.f67812a, "SentryEnvelopeFactory", "prepare unhandled envelope: applicantId=" + str + " exception=" + th2, null, 4, null);
        return m69003a(new C28015y(new C27876J("UncaughtExceptionHandler", Boolean.FALSE), th2, thread), str);
    }

    public C27929c0(Context context) {
        this.f57057a = context;
    }

    /* JADX INFO: renamed from: a */
    public final C27925b0 m69004a(SNSCallbacksLostOnRestoreException sNSCallbacksLostOnRestoreException) {
        Logger.DefaultImpls.d$default(C33272c.f67812a, "SentryEnvelopeFactory", "prepare handled envelope: applicantId=" + ((String) null) + " exception=" + sNSCallbacksLostOnRestoreException, null, 4, null);
        return m69003a(new C28015y(new C27876J("SNSSDK", Boolean.TRUE), sNSCallbacksLostOnRestoreException, Thread.currentThread()), null);
    }

    /* JADX INFO: renamed from: a */
    public final C27925b0 m69003a(C28015y c28015y, String str) {
        C27913a c27913a = null;
        try {
            C27973n0 c27973n0 = new C27973n0();
            c27973n0.f57011l = c28015y;
            C27973n0 c27973n0M68998b = new C27917e(this.f57057a, new C27913a(), new C27919g(this.f57057a, c27913a, 30), str).m68998b(this.f57058b.m68966a(c27973n0));
            return new C27925b0(new C27941f0(c27973n0M68998b.f57096o), CollectionsKt.listOf(AbstractC27945g0.m69010a(c27973n0M68998b)));
        } catch (Throwable th2) {
            C33272c.f67814c.mo68956e("SentryEnvelopeFactory", "Failed to create event", th2);
            return null;
        }
    }
}
