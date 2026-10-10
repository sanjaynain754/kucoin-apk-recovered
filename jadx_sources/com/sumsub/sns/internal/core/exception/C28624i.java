package com.sumsub.sns.internal.core.exception;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.C33272c;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.exception.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28624i implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final C28616a f58252a;

    /* JADX INFO: renamed from: b */
    public final List f58253b;

    /* JADX INFO: renamed from: c */
    public final C28617b f58254c;

    /* JADX INFO: renamed from: d */
    public final Thread.UncaughtExceptionHandler f58255d;

    /* JADX INFO: renamed from: e */
    public final AbstractC41697j0 f58256e;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        C33272c c33272c = C33272c.f67812a;
        C33272c.f67814c.mo68957i("SNSUncaughtExceptionHandler", "Got exception", th2);
        try {
            if (this.f58252a.m69471a(th2)) {
                C41686h.m91047e(this.f58256e, new C28623h(this, thread, th2, null));
            } else {
                Logger.DefaultImpls.i$default(c33272c, "SNSUncaughtExceptionHandler", "Ignoring host application's exceptions", null, 4, null);
            }
        } catch (Exception e11) {
            C33272c.f67814c.mo68956e("SNSUncaughtExceptionHandler", "Error while sending crash report", e11);
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f58255d;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            }
        }
    }

    public C28624i(C28616a c28616a, List list, C28617b c28617b, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
        this.f58252a = c28616a;
        this.f58253b = list;
        this.f58254c = c28617b;
        this.f58255d = uncaughtExceptionHandler;
        this.f58256e = abstractC41697j0M91392b;
    }
}
