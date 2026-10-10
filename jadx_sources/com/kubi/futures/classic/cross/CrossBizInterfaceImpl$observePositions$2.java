package com.kubi.futures.classic.cross;

import com.kubi.kumex.data.trade.model.PositionEntity;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p342ih.C38609v;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CrossBizInterfaceImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observePositions$2", m90122f = "CrossBizInterfaceImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CrossBizInterfaceImpl$observePositions$2 extends SuspendLambda implements Function2<InterfaceC41635f<? super List<? extends PositionEntity>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ C38609v $manager;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41635f<? super List<? extends PositionEntity>> interfaceC41635f, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC41635f<? super List<PositionEntity>>) interfaceC41635f, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossBizInterfaceImpl$observePositions$2(C38609v c38609v, Continuation<? super CrossBizInterfaceImpl$observePositions$2> continuation) {
        super(2, continuation);
        this.$manager = c38609v;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CrossBizInterfaceImpl$observePositions$2(this.$manager, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41635f<? super List<PositionEntity>> interfaceC41635f, Continuation<? super Unit> continuation) {
        return ((CrossBizInterfaceImpl$observePositions$2) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$manager.m87318Q("observePositions");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
