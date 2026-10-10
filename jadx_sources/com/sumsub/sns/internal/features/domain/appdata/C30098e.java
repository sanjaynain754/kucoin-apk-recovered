package com.sumsub.sns.internal.features.domain.appdata;

import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.appdata.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30098e extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public int f60506a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC29921d f60507b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30098e(InterfaceC29921d interfaceC29921d, Continuation continuation) {
        super(1, continuation);
        this.f60507b = interfaceC29921d;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C30098e(this.f60507b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C30098e(this.f60507b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60506a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC29921d interfaceC29921d = this.f60507b;
        this.f60506a = 1;
        Object objM70025f = ((C29950z) interfaceC29921d).m70025f(this);
        if (objM70025f == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM70025f;
    }
}
