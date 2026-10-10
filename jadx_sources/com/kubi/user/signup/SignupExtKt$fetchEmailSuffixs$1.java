package com.kubi.user.signup;

import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.user.api.l;
import com.kubi.user.signupv2.b;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import mr.C42597a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SignupExt.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.signup.SignupExtKt$fetchEmailSuffixs$1", m90122f = "SignupExt.kt", m90123i = {0}, m90124l = {106}, m90125m = "invokeSuspend", m90126n = {"api"}, m90127s = {"L$0"})
public final class SignupExtKt$fetchEmailSuffixs$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;

    public SignupExtKt$fetchEmailSuffixs$1(Continuation<? super SignupExtKt$fetchEmailSuffixs$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignupExtKt$fetchEmailSuffixs$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SignupExtKt$fetchEmailSuffixs$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (!b.a().isEmpty()) {
                return Unit.INSTANCE;
            }
            l lVar = (l) C42597a.m93386b().create(l.class);
            this.L$0 = SpillingKt.nullOutSpilledVariable(lVar);
            this.label = 1;
            obj = lVar.b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        List list = (List) ((BaseEntity) obj).getData();
        if (list != null) {
            b.a().clear();
            b.a().addAll(list);
        }
        return Unit.INSTANCE;
    }
}
