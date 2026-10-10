package com.sumsub.sns.internal.features.presentation.preview.photo;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.S */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31757S extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64533a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f64534b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC31770c0 f64535c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31757S(AbstractC31770c0 abstractC31770c0, Continuation continuation) {
        super(2, continuation);
        this.f64535c = abstractC31770c0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31757S c31757s = new C31757S(this.f64535c, continuation);
        c31757s.f64534b = obj;
        return c31757s;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31757S c31757s = new C31757S(this.f64535c, (Continuation) obj2);
        c31757s.f64534b = (C31931t) obj;
        return c31757s.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31931t c31931t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64533a;
        if (i11 != 0) {
            if (i11 == 1) {
                c31931t = (C31931t) this.f64534b;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C31931t c31931t2 = (C31931t) this.f64534b;
            AbstractC31770c0 abstractC31770c0 = this.f64535c;
            this.f64534b = c31931t2;
            this.f64533a = 1;
            KProperty[] kPropertyArr = AbstractC31770c0.f64557l;
            Object objM70864b = abstractC31770c0.m70864b((ContinuationImpl) this);
            if (objM70864b == coroutine_suspended) {
                return coroutine_suspended;
            }
            c31931t = c31931t2;
            obj = objM70864b;
        }
        return C31931t.m70949a(c31931t, null, null, false, false, (C31916p) obj, 15);
    }
}
