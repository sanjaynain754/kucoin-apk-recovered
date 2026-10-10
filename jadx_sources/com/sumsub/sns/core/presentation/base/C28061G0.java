package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.G0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28061G0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57231a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC28073M0 f57232b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28061G0(AbstractC28073M0 abstractC28073M0, Continuation continuation) {
        super(2, continuation);
        this.f57232b = abstractC28073M0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28061G0(this.f57232b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28061G0(this.f57232b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57231a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC29984m interfaceC29984m = this.f57232b.dataRepository;
        this.f57231a = 1;
        Object objM70047c = ((C29967J) interfaceC29984m).m70047c(false, this);
        if (objM70047c == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM70047c;
    }
}
