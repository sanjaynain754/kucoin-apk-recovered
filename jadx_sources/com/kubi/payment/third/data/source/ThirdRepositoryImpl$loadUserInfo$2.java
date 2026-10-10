package com.kubi.payment.third.data.source;

import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.payment.third.data.source.remote.ThirdRemoteDataSource;
import com.kubi.sdk.base.entity.BaseEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ThirdRepositoryImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/otc/entity/FiatUserInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.third.data.source.ThirdRepositoryImpl$loadUserInfo$2", m90122f = "ThirdRepositoryImpl.kt", m90123i = {}, m90124l = {21}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ThirdRepositoryImpl$loadUserInfo$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super BaseEntity<FiatUserInfo>>, Object> {
    int label;
    final /* synthetic */ ThirdRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThirdRepositoryImpl$loadUserInfo$2(ThirdRepositoryImpl thirdRepositoryImpl, Continuation<? super ThirdRepositoryImpl$loadUserInfo$2> continuation) {
        super(2, continuation);
        this.this$0 = thirdRepositoryImpl;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ThirdRepositoryImpl$loadUserInfo$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super BaseEntity<FiatUserInfo>> continuation) {
        return ((ThirdRepositoryImpl$loadUserInfo$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ThirdRemoteDataSource thirdRemoteDataSource = this.this$0.f40225a;
        this.label = 1;
        Object objM49550f = thirdRemoteDataSource.m49550f(this);
        if (objM49550f == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM49550f;
    }
}
