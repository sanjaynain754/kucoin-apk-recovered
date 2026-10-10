package com.kubi.unify.stream;

import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import java.util.Map;
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
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeMarginMode$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifyNetworkDataSourceImpl$observeMarginMode$2 extends SuspendLambda implements Function3<InterfaceC41635f<? super Map<String, ? extends MarginModeInfoEntity>>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public UnifyNetworkDataSourceImpl$observeMarginMode$2(Continuation<? super UnifyNetworkDataSourceImpl$observeMarginMode$2> continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41635f<? super Map<String, ? extends MarginModeInfoEntity>> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC41635f<? super Map<String, MarginModeInfoEntity>>) interfaceC41635f, th2, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41635f<? super Map<String, MarginModeInfoEntity>> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
        UnifyNetworkDataSourceImpl$observeMarginMode$2 unifyNetworkDataSourceImpl$observeMarginMode$2 = new UnifyNetworkDataSourceImpl$observeMarginMode$2(continuation);
        unifyNetworkDataSourceImpl$observeMarginMode$2.L$0 = th2;
        return unifyNetworkDataSourceImpl$observeMarginMode$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th2 = (Throwable) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C44128b.m97262f("[unifyAccount]", "observeMarginMode", th2);
        return Unit.INSTANCE;
    }
}
