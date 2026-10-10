package com.kubi.search.searchresult;

import android.view.View;
import com.kubi.event.api.C12572a;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.sdk.util.C24277v;
import com.kubi.search.R$id;
import com.kubi.search.R$layout;
import com.kubi.search.entity.ExtendEntity;
import com.kubi.search.entity.ISearchResultData;
import com.kubi.search.entity.SearchEntity;
import com.kubi.search.entity.SearchItemData;
import com.kubi.search.entity.SearchItemHeader;
import com.kubi.search.utils.EarnProductCategory;
import com.kubi.search.utils.SearchExKt;
import com.kubi.search.utils.SearchTrack;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33954u6;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44129c;

/* JADX INFO: compiled from: SearchResultEarnAdapter.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u001c\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/search/searchresult/SearchResultEarnAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/search/entity/ISearchResultData;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "currentSearchKey", "", "defaultHArray", "", "refreshViewDatas", "", "dataList", "", "key", "convert", "helper", "item", "renderHeader", "Lcom/kubi/search/entity/SearchItemHeader;", "renderData", "Lcom/kubi/search/entity/SearchItemData;", "handlejumClick", "adapterPosition", "", "onViewAttachedToWindow", C33954u6.f72238i, "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchResultEarnAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultEarnAdapter.kt\ncom/kubi/search/searchresult/SearchResultEarnAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n808#2,11:139\n1869#2:150\n1870#2:152\n1869#2,2:153\n1#3:151\n*S KotlinDebug\n*F\n+ 1 SearchResultEarnAdapter.kt\ncom/kubi/search/searchresult/SearchResultEarnAdapter\n*L\n43#1:139,11\n43#1:150\n43#1:152\n53#1:153,2\n*E\n"})
public final class SearchResultEarnAdapter extends BaseMultiItemQuickAdapter<ISearchResultData, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public String f49003i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<String> f49004j;

    public SearchResultEarnAdapter() {
        super(new ArrayList());
        addItemType(1, R$layout.search_item_result_header);
        addItemType(3, R$layout.search_item_result_data_earn);
        this.f49003i = "";
        this.f49004j = new ArrayList();
    }

    /* JADX INFO: renamed from: m */
    private final void m59375m(BaseViewHolder baseViewHolder, SearchItemHeader searchItemHeader) {
        baseViewHolder.setText(R$id.tvTitle, searchItemHeader.getTitle());
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable ISearchResultData iSearchResultData) {
        if (baseViewHolder == null || iSearchResultData == null) {
            return;
        }
        if (iSearchResultData instanceof SearchItemHeader) {
            m59375m(baseViewHolder, (SearchItemHeader) iSearchResultData);
        }
        if (iSearchResultData instanceof SearchItemData) {
            m59378k(baseViewHolder, (SearchItemData) iSearchResultData);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m59377j(@NotNull List<? extends ISearchResultData> dataList, @NotNull String key) {
        String strM66668h;
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f49003i = key;
        this.f49004j.clear();
        this.f49004j.add(this.f49003i);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<SearchItemData> arrayList = new ArrayList();
        for (Object obj : dataList) {
            if (obj instanceof SearchItemData) {
                arrayList.add(obj);
            }
        }
        for (SearchItemData searchItemData : arrayList) {
            EarnProductCategory earnProductCategory = EarnProductCategory.B2C_LENDING;
            ExtendEntity beanEarn = searchItemData.getBeanEarn();
            if (earnProductCategory.nameEqual(beanEarn != null ? beanEarn.getProductCategory() : null)) {
                ExtendEntity beanEarn2 = searchItemData.getBeanEarn();
                strM66668h = C27041f.m66668h(beanEarn2 != null ? beanEarn2.getProductCategoryItemStr() : null);
            } else {
                ExtendEntity beanEarn3 = searchItemData.getBeanEarn();
                strM66668h = C27041f.m66668h(beanEarn3 != null ? beanEarn3.getProductCategoryStr() : null);
            }
            List listMutableListOf = (List) linkedHashMap.get(strM66668h);
            if (listMutableListOf == null) {
                listMutableListOf = CollectionsKt.mutableListOf(new SearchItemHeader(strM66668h));
            }
            listMutableListOf.add(searchItemData);
            linkedHashMap.put(strM66668h, listMutableListOf);
        }
        ArrayList arrayList2 = new ArrayList();
        Collection<List> collectionValues = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        for (List list : collectionValues) {
            Intrinsics.checkNotNull(list);
            arrayList2.addAll(list);
        }
        setNewData(arrayList2);
    }

    /* JADX INFO: renamed from: k */
    public final void m59378k(final BaseViewHolder baseViewHolder, final SearchItemData searchItemData) {
        CoinAvatarView coinAvatarView = (CoinAvatarView) baseViewHolder.getView(R$id.coinIcon);
        if (coinAvatarView != null) {
            C24277v.m58542g(coinAvatarView, C27041f.m66668h(searchItemData.getIconUrl()));
        }
        SearchEntity beanRemoteEntity = searchItemData.getBeanRemoteEntity();
        List<String> resourceHits = beanRemoteEntity != null ? beanRemoteEntity.getResourceHits() : null;
        if (resourceHits == null) {
            resourceHits = CollectionsKt.emptyList();
        }
        if (resourceHits.isEmpty()) {
            resourceHits = this.f49004j;
        }
        baseViewHolder.setText(R$id.tvEarnName, SearchExKt.m59508B(searchItemData.getBaseCurrencyName(), resourceHits));
        int i11 = R$id.tvEarnType;
        ExtendEntity beanEarn = searchItemData.getBeanEarn();
        baseViewHolder.setText(i11, beanEarn != null ? beanEarn.getProductCategoryItemStr() : null);
        int i12 = R$id.tvRate;
        ExtendEntity beanEarn2 = searchItemData.getBeanEarn();
        baseViewHolder.setText(i12, beanEarn2 != null ? beanEarn2.formatPrtStr() : null);
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.search.searchresult.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultEarnAdapter.m59374l(this.f49123b, searchItemData, baseViewHolder);
            }
        }, 1, null);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull BaseViewHolder holder) throws JSONException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        ISearchResultData iSearchResultData = (ISearchResultData) getItem(holder.getBindingAdapterPosition());
        if (iSearchResultData != null && (iSearchResultData instanceof SearchItemData)) {
            int bindingAdapterPosition = holder.getBindingAdapterPosition();
            SearchItemData searchItemData = (SearchItemData) iSearchResultData;
            String symbol = searchItemData.getSymbol();
            SearchTrackUploader searchTrackUploader = SearchTrackUploader.f49039a;
            if (searchTrackUploader.m59482m().contains(symbol)) {
                return;
            }
            SearchEntity beanRemoteEntity = searchItemData.getBeanRemoteEntity();
            if (beanRemoteEntity != null) {
                searchTrackUploader.m59481j(beanRemoteEntity);
            }
            int i11 = bindingAdapterPosition + 1;
            SearchTrack.f49158a.m59611g(searchItemData, i11, i11, SearchCategory$Companion.EARN, this.f49003i, "", false);
            searchTrackUploader.m59482m().add(symbol);
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m59373i(SearchItemData searchItemData, int i11) throws JSONException {
        String productCategoryStr;
        ExtendEntity beanEarn = searchItemData.getBeanEarn();
        if (beanEarn != null) {
            SearchExKt.m59540v(beanEarn);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("产品名");
        ExtendEntity beanEarn2 = searchItemData.getBeanEarn();
        if (beanEarn2 != null) {
            productCategoryStr = beanEarn2.getProductCategoryStr();
        } else {
            productCategoryStr = null;
        }
        sb2.append(productCategoryStr);
        C44129c.m97272b("platform::search", "搜索-理财Tab-跳转", sb2.toString(), null, 8, null);
        SearchEntity beanRemoteEntity = searchItemData.getBeanRemoteEntity();
        if (beanRemoteEntity != null) {
            SearchTrackUploader.f49039a.m59480g(beanRemoteEntity);
        }
        SearchTrack searchTrack = SearchTrack.f49158a;
        searchTrack.m59606b(this.f49003i);
        int i12 = i11 + 1;
        searchTrack.m59611g(searchItemData, i12, i12, SearchCategory$Companion.EARN, this.f49003i, C33556b3.f68963J, false);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m59374l(SearchResultEarnAdapter searchResultEarnAdapter, SearchItemData searchItemData, BaseViewHolder baseViewHolder) throws JSONException {
        searchResultEarnAdapter.m59373i(searchItemData, baseViewHolder.getBindingAdapterPosition());
        C12572a.m23695d("search_event_result_click", searchItemData, 0L, 4, null);
        return Unit.INSTANCE;
    }
}
