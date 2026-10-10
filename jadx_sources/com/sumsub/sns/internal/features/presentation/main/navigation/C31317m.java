package com.sumsub.sns.internal.features.presentation.main.navigation;

import com.sumsub.sns.internal.features.data.repository.navigation.C30027v;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.navigation.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31317m extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63474a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31318n f63475b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31317m(C31318n c31318n, Continuation continuation) {
        super(2, continuation);
        this.f63475b = c31318n;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31317m(this.f63475b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31317m(this.f63475b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM70069a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63474a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                objM70069a = ((Result) obj).getValue();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30027v c30027v = this.f63475b.f63476a;
            this.f63474a = 1;
            objM70069a = c30027v.m70069a(true, (ContinuationImpl) this);
            if (objM70069a == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Result.m103843boximpl(objM70069a);
    }
}
