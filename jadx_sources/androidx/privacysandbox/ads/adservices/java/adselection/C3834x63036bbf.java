package androidx.privacysandbox.ads.adservices.java.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome;
import androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest;
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

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$getAdSelectionDataAsync$1 */
/* JADX INFO: compiled from: AdSelectionManagerFutures.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Landroidx/privacysandbox/ads/adservices/adselection/GetAdSelectionDataOutcome;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$getAdSelectionDataAsync$1", m90122f = "AdSelectionManagerFutures.kt", m90123i = {}, m90124l = {361}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C3834x63036bbf extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super GetAdSelectionDataOutcome>, Object> {
    final /* synthetic */ GetAdSelectionDataRequest $getAdSelectionDataRequest;
    int label;
    final /* synthetic */ AdSelectionManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3834x63036bbf(AdSelectionManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, GetAdSelectionDataRequest getAdSelectionDataRequest, Continuation<? super C3834x63036bbf> continuation) {
        super(2, continuation);
        this.this$0 = api33Ext4JavaImpl;
        this.$getAdSelectionDataRequest = getAdSelectionDataRequest;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C3834x63036bbf(this.this$0, this.$getAdSelectionDataRequest, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super GetAdSelectionDataOutcome> continuation) {
        return ((C3834x63036bbf) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        AdSelectionManager adSelectionManager = this.this$0.mAdSelectionManager;
        Intrinsics.checkNotNull(adSelectionManager);
        GetAdSelectionDataRequest getAdSelectionDataRequest = this.$getAdSelectionDataRequest;
        this.label = 1;
        Object adSelectionData = adSelectionManager.getAdSelectionData(getAdSelectionDataRequest, this);
        if (adSelectionData == coroutine_suspended) {
            return coroutine_suspended;
        }
        return adSelectionData;
    }
}
