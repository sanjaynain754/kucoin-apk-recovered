package com.kubi.assets.search.depositandwithdraw;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentManager;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.SimpleTextWatcher;
import com.kubi.assets.UrlConstant;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.view.HideIMEUtil;
import com.kubi.otc.api.IOtcService;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24271s1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import java.util.ArrayList;
import lb.C42148c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p637ta.C44741c4;
import p637ta.C44766f5;
import p739ww.C45938b;
import p830zf.InterfaceC46799g0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
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
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: SearchCoinFiatFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u0011H\u0002J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0018\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0011H\u0002J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0011H\u0002J\n\u0010+\u001a\u0004\u0018\u00010\u0001H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFiatFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/KucoinActivitySearchCoinFiatBinding;", "getBinding", "()Lcom/kubi/assets/databinding/KucoinActivitySearchCoinFiatBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "tabMark", "", "getTabMark", "()Ljava/lang/String;", "tabMark$delegate", "Lkotlin/Lazy;", "from", "", "getFrom", "()I", "from$delegate", "coinFragment", "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFragment;", "getCoinFragment", "()Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFragment;", "coinFragment$delegate", "getLayout", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initListener", "url", "type", "subFragmentExpose", ViewProps.POSITION, "getFiatFragment", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchCoinFiatFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCoinFiatFragment.kt\ncom/kubi/assets/search/depositandwithdraw/SearchCoinFiatFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n147#2,16:239\n25#3,3:255\n1#4:258\n*S KotlinDebug\n*F\n+ 1 SearchCoinFiatFragment.kt\ncom/kubi/assets/search/depositandwithdraw/SearchCoinFiatFragment\n*L\n57#1:239,16\n116#1:255,3\n*E\n"})
public final class SearchCoinFiatFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f18573U = C45681e.m100799e(this, new Function1<SearchCoinFiatFragment, C44741c4>() { // from class: com.kubi.assets.search.depositandwithdraw.SearchCoinFiatFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44741c4 invoke(@NotNull SearchCoinFiatFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44741c4.m98994a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44741c4, Unit>() { // from class: com.kubi.assets.search.depositandwithdraw.SearchCoinFiatFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44741c4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44741c4 c44741c4) {
            invoke(c44741c4);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f18574V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.depositandwithdraw.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinFiatFragment.m18920C3(this.f18610b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f18575W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.depositandwithdraw.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(SearchCoinFiatFragment.m18929r3(this.f18612b));
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f18576X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.search.depositandwithdraw.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SearchCoinFiatFragment.m18928q3(this.f18614b);
        }
    });

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f18572Z = {Reflection.property1(new PropertyReference1Impl(SearchCoinFiatFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/KucoinActivitySearchCoinFiatBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f18571Y = new Companion(null);

    /* JADX INFO: compiled from: SearchCoinFiatFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFiatFragment$Companion;", "", "<init>", "()V", "FROM_INCLUDE_PAGE", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.SearchCoinFiatFragment$a */
    /* JADX INFO: compiled from: SearchCoinFiatFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/assets/search/depositandwithdraw/SearchCoinFiatFragment$initListener$7$1", "Lcom/kubi/assets/SimpleTextWatcher;", "onTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "start", "", TtmlNode.ANNOTATION_POSITION_BEFORE, "count", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSearchCoinFiatFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCoinFiatFragment.kt\ncom/kubi/assets/search/depositandwithdraw/SearchCoinFiatFragment$initListener$7$1\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,238:1\n106#2:239\n78#2,22:240\n*S KotlinDebug\n*F\n+ 1 SearchCoinFiatFragment.kt\ncom/kubi/assets/search/depositandwithdraw/SearchCoinFiatFragment$initListener$7$1\n*L\n168#1:239\n168#1:240,22\n*E\n"})
    public static final class C10838a extends SimpleTextWatcher {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SearchCoinFragment f18577b;

        public C10838a(SearchCoinFragment searchCoinFragment) {
            this.f18577b = searchCoinFragment;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int start, int before, int count) {
            Unit unit;
            int i11;
            boolean z11;
            String strValueOf = String.valueOf(s11);
            int length = strValueOf.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (Intrinsics.compare((int) strValueOf.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            String string = strValueOf.subSequence(i12, length + 1).toString();
            SearchCoinFragment searchCoinFragment = this.f18577b;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (searchCoinFragment != null) {
                    searchCoinFragment.m18999u4(string);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                Result.m103844constructorimpl(unit);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.search.depositandwithdraw.SearchCoinFiatFragment$b */
    /* JADX INFO: compiled from: SearchCoinFiatFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/assets/search/depositandwithdraw/SearchCoinFiatFragment$initListener$7$2", "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;", "onTabSelect", "", ViewProps.POSITION, "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10839b extends C45938b {
        public C10839b() {
        }

        @Override // p739ww.C45938b
        /* JADX INFO: renamed from: b */
        public void mo18273b(int i11) throws JSONException {
            SearchCoinFiatFragment.this.m18932B3(i11);
        }
    }

    /* JADX INFO: renamed from: x3 */
    public final void m18938x3(final String str, final int i11) throws JSONException {
        C44766f5 c44766f5;
        FrameLayout frameLayout;
        SearchCoinFragment searchCoinFragmentM18934t3;
        RtlViewPager rtlViewPager;
        C44766f5 c44766f6;
        FrameLayout frameLayout2;
        C44766f5 c44766f7;
        FrameLayout frameLayout3;
        SlidingTabLayout slidingTabLayout;
        C44766f5 c44766f8;
        LinearLayoutCompat linearLayoutCompat;
        C44766f5 c44766f9;
        FrameLayout frameLayout4;
        C44766f5 c44766f10;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46799g0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            InterfaceC46799g0 interfaceC46799g0 = (InterfaceC46799g0) objM56186h;
            C44741c4 c44741c4M18933s3 = m18933s3();
            interfaceC46799g0.m103128a((c44741c4M18933s3 == null || (c44766f10 = c44741c4M18933s3.f99685b) == null) ? null : c44766f10.f99934d);
        } else {
            C44741c4 c44741c4M18933s4 = m18933s3();
            if (c44741c4M18933s4 != null && (c44766f5 = c44741c4M18933s4.f99685b) != null && (frameLayout = c44766f5.f99934d) != null) {
                C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.assets.search.depositandwithdraw.g
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchCoinFiatFragment.m18930y3(this.f18617b, str);
                    }
                }, 1, null);
            }
        }
        C44741c4 c44741c4M18933s5 = m18933s3();
        if (c44741c4M18933s5 != null && (c44766f9 = c44741c4M18933s5.f99685b) != null && (frameLayout4 = c44766f9.f99935e) != null) {
            C27046k.m66711z(frameLayout4, 0L, new Function0() { // from class: com.kubi.assets.search.depositandwithdraw.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchCoinFiatFragment.m18931z3(i11);
                }
            }, 1, null);
        }
        C44741c4 c44741c4M18933s6 = m18933s3();
        if (c44741c4M18933s6 != null && (c44766f8 = c44741c4M18933s6.f99685b) != null && (linearLayoutCompat = c44766f8.f99933c) != null) {
            C27046k.m66711z(linearLayoutCompat, 0L, new Function0() { // from class: com.kubi.assets.search.depositandwithdraw.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchCoinFiatFragment.m18919A3(this.f18624b);
                }
            }, 1, null);
        }
        BaseFragment baseFragmentM18935u3 = m18935u3();
        if (AssetExKt.m15129q() && Intrinsics.areEqual(m18937w3(), "fiat")) {
            C44741c4 c44741c4M18933s7 = m18933s3();
            if (c44741c4M18933s7 != null && (slidingTabLayout = c44741c4M18933s7.f99688e) != null) {
                ViewExtKt.m66577h(slidingTabLayout);
            }
            C44741c4 c44741c4M18933s8 = m18933s3();
            if (c44741c4M18933s8 != null && (c44766f7 = c44741c4M18933s8.f99685b) != null && (frameLayout3 = c44766f7.f99934d) != null) {
                ViewExtKt.m66577h(frameLayout3);
            }
            C44741c4 c44741c4M18933s9 = m18933s3();
            if (c44741c4M18933s9 != null && (c44766f6 = c44741c4M18933s9.f99685b) != null && (frameLayout2 = c44766f6.f99935e) != null) {
                ViewExtKt.m66577h(frameLayout2);
            }
            searchCoinFragmentM18934t3 = null;
        } else {
            searchCoinFragmentM18934t3 = m18934t3();
        }
        C44741c4 c44741c4M18933s10 = m18933s3();
        if (c44741c4M18933s10 != null && (rtlViewPager = c44741c4M18933s10.f99687d) != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            rtlViewPager.setAdapter(new C27103z(childFragmentManager, new ArrayList(CollectionsKt.listOfNotNull((Object[]) new BaseFragment[]{searchCoinFragmentM18934t3, baseFragmentM18935u3})), CollectionsKt.listOfNotNull((Object[]) new String[]{searchCoinFragmentM18934t3 != null ? getString(R$string.fait_currency) : null, baseFragmentM18935u3 != null ? getString(R$string.fait_legal) : null})));
        }
        C44741c4 c44741c4M18933s11 = m18933s3();
        if (c44741c4M18933s11 != null) {
            c44741c4M18933s11.f99688e.setViewPager(c44741c4M18933s11.f99687d);
            c44741c4M18933s11.f99688e.m55291w();
            SlidingTabLayout slidingTabLayout2 = c44741c4M18933s11.f99688e;
            Bundle arguments = getArguments();
            slidingTabLayout2.setCurrentTab(arguments != null ? RouteExKt.m56262n(arguments, "tab_index", 0) : 0);
            c44741c4M18933s11.f99686c.f99995b.setHint(R$string.search_coin);
            m18932B3(c44741c4M18933s11.f99688e.getCurrentTab());
            c44741c4M18933s11.f99686c.f99995b.addTextChangedListener(new C10838a(searchCoinFragmentM18934t3));
            c44741c4M18933s11.f99688e.setOnTabSelectListener(new C10839b());
            if (!Intrinsics.areEqual(m18937w3(), "fiat") || baseFragmentM18935u3 == null || AssetExKt.m15129q()) {
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                c44741c4M18933s11.f99688e.setCurrentTab(1);
                Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
        }
    }

    private final int getLayout() {
        return R$layout.kucoin_activity_search_coin_fiat;
    }

    /* JADX INFO: renamed from: q3 */
    public static final SearchCoinFragment m18928q3(SearchCoinFiatFragment searchCoinFiatFragment) {
        SearchCoinFragment searchCoinFragment = new SearchCoinFragment();
        C27051h c27051hM66720d = new C27051h().m66719c("data", true).m66720d("from", searchCoinFiatFragment.m18936v3());
        Bundle arguments = searchCoinFiatFragment.getArguments();
        C27051h c27051hM66724h = c27051hM66720d.m66724h("page", arguments != null ? RouteExKt.m56284y(arguments, "page") : null);
        Bundle arguments2 = searchCoinFiatFragment.getArguments();
        C27051h c27051hM66724h2 = c27051hM66724h.m66724h("address", arguments2 != null ? RouteExKt.m56284y(arguments2, "address") : null);
        Bundle arguments3 = searchCoinFiatFragment.getArguments();
        searchCoinFragment.setArguments(c27051hM66724h2.m66724h("spm", C27041f.m66668h(arguments3 != null ? RouteExKt.m56284y(arguments3, "spm") : null)).m66719c("from_include_page", true).m66717a());
        return searchCoinFragment;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m18931z3(int i11) {
        InterfaceC37749a.a.m85114i(C37304a.f82764a, null, Long.valueOf(i11), C43852m.m96601m("B1depositCoinList", "historyRecord", String.valueOf(i11)), null, null, 25, null);
        C43852m.m96591c("B1depositCoinList", "historyRecord", String.valueOf(i11), null, 8, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(getLayout(), container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        String string;
        String strM15458a;
        C44741c4 c44741c4M18933s3;
        C44766f5 c44766f5;
        BaseTextView baseTextView;
        String strM56285z;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        HideIMEUtil.f19152a.m20049b(this);
        Bundle arguments = getArguments();
        if (arguments != null && (strM56285z = RouteExKt.m56285z(arguments, "page", "default")) != null) {
            C43852m.m96595g("B1depositCoinList", "from", strM56285z, null, 8, null);
        }
        int iM18936v3 = m18936v3();
        int i11 = 1;
        if (iM18936v3 != 1) {
            if (iM18936v3 != 2) {
                string = "";
                strM15458a = "";
            } else {
                string = getString(R$string.withdrawal_label);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                strM15458a = UrlConstant.f16608a.m15463f();
            }
            c44741c4M18933s3 = m18933s3();
            if (c44741c4M18933s3 != null && (c44766f5 = c44741c4M18933s3.f99685b) != null && (baseTextView = c44766f5.f99936f) != null) {
                baseTextView.setText(string);
            }
            m18938x3(strM15458a, i11);
        }
        string = getString(R$string.deposit_coin);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        strM15458a = UrlConstant.f16608a.m15458a();
        i11 = 0;
        c44741c4M18933s3 = m18933s3();
        if (c44741c4M18933s3 != null) {
            baseTextView.setText(string);
        }
        m18938x3(strM15458a, i11);
    }

    /* JADX INFO: renamed from: s3 */
    public final C44741c4 m18933s3() {
        return (C44741c4) this.f18573U.getValue(this, f18572Z[0]);
    }

    /* JADX INFO: renamed from: t3 */
    public final SearchCoinFragment m18934t3() {
        return (SearchCoinFragment) this.f18576X.getValue();
    }

    /* JADX INFO: renamed from: u3 */
    public final BaseFragment m18935u3() {
        SlidingTabLayout slidingTabLayout;
        if (!C24129b.m58030b(SiteVisibleConfigKey.FiatDeposit) || (AssetExKt.m15129q() && !(AssetExKt.m15129q() && Intrinsics.areEqual(m18937w3(), "fiat")))) {
            C44741c4 c44741c4M18933s3 = m18933s3();
            if (c44741c4M18933s3 != null && (slidingTabLayout = c44741c4M18933s3.f99688e) != null) {
                ViewExtKt.m66577h(slidingTabLayout);
            }
            return null;
        }
        C44741c4 c44741c4M18933s4 = m18933s3();
        if (c44741c4M18933s4 == null) {
            return null;
        }
        IOtcService iOtcServiceM19184e = AssetsDepend.f18689a.m19184e();
        ClearEditText etSearch = c44741c4M18933s4.f99686c.f99995b;
        Intrinsics.checkNotNullExpressionValue(etSearch, "etSearch");
        BaseFragment baseFragmentMo43961h = iOtcServiceM19184e.mo43961h(etSearch);
        C27051h c27051hM66719c = new C27051h().m66719c("data", true);
        Bundle arguments = getArguments();
        C27051h c27051hM66724h = c27051hM66719c.m66724h("type", C27041f.m66668h(arguments != null ? arguments.getString("type") : null));
        Bundle arguments2 = getArguments();
        baseFragmentMo43961h.setArguments(c27051hM66724h.m66724h("spm", C27041f.m66668h(arguments2 != null ? RouteExKt.m56284y(arguments2, "spm") : null)).m66719c("from_include_page", true).m66717a());
        return baseFragmentMo43961h;
    }

    /* JADX INFO: renamed from: v3 */
    public final int m18936v3() {
        return ((Number) this.f18575W.getValue()).intValue();
    }

    /* JADX INFO: renamed from: w3 */
    public final String m18937w3() {
        return (String) this.f18574V.getValue();
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m18919A3(SearchCoinFiatFragment searchCoinFiatFragment) {
        searchCoinFiatFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final String m18920C3(SearchCoinFiatFragment searchCoinFiatFragment) {
        String string;
        Bundle arguments = searchCoinFiatFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("tabMark");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: r3 */
    public static final int m18929r3(SearchCoinFiatFragment searchCoinFiatFragment) {
        Integer numValueOf;
        Bundle arguments = searchCoinFiatFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("from", 0));
        } else {
            numValueOf = null;
        }
        return C27039d.m66651k(numValueOf, 0);
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m18930y3(SearchCoinFiatFragment searchCoinFiatFragment, String str) throws JSONException {
        if (AssetExKt.m15129q()) {
            if (searchCoinFiatFragment.m18936v3() == 1) {
                C42148c.m92487b();
            } else {
                C42148c.m92488c();
            }
        } else {
            C24271s1.m58531c(Router.f46192a.m56184f(str), C43852m.m96601m("B1depositCoinList", "faq", "1")).m4048k();
        }
        C43852m.m96591c("B1depositCoinList", "faq", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public final void m18932B3(int i11) throws JSONException {
        String strM56285z;
        String str;
        Bundle arguments = getArguments();
        if (arguments != null) {
            strM56285z = RouteExKt.m56285z(arguments, "spm", "");
        } else {
            strM56285z = null;
        }
        String strM66668h = C27041f.m66668h(strM56285z);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pre_spm_id", strM66668h);
        jSONObject.put("norm_version", "1");
        if (m18936v3() == 1) {
            str = "DEPOSIT";
        } else {
            str = "WITHDRAW";
        }
        jSONObject.put("trade_type", str);
        C44128b.m97259c(getTAG(), "pre_spm_id -> " + strM66668h);
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            C43852m.m96595g("B7FiatList", "page", null, jSONObject, 4, null);
            return;
        }
        C43852m.m96595g("B1depositCoinList", "page", null, jSONObject, 4, null);
    }
}
