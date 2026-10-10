package com.kubi.payment.p2p.trade;

import com.kubi.payment.p2p.data.entities.P2PMarketPaymentMethod;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import com.kubi.utils.extensions.C27041f;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: P2PTradeMarketViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.trade.P2PTradeMarketViewModel$loadMarketPaymentMethod$1", m90122f = "P2PTradeMarketViewModel.kt", m90123i = {0}, m90124l = {176}, m90125m = "invokeSuspend", m90126n = {"fiatCurrency"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nP2PTradeMarketViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PTradeMarketViewModel.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketViewModel$loadMarketPaymentMethod$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,339:1\n774#2:340\n865#2,2:341\n*S KotlinDebug\n*F\n+ 1 P2PTradeMarketViewModel.kt\ncom/kubi/payment/p2p/trade/P2PTradeMarketViewModel$loadMarketPaymentMethod$1\n*L\n180#1:340\n180#1:341,2\n*E\n"})
public final class P2PTradeMarketViewModel$loadMarketPaymentMethod$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $needShowPaymentMethodFilter;
    Object L$0;
    int label;
    final /* synthetic */ P2PTradeMarketViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PTradeMarketViewModel$loadMarketPaymentMethod$1(P2PTradeMarketViewModel p2PTradeMarketViewModel, boolean z11, Continuation<? super P2PTradeMarketViewModel$loadMarketPaymentMethod$1> continuation) {
        super(2, continuation);
        this.this$0 = p2PTradeMarketViewModel;
        this.$needShowPaymentMethodFilter = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PTradeMarketViewModel$loadMarketPaymentMethod$1(this.this$0, this.$needShowPaymentMethodFilter, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((P2PTradeMarketViewModel$loadMarketPaymentMethod$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String code;
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
            String strM66668h = C27041f.m66668h(this.this$0.m49325L().getValue());
            if (strM66668h.length() == 0) {
                return Unit.INSTANCE;
            }
            if (this.$needShowPaymentMethodFilter) {
                if (this.this$0.m49332S()) {
                    this.this$0.f40033c0.setValue(Boxing.boxBoolean(true));
                    return Unit.INSTANCE;
                }
                this.this$0.m94034o().setValue(Boxing.boxBoolean(true));
            }
            IP2PRepository iP2PRepository = this.this$0.f40028X;
            this.L$0 = SpillingKt.nullOutSpilledVariable(strM66668h);
            this.label = 1;
            obj = iP2PRepository.mo48475B(strM66668h, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            List list = (List) ((AbstractC42878k.Success) abstractC42878k).m94040a();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                P2PMarketPaymentMethod p2PMarketPaymentMethod = (P2PMarketPaymentMethod) obj2;
                String name = p2PMarketPaymentMethod.getName();
                if (name != null && name.length() != 0 && (code = p2PMarketPaymentMethod.getCode()) != null && code.length() != 0) {
                    arrayList2.add(obj2);
                }
            }
            arrayList.add(new P2PMarketPaymentMethod("ALL", "ALL"));
            arrayList.addAll(arrayList2);
            this.this$0.f40032b0.setValue(arrayList);
            if (this.$needShowPaymentMethodFilter) {
                this.this$0.f40033c0.setValue(Boxing.boxBoolean(true));
            }
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.m94035p().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (this.$needShowPaymentMethodFilter) {
            this.this$0.m94034o().setValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}
