package com.kubi.futures.trade;

import androidx.fragment.app.FragmentManager;
import com.kubi.futures.compliance.leverage.EuropeTrialSimulationOrderDialog;
import com.kubi.utils.extensions.C27039d;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import sh.EuropeUnlockLeverageRouterEntity;

/* JADX INFO: compiled from: FuturesTradeFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesTradeFragment$handleArguments$1", m90122f = "FuturesTradeFragment.kt", m90123i = {}, m90124l = {436}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FuturesTradeFragment$handleArguments$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $europeUnlockLeverage;
    int label;
    final /* synthetic */ FuturesTradeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesTradeFragment$handleArguments$1(FuturesTradeFragment futuresTradeFragment, String str, Continuation<? super FuturesTradeFragment$handleArguments$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresTradeFragment;
        this.$europeUnlockLeverage = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesTradeFragment$handleArguments$1(this.this$0, this.$europeUnlockLeverage, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesTradeFragment$handleArguments$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            FuturesTradeFragment$handleArguments$1$entity$1 futuresTradeFragment$handleArguments$1$entity$1 = new FuturesTradeFragment$handleArguments$1$entity$1(this.$europeUnlockLeverage, null);
            this.label = 1;
            obj = C41686h.m91049g(abstractC41697j0M94120b, futuresTradeFragment$handleArguments$1$entity$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        EuropeUnlockLeverageRouterEntity europeUnlockLeverageRouterEntity = (EuropeUnlockLeverageRouterEntity) obj;
        if (europeUnlockLeverageRouterEntity != null) {
            if (this.this$0.m26579x3() == null) {
                return Unit.INSTANCE;
            }
            FuturesTradeFragment futuresTradeFragment = this.this$0;
            FragmentManager childFragmentManager = futuresTradeFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            futuresTradeFragment.m26575t3(childFragmentManager);
            EuropeTrialSimulationOrderDialog.Companion companion = EuropeTrialSimulationOrderDialog.f22596y0;
            FragmentManager childFragmentManager2 = this.this$0.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            companion.show(childFragmentManager2, europeUnlockLeverageRouterEntity.m97964c(), C27039d.m66651k(europeUnlockLeverageRouterEntity.getFinishCount(), 1), C27039d.m66651k(europeUnlockLeverageRouterEntity.getTotalCount(), 3));
        }
        return Unit.INSTANCE;
    }
}
