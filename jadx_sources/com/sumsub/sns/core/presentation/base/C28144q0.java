package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29980i;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.q0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28144q0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57382a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28073M0 f57383b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28144q0(AbstractC28073M0 abstractC28073M0, Continuation continuation) {
        super(2, continuation);
        this.f57383b = abstractC28073M0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28144q0 c28144q0 = new C28144q0(this.f57383b, continuation);
        c28144q0.f57382a = obj;
        return c28144q0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C28144q0 c28144q0 = new C28144q0(this.f57383b, (Continuation) obj2);
        c28144q0.f57382a = (C29980i) obj;
        return c28144q0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C29124h c29124h;
        AbstractC29971N abstractC29971N;
        C29983l c29983l;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C29980i c29980i = (C29980i) this.f57382a;
        AbstractC28073M0 abstractC28073M0 = this.f57383b;
        if (c29980i != null) {
            c29124h = (C29124h) c29980i.f60240b.m70051c();
        } else {
            c29124h = null;
        }
        abstractC28073M0.config = c29124h;
        if (c29980i != null && (abstractC29971N = c29980i.f60241c) != null && (c29983l = (C29983l) abstractC29971N.m70051c()) != null) {
            this.f57383b._strings = c29983l;
        }
        return Unit.INSTANCE;
    }
}
