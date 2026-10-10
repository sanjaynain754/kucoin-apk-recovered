package com.kubi.spot.business;

import androidx.fragment.app.Fragment;
import com.kubi.spot.business.delegation.TradeOpenOrdersFragment;
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

/* JADX INFO: compiled from: BaseTradeFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.BaseTradeFragment$notifyAvailableBalanceChange$3", m90122f = "BaseTradeFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nBaseTradeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTradeFragment.kt\ncom/kubi/spot/business/BaseTradeFragment$notifyAvailableBalanceChange$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1251:1\n808#2,11:1252\n774#2:1263\n865#2,2:1264\n1869#2,2:1266\n*S KotlinDebug\n*F\n+ 1 BaseTradeFragment.kt\ncom/kubi/spot/business/BaseTradeFragment$notifyAvailableBalanceChange$3\n*L\n738#1:1252,11\n739#1:1263\n739#1:1264,2\n739#1:1266,2\n*E\n"})
public final class BaseTradeFragment$notifyAvailableBalanceChange$3 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ CharSequence $quoteBalanceDisplayStr;
    int label;
    final /* synthetic */ BaseTradeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTradeFragment$notifyAvailableBalanceChange$3(BaseTradeFragment baseTradeFragment, CharSequence charSequence, Continuation<? super BaseTradeFragment$notifyAvailableBalanceChange$3> continuation) {
        super(2, continuation);
        this.this$0 = baseTradeFragment;
        this.$quoteBalanceDisplayStr = charSequence;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTradeFragment$notifyAvailableBalanceChange$3(this.this$0, this.$quoteBalanceDisplayStr, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BaseTradeFragment$notifyAvailableBalanceChange$3) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                if (obj2 instanceof TradeOpenOrdersFragment) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (((TradeOpenOrdersFragment) obj3).isAdded()) {
                    arrayList2.add(obj3);
                }
            }
            CharSequence charSequence = this.$quoteBalanceDisplayStr;
            BaseTradeFragment baseTradeFragment = this.this$0;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((TradeOpenOrdersFragment) it.next()).m60757m3(charSequence, baseTradeFragment.mo60189N().getQuoteCurrencyName());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
