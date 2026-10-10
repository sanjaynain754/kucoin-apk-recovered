package com.sumsub.sns.internal.features.presentation.questionnaire;

import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.questionnaire.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32312h extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public C32300I f65834a;

    /* JADX INFO: renamed from: b */
    public int f65835b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32300I f65836c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32312h(C32300I c32300i, Continuation continuation) {
        super(2, continuation);
        this.f65836c = c32300i;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32312h(this.f65836c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32312h(this.f65836c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C32300I c32300i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65835b;
        if (i11 != 0) {
            if (i11 == 1) {
                c32300i = this.f65834a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32300I c32300i2 = this.f65836c;
            InterfaceC29921d interfaceC29921d = c32300i2.f65805g;
            this.f65834a = c32300i2;
            this.f65835b = 1;
            Object objM70022c = ((C29950z) interfaceC29921d).m70022c(this);
            if (objM70022c == coroutine_suspended) {
                return coroutine_suspended;
            }
            c32300i = c32300i2;
            obj = objM70022c;
        }
        c32300i.f65819u = (Function1) obj;
        return Unit.INSTANCE;
    }
}
