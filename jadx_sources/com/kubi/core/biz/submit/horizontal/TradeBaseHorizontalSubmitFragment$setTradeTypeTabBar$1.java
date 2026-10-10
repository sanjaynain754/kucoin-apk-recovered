package com.kubi.core.biz.submit.horizontal;

import android.content.Context;
import com.kubi.core.biz.submit.C12097h;
import com.kubi.core.biz.submit.TradeTypeUiData;
import com.kubi.resources.widget.flyco.SimpleScrollBarLayout;
import java.util.Iterator;
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
import v30.C45411x;

/* JADX INFO: compiled from: TradeBaseHorizontalSubmitFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$setTradeTypeTabBar$1", m90122f = "TradeBaseHorizontalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nTradeBaseHorizontalSubmitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeBaseHorizontalSubmitFragment.kt\ncom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment$setTradeTypeTabBar$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,652:1\n1#2:653\n*E\n"})
public final class TradeBaseHorizontalSubmitFragment$setTradeTypeTabBar$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<TradeTypeUiData> $tradeTypes;
    int label;
    final /* synthetic */ TradeBaseHorizontalSubmitFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TradeBaseHorizontalSubmitFragment$setTradeTypeTabBar$1(List<? extends TradeTypeUiData> list, TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment, Continuation<? super TradeBaseHorizontalSubmitFragment$setTradeTypeTabBar$1> continuation) {
        super(2, continuation);
        this.$tradeTypes = list;
        this.this$0 = tradeBaseHorizontalSubmitFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeBaseHorizontalSubmitFragment$setTradeTypeTabBar$1(this.$tradeTypes, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeBaseHorizontalSubmitFragment$setTradeTypeTabBar$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        C45411x c45411xM22610j4;
        SimpleScrollBarLayout simpleScrollBarLayout;
        Object next;
        SimpleScrollBarLayout simpleScrollBarLayout2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List<TradeTypeUiData> list = this.$tradeTypes;
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            List<String> listM22544a = C12097h.m22544a(list, contextRequireContext);
            C45411x c45411xM22610j5 = this.this$0.m22610j4();
            if ((c45411xM22610j5 == null || (simpleScrollBarLayout2 = c45411xM22610j5.f102389l) == null || simpleScrollBarLayout2.getTabCount() != listM22544a.size()) && (c45411xM22610j4 = this.this$0.m22610j4()) != null && (simpleScrollBarLayout = c45411xM22610j4.f102389l) != null) {
                simpleScrollBarLayout.setTabData(CollectionsKt.toList(listM22544a));
            }
            Iterator<T> it = this.$tradeTypes.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!((TradeTypeUiData) next).getIsChecked());
            TradeTypeUiData tradeTypeUiData = (TradeTypeUiData) next;
            if (tradeTypeUiData == null) {
                return Unit.INSTANCE;
            }
            TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment = this.this$0;
            String string = tradeBaseHorizontalSubmitFragment.requireContext().getString(tradeTypeUiData.getF20772c());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            tradeBaseHorizontalSubmitFragment.mo22606f(string, tradeTypeUiData.getF20771b());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
