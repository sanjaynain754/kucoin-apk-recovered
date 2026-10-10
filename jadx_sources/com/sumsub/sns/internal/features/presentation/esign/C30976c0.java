package com.sumsub.sns.internal.features.presentation.esign;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.c0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30976c0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62590a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30997n0 f62591b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f62592c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30976c0(C30997n0 c30997n0, String str, Continuation continuation) {
        super(2, continuation);
        this.f62591b = c30997n0;
        this.f62592c = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30976c0(this.f62591b, this.f62592c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30976c0(this.f62591b, this.f62592c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62590a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30997n0 c30997n0 = this.f62591b;
            String str = this.f62592c;
            this.f62590a = 1;
            KProperty[] kPropertyArr = C30997n0.f62640t;
            if (c30997n0.m70543a(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
