package com.sumsub.sns.internal.features.presentation.restrictions;

import com.sumsub.sns.core.presentation.base.C28075O;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.restrictions.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32357w implements InterfaceC41634e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41634e f65928a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28075O f65929b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32333C f65930c;

    public C32357w(InterfaceC41634e interfaceC41634e, C28075O c28075o, C32333C c32333c) {
        this.f65928a = interfaceC41634e;
        this.f65929b = c28075o;
        this.f65930c = c32333c;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    public final Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
        Object objCollect = this.f65928a.collect(new C32356v(interfaceC41635f, this.f65929b, this.f65930c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
