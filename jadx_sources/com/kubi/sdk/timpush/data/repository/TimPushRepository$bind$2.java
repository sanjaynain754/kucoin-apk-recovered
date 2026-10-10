package com.kubi.sdk.timpush.data.repository;

import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.timpush.data.entity.TimPushBind;
import com.kubi.sdk.timpush.data.model.PushBinding;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import s00.C44265a;
import t00.C44607a;

/* JADX INFO: compiled from: TimPushRepository.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/base/entity/BaseEntity;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.timpush.data.repository.TimPushRepository$bind$2", m90122f = "TimPushRepository.kt", m90123i = {0}, m90124l = {40}, m90125m = "invokeSuspend", m90126n = {"param"}, m90127s = {"L$0"})
public final class TimPushRepository$bind$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super BaseEntity<Object>>, Object> {
    final /* synthetic */ PushBinding $binding;
    Object L$0;
    int label;
    final /* synthetic */ TimPushRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimPushRepository$bind$2(PushBinding pushBinding, TimPushRepository timPushRepository, Continuation<? super TimPushRepository$bind$2> continuation) {
        super(2, continuation);
        this.$binding = pushBinding;
        this.this$0 = timPushRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TimPushRepository$bind$2(this.$binding, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super BaseEntity<Object>> continuation) {
        return ((TimPushRepository$bind$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        TimPushBind timPushBindM97685a = C44265a.f97812a.m97685a(this.$binding);
        C44607a c44607a = this.this$0.f48091a;
        this.L$0 = SpillingKt.nullOutSpilledVariable(timPushBindM97685a);
        this.label = 1;
        Object objM98718a = c44607a.m98718a(timPushBindM97685a, this);
        if (objM98718a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM98718a;
    }
}
