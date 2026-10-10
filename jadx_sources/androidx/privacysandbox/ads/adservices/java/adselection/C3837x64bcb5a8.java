package androidx.privacysandbox.ads.adservices.java.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import androidx.privacysandbox.ads.adservices.adselection.UpdateAdCounterHistogramRequest;
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

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$updateAdCounterHistogramAsync$1 */
/* JADX INFO: compiled from: AdSelectionManagerFutures.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$updateAdCounterHistogramAsync$1", m90122f = "AdSelectionManagerFutures.kt", m90123i = {}, m90124l = {338}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C3837x64bcb5a8 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ UpdateAdCounterHistogramRequest $updateAdCounterHistogramRequest;
    int label;
    final /* synthetic */ AdSelectionManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3837x64bcb5a8(AdSelectionManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, Continuation<? super C3837x64bcb5a8> continuation) {
        super(2, continuation);
        this.this$0 = api33Ext4JavaImpl;
        this.$updateAdCounterHistogramRequest = updateAdCounterHistogramRequest;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C3837x64bcb5a8(this.this$0, this.$updateAdCounterHistogramRequest, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((C3837x64bcb5a8) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AdSelectionManager adSelectionManager = this.this$0.mAdSelectionManager;
            Intrinsics.checkNotNull(adSelectionManager);
            UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest = this.$updateAdCounterHistogramRequest;
            this.label = 1;
            if (adSelectionManager.updateAdCounterHistogram(updateAdCounterHistogramRequest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
