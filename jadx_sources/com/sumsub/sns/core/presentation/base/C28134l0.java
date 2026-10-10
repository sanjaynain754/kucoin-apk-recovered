package com.sumsub.sns.core.presentation.base;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.l0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28134l0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57357a;

    /* JADX INFO: renamed from: b */
    public int f57358b;

    /* JADX INFO: renamed from: c */
    public InterfaceC41635f f57359c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C28136m0 f57360d;

    /* JADX INFO: renamed from: e */
    public C28075O f57361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28134l0(C28136m0 c28136m0, Continuation continuation) {
        super(continuation);
        this.f57360d = c28136m0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f57357a = obj;
        this.f57358b |= Integer.MIN_VALUE;
        return this.f57360d.emit(null, this);
    }
}
