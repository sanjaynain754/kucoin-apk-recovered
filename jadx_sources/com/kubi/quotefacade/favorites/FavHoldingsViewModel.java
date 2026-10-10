package com.kubi.quotefacade.favorites;

import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.quotefacade.entity.HoldingCombinedData;
import com.kubi.quotefacade.helper.QuoteBusinessConfigHelp;
import com.kubi.quotefacade.helper.QuoteKV;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: FavHoldingsViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0094@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0017J\b\u0010\u0019\u001a\u00020\u0012H\u0002R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/FavHoldingsViewModel;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/favorites/FavHoldingContract$UIState;", "<init>", "()V", "needShowHoldingRedDot", "", "Ljava/lang/Boolean;", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "getRepository", "()Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "repository$delegate", "Lkotlin/Lazy;", "initState", "getInitState", "()Lcom/kubi/quotefacade/favorites/FavHoldingContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkHoldingTabNeedShowRedDot", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleHoldingsTabData", "cleanHoldingRedDot", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFavHoldingsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavHoldingsViewModel.kt\ncom/kubi/quotefacade/favorites/FavHoldingsViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n135#2,2:88\n126#2,2:93\n25#3:90\n26#3:92\n1#4:91\n*S KotlinDebug\n*F\n+ 1 FavHoldingsViewModel.kt\ncom/kubi/quotefacade/favorites/FavHoldingsViewModel\n*L\n49#1:88,2\n85#1:93,2\n78#1:90\n78#1:92\n78#1:91\n*E\n"})
public final class FavHoldingsViewModel extends AbstractC19291m<FavHoldingContract$UIState> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f41684Z = new Companion(null);

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final String f41685a0 = "FavHoldingsViewModel";

    /* JADX INFO: renamed from: X */
    @Nullable
    public volatile Boolean f41686X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f41687Y = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.r0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FavHoldingsViewModel.m51336x();
        }
    });

    /* JADX INFO: compiled from: FavHoldingsViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/FavHoldingsViewModel$Companion;", "", "<init>", "()V", "TAG", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.FavHoldingsViewModel$dispatchIntent$1 */
    /* JADX INFO: compiled from: FavHoldingsViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.FavHoldingsViewModel", m90122f = "FavHoldingsViewModel.kt", m90123i = {0, 1}, m90124l = {36, 39}, m90125m = "dispatchIntent", m90126n = {"intent", "intent"}, m90127s = {"L$0", "L$0"})
    public static final class C219321 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C219321(Continuation<? super C219321> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FavHoldingsViewModel.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: x */
    public static final QuoteMarketRepository m51336x() {
        return new QuoteMarketRepository();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (m51337s(r0) == r1) goto L23;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C219321 c219321;
        if (continuation instanceof C219321) {
            c219321 = (C219321) continuation;
            int i11 = c219321.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c219321.label = i11 - Integer.MIN_VALUE;
            } else {
                c219321 = new C219321(continuation);
            }
        } else {
            c219321 = new C219321(continuation);
        }
        Object obj = c219321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c219321.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c219321.L$0 = interfaceC19282d;
            c219321.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c219321) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC19282d = (InterfaceC19282d) c219321.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        if (!(interfaceC19282d instanceof FavHoldingContract$UIIntent.CheckHoldingRedDot)) {
            if (interfaceC19282d instanceof FavHoldingContract$UIIntent.CleanHoldingTabRedDot) {
                m51338t();
            }
            return Unit.INSTANCE;
        }
        c219321.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
        c219321.label = 2;
    }

    /* JADX INFO: renamed from: s */
    public final Object m51337s(Continuation<? super Unit> continuation) {
        if (C46392a.m102322d(QuoteKV.f42044a.m52050j(), false)) {
            C44128b.m97259c(f41685a0, "[checkHoldingTabNeedShowRedDot] had show");
            return Unit.INSTANCE;
        }
        if (!BQuoteFacadeDepend.f42592a.m53025e().c()) {
            C44128b.m97259c(f41685a0, "[checkHoldingTabNeedShowRedDot] no login");
            return Unit.INSTANCE;
        }
        Boolean bool = this.f41686X;
        if (bool != null) {
            send(new C22059q0(bool.booleanValue()));
            return Unit.INSTANCE;
        }
        Object objM51341w = m51341w(continuation);
        return objM51341w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM51341w : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public final void m51338t() {
        this.f41686X = Boolean.FALSE;
        C46392a.m102328k(QuoteKV.f42044a.m52050j(), true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.quotefacade.favorites.FavHoldingContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public FavHoldingContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.quotefacade.favorites.FavHoldingContract$UIState
        };
    }

    /* JADX INFO: renamed from: v */
    public final QuoteMarketRepository m51340v() {
        return (QuoteMarketRepository) this.f41687Y.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    public final Object m51341w(Continuation<? super Unit> continuation) {
        FavHoldingsViewModel$handleHoldingsTabData$1 favHoldingsViewModel$handleHoldingsTabData$1;
        if (continuation instanceof FavHoldingsViewModel$handleHoldingsTabData$1) {
            favHoldingsViewModel$handleHoldingsTabData$1 = (FavHoldingsViewModel$handleHoldingsTabData$1) continuation;
            int i11 = favHoldingsViewModel$handleHoldingsTabData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                favHoldingsViewModel$handleHoldingsTabData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                favHoldingsViewModel$handleHoldingsTabData$1 = new FavHoldingsViewModel$handleHoldingsTabData$1(this, continuation);
            }
        } else {
            favHoldingsViewModel$handleHoldingsTabData$1 = new FavHoldingsViewModel$handleHoldingsTabData$1(this, continuation);
        }
        Object objM42823d = favHoldingsViewModel$handleHoldingsTabData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = favHoldingsViewModel$handleHoldingsTabData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            String strM51845i = QuoteBusinessConfigHelp.f41933a.m51845i();
            InterfaceC41634e<HoldingCombinedData> interfaceC41634eM52972G = m51340v().m52972G(strM51845i);
            FavHoldingsViewModel$handleHoldingsTabData$2 favHoldingsViewModel$handleHoldingsTabData$2 = new FavHoldingsViewModel$handleHoldingsTabData$2(this, null);
            favHoldingsViewModel$handleHoldingsTabData$1.L$0 = SpillingKt.nullOutSpilledVariable(strM51845i);
            favHoldingsViewModel$handleHoldingsTabData$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM52972G, false, favHoldingsViewModel$handleHoldingsTabData$2, favHoldingsViewModel$handleHoldingsTabData$1);
            if (objM42823d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42823d);
        }
        if (((C19334f) objM42823d).getThrowable() != null) {
            C44128b.m97259c(f41685a0, "[handleHoldingsTabData] onFail");
        }
        return Unit.INSTANCE;
    }
}
