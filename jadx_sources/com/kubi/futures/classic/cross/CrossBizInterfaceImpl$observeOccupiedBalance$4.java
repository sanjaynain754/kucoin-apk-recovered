package com.kubi.futures.classic.cross;

import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p342ih.C38609v;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: CrossBizInterfaceImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.classic.cross.CrossBizInterfaceImpl$observeOccupiedBalance$4", m90122f = "CrossBizInterfaceImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CrossBizInterfaceImpl$observeOccupiedBalance$4 extends SuspendLambda implements Function3<InterfaceC41635f<? super SimpleBalanceEntity>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ C38609v $manager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossBizInterfaceImpl$observeOccupiedBalance$4(C38609v c38609v, Continuation<? super CrossBizInterfaceImpl$observeOccupiedBalance$4> continuation) {
        super(3, continuation);
        this.$manager = c38609v;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC41635f<? super SimpleBalanceEntity> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
        return new CrossBizInterfaceImpl$observeOccupiedBalance$4(this.$manager, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$manager.m87319V("observeOccupiedBalance");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
