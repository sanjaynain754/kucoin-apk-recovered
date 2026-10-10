package com.sumsub.sns.internal.features.presentation.camera.photo;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.a0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30422a0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61237a;

    /* JADX INFO: renamed from: b */
    public int f61238b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30425b0 f61239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30422a0(C30425b0 c30425b0, Continuation continuation) {
        super(continuation);
        this.f61239c = c30425b0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f61237a = obj;
        this.f61238b |= Integer.MIN_VALUE;
        return this.f61239c.emit(null, this);
    }
}
