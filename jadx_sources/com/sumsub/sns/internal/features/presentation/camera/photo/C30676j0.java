package com.sumsub.sns.internal.features.presentation.camera.photo;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.j0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30676j0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61989a;

    /* JADX INFO: renamed from: b */
    public int f61990b;

    /* JADX INFO: renamed from: c */
    public InterfaceC41635f f61991c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30678k0 f61992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30676j0(C30678k0 c30678k0, Continuation continuation) {
        super(continuation);
        this.f61992d = c30678k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61989a = obj;
        this.f61990b |= Integer.MIN_VALUE;
        return this.f61992d.emit(null, this);
    }
}
