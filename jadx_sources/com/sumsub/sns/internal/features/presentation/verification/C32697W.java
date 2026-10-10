package com.sumsub.sns.internal.features.presentation.verification;

import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.W */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32697W implements InterfaceC41634e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41634e f66849a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f66850b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32742x f66851c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32720j0 f66852d;

    public C32697W(InterfaceC41634e interfaceC41634e, String str, C32742x c32742x, C32720j0 c32720j0) {
        this.f66849a = interfaceC41634e;
        this.f66850b = str;
        this.f66851c = c32742x;
        this.f66852d = c32720j0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public final Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
        Object objCollect = this.f66849a.collect(new C32696V(interfaceC41635f, this.f66850b, this.f66851c, this.f66852d), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
