package com.kubi.quotefacade.favorites.alpha;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewpager.widget.ViewPager;
import bv.C4684o;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.helper.C22218w1;
import com.kubi.resources.widget.AutoHeightViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FavAlphaFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u000bJ$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/alpha/FavAlphaFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentFavAlphaBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentFavAlphaBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "positionType", "", "getPositionType", "()Ljava/lang/String;", "positionType$delegate", "Lkotlin/Lazy;", "currentPageIndex", "", "getCurrentSubTabKeyForEdit", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFavAlphaFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavAlphaFragment.kt\ncom/kubi/quotefacade/favorites/alpha/FavAlphaFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,90:1\n147#2,16:91\n*S KotlinDebug\n*F\n+ 1 FavAlphaFragment.kt\ncom/kubi/quotefacade/favorites/alpha/FavAlphaFragment\n*L\n39#1:91,16\n*E\n"})
public final class FavAlphaFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f41774U = C45681e.m100799e(this, new Function1<FavAlphaFragment, C4684o>() { // from class: com.kubi.quotefacade.favorites.alpha.FavAlphaFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4684o invoke(@NotNull FavAlphaFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4684o.m4680a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4684o, Unit>() { // from class: com.kubi.quotefacade.favorites.alpha.FavAlphaFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4684o it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4684o c4684o) {
            invoke(c4684o);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f41775V = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.alpha.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FavAlphaFragment.m51540o3(this.f41782b);
        }
    });

    /* JADX INFO: renamed from: W */
    public int f41776W;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f41773Y = {Reflection.property1(new PropertyReference1Impl(FavAlphaFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentFavAlphaBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f41772X = new Companion(null);

    /* JADX INFO: compiled from: FavAlphaFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/alpha/FavAlphaFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/quotefacade/favorites/alpha/FavAlphaFragment;", "positionType", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFavAlphaFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavAlphaFragment.kt\ncom/kubi/quotefacade/favorites/alpha/FavAlphaFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final FavAlphaFragment newInstance(@Nullable String positionType) {
            FavAlphaFragment favAlphaFragment = new FavAlphaFragment();
            Bundle bundle = new Bundle();
            if (positionType != null) {
                bundle.putString("positionType", positionType);
            }
            favAlphaFragment.setArguments(bundle);
            return favAlphaFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.alpha.FavAlphaFragment$a */
    /* JADX INFO: compiled from: FavAlphaFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/favorites/alpha/FavAlphaFragment$onViewCreated$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21994a extends ViewPager.SimpleOnPageChangeListener {
        public C21994a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            FavAlphaFragment.this.f41776W = position;
        }
    }

    /* JADX INFO: renamed from: n3 */
    private final String m51539n3() {
        return (String) this.f41775V.getValue();
    }

    /* JADX INFO: renamed from: l3 */
    public final C4684o m51541l3() {
        return (C4684o) this.f41774U.getValue(this, f41773Y[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_fav_alpha, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        AutoHeightViewPager autoHeightViewPager;
        AutoHeightViewPager autoHeightViewPager2;
        AutoHeightViewPager autoHeightViewPager3;
        SlidingTabLayout slidingTabLayout;
        AutoHeightViewPager autoHeightViewPager4;
        SlidingTabLayout slidingTabLayout2;
        C4684o c4684oM51541l3;
        SlidingTabLayout slidingTabLayout3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(FavAlphaPremiumFragment.f41779o0.newInstance(m51539n3()));
        arrayList2.add(getString(R$string.market_alpha_premium));
        boolean zM52123c = C22218w1.m52123c(getArguments());
        if (!zM52123c && C24129b.m58030b(SiteVisibleConfigKey.Web3Wallet)) {
            arrayList.add(FavAlphaOnChainFragment.f41778o0.newInstance(m51539n3()));
            arrayList2.add(getString(R$string.market_alpha_onchain));
        }
        if (zM52123c && (c4684oM51541l3 = m51541l3()) != null && (slidingTabLayout3 = c4684oM51541l3.f4467b) != null) {
            C27046k.m66700o(slidingTabLayout3);
        }
        C4684o c4684oM51541l4 = m51541l3();
        if (c4684oM51541l4 != null && (slidingTabLayout2 = c4684oM51541l4.f4467b) != null) {
            slidingTabLayout2.setNeedBold(true);
        }
        C4684o c4684oM51541l5 = m51541l3();
        if (c4684oM51541l5 != null && (autoHeightViewPager4 = c4684oM51541l5.f4468c) != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            autoHeightViewPager4.setAdapter(new C27103z(childFragmentManager, arrayList, arrayList2));
        }
        C4684o c4684oM51541l6 = m51541l3();
        if (c4684oM51541l6 != null && (slidingTabLayout = c4684oM51541l6.f4467b) != null) {
            C4684o c4684oM51541l7 = m51541l3();
            slidingTabLayout.setViewPager(c4684oM51541l7 != null ? c4684oM51541l7.f4468c : null);
        }
        C4684o c4684oM51541l8 = m51541l3();
        if (c4684oM51541l8 != null && (autoHeightViewPager3 = c4684oM51541l8.f4468c) != null) {
            autoHeightViewPager3.setOffscreenPageLimit(arrayList.size());
        }
        C4684o c4684oM51541l9 = m51541l3();
        this.f41776W = (c4684oM51541l9 == null || (autoHeightViewPager2 = c4684oM51541l9.f4468c) == null) ? 0 : autoHeightViewPager2.getCurrentItem();
        C4684o c4684oM51541l10 = m51541l3();
        if (c4684oM51541l10 == null || (autoHeightViewPager = c4684oM51541l10.f4468c) == null) {
            return;
        }
        autoHeightViewPager.addOnPageChangeListener(new C21994a());
    }

    /* JADX INFO: renamed from: o3 */
    public static final String m51540o3(FavAlphaFragment favAlphaFragment) {
        Bundle arguments = favAlphaFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("positionType");
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m3 */
    public final String m51542m3() {
        AutoHeightViewPager autoHeightViewPager;
        int currentItem;
        C4684o c4684oM51541l3 = m51541l3();
        if (c4684oM51541l3 != null) {
            autoHeightViewPager = c4684oM51541l3.f4468c;
        } else {
            autoHeightViewPager = null;
        }
        if (autoHeightViewPager != null) {
            currentItem = autoHeightViewPager.getCurrentItem();
        } else {
            currentItem = this.f41776W;
        }
        if (currentItem == 1) {
            return "chain_area";
        }
        return "highlights";
    }
}
