package com.kubi.margin.trade;

import androidx.fragment.app.Fragment;
import com.kubi.margin.delegation.MarginTradeOpenOrdersFragment;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
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

/* JADX INFO: compiled from: BaseMarginFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.trade.BaseMarginFragment$notifyAvailableBalanceChange$3", m90122f = "BaseMarginFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nBaseMarginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMarginFragment.kt\ncom/kubi/margin/trade/BaseMarginFragment$notifyAvailableBalanceChange$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1449:1\n808#2,11:1450\n774#2:1461\n865#2,2:1462\n1869#2,2:1464\n*S KotlinDebug\n*F\n+ 1 BaseMarginFragment.kt\ncom/kubi/margin/trade/BaseMarginFragment$notifyAvailableBalanceChange$3\n*L\n806#1:1450,11\n807#1:1461\n807#1:1462,2\n807#1:1464,2\n*E\n"})
public final class BaseMarginFragment$notifyAvailableBalanceChange$3 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BigDecimal $quoteAvailableBalance;
    final /* synthetic */ CharSequence $quoteBalanceDisplayStr;
    int label;
    final /* synthetic */ BaseMarginFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMarginFragment$notifyAvailableBalanceChange$3(BaseMarginFragment baseMarginFragment, BigDecimal bigDecimal, CharSequence charSequence, Continuation<? super BaseMarginFragment$notifyAvailableBalanceChange$3> continuation) {
        super(2, continuation);
        this.this$0 = baseMarginFragment;
        this.$quoteAvailableBalance = bigDecimal;
        this.$quoteBalanceDisplayStr = charSequence;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseMarginFragment$notifyAvailableBalanceChange$3(this.this$0, this.$quoteAvailableBalance, this.$quoteBalanceDisplayStr, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BaseMarginFragment$notifyAvailableBalanceChange$3) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List<Fragment> fragments = this.this$0.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : fragments) {
                if (obj2 instanceof MarginTradeOpenOrdersFragment) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (((MarginTradeOpenOrdersFragment) obj3).isAdded()) {
                    arrayList2.add(obj3);
                }
            }
            BigDecimal bigDecimal = this.$quoteAvailableBalance;
            CharSequence charSequence = this.$quoteBalanceDisplayStr;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((MarginTradeOpenOrdersFragment) it.next()).m38105A3(bigDecimal, charSequence);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
