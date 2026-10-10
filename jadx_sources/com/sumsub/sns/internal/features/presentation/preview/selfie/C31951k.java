package com.sumsub.sns.internal.features.presentation.preview.selfie;

import java.io.File;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.selfie.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31951k extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64970a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ File f64971b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31951k(File file, Continuation continuation) {
        super(2, continuation);
        this.f64971b = file;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31951k c31951k = new C31951k(this.f64971b, continuation);
        c31951k.f64970a = obj;
        return c31951k;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31951k c31951k = new C31951k(this.f64971b, (Continuation) obj2);
        c31951k.f64970a = (C31950j) obj;
        return c31951k.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return C31950j.m70960a((C31950j) this.f64970a, this.f64971b, null, null, null, null, false, 62);
    }
}
