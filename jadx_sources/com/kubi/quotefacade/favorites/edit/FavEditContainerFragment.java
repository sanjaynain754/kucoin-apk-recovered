package com.kubi.quotefacade.favorites.edit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import bv.C4688q;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.mvi.common.MviExKt;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.helper.QuoteConfigHelper;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27103z;
import com.tencent.qcloud.tuicore.TUIConstants;
import i10.Menu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p739ww.C45938b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: FavEditContainerFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020#H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000bj\b\u0012\u0004\u0012\u00020\u000f`\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/edit/FavEditContainerFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentFavoriteEditContainerFragmentBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentFavoriteEditContainerFragmentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fragmentList", "Ljava/util/ArrayList;", "Lcom/kubi/quotefacade/favorites/edit/FavEditChildFragment;", "Lkotlin/collections/ArrayList;", "selectedTabTitle", "", "getSelectedTabTitle", "()Ljava/lang/String;", "selectedTabTitle$delegate", "Lkotlin/Lazy;", "titleList", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "handleFavoriteDone", "initViewPager", "indexOf", "", "name", "getTabReportName", ViewProps.POSITION, "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFavEditContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavEditContainerFragment.kt\ncom/kubi/quotefacade/favorites/edit/FavEditContainerFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n147#2,16:182\n1869#3,2:198\n*S KotlinDebug\n*F\n+ 1 FavEditContainerFragment.kt\ncom/kubi/quotefacade/favorites/edit/FavEditContainerFragment\n*L\n42#1:182,16\n100#1:198,2\n*E\n"})
public final class FavEditContainerFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    @Nullable
    public ArrayList<FavEditChildFragment> f41802V;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f41800Z = {Reflection.property1(new PropertyReference1Impl(FavEditContainerFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentFavoriteEditContainerFragmentBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f41799Y = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f41801U = C45681e.m100799e(this, new Function1<FavEditContainerFragment, C4688q>() { // from class: com.kubi.quotefacade.favorites.edit.FavEditContainerFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4688q invoke(@NotNull FavEditContainerFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4688q.m4688a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4688q, Unit>() { // from class: com.kubi.quotefacade.favorites.edit.FavEditContainerFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4688q it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4688q c4688q) {
            invoke(c4688q);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f41803W = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.edit.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FavEditContainerFragment.m51624x3(this.f41821b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public ArrayList<String> f41804X = new ArrayList<>();

    /* JADX INFO: compiled from: FavEditContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/edit/FavEditContainerFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.edit.FavEditContainerFragment$a */
    /* JADX INFO: compiled from: FavEditContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/quotefacade/favorites/edit/FavEditContainerFragment$initViewPager$1$1", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22012a extends C45938b {
        public C22012a() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) throws JSONException {
            super.mo18273b(i11);
            String strValueOf = String.valueOf(i11 + 1);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", FavEditContainerFragment.this.m51627r3(i11));
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a("B5editFavorites", "Tab", strValueOf, jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s3 */
    public final void m51620s3() {
        ArrayList<FavEditChildFragment> arrayList = this.f41802V;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((FavEditChildFragment) it.next()).m51570y3();
            }
        }
    }

    /* JADX INFO: renamed from: u3 */
    private final void m51621u3() {
        RtlViewPager rtlViewPager;
        SlidingTabLayout slidingTabLayout;
        RtlViewPager rtlViewPager2;
        SlidingTabLayout slidingTabLayout2;
        RtlViewPager rtlViewPager3;
        SlidingTabLayout slidingTabLayout3;
        String strM51626q3;
        this.f41802V = new ArrayList<>();
        this.f41804X.clear();
        String strM51626q4 = m51626q3();
        int i11 = R$string.market_alpha_tab_all;
        if (Intrinsics.areEqual(strM51626q4, getString(i11)) || (strM51626q3 = m51626q3()) == null || StringsKt.isBlank(strM51626q3)) {
            QuoteConfigHelper quoteConfigHelper = QuoteConfigHelper.f41987a;
            if (quoteConfigHelper.m51929i() || quoteConfigHelper.m51927g() || quoteConfigHelper.m51926f()) {
                ArrayList<FavEditChildFragment> arrayList = this.f41802V;
                if (arrayList != null) {
                    arrayList.add(FavEditChildFragment.f41791Y.newInstance(0));
                }
                this.f41804X.add(getString(i11));
            }
        } else {
            QuoteConfigHelper quoteConfigHelper2 = QuoteConfigHelper.f41987a;
            if (quoteConfigHelper2.m51929i()) {
                ArrayList<FavEditChildFragment> arrayList2 = this.f41802V;
                if (arrayList2 != null) {
                    arrayList2.add(FavEditChildFragment.f41791Y.newInstance(1));
                }
                this.f41804X.add(getString(R$string.spot));
            }
            if (quoteConfigHelper2.m51927g()) {
                ArrayList<FavEditChildFragment> arrayList3 = this.f41802V;
                if (arrayList3 != null) {
                    arrayList3.add(FavEditChildFragment.f41791Y.newInstance(2));
                }
                this.f41804X.add(getString(R$string.futures));
            }
            if (quoteConfigHelper2.m51926f()) {
                ArrayList<FavEditChildFragment> arrayList4 = this.f41802V;
                if (arrayList4 != null) {
                    arrayList4.add(FavEditChildFragment.f41791Y.newInstance(3));
                }
                this.f41804X.add(getString(R$string.market_tab_etf));
            }
        }
        C4688q c4688qM51625p3 = m51625p3();
        if (c4688qM51625p3 != null && (slidingTabLayout3 = c4688qM51625p3.f4495b) != null) {
            slidingTabLayout3.setNeedBold(true);
        }
        ArrayList<FavEditChildFragment> arrayList5 = this.f41802V;
        if (arrayList5 != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            C27103z c27103z = new C27103z(childFragmentManager, arrayList5, this.f41804X);
            C4688q c4688qM51625p4 = m51625p3();
            if (c4688qM51625p4 != null && (rtlViewPager3 = c4688qM51625p4.f4496c) != null) {
                rtlViewPager3.setAdapter(c27103z);
            }
            C4688q c4688qM51625p5 = m51625p3();
            if (c4688qM51625p5 != null && (slidingTabLayout2 = c4688qM51625p5.f4495b) != null) {
                C4688q c4688qM51625p6 = m51625p3();
                slidingTabLayout2.setViewPager(c4688qM51625p6 != null ? c4688qM51625p6.f4496c : null);
            }
            C4688q c4688qM51625p7 = m51625p3();
            if (c4688qM51625p7 != null && (rtlViewPager2 = c4688qM51625p7.f4496c) != null) {
                rtlViewPager2.setOffscreenPageLimit(arrayList5.size());
            }
            C4688q c4688qM51625p8 = m51625p3();
            if (c4688qM51625p8 != null && (slidingTabLayout = c4688qM51625p8.f4495b) != null) {
                slidingTabLayout.setOnTabSelectListener(new C22012a());
            }
            C4688q c4688qM51625p9 = m51625p3();
            if (c4688qM51625p9 == null || (rtlViewPager = c4688qM51625p9.f4496c) == null) {
                return;
            }
            rtlViewPager.setCurrentItem(m51628t3(m51626q3()), false);
        }
    }

    /* JADX INFO: renamed from: w3 */
    public static final void m51623w3(FavEditContainerFragment favEditContainerFragment, View view) {
        MviExKt.m42519o(favEditContainerFragment, new FavEditContainerFragment$onViewCreated$2$1(favEditContainerFragment, null));
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_favorite_edit_container_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getTitleBar().setMenu(new Menu(R$id.quote_fav_edite_container_menu_done, null, null, 0, Integer.valueOf(R$string.complete_done), R$color.brandGreen, 14, new View.OnClickListener() { // from class: com.kubi.quotefacade.favorites.edit.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FavEditContainerFragment.m51622v3(this.f41819b, view2);
            }
        }, 0, 270, null));
        getTitleBar().setOnNavigationListener(new View.OnClickListener() { // from class: com.kubi.quotefacade.favorites.edit.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FavEditContainerFragment.m51623w3(this.f41820b, view2);
            }
        });
        m51621u3();
    }

    /* JADX INFO: renamed from: p3 */
    public final C4688q m51625p3() {
        return (C4688q) this.f41801U.getValue(this, f41800Z[0]);
    }

    /* JADX INFO: renamed from: q3 */
    public final String m51626q3() {
        return (String) this.f41803W.getValue();
    }

    /* JADX INFO: renamed from: r3 */
    public final String m51627r3(int i11) {
        if (i11 == 0) {
            return "Spots";
        }
        if (i11 != 1) {
            return i11 != 2 ? "" : "ETF";
        }
        return "Futures";
    }

    /* JADX INFO: renamed from: t3 */
    public final int m51628t3(String str) {
        return CollectionsKt.indexOf((List<? extends String>) this.f41804X, str);
    }

    /* JADX INFO: renamed from: v3 */
    public static final void m51622v3(FavEditContainerFragment favEditContainerFragment, View view) {
        favEditContainerFragment.m51620s3();
    }

    /* JADX INFO: renamed from: x3 */
    public static final String m51624x3(FavEditContainerFragment favEditContainerFragment) {
        Bundle arguments = favEditContainerFragment.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "favPageTabPosition");
        }
        return null;
    }
}
