package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30146q;
import com.sumsub.sns.internal.features.domain.documents.C30127V;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.x2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30652x2 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61940a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30440B2 f61941b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32635M f61942c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30652x2(C30440B2 c30440b2, C32635M c32635m, Continuation continuation) {
        super(2, continuation);
        this.f61941b = c30440b2;
        this.f61942c = c32635m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30652x2 c30652x2 = new C30652x2(this.f61941b, this.f61942c, continuation);
        c30652x2.f61940a = obj;
        return c30652x2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30652x2) create((AbstractC30146q) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AbstractC30146q abstractC30146q = (AbstractC30146q) this.f61940a;
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "camera upload result: " + abstractC30146q, null);
        C30440B2 c30440b2 = this.f61941b;
        C32635M c32635m = this.f61942c;
        KProperty[] kPropertyArr = C30440B2.f61279U;
        AbstractC28052C.finish$default(c30440b2, null, new C30127V(c32635m.m71250c(), abstractC30146q), null, null, 13, null);
        return Unit.INSTANCE;
    }
}
