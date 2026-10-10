package androidx.privacysandbox.ads.adservices.java.signals;

import androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager;
import androidx.privacysandbox.ads.adservices.signals.UpdateSignalsRequest;
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

/* JADX INFO: compiled from: ProtectedSignalsManagerFutures.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "androidx.privacysandbox.ads.adservices.java.signals.ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1", m90122f = "ProtectedSignalsManagerFutures.kt", m90123i = {}, m90124l = {111}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ UpdateSignalsRequest $request;
    int label;
    final /* synthetic */ ProtectedSignalsManagerFutures.JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1(ProtectedSignalsManagerFutures.JavaImpl javaImpl, UpdateSignalsRequest updateSignalsRequest, Continuation<? super ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = javaImpl;
        this.$request = updateSignalsRequest;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1(this.this$0, this.$request, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ProtectedSignalsManagerFutures$JavaImpl$updateSignalsAsync$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ProtectedSignalsManager protectedSignalsManager = this.this$0.mProtectedSignalsManager;
            Intrinsics.checkNotNull(protectedSignalsManager);
            UpdateSignalsRequest updateSignalsRequest = this.$request;
            this.label = 1;
            if (protectedSignalsManager.updateSignals(updateSignalsRequest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
