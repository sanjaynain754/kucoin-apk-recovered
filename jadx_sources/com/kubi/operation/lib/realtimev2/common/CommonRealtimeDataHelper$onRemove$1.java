package com.kubi.operation.lib.realtimev2.common;

import com.kubi.operation.lib.api.OperationRepo;
import com.kubi.operation.lib.realtimev2.DynamicCardItemEntity;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CommonRealtimeDataHelper.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.realtimev2.common.CommonRealtimeDataHelper$onRemove$1", m90122f = "CommonRealtimeDataHelper.kt", m90123i = {}, m90124l = {104}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CommonRealtimeDataHelper$onRemove$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<DynamicCardItemEntity> $dataList;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRealtimeDataHelper$onRemove$1(List<DynamicCardItemEntity> list, Continuation<? super CommonRealtimeDataHelper$onRemove$1> continuation) {
        super(2, continuation);
        this.$dataList = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommonRealtimeDataHelper$onRemove$1(this.$dataList, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CommonRealtimeDataHelper$onRemove$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            OperationRepo operationRepo = CommonRealtimeDataHelper.f36804b;
            List<DynamicCardItemEntity> list = this.$dataList;
            this.label = 1;
            if (OperationRepo.m43263h(operationRepo, list, null, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
