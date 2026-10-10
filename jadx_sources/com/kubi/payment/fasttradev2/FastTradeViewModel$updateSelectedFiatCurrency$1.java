package com.kubi.payment.fasttradev2;

import com.kubi.payment.fast.data.entities.FastTradeFiatCurrency;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
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

/* JADX INFO: compiled from: FastTradeViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel$updateSelectedFiatCurrency$1", m90122f = "FastTradeViewModel.kt", m90123i = {0, 0, 1, 1}, m90124l = {523, 526}, m90125m = "invokeSuspend", m90126n = {"currentFiatCurrency", "fiatCurrencyList", "currentFiatCurrency", "fiatCurrencyList"}, m90127s = {"L$0", "L$1", "L$0", "L$1"})
public final class FastTradeViewModel$updateSelectedFiatCurrency$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $needCache;
    final /* synthetic */ FastTradeFiatCurrency.Response $newFiatCurrency;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FastTradeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeViewModel$updateSelectedFiatCurrency$1(FastTradeFiatCurrency.Response response, FastTradeViewModel fastTradeViewModel, boolean z11, Continuation<? super FastTradeViewModel$updateSelectedFiatCurrency$1> continuation) {
        super(2, continuation);
        this.$newFiatCurrency = response;
        this.this$0 = fastTradeViewModel;
        this.$needCache = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FastTradeViewModel$updateSelectedFiatCurrency$1(this.$newFiatCurrency, this.this$0, this.$needCache, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FastTradeViewModel$updateSelectedFiatCurrency$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        if (r9.m47300Z(r4, r8) == r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<ItemFiatCurrency> listM66560c;
        FastTradeFiatCurrency.Response response;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                listM66560c = (List) this.L$1;
                response = (FastTradeFiatCurrency.Response) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (this.$needCache) {
                    FastTradeViewModel fastTradeViewModel = this.this$0;
                    String strM66668h = C27041f.m66668h(this.$newFiatCurrency.getTitle());
                    this.L$0 = SpillingKt.nullOutSpilledVariable(response);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(listM66560c);
                    this.label = 2;
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (this.$newFiatCurrency == null) {
            return Unit.INSTANCE;
        }
        FastTradeFiatCurrency.Response response2 = (FastTradeFiatCurrency.Response) this.this$0.f39000d0.getValue();
        if (response2 == null || !Intrinsics.areEqual(response2, this.$newFiatCurrency)) {
            this.this$0.f39000d0.setValue(this.$newFiatCurrency);
            listM66560c = C27024b.m66560c((List) this.this$0.f38999c0.getValue());
            for (ItemFiatCurrency itemFiatCurrency : listM66560c) {
                itemFiatCurrency.getFiatCurrency().setSelected(Intrinsics.areEqual(itemFiatCurrency.getFiatCurrency().getTitle(), this.$newFiatCurrency.getTitle()));
            }
            FastTradeViewModel fastTradeViewModel2 = this.this$0;
            FastTradeFiatCurrency.Response response3 = this.$newFiatCurrency;
            this.L$0 = SpillingKt.nullOutSpilledVariable(response2);
            this.L$1 = SpillingKt.nullOutSpilledVariable(listM66560c);
            this.label = 1;
            if (fastTradeViewModel2.m47293T0(response3, this) != coroutine_suspended) {
                response = response2;
                if (this.$needCache) {
                    FastTradeViewModel fastTradeViewModel3 = this.this$0;
                    String strM66668h2 = C27041f.m66668h(this.$newFiatCurrency.getTitle());
                    this.L$0 = SpillingKt.nullOutSpilledVariable(response);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(listM66560c);
                    this.label = 2;
                }
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
