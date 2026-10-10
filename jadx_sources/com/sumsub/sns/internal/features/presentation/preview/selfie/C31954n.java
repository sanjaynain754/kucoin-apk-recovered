package com.sumsub.sns.internal.features.presentation.preview.selfie;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.selfie.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31954n extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64980a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31957q f64981b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31954n(C31957q c31957q, Continuation continuation) {
        super(2, continuation);
        this.f64981b = c31957q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31954n(this.f64981b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31954n(this.f64981b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64980a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C31957q c31957q = this.f64981b;
            KProperty[] kPropertyArr = C31957q.f64987j;
            InterfaceC29984m interfaceC29984m = c31957q.f64478c;
            this.f64980a = 1;
            obj = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) obj).m70051c();
        C31957q c31957q2 = this.f64981b;
        KProperty[] kPropertyArr2 = C31957q.f64987j;
        c31957q2.m70961a(abstractC29172p);
        return Unit.INSTANCE;
    }
}
