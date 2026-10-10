package com.kubi.home.cardsconfig;

import com.google.gson.JsonObject;
import com.kubi.home.common.card.HomeCardsRepository;
import com.kubi.kucoin.home.cardsconfig.CardListRsp;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.C27099x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CardsConfigFragment.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.cardsconfig.CardsConfigFragment$checkRemoteData$1", m90122f = "CardsConfigFragment.kt", m90123i = {}, m90124l = {568}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CardsConfigFragment$checkRemoteData$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ CardListRsp.Card $card;
    int label;

    /* JADX INFO: renamed from: com.kubi.home.cardsconfig.CardsConfigFragment$checkRemoteData$1$1 */
    /* JADX INFO: compiled from: CardsConfigFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/google/gson/JsonObject;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.cardsconfig.CardsConfigFragment$checkRemoteData$1$1", m90122f = "CardsConfigFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C145111 extends SuspendLambda implements Function2<JsonObject, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardListRsp.Card $card;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(JsonObject jsonObject, Continuation<? super Unit> continuation) {
            return ((C145111) create(jsonObject, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C145111(CardListRsp.Card card, Continuation<? super C145111> continuation) {
            super(2, continuation);
            this.$card = card;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C145111 c145111 = new C145111(this.$card, continuation);
            c145111.L$0 = obj;
            return c145111;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            JsonObject jsonObject = (JsonObject) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (jsonObject != null) {
                CardListRsp.Card card = this.$card;
                if (Intrinsics.areEqual(jsonObject.toString(), "{}")) {
                    HomeCardsRepository.f25606a.m29068d(card.getCode());
                } else {
                    HomeCardsRepository.f25606a.m29080r(card.getCode(), C27099x.m66919i(jsonObject, false, 2, null));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsConfigFragment$checkRemoteData$1(CardListRsp.Card card, Continuation<? super CardsConfigFragment$checkRemoteData$1> continuation) {
        super(1, continuation);
        this.$card = card;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CardsConfigFragment$checkRemoteData$1(this.$card, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((CardsConfigFragment$checkRemoteData$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e interfaceC41634eM29064h = HomeCardsRepository.m29064h(HomeCardsRepository.f25606a, this.$card.getCode(), null, 2, null);
            C145111 c145111 = new C145111(this.$card, null);
            this.label = 1;
            if (RetrofitFlowExKt.m42824e(interfaceC41634eM29064h, false, c145111, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
