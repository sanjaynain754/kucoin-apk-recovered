package com.sumsub.sns.internal.features.presentation.verification2.host;

import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28491s;
import com.sumsub.sns.internal.core.common.C28500v;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29082a;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.host.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32841z extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f67189a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32814J f67190b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32841z(C32814J c32814j, Continuation continuation) {
        super(2, continuation);
        this.f67190b = c32814j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32841z(this.f67190b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32841z(this.f67190b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC28503w c28500v;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f67189a;
        boolean z11 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32814J c32814j = this.f67190b;
            int i12 = C32814J.f67147V;
            InterfaceC41634e<C28075O> dataFlow = c32814j.getDataFlow();
            this.f67189a = 1;
            obj = C41636g.m90882F(dataFlow, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC29172p abstractC29172p = ((C28075O) obj).f57269a;
        if (abstractC29172p == null || !(abstractC29172p instanceof C29082a)) {
            z11 = false;
        }
        C32814J c32814j2 = this.f67190b;
        if (z11) {
            c28500v = new C28500v(SNSCompletionResult.SuccessTermination.INSTANCE);
        } else {
            c28500v = C28491s.f58027b;
        }
        AbstractC28052C.finish$default(c32814j2, c28500v, null, null, null, 14, null);
        return Unit.INSTANCE;
    }
}
