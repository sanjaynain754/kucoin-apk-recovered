package com.sumsub.sns.internal.features.presentation.camera.photo;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.O */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30410O extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ C30683n f61185a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f61186b;

    public C30410O(Continuation continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C30410O c30410o = new C30410O((Continuation) obj3);
        c30410o.f61185a = (C30683n) obj;
        c30410o.f61186b = zBooleanValue;
        return c30410o.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C30683n c30683n = this.f61185a;
        if (this.f61186b) {
            return c30683n;
        }
        return null;
    }
}
