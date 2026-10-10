package com.sumsub.sns.internal.features.presentation.questionnaire;

import com.sumsub.sns.internal.features.data.model.common.C29069W2;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.domain.C30157e0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32297F extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65788a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32300I f65789b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29069W2 f65790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32297F(C32300I c32300i, C29069W2 c29069w2, Continuation continuation) {
        super(2, continuation);
        this.f65789b = c32300i;
        this.f65790c = c29069w2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32297F(this.f65789b, this.f65790c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32297F(this.f65789b, this.f65790c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM70121a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65788a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                objM70121a = ((Result) obj).getValue();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32300I c32300i = this.f65789b;
            C30157e0 c30157e0 = c32300i.f65802d;
            InterfaceC29921d interfaceC29921d = c32300i.f65805g;
            C29069W2 c29069w2 = this.f65790c;
            this.f65788a = 1;
            objM70121a = c30157e0.m70121a(interfaceC29921d, c29069w2, this);
            if (objM70121a == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Result.m103843boximpl(objM70121a);
    }
}
