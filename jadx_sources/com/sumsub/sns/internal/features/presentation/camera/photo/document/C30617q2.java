package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.q2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30617q2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61859a;

    /* JADX INFO: renamed from: b */
    public int f61860b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30623r2 f61861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30617q2(C30623r2 c30623r2, Continuation continuation) {
        super(continuation);
        this.f61861c = c30623r2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61859a = obj;
        this.f61860b |= Integer.MIN_VALUE;
        return this.f61861c.emit(null, this);
    }
}
