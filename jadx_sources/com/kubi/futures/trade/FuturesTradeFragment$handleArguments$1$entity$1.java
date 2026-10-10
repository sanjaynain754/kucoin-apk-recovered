package com.kubi.futures.trade;

import com.kubi.utils.C27099x;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sh.EuropeUnlockLeverageRouterEntity;

/* JADX INFO: compiled from: FuturesTradeFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageRouterEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesTradeFragment$handleArguments$1$entity$1", m90122f = "FuturesTradeFragment.kt", m90123i = {0, 0, 0}, m90124l = {483}, m90125m = "invokeSuspend", m90126n = {"this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "I$0"})
@SourceDebugExtension({"SMAP\nFuturesTradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTradeFragment.kt\ncom/kubi/futures/trade/FuturesTradeFragment$handleArguments$1$entity$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,480:1\n196#2,3:481\n*S KotlinDebug\n*F\n+ 1 FuturesTradeFragment.kt\ncom/kubi/futures/trade/FuturesTradeFragment$handleArguments$1$entity$1\n*L\n437#1:481,3\n*E\n"})
public final class FuturesTradeFragment$handleArguments$1$entity$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super EuropeUnlockLeverageRouterEntity>, Object> {
    final /* synthetic */ String $europeUnlockLeverage;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesTradeFragment$handleArguments$1$entity$1(String str, Continuation<? super FuturesTradeFragment$handleArguments$1$entity$1> continuation) {
        super(2, continuation);
        this.$europeUnlockLeverage = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesTradeFragment$handleArguments$1$entity$1(this.$europeUnlockLeverage, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super EuropeUnlockLeverageRouterEntity> continuation) {
        return ((FuturesTradeFragment$handleArguments$1$entity$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        C27099x c27099x = C27099x.f54458a;
        String str = this.$europeUnlockLeverage;
        InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C13603x269b45fb(str, null)), C42911a.m94120b());
        this.L$0 = SpillingKt.nullOutSpilledVariable(c27099x);
        this.L$1 = SpillingKt.nullOutSpilledVariable(str);
        this.I$0 = 0;
        this.label = 1;
        Object objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, this);
        if (objM90914f0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM90914f0;
    }
}
