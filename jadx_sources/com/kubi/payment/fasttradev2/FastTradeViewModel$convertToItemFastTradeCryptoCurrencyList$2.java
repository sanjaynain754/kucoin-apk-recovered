package com.kubi.payment.fasttradev2;

import androidx.lifecycle.MutableLiveData;
import com.kubi.payment.fast.data.entities.FastTradeCryptoCurrency;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FastTradeViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel$convertToItemFastTradeCryptoCurrencyList$2", m90122f = "FastTradeViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFastTradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel$convertToItemFastTradeCryptoCurrencyList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,748:1\n1869#2,2:749\n*S KotlinDebug\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel$convertToItemFastTradeCryptoCurrencyList$2\n*L\n241#1:749,2\n*E\n"})
public final class FastTradeViewModel$convertToItemFastTradeCryptoCurrencyList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<FastTradeCryptoCurrency.Response> $currencyList;
    final /* synthetic */ MutableLiveData<List<FastTradeCryptoCurrency.Response>> $liveData;
    final /* synthetic */ FastTradeCryptoCurrency.Response $selectedCurrency;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeViewModel$convertToItemFastTradeCryptoCurrencyList$2(List<FastTradeCryptoCurrency.Response> list, MutableLiveData<List<FastTradeCryptoCurrency.Response>> mutableLiveData, FastTradeCryptoCurrency.Response response, Continuation<? super FastTradeViewModel$convertToItemFastTradeCryptoCurrencyList$2> continuation) {
        super(2, continuation);
        this.$currencyList = list;
        this.$liveData = mutableLiveData;
        this.$selectedCurrency = response;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FastTradeViewModel$convertToItemFastTradeCryptoCurrencyList$2(this.$currencyList, this.$liveData, this.$selectedCurrency, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FastTradeViewModel$convertToItemFastTradeCryptoCurrencyList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String title;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List<FastTradeCryptoCurrency.Response> list = this.$currencyList;
            FastTradeCryptoCurrency.Response response = this.$selectedCurrency;
            for (FastTradeCryptoCurrency.Response response2 : list) {
                String title2 = response2.getTitle();
                if (response != null) {
                    title = response.getTitle();
                } else {
                    title = null;
                }
                response2.setSelected(Intrinsics.areEqual(title2, title));
            }
            this.$liveData.postValue(this.$currencyList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
