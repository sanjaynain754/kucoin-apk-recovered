package com.kubi.quotefacade.market.etf;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager2.widget.ViewPager2;
import bv.C4682n;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.QuoteMarketBaseFragment;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.entity.EtfLevel1;
import com.kubi.quotefacade.entity.EtfMenu;
import com.kubi.quotefacade.entity.MarketMenuEntity;
import com.kubi.resources.widget.viewpager2.SlidingTabLayout;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p241ev.C37266a;
import p274fx.C37727a;
import p569qq.C43852m;
import p739ww.C45938b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: QuoteEtfFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u001bH\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J$\u0010$\u001a\u00020\u001b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020)H\u0082@¢\u0006\u0002\u0010*R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"Lcom/kubi/quotefacade/market/etf/QuoteEtfFragment;", "Lcom/kubi/quotefacade/QuoteMarketBaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentEtfMarketBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentEtfMarketBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "titleList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "tabLayout", "Lcom/kubi/resources/widget/viewpager2/SlidingTabLayout;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onLoad", "setData", "marketMenuEntity", "Lcom/kubi/quotefacade/entity/MarketMenuEntity;", "initViews", "initViewPage", "updateAdapter", "list", "", "Lcom/kubi/quotefacade/entity/EtfLevel1;", "selectIndex", "", "(Ljava/util/List;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuoteEtfFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteEtfFragment.kt\ncom/kubi/quotefacade/market/etf/QuoteEtfFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n*L\n1#1,150:1\n147#2,16:151\n45#3,7:167\n*S KotlinDebug\n*F\n+ 1 QuoteEtfFragment.kt\ncom/kubi/quotefacade/market/etf/QuoteEtfFragment\n*L\n33#1:151,16\n147#1:167,7\n*E\n"})
public final class QuoteEtfFragment extends QuoteMarketBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f42223U = C45681e.m100799e(this, new Function1<QuoteEtfFragment, C4682n>() { // from class: com.kubi.quotefacade.market.etf.QuoteEtfFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4682n invoke(@NotNull QuoteEtfFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4682n.m4676a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4682n, Unit>() { // from class: com.kubi.quotefacade.market.etf.QuoteEtfFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4682n it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4682n c4682n) {
            invoke(c4682n);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final ArrayList<CharSequence> f42224V = new ArrayList<>();

    /* JADX INFO: renamed from: W */
    @Nullable
    public ViewPager2 f42225W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public SlidingTabLayout f42226X;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f42222Z = {Reflection.property1(new PropertyReference1Impl(QuoteEtfFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentEtfMarketBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f42221Y = new Companion(null);

    /* JADX INFO: compiled from: QuoteEtfFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/market/etf/QuoteEtfFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "newInstance", "Lcom/kubi/quotefacade/market/etf/QuoteEtfFragment;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final QuoteEtfFragment newInstance() {
            return new QuoteEtfFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.etf.QuoteEtfFragment$a */
    /* JADX INFO: compiled from: QuoteEtfFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/market/etf/QuoteEtfFragment$initViewPage$1", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22301a extends C45938b {
        public C22301a() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            super.mo18273b(i11);
            C44128b.m97266j(QuoteEtfFragment.this.getTAG(), "position=" + i11);
        }
    }

    @Override // com.kubi.quotefacade.QuoteMarketBaseFragment
    /* JADX INFO: renamed from: j3 */
    public void mo50179j3(@NotNull MarketMenuEntity marketMenuEntity) {
        List<EtfLevel1> level1;
        Intrinsics.checkNotNullParameter(marketMenuEntity, "marketMenuEntity");
        String tag = getTAG();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setData = ");
        EtfMenu etfMenu = marketMenuEntity.getEtfMenu();
        sb2.append((etfMenu == null || (level1 = etfMenu.getLevel1()) == null) ? null : Integer.valueOf(level1.size()));
        C44128b.m97266j(tag, sb2.toString());
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b(), null, new QuoteEtfFragment$setData$1(marketMenuEntity, this, null), 2, null);
    }

    /* JADX INFO: renamed from: n3 */
    public final C4682n m52398n3() {
        return (C4682n) this.f42223U.getValue(this, f42222Z[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_etf_market, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m52397p3();
        C44128b.m97266j(getTAG(), "onViewCreated");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q3 */
    public final Object m52399q3(List<EtfLevel1> list, int i11, Continuation<? super Unit> continuation) {
        QuoteEtfFragment$updateAdapter$1 quoteEtfFragment$updateAdapter$1;
        if (continuation instanceof QuoteEtfFragment$updateAdapter$1) {
            quoteEtfFragment$updateAdapter$1 = (QuoteEtfFragment$updateAdapter$1) continuation;
            int i12 = quoteEtfFragment$updateAdapter$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                quoteEtfFragment$updateAdapter$1.label = i12 - Integer.MIN_VALUE;
            } else {
                quoteEtfFragment$updateAdapter$1 = new QuoteEtfFragment$updateAdapter$1(this, continuation);
            }
        } else {
            quoteEtfFragment$updateAdapter$1 = new QuoteEtfFragment$updateAdapter$1(this, continuation);
        }
        Object obj = quoteEtfFragment$updateAdapter$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = quoteEtfFragment$updateAdapter$1.label;
        try {
            if (i13 == 0) {
                ResultKt.throwOnFailure(obj);
                C44128b.m97266j(getTAG(), "updateAdapter start etf");
                ViewPager2 viewPager2 = this.f42225W;
                if (viewPager2 == null) {
                    return Unit.INSTANCE;
                }
                SlidingTabLayout slidingTabLayout = this.f42226X;
                if (slidingTabLayout == null) {
                    return Unit.INSTANCE;
                }
                AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                QuoteEtfFragment$updateAdapter$2 quoteEtfFragment$updateAdapter$2 = new QuoteEtfFragment$updateAdapter$2(viewPager2, list, this, i11, slidingTabLayout, null);
                quoteEtfFragment$updateAdapter$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
                quoteEtfFragment$updateAdapter$1.L$1 = SpillingKt.nullOutSpilledVariable(viewPager2);
                quoteEtfFragment$updateAdapter$1.L$2 = SpillingKt.nullOutSpilledVariable(slidingTabLayout);
                quoteEtfFragment$updateAdapter$1.I$0 = i11;
                quoteEtfFragment$updateAdapter$1.label = 1;
                if (C41686h.m91049g(abstractC41697j0M94121c, quoteEtfFragment$updateAdapter$2, quoteEtfFragment$updateAdapter$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e11) {
            if (e11 instanceof CancellationException) {
                return Unit.INSTANCE;
            }
            C37266a.m83411b(e11, "QuoteEtfFragmentUpdateAdapterException");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o3 */
    private final void m52396o3() {
        C4682n c4682nM52398n3 = m52398n3();
        if (c4682nM52398n3 == null) {
            return;
        }
        this.f42224V.clear();
        this.f42225W = c4682nM52398n3.f4462c;
        SlidingTabLayout slidingTabLayout = c4682nM52398n3.f4461b;
        this.f42226X = slidingTabLayout;
        if (slidingTabLayout != null) {
            slidingTabLayout.setNeedBold(true);
        }
        ViewPager2 viewPager2 = c4682nM52398n3.f4462c;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        viewPager2.setAdapter(new C37727a(childFragmentManager, lifecycle));
        c4682nM52398n3.f4462c.setOffscreenPageLimit(1);
        c4682nM52398n3.f4461b.m55601z(this.f42225W, this.f42224V);
        c4682nM52398n3.f4461b.setOnTabSelectListener(new C22301a());
    }

    /* JADX INFO: renamed from: p3 */
    private final void m52397p3() {
        m52396o3();
        C44128b.m97266j(getTAG(), "initViews done");
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        C44128b.m97266j(getTAG(), "onLoad");
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        C43852m.m96595g("B7ETFMarkets", "Tab", "1", null, 8, null);
    }
}
