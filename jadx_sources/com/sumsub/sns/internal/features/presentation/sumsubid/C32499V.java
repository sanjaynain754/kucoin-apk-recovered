package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32499V extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66330a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32487O0 f66331b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32499V(C32487O0 c32487o0, Continuation continuation) {
        super(2, continuation);
        this.f66331b = c32487o0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32499V c32499v = new C32499V(this.f66331b, continuation);
        c32499v.f66330a = obj;
        return c32499v;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32499V c32499v = new C32499V(this.f66331b, (Continuation) obj2);
        c32499v.f66330a = (String) obj;
        return c32499v.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = (String) this.f66330a;
        C32487O0 c32487o0 = this.f66331b;
        C32557s c32557s = new C32557s(str);
        KProperty[] kPropertyArr = C32487O0.f66261v;
        C28936t c28936t = c32487o0.f66270i;
        KProperty kProperty = C32487O0.f66261v[1];
        c28936t.f58834a.set(c28936t.f58835b, c32557s);
        return Unit.INSTANCE;
    }
}
