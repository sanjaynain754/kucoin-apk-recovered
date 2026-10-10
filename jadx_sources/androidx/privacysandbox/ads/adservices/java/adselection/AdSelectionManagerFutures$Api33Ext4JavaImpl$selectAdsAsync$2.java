package androidx.privacysandbox.ads.adservices.java.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome;
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

/* JADX INFO: compiled from: AdSelectionManagerFutures.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2", m90122f = "AdSelectionManagerFutures.kt", m90123i = {}, m90124l = {317}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super AdSelectionOutcome>, Object> {
    final /* synthetic */ AdSelectionFromOutcomesConfig $adSelectionFromOutcomesConfig;
    int label;
    final /* synthetic */ AdSelectionManagerFutures.Api33Ext4JavaImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2(AdSelectionManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, Continuation<? super AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2> continuation) {
        super(2, continuation);
        this.this$0 = api33Ext4JavaImpl;
        this.$adSelectionFromOutcomesConfig = adSelectionFromOutcomesConfig;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2(this.this$0, this.$adSelectionFromOutcomesConfig, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super AdSelectionOutcome> continuation) {
        return ((AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig = this.$adSelectionFromOutcomesConfig;
        this.label = 1;
        Object objSelectAds = adSelectionManager.selectAds(adSelectionFromOutcomesConfig, this);
        if (objSelectAds == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objSelectAds;
    }
}
