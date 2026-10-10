package com.kubi.spot.business.saving;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.spot.api.SavingBalancePushEntity;
import io.reactivex.disposables.CompositeDisposable;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import ro.C44128b;

/* JADX INFO: compiled from: SavingCacheManager.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.saving.SavingCacheManager$subSavingBalanceChangeEvent$1", m90122f = "SavingCacheManager.kt", m90123i = {}, m90124l = {207}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SavingCacheManager$subSavingBalanceChangeEvent$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ CompositeDisposable $requestDisposable;
    final /* synthetic */ SymbolInfoEntity $symbol;
    final /* synthetic */ SavingCoroutineScope $wsScope;
    int label;

    /* JADX INFO: renamed from: com.kubi.spot.business.saving.SavingCacheManager$subSavingBalanceChangeEvent$1$1 */
    /* JADX INFO: compiled from: SavingCacheManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/kubi/spot/api/SavingBalancePushEntity;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.saving.SavingCacheManager$subSavingBalanceChangeEvent$1$1", m90122f = "SavingCacheManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C250961 extends SuspendLambda implements Function3<InterfaceC41635f<? super SavingBalancePushEntity>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C250961(Continuation<? super C250961> continuation) {
            super(3, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC41635f<? super SavingBalancePushEntity> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
            C250961 c250961 = new C250961(continuation);
            c250961.L$0 = th2;
            return c250961.invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2 = (Throwable) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97264h(th2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.saving.SavingCacheManager$subSavingBalanceChangeEvent$1$a */
    /* JADX INFO: compiled from: SavingCacheManager.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25097a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SavingCoroutineScope f50308b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SymbolInfoEntity f50309c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CompositeDisposable f50310d;

        public C25097a(SavingCoroutineScope savingCoroutineScope, SymbolInfoEntity symbolInfoEntity, CompositeDisposable compositeDisposable) {
            this.f50308b = savingCoroutineScope;
            this.f50309c = symbolInfoEntity;
            this.f50310d = compositeDisposable;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(SavingBalancePushEntity savingBalancePushEntity, Continuation<? super Unit> continuation) {
            if (!C41713n0.m91132h(this.f50308b)) {
                return Unit.INSTANCE;
            }
            SavingCacheManager.f50304a.m61298g(this.f50309c, this.f50310d);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingCacheManager$subSavingBalanceChangeEvent$1(SavingCoroutineScope savingCoroutineScope, SymbolInfoEntity symbolInfoEntity, CompositeDisposable compositeDisposable, Continuation<? super SavingCacheManager$subSavingBalanceChangeEvent$1> continuation) {
        super(2, continuation);
        this.$wsScope = savingCoroutineScope;
        this.$symbol = symbolInfoEntity;
        this.$requestDisposable = compositeDisposable;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SavingCacheManager$subSavingBalanceChangeEvent$1(this.$wsScope, this.$symbol, this.$requestDisposable, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SavingCacheManager$subSavingBalanceChangeEvent$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90917h(C41636g.m90906b0(SavingCacheManager.f50304a.m61303p().m82908a("/earn/tradableSavingBalance"), 2000L), new C250961(null)), C42911a.m94121c());
            C25097a c25097a = new C25097a(this.$wsScope, this.$symbol, this.$requestDisposable);
            this.label = 1;
            if (interfaceC41634eM90890N.collect(c25097a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
