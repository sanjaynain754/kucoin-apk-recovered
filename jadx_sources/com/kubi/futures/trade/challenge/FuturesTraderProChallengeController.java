package com.kubi.futures.trade.challenge;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import bi.C4615g;
import bi.C4621m;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.futures.trade.FuturesTradeViewModel;
import com.kubi.futures.trade.welfare.vm.C14432h;
import com.kubi.futures.trade.welfare.vm.SelectFuturesWelfareViewModel;
import com.kubi.futures.view.FuturesTraderProChallengeView;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.Calendar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38213a;
import p569qq.C43852m;
import p729wl.C45875l0;
import p836zl.C46894j;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: FuturesTraderProChallengeController.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0011H\u0002J\b\u0010!\u001a\u00020\u0011H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0002J\b\u0010#\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006$"}, m90084d2 = {"Lcom/kubi/futures/trade/challenge/FuturesTraderProChallengeController;", "", "fragment", "Landroidx/fragment/app/Fragment;", "challengeView", "Lcom/kubi/futures/view/FuturesTraderProChallengeView;", "tradeViewModel", "Lcom/kubi/futures/trade/FuturesTradeViewModel;", "<init>", "(Landroidx/fragment/app/Fragment;Lcom/kubi/futures/view/FuturesTraderProChallengeView;Lcom/kubi/futures/trade/FuturesTradeViewModel;)V", "challengeViewModel", "Lcom/kubi/futures/trade/challenge/TradeProTrialViewModel;", "getChallengeViewModel", "()Lcom/kubi/futures/trade/challenge/TradeProTrialViewModel;", "challengeViewModel$delegate", "Lkotlin/Lazy;", "bind", "", TUIConstants.TUIChat.OWNER, "Landroidx/lifecycle/LifecycleOwner;", "refresh", "findWelfareViewModel", "Lcom/kubi/futures/trade/welfare/vm/SelectFuturesWelfareViewModel;", "refreshWelfare", "shouldShowForAccountType", "", "isChallengeClosed", "challengeId", "", "markChallengeClosed", "currentDayStartMillis", "", "onCloseClicked", "onProgressClicked", "onActivateClicked", "onUseClicked", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesTraderProChallengeController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTraderProChallengeController.kt\ncom/kubi/futures/trade/challenge/FuturesTraderProChallengeController\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 StorageId.kt\ncom/kubi/utils/storage/StorageId\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,156:1\n76#2,7:157\n46#3:164\n46#3:166\n84#4:165\n75#4,2:167\n1#5:169\n220#6,5:170\n*S KotlinDebug\n*F\n+ 1 FuturesTraderProChallengeController.kt\ncom/kubi/futures/trade/challenge/FuturesTraderProChallengeController\n*L\n66#1:157,7\n103#1:164\n110#1:166\n104#1:165\n111#1:167,2\n36#1:170,5\n*E\n"})
public final class FuturesTraderProChallengeController {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Fragment f23743a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final FuturesTraderProChallengeView f23744b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final FuturesTradeViewModel f23745c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f23746d;

    /* JADX INFO: renamed from: com.kubi.futures.trade.challenge.FuturesTraderProChallengeController$a */
    /* JADX INFO: compiled from: FuturesTraderProChallengeController.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13699a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f23747b;

        public C13699a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23747b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f23747b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23747b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public FuturesTraderProChallengeController(@NotNull Fragment fragment, @NotNull FuturesTraderProChallengeView challengeView, @NotNull FuturesTradeViewModel tradeViewModel) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(challengeView, "challengeView");
        Intrinsics.checkNotNullParameter(tradeViewModel, "tradeViewModel");
        this.f23743a = fragment;
        this.f23744b = challengeView;
        this.f23745c = tradeViewModel;
        this.f23746d = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.challenge.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTraderProChallengeController.m26950t(this.f23753b);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m26947q(FuturesTraderProChallengeController futuresTraderProChallengeController, TradeProTrialState tradeProTrialState) {
        FuturesTraderProChallengeUiState futuresTraderProChallengeUiStateM26977f = FuturesTraderProChallengeMapper.f23762a.m26977f(tradeProTrialState);
        if (futuresTraderProChallengeUiStateM26977f == null || futuresTraderProChallengeController.m26961x(futuresTraderProChallengeUiStateM26977f.getChallengeId())) {
            futuresTraderProChallengeController.f23744b.m28842o(null);
        } else {
            futuresTraderProChallengeController.f23744b.m28842o(futuresTraderProChallengeUiStateM26977f);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m26948r(FuturesTraderProChallengeController futuresTraderProChallengeController, Boolean bool) {
        futuresTraderProChallengeController.f23744b.setActionLoading(Intrinsics.areEqual(bool, Boolean.TRUE));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m26949s(FuturesTraderProChallengeController futuresTraderProChallengeController, Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            futuresTraderProChallengeController.m26955E();
            futuresTraderProChallengeController.m26960w().m26967p().setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final TradeProTrialViewModel m26950t(FuturesTraderProChallengeController futuresTraderProChallengeController) {
        return (TradeProTrialViewModel) new ViewModelProvider(futuresTraderProChallengeController.f23743a).get(TradeProTrialViewModel.class);
    }

    /* JADX INFO: renamed from: E */
    public final void m26955E() {
        SelectFuturesWelfareViewModel selectFuturesWelfareViewModelM26959v;
        InterfaceC38213a interfaceC38213aM26687Y0 = this.f23745c.m26687Y0();
        if (interfaceC38213aM26687Y0 == null || (selectFuturesWelfareViewModelM26959v = m26959v()) == null) {
            return;
        }
        selectFuturesWelfareViewModelM26959v.m28786h(C27041f.m66668h(interfaceC38213aM26687Y0.mo86250u()), C27041f.m66668h(interfaceC38213aM26687Y0.getSymbol()));
    }

    /* JADX INFO: renamed from: F */
    public final boolean m26956F() {
        return BrokerConfig.f19211a.m20201d().mo4515x() == MultiBizType.CLASSIC;
    }

    /* JADX INFO: renamed from: k */
    public final void m26957k(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (!m26956F()) {
            ViewExtKt.m66577h(this.f23744b);
            return;
        }
        this.f23744b.setOnCloseClickListener(new Function0() { // from class: com.kubi.futures.trade.challenge.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTraderProChallengeController.m26942l(this.f23754b);
            }
        });
        this.f23744b.setOnProgressClickListener(new Function0() { // from class: com.kubi.futures.trade.challenge.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTraderProChallengeController.m26943m(this.f23755b);
            }
        });
        this.f23744b.setOnUseClickListener(new Function0() { // from class: com.kubi.futures.trade.challenge.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTraderProChallengeController.m26944n(this.f23756b);
            }
        });
        this.f23744b.setOnActivateClickListener(new Function0() { // from class: com.kubi.futures.trade.challenge.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTraderProChallengeController.m26945o(this.f23757b);
            }
        });
        this.f23744b.setOnCountdownFinishedListener(new Function0() { // from class: com.kubi.futures.trade.challenge.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesTraderProChallengeController.m26946p(this.f23758b);
            }
        });
        m26960w().m26968q().observe(owner, new C13699a(new Function1() { // from class: com.kubi.futures.trade.challenge.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTraderProChallengeController.m26947q(this.f23759b, (TradeProTrialState) obj);
            }
        }));
        m26960w().m26966o().observe(owner, new C13699a(new Function1() { // from class: com.kubi.futures.trade.challenge.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTraderProChallengeController.m26948r(this.f23760b, (Boolean) obj);
            }
        }));
        m26960w().m26967p().observe(owner, new C13699a(new Function1() { // from class: com.kubi.futures.trade.challenge.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTraderProChallengeController.m26949s(this.f23761b, (Boolean) obj);
            }
        }));
        Fragment fragment = this.f23743a;
        String name = C4621m.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (C12573b.f21598a.m23696a()) {
            name.length();
        }
        C12572a.m23692a(fragment, false, new C13700x4fb5a3af(name, null, this));
    }

    /* JADX INFO: renamed from: v */
    public final SelectFuturesWelfareViewModel m26959v() {
        return C14432h.m28810a(this.f23743a);
    }

    /* JADX INFO: renamed from: w */
    public final TradeProTrialViewModel m26960w() {
        return (TradeProTrialViewModel) this.f23746d.getValue();
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m26942l(FuturesTraderProChallengeController futuresTraderProChallengeController) {
        futuresTraderProChallengeController.m26951A();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m26943m(FuturesTraderProChallengeController futuresTraderProChallengeController) {
        futuresTraderProChallengeController.m26952B();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m26944n(FuturesTraderProChallengeController futuresTraderProChallengeController) {
        futuresTraderProChallengeController.m26953C();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m26945o(FuturesTraderProChallengeController futuresTraderProChallengeController) {
        futuresTraderProChallengeController.m26963z();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m26946p(FuturesTraderProChallengeController futuresTraderProChallengeController) {
        futuresTraderProChallengeController.m26954D();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m26951A() {
        TradeProTrialState value = m26960w().m26968q().getValue();
        if (value == null) {
            return;
        }
        m26962y(value.getChallengeId());
        C43852m.m96591c(C17060n0.m36552b(), "traderProChallenge", "close", null, 8, null);
        this.f23744b.m28842o(null);
    }

    /* JADX INFO: renamed from: B */
    public final void m26952B() {
        TradeProTrialState value = m26960w().m26968q().getValue();
        if (value != null) {
            C43852m.m96591c(C17060n0.m36552b(), "traderProChallenge", "viewProgress", null, 8, null);
            String strM66668h = C27041f.m66668h(value.getProgressUrl());
            if (StringsKt.isBlank(strM66668h)) {
                strM66668h = C45875l0.f103336a.m101358z0();
            }
            String str = strM66668h;
            if (!StringsKt.isBlank(str)) {
                InterfaceC37766r.a.m85190a(C37304a.f82764a, str, null, null, null, null, null, null, 126, null);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m26953C() {
        String symbol;
        if (m26960w().m26968q().getValue() != null) {
            C43852m.m96591c(C17060n0.m36552b(), "traderProChallenge", "use", null, 8, null);
            InterfaceC38213a interfaceC38213aM26687Y0 = this.f23745c.m26687Y0();
            if (interfaceC38213aM26687Y0 != null && (symbol = interfaceC38213aM26687Y0.getSymbol()) != null) {
                String name = C4615g.class.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                C12572a.m23695d(name, new C4615g(symbol, true), 0L, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m26954D() {
        String symbol;
        if (!m26956F()) {
            ViewExtKt.m66577h(this.f23744b);
            return;
        }
        InterfaceC38213a interfaceC38213aM26687Y0 = this.f23745c.m26687Y0();
        if (interfaceC38213aM26687Y0 != null) {
            symbol = interfaceC38213aM26687Y0.getSymbol();
        } else {
            symbol = null;
        }
        m26960w().m26971t(symbol);
    }

    /* JADX INFO: renamed from: u */
    public final long m26958u() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: x */
    public final boolean m26961x(String str) {
        if (StringsKt.isBlank(str)) {
            return false;
        }
        StorageId<Long> storageIdM103270g0 = C46894j.f104736a.m103270g0();
        if (C46392a.m102324f(new StorageId(storageIdM103270g0.getCategory(), storageIdM103270g0.getKey() + '_' + str, storageIdM103270g0.getStorageType(), storageIdM103270g0.getSupportLegacy()), 0L) != m26958u()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final void m26962y(String str) {
        if (StringsKt.isBlank(str)) {
            return;
        }
        StorageId<Long> storageIdM103270g0 = C46894j.f104736a.m103270g0();
        C46392a.m102330m(new StorageId(storageIdM103270g0.getCategory(), storageIdM103270g0.getKey() + '_' + str, storageIdM103270g0.getStorageType(), storageIdM103270g0.getSupportLegacy()), m26958u());
    }

    /* JADX INFO: renamed from: z */
    public final void m26963z() {
        String symbol;
        TradeProTrialState value = m26960w().m26968q().getValue();
        if (value == null) {
            return;
        }
        C43852m.m96591c(C17060n0.m36552b(), "traderProChallenge", RemoteConfigComponent.ACTIVATE_FILE_NAME, null, 8, null);
        InterfaceC38213a interfaceC38213aM26687Y0 = this.f23745c.m26687Y0();
        if (interfaceC38213aM26687Y0 != null) {
            symbol = interfaceC38213aM26687Y0.getSymbol();
        } else {
            symbol = null;
        }
        m26960w().m26964b(value.getCode(), symbol);
    }
}
