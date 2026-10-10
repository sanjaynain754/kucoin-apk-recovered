package com.kubi.search.searchresult;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import c20.C4810a;
import com.blankj.utilcode.util.C5303w0;
import com.kubi.event.api.C12572a;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.round.widget.RoundImageView;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24277v;
import com.kubi.search.R$color;
import com.kubi.search.R$drawable;
import com.kubi.search.R$id;
import com.kubi.search.R$layout;
import com.kubi.search.R$string;
import com.kubi.search.entity.ContractTradeItemBean;
import com.kubi.search.entity.ExtendEntity;
import com.kubi.search.entity.ISearchResultData;
import com.kubi.search.entity.SearchEntity;
import com.kubi.search.entity.SearchItemData;
import com.kubi.search.entity.SearchItemDepositInfo;
import com.kubi.search.entity.SearchItemHeader;
import com.kubi.search.entity.SearchItemMore;
import com.kubi.search.utils.SearchExKt;
import com.kubi.search.utils.SearchFavHelper;
import com.kubi.search.utils.SearchTabTitle;
import com.kubi.search.utils.SearchTrack;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33954u6;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44129c;
import rs.C44172b;
import s10.InterfaceC44269c;

/* JADX INFO: compiled from: SearchResultAdapter.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\nJ\u001c\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u001aH\u0002J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u001aH\u0002J\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u001aH\u0002J\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u001fH\u0002J\u0014\u0010 \u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0016\u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0002J\u001e\u0010%\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u001a2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u001aH\u0002J\u0010\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/search/searchresult/SearchResultAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/search/entity/ISearchResultData;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "currentSearchKey", "", "currentTab", "isVisibleToUser", "", "defaultHArray", "", "refreshViewDatas", "", "dataList", "", "key", "tab", "visibleToUser", "convert", "helper", "item", "renderHeader", "Lcom/kubi/search/entity/SearchItemHeader;", "renderTradePair", "Lcom/kubi/search/entity/SearchItemData;", "renderEarn", "renderWeb3", "renderAlpha", "renderViewMore", "Lcom/kubi/search/entity/SearchItemMore;", "renderDepositInfo", "Lcom/kubi/search/entity/SearchItemDepositInfo;", "handlejumClick", "adapterPosition", "", "formatFutureName", "", "resourceHits", "trackAllTabFirstClick", "onViewAttachedToWindow", C33954u6.f72238i, "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSearchResultAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultAdapter.kt\ncom/kubi/search/searchresult/SearchResultAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n1#2:595\n25#3,3:596\n808#4,11:599\n774#4:610\n865#4,2:611\n808#4,11:613\n774#4:624\n865#4,2:625\n808#4,11:627\n774#4:638\n865#4,2:639\n808#4,11:641\n774#4:652\n865#4,2:653\n808#4,11:655\n774#4:666\n865#4,2:667\n*S KotlinDebug\n*F\n+ 1 SearchResultAdapter.kt\ncom/kubi/search/searchresult/SearchResultAdapter\n*L\n137#1:596,3\n485#1:599,11\n486#1:610\n486#1:611,2\n577#1:613,11\n579#1:624\n579#1:625,2\n182#1:627,11\n184#1:638\n184#1:639,2\n292#1:641,11\n294#1:652\n294#1:653,2\n380#1:655,11\n382#1:666\n382#1:667,2\n*E\n"})
public final class SearchResultAdapter extends BaseMultiItemQuickAdapter<ISearchResultData, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public String f48989i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public String f48990j;

    /* JADX INFO: renamed from: k */
    public boolean f48991k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final List<String> f48992l;

    /* JADX INFO: renamed from: L */
    public static final Unit m59313L(SearchItemData searchItemData, BaseViewHolder baseViewHolder, SearchResultAdapter searchResultAdapter, String str) throws JSONException {
        int i11;
        int iIndexOf;
        C12572a.m23695d("search_event_result_chain_fav_change", searchItemData, 0L, 4, null);
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition() + 1;
        if (Intrinsics.areEqual(searchResultAdapter.f48990j, TtmlNode.COMBINE_ALL)) {
            Collection data = searchResultAdapter.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : data) {
                if (obj instanceof SearchItemData) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (Intrinsics.areEqual(((SearchItemData) obj2).getCategory(), searchItemData.getCategory())) {
                    arrayList2.add(obj2);
                }
            }
            int iIndexOf2 = arrayList2.indexOf(searchItemData) + 1;
            iIndexOf = arrayList.indexOf(searchItemData) + 1;
            i11 = iIndexOf2;
        } else {
            i11 = bindingAdapterPosition;
            iIndexOf = i11;
        }
        SearchTrack.f49158a.m59611g(searchItemData, i11, iIndexOf, searchResultAdapter.f48990j, searchResultAdapter.f48989i, IQuoteFacadeService.f41383a.get().mo50682G(str) ? "unfavorite" : "favorite", true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m59325w(SearchItemData searchItemData, BaseViewHolder baseViewHolder, SearchResultAdapter searchResultAdapter) throws JSONException {
        int i11;
        int iIndexOf;
        C12572a.m23695d("search_event_result_alpha_fav_change", searchItemData, 0L, 4, null);
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition() + 1;
        if (Intrinsics.areEqual(searchResultAdapter.f48990j, TtmlNode.COMBINE_ALL)) {
            Collection data = searchResultAdapter.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : data) {
                if (obj instanceof SearchItemData) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (Intrinsics.areEqual(((SearchItemData) obj2).getCategory(), searchItemData.getCategory())) {
                    arrayList2.add(obj2);
                }
            }
            int iIndexOf2 = arrayList2.indexOf(searchItemData) + 1;
            iIndexOf = arrayList.indexOf(searchItemData) + 1;
            i11 = iIndexOf2;
        } else {
            i11 = bindingAdapterPosition;
            iIndexOf = i11;
        }
        SearchTrack.f49158a.m59611g(searchItemData, i11, iIndexOf, searchResultAdapter.f48990j, searchResultAdapter.f48989i, SearchFavHelper.f49141a.m59575w(searchItemData) ? "unfavorite" : "favorite", true);
        return Unit.INSTANCE;
    }

    public SearchResultAdapter() {
        super(new ArrayList());
        addItemType(1, R$layout.search_item_result_header);
        addItemType(2, R$layout.search_item_result_data);
        addItemType(3, R$layout.search_item_result_data_earn);
        addItemType(4, R$layout.search_item_result_more);
        addItemType(5, R$layout.search_item_result_divider);
        addItemType(6, R$layout.search_item_result_header_web3);
        addItemType(7, R$layout.search_item_result_data_web3);
        addItemType(8, R$layout.search_item_result_data_deposit);
        addItemType(9, R$layout.search_item_result_data_alpha);
        this.f48989i = "";
        this.f48990j = "";
        this.f48992l = new ArrayList();
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m59309F(SearchItemData searchItemData, boolean z11, BaseViewHolder baseViewHolder, SearchResultAdapter searchResultAdapter) throws JSONException {
        int i11;
        int iIndexOf;
        C44129c.m97272b("platform::search", "搜索-All Tab-修改收藏状态", "当前币种" + searchItemData.getSymbol() + ",当前状态:" + z11, null, 8, null);
        C12572a.m23695d("search_event_result_fav_change", searchItemData, 0L, 4, null);
        int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition() + 1;
        if (Intrinsics.areEqual(searchResultAdapter.f48990j, TtmlNode.COMBINE_ALL)) {
            Collection data = searchResultAdapter.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : data) {
                if (obj instanceof SearchItemData) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (Intrinsics.areEqual(((SearchItemData) obj2).getCategory(), searchItemData.getCategory())) {
                    arrayList2.add(obj2);
                }
            }
            int iIndexOf2 = arrayList2.indexOf(searchItemData) + 1;
            iIndexOf = arrayList.indexOf(searchItemData) + 1;
            i11 = iIndexOf2;
        } else {
            i11 = bindingAdapterPosition;
            iIndexOf = i11;
        }
        SearchTrack.f49158a.m59611g(searchItemData, i11, iIndexOf, searchResultAdapter.f48990j, searchResultAdapter.f48989i, z11 ? "unfavorite" : "favorite", true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final void m59327B(final BaseViewHolder baseViewHolder, final SearchItemData searchItemData) {
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
            resourceHits = this.f48992l;
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
        C27046k.m66710y(itemView, 1000L, new Function0() { // from class: com.kubi.search.searchresult.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultAdapter.m59308C(this.f49081b, searchItemData, baseViewHolder);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public final void m59328D(BaseViewHolder baseViewHolder, SearchItemHeader searchItemHeader) {
        baseViewHolder.setText(R$id.tvTitle, searchItemHeader.getTitle());
    }

    /* JADX INFO: renamed from: E */
    public final void m59329E(final BaseViewHolder baseViewHolder, final SearchItemData searchItemData) {
        String strM93915p;
        CoinAvatarView coinAvatarView = (CoinAvatarView) baseViewHolder.getView(R$id.coin_icon);
        if (coinAvatarView != null) {
            C24277v.m58542g(coinAvatarView, C27041f.m66668h(searchItemData.getIconUrl()));
        }
        SearchEntity beanRemoteEntity = searchItemData.getBeanRemoteEntity();
        List<String> resourceHits = beanRemoteEntity != null ? beanRemoteEntity.getResourceHits() : null;
        if (resourceHits == null) {
            resourceHits = CollectionsKt.emptyList();
        }
        if (resourceHits.isEmpty()) {
            resourceHits = this.f48992l;
        }
        if (searchItemData.getIsFuture()) {
            baseViewHolder.setText(R$id.tvCurrencyBase, m59334r(searchItemData, resourceHits));
            baseViewHolder.setGone(R$id.tvCurrencyQuote, false);
        } else {
            baseViewHolder.setText(R$id.tvCurrencyBase, SearchExKt.m59508B(searchItemData.getBaseCurrencyName(), resourceHits));
            int i11 = R$id.tvCurrencyQuote;
            baseViewHolder.setGone(i11, true);
            baseViewHolder.setText(i11, SearchExKt.m59508B('/' + searchItemData.getQuoteCurrencyName(), resourceHits));
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC44269c.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC44269c) objM56186h).m97688a(baseViewHolder);
        } else {
            int i12 = R$id.tv_lever;
            baseViewHolder.setGone(i12, searchItemData.getIsShowMarginLeverLabel());
            baseViewHolder.setText(i12, searchItemData.getMarginMaxLeverString());
        }
        baseViewHolder.setGone(R$id.tv_ready, searchItemData.getIsPreviewEnableShow());
        String coinLabel = searchItemData.getCoinLabel();
        if (coinLabel.length() > 10) {
            StringBuilder sb2 = new StringBuilder();
            String strSubstring = coinLabel.substring(0, 7);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            sb2.append("...");
            coinLabel = sb2.toString();
        }
        int i13 = R$id.tvCoinLabel;
        baseViewHolder.setText(i13, coinLabel);
        baseViewHolder.setGone(i13, coinLabel.length() > 0);
        int i14 = R$id.tv_price;
        View view = baseViewHolder.getView(i14);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, null, false, 3, null);
        baseViewHolder.setText(i14, searchItemData.getPrice());
        int i15 = R$id.tv_change_rate;
        baseViewHolder.setGone(i15, !searchItemData.getIsPreviewEnableShow());
        String formatChangeRate = searchItemData.getFormatChangeRate();
        if (!Intrinsics.areEqual(formatChangeRate, "--") && (strM93915p = C42828b.m93915p(C42828b.m93911l(formatChangeRate))) != null) {
            formatChangeRate = strM93915p;
        }
        baseViewHolder.setText(i15, formatChangeRate);
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        baseViewHolder.setTextColor(i15, C22890g.m54278c(mContext, searchItemData.getChangeRate(), R$color.c_text40));
        final boolean zM59576x = SearchFavHelper.f49141a.m59576x(searchItemData);
        int i16 = R$id.iv_favorite;
        ImageView imageView = (ImageView) baseViewHolder.getView(i16);
        if (imageView != null) {
            if (zM59576x) {
                imageView.setImageResource(R$drawable.ic2_favorite_select_16);
                imageView.setImageTintList(null);
            } else {
                imageView.setImageResource(R$drawable.ic2_favorite_unselect_16);
                imageView.setImageTintList(ContextCompat.getColorStateList(this.mContext, R$color.c_icon40));
            }
        }
        View view2 = baseViewHolder.getView(i16);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66710y(view2, 1000L, new Function0() { // from class: com.kubi.search.searchresult.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultAdapter.m59309F(searchItemData, zM59576x, baseViewHolder, this);
            }
        });
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66710y(itemView, 1000L, new Function0() { // from class: com.kubi.search.searchresult.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultAdapter.m59310G(this.f49059b, searchItemData, baseViewHolder);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public final void m59330H(BaseViewHolder baseViewHolder, final SearchItemMore searchItemMore) {
        baseViewHolder.setText(R$id.tvMore, SearchTabTitle.f49156a.m59603j(Integer.valueOf(searchItemMore.getTotalCount())));
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66710y(itemView, 1000L, new Function0() { // from class: com.kubi.search.searchresult.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultAdapter.m59311I(searchItemMore);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final void m59331J(final BaseViewHolder baseViewHolder, final SearchItemData searchItemData) {
        String strM92642g;
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
            resourceHits = this.f48992l;
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
        String strM93915p = C42828b.m93915p((bigDecimalM66671k == null || (strM92642g = C42180b.m92642g(bigDecimalM66671k, null, null, 0, true, false, false, 23, null)) == null) ? null : C42828b.m93911l(strM92642g));
        if (strM93915p == null) {
            strM93915p = "--";
        }
        textView2.setText(strM93915p);
        Context context3 = textView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        textView2.setTextColor(C22890g.m54278c(context3, C27039d.m66647g(bigDecimalM66671k), R$color.c_text40));
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66710y(itemView, 1000L, new Function0() { // from class: com.kubi.search.searchresult.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultAdapter.m59312K(this.f49070b, searchItemData, baseViewHolder);
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
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.search.searchresult.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultAdapter.m59313L(searchItemData, baseViewHolder, this, string);
            }
        }, 1, null);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull BaseViewHolder holder) throws JSONException {
        int iIndexOf;
        int iIndexOf2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        ISearchResultData iSearchResultData = (ISearchResultData) getItem(holder.getBindingAdapterPosition());
        if (iSearchResultData != null && (iSearchResultData instanceof SearchItemData)) {
            int bindingAdapterPosition = holder.getBindingAdapterPosition();
            SearchItemData searchItemData = (SearchItemData) iSearchResultData;
            String symbol = searchItemData.getSymbol();
            if (this.f48991k) {
                SearchTrackUploader searchTrackUploader = SearchTrackUploader.f49039a;
                if (searchTrackUploader.m59482m().contains(symbol)) {
                    return;
                }
                SearchEntity beanRemoteEntity = searchItemData.getBeanRemoteEntity();
                if (beanRemoteEntity != null) {
                    searchTrackUploader.m59481j(beanRemoteEntity);
                }
                int i11 = bindingAdapterPosition + 1;
                if (Intrinsics.areEqual(this.f48990j, TtmlNode.COMBINE_ALL)) {
                    Collection data = getData();
                    Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : data) {
                        if (obj instanceof SearchItemData) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (Intrinsics.areEqual(((SearchItemData) obj2).getCategory(), searchItemData.getCategory())) {
                            arrayList2.add(obj2);
                        }
                    }
                    iIndexOf = arrayList2.indexOf(iSearchResultData) + 1;
                    iIndexOf2 = arrayList.indexOf(iSearchResultData) + 1;
                } else {
                    iIndexOf = i11;
                    iIndexOf2 = iIndexOf;
                }
                SearchTrack.f49158a.m59611g(searchItemData, iIndexOf, iIndexOf2, this.f48990j, this.f48989i, "", false);
                SearchTrackUploader.f49039a.m59482m().add(symbol);
            }
        }
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable ISearchResultData iSearchResultData) {
        if (baseViewHolder == null || iSearchResultData == null) {
            return;
        }
        if (iSearchResultData instanceof SearchItemHeader) {
            m59328D(baseViewHolder, (SearchItemHeader) iSearchResultData);
        }
        if (iSearchResultData instanceof SearchItemData) {
            SearchItemData searchItemData = (SearchItemData) iSearchResultData;
            if (searchItemData.getIsSpot() || searchItemData.getIsFuture()) {
                m59329E(baseViewHolder, searchItemData);
            } else if (searchItemData.getIsEarn()) {
                m59327B(baseViewHolder, searchItemData);
            } else if (searchItemData.getIsWeb3()) {
                m59331J(baseViewHolder, searchItemData);
            } else if (searchItemData.getIsAlpha()) {
                m59337u(baseViewHolder, searchItemData);
            }
        }
        if (iSearchResultData instanceof SearchItemMore) {
            m59330H(baseViewHolder, (SearchItemMore) iSearchResultData);
        }
        if (iSearchResultData instanceof SearchItemDepositInfo) {
            m59338x(baseViewHolder, (SearchItemDepositInfo) iSearchResultData);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m59336t(@NotNull List<? extends ISearchResultData> dataList, @NotNull String key, @NotNull String tab, boolean z11) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(tab, "tab");
        this.f48989i = key;
        this.f48990j = tab;
        this.f48991k = z11;
        this.f48992l.clear();
        this.f48992l.add(this.f48989i);
        setNewData(dataList);
    }

    /* JADX INFO: renamed from: x */
    public final void m59338x(BaseViewHolder baseViewHolder, final SearchItemDepositInfo searchItemDepositInfo) {
        baseViewHolder.setText(R$id.tvDeposit, this.mContext.getString(R$string.search_deposit_coin, searchItemDepositInfo.getCoinName()));
        baseViewHolder.setText(R$id.tvBuy, this.mContext.getString(R$string.search_buy_coin, searchItemDepositInfo.getCoinName()));
        int i11 = R$id.layoutDeposit;
        String depositUrl = searchItemDepositInfo.getDepositUrl();
        baseViewHolder.setGone(i11, !(depositUrl == null || depositUrl.length() == 0));
        int i12 = R$id.layoutBuy;
        String otcUrl = searchItemDepositInfo.getOtcUrl();
        baseViewHolder.setGone(i12, !(otcUrl == null || otcUrl.length() == 0));
        View view = baseViewHolder.getView(i11);
        if (view != null) {
            C27046k.m66710y(view, 1000L, new Function0() { // from class: com.kubi.search.searchresult.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchResultAdapter.m59326y(searchItemDepositInfo);
                }
            });
        }
        View view2 = baseViewHolder.getView(i12);
        if (view2 != null) {
            C27046k.m66710y(view2, 1000L, new Function0() { // from class: com.kubi.search.searchresult.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SearchResultAdapter.m59307A(searchItemDepositInfo);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m59307A(SearchItemDepositInfo searchItemDepositInfo) throws JSONException {
        RouteExKt.m56217H(searchItemDepositInfo.getOtcUrl());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("after_click_element_value", "buy " + searchItemDepositInfo.getCoinName());
        jSONObject.put("after_page_id", "B7P2PtradingAddress");
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a("B1SearchOrSearchResultPage", "searchResult", "all_buyCurrencyC2C", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m59308C(SearchResultAdapter searchResultAdapter, SearchItemData searchItemData, BaseViewHolder baseViewHolder) throws JSONException {
        searchResultAdapter.m59335s(searchItemData, baseViewHolder.getBindingAdapterPosition());
        C12572a.m23695d("search_event_result_click", searchItemData, 0L, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m59310G(SearchResultAdapter searchResultAdapter, SearchItemData searchItemData, BaseViewHolder baseViewHolder) throws JSONException {
        searchResultAdapter.m59335s(searchItemData, baseViewHolder.getBindingAdapterPosition());
        C12572a.m23695d("search_event_result_click", searchItemData, 0L, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m59311I(SearchItemMore searchItemMore) {
        C44129c.m97272b("platform::search", "搜索-All Tab-点击跳转更多", searchItemMore.getCategory(), null, 8, null);
        C12572a.m23695d("search_event_view_more_tab", searchItemMore.getCategory(), 0L, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m59312K(SearchResultAdapter searchResultAdapter, SearchItemData searchItemData, BaseViewHolder baseViewHolder) throws JSONException {
        searchResultAdapter.m59335s(searchItemData, baseViewHolder.getBindingAdapterPosition());
        C12572a.m23695d("search_event_result_click", searchItemData, 0L, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m59324v(SearchResultAdapter searchResultAdapter, SearchItemData searchItemData, BaseViewHolder baseViewHolder) throws JSONException {
        searchResultAdapter.m59335s(searchItemData, baseViewHolder.getBindingAdapterPosition());
        C12572a.m23695d("search_event_result_click", searchItemData, 0L, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m59326y(SearchItemDepositInfo searchItemDepositInfo) throws JSONException {
        RouteExKt.m56217H(searchItemDepositInfo.getDepositUrl());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("after_click_element_value", "Deposit " + searchItemDepositInfo.getCoinName());
        jSONObject.put("after_page_id", "B7FastTrade");
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a("B1SearchOrSearchResultPage", "searchResult", "all_depositCurrency", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: M */
    public final void m59332M(SearchItemData searchItemData) throws JSONException {
        String category = searchItemData.getCategory();
        String strShowName = null;
        switch (category.hashCode()) {
            case -503567600:
                if (category.equals(SearchCategory$Companion.FUTURES)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("after_click_element_value", searchItemData.getSymbol());
                    jSONObject.put("after_page_id", "B6FuturesCandle");
                    jSONObject.put("norm_version", "1");
                    Unit unit = Unit.INSTANCE;
                    C27023a.m66554a("B1SearchOrSearchResultPage", "searchResult", "all_futures_1st", jSONObject);
                    break;
                }
                break;
            case 3105752:
                if (category.equals(SearchCategory$Companion.EARN)) {
                    JSONObject jSONObject2 = new JSONObject();
                    ExtendEntity beanEarn = searchItemData.getBeanEarn();
                    if (beanEarn != null) {
                        strShowName = beanEarn.showName();
                    }
                    jSONObject2.put("after_click_element_value", C27041f.m66668h(strShowName));
                    jSONObject2.put("after_page_id", "B9earn");
                    jSONObject2.put("norm_version", "1");
                    Unit unit2 = Unit.INSTANCE;
                    C27023a.m66554a("B1SearchOrSearchResultPage", "searchResult", "all_earn_1st", jSONObject2);
                    break;
                }
                break;
            case 3537154:
                if (category.equals(SearchCategory$Companion.SPOT)) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("after_click_element_value", searchItemData.getSymbol());
                    jSONObject3.put("after_page_id", "B5candle");
                    jSONObject3.put("norm_version", "1");
                    Unit unit3 = Unit.INSTANCE;
                    C27023a.m66554a("B1SearchOrSearchResultPage", "searchResult", "all_spot_1st", jSONObject3);
                    break;
                }
                break;
            case 3645279:
                if (category.equals(SearchCategory$Companion.WEB3)) {
                    JSONObject jSONObject4 = new JSONObject();
                    ExtendEntity beanWeb3 = searchItemData.getBeanWeb3();
                    if (beanWeb3 != null) {
                        strShowName = beanWeb3.getName();
                    }
                    jSONObject4.put("after_click_element_value", C27041f.m66668h(strShowName));
                    jSONObject4.put("after_page_id", "web3BuyAndSell");
                    jSONObject4.put("norm_version", "1");
                    Unit unit4 = Unit.INSTANCE;
                    C27023a.m66554a("B1SearchOrSearchResultPage", "searchResult", "all_web3_1st", jSONObject4);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: r */
    public final CharSequence m59334r(SearchItemData searchItemData, List<String> list) {
        ContractTradeItemBean beanContract = searchItemData.getBeanContract();
        if (beanContract != null && beanContract.isForeverContract()) {
            C27096v0 c27096v0M59508B = SearchExKt.m59508B(searchItemData.getShowSymbol(), list);
            C27096v0 c27096v0 = new C27096v0();
            if (C5303w0.m6511a()) {
                c27096v0.m66903c(StringsKt.trim((CharSequence) C27017c.f54310a.m66516f(R$string.perpetual_contract, "")).toString(), new C4810a()).append(C33627eb.f69716f).append(c27096v0M59508B);
                return c27096v0;
            }
            c27096v0.append(c27096v0M59508B).append(C33627eb.f69716f).m66903c(StringsKt.trim((CharSequence) C27017c.f54310a.m66516f(R$string.perpetual_contract, "")).toString(), new C4810a());
            return c27096v0;
        }
        String string = IKuMexService.f28731a.get().mo33255D(searchItemData.getSymbol(), false).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return SearchExKt.m59508B(string, list);
    }

    /* JADX INFO: renamed from: s */
    public final void m59335s(SearchItemData searchItemData, int i11) throws JSONException {
        String tokenBridgeId;
        String jumpUrl;
        int i12;
        int i13;
        String name = null;
        if (searchItemData.getIsEarn()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("产品名");
            ExtendEntity beanEarn = searchItemData.getBeanEarn();
            if (beanEarn != null) {
                name = beanEarn.getProductCategoryStr();
            }
            sb2.append(name);
            C44129c.m97272b("platform::search", "搜索-理财Tab-跳转", sb2.toString(), null, 8, null);
            ExtendEntity beanEarn2 = searchItemData.getBeanEarn();
            if (beanEarn2 != null) {
                SearchExKt.m59540v(beanEarn2);
            }
        } else if (searchItemData.getIsWeb3()) {
            ExtendEntity beanWeb3 = searchItemData.getBeanWeb3();
            if (beanWeb3 != null) {
                jumpUrl = beanWeb3.getJumpUrl();
            } else {
                jumpUrl = null;
            }
            SearchExKt.m59529k(jumpUrl);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("产品名");
            ExtendEntity beanWeb4 = searchItemData.getBeanWeb3();
            if (beanWeb4 != null) {
                name = beanWeb4.getName();
            }
            sb3.append(name);
            C44129c.m97272b("platform::search", "搜索-Web3Tab-跳转", sb3.toString(), null, 8, null);
        } else if (searchItemData.getIsAlpha()) {
            ExtendEntity beanWeb5 = searchItemData.getBeanWeb3();
            if (beanWeb5 != null && (tokenBridgeId = beanWeb5.getTokenBridgeId()) != null) {
                SearchExKt.m59542x(tokenBridgeId);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("产品名");
            ExtendEntity beanWeb6 = searchItemData.getBeanWeb3();
            if (beanWeb6 != null) {
                name = beanWeb6.getName();
            }
            sb4.append(name);
            C44129c.m97272b("platform::search", "搜索-Alpha-Tab-跳转", sb4.toString(), null, 8, null);
        } else if (searchItemData.getIsSpot()) {
            C44129c.m97272b("platform::search", "搜索-现货 Tab3-现货跳转K线", "当前交易对为" + searchItemData.getSymbol(), null, 8, null);
            if (searchItemData.getIsPreviewEnableShow()) {
                ISpotService.m59982A(ISpotService.f49646a.get(), searchItemData.getSymbol(), 2, C43852m.m96601m("B1SearchOrSearchResultPage", "searchResult", "1"), null, 8, null);
            } else {
                ISpotService.m59982A(ISpotService.f49646a.get(), searchItemData.getSymbol(), null, C43852m.m96601m("B1SearchOrSearchResultPage", "searchResult", "1"), null, 10, null);
            }
        } else if (searchItemData.getIsFuture()) {
            C44129c.m97272b("platform::search", "搜索-合约 Tab3-合约跳转K线", "当前交易对为" + searchItemData.getSymbol(), null, 8, null);
            SearchExKt.m59539u(searchItemData.getSymbol(), C43852m.m96601m("B1SearchOrSearchResultPage", "searchResult", "2"));
        }
        SearchEntity beanRemoteEntity = searchItemData.getBeanRemoteEntity();
        if (beanRemoteEntity != null) {
            SearchTrackUploader.f49039a.m59480g(beanRemoteEntity);
        }
        SearchTrack.f49158a.m59606b(this.f48989i);
        int i14 = i11 + 1;
        if (Intrinsics.areEqual(this.f48990j, TtmlNode.COMBINE_ALL)) {
            Collection data = getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : data) {
                if (obj instanceof SearchItemData) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (Intrinsics.areEqual(((SearchItemData) obj2).getCategory(), searchItemData.getCategory())) {
                    arrayList2.add(obj2);
                }
            }
            int iIndexOf = arrayList2.indexOf(searchItemData) + 1;
            int iIndexOf2 = arrayList.indexOf(searchItemData) + 1;
            if (iIndexOf == 1) {
                m59332M(searchItemData);
            }
            i12 = iIndexOf;
            i13 = iIndexOf2;
        } else {
            i12 = i14;
            i13 = i12;
        }
        SearchTrack.f49158a.m59611g(searchItemData, i12, i13, this.f48990j, this.f48989i, C33556b3.f68963J, true);
    }

    /* JADX INFO: renamed from: u */
    public final void m59337u(final BaseViewHolder baseViewHolder, final SearchItemData searchItemData) {
        List<String> listEmptyList;
        String strM93911l;
        String strM92642g;
        ExtendEntity beanWeb3 = searchItemData.getBeanWeb3();
        if (beanWeb3 == null) {
            return;
        }
        RoundImageView roundImageView = (RoundImageView) baseViewHolder.getView(R$id.ivCoinLogo);
        String str = "";
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
        if (beanRemoteEntity != null) {
            listEmptyList = beanRemoteEntity.getResourceHits();
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (listEmptyList.isEmpty()) {
            listEmptyList = this.f48992l;
        }
        int i11 = R$id.tvCoinName;
        String name = beanWeb3.getName();
        if (name != null) {
            str = name;
        }
        baseViewHolder.setText(i11, SearchExKt.m59508B(str, listEmptyList));
        TextView textView = (TextView) baseViewHolder.getView(R$id.tvPrice);
        Intrinsics.checkNotNull(textView);
        C44172b.m97383c(textView, null, false, 3, null);
        textView.setText(IQuoteFacadeService.f41383a.get().mo50693T(C27041f.m66671k(beanWeb3.getPrice())));
        BigDecimal bigDecimalM66671k = C27041f.m66671k(beanWeb3.getPriceChangePercent24H());
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.tvRate);
        if (bigDecimalM66671k != null && (strM92642g = C42180b.m92642g(bigDecimalM66671k, null, null, 0, true, false, false, 23, null)) != null) {
            strM93911l = C42828b.m93911l(strM92642g);
        } else {
            strM93911l = null;
        }
        String strM93915p = C42828b.m93915p(strM93911l);
        if (strM93915p == null) {
            strM93915p = "--";
        }
        textView2.setText(strM93915p);
        Context context3 = textView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        textView2.setTextColor(C22890g.m54278c(context3, C27039d.m66647g(bigDecimalM66671k), R$color.c_text40));
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66710y(itemView, 1000L, new Function0() { // from class: com.kubi.search.searchresult.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultAdapter.m59324v(this.f49062b, searchItemData, baseViewHolder);
            }
        });
        String token = beanWeb3.getToken();
        if (token != null && token.length() != 0) {
            baseViewHolder.setText(R$id.tvCoinToken, SearchExKt.m59509C(beanWeb3.getToken(), listEmptyList));
        }
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.ivArrow);
        ExtendEntity beanWeb4 = searchItemData.getBeanWeb3();
        if (beanWeb4 != null) {
            beanWeb4.getToken();
        }
        ExtendEntity beanWeb5 = searchItemData.getBeanWeb3();
        if (beanWeb5 != null) {
            beanWeb5.getAveChainName();
        }
        if (SearchFavHelper.f49141a.m59575w(searchItemData)) {
            imageView.setImageResource(R$drawable.ic2_favorite_select_16);
            imageView.setImageTintList(null);
        } else {
            imageView.setImageResource(R$drawable.ic2_favorite_unselect_16);
            imageView.setImageTintList(ContextCompat.getColorStateList(this.mContext, R$color.c_icon40));
        }
        Intrinsics.checkNotNull(imageView);
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.search.searchresult.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchResultAdapter.m59325w(searchItemData, baseViewHolder, this);
            }
        }, 1, null);
    }
}
