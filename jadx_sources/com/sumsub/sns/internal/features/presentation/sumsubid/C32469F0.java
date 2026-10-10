package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30052a;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.F0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32469F0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public boolean f66205a;

    /* JADX INFO: renamed from: b */
    public int f66206b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32487O0 f66207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32469F0(C32487O0 c32487o0, Continuation continuation) {
        super(2, continuation);
        this.f66207c = c32487o0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32469F0(this.f66207c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32469F0(this.f66207c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        String strM69770a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66206b;
        if (i11 != 0) {
            if (i11 == 1) {
                z11 = this.f66205a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            boolean z12 = ((C30052a) this.f66207c.f66264c.f60387a.getValue()).f60385c;
            C32487O0 c32487o0 = this.f66207c;
            this.f66205a = z12;
            this.f66206b = 1;
            Object config = c32487o0.getConfig(this);
            if (config == coroutine_suspended) {
                return coroutine_suspended;
            }
            z11 = z12;
            obj = config;
        }
        C29124h c29124h = (C29124h) obj;
        C32487O0 c32487o1 = this.f66207c;
        String strM69770a2 = null;
        if (c29124h == null || (strM69770a = AbstractC29130i.m69770a("sumsubid.reuse.actionProfile", c29124h.f59089v)) == null || !z11) {
            strM69770a = null;
        }
        if (c29124h != null) {
            strM69770a2 = AbstractC29130i.m69770a("sumsubid.reuse.actionLogout", c29124h.f59089v);
        }
        C32497U c32497u = new C32497U(strM69770a, strM69770a2);
        KProperty[] kPropertyArr = C32487O0.f66261v;
        c32487o1.fireEvent(c32497u);
        return Unit.INSTANCE;
    }
}
