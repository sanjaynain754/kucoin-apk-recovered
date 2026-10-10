package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.core.presentation.screen.base.C28919c;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.presentation.error.C30922a;
import com.sumsub.sns.internal.features.presentation.error.C30923b;
import com.sumsub.sns.internal.features.presentation.error.C30924c;
import com.sumsub.sns.internal.features.presentation.error.InterfaceC30925d;
import com.sumsub.sns.internal.features.presentation.main.C31252d;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28124i extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57340a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31252d f57341b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC29149l0 f57342c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C28135m f57343d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC28133l f57344e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28124i(C31252d c31252d, AbstractC29149l0 abstractC29149l0, C28135m c28135m, AbstractC28133l abstractC28133l, Continuation continuation) {
        super(2, continuation);
        this.f57341b = c31252d;
        this.f57342c = abstractC29149l0;
        this.f57343d = c28135m;
        this.f57344e = abstractC28133l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28124i(this.f57341b, this.f57342c, this.f57343d, this.f57344e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28124i) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57340a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C31252d c31252d = this.f57341b;
            C28919c c28919c = new C28919c(this.f57342c, this.f57343d.f57363b);
            this.f57340a = 1;
            obj = c31252d.m70659a(c28919c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        InterfaceC30925d interfaceC30925d = (InterfaceC30925d) obj;
        if (interfaceC30925d instanceof C30923b) {
            this.f57344e.getViewModel$idensic_mobile_sdk_aar_defaultRelease().onErrorCancelled(((C30923b) interfaceC30925d).f62465a);
        } else if (interfaceC30925d instanceof C30922a) {
            this.f57344e.getViewModel$idensic_mobile_sdk_aar_defaultRelease().onHandleError(((C30922a) interfaceC30925d).f62464a);
        } else if (!(interfaceC30925d instanceof C30924c)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
