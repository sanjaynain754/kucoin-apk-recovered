package com.kubi.home.v2.card;

import androidx.recyclerview.widget.RecyclerView;
import com.kubi.event.api.C12572a;
import com.kubi.kucoin.home.p090v2.cardsconfig.CardListRspV2;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CardsViewModelV2.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.card.CardsViewModelV2$pullRefresh$1", m90122f = "CardsViewModelV2.kt", m90123i = {1}, m90124l = {248, 255}, m90125m = "invokeSuspend", m90126n = {"cardConfig"}, m90127s = {"L$0"})
public final class CardsViewModelV2$pullRefresh$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ CardsViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsViewModelV2$pullRefresh$1(CardsViewModelV2 cardsViewModelV2, Continuation<? super CardsViewModelV2$pullRefresh$1> continuation) {
        super(2, continuation);
        this.this$0 = cardsViewModelV2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardsViewModelV2$pullRefresh$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CardsViewModelV2$pullRefresh$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final void m30782f(CardsViewModelV2 cardsViewModelV2) {
        RecyclerView f96711w;
        RecyclerView f96711w2;
        if (cardsViewModelV2.m30747X().getItemCount() > 0 && (f96711w = cardsViewModelV2.m30747X().getF96711w()) != null && f96711w.isAttachedToWindow() && (f96711w2 = cardsViewModelV2.m30747X().getF96711w()) != null) {
            f96711w2.smoothScrollToPosition(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r1.m30761n0(r6) == r0) goto L18;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            RecyclerView f96711w = this.this$0.m30747X().getF96711w();
            if (f96711w != null) {
                final CardsViewModelV2 cardsViewModelV2 = this.this$0;
                Boxing.boxBoolean(f96711w.post(new Runnable() { // from class: com.kubi.home.v2.card.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        CardsViewModelV2$pullRefresh$1.m30782f(cardsViewModelV2);
                    }
                }));
            }
            C12572a.m23695d("com.kubi.home.v2.card.CardsViewModelV2_EVENT_FINISH_REFRESH_LOAD", null, 0L, 6, null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        AbstractC41697j0 abstractC41697j0M91392b = C41782z0.m91392b();
        CardsViewModelV2$pullRefresh$1$cardConfig$1 cardsViewModelV2$pullRefresh$1$cardConfig$1 = new CardsViewModelV2$pullRefresh$1$cardConfig$1(null);
        this.label = 1;
        obj = C41686h.m91049g(abstractC41697j0M91392b, cardsViewModelV2$pullRefresh$1$cardConfig$1, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        CardListRspV2 cardListRspV2 = (CardListRspV2) obj;
        if (cardListRspV2 == null) {
            this.this$0.f26475a0.postValue(CollectionsKt.mutableListOf(this.this$0.m30753d0()));
        } else {
            CardsViewModelV2 cardsViewModelV3 = this.this$0;
            this.L$0 = SpillingKt.nullOutSpilledVariable(cardListRspV2);
            this.label = 2;
        }
        C12572a.m23695d("com.kubi.home.v2.card.CardsViewModelV2_EVENT_FINISH_REFRESH_LOAD", null, 0L, 6, null);
        return Unit.INSTANCE;
    }
}
