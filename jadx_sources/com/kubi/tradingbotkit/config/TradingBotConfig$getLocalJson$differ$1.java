package com.kubi.tradingbotkit.config;

import com.kubi.sdk.BaseApplication;
import com.kubi.tradingbotkit.entity.GridTradingItemEntity;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27101y;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import n50.C42756a;
import o00.C42911a;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TradingBotConfig.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "", "Lcom/kubi/tradingbotkit/entity/GridTradingItemEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradingbotkit.config.TradingBotConfig$getLocalJson$differ$1", m90122f = "TradingBotConfig.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {211}, m90125m = "invokeSuspend", m90126n = {"$this$async", "currencyUnitStr", "this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
@SourceDebugExtension({"SMAP\nTradingBotConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradingBotConfig.kt\ncom/kubi/tradingbotkit/config/TradingBotConfig$getLocalJson$differ$1\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 TradingBotIssue.kt\ncom/kubi/tradingbotkit/exeption/TradingBotIssueKt\n*L\n1#1,208:1\n196#2,3:209\n45#3,4:212\n*S KotlinDebug\n*F\n+ 1 TradingBotConfig.kt\ncom/kubi/tradingbotkit/config/TradingBotConfig$getLocalJson$differ$1\n*L\n118#1:209,3\n122#1:212,4\n*E\n"})
public final class TradingBotConfig$getLocalJson$differ$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super HashMap<String, List<? extends GridTradingItemEntity>>>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    public TradingBotConfig$getLocalJson$differ$1(Continuation<? super TradingBotConfig$getLocalJson$differ$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super HashMap<String, List<? extends GridTradingItemEntity>>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super HashMap<String, List<GridTradingItemEntity>>>) continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TradingBotConfig$getLocalJson$differ$1 tradingBotConfig$getLocalJson$differ$1 = new TradingBotConfig$getLocalJson$differ$1(continuation);
        tradingBotConfig$getLocalJson$differ$1.L$0 = obj;
        return tradingBotConfig$getLocalJson$differ$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super HashMap<String, List<GridTradingItemEntity>>> continuation) {
        return ((TradingBotConfig$getLocalJson$differ$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                String strM66925a = C27101y.m66925a(BaseApplication.INSTANCE.get(), "grid_trading_list.json");
                C27099x c27099x = C27099x.f54458a;
                Intrinsics.checkNotNull(strM66925a);
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C26209xaa6a2a4c(strM66925a, null)), C42911a.m94120b());
                this.L$0 = interfaceC41709m0;
                this.L$1 = SpillingKt.nullOutSpilledVariable(strM66925a);
                this.L$2 = SpillingKt.nullOutSpilledVariable(c27099x);
                this.L$3 = SpillingKt.nullOutSpilledVariable(strM66925a);
                this.I$0 = 0;
                this.label = 1;
                obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (HashMap) obj;
        } catch (Exception e11) {
            String simpleName = interfaceC41709m0.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            if (!C42899b.m94075e(e11)) {
                C42756a.m93685b(e11, simpleName);
            }
            return null;
        }
    }
}
