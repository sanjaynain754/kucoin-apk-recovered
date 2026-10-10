package com.sumsub.sns.internal.features.presentation.camera.photo;

import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.p0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30688p0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62013a;

    /* JADX INFO: renamed from: b */
    public int f62014b;

    /* JADX INFO: renamed from: c */
    public InterfaceC41635f f62015c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30690q0 f62016d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30688p0(C30690q0 c30690q0, Continuation continuation) {
        super(continuation);
        this.f62016d = c30690q0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f62013a = obj;
        this.f62014b |= Integer.MIN_VALUE;
        return this.f62016d.emit(null, this);
    }
}
