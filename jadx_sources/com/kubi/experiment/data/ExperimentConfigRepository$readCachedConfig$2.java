package com.kubi.experiment.data;

import com.kubi.experiment.core.ExperimentConfig;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: ExperimentConfigRepository.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/experiment/core/ExperimentConfig;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.experiment.data.ExperimentConfigRepository$readCachedConfig$2", m90122f = "ExperimentConfigRepository.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ExperimentConfigRepository$readCachedConfig$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super ExperimentConfig>, Object> {
    int label;
    final /* synthetic */ ExperimentConfigRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentConfigRepository$readCachedConfig$2(ExperimentConfigRepository experimentConfigRepository, Continuation<? super ExperimentConfigRepository$readCachedConfig$2> continuation) {
        super(2, continuation);
        this.this$0 = experimentConfigRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExperimentConfigRepository$readCachedConfig$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super ExperimentConfig> continuation) {
        return ((ExperimentConfigRepository$readCachedConfig$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                ExperimentConfig experimentConfig = (ExperimentConfig) this.this$0.f21690b.invoke();
                if (experimentConfig != null && !Intrinsics.areEqual(experimentConfig.getVersion(), this.this$0.f21693e)) {
                    this.this$0.f21692d.invoke();
                    return null;
                }
                return experimentConfig;
            } catch (CancellationException e11) {
                throw e11;
            } catch (Exception e12) {
                C44128b.m97270n("ExperimentConfigRepository", "read experiment config cache failed: " + e12.getMessage());
                return null;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
