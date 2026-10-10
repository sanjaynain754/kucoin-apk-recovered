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
import com.kubi.search.entity.SearchItemData;
import com.kubi.search.entity.SearchWeb3ItemHeader;
import com.kubi.search.utils.SearchExKt;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
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

/* JADX INFO: compiled from: SearchResultWeb3Fragment.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\u0017\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, m90084d2 = {"Lcom/kubi/search/searchresult/SearchResultWeb3Fragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "resultAdapter", "Lcom/kubi/search/searchresult/SearchResultWeb3Adapter;", "binding", "Lcom/kubi/search/databinding/SearchFragmentResultDatalistBinding;", "getBinding$SearchLib_googleRelease", "()Lcom/kubi/search/databinding/SearchFragmentResultDatalistBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "refreshViewDatas", "dataList", "", "Lcom/kubi/search/entity/ISearchResultData;", "searchKey", "", "notifyAdapterChanged", "item", "Lcom/kubi/search/entity/SearchItemData;", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchResultWeb3Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultWeb3Fragment.kt\ncom/kubi/search/searchresult/SearchResultWeb3Fragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n147#2,16:73\n1878#3,3:89\n*S KotlinDebug\n*F\n+ 1 SearchResultWeb3Fragment.kt\ncom/kubi/search/searchresult/SearchResultWeb3Fragment\n*L\n35#1:73,16\n65#1:89,3\n*E\n"})
public final class SearchResultWeb3Fragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f49035W = {Reflection.property1(new PropertyReference1Impl(SearchResultWeb3Fragment.class, "binding", "getBinding$SearchLib_googleRelease()Lcom/kubi/search/databinding/SearchFragmentResultDatalistBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final SearchResultWeb3Adapter f49036U = new SearchResultWeb3Adapter();

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f49037V = C45681e.m100799e(this, new Function1<SearchResultWeb3Fragment, C43586f>() { // from class: com.kubi.search.searchresult.SearchResultWeb3Fragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C43586f invoke(@NotNull SearchResultWeb3Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C43586f.m95922a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C43586f, Unit>() { // from class: com.kubi.search.searchresult.SearchResultWeb3Fragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C43586f it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C43586f c43586f) {
            invoke(c43586f);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: com.kubi.search.searchresult.SearchResultWeb3Fragment$a */
    /* JADX INFO: compiled from: SearchResultWeb3Fragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/search/searchresult/SearchResultWeb3Fragment$onViewCreated$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSearchResultWeb3Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultWeb3Fragment.kt\ncom/kubi/search/searchresult/SearchResultWeb3Fragment$onViewCreated$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
    public static final class C24444a extends RecyclerView.OnScrollListener {
        public C24444a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (SearchResultWeb3Fragment.this.getActivity() != null) {
                final SearchResultWeb3Fragment searchResultWeb3Fragment = SearchResultWeb3Fragment.this;
                C27100x0.m66924e(new Function0() { // from class: com.kubi.search.searchresult.s0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchResultWeb3Fragment.C24444a.m59468b(searchResultWeb3Fragment);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: b */
        public static final Unit m59468b(SearchResultWeb3Fragment searchResultWeb3Fragment) {
            KeyboardUtils.m6036h(searchResultWeb3Fragment.getActivity());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: n3 */
    public static final Unit m59462n3(SearchResultWeb3Fragment searchResultWeb3Fragment, SearchItemData searchItemData) {
        Collection data = searchResultWeb3Fragment.f49036U.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        int i11 = 0;
        for (Object obj : data) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ISearchResultData iSearchResultData = (ISearchResultData) obj;
            if ((iSearchResultData instanceof SearchItemData) && Intrinsics.areEqual(iSearchResultData, searchItemData)) {
                searchResultWeb3Fragment.f49036U.notifyItemChanged(i11);
                return Unit.INSTANCE;
            }
            i11 = i12;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p3 */
    public static final Unit m59463p3(List list, SearchResultWeb3Fragment searchResultWeb3Fragment, String str) {
        RecyclerView recyclerView;
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            arrayList.add(new SearchWeb3ItemHeader());
            arrayList.addAll(list);
        }
        searchResultWeb3Fragment.f49036U.m59458k(arrayList, str);
        if (arrayList.isEmpty()) {
            BaseFragment.showEmptyView$default(searchResultWeb3Fragment, R$string.not_found_content, R$drawable.ic2_common_empty, (View.OnClickListener) null, 4, (Object) null);
        } else {
            searchResultWeb3Fragment.showContentView();
            C43586f c43586fM59464l3 = searchResultWeb3Fragment.m59464l3();
            if (c43586fM59464l3 != null && (recyclerView = c43586fM59464l3.f96206b) != null) {
                SearchExKt.m59513G(recyclerView);
            }
        }
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: l3 */
    public final C43586f m59464l3() {
        return (C43586f) this.f49037V.getValue(this, f49035W[0]);
    }

    /* JADX INFO: renamed from: m3 */
    public final void m59465m3(@NotNull final SearchItemData item) {
        Intrinsics.checkNotNullParameter(item, "item");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchresult.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultWeb3Fragment.m59462n3(this.f49109b, item);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public final void m59466o3(@NotNull final List<? extends ISearchResultData> dataList, @NotNull final String searchKey) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(searchKey, "searchKey");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.search.searchresult.r0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultWeb3Fragment.m59463p3(dataList, this, searchKey);
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
        C43586f c43586fM59464l3 = m59464l3();
        if (c43586fM59464l3 != null && (recyclerView2 = c43586fM59464l3.f96206b) != null) {
            recyclerView2.setAdapter(this.f49036U);
        }
        C43586f c43586fM59464l4 = m59464l3();
        if (c43586fM59464l4 == null || (recyclerView = c43586fM59464l4.f96206b) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new C24444a());
    }
}
