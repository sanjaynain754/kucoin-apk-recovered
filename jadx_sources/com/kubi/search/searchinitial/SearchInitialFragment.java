package com.kubi.search.searchinitial;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.C11352b;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.R$id;
import com.kubi.search.R$layout;
import com.kubi.search.searchinitial.history.HistoryFragment;
import com.kubi.search.searchinitial.recommend.RecommendFragment;
import com.kubi.search.searchinitial.topsearch.TopSearchFragment;
import com.kubi.search.utils.SearchInitialBiz;
import com.kubi.search.utils.SearchInitialResult;
import com.kubi.search.widget.TouchableView;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27032f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import q10.C43583c;
import w00.C45681e;

/* JADX INFO: compiled from: SearchInitialFragment.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\""}, m90084d2 = {"Lcom/kubi/search/searchinitial/SearchInitialFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/search/databinding/SearchFragmentInitialBinding;", "getBinding", "()Lcom/kubi/search/databinding/SearchFragmentInitialBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initialBizHasData", "", "Lcom/kubi/search/utils/SearchInitialBiz;", "", "needLoadingView", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "bindFlowEvent", "showLayoutState", "status", "", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchInitialFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchInitialFragment.kt\ncom/kubi/search/searchinitial/SearchInitialFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n147#2,16:97\n76#3,7:113\n1#4:120\n*S KotlinDebug\n*F\n+ 1 SearchInitialFragment.kt\ncom/kubi/search/searchinitial/SearchInitialFragment\n*L\n34#1:97,16\n59#1:113,7\n*E\n"})
public final class SearchInitialFragment extends BaseFragment {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f48878X = {Reflection.property1(new PropertyReference1Impl(SearchInitialFragment.class, "binding", "getBinding()Lcom/kubi/search/databinding/SearchFragmentInitialBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f48879U = C45681e.m100799e(this, new Function1<SearchInitialFragment, C43583c>() { // from class: com.kubi.search.searchinitial.SearchInitialFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C43583c invoke(@NotNull SearchInitialFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C43583c.m95916a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C43583c, Unit>() { // from class: com.kubi.search.searchinitial.SearchInitialFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C43583c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C43583c c43583c) {
            invoke(c43583c);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Map<SearchInitialBiz, Boolean> f48880V = new LinkedHashMap();

    /* JADX INFO: renamed from: W */
    public boolean f48881W;

    /* JADX INFO: renamed from: com.kubi.search.searchinitial.SearchInitialFragment$a */
    /* JADX INFO: compiled from: SearchInitialFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSearchInitialFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchInitialFragment.kt\ncom/kubi/search/searchinitial/SearchInitialFragment$bindFlowEvent$1$1\n+ 2 CollectionsEx.kt\ncom/kubi/utils/extensions/CollectionsExKt\n*L\n1#1,96:1\n99#2:97\n*S KotlinDebug\n*F\n+ 1 SearchInitialFragment.kt\ncom/kubi/search/searchinitial/SearchInitialFragment$bindFlowEvent$1$1\n*L\n63#1:97\n*E\n"})
    public static final class C24380a implements Function0<Unit> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SearchInitialResult f48883c;

        public C24380a(SearchInitialResult searchInitialResult) {
            this.f48883c = searchInitialResult;
        }

        /* JADX INFO: renamed from: a */
        public final void m59136a() {
            Object next;
            SearchInitialFragment.this.f48880V.put(this.f48883c.getBiz(), Boolean.valueOf(this.f48883c.getHasData()));
            if (SearchInitialFragment.this.f48880V.size() == SearchInitialBiz.getEntries().size()) {
                Iterator it = SearchInitialFragment.this.f48880V.values().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((Boolean) next).booleanValue());
                SearchInitialFragment.this.m59133r3(next != null ? 1 : 2);
            }
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m59136a();
            return Unit.INSTANCE;
        }
    }

    private final void bindFlowEvent() {
        if (C12573b.f21598a.m23696a()) {
            "search_event_init_finish_hasdata".length();
        }
        C12572a.m23692a(this, false, new C24381xec4cf1a9("search_event_init_finish_hasdata", null, this));
    }

    /* JADX INFO: renamed from: p3 */
    public static final Unit m59131p3(final SearchInitialFragment searchInitialFragment) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.search.searchinitial.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchInitialFragment.m59132q3(this.f48902b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public final void m59133r3(final int i11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchinitial.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchInitialFragment.m59134s3(this.f48900b, i11);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF48881W() {
        return this.f48881W;
    }

    /* JADX INFO: renamed from: o3 */
    public final C43583c m59135o3() {
        return (C43583c) this.f48879U.getValue(this, f48878X[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.search_fragment_initial, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        TouchableView touchableView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m59133r3(0);
        this.f48880V.clear();
        bindFlowEvent();
        C43583c c43583cM59135o3 = m59135o3();
        if (c43583cM59135o3 != null && (touchableView = c43583cM59135o3.f96190f) != null) {
            touchableView.setCallback(new Function0() { // from class: com.kubi.search.searchinitial.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchInitialFragment.m59131p3(this.f48889b);
                }
            });
        }
        C27032f.m66625p(this, R$id.fHistory, new HistoryFragment(), null, 4, null);
        C27032f.m66625p(this, R$id.fTopSearch, new TopSearchFragment(), null, 4, null);
        C27032f.m66625p(this, R$id.fRecommend, new RecommendFragment(), null, 4, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f48881W = z11;
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m59132q3(SearchInitialFragment searchInitialFragment) {
        FragmentActivity activity = searchInitialFragment.getActivity();
        if (activity != null) {
            KeyboardUtils.m6036h(activity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m59134s3(SearchInitialFragment searchInitialFragment, int i11) {
        C43583c c43583cM59135o3 = searchInitialFragment.m59135o3();
        if (c43583cM59135o3 == null) {
            return Unit.INSTANCE;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    TouchableView layoutContent = c43583cM59135o3.f96190f;
                    Intrinsics.checkNotNullExpressionValue(layoutContent, "layoutContent");
                    C27046k.m66700o(layoutContent);
                    LinearLayout root = c43583cM59135o3.f96186b.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                    C27046k.m66685H(root);
                    LinearLayout root2 = c43583cM59135o3.f96191g.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
                    C27046k.m66700o(root2);
                }
            } else {
                TouchableView layoutContent2 = c43583cM59135o3.f96190f;
                Intrinsics.checkNotNullExpressionValue(layoutContent2, "layoutContent");
                C27046k.m66685H(layoutContent2);
                LinearLayout root3 = c43583cM59135o3.f96186b.getRoot();
                Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
                C27046k.m66700o(root3);
                LinearLayout root4 = c43583cM59135o3.f96191g.getRoot();
                Intrinsics.checkNotNullExpressionValue(root4, "getRoot(...)");
                C27046k.m66700o(root4);
            }
        } else {
            TouchableView layoutContent3 = c43583cM59135o3.f96190f;
            Intrinsics.checkNotNullExpressionValue(layoutContent3, "layoutContent");
            C27046k.m66700o(layoutContent3);
            LinearLayout root5 = c43583cM59135o3.f96186b.getRoot();
            Intrinsics.checkNotNullExpressionValue(root5, "getRoot(...)");
            C27046k.m66700o(root5);
            LinearLayout root6 = c43583cM59135o3.f96191g.getRoot();
            Intrinsics.checkNotNullExpressionValue(root6, "getRoot(...)");
            C27046k.m66685H(root6);
            C11352b.m20197a(c43583cM59135o3.f96191g.f96214b);
        }
        return Unit.INSTANCE;
    }
}
