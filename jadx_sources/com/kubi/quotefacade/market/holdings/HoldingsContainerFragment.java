package com.kubi.quotefacade.market.holdings;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentManager;
import bv.C4654b0;
import bv.C4694t;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.LazySimpleStateFragment;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.event.HoldingsContainerContract$UIIntent;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.view.RankShimmer;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37749a;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p212dv.C36974n;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: HoldingsContainerFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020\u001bH\u0014J\b\u0010#\u001a\u00020\u001bH\u0007J!\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00132\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u001bH\u0016R\"\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, m90084d2 = {"Lcom/kubi/quotefacade/market/holdings/HoldingsContainerFragment;", "Lcom/kubi/mvi/state/LazySimpleStateFragment;", "Lcom/kubi/quotefacade/event/HoldingsContainerContract$UIState;", "<init>", "()V", "getLayout", "", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "binding", "Lcom/kubi/quotefacade/databinding/FragmentHoldingsContainerBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentHoldingsContainerBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "hasHoldingsContent", "", "positionType", "", "getPositionType", "()Ljava/lang/String;", "positionType$delegate", "Lkotlin/Lazy;", "doOnLazyInitView", "", "showLoading", "showContent", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "bindState", "showHoldingsContent", "controlPlaceView", "showNoData", "showType", "(ZLjava/lang/Integer;)V", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHoldingsContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoldingsContainerFragment.kt\ncom/kubi/quotefacade/market/holdings/HoldingsContainerFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,180:1\n147#2,16:181\n*S KotlinDebug\n*F\n+ 1 HoldingsContainerFragment.kt\ncom/kubi/quotefacade/market/holdings/HoldingsContainerFragment\n*L\n34#1:181,16\n*E\n"})
public final class HoldingsContainerFragment extends LazySimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: a0 */
    public boolean f42292a0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f42290d0 = {Reflection.property1(new PropertyReference1Impl(HoldingsContainerFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentHoldingsContainerBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f42289c0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f42291Z = C45681e.m100799e(this, new Function1<HoldingsContainerFragment, C4694t>() { // from class: com.kubi.quotefacade.market.holdings.HoldingsContainerFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4694t invoke(@NotNull HoldingsContainerFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            View viewM42558q3 = this.this$0.m42558q3();
            Intrinsics.checkNotNullExpressionValue(viewM42558q3, "access$getLazyFragContentView(...)");
            return C4694t.m4700a(viewM42558q3);
        }

        {
            super(1);
        }
    }, new Function1<C4694t, Unit>() { // from class: com.kubi.quotefacade.market.holdings.HoldingsContainerFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4694t it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4694t c4694t) {
            invoke(c4694t);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f42293b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.market.holdings.b0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HoldingsContainerFragment.m52535H3(this.f42302b);
        }
    });

    /* JADX INFO: compiled from: HoldingsContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0007J\u0014\u0010\t\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/market/holdings/HoldingsContainerFragment$Companion;", "", "<init>", "()V", "PLACE_VIEW_TYPE_NOT_LOGIN", "", "PLACE_VIEW_TYPE_PAY_MONEY", "PAGE_ID", "", "newInstance", "Lcom/kubi/quotefacade/market/holdings/HoldingsContainerFragment;", "positionType", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nHoldingsContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoldingsContainerFragment.kt\ncom/kubi/quotefacade/market/holdings/HoldingsContainerFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final HoldingsContainerFragment newInstance() {
            return new HoldingsContainerFragment();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final HoldingsContainerFragment newInstance(@Nullable String positionType) {
            HoldingsContainerFragment holdingsContainerFragment = new HoldingsContainerFragment();
            Bundle bundle = new Bundle();
            if (positionType != null) {
                bundle.putString("positionType", positionType);
            }
            holdingsContainerFragment.setArguments(bundle);
            return holdingsContainerFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.holdings.HoldingsContainerFragment$bindState$2 */
    /* JADX INFO: compiled from: HoldingsContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.market.holdings.HoldingsContainerFragment$bindState$2", m90122f = "HoldingsContainerFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C223342 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C223342(Continuation<? super C223342> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C223342 c223342 = HoldingsContainerFragment.this.new C223342(continuation);
            c223342.L$0 = obj;
            return c223342;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C223342) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (obj2 != null) {
                HoldingsContainerFragment.this.f42292a0 = false;
                HoldingsContainerFragment.this.m52543A3(true, Boxing.boxInt(1));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.holdings.HoldingsContainerFragment$bindState$4 */
    /* JADX INFO: compiled from: HoldingsContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.market.holdings.HoldingsContainerFragment$bindState$4", m90122f = "HoldingsContainerFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C223364 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C223364(Continuation<? super C223364> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C223364 c223364 = HoldingsContainerFragment.this.new C223364(continuation);
            c223364.L$0 = obj;
            return c223364;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C223364) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (obj2 != null) {
                HoldingsContainerFragment.this.f42292a0 = false;
                HoldingsContainerFragment.this.m52543A3(true, Boxing.boxInt(2));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.holdings.HoldingsContainerFragment$bindState$6 */
    /* JADX INFO: compiled from: HoldingsContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.market.holdings.HoldingsContainerFragment$bindState$6", m90122f = "HoldingsContainerFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C223386 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C223386(Continuation<? super C223386> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final void m52547f(HoldingsContainerFragment holdingsContainerFragment, View view) {
            holdingsContainerFragment.sendIntent(new HoldingsContainerContract$UIIntent.FetchHoldingsTabData());
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C223386 c223386 = HoldingsContainerFragment.this.new C223386(continuation);
            c223386.L$0 = obj;
            return c223386;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C223386) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (obj2 != null) {
                HoldingsContainerFragment.this.f42292a0 = false;
                HoldingsContainerFragment.this.showContent();
                final HoldingsContainerFragment holdingsContainerFragment = HoldingsContainerFragment.this;
                BaseFragment.showFailView$default(holdingsContainerFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.quotefacade.market.holdings.d0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HoldingsContainerFragment.C223386.m52547f(holdingsContainerFragment, view);
                    }
                }, 3, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: I3 */
    public final void m52545I3() {
        this.f42292a0 = true;
        m52530B3(this, false, null, 2, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        int i11 = R$id.fragment_container;
        if (childFragmentManager.findFragmentById(i11) == null) {
            getChildFragmentManager().beginTransaction().replace(i11, AllHoldingsFragment.f42268k0.newInstance(m52534G3())).commitNowAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: B3 */
    public static /* synthetic */ void m52530B3(HoldingsContainerFragment holdingsContainerFragment, boolean z11, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = 0;
        }
        holdingsContainerFragment.m52543A3(z11, num);
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m52531C3() {
        IUserService.O(IUserService.a.get(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.quotefacade.market.holdings.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HoldingsContainerFragment.m52532D3();
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m52532D3() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m52533E3() {
        InterfaceC37749a.a.m85107b(C37304a.f82764a, FastQuoteModel.PAY_RECHARGE, "HOMEPAGE", null, null, null, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    private final String m52534G3() {
        return (String) this.f42293b0.getValue();
    }

    /* JADX INFO: renamed from: F3 */
    public final C4694t m52544F3() {
        return (C4694t) this.f42291Z.getValue(this, f42290d0[0]);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C36974n) {
            m52545I3();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_holdings_container;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(HoldingContainerViewModel.class);
    }

    /* JADX INFO: renamed from: H3 */
    public static final String m52535H3(HoldingsContainerFragment holdingsContainerFragment) {
        Bundle arguments = holdingsContainerFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("positionType");
        }
        return null;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: A3 */
    public final void m52543A3(boolean z11, @Nullable Integer num) {
        showContent();
        if (z11) {
            C4694t c4694tM52544F3 = m52544F3();
            if (c4694tM52544F3 != null) {
                c4694tM52544F3.f4535d.f4230b.setVisibility(0);
                c4694tM52544F3.f4533b.setVisibility(8);
                if (num != null && num.intValue() == 1) {
                    c4694tM52544F3.f4535d.f4232d.setText(getString(R$string.quote_holding_not_login));
                    KcPrimaryButton kcPrimaryButton = c4694tM52544F3.f4535d.f4231c;
                    kcPrimaryButton.setText(getString(R$string.quote_holding_login_check));
                    Intrinsics.checkNotNull(kcPrimaryButton);
                    C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.quotefacade.market.holdings.z
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HoldingsContainerFragment.m52531C3();
                        }
                    }, 1, null);
                    return;
                }
                if (num != null && num.intValue() == 2) {
                    c4694tM52544F3.f4535d.f4232d.setText(getString(R$string.quote_holding_no_content));
                    KcPrimaryButton kcPrimaryButton2 = c4694tM52544F3.f4535d.f4231c;
                    kcPrimaryButton2.setText(getString(R$string.quote_holding_go_to_charge));
                    Intrinsics.checkNotNull(kcPrimaryButton2);
                    C27046k.m66711z(kcPrimaryButton2, 0L, new Function0() { // from class: com.kubi.quotefacade.market.holdings.a0
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HoldingsContainerFragment.m52533E3();
                        }
                    }, 1, null);
                    return;
                }
                return;
            }
            return;
        }
        C4694t c4694tM52544F4 = m52544F3();
        if (c4694tM52544F4 != null) {
            c4694tM52544F4.f4533b.setVisibility(0);
            c4694tM52544F4.f4535d.f4230b.setVisibility(8);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.market.holdings.HoldingsContainerFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getNotLogin();
            }
        }, new C223342(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.market.holdings.HoldingsContainerFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getGoPayMoney();
            }
        }, new C223364(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.market.holdings.HoldingsContainerFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getError();
            }
        }, new C223386(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        RankShimmer rankShimmer;
        RankShimmer rankShimmer2;
        super.onHide();
        C4694t c4694tM52544F3 = m52544F3();
        if (c4694tM52544F3 != null && (rankShimmer2 = c4694tM52544F3.f4534c) != null) {
            rankShimmer2.m53323f();
        }
        C4694t c4694tM52544F4 = m52544F3();
        if (c4694tM52544F4 != null && (rankShimmer = c4694tM52544F4.f4534c) != null) {
            rankShimmer.setVisibility(8);
        }
    }

    @Override // com.kubi.mvi.state.LazyBaseStateFragment, com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        if (!this.f42292a0) {
            showLoading();
        }
        sendIntent(new HoldingsContainerContract$UIIntent.FetchHoldingsTabData());
        C43852m.m96595g("B5Position", "Tab", "1", null, 8, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        RankShimmer rankShimmer;
        RankShimmer rankShimmer2;
        C4694t c4694tM52544F3 = m52544F3();
        if (c4694tM52544F3 != null && (rankShimmer2 = c4694tM52544F3.f4534c) != null) {
            rankShimmer2.m53323f();
        }
        C4694t c4694tM52544F4 = m52544F3();
        if (c4694tM52544F4 != null && (rankShimmer = c4694tM52544F4.f4534c) != null) {
            rankShimmer.setVisibility(8);
        }
        super.showContent();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showLoading() {
        RankShimmer rankShimmer;
        RankShimmer rankShimmer2;
        C4654b0 c4654b0;
        LinearLayout linearLayout;
        FrameLayout frameLayout;
        super.showContent();
        C4694t c4694tM52544F3 = m52544F3();
        if (c4694tM52544F3 != null && (frameLayout = c4694tM52544F3.f4533b) != null) {
            frameLayout.setVisibility(4);
        }
        C4694t c4694tM52544F4 = m52544F3();
        if (c4694tM52544F4 != null && (c4654b0 = c4694tM52544F4.f4535d) != null && (linearLayout = c4654b0.f4230b) != null) {
            linearLayout.setVisibility(8);
        }
        C4694t c4694tM52544F5 = m52544F3();
        if (c4694tM52544F5 != null && (rankShimmer2 = c4694tM52544F5.f4534c) != null) {
            rankShimmer2.m53322e();
        }
        C4694t c4694tM52544F6 = m52544F3();
        if (c4694tM52544F6 != null && (rankShimmer = c4694tM52544F6.f4534c) != null) {
            rankShimmer.setVisibility(0);
        }
    }

    @Override // com.kubi.mvi.state.LazyBaseStateFragment
    /* JADX INFO: renamed from: o3 */
    public void mo42556o3() {
    }
}
