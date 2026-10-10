package com.kubi.payment.fasttradev2;

import com.kubi.payment.fast.data.entities.FastTradeFiatCurrency;
import com.kubi.payment.util.PaymentStorageId;
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
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: FastTradeViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.FastTradeViewModel$loadCacheFiatCurrencyList$2", m90122f = "FastTradeViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFastTradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel$loadCacheFiatCurrencyList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,748:1\n1869#2,2:749\n*S KotlinDebug\n*F\n+ 1 FastTradeViewModel.kt\ncom/kubi/payment/fasttradev2/FastTradeViewModel$loadCacheFiatCurrencyList$2\n*L\n259#1:749,2\n*E\n"})
public final class FastTradeViewModel$loadCacheFiatCurrencyList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<FastTradeFiatCurrency.Response>>, Object> {
    int label;

    public FastTradeViewModel$loadCacheFiatCurrencyList$2(Continuation<? super FastTradeViewModel$loadCacheFiatCurrencyList$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FastTradeViewModel$loadCacheFiatCurrencyList$2(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<FastTradeFiatCurrency.Response>> continuation) {
        return ((FastTradeViewModel$loadCacheFiatCurrencyList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List<FastTradeFiatCurrency.Response> listM102325g = C46392a.m102325g(PaymentStorageId.f40364a.m49828f(), CollectionsKt.emptyList());
            ArrayList arrayList = new ArrayList();
            if (listM102325g != null) {
                for (FastTradeFiatCurrency.Response response : listM102325g) {
                    if (response != null) {
                        arrayList.add(response);
                    }
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
