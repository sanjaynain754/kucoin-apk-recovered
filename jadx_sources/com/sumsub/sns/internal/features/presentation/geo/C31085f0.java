package com.sumsub.sns.internal.features.presentation.geo;

import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.f0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31085f0 implements InterfaceC41634e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41634e f62852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31040B0 f62853b;

    public C31085f0(InterfaceC41634e interfaceC41634e, C31040B0 c31040b0) {
        this.f62852a = interfaceC41634e;
        this.f62853b = c31040b0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public final Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
        Object objCollect = this.f62852a.collect(new C31083e0(interfaceC41635f, this.f62853b), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
