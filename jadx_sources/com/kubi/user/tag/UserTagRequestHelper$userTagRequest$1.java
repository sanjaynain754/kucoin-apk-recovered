package com.kubi.user.tag;

import com.kubi.user.api.h;
import com.kubi.user.helper.w;
import com.kubi.user.tag.entity.UserTagRequest;
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
import ro.C44128b;

/* JADX INFO: compiled from: UserTagRequestHelper.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.user.tag.UserTagRequestHelper$userTagRequest$1", m90122f = "UserTagRequestHelper.kt", m90123i = {0, 0, 0}, m90124l = {30}, m90125m = "invokeSuspend", m90126n = {"userTagList", "userTagApi", "userTagRequest"}, m90127s = {"L$0", "L$1", "L$2"})
public final class UserTagRequestHelper$userTagRequest$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    public UserTagRequestHelper$userTagRequest$1(Continuation<? super UserTagRequestHelper$userTagRequest$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserTagRequestHelper$userTagRequest$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UserTagRequestHelper$userTagRequest$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                w wVar = w.a;
                if (!wVar.d()) {
                    return Unit.INSTANCE;
                }
                List listC = wVar.c();
                h hVar = (h) C42597a.m93388d().create(h.class);
                UserTagRequest userTagRequest = new UserTagRequest(listC);
                this.L$0 = SpillingKt.nullOutSpilledVariable(listC);
                this.L$1 = SpillingKt.nullOutSpilledVariable(hVar);
                this.L$2 = SpillingKt.nullOutSpilledVariable(userTagRequest);
                this.label = 1;
                if (hVar.a(userTagRequest, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            w.a.b();
        } catch (Exception e11) {
            C44128b.m97261e("UserTagRequestHelper", "userTagApi failed, exception is " + e11);
        }
        return Unit.INSTANCE;
    }
}
