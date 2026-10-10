package com.kubi.search.searchresult;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.kubi.event.api.C12572a;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.round.widget.RoundImageView;
import com.kubi.sdk.util.C24277v;
import com.kubi.search.R$color;
import com.kubi.search.R$drawable;
import com.kubi.search.R$id;
import com.kubi.search.R$layout;
import com.kubi.search.entity.ExtendEntity;
import com.kubi.search.entity.ISearchResultData;
import com.kubi.search.entity.SearchEntity;
import com.kubi.search.entity.SearchItemData;
import com.kubi.search.utils.SearchExKt;
import com.kubi.search.utils.SearchTrack;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33954u6;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44129c;
import rs.C44172b;

/* JADX INFO: compiled from: SearchResultWeb3Adapter.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u001c\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0013H\u0002J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/search/searchresult/SearchResultWeb3Adapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/search/entity/ISearchResultData;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "currentSearchKey", "", "defaultHArray", "", "refreshViewDatas", "", "dataList", "", "key", "convert", "helper", "item", "renderWeb3", "Lcom/kubi/search/entity/SearchItemData;", "trackWeb3", "currentToken", "handlejumClick", "adapterPosition", "", "onViewAttachedToWindow", C33954u6.f72238i, "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchResultWeb3Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultWeb3Adapter.kt\ncom/kubi/search/searchresult/SearchResultWeb3Adapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n1#2:193\n*E\n"})
public final class SearchResultWeb3Adapter extends BaseMultiItemQuickAdapter<ISearchResultData, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public String f49033i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final List<String> f49034j;

    /* JADX INFO: renamed from: n */
    public static final Unit m59456n(SearchItemData searchItemData, SearchResultWeb3Adapter searchResultWeb3Adapter, BaseViewHolder baseViewHolder, String str) throws JSONException {
        C12572a.m23695d("search_event_result_chain_fav_change", searchItemData, 0L, 4, null);
        searchResultWeb3Adapter.m59459o(baseViewHolder, searchItemData, str);
        return Unit.INSTANCE;
    }

    public SearchResultWeb3Adapter() {
        super(new ArrayList());
        addItemType(6, R$layout.search_item_result_header_web3);
        addItemType(7, R$layout.search_item_result_data_web3);
        this.f49033i = "";
        this.f49034j = new ArrayList();
    }

    /* JADX INFO: renamed from: l */
    private final void m59454l(final BaseViewHolder baseViewHolder, final SearchItemData searchItemData) {
        ExtendEntity beanWeb3 = searchItemData.getBeanWeb3();
        if (beanWeb3 == null) {
            return;
        }
        RoundImageView roundImageView = (RoundImageView) baseViewHolder.getView(R$id.ivCoinLogo);
        if (roundImageView != null) {
            Context context = roundImageView.getContext();
            String icon = beanWeb3.getIcon();
            if (icon == null) {
                icon = "";
            }
            C24277v.m58540e(context, icon, roundImageView);
        }
        RoundImageView roundImageView2 = (RoundImageView) baseViewHolder.getView(R$id.ivChainLogo);
        if (roundImageView2 != null) {
            Context context2 = roundImageView2.getContext();
            String chainIcon = beanWeb3.getChainIcon();
            if (chainIcon == null) {
                chainIcon = "";
            }
            C24277v.m58540e(context2, chainIcon, roundImageView2);
        }
        SearchEntity beanRemoteEntity = searchItemData.getBeanRemoteEntity();
        List<String> resourceHits = beanRemoteEntity != null ? beanRemoteEntity.getResourceHits() : null;
        if (resourceHits == null) {
            resourceHits = CollectionsKt.emptyList();
        }
        if (resourceHits.isEmpty()) {
            resourceHits = this.f49034j;
        }
        int i11 = R$id.tvCoinName;
        String name = beanWeb3.getName();
        if (name == null) {
            name = "";
        }
        baseViewHolder.setText(i11, SearchExKt.m59508B(name, resourceHits));
        baseViewHolder.setText(R$id.tvChainName, beanWeb3.getChainName());
        baseViewHolder.setText(R$id.tvCoinFullName, beanWeb3.getFullName());
        TextView textView = (TextView) baseViewHolder.getView(R$id.tvPrice);
        Intrinsics.checkNotNull(textView);
        C44172b.m97383c(textView, null, false, 3, null);
        IQuoteFacadeService.Companion companion = IQuoteFacadeService.f41383a;
        textView.setText(companion.get().mo50693T(C27041f.m66671k(beanWeb3.getPrice())));
        BigDecimal bigDecimalM66671k = C27041f.m66671k(beanWeb3.getPriceChangePercent24H());
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tvRate);
        textView2.setText(C42828b.m93915p(C42828b.m93911l(bigDecimalM66671k != null ? C42180b.m92642g(bigDecimalM66671k, null, null, 0, true, false, false, 23, null) : null)));
        Context context3 = textView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        textView2.setTextColor(C22890g.m54279d(context3, C27039d.m66647g(bigDecimalM66671k), 0, 2, null));
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66710y(itemView, 1000L, new Function0() { // from class: com.kubi.search.searchresult.o0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultWeb3Adapter.m59455m(this.f49100b, searchItemData, baseViewHolder);
            }
        });
        String token = beanWeb3.getToken();
        if (token == null || token.length() == 0) {
            baseViewHolder.setText(R$id.tvCoinToken, "");
        } else {
            baseViewHolder.setText(R$id.tvCoinToken, SearchExKt.m59509C(beanWeb3.getToken(), resourceHits));
        }
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.ivArrow);
        ExtendEntity beanWeb4 = searchItemData.getBeanWeb3();
        if (!(beanWeb4 != null ? Intrinsics.areEqual(beanWeb4.getSupportFavorite(), Boolean.TRUE) : false) || !companion.get().mo50696X()) {
            imageView.setOnClickListener(null);
            imageView.setImageResource(R$drawable.ic2_arrow_right_20);
            imageView.setImageTintList(ContextCompat.getColorStateList(this.mContext, R$color.c_icon40));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        ExtendEntity beanWeb5 = searchItemData.getBeanWeb3();
        sb2.append(beanWeb5 != null ? beanWeb5.getToken() : null);
        sb2.append('-');
        ExtendEntity beanWeb6 = searchItemData.getBeanWeb3();
        sb2.append(beanWeb6 != null ? beanWeb6.getAveChainName() : null);
        final String string = sb2.toString();
        if (companion.get().mo50682G(string)) {
            imageView.setImageResource(R$drawable.ic2_favorite_select_16);
            imageView.setImageTintList(null);
        } else {
            imageView.setImageResource(R$drawable.ic2_favorite_unselect_16);
            imageView.setImageTintList(ContextCompat.getColorStateList(this.mContext, R$color.c_icon40));
        }
        Intrinsics.checkNotNull(imageView);
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.search.searchresult.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultWeb3Adapter.m59456n(searchItemData, this, baseViewHolder, string);
            }
        }, 1, null);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable ISearchResultData iSearchResultData) {
        if (baseViewHolder == null || iSearchResultData == null || !(iSearchResultData instanceof SearchItemData)) {
            return;
        }
        m59454l(baseViewHolder, (SearchItemData) iSearchResultData);
    }

    /* JADX INFO: renamed from: k */
    public final void m59458k(@NotNull List<? extends ISearchResultData> dataList, @NotNull String key) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f49033i = key;
        this.f49034j.clear();
        this.f49034j.add(this.f49033i);
        setNewData(dataList);
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
            SearchTrack.f49158a.m59611g(searchItemData, i11, i11, SearchCategory$Companion.WEB3, this.f49033i, "", false);
            searchTrackUploader.m59482m().add(symbol);
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m59453j(SearchItemData searchItemData, int i11) throws JSONException {
        String jumpUrl;
        ExtendEntity beanWeb3 = searchItemData.getBeanWeb3();
        String name = null;
        if (beanWeb3 != null) {
            jumpUrl = beanWeb3.getJumpUrl();
        } else {
            jumpUrl = null;
        }
        SearchExKt.m59529k(jumpUrl);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("产品名");
        ExtendEntity beanWeb4 = searchItemData.getBeanWeb3();
        if (beanWeb4 != null) {
            name = beanWeb4.getName();
        }
        sb2.append(name);
        C44129c.m97272b("platform::search", "搜索-Web3Tab-跳转", sb2.toString(), null, 8, null);
        SearchEntity beanRemoteEntity = searchItemData.getBeanRemoteEntity();
        if (beanRemoteEntity != null) {
            SearchTrackUploader.f49039a.m59480g(beanRemoteEntity);
        }
        SearchTrack searchTrack = SearchTrack.f49158a;
        searchTrack.m59606b(this.f49033i);
        int i12 = i11 + 1;
        searchTrack.m59611g(searchItemData, i12, i12, SearchCategory$Companion.WEB3, this.f49033i, C33556b3.f68963J, false);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m59455m(SearchResultWeb3Adapter searchResultWeb3Adapter, SearchItemData searchItemData, BaseViewHolder baseViewHolder) throws JSONException {
        searchResultWeb3Adapter.m59453j(searchItemData, baseViewHolder.getBindingAdapterPosition());
        C12572a.m23695d("search_event_result_click", searchItemData, 0L, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public final void m59459o(BaseViewHolder baseViewHolder, SearchItemData searchItemData, String str) throws JSONException {
        String str2;
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
        SearchTrack searchTrack = SearchTrack.f49158a;
        String str3 = this.f49033i;
        if (IQuoteFacadeService.f41383a.get().mo50682G(str)) {
            str2 = "unfavorite";
        } else {
            str2 = "favorite";
        }
        searchTrack.m59611g(searchItemData, bindingAdapterPosition, bindingAdapterPosition, SearchCategory$Companion.WEB3, str3, str2, true);
    }
}
