package com.kubi.payment.p2p.trade;

import com.kubi.payment.p2p.data.entities.TradeCurrencyFiat;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import ht.C38346y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: P2PTradeMarketViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.trade.P2PTradeMarketViewModel$loadFiatCurrencyList$1", m90122f = "P2PTradeMarketViewModel.kt", m90123i = {}, m90124l = {121}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nP2PTradeMarketViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PTradeMarketViewModel.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketViewModel$loadFiatCurrencyList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1617#2,9:340\n1869#2:349\n1870#2:351\n1626#2:352\n1#3:350\n*S KotlinDebug\n*F\n+ 1 P2PTradeMarketViewModel.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketViewModel$loadFiatCurrencyList$1\n*L\n126#1:340,9\n126#1:349\n126#1:351\n126#1:352\n126#1:350\n*E\n"})
public final class P2PTradeMarketViewModel$loadFiatCurrencyList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $hasCache;
    int label;
    final /* synthetic */ P2PTradeMarketViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PTradeMarketViewModel$loadFiatCurrencyList$1(P2PTradeMarketViewModel p2PTradeMarketViewModel, boolean z11, Continuation<? super P2PTradeMarketViewModel$loadFiatCurrencyList$1> continuation) {
        super(2, continuation);
        this.this$0 = p2PTradeMarketViewModel;
        this.$hasCache = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PTradeMarketViewModel$loadFiatCurrencyList$1(this.this$0, this.$hasCache, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((P2PTradeMarketViewModel$loadFiatCurrencyList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            IP2PRepository iP2PRepository = this.this$0.f40028X;
            this.label = 1;
            obj = iP2PRepository.mo48496u0(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            this.this$0.f40038h0 = (List) ((AbstractC42878k.Success) abstractC42878k).m94040a();
            if (!this.$hasCache) {
                List list = this.this$0.f40038h0;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String typeCode = ((TradeCurrencyFiat) it.next()).getTypeCode();
                    if (typeCode != null) {
                        arrayList.add(typeCode);
                    }
                }
                this.this$0.m49342d0(C38346y.m86536w(arrayList));
            }
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m94035p().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
