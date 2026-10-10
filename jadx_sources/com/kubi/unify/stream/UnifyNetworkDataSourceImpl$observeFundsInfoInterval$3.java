package com.kubi.unify.stream;

import com.kubi.unify.entity.UnifyFundsInfoEntity;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import ro.C44128b;

/* JADX INFO: compiled from: UnifyNetworkDataSourceImpl.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/kubi/unify/entity/UnifyFundsInfoEntity;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFundsInfoInterval$3", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifyNetworkDataSourceImpl$observeFundsInfoInterval$3 extends SuspendLambda implements Function3<InterfaceC41635f<? super List<? extends UnifyFundsInfoEntity>>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public UnifyNetworkDataSourceImpl$observeFundsInfoInterval$3(Continuation<? super UnifyNetworkDataSourceImpl$observeFundsInfoInterval$3> continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41635f<? super List<? extends UnifyFundsInfoEntity>> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC41635f<? super List<UnifyFundsInfoEntity>>) interfaceC41635f, th2, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41635f<? super List<UnifyFundsInfoEntity>> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
        UnifyNetworkDataSourceImpl$observeFundsInfoInterval$3 unifyNetworkDataSourceImpl$observeFundsInfoInterval$3 = new UnifyNetworkDataSourceImpl$observeFundsInfoInterval$3(continuation);
        unifyNetworkDataSourceImpl$observeFundsInfoInterval$3.L$0 = th2;
        return unifyNetworkDataSourceImpl$observeFundsInfoInterval$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th2 = (Throwable) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C44128b.m97262f("[unifyAccount]", "observeFundsInfoInterval", th2);
        return Unit.INSTANCE;
    }
}
