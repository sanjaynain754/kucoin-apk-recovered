package com.kubi.search.searchresult;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.KeyboardUtils;
import com.kubi.resources.C22912t;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.R$drawable;
import com.kubi.search.R$layout;
import com.kubi.search.R$string;
import com.kubi.search.entity.ISearchResultData;
import com.kubi.search.entity.SearchItemData;
import com.kubi.search.utils.SearchExKt;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import q10.C43586f;
import w00.C45681e;

/* JADX INFO: compiled from: SearchResultDataFragment.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J$\u0010\u0017\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020\u0015H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\""}, m90084d2 = {"Lcom/kubi/search/searchresult/SearchResultDataFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "resultAdapter", "Lcom/kubi/search/searchresult/SearchResultAdapter;", "binding", "Lcom/kubi/search/databinding/SearchFragmentResultDatalistBinding;", "getBinding", "()Lcom/kubi/search/databinding/SearchFragmentResultDatalistBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "refreshViewDatas", "dataList", "", "Lcom/kubi/search/entity/ISearchResultData;", "searchKey", "", "tab", "notifyAdapterChanged", "item", "Lcom/kubi/search/entity/SearchItemData;", "notifyAdapterAll", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchResultDataFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultDataFragment.kt\ncom/kubi/search/searchresult/SearchResultDataFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n147#2,16:76\n1878#3,3:92\n*S KotlinDebug\n*F\n+ 1 SearchResultDataFragment.kt\ncom/kubi/search/searchresult/SearchResultDataFragment\n*L\n30#1:76,16\n62#1:92,3\n*E\n"})
public final class SearchResultDataFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f48999W = {Reflection.property1(new PropertyReference1Impl(SearchResultDataFragment.class, "binding", "getBinding()Lcom/kubi/search/databinding/SearchFragmentResultDatalistBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final SearchResultAdapter f49000U = new SearchResultAdapter();

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f49001V = C45681e.m100799e(this, new Function1<SearchResultDataFragment, C43586f>() { // from class: com.kubi.search.searchresult.SearchResultDataFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C43586f invoke(@NotNull SearchResultDataFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C43586f.m95922a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C43586f, Unit>() { // from class: com.kubi.search.searchresult.SearchResultDataFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C43586f it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C43586f c43586f) {
            invoke(c43586f);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: com.kubi.search.searchresult.SearchResultDataFragment$a */
    /* JADX INFO: compiled from: SearchResultDataFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/search/searchresult/SearchResultDataFragment$onViewCreated$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSearchResultDataFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultDataFragment.kt\ncom/kubi/search/searchresult/SearchResultDataFragment$onViewCreated$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
    public static final class C24434a extends RecyclerView.OnScrollListener {
        public C24434a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (SearchResultDataFragment.this.getActivity() != null) {
                final SearchResultDataFragment searchResultDataFragment = SearchResultDataFragment.this;
                C27100x0.m66924e(new Function0() { // from class: com.kubi.search.searchresult.u
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchResultDataFragment.C24434a.m59371b(searchResultDataFragment);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m59371b(SearchResultDataFragment searchResultDataFragment) {
            KeyboardUtils.m6036h(searchResultDataFragment.getActivity());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o3 */
    public static final Unit m59363o3(SearchResultDataFragment searchResultDataFragment) {
        searchResultDataFragment.f49000U.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m59364q3(SearchResultDataFragment searchResultDataFragment, SearchItemData searchItemData) {
        Collection data = searchResultDataFragment.f49000U.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        int i11 = 0;
        for (Object obj : data) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ISearchResultData iSearchResultData = (ISearchResultData) obj;
            if ((iSearchResultData instanceof SearchItemData) && Intrinsics.areEqual(iSearchResultData, searchItemData)) {
                searchResultDataFragment.f49000U.notifyItemChanged(i11);
                return Unit.INSTANCE;
            }
            i11 = i12;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m59365s3(SearchResultDataFragment searchResultDataFragment, List list, String str, String str2) {
        RecyclerView recyclerView;
        searchResultDataFragment.f49000U.m59336t(list, str, str2, searchResultDataFragment.isShowing());
        if (list.isEmpty()) {
            BaseFragment.showEmptyView$default(searchResultDataFragment, R$string.not_found_content, R$drawable.ic2_common_empty, (View.OnClickListener) null, 4, (Object) null);
        } else {
            searchResultDataFragment.showContentView();
            C43586f c43586fM59366m3 = searchResultDataFragment.m59366m3();
            if (c43586fM59366m3 != null && (recyclerView = c43586fM59366m3.f96206b) != null) {
                SearchExKt.m59513G(recyclerView);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m3 */
    public final C43586f m59366m3() {
        return (C43586f) this.f49001V.getValue(this, f48999W[0]);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: n3 */
    public final void m59367n3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchresult.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultDataFragment.m59363o3(this.f49121b);
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
        RecyclerView recyclerView3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C43586f c43586fM59366m3 = m59366m3();
        if (c43586fM59366m3 != null && (recyclerView3 = c43586fM59366m3.f96206b) != null) {
            recyclerView3.setAdapter(this.f49000U);
        }
        C43586f c43586fM59366m4 = m59366m3();
        if (c43586fM59366m4 != null && (recyclerView2 = c43586fM59366m4.f96206b) != null) {
            C22912t.m54410h(recyclerView2, false, 1, null);
        }
        C43586f c43586fM59366m5 = m59366m3();
        if (c43586fM59366m5 == null || (recyclerView = c43586fM59366m5.f96206b) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new C24434a());
    }

    /* JADX INFO: renamed from: p3 */
    public final void m59368p3(@NotNull final SearchItemData item) {
        Intrinsics.checkNotNullParameter(item, "item");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchresult.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultDataFragment.m59364q3(this.f49111b, item);
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public final void m59369r3(@NotNull final List<? extends ISearchResultData> dataList, @NotNull final String searchKey, @NotNull final String tab) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(searchKey, "searchKey");
        Intrinsics.checkNotNullParameter(tab, "tab");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchresult.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultDataFragment.m59365s3(this.f49116b, dataList, searchKey, tab);
            }
        });
    }
}
