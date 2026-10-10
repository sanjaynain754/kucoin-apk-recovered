package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import java.util.ArrayList;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.w */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31505w extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63925a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f63926b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31505w(ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f63926b = arrayList;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31505w c31505w = new C31505w(this.f63926b, continuation);
        c31505w.f63925a = obj;
        return c31505w;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31505w c31505w = new C31505w(this.f63926b, (Continuation) obj2);
        c31505w.f63925a = (C31494l) obj;
        return c31505w.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return C31494l.m70756a((C31494l) this.f63925a, null, this.f63926b, null, null, null, false, 61);
    }
}
