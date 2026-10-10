package com.kubi.experiment.bridge;

import com.kubi.experiment.IExperimentService;
import com.kubi.sdk.protocol.ProtocolException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ExperimentBridgeDelegate.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.experiment.bridge.ExperimentBridgeDelegate$getExperimentResult$1$1$1", m90122f = "ExperimentBridgeDelegate.kt", m90123i = {}, m90124l = {18}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ExperimentBridgeDelegate$getExperimentResult$1$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $code;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExperimentBridgeDelegate$getExperimentResult$1$1$1(String str, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super ExperimentBridgeDelegate$getExperimentResult$1$1$1> continuation) {
        super(2, continuation);
        this.$code = str;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExperimentBridgeDelegate$getExperimentResult$1$1$1(this.$code, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ExperimentBridgeDelegate$getExperimentResult$1$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                IExperimentService iExperimentService = IExperimentService.f21603a.get();
                String str = this.$code;
                this.label = 1;
                obj = iExperimentService.mo23705a(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.$callback.invoke(Boxing.boxBoolean(((Boolean) obj).booleanValue()), null);
        } catch (Exception e11) {
            this.$callback.invoke(null, new ProtocolException("getExperimentResult error: " + e11.getMessage(), null, null, false, 14, null));
        }
        return Unit.INSTANCE;
    }
}
