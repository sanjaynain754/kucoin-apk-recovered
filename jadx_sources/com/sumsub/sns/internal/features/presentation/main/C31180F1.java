package com.sumsub.sns.internal.features.presentation.main;

import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.F1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C31180F1 extends FunctionReferenceImpl implements Function1 {
    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C31243a2.m70617a((C31243a2) this.receiver, (Throwable) obj);
        return Unit.INSTANCE;
    }

    public C31180F1(C31243a2 c31243a2) {
        super(1, c31243a2, C31243a2.class, "onSdkPreparedFailure", "onSdkPreparedFailure(Ljava/lang/Throwable;)V", 0);
    }
}
