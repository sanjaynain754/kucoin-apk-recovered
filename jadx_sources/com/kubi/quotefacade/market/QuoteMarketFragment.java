package com.kubi.quotefacade.market;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.StringRes;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import bv.C4700w;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.QuoteMarketBaseFragment;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.MarketMenuEntity;
import com.kubi.quotefacade.entity.SpotLevel1;
import com.kubi.quotefacade.entity.SpotMenu;
import com.kubi.quotefacade.event.MarketContainerContract$UIIntent;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.helper.QuoteConfigHelper;
import com.kubi.quotefacade.market.etf.QuoteEtfFragment;
import com.kubi.quotefacade.market.futures.QuoteFuturesFragment;
import com.kubi.quotefacade.market.spot.QuoteSpotFragment;
import com.kubi.quotefacade.view.NoScrollQuoteViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.C27103z;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025av.C4391b;
import p208dr.InterfaceC36952a;
import p212dv.C36977q;
import p569qq.C43852m;
import p739ww.C45938b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
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
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: QuoteMarketFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\b\u0010 \u001a\u00020\u0019H\u0002J\r\u0010!\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\u0012J\b\u0010$\u001a\u00020\u0019H\u0002J\u0012\u0010%\u001a\u00020\u00122\b\b\u0001\u0010&\u001a\u00020\u0012H\u0002J\b\u0010'\u001a\u00020\u0019H\u0002J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*H\u0014J\b\u0010+\u001a\u00020\u0019H\u0014J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u0012H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00150\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006/"}, m90084d2 = {"Lcom/kubi/quotefacade/market/QuoteMarketFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/quotefacade/event/MarketContainerContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentQuoteMarketContainerBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentQuoteMarketContainerBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "tabFragments", "Ljava/util/ArrayList;", "Lcom/kubi/sdk/BaseFragment;", "Lkotlin/collections/ArrayList;", "adapter", "Lcom/kubi/utils/InnerPagerAdapter;", "getLayout", "", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onLoad", "initViewPager", "getCurrentItem", "()Ljava/lang/Integer;", "getViewPagerSize", "setCurrentItem", "indexOf", "titleResId", "initMenuData", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "bindState", "trackClick", ViewProps.POSITION, "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuoteMarketFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteMarketFragment.kt\ncom/kubi/quotefacade/market/QuoteMarketFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n147#2,16:204\n43#3:220\n93#4,2:221\n96#4:227\n1878#5,2:223\n1880#5:226\n1#6:225\n*S KotlinDebug\n*F\n+ 1 QuoteMarketFragment.kt\ncom/kubi/quotefacade/market/QuoteMarketFragment\n*L\n39#1:204,16\n129#1:220\n166#1:221,2\n166#1:227\n170#1:223,2\n170#1:226\n*E\n"})
public final class QuoteMarketFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f42202U = C45681e.m100799e(this, new Function1<QuoteMarketFragment, C4700w>() { // from class: com.kubi.quotefacade.market.QuoteMarketFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4700w invoke(@NotNull QuoteMarketFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4700w.m4712a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4700w, Unit>() { // from class: com.kubi.quotefacade.market.QuoteMarketFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4700w it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4700w c4700w) {
            invoke(c4700w);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public ArrayList<BaseFragment> f42203V = new ArrayList<>();

    /* JADX INFO: renamed from: W */
    public C27103z f42204W;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f42201Y = {Reflection.property1(new PropertyReference1Impl(QuoteMarketFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentQuoteMarketContainerBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f42200X = new Companion(null);

    /* JADX INFO: compiled from: QuoteMarketFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/market/QuoteMarketFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "TAB_POSITION_SPOT", "", "TAB_POSITION_FUTURE", "TAB_POSITION_ETF", "newInstance", "Lcom/kubi/quotefacade/market/QuoteMarketFragment;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final QuoteMarketFragment newInstance() {
            return new QuoteMarketFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.QuoteMarketFragment$a */
    /* JADX INFO: compiled from: QuoteMarketFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/market/QuoteMarketFragment$initViewPager$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22285a extends ViewPager.SimpleOnPageChangeListener {
        public C22285a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            C44128b.m97266j(QuoteMarketFragment.this.getTAG(), "onPageSelected=" + position);
            QuoteMarketFragment.this.m52376v3(position);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.QuoteMarketFragment$b */
    /* JADX INFO: compiled from: QuoteMarketFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/market/QuoteMarketFragment$initViewPager$2", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22286b extends C45938b {
        public C22286b() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            C44128b.m97266j(QuoteMarketFragment.this.getTAG(), "onTabSelect=" + i11);
            C43852m.m96591c("B5ChanceCenter", "Tab", String.valueOf(i11), null, 8, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.QuoteMarketFragment$bindState$2 */
    /* JADX INFO: compiled from: QuoteMarketFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.market.QuoteMarketFragment$bindState$2", m90122f = "QuoteMarketFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C222882 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C222882(Continuation<? super C222882> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C222882 c222882 = QuoteMarketFragment.this.new C222882(continuation);
            c222882.L$0 = obj;
            return c222882;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C222882) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (obj2 == null) {
                return Unit.INSTANCE;
            }
            C44128b.m97266j(QuoteMarketFragment.this.getTAG(), "bindState error");
            BaseFragment.showEmptyView$default(QuoteMarketFragment.this, 0, 0, (View.OnClickListener) null, 7, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: t3 */
    private final void m52368t3() {
        SlidingTabLayout slidingTabLayout;
        NoScrollQuoteViewPager noScrollQuoteViewPager;
        NoScrollQuoteViewPager noScrollQuoteViewPager2;
        SlidingTabLayout slidingTabLayout2;
        NoScrollQuoteViewPager noScrollQuoteViewPager3;
        SlidingTabLayout slidingTabLayout3;
        SlidingTabLayout slidingTabLayout4;
        ArrayList arrayList = new ArrayList();
        QuoteConfigHelper quoteConfigHelper = QuoteConfigHelper.f41987a;
        if (quoteConfigHelper.m51935o()) {
            this.f42203V.add(QuoteSpotFragment.f42348c0.newInstance());
            arrayList.add(getString(R$string.spot));
        }
        if (quoteConfigHelper.m51932l()) {
            this.f42203V.add(QuoteFuturesFragment.f42236d0.newInstance());
            arrayList.add(getString(R$string.futures));
        }
        if (quoteConfigHelper.m51931k()) {
            this.f42203V.add(QuoteEtfFragment.f42221Y.newInstance());
            arrayList.add(getString(R$string.market_tab_etf));
        }
        C4700w c4700wM52371o3 = m52371o3();
        if (c4700wM52371o3 != null && (slidingTabLayout4 = c4700wM52371o3.f4587b) != null) {
            slidingTabLayout4.setNeedBold(true);
        }
        C4700w c4700wM52371o4 = m52371o3();
        if (c4700wM52371o4 != null && (slidingTabLayout3 = c4700wM52371o4.f4587b) != null) {
            slidingTabLayout3.setUnderlineIgnorePadding(true);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        this.f42204W = new C27103z(childFragmentManager, this.f42203V, arrayList);
        C4700w c4700wM52371o5 = m52371o3();
        if (c4700wM52371o5 != null && (noScrollQuoteViewPager3 = c4700wM52371o5.f4588c) != null) {
            C27103z c27103z = this.f42204W;
            if (c27103z == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                c27103z = null;
            }
            noScrollQuoteViewPager3.setAdapter(c27103z);
        }
        C4700w c4700wM52371o6 = m52371o3();
        if (c4700wM52371o6 != null && (slidingTabLayout2 = c4700wM52371o6.f4587b) != null) {
            C4700w c4700wM52371o7 = m52371o3();
            slidingTabLayout2.setViewPager(c4700wM52371o7 != null ? c4700wM52371o7.f4588c : null);
        }
        C4700w c4700wM52371o8 = m52371o3();
        if (c4700wM52371o8 != null && (noScrollQuoteViewPager2 = c4700wM52371o8.f4588c) != null) {
            noScrollQuoteViewPager2.setOffscreenPageLimit(arrayList.size());
        }
        m52369u3();
        C4700w c4700wM52371o9 = m52371o3();
        if (c4700wM52371o9 != null && (noScrollQuoteViewPager = c4700wM52371o9.f4588c) != null) {
            noScrollQuoteViewPager.addOnPageChangeListener(new C22285a());
        }
        C4700w c4700wM52371o10 = m52371o3();
        if (c4700wM52371o10 == null || (slidingTabLayout = c4700wM52371o10.f4587b) == null) {
            return;
        }
        slidingTabLayout.setOnTabSelectListener(new C22286b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX INFO: renamed from: u3 */
    private final void m52369u3() {
        int iM52374r3;
        C4700w c4700wM52371o3;
        NoScrollQuoteViewPager noScrollQuoteViewPager;
        C4391b c4391b = C4391b.f3820a;
        switch (c4391b.m4005c()) {
            case "holdings":
                iM52374r3 = m52374r3(R$string.quote_holding_tab);
                break;
            case "futures":
                iM52374r3 = m52374r3(R$string.futures);
                break;
            case "etf":
                iM52374r3 = m52374r3(R$string.market_tab_etf);
                break;
            case "spot":
                iM52374r3 = m52374r3(R$string.spot);
                break;
            default:
                iM52374r3 = -1;
                break;
        }
        c4391b.m4010h("");
        if (iM52374r3 < 0 || (c4700wM52371o3 = m52371o3()) == null || (noScrollQuoteViewPager = c4700wM52371o3.f4588c) == null) {
            return;
        }
        noScrollQuoteViewPager.setCurrentItem(iM52374r3);
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m52370w3(QuoteMarketFragment quoteMarketFragment, int i11) {
        C27103z c27103z = quoteMarketFragment.f42204W;
        if (c27103z == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            c27103z = null;
        }
        String string = c27103z.m66939a().get(i11).toString();
        if (Intrinsics.areEqual(string, quoteMarketFragment.getString(R$string.quote_holding_tab))) {
            C43852m.m96591c("B5Position", "Tab", null, null, 12, null);
        } else if (Intrinsics.areEqual(string, quoteMarketFragment.getString(R$string.spot))) {
            C43852m.m96591c("B5SpotsMarkets", "Tab", null, null, 12, null);
        } else if (Intrinsics.areEqual(string, quoteMarketFragment.getString(R$string.futures))) {
            C43852m.m96591c("B6FuturesMarkets", "Tab", null, null, 12, null);
        } else if (Intrinsics.areEqual(string, quoteMarketFragment.getString(R$string.market_tab_etf))) {
            C43852m.m96591c("B7ETFMarkets", "Tab", null, null, 12, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.market.QuoteMarketFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getError();
            }
        }, new C222882(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        MarketMenuEntity f82093a;
        List<SpotLevel1> level1;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        C44128b.m97266j(getTAG(), "dispatchSingleEvent = " + singleEvent);
        if (!(singleEvent instanceof C36977q) || (f82093a = ((C36977q) singleEvent).getF82093a()) == null) {
            return;
        }
        String tag = getTAG();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("dispatchSingleEvent marketMenuEntity = ");
        SpotMenu spotMenu = f82093a.getSpotMenu();
        sb2.append((spotMenu == null || (level1 = spotMenu.getLevel1()) == null) ? null : Integer.valueOf(level1.size()));
        C44128b.m97266j(tag, sb2.toString());
        showContentView();
        int i11 = 0;
        for (Object obj : this.f42203V) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BaseFragment baseFragment = (BaseFragment) obj;
            if (baseFragment instanceof QuoteMarketBaseFragment) {
                ((QuoteMarketBaseFragment) baseFragment).mo50179j3(f82093a);
            }
            i11 = i12;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_quote_market_container;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(QuoteMarketViewModel.class);
    }

    /* JADX INFO: renamed from: o3 */
    public final C4700w m52371o3() {
        return (C4700w) this.f42202U.getValue(this, f42201Y[0]);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m52368t3();
        C44128b.m97266j(getTAG(), "onViewCreated");
    }

    /* JADX INFO: renamed from: r3 */
    public final int m52374r3(@StringRes int i11) {
        try {
            C27103z c27103z = this.f42204W;
            if (c27103z == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                c27103z = null;
            }
            return c27103z.m66939a().indexOf(getString(i11));
        } catch (Exception e11) {
            C44128b.m97264h(e11);
            return -1;
        }
    }

    /* JADX INFO: renamed from: s3 */
    public final void m52375s3() {
        sendIntent(MarketContainerContract$UIIntent.FetchMenuList.INSTANCE);
    }

    /* JADX INFO: renamed from: v3 */
    public final void m52376v3(final int i11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.market.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteMarketFragment.m52370w3(this.f42337b, i11);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m52375s3();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m52369u3();
        C43852m.m96595g("B5Markets", "TopNav", "6", null, 8, null);
    }

    @Nullable
    /* JADX INFO: renamed from: p3 */
    public final Integer m52372p3() {
        NoScrollQuoteViewPager noScrollQuoteViewPager;
        C4700w c4700wM52371o3 = m52371o3();
        if (c4700wM52371o3 != null && (noScrollQuoteViewPager = c4700wM52371o3.f4588c) != null) {
            return Integer.valueOf(noScrollQuoteViewPager.getCurrentItem());
        }
        return null;
    }

    /* JADX INFO: renamed from: q3 */
    public final int m52373q3() {
        NoScrollQuoteViewPager noScrollQuoteViewPager;
        C4700w c4700wM52371o3 = m52371o3();
        if (c4700wM52371o3 != null && (noScrollQuoteViewPager = c4700wM52371o3.f4588c) != null) {
            return noScrollQuoteViewPager.getChildCount();
        }
        return 0;
    }
}
