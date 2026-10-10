package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.data.model.prooface.C29798A;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32127p implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32109k0 f65405a;

    public C32127p(C32109k0 c32109k0) {
        this.f65405a = c32109k0;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        this.f65405a.f65360e.m69944a((C29798A) obj);
        return Unit.INSTANCE;
    }
}
