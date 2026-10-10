package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.data.model.common.C29181q3;
import com.sumsub.sns.internal.features.data.model.prooface.AbstractC29807J;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.T */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32038T extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65177a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32109k0 f65178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC29807J f65179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32038T(C32109k0 c32109k0, AbstractC29807J abstractC29807J, Continuation continuation) {
        super(2, continuation);
        this.f65178b = c32109k0;
        this.f65179c = abstractC29807J;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32038T(this.f65178b, this.f65179c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32038T(this.f65178b, this.f65179c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65177a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC29984m interfaceC29984m = this.f65178b.f65363h;
            this.f65177a = 1;
            obj = ((C29967J) interfaceC29984m).m70045b(false, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (((AbstractC29971N) obj).m70051c() == null) {
            return Unit.INSTANCE;
        }
        C29181q3 c29181q3 = new C29181q3(this.f65179c, this.f65178b.f65357b);
        AbstractC32267d.m71078a("finish: " + c29181q3);
        AbstractC28052C.finish$default(this.f65178b, null, c29181q3, null, null, 13, null);
        return Unit.INSTANCE;
    }
}
