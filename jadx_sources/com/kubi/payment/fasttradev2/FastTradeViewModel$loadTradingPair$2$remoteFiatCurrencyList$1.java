package com.kubi.payment.fasttradev2;

import com.kubi.payment.fast.data.entities.FastTradeFiatCurrency;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FastTradeViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel$loadTradingPair$2$remoteFiatCurrencyList$1", m90122f = "FastTradeViewModel.kt", m90123i = {}, m90124l = {180}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FastTradeViewModel$loadTradingPair$2$remoteFiatCurrencyList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends FastTradeFiatCurrency.Response>>, Object> {
    int label;
    final /* synthetic */ FastTradeViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends FastTradeFiatCurrency.Response>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<FastTradeFiatCurrency.Response>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeViewModel$loadTradingPair$2$remoteFiatCurrencyList$1(FastTradeViewModel fastTradeViewModel, Continuation<? super FastTradeViewModel$loadTradingPair$2$remoteFiatCurrencyList$1> continuation) {
        super(2, continuation);
        this.this$0 = fastTradeViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FastTradeViewModel$loadTradingPair$2$remoteFiatCurrencyList$1(this.this$0, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<FastTradeFiatCurrency.Response>> continuation) {
        return ((FastTradeViewModel$loadTradingPair$2$remoteFiatCurrencyList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        FastTradeViewModel fastTradeViewModel = this.this$0;
        this.label = 1;
        Object objM47285J0 = fastTradeViewModel.m47285J0(this);
        if (objM47285J0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM47285J0;
    }
}
