package com.sumsub.sns.internal.features.presentation.preview.selfie;

import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import java.io.File;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.selfie.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31952l extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64972a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31957q f64973b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31952l(C31957q c31957q, Continuation continuation) {
        super(2, continuation);
        this.f64973b = c31957q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31952l c31952l = new C31952l(this.f64973b, continuation);
        c31952l.f64972a = obj;
        return c31952l;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31952l c31952l = new C31952l(this.f64973b, (Continuation) obj2);
        c31952l.f64972a = (File) obj;
        return c31952l.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AbstractC28073M0.updateState$default(this.f64973b, false, new C31951k((File) this.f64972a, null), 1, null);
        return Unit.INSTANCE;
    }
}
