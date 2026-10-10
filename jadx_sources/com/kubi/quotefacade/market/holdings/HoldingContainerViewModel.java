package com.kubi.quotefacade.market.holdings;

import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.entity.HoldingDir;
import com.kubi.quotefacade.event.HoldingsContainerContract$UIIntent;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.helper.C22181m1;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p814yz.C46614a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: HoldingContainerViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0094@¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\b\u0010\u0016\u001a\u00020\u000fH\u0014J\u000e\u0010\u0017\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/quotefacade/market/holdings/HoldingContainerViewModel;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/event/HoldingsContainerContract$UIState;", "<init>", "()V", "TAG", "", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "networkRecovery", "Lcom/kubi/sdk/network/NetworkRecoveryMonitor;", "initState", "getInitState", "()Lcom/kubi/quotefacade/event/HoldingsContainerContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "requestNetworkRecoveryRefresh", "onCleared", "handleHoldingsTabData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHoldingContainerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoldingContainerViewModel.kt\ncom/kubi/quotefacade/market/holdings/HoldingContainerViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n25#2:85\n26#2:87\n1#3:86\n*S KotlinDebug\n*F\n+ 1 HoldingContainerViewModel.kt\ncom/kubi/quotefacade/market/holdings/HoldingContainerViewModel\n*L\n75#1:85\n75#1:87\n75#1:86\n*E\n"})
public final class HoldingContainerViewModel extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final String f42272X = "HoldingContainerViewModel";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final QuoteMarketRepository f42273Y = new QuoteMarketRepository();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final C46614a f42274Z = new C46614a("HoldingContainerViewModel", new HoldingContainerViewModel$networkRecovery$1(this));

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.holdings.HoldingContainerViewModel$dispatchIntent$1 */
    /* JADX INFO: compiled from: HoldingContainerViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.market.holdings.HoldingContainerViewModel", m90122f = "HoldingContainerViewModel.kt", m90123i = {0, 1}, m90124l = {30, 33}, m90125m = "dispatchIntent", m90126n = {"intent", "intent"}, m90127s = {"L$0", "L$0"})
    public static final class C223221 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C223221(Continuation<? super C223221> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HoldingContainerViewModel.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m52444o(Continuation<? super Unit> continuation) {
        HoldingContainerViewModel$handleHoldingsTabData$1 holdingContainerViewModel$handleHoldingsTabData$1;
        if (continuation instanceof HoldingContainerViewModel$handleHoldingsTabData$1) {
            holdingContainerViewModel$handleHoldingsTabData$1 = (HoldingContainerViewModel$handleHoldingsTabData$1) continuation;
            int i11 = holdingContainerViewModel$handleHoldingsTabData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                holdingContainerViewModel$handleHoldingsTabData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                holdingContainerViewModel$handleHoldingsTabData$1 = new HoldingContainerViewModel$handleHoldingsTabData$1(this, continuation);
            }
        } else {
            holdingContainerViewModel$handleHoldingsTabData$1 = new HoldingContainerViewModel$handleHoldingsTabData$1(this, continuation);
        }
        Object objM42823d = holdingContainerViewModel$handleHoldingsTabData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = holdingContainerViewModel$handleHoldingsTabData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            if (C22181m1.m51970b()) {
                updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.a
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HoldingContainerViewModel.m52445p((UIState) obj);
                    }
                });
                return Unit.INSTANCE;
            }
            InterfaceC41634e<HoldingDir> interfaceC41634eM52975J = this.f42273Y.m52975J();
            HoldingContainerViewModel$handleHoldingsTabData$3 holdingContainerViewModel$handleHoldingsTabData$3 = new HoldingContainerViewModel$handleHoldingsTabData$3(this, null);
            holdingContainerViewModel$handleHoldingsTabData$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM52975J, false, holdingContainerViewModel$handleHoldingsTabData$3, holdingContainerViewModel$handleHoldingsTabData$1);
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
            updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HoldingContainerViewModel.m52446q((UIState) obj);
                }
            });
        } else {
            updateState(new Function1() { // from class: com.kubi.quotefacade.market.holdings.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HoldingContainerViewModel.m52447r((UIState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final UIState m52445p(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, new Object(), null, null, 2, null);
    }

    /* JADX INFO: renamed from: q */
    public static final UIState m52446q(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, new Object(), null, null, 2, null);
    }

    /* JADX INFO: renamed from: r */
    public static final UIState m52447r(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, new Object(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final void m52448s() {
        C44128b.m97266j(this.f42272X, "network recovered: send FetchHoldingsTabData");
        sendIntent(new HoldingsContainerContract$UIIntent.FetchHoldingsTabData());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (m52444o(r0) == r1) goto L23;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C223221 c223221;
        if (continuation instanceof C223221) {
            c223221 = (C223221) continuation;
            int i11 = c223221.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c223221.label = i11 - Integer.MIN_VALUE;
            } else {
                c223221 = new C223221(continuation);
            }
        } else {
            c223221 = new C223221(continuation);
        }
        Object obj = c223221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c223221.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c223221.L$0 = interfaceC19282d;
            c223221.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c223221) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC19282d = (InterfaceC19282d) c223221.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        if (!(interfaceC19282d instanceof HoldingsContainerContract$UIIntent.FetchHoldingsTabData)) {
            return Unit.INSTANCE;
        }
        c223221.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
        c223221.label = 2;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, null, 7, null);
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f42274Z.m102779e();
        super.onCleared();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        this.f42274Z.m102780f();
        super.onHide();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        this.f42274Z.m102781g();
    }
}
