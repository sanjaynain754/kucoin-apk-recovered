package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.core.presentation.base.C28075O;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.r0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32556r0 implements InterfaceC41634e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41634e f66409a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28075O f66410b;

    public C32556r0(InterfaceC41634e interfaceC41634e, C28075O c28075o) {
        this.f66409a = interfaceC41634e;
        this.f66410b = c28075o;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public final Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
        Object objCollect = this.f66409a.collect(new C32554q0(interfaceC41635f, this.f66410b), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
