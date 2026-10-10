package com.sumsub.sns.internal.features.presentation.camera.photo;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30407L extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61180a;

    /* JADX INFO: renamed from: b */
    public int f61181b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30408M f61182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30407L(C30408M c30408m, Continuation continuation) {
        super(continuation);
        this.f61182c = c30408m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61180a = obj;
        this.f61181b |= Integer.MIN_VALUE;
        return this.f61182c.emit(null, this);
    }
}
