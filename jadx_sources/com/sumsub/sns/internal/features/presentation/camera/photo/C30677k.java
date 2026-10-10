package com.sumsub.sns.internal.features.presentation.camera.photo;

import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30677k extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30736v0 f61994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30677k(C30736v0 c30736v0, Continuation continuation) {
        super(2, continuation);
        this.f61994b = c30736v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30677k c30677k = new C30677k(this.f61994b, continuation);
        c30677k.f61993a = obj;
        return c30677k;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30677k c30677k = new C30677k(this.f61994b, (Continuation) obj2);
        c30677k.f61993a = (List) obj;
        return c30677k.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.f61993a;
        if (list != null && list.size() == 1) {
            C30736v0 c30736v0 = this.f61994b;
            C30400E c30400e = (C30400E) CollectionsKt.first(list);
            int i11 = C30736v0.f62087V;
            c30736v0.m70442a(c30400e);
        }
        return Unit.INSTANCE;
    }
}
