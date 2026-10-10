package com.kubi.quotefacade.market.etf;

import com.kubi.quotefacade.entity.EtfLevel1;
import com.kubi.quotefacade.entity.EtfMenu;
import com.kubi.quotefacade.entity.MarketMenuEntity;
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
import ro.C44128b;

/* JADX INFO: compiled from: QuoteEtfFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.market.etf.QuoteEtfFragment$setData$1", m90122f = "QuoteEtfFragment.kt", m90123i = {0, 0, 0}, m90124l = {83}, m90125m = "invokeSuspend", m90126n = {"etfMenu", "it", "$i$a$-let-QuoteEtfFragment$setData$1$1"}, m90127s = {"L$0", "L$1", "I$0"})
public final class QuoteEtfFragment$setData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ MarketMenuEntity $marketMenuEntity;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ QuoteEtfFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteEtfFragment$setData$1(MarketMenuEntity marketMenuEntity, QuoteEtfFragment quoteEtfFragment, Continuation<? super QuoteEtfFragment$setData$1> continuation) {
        super(2, continuation);
        this.$marketMenuEntity = marketMenuEntity;
        this.this$0 = quoteEtfFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuoteEtfFragment$setData$1(this.$marketMenuEntity, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((QuoteEtfFragment$setData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<EtfLevel1> level1;
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
            EtfMenu etfMenu = this.$marketMenuEntity.getEtfMenu();
            if (etfMenu != null && (level1 = etfMenu.getLevel1()) != null) {
                QuoteEtfFragment quoteEtfFragment = this.this$0;
                C44128b.m97266j(quoteEtfFragment.getTAG(), "setData updateAdapter");
                quoteEtfFragment.f42224V.clear();
                this.L$0 = SpillingKt.nullOutSpilledVariable(etfMenu);
                this.L$1 = SpillingKt.nullOutSpilledVariable(level1);
                this.I$0 = 0;
                this.label = 1;
                if (quoteEtfFragment.m52399q3(level1, 0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
