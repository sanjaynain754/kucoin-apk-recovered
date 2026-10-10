package com.kubi.assets.view.tab;

import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.data.entity.AssetSingleEntity;
import com.kubi.event.api.C12572a;
import java.math.BigDecimal;
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

/* JADX INFO: compiled from: AssetTabSortHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.view.tab.AssetTabSortHelper$refreshAssetsPageTabs$1$1$1", m90122f = "AssetTabSortHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetTabSortHelper$refreshAssetsPageTabs$1$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ AssetV2OverviewEntity $assetBalances;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetTabSortHelper$refreshAssetsPageTabs$1$1$1(AssetV2OverviewEntity assetV2OverviewEntity, Continuation<? super AssetTabSortHelper$refreshAssetsPageTabs$1$1$1> continuation) {
        super(2, continuation);
        this.$assetBalances = assetV2OverviewEntity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetTabSortHelper$refreshAssetsPageTabs$1$1$1(this.$assetBalances, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetTabSortHelper$refreshAssetsPageTabs$1$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BigDecimal totalBalance;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            TabManager tabManager = (TabManager) AssetTabSortHelper.f19163c.get();
            if (tabManager != null) {
                tabManager.m20090i(AssetTabSortHelper.f19161a.m20072o());
            }
            AssetSingleEntity total = this.$assetBalances.getTotal();
            if (total != null && (totalBalance = total.getTotalBalance()) != null && totalBalance.compareTo(BigDecimal.ZERO) == 0) {
                C12572a.m23695d("SHOW_HIDE_SORT_BUTTON", Boxing.boxBoolean(false), 0L, 4, null);
            } else {
                C12572a.m23695d("SHOW_HIDE_SORT_BUTTON", Boxing.boxBoolean(true), 0L, 4, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
