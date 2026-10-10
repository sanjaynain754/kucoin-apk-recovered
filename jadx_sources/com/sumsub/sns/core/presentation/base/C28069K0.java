package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.K0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28069K0 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC28073M0 f57252a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28069K0(CoroutineExceptionHandler.Companion companion, AbstractC28073M0 abstractC28073M0) {
        super(companion);
        this.f57252a = abstractC28073M0;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th2) {
        C33272c.f67816e.f67810a.mo68956e(AbstractC33294e.m71624a(this.f57252a), "Prepare error", th2);
        this.f57252a.onPrepareError();
        AbstractC28073M0 abstractC28073M0 = this.f57252a;
        AbstractC28052C.throwError$default(abstractC28073M0, th2, abstractC28073M0.getDocumentType(), null, 4, null);
    }
}
