package com.kubi.home.common.card;

import com.google.gson.JsonObject;
import com.kubi.kucoin.home.cards.CardInterceptor;
import com.kubi.kucoin.home.cards.ClassMapping;
import com.kubi.kucoin.home.cardsconfig.CardListRsp;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.C27099x;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p058cj.C4988a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CardsViewModel.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.common.card.CardsViewModel$loadCardsDetails$2$2$1", m90122f = "CardsViewModel.kt", m90123i = {0}, m90124l = {190}, m90125m = "invokeSuspend", m90126n = {"cacheTime"}, m90127s = {"L$0"})
public final class CardsViewModel$loadCardsDetails$2$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ CardListRsp.Card $card;
    final /* synthetic */ boolean $updateConfig;
    Object L$0;
    int label;
    final /* synthetic */ CardsViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.home.common.card.CardsViewModel$loadCardsDetails$2$2$1$2 */
    /* JADX INFO: compiled from: CardsViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/google/gson/JsonObject;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.common.card.CardsViewModel$loadCardsDetails$2$2$1$2", m90122f = "CardsViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C145262 extends SuspendLambda implements Function2<JsonObject, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardListRsp.Card $card;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(JsonObject jsonObject, Continuation<? super Unit> continuation) {
            return ((C145262) create(jsonObject, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C145262(CardListRsp.Card card, Continuation<? super C145262> continuation) {
            super(2, continuation);
            this.$card = card;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C145262 c145262 = new C145262(this.$card, continuation);
            c145262.L$0 = obj;
            return c145262;
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
    public CardsViewModel$loadCardsDetails$2$2$1(CardListRsp.Card card, boolean z11, CardsViewModel cardsViewModel, Continuation<? super CardsViewModel$loadCardsDetails$2$2$1> continuation) {
        super(2, continuation);
        this.$card = card;
        this.$updateConfig = z11;
        this.this$0 = cardsViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardsViewModel$loadCardsDetails$2$2$1(this.$card, this.$updateConfig, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CardsViewModel$loadCardsDetails$2$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Long lBoxLong;
        CardInterceptor interceptor;
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
            HomeCardsRepository homeCardsRepository = HomeCardsRepository.f25606a;
            ClassMapping classMapping = homeCardsRepository.m29074k().m32209k().get(this.$card.getType());
            if (classMapping != null && (interceptor = classMapping.getInterceptor()) != null && !interceptor.mo29504a()) {
                return Unit.INSTANCE;
            }
            if (!CardsViewModel.f25601Z && this.$updateConfig) {
                lBoxLong = null;
            } else {
                lBoxLong = Boxing.boxLong(60000L);
            }
            if (this.this$0.f25603W.contains(this.$card.getCode())) {
                this.this$0.f25603W.remove(this.$card.getCode());
                lBoxLong = null;
            }
            C4988a.m5286a("cacheTime" + lBoxLong, "CardsViewModel");
            InterfaceC41634e<JsonObject> interfaceC41634eM29071g = homeCardsRepository.m29071g(this.$card.getCode(), lBoxLong);
            C145262 c145262 = new C145262(this.$card, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(lBoxLong);
            this.label = 1;
            if (RetrofitFlowExKt.m42824e(interfaceC41634eM29071g, false, c145262, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
