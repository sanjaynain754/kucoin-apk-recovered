package com.kubi.search.searchresult;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.C11352b;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.R$layout;
import com.kubi.search.entity.SearchItemData;
import com.kubi.search.entity.SearchResultViewData;
import com.kubi.search.utils.SearchDurationHelper;
import com.kubi.search.utils.SearchExKt;
import com.kubi.search.utils.SearchTabTitle;
import com.kubi.search.utils.SearchTrack;
import com.kubi.utils.C27100x0;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27046k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p208dr.InterfaceC36952a;
import p569qq.C43841b;
import p739ww.C45938b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import q10.C43585e;
import ro.C44129c;
import w00.C45681e;

/* JADX INFO: compiled from: SearchResultFragment.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u00106\u001a\u000207H\u0014J\b\u0010>\u001a\u00020?H\u0014J\u0010\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020BH\u0014J\u0010\u0010C\u001a\u00020?2\u0006\u0010D\u001a\u00020EH\u0007J\u0010\u0010F\u001a\u00020?2\u0006\u0010D\u001a\u00020EH\u0002J\u0010\u0010G\u001a\u00020?2\u0006\u0010D\u001a\u00020EH\u0002J\u0010\u0010H\u001a\u00020?2\u0006\u0010I\u001a\u000207H\u0002J\b\u0010J\u001a\u00020?H\u0014J\u0010\u0010K\u001a\u00020?2\u0006\u0010L\u001a\u00020!H\u0002J\u000e\u0010M\u001a\u00020?2\u0006\u0010N\u001a\u00020!J\b\u0010O\u001a\u00020?H\u0016J\u0010\u0010P\u001a\u00020?2\u0006\u0010Q\u001a\u000207H\u0002J\b\u0010R\u001a\u00020!H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0014\u0010\bR\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020)0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020,X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\b\u0012\u0004\u0012\u000203028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001d\u00108\u001a\u0004\u0018\u0001098@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010;¨\u0006S"}, m90084d2 = {"Lcom/kubi/search/searchresult/SearchResultFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/search/searchresult/SearchIS$UIState;", "<init>", "()V", "allFragment", "Lcom/kubi/search/searchresult/SearchResultDataFragment;", "getAllFragment", "()Lcom/kubi/search/searchresult/SearchResultDataFragment;", "allFragment$delegate", "Lkotlin/Lazy;", "spotFragment", "getSpotFragment", "spotFragment$delegate", "alphaFragment", "Lcom/kubi/search/searchresult/SearchResultAlphaFragment;", "getAlphaFragment", "()Lcom/kubi/search/searchresult/SearchResultAlphaFragment;", "alphaFragment$delegate", "futureFragment", "getFutureFragment", "futureFragment$delegate", "earnFragment", "Lcom/kubi/search/searchresult/SearchResultEarnsFragment;", "getEarnFragment", "()Lcom/kubi/search/searchresult/SearchResultEarnsFragment;", "earnFragment$delegate", "web3Fragment", "Lcom/kubi/search/searchresult/SearchResultWeb3Fragment;", "getWeb3Fragment", "()Lcom/kubi/search/searchresult/SearchResultWeb3Fragment;", "web3Fragment$delegate", "currentSearchKey", "", "getCurrentSearchKey$annotations", "getCurrentSearchKey", "()Ljava/lang/String;", "setCurrentSearchKey", "(Ljava/lang/String;)V", "tabMap", "", "Landroidx/fragment/app/Fragment;", "lastSelectedTab", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/search/searchresult/SearchResultVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/search/databinding/SearchFragmentResultBinding;", "getBinding$SearchLib_googleRelease", "()Lcom/kubi/search/databinding/SearchFragmentResultBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initView", "", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "refreshResult", "viewData", "Lcom/kubi/search/entity/SearchResultViewData;", "refreshTradePair", "refreshTabs", "applyLastTabIndex", ViewProps.POSITION, "bindFlowEvent", "jumpMore", "category", "onTextChanged", "key", "onAgainShow", "showLayoutState", "status", "getLastSelectedTab", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchResultFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultFragment.kt\ncom/kubi/search/searchresult/SearchResultFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,365:1\n147#2,16:366\n93#3,4:382\n76#4,7:386\n76#4,7:393\n76#4,7:400\n76#4,7:407\n1869#5,2:414\n1869#5,2:416\n*S KotlinDebug\n*F\n+ 1 SearchResultFragment.kt\ncom/kubi/search/searchresult/SearchResultFragment\n*L\n80#1:366,16\n97#1:382,4\n211#1:386,7\n224#1:393,7\n233#1:400,7\n242#1:407,7\n187#1:414,2\n189#1:416,2\n*E\n"})
public final class SearchResultFragment extends SimpleStateFragment<SearchIS$UIState> {

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ KProperty<Object>[] f49009f0 = {Reflection.property1(new PropertyReference1Impl(SearchResultFragment.class, "binding", "getBinding$SearchLib_googleRelease()Lcom/kubi/search/databinding/SearchFragmentResultBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public String f49018c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f49019d0;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f49010U = LazyKt.lazy(new Function0() { // from class: com.kubi.search.searchresult.y
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchResultFragment.m59392H3();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f49011V = LazyKt.lazy(new Function0() { // from class: com.kubi.search.searchresult.c0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchResultFragment.m59403h4();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f49012W = LazyKt.lazy(new Function0() { // from class: com.kubi.search.searchresult.d0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchResultFragment.m59393I3();
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f49013X = LazyKt.lazy(new Function0() { // from class: com.kubi.search.searchresult.e0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchResultFragment.m59396M3();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f49014Y = LazyKt.lazy(new Function0() { // from class: com.kubi.search.searchresult.f0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchResultFragment.m59395L3();
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f49015Z = LazyKt.lazy(new Function0() { // from class: com.kubi.search.searchresult.g0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchResultFragment.m59404i4();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public String f49016a0 = "";

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Map<String, Fragment> f49017b0 = new LinkedHashMap();

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final InterfaceC24293a f49020e0 = C45681e.m100799e(this, new Function1<SearchResultFragment, C43585e>() { // from class: com.kubi.search.searchresult.SearchResultFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C43585e invoke(@NotNull SearchResultFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C43585e.m95920a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C43585e, Unit>() { // from class: com.kubi.search.searchresult.SearchResultFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C43585e it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C43585e c43585e) {
            invoke(c43585e);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: com.kubi.search.searchresult.SearchResultFragment$a */
    /* JADX INFO: compiled from: SearchResultFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24436a implements Function0<Unit> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SearchItemData f49022c;

        public C24436a(SearchItemData searchItemData) {
            this.f49022c = searchItemData;
        }

        /* JADX INFO: renamed from: a */
        public final void m59434a() {
            if (SearchResultFragment.this.getView() == null || SearchResultFragment.this.isDetached() || SearchResultFragment.this.isRemoving()) {
                return;
            }
            if (this.f49022c.getIsSpot()) {
                SearchResultFragment.this.m59427U3().m59368p3(this.f49022c);
            } else if (this.f49022c.getIsFuture()) {
                SearchResultFragment.this.m59425S3().m59368p3(this.f49022c);
            }
            SearchResultFragment.this.m59420N3().m59368p3(this.f49022c);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m59434a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.search.searchresult.SearchResultFragment$b */
    /* JADX INFO: compiled from: SearchResultFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24437b implements Function0<Unit> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SearchItemData f49024c;

        public C24437b(SearchItemData searchItemData) {
            this.f49024c = searchItemData;
        }

        /* JADX INFO: renamed from: a */
        public final void m59435a() {
            if (SearchResultFragment.this.getView() == null || SearchResultFragment.this.isDetached() || SearchResultFragment.this.isRemoving()) {
                return;
            }
            SearchResultFragment.this.m59428V3().m59465m3(this.f49024c);
            SearchResultFragment.this.m59420N3().m59368p3(this.f49024c);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m59435a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.search.searchresult.SearchResultFragment$c */
    /* JADX INFO: compiled from: SearchResultFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24442c implements Function0<Unit> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SearchItemData f49026c;

        public C24442c(SearchItemData searchItemData) {
            this.f49026c = searchItemData;
        }

        /* JADX INFO: renamed from: a */
        public final void m59436a() {
            if (SearchResultFragment.this.getView() == null || SearchResultFragment.this.isDetached() || SearchResultFragment.this.isRemoving()) {
                return;
            }
            SearchResultFragment.this.m59421O3().m59356p3(this.f49026c);
            SearchResultFragment.this.m59420N3().m59368p3(this.f49026c);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m59436a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.search.searchresult.SearchResultFragment$d */
    /* JADX INFO: compiled from: SearchResultFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/search/searchresult/SearchResultFragment$initView$1", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C24443d extends C45938b {
        public C24443d() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) throws JSONException {
            SearchResultFragment.this.m59419J3(i11);
            SearchTrack searchTrack = SearchTrack.f49158a;
            searchTrack.m59606b(SearchResultFragment.this.getF49016a0());
            searchTrack.m59610f(SearchResultFragment.this.m59426T3());
        }
    }

    /* JADX INFO: renamed from: H3 */
    public static final SearchResultDataFragment m59392H3() {
        return new SearchResultDataFragment();
    }

    /* JADX INFO: renamed from: I3 */
    public static final SearchResultAlphaFragment m59393I3() {
        return new SearchResultAlphaFragment();
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m59394K3(SearchResultFragment searchResultFragment, int i11) {
        String str;
        Fragment fragment = (Fragment) CollectionsKt.elementAtOrNull(searchResultFragment.f49017b0.values(), i11);
        if (Intrinsics.areEqual(fragment, searchResultFragment.m59427U3())) {
            str = SearchCategory$Companion.SPOT;
        } else if (Intrinsics.areEqual(fragment, searchResultFragment.m59425S3())) {
            str = SearchCategory$Companion.FUTURES;
        } else if (Intrinsics.areEqual(fragment, searchResultFragment.m59424R3())) {
            str = SearchCategory$Companion.EARN;
        } else if (Intrinsics.areEqual(fragment, searchResultFragment.m59428V3())) {
            str = SearchCategory$Companion.WEB3;
        } else {
            str = Intrinsics.areEqual(fragment, searchResultFragment.m59421O3()) ? "alpha" : null;
        }
        searchResultFragment.f49018c0 = str;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final SearchResultEarnsFragment m59395L3() {
        return new SearchResultEarnsFragment();
    }

    /* JADX INFO: renamed from: M3 */
    public static final SearchResultDataFragment m59396M3() {
        return new SearchResultDataFragment();
    }

    /* JADX INFO: renamed from: h4 */
    public static final SearchResultDataFragment m59403h4() {
        return new SearchResultDataFragment();
    }

    /* JADX INFO: renamed from: i4 */
    public static final SearchResultWeb3Fragment m59404i4() {
        return new SearchResultWeb3Fragment();
    }

    /* JADX INFO: renamed from: J3 */
    public final void m59419J3(final int i11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchresult.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultFragment.m59394K3(this.f49068b, i11);
            }
        });
    }

    /* JADX INFO: renamed from: N3 */
    public final SearchResultDataFragment m59420N3() {
        return (SearchResultDataFragment) this.f49010U.getValue();
    }

    /* JADX INFO: renamed from: O3 */
    public final SearchResultAlphaFragment m59421O3() {
        return (SearchResultAlphaFragment) this.f49012W.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: P3 */
    public final C43585e m59422P3() {
        return (C43585e) this.f49020e0.getValue(this, f49009f0[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: Q3, reason: from getter */
    public final String getF49016a0() {
        return this.f49016a0;
    }

    /* JADX INFO: renamed from: R3 */
    public final SearchResultEarnsFragment m59424R3() {
        return (SearchResultEarnsFragment) this.f49014Y.getValue();
    }

    /* JADX INFO: renamed from: S3 */
    public final SearchResultDataFragment m59425S3() {
        return (SearchResultDataFragment) this.f49013X.getValue();
    }

    /* JADX INFO: renamed from: T3 */
    public final String m59426T3() {
        String str = this.f49018c0;
        if (str == null) {
            return TtmlNode.COMBINE_ALL;
        }
        switch (str.hashCode()) {
            case -503567600:
                return !str.equals(SearchCategory$Companion.FUTURES) ? TtmlNode.COMBINE_ALL : SearchCategory$Companion.FUTURES;
            case 3105752:
                return !str.equals(SearchCategory$Companion.EARN) ? TtmlNode.COMBINE_ALL : SearchCategory$Companion.EARN;
            case 3537154:
                return !str.equals(SearchCategory$Companion.SPOT) ? TtmlNode.COMBINE_ALL : SearchCategory$Companion.SPOT;
            case 3645279:
                return !str.equals(SearchCategory$Companion.WEB3) ? TtmlNode.COMBINE_ALL : SearchCategory$Companion.WEB3;
            case 92909918:
                return !str.equals("alpha") ? TtmlNode.COMBINE_ALL : "alpha";
            default:
                return TtmlNode.COMBINE_ALL;
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final SearchResultDataFragment m59427U3() {
        return (SearchResultDataFragment) this.f49011V.getValue();
    }

    /* JADX INFO: renamed from: V3 */
    public final SearchResultWeb3Fragment m59428V3() {
        return (SearchResultWeb3Fragment) this.f49015Z.getValue();
    }

    /* JADX INFO: renamed from: W3 */
    public final void m59429W3(final String str) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchresult.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultFragment.m59397X3(str, this);
            }
        });
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a4 */
    public final void m59430a4(@NotNull SearchResultViewData viewData) throws JSONException {
        Intrinsics.checkNotNullParameter(viewData, "viewData");
        SearchDurationHelper searchDurationHelper = SearchDurationHelper.f49161a;
        searchDurationHelper.m59624j(viewData.getSearchKey(), "notify_to_ui");
        if (this.f49016a0.length() != 0 && Intrinsics.areEqual(viewData.getSearchKey(), this.f49016a0)) {
            if (viewData.hasData()) {
                m59432d4(viewData);
                m59431b4(viewData);
                if (!viewData.getSpotDataList().isEmpty()) {
                    C44129c.m97272b("platform::search", "搜索-现货 Tab1-现货有数据", "数据条数" + viewData.getSpotDataList().size(), null, 8, null);
                }
                if (!viewData.getFuturesDataList().isEmpty()) {
                    C44129c.m97272b("platform::search", "搜索-合约 Tab1-合约有数据", "数据条数" + viewData.getFuturesDataList().size(), null, 8, null);
                }
                m59433f4(1);
                C44129c.m97272b("platform::search", "搜索-All Tab-有搜索结果", "现货个数:" + viewData.getSpotDataList().size() + ",合约个数:" + viewData.getFuturesDataList().size() + ",理财个数:" + viewData.getEarnDataList().size(), null, 8, null);
            } else {
                m59433f4(2);
                SearchTrack.f49158a.m59609e(m59426T3(), this.f49016a0);
                C44129c.m97272b("platform::search", "搜索-All Tab-无搜索结果，展示空白页", null, null, 12, null);
            }
            searchDurationHelper.m59624j(this.f49016a0, "data_load_finish");
            C43841b.m96557d("event_click_search_load", "page_load_end", null, 4, null);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final void m59431b4(final SearchResultViewData searchResultViewData) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchresult.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultFragment.m59400c4(this.f49132b, searchResultViewData);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "search_event_result_fav_change".length();
        }
        C12572a.m23692a(this, false, new C24438x8e0b43e0("search_event_result_fav_change", null, this));
        if (c12573b.m23696a()) {
            "search_event_result_chain_fav_change".length();
        }
        C12572a.m23692a(this, false, new C24439x8e0b43e1("search_event_result_chain_fav_change", null, this));
        if (c12573b.m23696a()) {
            "search_event_result_alpha_fav_change".length();
        }
        C12572a.m23692a(this, false, new C24440x8e0b43e2("search_event_result_alpha_fav_change", null, this));
        if (c12573b.m23696a()) {
            "search_event_view_more_tab".length();
        }
        C12572a.m23692a(this, false, new C24441x8e0b43e3("search_event_view_more_tab", null, this));
    }

    /* JADX INFO: renamed from: d4 */
    public final void m59432d4(final SearchResultViewData searchResultViewData) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchresult.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultFragment.m59401e4(this.f49073b, searchResultViewData);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) throws JSONException {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C24445a) {
            m59430a4(((C24445a) singleEvent).getF49044a());
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m59433f4(final int i11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchresult.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultFragment.m59402g4(this.f49045b, i11);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.search_fragment_result;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF49019d0() {
        return this.f49019d0;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<SearchResultVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(SearchResultVM.class);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchresult.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultFragment.m59398Y3(this.f49084b);
            }
        });
    }

    public final void onTextChanged(@NotNull final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchresult.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultFragment.m59399Z3(key, this);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f49019d0 = z11;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m59397X3(String str, SearchResultFragment searchResultFragment) throws JSONException {
        String str2;
        SlidingTabLayout slidingTabLayout;
        View viewM55288r;
        SlidingTabLayout slidingTabLayout2;
        View viewM55288r2;
        SlidingTabLayout slidingTabLayout3;
        View viewM55288r3;
        SlidingTabLayout slidingTabLayout4;
        View viewM55288r4;
        SlidingTabLayout slidingTabLayout5;
        View viewM55288r5;
        switch (str.hashCode()) {
            case -503567600:
                str2 = str;
                if (str2.equals(SearchCategory$Companion.FUTURES)) {
                    int iCoerceAtLeast = RangesKt.coerceAtLeast(CollectionsKt.indexOf(searchResultFragment.f49017b0.values(), searchResultFragment.m59425S3()), 0);
                    C43585e c43585eM59422P3 = searchResultFragment.m59422P3();
                    if (c43585eM59422P3 != null && (slidingTabLayout = c43585eM59422P3.f96204f) != null && (viewM55288r = slidingTabLayout.m55288r(iCoerceAtLeast)) != null) {
                        viewM55288r.performClick();
                    }
                    C44129c.m97272b("platform::search", "搜索-All Tab-跳转到合约", str2, null, 8, null);
                }
                break;
            case 3105752:
                str2 = str;
                if (str2.equals(SearchCategory$Companion.EARN)) {
                    int iCoerceAtLeast2 = RangesKt.coerceAtLeast(CollectionsKt.indexOf(searchResultFragment.f49017b0.values(), searchResultFragment.m59424R3()), 0);
                    C43585e c43585eM59422P4 = searchResultFragment.m59422P3();
                    if (c43585eM59422P4 != null && (slidingTabLayout2 = c43585eM59422P4.f96204f) != null && (viewM55288r2 = slidingTabLayout2.m55288r(iCoerceAtLeast2)) != null) {
                        viewM55288r2.performClick();
                    }
                    C44129c.m97272b("platform::search", "搜索-All Tab-跳转到理财", str2, null, 8, null);
                }
                break;
            case 3537154:
                str2 = str;
                if (str2.equals(SearchCategory$Companion.SPOT)) {
                    int iCoerceAtLeast3 = RangesKt.coerceAtLeast(CollectionsKt.indexOf(searchResultFragment.f49017b0.values(), searchResultFragment.m59427U3()), 0);
                    C43585e c43585eM59422P5 = searchResultFragment.m59422P3();
                    if (c43585eM59422P5 != null && (slidingTabLayout3 = c43585eM59422P5.f96204f) != null && (viewM55288r3 = slidingTabLayout3.m55288r(iCoerceAtLeast3)) != null) {
                        viewM55288r3.performClick();
                    }
                    C44129c.m97272b("platform::search", "搜索-All Tab-跳转到现货", str2, null, 8, null);
                }
                break;
            case 3645279:
                str2 = str;
                if (str2.equals(SearchCategory$Companion.WEB3)) {
                    int iCoerceAtLeast4 = RangesKt.coerceAtLeast(CollectionsKt.indexOf(searchResultFragment.f49017b0.values(), searchResultFragment.m59428V3()), 0);
                    C43585e c43585eM59422P6 = searchResultFragment.m59422P3();
                    if (c43585eM59422P6 != null && (slidingTabLayout4 = c43585eM59422P6.f96204f) != null && (viewM55288r4 = slidingTabLayout4.m55288r(iCoerceAtLeast4)) != null) {
                        viewM55288r4.performClick();
                    }
                    C44129c.m97272b("platform::search", "搜索-All Tab-跳转到Web3", str2, null, 8, null);
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    int iCoerceAtLeast5 = RangesKt.coerceAtLeast(CollectionsKt.indexOf(searchResultFragment.f49017b0.values(), searchResultFragment.m59421O3()), 0);
                    C43585e c43585eM59422P7 = searchResultFragment.m59422P3();
                    if (c43585eM59422P7 != null && (slidingTabLayout5 = c43585eM59422P7.f96204f) != null && (viewM55288r5 = slidingTabLayout5.m55288r(iCoerceAtLeast5)) != null) {
                        viewM55288r5.performClick();
                    }
                    C44129c.m97272b("platform::search", "搜索-All Tab-跳转到Alpha", str, null, 8, null);
                    str2 = str;
                    break;
                }
            default:
                str2 = str;
                break;
        }
        SearchTrack searchTrack = SearchTrack.f49158a;
        searchTrack.m59606b(searchResultFragment.f49016a0);
        searchTrack.m59608d(str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m59398Y3(SearchResultFragment searchResultFragment) {
        LinearLayoutCompat linearLayoutCompat;
        C43585e c43585eM59422P3 = searchResultFragment.m59422P3();
        if (c43585eM59422P3 != null && (linearLayoutCompat = c43585eM59422P3.f96201c) != null && C27046k.m66704s(linearLayoutCompat)) {
            SearchExKt.m59510D(LifecycleOwnerKt.getLifecycleScope(searchResultFragment), new SearchResultFragment$onAgainShow$1$1(searchResultFragment, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m59399Z3(String str, SearchResultFragment searchResultFragment) throws JSONException {
        if (str.length() == 0 && searchResultFragment.f49016a0.length() > 0) {
            searchResultFragment.m59433f4(-1);
            searchResultFragment.sendIntent(SearchIS$UIIntent$EmptyInput.INSTANCE);
        }
        searchResultFragment.f49016a0 = str;
        if (str.length() == 0) {
            return Unit.INSTANCE;
        }
        searchResultFragment.m59433f4(0);
        SearchDurationHelper.f49161a.m59624j(str, "start");
        C43841b.m96557d("event_click_search_load", "click_start_btn", null, 4, null);
        searchResultFragment.sendIntent(new Search(str));
        SearchTrack.f49158a.m59605a(str);
        C44129c.m97272b("platform::search", "搜索校验2.4-提交搜索请求", str, null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX INFO: renamed from: c4 */
    public static final Unit m59400c4(SearchResultFragment searchResultFragment, SearchResultViewData searchResultViewData) {
        int size;
        if (searchResultFragment.getView() != null && !searchResultFragment.isDetached() && !searchResultFragment.isRemoving()) {
            C43585e c43585eM59422P3 = searchResultFragment.m59422P3();
            if (c43585eM59422P3 == null) {
                return Unit.INSTANCE;
            }
            List<SearchItemData> spotDataList = searchResultViewData.getSpotDataList();
            List<SearchItemData> futuresDataList = searchResultViewData.getFuturesDataList();
            List<SearchItemData> earnDataList = searchResultViewData.getEarnDataList();
            List<SearchItemData> web3DataList = searchResultViewData.getWeb3DataList();
            List<SearchItemData> alphaDataList = searchResultViewData.getAlphaDataList();
            searchResultFragment.f49017b0.clear();
            Map<String, Fragment> map = searchResultFragment.f49017b0;
            SearchTabTitle searchTabTitle = SearchTabTitle.f49156a;
            map.put(searchTabTitle.m59598a(), searchResultFragment.m59420N3());
            if (!spotDataList.isEmpty()) {
                searchResultFragment.f49017b0.put(searchTabTitle.m59602h(Integer.valueOf(spotDataList.size())), searchResultFragment.m59427U3());
                if (Intrinsics.areEqual(searchResultFragment.f49018c0, SearchCategory$Companion.SPOT)) {
                    size = searchResultFragment.f49017b0.size() - 1;
                } else {
                    size = 0;
                }
            } else {
                size = 0;
            }
            if (!alphaDataList.isEmpty()) {
                searchResultFragment.f49017b0.put(searchTabTitle.m59599b(Integer.valueOf(alphaDataList.size())), searchResultFragment.m59421O3());
                if (Intrinsics.areEqual(searchResultFragment.f49018c0, "alpha")) {
                    size = searchResultFragment.f49017b0.size() - 1;
                }
            }
            if (!futuresDataList.isEmpty()) {
                searchResultFragment.f49017b0.put(searchTabTitle.m59601f(Integer.valueOf(futuresDataList.size())), searchResultFragment.m59425S3());
                if (Intrinsics.areEqual(searchResultFragment.f49018c0, SearchCategory$Companion.FUTURES)) {
                    size = searchResultFragment.f49017b0.size() - 1;
                }
            }
            if (!earnDataList.isEmpty()) {
                searchResultFragment.f49017b0.put(searchTabTitle.m59600d(Integer.valueOf(earnDataList.size())), searchResultFragment.m59424R3());
                if (Intrinsics.areEqual(searchResultFragment.f49018c0, SearchCategory$Companion.EARN)) {
                    size = searchResultFragment.f49017b0.size() - 1;
                }
            }
            if (!web3DataList.isEmpty()) {
                searchResultFragment.f49017b0.put(searchTabTitle.m59604k(Integer.valueOf(web3DataList.size())), searchResultFragment.m59428V3());
                if (Intrinsics.areEqual(searchResultFragment.f49018c0, SearchCategory$Companion.WEB3)) {
                    size = searchResultFragment.f49017b0.size() - 1;
                }
            }
            if (size == 0) {
                searchResultFragment.f49018c0 = null;
            }
            RtlViewPager rtlViewPager = c43585eM59422P3.f96203e;
            FragmentManager childFragmentManager = searchResultFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = searchResultFragment.f49017b0.values().iterator();
            while (it.hasNext()) {
                arrayList.add((Fragment) it.next());
            }
            Unit unit = Unit.INSTANCE;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = searchResultFragment.f49017b0.keySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) it2.next());
            }
            Unit unit2 = Unit.INSTANCE;
            rtlViewPager.setAdapter(new C27103z(childFragmentManager, arrayList, arrayList2));
            c43585eM59422P3.f96204f.setViewPager(c43585eM59422P3.f96203e);
            c43585eM59422P3.f96204f.setCurrentTab(size);
            c43585eM59422P3.f96204f.m55291w();
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m59401e4(SearchResultFragment searchResultFragment, SearchResultViewData searchResultViewData) {
        searchResultFragment.m59420N3().m59369r3(searchResultViewData.convertAll(), searchResultViewData.getSearchKey(), TtmlNode.COMBINE_ALL);
        searchResultFragment.m59427U3().m59369r3(searchResultViewData.getSpotDataList(), searchResultViewData.getSearchKey(), SearchCategory$Companion.SPOT);
        searchResultFragment.m59421O3().m59357r3(searchResultViewData.getAlphaDataList(), searchResultViewData.getSearchKey());
        searchResultFragment.m59425S3().m59369r3(searchResultViewData.getFuturesDataList(), searchResultViewData.getSearchKey(), SearchCategory$Companion.FUTURES);
        searchResultFragment.m59424R3().m59382l3(searchResultViewData.getEarnDataList(), searchResultViewData.getSearchKey());
        searchResultFragment.m59428V3().m59466o3(searchResultViewData.getWeb3DataList(), searchResultViewData.getSearchKey());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m59402g4(SearchResultFragment searchResultFragment, int i11) {
        C43585e c43585eM59422P3 = searchResultFragment.m59422P3();
        if (c43585eM59422P3 == null) {
            return Unit.INSTANCE;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    LinearLayoutCompat layoutContent = c43585eM59422P3.f96201c;
                    Intrinsics.checkNotNullExpressionValue(layoutContent, "layoutContent");
                    C27046k.m66700o(layoutContent);
                    LinearLayout root = c43585eM59422P3.f96200b.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                    C27046k.m66700o(root);
                    LinearLayout root2 = c43585eM59422P3.f96202d.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
                    C27046k.m66700o(root2);
                } else {
                    LinearLayoutCompat layoutContent2 = c43585eM59422P3.f96201c;
                    Intrinsics.checkNotNullExpressionValue(layoutContent2, "layoutContent");
                    C27046k.m66700o(layoutContent2);
                    LinearLayout root3 = c43585eM59422P3.f96200b.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
                    C27046k.m66685H(root3);
                    LinearLayout root4 = c43585eM59422P3.f96202d.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root4, "getRoot(...)");
                    C27046k.m66700o(root4);
                }
            } else {
                LinearLayoutCompat layoutContent3 = c43585eM59422P3.f96201c;
                Intrinsics.checkNotNullExpressionValue(layoutContent3, "layoutContent");
                C27046k.m66685H(layoutContent3);
                LinearLayout root5 = c43585eM59422P3.f96200b.getRoot();
                Intrinsics.checkNotNullExpressionValue(root5, "getRoot(...)");
                C27046k.m66700o(root5);
                LinearLayout root6 = c43585eM59422P3.f96202d.getRoot();
                Intrinsics.checkNotNullExpressionValue(root6, "getRoot(...)");
                C27046k.m66700o(root6);
            }
        } else {
            LinearLayoutCompat layoutContent4 = c43585eM59422P3.f96201c;
            Intrinsics.checkNotNullExpressionValue(layoutContent4, "layoutContent");
            C27046k.m66700o(layoutContent4);
            LinearLayout root7 = c43585eM59422P3.f96200b.getRoot();
            Intrinsics.checkNotNullExpressionValue(root7, "getRoot(...)");
            C27046k.m66700o(root7);
            LinearLayout root8 = c43585eM59422P3.f96202d.getRoot();
            Intrinsics.checkNotNullExpressionValue(root8, "getRoot(...)");
            C27046k.m66685H(root8);
            C11352b.m20197a(c43585eM59422P3.f96202d.f96214b);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        SlidingTabLayout slidingTabLayout;
        SlidingTabLayout slidingTabLayout2;
        super.initView();
        C43585e c43585eM59422P3 = m59422P3();
        if (c43585eM59422P3 != null && (slidingTabLayout2 = c43585eM59422P3.f96204f) != null) {
            slidingTabLayout2.setNeedBold(true);
        }
        C43585e c43585eM59422P4 = m59422P3();
        if (c43585eM59422P4 != null && (slidingTabLayout = c43585eM59422P4.f96204f) != null) {
            slidingTabLayout.setOnTabSelectListener(new C24443d());
        }
        m59433f4(-1);
    }
}
