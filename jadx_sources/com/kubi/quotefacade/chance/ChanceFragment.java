package com.kubi.quotefacade.chance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager.widget.ViewPager;
import bv.C4674j;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.tradechance.TradeChanceFragment;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.C27103z;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025av.C4391b;
import p294gz.C38057a;
import p321hv.InterfaceC38354d;
import p569qq.C43852m;
import p739ww.C45938b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: ChanceFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020\u001aH\u0002J\u0006\u0010$\u001a\u00020\u001aJ\u0006\u0010%\u001a\u00020\"R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000bj\b\u0012\u0004\u0012\u00020\u0001`\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/quotefacade/chance/ChanceFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentChanceBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentChanceBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "tabFragments", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "adapter", "Lcom/kubi/utils/InnerPagerAdapter;", "fromMarket", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onArguments", "bundle", "initViewPager", "changePagerScrollStatus", "scrollStatus", "", "setCurrentItem", "removeEmotionFragment", "isEmotionTab", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChanceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChanceFragment.kt\ncom/kubi/quotefacade/chance/ChanceFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n147#2,16:152\n17#3,2:168\n808#4,11:170\n1869#4,2:181\n808#4,11:183\n1869#4,2:194\n*S KotlinDebug\n*F\n+ 1 ChanceFragment.kt\ncom/kubi/quotefacade/chance/ChanceFragment\n*L\n32#1:152,16\n72#1:168,2\n131#1:170,11\n131#1:181,2\n135#1:183,11\n135#1:194,2\n*E\n"})
public final class ChanceFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    public C27103z f41630W;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f41627Z = {Reflection.property1(new PropertyReference1Impl(ChanceFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentChanceBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f41626Y = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f41628U = C45681e.m100799e(this, new Function1<ChanceFragment, C4674j>() { // from class: com.kubi.quotefacade.chance.ChanceFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4674j invoke(@NotNull ChanceFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4674j.m4660a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4674j, Unit>() { // from class: com.kubi.quotefacade.chance.ChanceFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4674j it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4674j c4674j) {
            invoke(c4674j);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public ArrayList<BaseFragment> f41629V = new ArrayList<>();

    /* JADX INFO: renamed from: X */
    @Nullable
    public String f41631X = "";

    /* JADX INFO: compiled from: ChanceFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/chance/ChanceFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "newInstance", "Lcom/kubi/quotefacade/chance/ChanceFragment;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final ChanceFragment newInstance() {
            return new ChanceFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chance.ChanceFragment$a */
    /* JADX INFO: compiled from: ChanceFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/chance/ChanceFragment$initViewPager$2", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21847a extends ViewPager.SimpleOnPageChangeListener {
        public C21847a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            C44128b.m97266j(ChanceFragment.this.getTAG(), "onPageSelected=" + position);
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chance.ChanceFragment$b */
    /* JADX INFO: compiled from: ChanceFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/chance/ChanceFragment$initViewPager$3", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21848b extends C45938b {
        public C21848b() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) {
            C44128b.m97266j(ChanceFragment.this.getTAG(), "onTabSelect=" + i11);
            C43852m.m96591c("B5ChanceCenter", "Tab", String.valueOf(i11), null, 8, null);
        }
    }

    /* JADX INFO: renamed from: p3 */
    public final boolean m51022p3() {
        C4674j c4674jM51021n3;
        RtlViewPager rtlViewPager;
        try {
            if (getView() == null || (c4674jM51021n3 = m51021n3()) == null || (rtlViewPager = c4674jM51021n3.f4378c) == null) {
                return false;
            }
            int currentItem = rtlViewPager.getCurrentItem();
            C27103z c27103z = this.f41630W;
            if (c27103z == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                c27103z = null;
            }
            CharSequence charSequence = (CharSequence) CollectionsKt.getOrNull(c27103z.m66939a(), currentItem);
            if (charSequence == null) {
                return false;
            }
            return Intrinsics.areEqual(charSequence, getString(R$string.discover_emotion_tab_market));
        } catch (Exception unused) {
            C44128b.m97261e(getTAG(), "ChanceFragment isEmotionTab error");
            return false;
        }
    }

    /* JADX INFO: renamed from: o3 */
    private final void m51017o3() {
        SlidingTabLayout slidingTabLayout;
        RtlViewPager rtlViewPager;
        RtlViewPager rtlViewPager2;
        SlidingTabLayout slidingTabLayout2;
        RtlViewPager rtlViewPager3;
        SlidingTabLayout slidingTabLayout3;
        SlidingTabLayout slidingTabLayout4;
        String strM96601m = C43852m.m96601m("B5ChanceCenter", "Tab", "1");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC38354d.class, SiteInfoManager.f47913a.m58109c());
        boolean zM86544a = objM56186h != null ? ((InterfaceC38354d) objM56186h).m86544a() : C38057a.f85671a.m85928a(strM96601m, true);
        ChanceSiteConfig chanceSiteConfig = ChanceSiteConfig.f41642a;
        boolean zM51041b = chanceSiteConfig.m51041b();
        boolean z11 = chanceSiteConfig.m51042c() && zM86544a;
        ArrayList<BaseFragment> arrayList = new ArrayList<>();
        if (zM51041b) {
            arrayList.add(new EmotionFragmentWrap());
        }
        if (z11) {
            arrayList.add(new TradeChanceFragment());
        }
        this.f41629V = arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (zM51041b) {
            arrayList2.add(getString(R$string.discover_emotion_tab_market));
        }
        if (z11) {
            arrayList2.add(getString(R$string.discover_emotion_tab_trade));
        }
        C4674j c4674jM51021n3 = m51021n3();
        if (c4674jM51021n3 != null && (slidingTabLayout4 = c4674jM51021n3.f4377b) != null) {
            slidingTabLayout4.setNeedBold(true);
        }
        C4674j c4674jM51021n4 = m51021n3();
        if (c4674jM51021n4 != null && (slidingTabLayout3 = c4674jM51021n4.f4377b) != null) {
            slidingTabLayout3.setUnderlineIgnorePadding(true);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        this.f41630W = new C27103z(childFragmentManager, this.f41629V, arrayList2);
        C4674j c4674jM51021n5 = m51021n3();
        if (c4674jM51021n5 != null && (rtlViewPager3 = c4674jM51021n5.f4378c) != null) {
            C27103z c27103z = this.f41630W;
            if (c27103z == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                c27103z = null;
            }
            rtlViewPager3.setAdapter(c27103z);
        }
        C4674j c4674jM51021n6 = m51021n3();
        if (c4674jM51021n6 != null && (slidingTabLayout2 = c4674jM51021n6.f4377b) != null) {
            C4674j c4674jM51021n7 = m51021n3();
            slidingTabLayout2.setViewPager(c4674jM51021n7 != null ? c4674jM51021n7.f4378c : null);
        }
        C4674j c4674jM51021n8 = m51021n3();
        if (c4674jM51021n8 != null && (rtlViewPager2 = c4674jM51021n8.f4378c) != null) {
            rtlViewPager2.setOffscreenPageLimit(this.f41629V.size());
        }
        m51019s3();
        C4674j c4674jM51021n9 = m51021n3();
        if (c4674jM51021n9 != null && (rtlViewPager = c4674jM51021n9.f4378c) != null) {
            rtlViewPager.addOnPageChangeListener(new C21847a());
        }
        C4674j c4674jM51021n10 = m51021n3();
        if (c4674jM51021n10 == null || (slidingTabLayout = c4674jM51021n10.f4377b) == null) {
            return;
        }
        slidingTabLayout.setOnTabSelectListener(new C21848b());
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m51018r3(ChanceFragment chanceFragment) {
        ArrayList<BaseFragment> arrayList = chanceFragment.f41629V;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ChanceRnContainer) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((ChanceRnContainer) it.next()).m51033s3();
        }
        ArrayList<BaseFragment> arrayList3 = chanceFragment.f41629V;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (obj2 instanceof EmotionFragmentWrap) {
                arrayList4.add(obj2);
            }
        }
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            ((EmotionFragmentWrap) it2.next()).m51038l3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    private final void m51019s3() {
        RtlViewPager rtlViewPager;
        String str;
        C4391b c4391b = C4391b.f3820a;
        if (Intrinsics.areEqual(c4391b.m4003a(), "trade") || ((str = this.f41631X) != null && str.length() > 0)) {
            C4674j c4674jM51021n3 = m51021n3();
            if (c4674jM51021n3 != null && (rtlViewPager = c4674jM51021n3.f4378c) != null) {
                rtlViewPager.setCurrentItem(RangesKt.coerceAtMost(1, this.f41629V.size() - 1));
            }
            c4391b.m4008f("");
        }
    }

    /* JADX INFO: renamed from: l3 */
    public final void m51020l3(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.chance.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChanceFragment.m51016m3(this.f41639b, z11);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: n3 */
    public final C4674j m51021n3() {
        return (C4674j) this.f41628U.getValue(this, f41627Z[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_chance, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m51017o3();
    }

    /* JADX INFO: renamed from: q3 */
    public final void m51023q3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.chance.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChanceFragment.m51018r3(this.f41641b);
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public static final Unit m51016m3(ChanceFragment chanceFragment, boolean z11) {
        RtlViewPager rtlViewPager;
        if (chanceFragment.getView() != null && !chanceFragment.isDetached()) {
            C4674j c4674jM51021n3 = chanceFragment.m51021n3();
            if (c4674jM51021n3 != null && (rtlViewPager = c4674jM51021n3.f4378c) != null) {
                rtlViewPager.setScroll(z11);
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onArguments(@Nullable Bundle bundle) {
        String string;
        super.onArguments(bundle);
        if (bundle != null) {
            string = bundle.getString("market", "");
        } else {
            string = null;
        }
        this.f41631X = string;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m51019s3();
        C43852m.m96595g("B5Markets", "TopNav", "4", null, 8, null);
    }
}
