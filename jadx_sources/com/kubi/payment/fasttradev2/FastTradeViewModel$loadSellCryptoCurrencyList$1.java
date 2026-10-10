package com.kubi.payment.fasttradev2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.MutableLiveData;
import com.kubi.payment.fast.data.entities.FastTradeCryptoCurrency;
import com.kubi.payment.fast.data.entities.FastTradeFiatCurrency;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.C42875h;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FastTradeViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel$loadSellCryptoCurrencyList$1", m90122f = "FastTradeViewModel.kt", m90123i = {0}, m90124l = {421}, m90125m = "invokeSuspend", m90126n = {"$this$launch"}, m90127s = {"L$0"})
public final class FastTradeViewModel$loadSellCryptoCurrencyList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FastTradeViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.FastTradeViewModel$loadSellCryptoCurrencyList$1$1 */
    /* JADX INFO: compiled from: FastTradeViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel$loadSellCryptoCurrencyList$1$1", m90122f = "FastTradeViewModel.kt", m90123i = {}, m90124l = {TypedValues.CycleType.TYPE_WAVE_PHASE}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C206951 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<FastTradeCryptoCurrency.Response> $cryptoCurrencyList;
        final /* synthetic */ FastTradeCryptoCurrency.Response $selectedCryptoCurrency;
        int label;
        final /* synthetic */ FastTradeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C206951(FastTradeViewModel fastTradeViewModel, FastTradeCryptoCurrency.Response response, List<FastTradeCryptoCurrency.Response> list, Continuation<? super C206951> continuation) {
            super(2, continuation);
            this.this$0 = fastTradeViewModel;
            this.$selectedCryptoCurrency = response;
            this.$cryptoCurrencyList = list;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C206951(this.this$0, this.$selectedCryptoCurrency, this.$cryptoCurrencyList, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C206951) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                FastTradeViewModel fastTradeViewModel = this.this$0;
                FastTradeCryptoCurrency.Response response = this.$selectedCryptoCurrency;
                List<FastTradeCryptoCurrency.Response> list = this.$cryptoCurrencyList;
                MutableLiveData mutableLiveData = fastTradeViewModel.f39005i0;
                this.label = 1;
                if (fastTradeViewModel.m47306f0(response, list, mutableLiveData, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.this$0.f39004h0.setValue(new C42875h(Boxing.boxBoolean(true)));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeViewModel$loadSellCryptoCurrencyList$1(FastTradeViewModel fastTradeViewModel, Continuation<? super FastTradeViewModel$loadSellCryptoCurrencyList$1> continuation) {
        super(2, continuation);
        this.this$0 = fastTradeViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FastTradeViewModel$loadSellCryptoCurrencyList$1 fastTradeViewModel$loadSellCryptoCurrencyList$1 = new FastTradeViewModel$loadSellCryptoCurrencyList$1(this.this$0, continuation);
        fastTradeViewModel$loadSellCryptoCurrencyList$1.L$0 = obj;
        return fastTradeViewModel$loadSellCryptoCurrencyList$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FastTradeViewModel$loadSellCryptoCurrencyList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.m45657p().setValue(Boxing.boxBoolean(true));
            FastTradeViewModel fastTradeViewModel = this.this$0;
            FastTradeFiatCurrency.Response response = (FastTradeFiatCurrency.Response) fastTradeViewModel.f39000d0.getValue();
            this.L$0 = interfaceC41709m0;
            this.label = 1;
            obj = fastTradeViewModel.m47283G0(response, true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List list = (List) obj;
        C41696j.m91102b(interfaceC41709m0, null, null, new C206951(this.this$0, this.this$0.m47310j0(list), list, null), 3, null);
        this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
