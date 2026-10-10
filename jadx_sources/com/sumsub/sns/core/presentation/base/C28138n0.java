package com.sumsub.sns.core.presentation.base;

import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.n0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28138n0 implements InterfaceC41634e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41634e f57371a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28142p0 f57372b;

    public C28138n0(InterfaceC41634e interfaceC41634e, AbstractC28142p0 abstractC28142p0) {
        this.f57371a = interfaceC41634e;
        this.f57372b = abstractC28142p0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public final Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
        Object objCollect = this.f57371a.collect(new C28136m0(interfaceC41635f, this.f57372b), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
