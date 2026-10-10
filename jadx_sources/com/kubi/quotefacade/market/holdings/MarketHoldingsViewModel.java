package com.kubi.quotefacade.market.holdings;

import com.kubi.kucoin.manager.MarketWsHelper;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.entity.HoldingAlphaData;
import com.kubi.quotefacade.entity.HoldingCombinedData;
import com.kubi.quotefacade.entity.HoldingData;
import com.kubi.quotefacade.event.HoldingsCommonContract$UiIntent;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.helper.C22181m1;
import com.kubi.quotefacade.helper.QuoteBusinessConfigHelp;
import com.kubi.quotefacade.helper.QuoteWSDataController;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p212dv.C36971k;
import p212dv.C36972l;
import p212dv.C36973m;
import p814yz.C46614a;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: MarketHoldingsViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0014J\u0018\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0002\u0010\u001dJ\u0016\u0010!\u001a\u00020\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#H\u0002J \u0010$\u001a\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010&\u001a\u00020\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m90084d2 = {"Lcom/kubi/quotefacade/market/holdings/MarketHoldingsViewModel;", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/quotefacade/event/HoldingsCommonContract$UiIntent;", "Lcom/kubi/quotefacade/event/HoldingsCommonContract$UIState;", "<init>", "()V", "TAG", "", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "wsDataController", "Lcom/kubi/quotefacade/helper/QuoteWSDataController;", "wsHelper", "Lcom/kubi/kucoin/manager/MarketWsHelper;", "currentHoldingsType", "networkRecovery", "Lcom/kubi/sdk/network/NetworkRecoveryMonitor;", "initState", "getInitState", "()Lcom/kubi/quotefacade/event/HoldingsCommonContract$UIState;", "dispatchIntentOnIO", "", "intent", "(Lcom/kubi/quotefacade/event/HoldingsCommonContract$UiIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "requestNetworkRecoveryRefresh", "onCleared", "handleHoldingsData", "holdingsType", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleAllHoldingsData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleHoldingsAlphaData", "holdingAlphaWsSubscribe", "tokenBridgeIdList", "", "holdingsDataSubscribe", "symbols", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketHoldingsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketHoldingsViewModel.kt\ncom/kubi/quotefacade/market/holdings/MarketHoldingsViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n25#2:220\n26#2:222\n25#2:223\n26#2:225\n25#2:226\n26#2:228\n1#3:221\n1#3:224\n1#3:227\n*S KotlinDebug\n*F\n+ 1 MarketHoldingsViewModel.kt\ncom/kubi/quotefacade/market/holdings/MarketHoldingsViewModel\n*L\n98#1:220\n98#1:222\n137#1:223\n137#1:225\n169#1:226\n169#1:228\n98#1:221\n137#1:224\n169#1:227\n*E\n"})
public final class MarketHoldingsViewModel extends BaseStateVM<HoldingsCommonContract$UiIntent, UIState> {

    /* JADX INFO: renamed from: Z */
    @Nullable
    public String f42299Z;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final String f42295V = "MarketHoldingsViewModel";

    /* JADX INFO: renamed from: W */
    @NotNull
    public final QuoteMarketRepository f42296W = new QuoteMarketRepository();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final QuoteWSDataController f42297X = new QuoteWSDataController();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MarketWsHelper f42298Y = new MarketWsHelper();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final C46614a f42300a0 = new C46614a("MarketHoldingsViewModel", new MarketHoldingsViewModel$networkRecovery$1(this));

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.holdings.MarketHoldingsViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: MarketHoldingsViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.market.holdings.MarketHoldingsViewModel", m90122f = "MarketHoldingsViewModel.kt", m90123i = {0, 1, 2, 3}, m90124l = {47, 52, 53, 54}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class C223391 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C223391(Continuation<? super C223391> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MarketHoldingsViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: C */
    public static final UIState m52548C(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, new Object(), 1, null);
    }

    /* JADX INFO: renamed from: D */
    public static final UIState m52549D(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, new Object(), 1, null);
    }

    /* JADX INFO: renamed from: E */
    public static final UIState m52550E(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new Object(), null, 1, null);
    }

    /* JADX INFO: renamed from: G */
    public static final UIState m52551G(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new Object(), null, 1, null);
    }

    /* JADX INFO: renamed from: H */
    public static final UIState m52552H(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, new Object(), 1, null);
    }

    /* JADX INFO: renamed from: I */
    public static final UIState m52553I(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, new Object(), 1, null);
    }

    /* JADX INFO: renamed from: K */
    public static final UIState m52554K(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, new Object(), 1, null);
    }

    /* JADX INFO: renamed from: L */
    public static final UIState m52555L(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, new Object(), 1, null);
    }

    /* JADX INFO: renamed from: M */
    public static final UIState m52556M(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new Object(), null, 1, null);
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m52557O(MarketHoldingsViewModel marketHoldingsViewModel, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        marketHoldingsViewModel.send(new C36971k(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m52558Q(final MarketHoldingsViewModel marketHoldingsViewModel, List list) {
        marketHoldingsViewModel.f42297X.m51880d(list, new Function1() { // from class: com.kubi.quotefacade.market.holdings.h0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketHoldingsViewModel.m52559R(this.f42310b, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m52559R(MarketHoldingsViewModel marketHoldingsViewModel, List list) {
        marketHoldingsViewModel.send(new C36972l(list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m52560S(MarketHoldingsViewModel marketHoldingsViewModel, List list) {
        marketHoldingsViewModel.send(new C36973m(list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public final void m52561T() {
        String str = this.f42299Z;
        if (str == null) {
            C44128b.m97266j(this.f42295V, "network recovered: skip FetchHoldingsData, currentHoldingsType is null");
            return;
        }
        C44128b.m97266j(this.f42295V, "network recovered: send FetchHoldingsData holdingsType=" + str);
        sendIntent(new HoldingsCommonContract$UiIntent.FetchHoldingsData(str));
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, null, 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    public final Object m52584B(Continuation<? super Unit> continuation) {
        MarketHoldingsViewModel$handleAllHoldingsData$1 marketHoldingsViewModel$handleAllHoldingsData$1;
        if (continuation instanceof MarketHoldingsViewModel$handleAllHoldingsData$1) {
            marketHoldingsViewModel$handleAllHoldingsData$1 = (MarketHoldingsViewModel$handleAllHoldingsData$1) continuation;
            int i11 = marketHoldingsViewModel$handleAllHoldingsData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                marketHoldingsViewModel$handleAllHoldingsData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                marketHoldingsViewModel$handleAllHoldingsData$1 = new MarketHoldingsViewModel$handleAllHoldingsData$1(this, continuation);
            }
        } else {
            marketHoldingsViewModel$handleAllHoldingsData$1 = new MarketHoldingsViewModel$handleAllHoldingsData$1(this, continuation);
        }
        Object objM42823d = marketHoldingsViewModel$handleAllHoldingsData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = marketHoldingsViewModel$handleAllHoldingsData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            if (C22181m1.m51970b()) {
                updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.n0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarketHoldingsViewModel.m52548C((UIState) obj);
                    }
                });
                return Unit.INSTANCE;
            }
            String strM51845i = QuoteBusinessConfigHelp.f41933a.m51845i();
            InterfaceC41634e<HoldingCombinedData> interfaceC41634eM52972G = this.f42296W.m52972G(strM51845i);
            MarketHoldingsViewModel$handleAllHoldingsData$3 marketHoldingsViewModel$handleAllHoldingsData$3 = new MarketHoldingsViewModel$handleAllHoldingsData$3(this, null);
            marketHoldingsViewModel$handleAllHoldingsData$1.L$0 = SpillingKt.nullOutSpilledVariable(strM51845i);
            marketHoldingsViewModel$handleAllHoldingsData$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM52972G, false, marketHoldingsViewModel$handleAllHoldingsData$3, marketHoldingsViewModel$handleAllHoldingsData$1);
            if (objM42823d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42823d);
        }
        Throwable throwable = ((C19334f) objM42823d).getThrowable();
        if (throwable != null) {
            if (C22181m1.m51969a(throwable)) {
                updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.o0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarketHoldingsViewModel.m52549D((UIState) obj);
                    }
                });
            } else {
                updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.p0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarketHoldingsViewModel.m52550E((UIState) obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F */
    public final Object m52585F(String str, Continuation<? super Unit> continuation) {
        MarketHoldingsViewModel$handleHoldingsAlphaData$1 marketHoldingsViewModel$handleHoldingsAlphaData$1;
        if (continuation instanceof MarketHoldingsViewModel$handleHoldingsAlphaData$1) {
            marketHoldingsViewModel$handleHoldingsAlphaData$1 = (MarketHoldingsViewModel$handleHoldingsAlphaData$1) continuation;
            int i11 = marketHoldingsViewModel$handleHoldingsAlphaData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                marketHoldingsViewModel$handleHoldingsAlphaData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                marketHoldingsViewModel$handleHoldingsAlphaData$1 = new MarketHoldingsViewModel$handleHoldingsAlphaData$1(this, continuation);
            }
        } else {
            marketHoldingsViewModel$handleHoldingsAlphaData$1 = new MarketHoldingsViewModel$handleHoldingsAlphaData$1(this, continuation);
        }
        Object objM42823d = marketHoldingsViewModel$handleHoldingsAlphaData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = marketHoldingsViewModel$handleHoldingsAlphaData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            if (C22181m1.m51970b()) {
                updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.k0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarketHoldingsViewModel.m52553I((UIState) obj);
                    }
                });
                return Unit.INSTANCE;
            }
            InterfaceC41634e<HoldingAlphaData> interfaceC41634eM52973H = this.f42296W.m52973H(str);
            MarketHoldingsViewModel$handleHoldingsAlphaData$3 marketHoldingsViewModel$handleHoldingsAlphaData$3 = new MarketHoldingsViewModel$handleHoldingsAlphaData$3(this, null);
            marketHoldingsViewModel$handleHoldingsAlphaData$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            marketHoldingsViewModel$handleHoldingsAlphaData$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM52973H, false, marketHoldingsViewModel$handleHoldingsAlphaData$3, marketHoldingsViewModel$handleHoldingsAlphaData$1);
            if (objM42823d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42823d);
        }
        Throwable throwable = ((C19334f) objM42823d).getThrowable();
        if (throwable == null) {
            return Unit.INSTANCE;
        }
        if (C22181m1.m51969a(throwable)) {
            updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.l0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketHoldingsViewModel.m52552H((UIState) obj);
                }
            });
        } else {
            updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.m0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketHoldingsViewModel.m52551G((UIState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: J */
    public final Object m52586J(String str, Continuation<? super Unit> continuation) {
        MarketHoldingsViewModel$handleHoldingsData$1 marketHoldingsViewModel$handleHoldingsData$1;
        if (continuation instanceof MarketHoldingsViewModel$handleHoldingsData$1) {
            marketHoldingsViewModel$handleHoldingsData$1 = (MarketHoldingsViewModel$handleHoldingsData$1) continuation;
            int i11 = marketHoldingsViewModel$handleHoldingsData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                marketHoldingsViewModel$handleHoldingsData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                marketHoldingsViewModel$handleHoldingsData$1 = new MarketHoldingsViewModel$handleHoldingsData$1(this, continuation);
            }
        } else {
            marketHoldingsViewModel$handleHoldingsData$1 = new MarketHoldingsViewModel$handleHoldingsData$1(this, continuation);
        }
        Object objM42823d = marketHoldingsViewModel$handleHoldingsData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = marketHoldingsViewModel$handleHoldingsData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            if (C22181m1.m51970b()) {
                updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.e0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarketHoldingsViewModel.m52554K((UIState) obj);
                    }
                });
                return Unit.INSTANCE;
            }
            InterfaceC41634e<HoldingData> interfaceC41634eM52974I = this.f42296W.m52974I(str);
            MarketHoldingsViewModel$handleHoldingsData$3 marketHoldingsViewModel$handleHoldingsData$3 = new MarketHoldingsViewModel$handleHoldingsData$3(this, str, null);
            marketHoldingsViewModel$handleHoldingsData$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            marketHoldingsViewModel$handleHoldingsData$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM52974I, false, marketHoldingsViewModel$handleHoldingsData$3, marketHoldingsViewModel$handleHoldingsData$1);
            if (objM42823d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42823d);
        }
        Throwable throwable = ((C19334f) objM42823d).getThrowable();
        if (throwable == null) {
            return Unit.INSTANCE;
        }
        if (C22181m1.m51969a(throwable)) {
            updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.i0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketHoldingsViewModel.m52555L((UIState) obj);
                }
            });
        } else {
            updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.j0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketHoldingsViewModel.m52556M((UIState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f42300a0.m102779e();
        super.onCleared();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        this.f42300a0.m102780f();
        super.onHide();
        this.f42297X.m51879c();
        this.f42298Y.m32541F();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        if (m52584B(r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        if (m52585F(r9, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (m52586J(r9, r0) == r1) goto L41;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull HoldingsCommonContract$UiIntent holdingsCommonContract$UiIntent, @NotNull Continuation<? super Unit> continuation) {
        C223391 c223391;
        if (continuation instanceof C223391) {
            c223391 = (C223391) continuation;
            int i11 = c223391.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c223391.label = i11 - Integer.MIN_VALUE;
            } else {
                c223391 = new C223391(continuation);
            }
        } else {
            c223391 = new C223391(continuation);
        }
        Object obj = c223391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c223391.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c223391.L$0 = holdingsCommonContract$UiIntent;
            c223391.label = 1;
            if (super.dispatchIntentOnIO(holdingsCommonContract$UiIntent, c223391) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 == 3) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        holdingsCommonContract$UiIntent = (HoldingsCommonContract$UiIntent) c223391.L$0;
        ResultKt.throwOnFailure(obj);
        if (!(holdingsCommonContract$UiIntent instanceof HoldingsCommonContract$UiIntent.FetchHoldingsData)) {
            throw new NoWhenBranchMatchedException();
        }
        HoldingsCommonContract$UiIntent.FetchHoldingsData fetchHoldingsData = (HoldingsCommonContract$UiIntent.FetchHoldingsData) holdingsCommonContract$UiIntent;
        this.f42299Z = fetchHoldingsData.getHoldingsType();
        String holdingsType = fetchHoldingsData.getHoldingsType();
        if (Intrinsics.areEqual(holdingsType, "ALL")) {
            c223391.L$0 = SpillingKt.nullOutSpilledVariable(holdingsCommonContract$UiIntent);
            c223391.label = 2;
        } else if (Intrinsics.areEqual(holdingsType, "ALPHA")) {
            String holdingsType2 = fetchHoldingsData.getHoldingsType();
            c223391.L$0 = SpillingKt.nullOutSpilledVariable(holdingsCommonContract$UiIntent);
            c223391.label = 3;
        } else {
            String holdingsType3 = fetchHoldingsData.getHoldingsType();
            c223391.L$0 = SpillingKt.nullOutSpilledVariable(holdingsCommonContract$UiIntent);
            c223391.label = 4;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: N */
    public final void m52587N(List<String> list) {
        if (!list.isEmpty()) {
            MarketWsHelper.m32538x(this.f42298Y, list, null, 0L, new Function1() { // from class: com.kubi.quotefacade.market.holdings.q0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketHoldingsViewModel.m52557O(this.f42320b, (List) obj);
                }
            }, 6, null);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m52588P(final List<String> list, String str) {
        if (!list.isEmpty()) {
            if (Intrinsics.areEqual(str, "FUTURES")) {
                C24129b.m58033e(SiteVisibleConfigKey.Futures, new Function0() { // from class: com.kubi.quotefacade.market.holdings.f0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarketHoldingsViewModel.m52558Q(this.f42305b, list);
                    }
                });
                return;
            } else {
                this.f42297X.m51881f(list, new Function1() { // from class: com.kubi.quotefacade.market.holdings.g0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarketHoldingsViewModel.m52560S(this.f42307b, (List) obj);
                    }
                });
                return;
            }
        }
        this.f42297X.m51879c();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        this.f42300a0.m102781g();
    }
}
