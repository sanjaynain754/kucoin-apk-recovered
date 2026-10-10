package com.kubi.futures.settings;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.trade.model.AuUserCategoryVO;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TradingPreferencesFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.TradingPreferencesFragment$fetchAuUserCategory$1", m90122f = "TradingPreferencesFragment.kt", m90123i = {}, m90124l = {596}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradingPreferencesFragment$fetchAuUserCategory$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TradingPreferencesFragment this$0;

    /* JADX INFO: renamed from: com.kubi.futures.settings.TradingPreferencesFragment$fetchAuUserCategory$1$1 */
    /* JADX INFO: compiled from: TradingPreferencesFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.settings.TradingPreferencesFragment$fetchAuUserCategory$1$1", m90122f = "TradingPreferencesFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C132761 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C132761(Continuation<? super C132761> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C132761 c132761 = new C132761(continuation);
            c132761.L$0 = obj;
            return c132761;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
            return ((C132761) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM103844constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(RepositoryServiceLocator.f19236a.m20290i().mo99993s());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            AuUserCategoryVO auUserCategoryVO = (AuUserCategoryVO) objM103844constructorimpl;
            boolean z11 = false;
            if (auUserCategoryVO != null && auUserCategoryVO.isRetail()) {
                z11 = true;
            }
            return Boxing.boxBoolean(z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingPreferencesFragment$fetchAuUserCategory$1(TradingPreferencesFragment tradingPreferencesFragment, Continuation<? super TradingPreferencesFragment$fetchAuUserCategory$1> continuation) {
        super(2, continuation);
        this.this$0 = tradingPreferencesFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradingPreferencesFragment$fetchAuUserCategory$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradingPreferencesFragment$fetchAuUserCategory$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TradingPreferencesFragment tradingPreferencesFragment;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                tradingPreferencesFragment = (TradingPreferencesFragment) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            TradingPreferencesFragment tradingPreferencesFragment2 = this.this$0;
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            C132761 c132761 = new C132761(null);
            this.L$0 = tradingPreferencesFragment2;
            this.label = 1;
            Object objM91049g = C41686h.m91049g(abstractC41697j0M94120b, c132761, this);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
            tradingPreferencesFragment = tradingPreferencesFragment2;
            obj = objM91049g;
        }
        tradingPreferencesFragment.f23230Z = ((Boolean) obj).booleanValue();
        return Unit.INSTANCE;
    }
}
