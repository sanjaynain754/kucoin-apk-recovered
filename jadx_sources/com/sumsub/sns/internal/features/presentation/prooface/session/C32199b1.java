package com.sumsub.sns.internal.features.presentation.prooface.session;

import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.b1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32199b1 implements InterfaceC41634e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41634e f65574a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32202c1 f65575b;

    public C32199b1(InterfaceC41634e interfaceC41634e, C32202c1 c32202c1) {
        this.f65574a = interfaceC41634e;
        this.f65575b = c32202c1;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public final Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
        Object objCollect = this.f65574a.collect(new C32196a1(interfaceC41635f, this.f65575b), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
