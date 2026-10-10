package com.kubi.search.searchresult;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.R$drawable;
import com.kubi.search.R$layout;
import com.kubi.search.R$string;
import com.kubi.search.entity.ISearchResultData;
import com.kubi.search.utils.SearchExKt;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
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
import q10.C43586f;
import w00.C45681e;

/* JADX INFO: compiled from: SearchResultEarnsFragment.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\u0017\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/search/searchresult/SearchResultEarnsFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "resultAdapter", "Lcom/kubi/search/searchresult/SearchResultEarnAdapter;", "binding", "Lcom/kubi/search/databinding/SearchFragmentResultDatalistBinding;", "getBinding", "()Lcom/kubi/search/databinding/SearchFragmentResultDatalistBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "refreshViewDatas", "dataList", "", "Lcom/kubi/search/entity/ISearchResultData;", "searchKey", "", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchResultEarnsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultEarnsFragment.kt\ncom/kubi/search/searchresult/SearchResultEarnsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,54:1\n147#2,16:55\n*S KotlinDebug\n*F\n+ 1 SearchResultEarnsFragment.kt\ncom/kubi/search/searchresult/SearchResultEarnsFragment\n*L\n32#1:55,16\n*E\n"})
public final class SearchResultEarnsFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f49005W = {Reflection.property1(new PropertyReference1Impl(SearchResultEarnsFragment.class, "binding", "getBinding()Lcom/kubi/search/databinding/SearchFragmentResultDatalistBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final SearchResultEarnAdapter f49006U = new SearchResultEarnAdapter();

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f49007V = C45681e.m100799e(this, new Function1<SearchResultEarnsFragment, C43586f>() { // from class: com.kubi.search.searchresult.SearchResultEarnsFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C43586f invoke(@NotNull SearchResultEarnsFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C43586f.m95922a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C43586f, Unit>() { // from class: com.kubi.search.searchresult.SearchResultEarnsFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C43586f it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C43586f c43586f) {
            invoke(c43586f);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: com.kubi.search.searchresult.SearchResultEarnsFragment$a */
    /* JADX INFO: compiled from: SearchResultEarnsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/search/searchresult/SearchResultEarnsFragment$onViewCreated$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSearchResultEarnsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultEarnsFragment.kt\ncom/kubi/search/searchresult/SearchResultEarnsFragment$onViewCreated$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
    public static final class C24435a extends RecyclerView.OnScrollListener {
        public C24435a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (SearchResultEarnsFragment.this.getActivity() != null) {
                final SearchResultEarnsFragment searchResultEarnsFragment = SearchResultEarnsFragment.this;
                C27100x0.m66924e(new Function0() { // from class: com.kubi.search.searchresult.x
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchResultEarnsFragment.C24435a.m59384b(searchResultEarnsFragment);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m59384b(SearchResultEarnsFragment searchResultEarnsFragment) {
            KeyboardUtils.m6036h(searchResultEarnsFragment.getActivity());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: k3 */
    private final C43586f m59380k3() {
        return (C43586f) this.f49007V.getValue(this, f49005W[0]);
    }

    /* JADX INFO: renamed from: m3 */
    public static final Unit m59381m3(SearchResultEarnsFragment searchResultEarnsFragment, List list, String str) {
        RecyclerView recyclerView;
        searchResultEarnsFragment.f49006U.m59377j(list, str);
        if (list.isEmpty()) {
            BaseFragment.showEmptyView$default(searchResultEarnsFragment, R$string.not_found_content, R$drawable.ic2_common_empty, (View.OnClickListener) null, 4, (Object) null);
        } else {
            searchResultEarnsFragment.showContentView();
            C43586f c43586fM59380k3 = searchResultEarnsFragment.m59380k3();
            if (c43586fM59380k3 != null && (recyclerView = c43586fM59380k3.f96206b) != null) {
                SearchExKt.m59513G(recyclerView);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l3 */
    public final void m59382l3(@NotNull final List<? extends ISearchResultData> dataList, @NotNull final String searchKey) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(searchKey, "searchKey");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchresult.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultEarnsFragment.m59381m3(this.f49126b, dataList, searchKey);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.search_fragment_result_datalist, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C43586f c43586fM59380k3 = m59380k3();
        if (c43586fM59380k3 != null && (recyclerView2 = c43586fM59380k3.f96206b) != null) {
            recyclerView2.setAdapter(this.f49006U);
        }
        C43586f c43586fM59380k4 = m59380k3();
        if (c43586fM59380k4 == null || (recyclerView = c43586fM59380k4.f96206b) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new C24435a());
    }
}
