package com.kubi.quotefacade.market;

import com.google.gson.reflect.TypeToken;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.entity.MarketMenuEntity;
import com.kubi.quotefacade.entity.SpotLevel1;
import com.kubi.quotefacade.entity.SpotMenu;
import com.kubi.quotefacade.event.MarketContainerContract$UIIntent;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.C27101y;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p212dv.C36977q;
import p814yz.C46614a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: QuoteMarketViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0014J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\u0016\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0094@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0019J\u001c\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/quotefacade/market/QuoteMarketViewModel;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/event/MarketContainerContract$UIState;", "<init>", "()V", "TAG", "", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "networkRecovery", "Lcom/kubi/sdk/network/NetworkRecoveryMonitor;", "initState", "getInitState", "()Lcom/kubi/quotefacade/event/MarketContainerContract$UIState;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", "onFirstShow", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onCleared", "requestNetworkRecoveryRefresh", "dispatchIntent", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMenuList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "diff", "", "current", "Lcom/kubi/quotefacade/entity/MarketMenuEntity;", "olds", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuoteMarketViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteMarketViewModel.kt\ncom/kubi/quotefacade/market/QuoteMarketViewModel\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,127:1\n160#2,4:128\n*S KotlinDebug\n*F\n+ 1 QuoteMarketViewModel.kt\ncom/kubi/quotefacade/market/QuoteMarketViewModel\n*L\n78#1:128,4\n*E\n"})
public final class QuoteMarketViewModel extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final String f42207X = "QuoteMarketViewModel";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final QuoteMarketRepository f42208Y = new QuoteMarketRepository();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final C46614a f42209Z = new C46614a("QuoteMarketViewModel", new QuoteMarketViewModel$networkRecovery$1(this));

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.QuoteMarketViewModel$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C22289a extends TypeToken<MarketMenuEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.QuoteMarketViewModel$dispatchIntent$1 */
    /* JADX INFO: compiled from: QuoteMarketViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.market.QuoteMarketViewModel", m90122f = "QuoteMarketViewModel.kt", m90123i = {0, 1}, m90124l = {63, 67}, m90125m = "dispatchIntent", m90126n = {"intent", "intent"}, m90127s = {"L$0", "L$0"})
    public static final class C222901 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C222901(Continuation<? super C222901> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QuoteMarketViewModel.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m52384g(MarketMenuEntity marketMenuEntity, MarketMenuEntity marketMenuEntity2) {
        if (marketMenuEntity2 == null) {
            return true;
        }
        return !Intrinsics.areEqual(marketMenuEntity2, marketMenuEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static final Unit m52381p(Ref.ObjectRef objectRef, QuoteMarketViewModel quoteMarketViewModel) {
        T tM66914d;
        SpotMenu spotMenu;
        List<SpotLevel1> level1;
        String strM66925a = C27101y.m66925a(BaseApplication.INSTANCE.get(), "menu.json");
        Intrinsics.checkNotNullExpressionValue(strM66925a, "getJson(...)");
        Integer numValueOf = null;
        try {
            C27099x c27099x = C27099x.f54458a;
            tM66914d = C27099x.m66914d(strM66925a, new C22289a().getType());
        } catch (Throwable unused) {
            tM66914d = 0;
        }
        objectRef.element = tM66914d;
        String str = quoteMarketViewModel.f42207X;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getMenuList asserts = ");
        MarketMenuEntity marketMenuEntity = (MarketMenuEntity) objectRef.element;
        if (marketMenuEntity != null && (spotMenu = marketMenuEntity.getSpotMenu()) != null && (level1 = spotMenu.getLevel1()) != null) {
            numValueOf = Integer.valueOf(level1.size());
        }
        sb2.append(numValueOf);
        C44128b.m97266j(str, sb2.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final UIState m52382q(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new Object(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final void m52383r() {
        C44128b.m97266j(this.f42207X, "network recovered: send FetchMenuList");
        sendIntent(MarketContainerContract$UIIntent.FetchMenuList.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (m52386o(r0) == r1) goto L23;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C222901 c222901;
        if (continuation instanceof C222901) {
            c222901 = (C222901) continuation;
            int i11 = c222901.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c222901.label = i11 - Integer.MIN_VALUE;
            } else {
                c222901 = new C222901(continuation);
            }
        } else {
            c222901 = new C222901(continuation);
        }
        Object obj = c222901.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c222901.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c222901.L$0 = interfaceC19282d;
            c222901.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c222901) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC19282d = (InterfaceC19282d) c222901.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        C44128b.m97266j(this.f42207X, "dispatchIntent=" + interfaceC19282d);
        if (!(interfaceC19282d instanceof MarketContainerContract$UIIntent.FetchMenuList)) {
            return Unit.INSTANCE;
        }
        c222901.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
        c222901.label = 2;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.kubi.quotefacade.entity.MarketMenuEntity] */
    /* JADX INFO: renamed from: o */
    public final Object m52386o(Continuation<? super Unit> continuation) {
        QuoteMarketViewModel$getMenuList$1 quoteMarketViewModel$getMenuList$1;
        Ref.ObjectRef objectRef;
        SpotMenu spotMenu;
        List<SpotLevel1> level1;
        SpotMenu spotMenu2;
        List<SpotLevel1> level2;
        if (continuation instanceof QuoteMarketViewModel$getMenuList$1) {
            quoteMarketViewModel$getMenuList$1 = (QuoteMarketViewModel$getMenuList$1) continuation;
            int i11 = quoteMarketViewModel$getMenuList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketViewModel$getMenuList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketViewModel$getMenuList$1 = new QuoteMarketViewModel$getMenuList$1(this, continuation);
            }
        } else {
            quoteMarketViewModel$getMenuList$1 = new QuoteMarketViewModel$getMenuList$1(this, continuation);
        }
        Object obj = quoteMarketViewModel$getMenuList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketViewModel$getMenuList$1.label;
        Integer numBoxInt = null;
        numBoxInt = null;
        numBoxInt = null;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = this.f42208Y.m52976K();
            String str = this.f42207X;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getMenuList local = ");
            MarketMenuEntity marketMenuEntity = (MarketMenuEntity) objectRef2.element;
            sb2.append((marketMenuEntity == null || (spotMenu = marketMenuEntity.getSpotMenu()) == null || (level1 = spotMenu.getLevel1()) == null) ? null : Boxing.boxInt(level1.size()));
            C44128b.m97266j(str, sb2.toString());
            if (objectRef2.element == 0) {
                C27100x0.m66924e(new Function0() { // from class: com.kubi.quotefacade.market.n0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return QuoteMarketViewModel.m52381p(objectRef2, this);
                    }
                });
            }
            T t11 = objectRef2.element;
            if (t11 != 0) {
                send(new C36977q((MarketMenuEntity) t11));
                C44128b.m97266j(this.f42207X, "getMenuList cache not null");
            }
            QuoteMarketRepository quoteMarketRepository = this.f42208Y;
            quoteMarketViewModel$getMenuList$1.L$0 = objectRef2;
            quoteMarketViewModel$getMenuList$1.label = 1;
            Object objM52977L = quoteMarketRepository.m52977L(quoteMarketViewModel$getMenuList$1);
            if (objM52977L == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
            obj = objM52977L;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) quoteMarketViewModel$getMenuList$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        C19334f c19334f = (C19334f) obj;
        if (objectRef.element == 0 && c19334f.getThrowable() != null) {
            String str2 = this.f42207X;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("cache is empty and occur exception :");
            Throwable throwable = c19334f.getThrowable();
            sb3.append(C27041f.m66668h(throwable != null ? throwable.getMessage() : null));
            C44128b.m97266j(str2, sb3.toString());
            Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.market.o0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return QuoteMarketViewModel.m52382q((UIState) obj2);
                }
            }));
        } else {
            if (c19334f.getThrowable() != null) {
                String str3 = this.f42207X;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("cache is not empty and occur exception :");
                Throwable throwable2 = c19334f.getThrowable();
                sb4.append(C27041f.m66668h(throwable2 != null ? throwable2.getMessage() : null));
                C44128b.m97266j(str3, sb4.toString());
                return Unit.INSTANCE;
            }
            String str4 = this.f42207X;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("getMenuList ==> ");
            MarketMenuEntity marketMenuEntity2 = (MarketMenuEntity) c19334f.m42846a();
            if (marketMenuEntity2 != null && (spotMenu2 = marketMenuEntity2.getSpotMenu()) != null && (level2 = spotMenu2.getLevel1()) != null) {
                numBoxInt = Boxing.boxInt(level2.size());
            }
            sb5.append(numBoxInt);
            C44128b.m97266j(str4, sb5.toString());
            if (m52384g((MarketMenuEntity) c19334f.m42846a(), (MarketMenuEntity) objectRef.element)) {
                C44128b.m97266j(this.f42207X, "getMenuList cache different server");
                send(new C36977q((MarketMenuEntity) c19334f.m42846a()));
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f42209Z.m102779e();
        super.onCleared();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        this.f42209Z.m102780f();
        super.onHide();
    }

    public QuoteMarketViewModel() {
        C44128b.m97266j("QuoteMarketViewModel", "init");
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onFirstShow() {
        super.onFirstShow();
        C44128b.m97266j(this.f42207X, "onFirstShow");
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        C44128b.m97266j(this.f42207X, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW);
        this.f42209Z.m102781g();
    }
}
