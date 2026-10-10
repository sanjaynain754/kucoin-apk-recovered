package com.sumsub.sns.internal.core.exception;

import com.sumsub.sentry.C27925b0;
import com.sumsub.sentry.C27929c0;
import com.sumsub.sns.internal.log.cacher.InterfaceC33275c;
import p852kotlin.Unit;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.exception.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28625j implements InterfaceC28620e {

    /* JADX INFO: renamed from: a */
    public final C27929c0 f58257a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC33275c f58258b;

    @Override // com.sumsub.sns.internal.core.exception.InterfaceC28620e
    /* JADX INFO: renamed from: a */
    public final Object mo69475a(Thread thread, Throwable th2, String str, C28621f c28621f) {
        C27925b0 c27925b0M69005a = this.f58257a.m69005a(thread, th2, str);
        if (c27925b0M69005a == null) {
            return Unit.INSTANCE;
        }
        Object objSend = this.f58258b.send(c27925b0M69005a, c28621f);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }

    public C28625j(C27929c0 c27929c0, InterfaceC33275c interfaceC33275c) {
        this.f58257a = c27929c0;
        this.f58258b = interfaceC33275c;
    }
}
