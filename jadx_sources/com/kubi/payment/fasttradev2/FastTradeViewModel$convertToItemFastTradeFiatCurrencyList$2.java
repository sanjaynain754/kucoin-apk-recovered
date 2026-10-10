package com.kubi.payment.fasttradev2;

import com.kubi.payment.fast.data.entities.FastTradeFiatCurrency;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
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
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel$convertToItemFastTradeFiatCurrencyList$2", m90122f = "FastTradeViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFastTradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel$convertToItemFastTradeFiatCurrencyList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,748:1\n1878#2,3:749\n*S KotlinDebug\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel$convertToItemFastTradeFiatCurrencyList$2\n*L\n386#1:749,3\n*E\n"})
public final class FastTradeViewModel$convertToItemFastTradeFiatCurrencyList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<FastTradeFiatCurrency.Response> $currencyList;
    final /* synthetic */ FastTradeFiatCurrency.Response $selectedCurrency;
    int label;
    final /* synthetic */ FastTradeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastTradeViewModel$convertToItemFastTradeFiatCurrencyList$2(FastTradeViewModel fastTradeViewModel, List<FastTradeFiatCurrency.Response> list, FastTradeFiatCurrency.Response response, Continuation<? super FastTradeViewModel$convertToItemFastTradeFiatCurrencyList$2> continuation) {
        super(2, continuation);
        this.this$0 = fastTradeViewModel;
        this.$currencyList = list;
        this.$selectedCurrency = response;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FastTradeViewModel$convertToItemFastTradeFiatCurrencyList$2(this.this$0, this.$currencyList, this.$selectedCurrency, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FastTradeViewModel$convertToItemFastTradeFiatCurrencyList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String title;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            String strM47309i0 = this.this$0.m47309i0();
            List<FastTradeFiatCurrency.Response> list = this.$currencyList;
            FastTradeFiatCurrency.Response response = this.$selectedCurrency;
            int i11 = 0;
            boolean z11 = false;
            for (Object obj2 : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                FastTradeFiatCurrency.Response response2 = (FastTradeFiatCurrency.Response) obj2;
                if (response != null) {
                    title = response.getTitle();
                } else {
                    title = null;
                }
                response2.setSelected(Intrinsics.areEqual(title, response2.getTitle()));
                if (Intrinsics.areEqual(response2.getTitle(), strM47309i0) && !z11) {
                    arrayList.add(0, new ItemFiatCurrency.ItemHeader(response2));
                    z11 = true;
                }
                arrayList.add(new ItemFiatCurrency.ItemNormal(response2));
                i11 = i12;
            }
            this.this$0.f38999c0.postValue(arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
