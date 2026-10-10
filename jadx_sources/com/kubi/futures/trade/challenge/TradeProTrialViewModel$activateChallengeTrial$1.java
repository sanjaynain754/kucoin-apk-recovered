package com.kubi.futures.trade.challenge;

import bi.C4615g;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.event.api.C12572a;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p692vh.InterfaceC45544a;
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
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: TradeProTrialState.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.challenge.TradeProTrialViewModel$activateChallengeTrial$1", m90122f = "TradeProTrialState.kt", m90123i = {0, 1}, m90124l = {235, 240}, m90125m = "invokeSuspend", m90126n = {"e", "e"}, m90127s = {"L$0", "L$0"})
public final class TradeProTrialViewModel$activateChallengeTrial$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $contractSymbol;
    final /* synthetic */ String $trialCode;
    Object L$0;
    int label;
    final /* synthetic */ TradeProTrialViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.challenge.TradeProTrialViewModel$activateChallengeTrial$1$1 */
    /* JADX INFO: compiled from: TradeProTrialState.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.challenge.TradeProTrialViewModel$activateChallengeTrial$1$1", m90122f = "TradeProTrialState.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C137011 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: $e */
        final /* synthetic */ ApiException f23751$e;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137011(ApiException apiException, Continuation<? super C137011> continuation) {
            super(2, continuation);
            this.f23751$e = apiException;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C137011(this.f23751$e, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C137011) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C19331c.m42836c(this.f23751$e, null, 2, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.challenge.TradeProTrialViewModel$activateChallengeTrial$1$2 */
    /* JADX INFO: compiled from: TradeProTrialState.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.challenge.TradeProTrialViewModel$activateChallengeTrial$1$2", m90122f = "TradeProTrialState.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C137022 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: $e */
        final /* synthetic */ Throwable f23752$e;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137022(Throwable th2, Continuation<? super C137022> continuation) {
            super(2, continuation);
            this.f23752$e = th2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C137022(this.f23752$e, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C137022) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C19331c.m42836c(this.f23752$e, null, 2, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeProTrialViewModel$activateChallengeTrial$1(String str, TradeProTrialViewModel tradeProTrialViewModel, String str2, Continuation<? super TradeProTrialViewModel$activateChallengeTrial$1> continuation) {
        super(2, continuation);
        this.$trialCode = str;
        this.this$0 = tradeProTrialViewModel;
        this.$contractSymbol = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeProTrialViewModel$activateChallengeTrial$1(this.$trialCode, this.this$0, this.$contractSymbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeProTrialViewModel$activateChallengeTrial$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r4, r5, r11) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        if (kotlinx.coroutines.C41686h.m91049g(r3, r5, r11) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:
    
        return r1;
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
                    this.this$0.m26966o().postValue(Boxing.boxBoolean(false));
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.this$0.m26966o().postValue(Boxing.boxBoolean(false));
            }
        } else {
            ResultKt.throwOnFailure(obj);
            try {
                InterfaceC45544a.m100551n(RepositoryServiceLocator.f19236a.m20292k(), this.$trialCode, null, 2, null);
                this.this$0.m26971t(this.$contractSymbol);
                if (!StringsKt.isBlank(this.$contractSymbol)) {
                    String name = C4615g.class.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    C12572a.m23695d(name, new C4615g(this.$contractSymbol, true), 0L, 4, null);
                }
                this.this$0.m26967p().postValue(Boxing.boxBoolean(true));
                this.this$0.m26966o().postValue(Boxing.boxBoolean(false));
            } catch (ApiException e11) {
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                C137011 c137011 = new C137011(e11, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(e11);
                this.label = 1;
            } catch (Throwable th2) {
                AbstractC41697j0 abstractC41697j0M94121c2 = C42911a.m94121c();
                C137022 c137022 = new C137022(th2, null);
                this.L$0 = SpillingKt.nullOutSpilledVariable(th2);
                this.label = 2;
            }
        }
        return Unit.INSTANCE;
    }
}
