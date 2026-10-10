package com.kubi.user.password;

import com.kubi.user.api.o;
import mr.C42597a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import ro.C44128b;

/* JADX INFO: compiled from: UpdatePasswordHintService.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/user/password/UpdatePasswordHintEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.password.UpdatePasswordHintService$queryChangePasswordLoader$1", m90122f = "UpdatePasswordHintService.kt", m90123i = {}, m90124l = {33}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UpdatePasswordHintService$queryChangePasswordLoader$1 extends SuspendLambda implements Function1<Continuation<? super UpdatePasswordHintEntity>, Object> {
    int label;

    public UpdatePasswordHintService$queryChangePasswordLoader$1(Continuation<? super UpdatePasswordHintService$queryChangePasswordLoader$1> continuation) {
        super(1, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UpdatePasswordHintService$queryChangePasswordLoader$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super UpdatePasswordHintEntity> continuation) {
        return ((UpdatePasswordHintService$queryChangePasswordLoader$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                o oVar = (o) C42597a.m93388d().create(o.class);
                this.label = 1;
                obj = oVar.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            UpdatePasswordHintEntity updatePasswordHintEntity = (UpdatePasswordHintEntity) obj;
            C44128b.m97259c("UpdatePasswordHintService", "loader overDue=" + updatePasswordHintEntity.getOverDue() + ", exemptionDay=" + updatePasswordHintEntity.getExemptionDay());
            return updatePasswordHintEntity;
        } catch (Exception e11) {
            C44128b.m97263g("UpdatePasswordHintService", e11);
            return null;
        }
    }
}
